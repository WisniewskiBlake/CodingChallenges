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
        LinkedList<String> timeList = new LinkedList<>();
        LinkedList<String> combinedList = new LinkedList<>();
        
        for (int i = 0; i < infoArray.length; i++) {                        
            if(i == 0){
                String[] formatArray = infoArray[i].split("\\.");
                imageList.add(formatArray[1]);
            }
            else if(i == 1){
                locationList.add(infoArray[i]);
                combinedList.add(infoArray[i] + " ");                
            }
            else if(i == 2){
                timeList.add(infoArray[i]);
            }
            if(i != 0 && (i % 3) == 0){
                String[] formatArray = infoArray[i].split("\\.");
                imageList.add(formatArray[1]);
            }
            else if(i != 1 && (i % 3) == 1){
                locationList.add(infoArray[i]);
            }
            else if(i != 2 && (i % 3) == 2){
                timeList.add(infoArray[i]);
            }
        }

        LinkedList<String> sortedTimeList = sortList(timeList);
                
        for (int i = 0; i < sortedTimeList.size(); i++) {
            System.out.println(sortedTimeList.get(i));
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