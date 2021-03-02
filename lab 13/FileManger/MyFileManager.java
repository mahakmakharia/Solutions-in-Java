import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            FileReader reader = new FileReader("number.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String oneLine;
            MyValidator validator = new MyValidator();
            oneLine = bufferedReader.readLine();
            while (oneLine != null) {

                try {
                    validator.validateNumber(Float.parseFloat(oneLine));
                    System.out.println(oneLine);

                } catch (NegativeNumberException e) {
                    System.out.println(e.getMessage());
                }

                oneLine = bufferedReader.readLine();
            }
            bufferedReader.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Please give a valid file name");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
