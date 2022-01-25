import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;

public class TextReader {
    private String path; 

    private static Logger logger = Logger.getLogger(LoggingApp.class.getName());
    
    public enum STARTEND {START,END}; //—ñ‹“Œ^


    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {

        OjbectList<Integer> valueList = new OjbectList<Integer>(); //‘ÌŒ^

        try (FileReader fr = new FileReader(path); 
            BufferedReader br = new BufferedReader(fr);) {//ƒŠƒ\[ƒX•t‚«try•¶

            String line;
            while ((line = br.readLine()) != null) {  
                valueList.add(new Integer(line));   
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int size = valueList.size(); 
        for (int i : valueList.list){//Šg’£ for (for-each) •¶
            System.out.println(i);
        }
    }

    public static void main(String... args) { //‰Â•Ï’·ˆø”
        logger.info(STARTEND.START.name());
        new TextReader(args[0]).execute();
        logger.info(STARTEND.END.name());
    }

}