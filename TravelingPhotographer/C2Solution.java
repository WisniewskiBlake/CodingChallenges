package TravelingPhotographer;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * C2Solution
 */
public class C2Solution {
    public static void main(String[] args) {

        String info = "photo.jpg, Warsaw, 2013-09-05 14:08:15\njohn.png, London, 2015-06-20 15:13:22\nmyFriends.png, Warsaw, 2013-09-05 14:07:13\nEiffel.jpg, Paris, 2015-07-23 08:03:02\npisatower.jpg, Paris, 2015-07-22 23:59:59\nBOB.jpg, London, 2015-08-05 00:02:03\nnotredame.png, Paris, 2015-09-01 12:00:00\nme.jpg, Warsaw, 2013-09-06 15:40:22\na.png, Warsaw, 2016-02-13 13:33:50\nb.jpg, Warsaw, 2016-01-02 15:12:22\nc.jpg, Warsaw, 2016-01-02 14:34:30\nd.jpg, Warsaw, 2016-01-02 15:15:01\ne.png, Warsaw, 2016-01-02 09:49:09\nf.png, Warsaw, 2016-01-02 10:55:32\ng.jpg, Warsaw, 2016-02-29 22:13:11";

        //preparing input to be divided into separate lists for searching/sorting
        String newInfo = info.replaceAll("\n", ",");
        String[] infoArray = newInfo.split(",");        

        LinkedList<String> imageList = new LinkedList<>();
        LinkedList<String> locationList = new LinkedList<>();
        LinkedList<String> sortedLocList = new LinkedList<>();
        LinkedList<String> timeList = new LinkedList<>();
        LinkedList<String> sortedTimeList = new LinkedList<>();
        LinkedList<String> singleTimeList = new LinkedList<>();        
        LinkedList<String> combinedList = new LinkedList<>();        

        //preparing input for searching and sorting by dividing into separate lists
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

        //determining if a location is repeated 10 or more times    
        HashMap<Integer, String> repeatedMap = new HashMap<Integer, String>();                
        for (int i = 0; i < locationList.size() - 1; i++){
            int over10Repeats = 0; 
            // Move the index ahead while there are duplicates                         
            while (i < locationList.size() - 1 && sortedLocList.get(i).equals(sortedLocList.get(i+1))) { 
                i++;
                over10Repeats++;
                if(over10Repeats >= 9){
                    repeatedMap.put(i, sortedLocList.get(i).trim());
                }                    
            }                     
        } 
       
        //preparing final output by adding file type to location
        for (int i = 0; i < imageList.size(); i++) {
            combinedList.add(locationList.get(i) + " " + imageList.get(i));                        
        }

        //inserts correct order into final output by comparing sorted list index to original list index
        for(int i = 0; i < timeList.size(); i++){
            int o = 0;
            String[] stringInTL = timeList.get(i).split(" ");
            for(int p = 0; p < sortedTimeList.size(); p++){
                while(p <= sortedTimeList.size() - 1 && sortedTimeList.get(p).contains(stringInTL[1])){
                    if(sortedTimeList.get(p).contains(stringInTL[3] + " " + stringInTL[4])){
                        String newEntry = combinedList.get(i).trim();
                        String[] repeatedCheck = newEntry.split(" ");
                        if(repeatedMap.containsValue(repeatedCheck[0]) && (o+1) < 10){
                            String finalEntry = newEntry.replaceAll("\\s", "0" + Integer.toString(o+1) + ".");
                            combinedList.set(i, finalEntry);
                        }else{
                            String finalEntry = newEntry.replaceAll("\\s", Integer.toString(o+1) + ".");
                            combinedList.set(i, finalEntry);
                        }                                                
                    }
                    o++;
                    p++;
                }
            }
        }

        //printing final list
        for (int i = 0; i < imageList.size(); i++) {            
            System.out.println(combinedList.get(i));                    
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