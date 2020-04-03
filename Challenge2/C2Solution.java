package CodingChallenges.Challenge2;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * C2Solution
 */
public class C2Solution {
    public static void main(String[] args) {

        String info = "photo.jpg, Warsaw, 2013-09-05 14:08:15\njohn.png, London, 2015-06-20 15:13:22\nmyFriends.png, Warsaw, 2013-09-05 14:07:13\nEiffel.jpg, Paris, 2015-07-23 08:03:02\npisatower.jpg, Paris, 2015-07-22 23:59:59\nBOB.jpg, London, 2015-08-05 00:02:03\nnotredame.png, Paris, 2015-09-01 12:00:00\nme.jpg, Warsaw, 2013-09-06 15:40:22\na.png, Warsaw, 2016-02-13 13:33:50\nb.jpg, Warsaw, 2016-01-02 15:12:22\nc.jpg, Warsaw, 2016-01-02 14:34:30\nd.jpg, Warsaw, 2016-01-02 15:15:01\ne.png, Warsaw, 2016-01-02 09:49:09\nf.png, Warsaw, 2016-01-02 10:55:32\ng.jpg, Warsaw, 2016-02-29 22:13:11";

        String newInfo = info.replaceAll("\n", ",");
        String[] infoArray = newInfo.split(",");

        String[] infoRows = info.split("\n");
        // String[] locationArray = new String[infoArray.length / 3];        
        // String[] timeArray = new String[infoArray.length / 3];
        int j = 0;
        // int k = 0;
        // int l = 0;

        LinkedList<String> imageList = new LinkedList<>();
        LinkedList<String> locationList = new LinkedList<>();
        LinkedList<String> sortedLocList = new LinkedList<>();
        LinkedList<String> timeList = new LinkedList<>();
        LinkedList<String> sortedTimeList = new LinkedList<>();
        LinkedList<String> singleTimeList = new LinkedList<>();
        LinkedList<Integer> locationIndices = new LinkedList<>();
        LinkedList<String> combinedList = new LinkedList<>();

        

        
        for (int i = 0; i < infoArray.length; i++) {                        
            if(i == 0){
                String[] formatArray = infoArray[i].split("\\.");
                imageList.add(formatArray[1]);
            }
            else if(i == 1){
                locationList.add(infoArray[i]);
                sortedLocList.add(infoArray[i]);                                
            }
            else if(i == 2){
                timeList.add(infoArray[i-1] + " " + infoArray[i]);
                sortedTimeList.add(infoArray[i-1] + " " + infoArray[i]);
                String[] singleTime = infoArray[i].split(" ");
                singleTimeList.add(singleTime[1] + " " + singleTime[2]);
            }
            if(i != 0 && (i % 3) == 0){
                String[] formatArray = infoArray[i].split("\\.");
                imageList.add(formatArray[1]);
            }
            else if(i != 1 && (i % 3) == 1){
                locationList.add(infoArray[i]);
                sortedLocList.add(infoArray[i]);
            }
            else if(i != 2 && (i % 3) == 2){
                timeList.add(infoArray[i-1] + " " + infoArray[i]);
                sortedTimeList.add(infoArray[i-1] + " " + infoArray[i]);
                String[] singleTime = infoArray[i].split(" ");
                singleTimeList.add(singleTime[1] + " " + singleTime[2]);
            }
        }

        
        //sort list of times and locations
        sortList(sortedTimeList);
        sortList(sortedLocList);

        
        LinkedList<String> repeatedLocList = new LinkedList<>();
        locationIndices.add(0);
        for (int i = 0; i < locationList.size() - 1; i++){
            int over10Repeats = 0; 
            // Move the index ahead while 
            // there are duplicates
             
                while (i < locationList.size() - 1 && sortedLocList.get(i).equals(sortedLocList.get(i+1))) 
                { 
                    i++;
                    over10Repeats++;
                    if(over10Repeats >= 10){
                        repeatedLocList.add(sortedLocList.get(i));
                    }                    
                }
                locationIndices.add(i + 1);            
                                      
        } 
       
        LinkedList<Integer> order = new LinkedList<>();
        // int n = 0;
        // for (int i = 0; i < locationIndices.size() - 1; i++) {
            
        //     for (int m = locationIndices.get(i); m < locationIndices.get(i + 1); m++) {
        //         String[] stringInSortedTL = sortedTimeList.get(m).split(" ");
        //         String[] stringInSingleTL = sortedTimeList.get(m).split(" ");
        //         order[n++] = singleTimeList.indexOf(stringInSortedTL[3] + " " + stringInSortedTL[4]);
        //     }
                                  
        // }

        for (int i = 0; i < imageList.size(); i++) {
            combinedList.add(locationList.get(i) + " " + imageList.get(i));                        
        }

        for(int i = 0; i < timeList.size(); i++){
            int o = 0;
            String[] stringInTL = timeList.get(i).split(" ");
            for(int p = 0; p < sortedTimeList.size(); p++){
                while(p != sortedTimeList.size() - 1 && sortedTimeList.get(p).contains(stringInTL[1])){
                    if(sortedTimeList.get(p).contains(stringInTL[3] + " " + stringInTL[4])){
                        combinedList.get(i).replaceAll("\\s", Integer.toString(o+1));
                        
                    }
                    o++;
                    p++;

                }
            }

        }




                
        

        for (int i = 0; i < imageList.size(); i++) {            
            System.out.println(combinedList.get(i));
            
            //System.out.println(timeList.get(i));           
        }
        for (int i = 0; i < locationIndices.size(); i++) {            
            //System.out.println(combinedList.get(i)); 
            //System.out.println(locationIndices.get(i));           
        }










    }

    static public LinkedList<String> sortList(LinkedList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance().compare(o1, o2);
            }
        });

        return list;
    }











}