public class ShapeManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            Triangle tr1 = new Triangle(4, 5);
            Triangle tr2 = new Triangle("blue", 10, 6);
            System.out.println(tr2.show());
            System.out.println(tr1.compareTo(tr2));

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }
}
