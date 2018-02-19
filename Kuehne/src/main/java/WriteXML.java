import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteXML {

    public static void CreateXML(HashMap<Athlete, Integer> athleteList) {


        try {
            DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder build = dFact.newDocumentBuilder();
            Document doc = build.newDocument();


            Element root = doc.createElement("AthleteList");
            doc.appendChild(root);


            for (Map.Entry<Athlete,Integer> entry : athleteList.entrySet()) {


                Element Athlete = doc.createElement("Athlete");
                root.appendChild(Athlete);


                Element order  = doc.createElement("order");
                order.appendChild(doc.createTextNode(Integer.toString(entry.getKey().getOrder())));
                Athlete.appendChild(order);


                Element name  = doc.createElement("name");
                name.appendChild(doc.createTextNode(entry.getKey().getName()));
                Athlete.appendChild(name);






                Element points = doc.createElement("points");
                Athlete.appendChild(points);



                Element totalPoint  = doc.createElement("totalPoint");
                totalPoint.appendChild(doc.createTextNode(Integer.toString(entry.getKey().getTotalPoint())));
                points.appendChild(totalPoint);



                Element pointRunning100m  = doc.createElement("pointRunning100m");
                pointRunning100m.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointRunning100m())));
                points.appendChild(pointRunning100m);


                Element   pointLongJump  = doc.createElement("pointLongJump");
                pointLongJump.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointLongJump())));
                points.appendChild(pointLongJump);


                Element   pointShortPut  = doc.createElement("pointShortPut");
                pointShortPut.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointShortPut())));
                points.appendChild(pointShortPut);


                Element   pointHighJump  = doc.createElement("pointHighJump");
                pointHighJump.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointHighJump())));
                points.appendChild(pointHighJump);


                Element   pointRunning400m  = doc.createElement("pointRunning400m");
                pointRunning400m.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointRunning400m())));
                points.appendChild(pointRunning400m);


                Element   pointHurdles  = doc.createElement("pointHurdles");
                pointHurdles.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointHurdles())));
                points.appendChild(pointHurdles);


                Element   pointDiscusThrow  = doc.createElement("pointDiscusThrow");
                pointDiscusThrow.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointDiscusThrow())));
                points.appendChild(pointDiscusThrow);


                Element   pointPoleVault  = doc.createElement("pointPoleVault");
                pointPoleVault.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointPoleVault())));
                points.appendChild(pointPoleVault);



                Element   pointRunning1500m  = doc.createElement("pointRunning1500m");
                pointRunning1500m.appendChild(doc.createTextNode(Double.toString(entry.getKey().getPointRunning1500m())));
                points.appendChild(pointRunning1500m);






                Element results = doc.createElement("results");
                Athlete.appendChild(results);


                Element resultRunning100m  = doc.createElement("resultRunning100m");
                resultRunning100m.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultRunning100m())));
                results.appendChild(resultRunning100m);


                Element   resultLongJump  = doc.createElement("resultLongJump");
                resultLongJump.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultLongJump())));
                results.appendChild(resultLongJump);


                Element   resultShortPut  = doc.createElement("resultShortPut");
                resultShortPut.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultShortPut())));
                results.appendChild(resultShortPut);


                Element   resultHighJump  = doc.createElement("resultHighJump");
                resultHighJump.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultHighJump())));
                results.appendChild(resultHighJump);


                Element   resultRunning400m  = doc.createElement("resultRunning400m");
                resultRunning400m.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultRunning400m())));
                results.appendChild(resultRunning400m);


                Element  resultHurdles  = doc.createElement("resultHurdles");
                resultHurdles.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultHurdles())));
                results.appendChild(resultHurdles);


                Element   resultDiscusThrow  = doc.createElement("resultDiscusThrow");
                resultDiscusThrow.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultDiscusThrow())));
                results.appendChild(resultDiscusThrow);


                Element resultPoleVault  = doc.createElement("resultPoleVault");
                resultPoleVault.appendChild(doc.createTextNode(Double.toString(entry.getKey().getResultPoleVault())));
                results.appendChild(resultPoleVault);



                Element   resultRunning1500m  = doc.createElement("resultRunning1500m");
                resultRunning1500m.appendChild(doc.createTextNode(entry.getKey().getResultRunning1500m()));
                results.appendChild(resultRunning1500m);



            }


            // Save the document to the disk file
            TransformerFactory tranFactory = TransformerFactory.newInstance();
            Transformer aTransformer = tranFactory.newTransformer();

            // format the XML nicely
            aTransformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");

            aTransformer.setOutputProperty(
                    "{http://xml.apache.org/xslt}indent-amount", "4");
            aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");



            DOMSource source = new DOMSource(doc);
            try {
                FileWriter fos = new FileWriter("file.xml");
                StreamResult result = new StreamResult(fos);
                aTransformer.transform(source, result);

            } catch (IOException e) {

                e.printStackTrace();
            }



        } catch (TransformerException ex) {
            System.out.println("Error outputting document");

        } catch (ParserConfigurationException ex) {
            System.out.println("Error building document");
        }



    }
}

