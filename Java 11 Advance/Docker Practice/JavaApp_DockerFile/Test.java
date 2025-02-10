import java.util.Properties;

class Test {

    public static void printSystemProperties() {
        System.out.println("printing system properties using");
        Properties props = System.getProperties();
        System.out.println(props);
    }

    public static void main(String[] args) {
        System.out.println("Java Program Started..");
        printSystemProperties();
    }

}