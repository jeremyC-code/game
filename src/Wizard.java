public class Wizard extends Character{
    Wizard(String name){
        super(name);


    }
    public void FireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        super.manaPoints -= 25;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void Blackhole(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Blackhole (Damage - 100)");
        int damagePoints = 100;
        super.manaPoints -= 50;
        damageTarget(enemyCharacter, damagePoints);
    }
}
