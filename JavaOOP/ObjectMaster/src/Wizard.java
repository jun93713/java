public class Wizard extends Human {
    public Wizard(){
        intelligence = 8;
        health = 50;
    }

    public void heal(Human human){
        human.health += intelligence;
    }

    public void fireball(Human human){
        human.health -= intelligence * 3;
    }
}
