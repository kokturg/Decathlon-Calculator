import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
public class CSVReader {


   public static HashMap<Athlete, Integer> pointList = new HashMap<>();


    public static void read(String csvFile) {




            String line = "";
            String cvsSplitBy = "\\;";

          try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

              while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] values = line.split(cvsSplitBy);
                Athlete athlete = new Athlete();

                    athlete.setName(values[0]);
                    athlete.setRunning100m(values[1]);
                    athlete.setLongJump(values[2]);
                    athlete.setShortPut(values[3]);
                    athlete.setHighJump(values[4]);
                    athlete.setRunning400m(values[5]);
                    athlete.setHurdles(values[6]);
                    athlete.setDiscusThrow(values[7]);
                    athlete.setPoleVault(values[8]);
                    athlete.setJavelinThrow(values[9]);
                    athlete.setRunning1500m(values[10]);


                    // Adding athletes and their totalPoint to HashMap
                    pointList.put(athlete, athlete.getTotalPoint());
              }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}