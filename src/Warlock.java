public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void Whirlpool(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Whirlpool (Damage - 75)");
        int damagePoints = 75;
        super.manaPoints -= 20;
        damageTarget(enemyCharacter, damagePoints);

    }
    public void Tidalwave(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Tidalwave (Damage - 90)");
        int damagePoints = 90;
        super.manaPoints -= 35;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void Seaguardian(Character sameCharacter){
        System.out.println(super.characterName +" uses Seaguardian (Hp + 50)");
        int healPoints = 50;
        super.manaPoints -= 35;
        healtarget(sameCharacter, healPoints);
    }
}
