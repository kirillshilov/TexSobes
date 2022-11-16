public class Main {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        catch (RuntimeException e){
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}