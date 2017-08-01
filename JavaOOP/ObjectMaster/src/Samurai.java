public class Samurai extends Human {
    private static int count = 0;

    public Samurai(){
        health = 200;
        count ++;
    }

    public void deathBlow(Human human){
        human.health = 0;
        this.health = this.health / 2;
    }

    public void meditate(){
        this.health += this.health / 2;
    }

    public void howMany(){
        System.out.println("there are " + count + " Samurais");
    }
}
