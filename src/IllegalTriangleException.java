public class IllegalTriangleException extends Exception {


    public IllegalTriangleException() {
        this("Invalid input");
    };

    public IllegalTriangleException(String s) {
        System.out.print(s);
    };
}
