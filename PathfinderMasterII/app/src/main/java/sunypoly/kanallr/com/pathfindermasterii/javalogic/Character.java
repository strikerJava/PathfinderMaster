

package sunypoly.kanallr.com.pathfindermasterii.javalogic;

import java.util.Arrays;

import java.io.*;
/**
 * Base Character class. All other classes are an extension
 * V 1.4
 */
public class Character {
    public int[] characterStats = {0, 0, 0, 0, 0, 0}; //has populate method
    public int[] characterMods = {0, 0, 0, 0, 0, 0};
    public int[] baseSpellsPerDay = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //
    public int[] bonusSpells = {0, 0, 0, 0, 0, 0}; //levl 1 - 6
    public int[] bardSpellsKnown = {0, 0, 0, 0, 0, 0, 0,0,0,0};//no bonus given
    public int[] totalSorcSpells = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // spot 0 will not be used. does not need
    public int[] totalSorcSpellsKnown = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public double[][] characterSkills = new double[2][35]; //PAthfinder has 35 skills. Some of these you will be proficent with.
    ///first row is for your skill ranks, second row will be for marking skills you are proficient in. 
    //no methods for this yet. Has to have classes fleshed out a bit
    public String firstName = "John";//has method
    public String lastName = "Doe";// has method
    public String alignment = "NN "; //has method, need to check to see if compatible with class
    public String race = "Human"; //has methods, not all though
    public String gender = "Male"; // has method
    public int level = 0;
    public int age = 18; //has method // needs way to randomize based on race
    public int sizeFeet = 5; // has method / needs way to randomize based on race
    public int sizeInches = 10;//has method / needs way to randomize based on race
    public int weight = 150;//has method / needs gender and race inputs
    public String hair = "Black";//has method
    public String eyes = "Blue";//has method
    public String sizeClass = "Medium";//should be built into race changes.
    public int[] AttackBonus = {-99, -99, -99, -99};
    public int fortSave = 0;
    public int refSave = 0;
    public int willSave = 0;
    public int hitPoints = 0;
    public int baseFortSave = 0;
    public int baseRefSave = 0;
    public int baseWillSave = 0;
    public int[] baseAttackBonus = {-99, -99, -99, -99};
    public String weaponProf;
    public String armorProf;
    public String[] SpecialSkills = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",};
    //special Skills contains 100 spots. set up for future multiclassing
    public int hitDie1D;
    public int ranksPerLevelBase;
    //String deity = "?"; 
    //this is an issue on its own. compatibility issues with certain races classes etc.
    //has been left out so i can come back to it. Certain classes have prefered dietys, same with race.
    //need to figure out how to do this.
    public int AC = 10;// needs to be updated on fly
    public int touchAC = 10;//needs to be updated on fly
    public int FlatFootAC = 10; // needs to be updated on fly
    public int Initiative = 0;// needs to be updated on fly
    public int travelSpeed = 30;
    boolean humanHasStatBoost; //Has the human been given their +2 to stats? 
    boolean[] humanWhichStatBoost = new boolean[6]; // Keeps track of the stat  humans have boosted


    public void populateStats() {
        int counter = 0;
        while (counter < 6) {
            RollClass diceRoll = new RollClass();
            characterStats[counter] = diceRoll.makeStat();
            counter++;
        }
        Arrays.sort(characterStats);// sort in accending order
    }

