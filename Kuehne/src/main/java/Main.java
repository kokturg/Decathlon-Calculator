public class Main {


    public static void main(String[] args) {


        // csv file to read
        String csvFile = "/Users/aysugurevin/Downloads/Kuehne/target/classes/results.csv";

        CSVReader.read(csvFile);

        // calculation of the points and sorting the athletes
        Sort.sortMapByValues(CSVReader.pointList);

        // writing
        WriteXML.CreateXML(CSVReader.pointList);




    }


}






