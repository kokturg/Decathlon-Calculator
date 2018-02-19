import java.util.LinkedHashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {


        // csv file to read
        String csvFile = "/Users/aysugurevin/Downloads/Kuehne/target/classes/results.csv";

        CSVReader.read(csvFile);

        Sort.sortMapByValues(CSVReader.pointList);


        Map<Athlete,Integer> sortedMap = new LinkedHashMap<Athlete, Integer>();
        
        WriteXML.CreateXML(CSVReader.pointList);




    }


}






