import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file = new java.io.File("sides.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to file
        for (int i = 0; i< 3; i++) {
            output.print((int)(Math.random() * 10 + 0.5) + " ");
        }

        output.close();

        // Create file instance to read
        Scanner input = new Scanner(file);
        int[] arrayOfInts = new int[3];

        for (int i = 0; i < 3; i++) {
            arrayOfInts[i] = input.nextInt();
        }

        try {
            Triangle triangle = new Triangle(arrayOfInts[0], arrayOfInts[1], arrayOfInts[2]);
        } catch (IllegalTriangleException ex){
            System.out.println(ex + "The triangle cannot be created");
        }

        // Close the file
        input.close();

    }
}