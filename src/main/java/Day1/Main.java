package Day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Create  scanner class for reading input file
        File file = new File("C:\\Users\\jlopc\\OneDrive - UPV\\UPV\\Code\\Java\\AdventOfCode\\src\\main\\java\\Day1\\input.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        }
        catch (FileNotFoundException e) {
            System.err.println(file.getAbsolutePath());
        }

        int sum = 0;

        //For each line, get the integer and print it to stdout
        if (sc != null) {
            while (sc.hasNext()) {
                //We use a stack for getting first and last int
                Stack<Integer> stack = new Stack<Integer>();
                //Get line
                String line = sc.nextLine();
                for (int i=0; line.length()>i; i++) {
                    char c = line.charAt(i);
                    boolean flag = Character.isDigit(c);
                    if (flag) {
                        int d = Character.getNumericValue(c);
                        stack.push(d);
                    }
                }
                int i1 = stack.firstElement();
                int i2 = stack.peek();
                int a = Integer.parseInt(Integer.toString(i1) + Integer.toString(i2));
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}