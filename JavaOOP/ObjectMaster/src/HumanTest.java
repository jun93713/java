public class HumanTest {
    public static void main(String[] args) {
        Human jun = new Human();
        Human kevinke = new Human();

        jun.attack(kevinke);
        System.out.println(kevinke.health);
    }
}
