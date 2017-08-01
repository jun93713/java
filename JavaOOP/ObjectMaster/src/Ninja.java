public class Ninja extends Human {
    public Ninja(){
        stealth = 10;
    }

    public void steal(Human human){
        human.health -= stealth;
        this.health += stealth;
    }

    public void runAway(){
        this.health -= 10;
    }
}
