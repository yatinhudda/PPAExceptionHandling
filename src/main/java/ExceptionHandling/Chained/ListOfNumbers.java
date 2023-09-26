package ExceptionHandling.Chained;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;
    public void listOfNumbers(){
        list = new ArrayList<Integer>(SIZE);
        for(int i = 0; i < SIZE; i++){
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("outFile.txt"));
        for(int i = 0; i < SIZE; i++){
            out.println("Value at : " + i + " = " + list.get(i));
        }
        out.close();
    }
}
