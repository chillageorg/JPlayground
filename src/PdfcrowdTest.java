import jplayground.Client;
import com.pdfcrowd.PdfcrowdError;
import java.io.*;


public class PdfcrowdTest{
    public static void main(String[] args) {
        try 
        {
            FileOutputStream fileStream;     
 
            // create an API client instance
            Client client = new Client("chillageorg", "cf55d666923a8f546269fe2670e06c43");

            // convert a web page and save the PDF to a file
            fileStream = new FileOutputStream("example.pdf");
            client.convertURI("http://www.cnn.com/", fileStream);
            fileStream.close();

            // convert an HTML string and store the PDF into a byte array
            ByteArrayOutputStream memStream  = new ByteArrayOutputStream();
            String html = "<html><body>In-memory HTML.</body></html>";
            client.convertHtml(html, memStream);

            // convert an HTML file
           // fileStream = new FileOutputStream("file.pdf");
           // client.convertFile("/path/to/local/file.html", fileStream);
           // fileStream.close();

            // retrieve the number of tokens in your account
            Integer ntokens = client.numTokens();
        }
        catch(PdfcrowdError why) {
            System.err.println(why.getMessage());
        }
        catch(IOException exc) {
            // handle the exception
        }
    }
}