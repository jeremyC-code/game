public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 200;
    public int manaPoints = 200;


    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */


    Character(){

    }
   Character(String name, int newLevel, int newHp, int newMp){
              characterName = name;
              level = newLevel;
              healthPoints = newHp;
              manaPoints = newMp;
    }
    Character(String name) {
       characterName = name;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void showChar(){
        System.out.println("Character Initialized : " + characterName);
    }
    /**
     * Create a method to Damage Target Character
     */
    public void stats(Character yourCharacter){
        yourCharacter.healthPoints = healthPoints;
        System.out.println("*******************************");
        System.out.println(yourCharacter.characterName + " remaining healthpoints is : " + yourCharacter.healthPoints);
        System.out.println(yourCharacter.characterName + " remaining manapoints is : " + yourCharacter.manaPoints);
        System.out.println("*******************************");
    }
    public void levelUp(Character lvlChar){
        lvlChar.level += 10;
        System.out.println("You gained level!!!"+ lvlChar.characterName + " is now level " + lvlChar.level);
    }
    public void damageTarget(Character enemyCharacter,int damagePoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println(enemyCharacter.characterName + " has " + enemyCharacter.healthPoints + " HP Left");


        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if(enemyCharacter.healthPoints <= 0){
            System.out.println(enemyCharacter.characterName + " had been defeated");
        }
    }
    public void healtarget(Character sameCharacter, int healPoints){
        sameCharacter.healthPoints += healPoints;
        System.out.println(sameCharacter.characterName + " is healed and currently have HP left " + sameCharacter.healthPoints);
    }
}