    public void basicPrintOut() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Character name: " + firstName + " " + lastName);
        System.out.println("Level: " + level);
        System.out.println("Str: " + characterStats[0]);
        System.out.println("Dex: " + characterStats[1]);
        System.out.println("Con: " + characterStats[2]);
        System.out.println("Int: " + characterStats[3]);
        System.out.println("Wis: " + characterStats[4]);
        System.out.println("Cha: " + characterStats[5]);
        System.out.printf("Attack Bonus:");
        for (int j = 0; j < 4; j++) {
            if (AttackBonus[j] == -99) {
                j = 4;
                System.out.println("");
            } else
                System.out.printf(" " + AttackBonus[j] + " ,");

        }
    }
    /*public void makeFullSpecialSkillLine(){
        fullSpecSkills = "";
        fullSpecSkills = SpecialSkills[0];
        int x = 1;
        while(x != 100){

            fullSpecSkills = fullSpecSkills.concat(SpecialSkills[x]);
            fullSpecSkills = fullSpecSkills.concat(", ");
                x++;
            }



    }*/
    public void makeMale() {
        gender = "Male";
    }

    public void makeFemale() {
        gender = "Female";
    }

    public void makeGenderOther() {
        gender = "Other";
    }

    public void randomGender() {
        RollClass diceRoll = new RollClass();
        //diceRoll.rollX(2);
        switch (diceRoll.rollX(2)) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            default:
                gender = "Something Broke, check gender roll class";
                break;
        }

    }

    public void firstNameChange(String input) {
        firstName = input;
    }

    public void lastNameChange(String input) {
        lastName = input;
    }

    public void fullNameChange(String input, String input2) {
        firstName = input;
        lastName = input2;
    }

    public void changeAlignment(String A) {
        alignment = A;
    }

    public void firstLevelHitDie(int x, int b) {
        hitPoints = x + b;
    }

    public void HitDieUpdate(int x, int b) {
        RollClass diceRoll = new RollClass();
        hitPoints = hitPoints + diceRoll.rollX(x) + b;

    }

    public void makeElf() {
        RollClass diceRoll2 = new RollClass();
        int holding2 = diceRoll2.roll2X(114, 32);
        RollClass diceRoll3 = new RollClass();
        int holding3 = diceRoll3.roll2X(110, 48);
        age = holding2;
        weight = holding3;
        RollClass diceRoll5 = new RollClass();
        int holding5 = diceRoll5.roll2X(5, 1);//ft roll (5-6)
        if(holding5 == 5)
        {
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(6, 5);//inches roll(6-11)
            changeHeightBoth(holding5, holding4);
        }
        else if(holding5 == 6){
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(0, 4);//inches roll(0-4)
            changeHeightBoth(holding5, holding4); //feet and inches
        }



        race = "Elf";
        characterStats[1] = characterStats[1] + 2;//+2 dex
        characterStats[3] = characterStats[3] + 2;//+2 int
        characterStats[2] = characterStats[2] - 2;//-2 con
        updateMods();

        System.out.println("Race changed to Elf");
    }

    public void revertElf() {
        race = "Human";
        characterStats[1] = characterStats[1] - 2;//-2 dex
        characterStats[3] = characterStats[3] - 2;//-2Intel
        characterStats[2] = characterStats[2] + 2;//+2 con
        updateMods();
        System.out.println("Race changed to Human");
    }

    public void makeDwarf() {
        race = "Dwarf";
        RollClass diceRoll2 = new RollClass();
        int holding2 = diceRoll2.roll2X(43, 26);
        age = holding2;
        RollClass diceRoll3 = new RollClass();
        int holding3 = diceRoll3.roll2X(150, 56);
        weight = holding3;
        RollClass diceRoll5 = new RollClass();
        int holding5 = diceRoll5.roll2X(3, 1);//ft roll (3-4)
        if(holding5 == 3)
        {
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(9, 2);//inches roll(9-11)
            changeHeightBoth(holding5, holding4);
        }
        else if(holding5 == 4){
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(0, 5);//inches roll(0-5)
            changeHeightBoth(holding5, holding4); //feet and inches
        }
        characterStats[2] = characterStats[2] + 2; // +2 con
        characterStats[4] = characterStats[4] + 2;// +2 wis
        characterStats[5] = characterStats[5] - 2;//-2 char
        updateMods();
        System.out.println("Race changed to Dwarf");
    }

    public void revertDwarf() {
        race = "Human";
        characterStats[2] = characterStats[2] - 2; // -2 con
        characterStats[4] = characterStats[4] - 2;// -2 wis
        characterStats[5] = characterStats[5] + 2;//+2 char
        updateMods();
        System.out.println("Race changed to Human");
    }

    public void makeGnome() {
        race = "Gnome";
        sizeClass = "Small";
        RollClass diceRoll2 = new RollClass();
        int holding2 = diceRoll2.roll2X(40, 36);
        age = holding2;
        RollClass diceRoll3 = new RollClass();
        int holding3 = diceRoll3.roll2X(30, 13);
        RollClass diceRoll4 = new RollClass();
        int holding4 = diceRoll4.roll2X(0, 8);
        changeHeightBoth(3,holding4);
        weight = holding3;
        characterStats[2] = characterStats[2] + 2; // +2 con
        characterStats[5] = characterStats[5] + 2;// +2 char
        characterStats[0] = characterStats[0] - 2;//-2str
        updateMods();
        System.out.println("Race changed to Gnome");

    }

    public void revertGnome() {
        race = "Human";
        sizeClass = "Medium";
        characterStats[2] = characterStats[2] - 2; // -2 con
        characterStats[5] = characterStats[5] - 2;// -2 char
        characterStats[0] = characterStats[0] + 2;//+2str
        updateMods();
        System.out.println("Race changed to Human");
    }

    public void makeHalfling() {
        race = "Halfling";
        sizeClass = "Small";
        RollClass diceRoll2 = new RollClass();
        int holding2 = diceRoll2.roll2X(22, 16);
        age = holding2;
        RollClass diceRoll3 = new RollClass();
        int holding3 = diceRoll3.roll2X(30, 8);
        weight = holding3;
        RollClass diceRoll5 = new RollClass();
        int holding5 = diceRoll5.roll2X(2, 1);//ft roll (2-3)
        if(holding5 == 2)
        {
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(8, 3);//inches roll(9-11)
            changeHeightBoth(holding5, holding4);
        }
        else if(holding5 == 3){
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(0, 4);//inches roll(0-4)
            changeHeightBoth(holding5, holding4); //feet and inches
        }
        characterStats[1] = characterStats[1] + 2; // +2 dex
        characterStats[5] = characterStats[5] + 2;// +2 char
        characterStats[0] = characterStats[0] - 2;//-2str
        updateMods();
        System.out.println("Race changed to Halfling");

    }

    public void revertHalfling() {
        race = "Human";
        sizeClass = "Medium";
        characterStats[1] = characterStats[1] - 2; // -2 dex
        characterStats[5] = characterStats[5] - 2;// -2 char
        characterStats[0] = characterStats[0] + 2;//+2str
        updateMods();
    }

    public void humanPlusStr() {
        race = "human";
        humanCosmetics();
        characterStats[0] = characterStats[0] + 2;
        humanHasStatBoost = true;
        humanWhichStatBoost[0] = true;
        updateMods();
    }

    public void humanPlusDex() {

        race = "human";
        humanCosmetics();
        characterStats[1] = characterStats[1] + 2;
        humanHasStatBoost = true;
        humanWhichStatBoost[1] = true;
        updateMods();
    }

    public void humanPlusCon() {
        race = "human";
        humanCosmetics();
        characterStats[2] = characterStats[2] + 2;
        humanHasStatBoost = true;
        humanWhichStatBoost[2] = true;
        updateMods();
    }

    public void humanPlusInt() {
        race = "human";
        humanCosmetics();
        characterStats[3] = characterStats[3] + 2;
        humanHasStatBoost = true;
        humanWhichStatBoost[3] = true;
        updateMods();
    }

    public void humanPlusWis() {
        race = "human";
        humanCosmetics();
        characterStats[4] = characterStats[4] + 2;
        humanHasStatBoost = true;
        humanWhichStatBoost[4] = true;
        updateMods();
    }

    public void humanPlusCha() {
        race = "human";
        humanCosmetics();
        characterStats[5] = characterStats[5] + 2;
        humanHasStatBoost = true;
        humanWhichStatBoost[5] = true;
        updateMods();
    }
    public void humanCosmetics(){
        RollClass diceRoll2 = new RollClass();
        int holding2 = diceRoll2.roll2X(15, 6);
        age = holding2;
        RollClass diceRoll3 = new RollClass();
        int holding3 = diceRoll3.roll2X(120, 100);
        weight = holding3;
        RollClass diceRoll5 = new RollClass();
        int holding5 = diceRoll5.roll2X(4, 1);//ft roll (4-5)
        if(holding5 == 4)
        {
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(10, 1);//inches roll(10-11)
            changeHeightBoth(holding5, holding4);
        }
        else if(holding5 == 5){
            RollClass diceRoll4 = new RollClass();
            int holding4 = diceRoll4.roll2X(0, 6);//inches roll(0-6)
            changeHeightBoth(holding5, holding4); //feet and inches
        }
    }
    public void revertHumanPlusStr() {
        race = "none";
        characterStats[0] = characterStats[0] - 2;
        humanHasStatBoost = false;
        humanWhichStatBoost[0] = false;
        updateMods();
    }

    public void revertHumanPlusDex() {
        race = "none";
        characterStats[1] = characterStats[1] - 2;
        humanHasStatBoost = false;
        humanWhichStatBoost[1] = false;
        updateMods();
    }

    public void revertHumanPlusCon() {
        race = "none";
        characterStats[2] = characterStats[2] - 2;
        humanHasStatBoost = false;
        humanWhichStatBoost[2] = false;
        updateMods();
    }

    public void revertHumanPlusInt() {
        race = "none";
        characterStats[3] = characterStats[3] - 2;
        humanHasStatBoost = false;
        humanWhichStatBoost[3] = false;
        updateMods();
    }

    public void revertHumanPlusWis() {
        race = "none";
        characterStats[4] = characterStats[4] - 2;
        humanHasStatBoost = false;
        humanWhichStatBoost[4] = false;
        updateMods();
    }

    public void revertHumanPlusCha() {

        race = "none";
        characterStats[5] = characterStats[5] - 2;
        humanHasStatBoost = false;
        humanWhichStatBoost[5] = false;
        updateMods();
    }

    public void changeAge(int x) {
        age = x;//age changed
    }

    public void changeHair(String x) {
        hair = x;
    }

    public void changeEye(String x) {
        eyes = x;
    }

    public void changeHeightFeet(int x) {
        sizeFeet = x;
    }

    public void changeHeightInches(int x) {
        sizeInches = x;
    }

    public void changeHeightBoth(int x, int x2) {
        changeHeightFeet(x);
        changeHeightInches(x2);
    }

    public void changeWeight(int x) {
        weight = x;
    }

    public void randomAlignment() {
        RollClass align = new RollClass();
        int a = align.rollX(9);
        switch (a) {// switch curtisy of java tutorials
            case 1:
                alignment = "LG";
                break;
            case 2:
                alignment = "NG";
                break;
            case 3:
                alignment = "CG";
                break;
            case 4:
                alignment = "LN";
                break;
            case 5:
                alignment = "NN";
                break;
            case 6:
                alignment = "CN";
                break;
            case 7:
                alignment = "LE";
                break;
            case 8:
                alignment = "NE";
                break;
            case 9:
                alignment = "CE";
                break;
            default:
                alignment = "Something broke. Check your Roll alignment roll algorithm";
                break;
        }
    }

    public void strConDexArrange() {
        int[] tempSort = {0, 0, 0, 0, 0, 0};
        tempSort[0] = characterStats[5];//top = str
        tempSort[2] = characterStats[4];//2nd = con
        tempSort[1] = characterStats[3];//3rd = dex
        tempSort[3] = characterStats[2];//4th = int?
        tempSort[4] = characterStats[1];//5th = wis
        tempSort[5] = characterStats[0];//6th = char
        System.arraycopy(tempSort, 0, characterStats, 0, 6);
        updateMods();// Netbeans recomended me this. Seems legit
    }

    public void dexConStrArrange() {
        int[] tempSort = {0, 0, 0, 0, 0, 0};
        tempSort[1] = characterStats[5];//top = dexl
        tempSort[2] = characterStats[4];//2nd = con
        tempSort[0] = characterStats[3];//3rd = str
        tempSort[3] = characterStats[2];//4th = int?
        tempSort[4] = characterStats[1];//5th = wis
        tempSort[5] = characterStats[0];//6th = char
        System.arraycopy(tempSort, 0, characterStats, 0, 6); // Netbeans recomended me this. Seems legit
        updateMods();
    }

    public void dexConWisArrange() {
        int[] tempSort = {0, 0, 0, 0, 0, 0};
        tempSort[1] = characterStats[5];//top = dexl
        tempSort[2] = characterStats[4];//2nd = con
        tempSort[4] = characterStats[3];//3rd = wis
        tempSort[3] = characterStats[2];//4th = int?
        tempSort[0] = characterStats[1];//5th = str
        tempSort[5] = characterStats[0];//6th = char
        System.arraycopy(tempSort, 0, characterStats, 0, 6); // Netbeans recomended me this. Seems legit
        updateMods();
    }

    public void dexConStrArrange2() {//class chages bottom order up. dump is now itn
        int[] tempSort = {0, 0, 0, 0, 0, 0};
        tempSort[1] = characterStats[5];//top = dexl
        tempSort[2] = characterStats[4];//2nd = con
        tempSort[0] = characterStats[3];//3rd = str
        tempSort[4] = characterStats[2];//4th = wis
        tempSort[5] = characterStats[1];//5th = cha
        tempSort[3] = characterStats[0];//6th = int
        System.arraycopy(tempSort, 0, characterStats, 0, 6); // Netbeans recomended me this. Seems legit
        updateMods();
    }

    public void charWisIntArrange() {
        int[] tempSort = {0, 0, 0, 0, 0, 0};
        tempSort[5] = characterStats[5];
        tempSort[4] = characterStats[4];
        tempSort[3] = characterStats[3];
        tempSort[2] = characterStats[2];
        tempSort[1] = characterStats[1];
        tempSort[0] = characterStats[0];
        System.arraycopy(tempSort, 0, characterStats, 0, 6);// Netbeans recomended me this. Seems legit
        updateMods();
    }

    public void charWisConStr() {
        int[] tempSort = {0, 0, 0, 0, 0, 0};
        tempSort[5] = characterStats[4];
        tempSort[4] = characterStats[2];
        tempSort[3] = characterStats[0];
        tempSort[2] = characterStats[1];
        tempSort[1] = characterStats[5];
        tempSort[0] = characterStats[3];
        System.arraycopy(tempSort, 0, characterStats, 0, 6);// Netbeans recomended me this. Seems legit
        updateMods();

    }

    public void charStrConCha() {
        int[] tempSort = {0, 0, 0, 0, 0, 0};
        tempSort[5] = characterStats[0];
        tempSort[4] = characterStats[2];
        tempSort[3] = characterStats[5];
        tempSort[2] = characterStats[1];
        tempSort[1] = characterStats[4];
        tempSort[0] = characterStats[3];//int dump stat
        System.arraycopy(tempSort, 0, characterStats, 0, 6);// Netbeans recomended me this. Seems legit
        updateMods();
    }

    public void updateMods() {//There's a better way of doing this. Please redo if time permits
        int counter = 0;
        int tmp;
        while (counter != 6) {
            tmp = characterStats[counter];
            switch (tmp) {// switch curtisy of java tutorials
                case 1:
                    characterMods[counter] = -5;
                    break;
                case 2:
                    characterMods[counter] = -4;
                    break;
                case 3:
                    characterMods[counter] = -4;
                    break;
                case 4:
                    characterMods[counter] = -3;
                    break;
                case 5:
                    characterMods[counter] = -3;
                    break;
                case 6:
                    characterMods[counter] = -2;
                    break;
                case 7:
                    characterMods[counter] = -2;
                    break;
                case 8:
                    characterMods[counter] = -1;
                    break;
                case 9:
                    characterMods[counter] = -1;
                    break;
                case 10:
                    characterMods[counter] = 0;
                    break;
                case 11:
                    characterMods[counter] = 0;
                    break;
                case 12:
                    characterMods[counter] = 1;
                    break;
                case 13:
                    characterMods[counter] = 1;
                    break;
                case 14:
                    characterMods[counter] = 2;
                    break;
                case 15:
                    characterMods[counter] = 2;
                    break;
                case 16:
                    characterMods[counter] = 3;
                    break;
                case 17:
                    characterMods[counter] = 3;
                    break;
                case 18:
                    characterMods[counter] = 4;
                    break;
                case 19:
                    characterMods[counter] = 4;
                    break;
                case 20:
                    characterMods[counter] = 5;
                    break;
                default:
                    characterMods[counter] = 5;
                    break;
            }
            counter++;

        }
    }

    public void LevelSavesUpdate() {
        fortSave = baseFortSave + characterMods[2]; //fortSaveBase + con
        refSave = baseRefSave + characterMods[1]; //refSaveBase + dex
        willSave = baseWillSave + characterMods[4]; // willSaveBase + wis
        Initiative = characterMods[1];

    }

    public void LevelAttackBonusUpdate() { //updates the entire array. Skips the array spots that are -99
        //this way you don't get bonuses in attacks you dont have yet. 
        for (int z = 0; z < 4; z++) {
            if (baseAttackBonus[z] != -99)
                AttackBonus[z] = baseAttackBonus[z] + characterMods[0];
        }
    }

    public void bonusSpellPerDay(int mod) {
        switch (mod) {
            //do nothing
            case 0:
                break;
            case 1:
                bonusSpells[0] = 1;
                break;
            case 2:
                bonusSpells[0] = 1;
                bonusSpells[1] = 1;
                break;
            case 3:
                bonusSpells[0] = 1;
                bonusSpells[1] = 1;
                bonusSpells[2] = 1;
                break;
            case 4:
                bonusSpells[0] = 1;
                bonusSpells[1] = 1;
                bonusSpells[2] = 1;
                bonusSpells[3] = 1;
                break;
            case 5:
                bonusSpells[0] = 2;
                bonusSpells[1] = 1;
                bonusSpells[2] = 1;
                bonusSpells[3] = 1;
                bonusSpells[4] = 1;
                break;
            default:
                break;
        }
    }

    public void addToSpecialSkills(String A) {
        int x = 0;
        int loc = 0;
        while (x == 0) {
            if (SpecialSkills[loc].equals("")) {
                x = 1;
                SpecialSkills[loc] = A;
            } else
                loc++;


        }
    }
    public void purgeSpecialSkills(){
       int count = 0;
        while( count <100){
            SpecialSkills[count] = "";
            count++;
        }
    }
    public void replaceASpecialSkill(String A, String B) {
        int x = 0;
        int loc = 0;
        while (x == 0) {
            if (SpecialSkills[loc].equals(A)) {
                x = 1;
                SpecialSkills[loc] = B;
            } else
                loc++;


        }
    }
    public void makeExtDir(){
    File wallpaperDirectory = new File("/sdcard/PathfinderMaster/");
    // have the object build the directory structure, if needed.
    wallpaperDirectory.mkdirs();

}
    public void saveBasic(String A) {
        //need to decide how to bring in a name for the file
        //This is what A should be
        int loc = 0;
        int r = 0;
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(A + ".txt."), "utf-8"))) {
            writer.write("Character : " + firstName + " " + lastName + "  |    Level: " + level + " | HP: " + hitPoints + " | Race: " + race + " | Alignment: " + alignment);
            writer.newLine();
            writer.write("Character Description:");
            writer.newLine();
            writer.write("_______________");
            writer.newLine();

            writer.write("Age: " + age + "| Height(ft,in) " + sizeFeet + "feet " + sizeInches + "inches  | Weight: " + weight);
            writer.newLine();

            writer.write(" Hair color: " + hair + " | Eye Color: " + eyes + " | Size class: " + sizeClass + " ");
            writer.newLine();
            writer.write("");
            writer.write("Character Stats, Mods: ");
            writer.newLine();
            writer.write("_______________");
            writer.newLine();
            writer.write("Str: " + characterStats[0] + " | " + characterMods[0]);
            writer.newLine();
            writer.write("Dex: " + characterStats[1] + " | " + characterMods[1]);
            writer.newLine();
            writer.write("Con: " + characterStats[2] + " | " + characterMods[2]);
            writer.newLine();
            writer.write("Int: " + characterStats[3] + " | " + characterMods[3]);
            writer.newLine();
            writer.write("Wis: " + characterStats[4] + " | " + characterMods[4]);
            writer.newLine();
            writer.write("Cha: " + characterStats[5] + " | " + characterMods[5]);
            writer.newLine();
            writer.write("Character Attacks:");
            writer.newLine();
            writer.write("Base attacks [ ");
            if (baseAttackBonus[0] != -99)
                writer.write(baseAttackBonus[0] + ", ");
            if (baseAttackBonus[1] != -99)
                writer.write(baseAttackBonus[1] + ", ");
            if (baseAttackBonus[2] != -99)
                writer.write(baseAttackBonus[2] + ", ");
            if (baseAttackBonus[3] != -99)
                writer.write(baseAttackBonus[3] + " ");
            writer.write("]");
            writer.newLine();
            writer.write("Attacks with bonus: [ ");
            if (AttackBonus[0] != -99)
                writer.write(AttackBonus[0] + ", ");
            if (AttackBonus[1] != -99)
                writer.write(AttackBonus[1] + ", ");
            if (AttackBonus[2] != -99)
                writer.write(AttackBonus[2] + ", ");
            if (AttackBonus[3] != -99)
                writer.write(AttackBonus[3] + " ");
            writer.write("]");

            writer.newLine();
            writer.write("Fort save:  " + fortSave + " | (Base = " + baseFortSave + " )");
            writer.newLine();
            writer.write("Will save:  " + willSave + " | (Base = " + baseWillSave + " )");
            writer.newLine();
            writer.write("Reflex save:  " + refSave + " | (Base = " + baseRefSave + " )");
            writer.newLine();

            writer.write(" AC: " + AC + " | Touch: " + touchAC + " | FlatFoot: " + FlatFootAC + " | Initiative: " + Initiative + "| Move Speed: + " + travelSpeed);
            writer.newLine();
            writer.write("Special SKills");
            writer.newLine();
            writer.write("___________________________");
            while (r != 2) {
                if (!(SpecialSkills[loc].equals(""))) {
                    writer.write(SpecialSkills[loc]);
                    writer.newLine();

                } else {
                    r = 2;
                }

            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public void basicCharacteristics() {
        RollClass diceRoll = new RollClass();
        int holding = diceRoll.roll2X(0, 5);
        switch (holding) {
            //do nothing
            case 0:
                hair = "Black";
                break;
            case 1:
                hair = "White";
                break;
            case 2:
                hair = "Blue";
                break;
            case 3:
                hair = "Brown";
                break;
            case 4:
                hair = "Blond";
                break;
            case 5:
                hair = "Red";
                break;
            default:
                break;
        }
        RollClass diceRoll2 = new RollClass();
        int holding2 = diceRoll2.roll2X(75, 125);
        weight = holding2;
        RollClass diceRoll3 = new RollClass();
        int holding3 = diceRoll3.roll2X(0, 5);
        switch (holding3) {
            //do nothing
            case 0:
                eyes = "Green";
                break;
            case 1:
                eyes = "White";
                break;
            case 2:
                eyes = "Blue";
                break;
            case 3:
                eyes = "Brown";
                break;
            case 4:
                eyes = "Purple";
                break;
            case 5:
                eyes = "Red";
                break;
            default:
                break;
        }

    }

    public void getARace() {

        RollClass diceRoll = new RollClass();
        int holding = diceRoll.roll2X(0, 9);
        switch (holding) {
            //do nothing
            case 0:
                makeElf();
                break;
            case 1:
                makeDwarf();
                break;
            case 2:
                makeGnome();
                break;
            case 3:
                makeHalfling();
                break;
            case 4:
                humanPlusStr();
                break;
            case 5:
                humanPlusDex();
                break;
            case 6:
                humanPlusCon();
                break;
            case 7:
                humanPlusInt();
                break;
            case 8:
                humanPlusWis();
                break;
            case 9:
                humanPlusCha();
                break;
            default:
                break;
        }
    }
}