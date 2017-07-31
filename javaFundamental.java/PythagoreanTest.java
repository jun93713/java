public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean triangle = new Pythagorean();
        double legC = triangle.calculateHypotenuse(3, 4);
        System.out.println(legC);
    }
}