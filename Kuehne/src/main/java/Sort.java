
import java.util.*;
import java.util.Map.Entry;
public class Sort {



    public static void sortMapByValues(Map<Athlete, Integer> aMap) {

        Set<Entry<Athlete,Integer>> mapEntries = aMap.entrySet();

          System.out.println("Values and Keys before sorting ");
        for(Entry<Athlete,Integer> entry : mapEntries) {
            System.out.println(entry.getValue() + " - "+ entry.getKey().getName());
        }

        // used linked list to sort, because insertion of elements in linked list is faster than an array list.
        List<Entry<Athlete,Integer>> aList = new LinkedList<Entry<Athlete,Integer>>(mapEntries);



        // Sorting the List
        Collections.sort(aList, (Comparator<? super Entry<Athlete, Integer>>) new Comparator<Entry<Athlete,Integer>>() {

            @Override
            public int compare(Entry<Athlete, Integer> ele1,  Entry<Athlete, Integer> ele2) {

                return ele1.getValue().compareTo(ele2.getValue());

            }



        });

         // Reversing the order, by highest TotalPoint
         Collections.reverse(aList);

        // Storing the list into Linked HashMap to preserve the order of insertion.
         Map<Athlete,Integer> sortedMap = new LinkedHashMap<Athlete, Integer>();
        for(Entry<Athlete,Integer> entry: aList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }






        // printing values after soring of map
       System.out.println("After sorting Value " + " - " + "Key");





        double temporaryTotalPoint = 0;   // holds the totalPoint and checks previous Athlete s point,
                                          // if they are equal,
                                          // int i will not change and sets the same order number
        int i = 1;
        for(Entry<Athlete,Integer> entry : sortedMap.entrySet()) {

            entry.getKey().setOrder(i);  // sets the order of the Athlete



            if(entry.getKey().getTotalPoint() == temporaryTotalPoint)
            {
                i--;
                entry.getKey().setOrder(i);

            }

            i++;


            temporaryTotalPoint = entry.getKey().getTotalPoint();

          System.out.println(entry.getValue() + " - " + entry.getKey().getName());
        }

    }



}
