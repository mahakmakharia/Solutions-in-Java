import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FlightManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileReader reader;
        BufferedReader bfreader;

        ArrayList<Flight> list = new ArrayList<Flight>();
        try {
            reader = new FileReader("2015.silkair.csv");
            bfreader = new BufferedReader(reader);

            bfreader.readLine();
            bfreader.readLine();
            bfreader.readLine();
            String oneLine = bfreader.readLine();

            while (oneLine != null) {
                StringTokenizer st = new StringTokenizer(oneLine, "|");

                Flight ft1 = new Flight();

                ft1.depCity = st.nextToken();
                st.hasMoreTokens();

                ft1.daysOfWeek = st.nextToken();
                st.hasMoreTokens();

                ft1.flightNum = st.nextToken();
                st.hasMoreTokens();

                StringTokenizer lastToken = new StringTokenizer(st.nextToken(), "/");
                st.hasMoreTokens();

                ft1.depTime = lastToken.nextToken();
                lastToken.hasMoreTokens();

                ft1.arrTime = lastToken.nextToken();
                lastToken.hasMoreTokens();

                oneLine = bfreader.readLine();
                list.add(ft1);
            }

            bfreader.close();
            reader.close();

            sortFlight(list);
            writeTo(list);
        } catch (FileNotFoundException ex) {
            System.out.println("Please enter the correct file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void sortFlight(List<Flight> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <= list.size() - 2 - i; j++) {
                if (list.get(j).flightNum.compareTo(list.get(j + 1).flightNum) >= 0) {
                    Flight temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).toString());
    }

    public static void writeTo(List<Flight> list) {

        try {
            FileWriter writer = new FileWriter("written.txt");
            String st = "Effective 29 March 2015 to 24 October 2015|||\n" + "To Singapore from:|||\n"
                    + "Sector|Days|Flight|Dep/Arr (Local Time)\n";
            writer.write(st);
            for (int i = 0; i < list.size(); i++) {
                writer.append(list.get(i).toString() + "\n");

            }

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
