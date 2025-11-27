public class TestGameCharacter {
    public static void main(String args[]){
        GameCharacter C1 = new GameCharacter("Worrior" ,1 , 100);

        C1.takeDamage(30);
        C1.heal(10);

        System.out.println("Health : " + C1.getHealth() +  "Level : " + C1.getLevel());
        System.out.println(C1.getInfo());

        GameCharacter C2 = new GameCharacter("Mage " , 3 ,80 );
        System.out.println("Total Characters: " + GameCharacter.getTotalCharacters());

    }
}
