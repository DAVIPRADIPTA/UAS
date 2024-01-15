import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> g = new ArrayList<>();
        BufferedReader reader = new BufferedReader((new InputStreamReader((System.in))));
        System.out.print("Input jumlah data yang akan di proses : ");
        int u = Integer.parseInt(reader.readLine());
        int counter=0;
        for(int index = 0; index<u;index++) {
            counter++;
            System.out.print("Masukan Nama " + counter + " : ");
            String name = reader.readLine();
            System.out.print("Huruf Yang Akan Dihitung : ");
            char s = (char) reader.read();
            g = CountWords(name,s);
        }
        for(int o: g ) {
            System.out.print(g + " ");
        }
    }

    private static ArrayList<Integer> CountWords(String name, char s) {
        ArrayList<Integer> g = new ArrayList<>();
        return g;
    }
}
