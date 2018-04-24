//Something really bad happened here. I need to go back and check why I have random stuff posted everywhere
package diceroller;
/*
spell ranges are as follows
0:0-28
1:29-190
2:191-427
3:428-648
4:649-831
5:832-974
6:975-1087
7:1088-1182
8:1183-1245
9:1246-1301


*/

import java.sql.*;

/**
 *
 * @author kanallrt265
 */
public class SorcererMake extends Character{
   // int[] totalSorcSpells = {0,0,0,0,0,0,0,0,0,0}; // spot 0 will not be used. does not need
    //int[] totalSorcSpellsKnown = {0,0,0,0,0,0,0,0,0,0};
    int lvZeroPlace = 0;
    int lvOnePlace = 0;
    int lvTwoPlace = 0;
    int lvThreePlace = 0;
    int lvFourPlace = 0;
    int lvFivePlace = 0;
    int lvSixPlace = 0;
    int lvSevenPlace = 0;
    int lvEightPlace = 0;
    int lvNinePlace = 0;
    
    String[] levelZeroSpellsKnown = {"", "", "", "", "", "", "", "", "", "",""};
    int[] levelZeroSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past for level 0
    String[] levelOneSpellsKnown = {"", "", "", "", "", "", "", "", "", "",""};
     int[] levelOneSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past for level 1
    String[] levelTwoSpellsKnown = {"", "", "", "", "", "", "", "", "", ""};
     int[] levelTwoSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past for level 2 etc
    String[] levelThreeSpellsKnown = {"", "", "", "", "", "", "", "", "", ""};
     int[] levelThreeSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past
    String[] levelFourSpellsKnown = {"", "", "", "", "", "", "", "", "", ""};
     int[] levelFourSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past
    String[] levelFiveSpellsKnown = {"", "", "", "", "", "", "", "", "", ""};
     int[] levelFiveSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past
    String[] levelSixSpellsKnown = {"", "", "", "", "", "", "", "", "", ""};
     int[] levelSixSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past
    String[] levelSevenSpellsKnown = {"", "", "", "", "", "", "", "", "", ""};
     int[] levelSevenSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past
    String[] levelEightSpellsKnown = {"", "", "", "", "", "", "", "", "", ""};
     int[] levelEightSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past
    String[] levelNineSpellsKnown = {"", "", "", "", "", "", "", "", "", ""}; //The names of the Spells
     int[] levelNineSpellsKnownNum = {0,0,0,0,0,0,0,0,0,0}; //used to keep track of Numbers we've already rolled in the past
    int hitDie1D = 6;
    int ranksPerLevelBase = 2;
    public void spawnLV1Sorc(){
        //Randommake level1
        populateStats();
        charWisIntArrange();
        randomAlignment();
        randomGender();
        baseFortSave = 0;
        baseRefSave = 0;
        baseWillSave = 2;
        baseAttackBonus[0] = 0;
        fortSave = 0;
        refSave = 0;
        willSave = 2;
        AttackBonus[0] = 0;
        addToSpecialSkills("Bloodline power");
        addToSpecialSkills("Cantrips");
        addToSpecialSkills("Eschew materials");
        
        weaponProf = "Simple ";
        armorProf = " None ";
        lastName = "The Sorcerer";
        level = 1;
        if(gender.equals("Female"))
            firstName = "Jane";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        baseSpellsPerDaySorc(level); 
        bonusSpellPerDay(characterStats[5]);
        sorcSpellsKnown(level);
        sorcTotalSpells();
        System.out.println("Pre learnSomeSpells");
        learnSpellInterface(0);
        learnSpellInterface(0);
        learnSpellInterface(0);
        learnSpellInterface(0);
        learnSpellInterface(1);
        learnSpellInterface(1);
        
        
        System.out.println( "Post learnSomeSpells");
        System.out.println( levelZeroSpellsKnown);
        System.out.println("Asjdahdgkasjdgh");
    }
     public void baseSpellsPerDaySorc(int lv){
        
        switch (lv) {
        //do nothing
            case 1:
                baseSpellsPerDay[1] = 3;
                break;
            case 2:
                baseSpellsPerDay[1] = 4;
                break;
            case 3:
                baseSpellsPerDay[1] = 5;
                break;
            case 4:
                baseSpellsPerDay[1] = 6;
                baseSpellsPerDay[2] = 3;
                break;
            case 5:
                baseSpellsPerDay[2] = 4;
                break;
            case 6:
                baseSpellsPerDay[2] = 5;
                baseSpellsPerDay[3] = 3;
                break;
            case 7:
                baseSpellsPerDay[2] = 6;
                baseSpellsPerDay[3] = 4;
                break;
            case 8:
                baseSpellsPerDay[3] = 5;
                baseSpellsPerDay[4] = 3;
                break;
            case 9:
                baseSpellsPerDay[3] = 6;
                baseSpellsPerDay[4] = 4;
                break;
            case 10:
                baseSpellsPerDay[4] = 5;
                baseSpellsPerDay[5] = 3;
                break;
            case 11:
                baseSpellsPerDay[4] = 6;
                baseSpellsPerDay[5] = 4;
                break;            
            case 12:
                baseSpellsPerDay[5] = 5;
                baseSpellsPerDay[6] = 3;
                break;
            case 13:
                baseSpellsPerDay[5] = 6;
                baseSpellsPerDay[6] = 4;
                break;
            case 14:
                baseSpellsPerDay[6] = 5;
                baseSpellsPerDay[7] = 3;
                break;       
            case 15:
                baseSpellsPerDay[6] = 6;
                baseSpellsPerDay[7] = 4;
                break;
            case 16:
                baseSpellsPerDay[7] = 5;
                baseSpellsPerDay[8] = 3;
                break;
            case 17:
                baseSpellsPerDay[7] = 6;
                baseSpellsPerDay[8] = 4;
                break;
            case 18:
                baseSpellsPerDay[8] = 5;
                baseSpellsPerDay[9] = 3;
                break;
            case 19:
                baseSpellsPerDay[8] = 6;
                baseSpellsPerDay[9] = 4;
                break;
            case 20:
                baseSpellsPerDay[9] = 6;
                break;
            default:
                break;
        }
        }
      public void sorcSpellsKnown(int lv){
        switch (lv) {
        //do nothing
            case 1:
                totalSorcSpellsKnown[0] = 4;
                totalSorcSpellsKnown[1] = 2;
                break;
            case 2:
                totalSorcSpellsKnown[0] = 5;
                
                break;
            case 3:
                
                totalSorcSpellsKnown[1] = 3;
                break;
            case 4:
                totalSorcSpellsKnown[0] = 6;
                totalSorcSpellsKnown[2] = 1;
                break;
            case 5:
                totalSorcSpellsKnown[1] = 4;
                totalSorcSpellsKnown[2] = 2;
                break;
            case 6:
                totalSorcSpellsKnown[0] = 7;
                totalSorcSpellsKnown[3] = 1;
                break;
            case 7:
                totalSorcSpellsKnown[1] = 5;
                totalSorcSpellsKnown[2] = 3;        
                totalSorcSpellsKnown[3] = 2;
                break;
            case 8:
                totalSorcSpellsKnown[0] = 8;
                totalSorcSpellsKnown[4] = 1;
                break;
            case 9:
                 totalSorcSpellsKnown[2] = 4;
                 totalSorcSpellsKnown[3] = 3;
                 totalSorcSpellsKnown[4] = 2;
                break;
            case 10:
                totalSorcSpellsKnown[0] = 9;
                totalSorcSpellsKnown[5] = 1;
                break;
            case 11:
                totalSorcSpellsKnown[2] = 5;
                totalSorcSpellsKnown[3] = 4;
                totalSorcSpellsKnown[4] = 3;
                 totalSorcSpellsKnown[5] = 2;
                break;            
            case 12:
                totalSorcSpellsKnown[6] = 1;
                break;
            case 13:
                totalSorcSpellsKnown[4] = 4;
                totalSorcSpellsKnown[5] = 3;
                totalSorcSpellsKnown[6] = 2;
                break;
            case 14:
                totalSorcSpellsKnown[7] = 1;
                
                break;       
            case 15:
                totalSorcSpellsKnown[5] = 4;
                totalSorcSpellsKnown[6] = 3;
                totalSorcSpellsKnown[7] = 2;
                break;
            case 16:
                totalSorcSpellsKnown[8] = 1;
                break;
            case 17:
                totalSorcSpellsKnown[7] = 3;
                totalSorcSpellsKnown[8] = 2;
                break;
            case 18:
                totalSorcSpellsKnown[9] = 1;
                break;
            case 19:
                totalSorcSpellsKnown[8] = 3;
                totalSorcSpellsKnown[9] = 2;
                break;
            case 20:
                totalSorcSpellsKnown[9] = 3;
                break;
            default:
                break;
        }
    }
      public void sorcTotalSpells(){
       totalSorcSpells[0] = baseSpellsPerDay[0] + bonusSpells[0];
       totalSorcSpells[1] = baseSpellsPerDay[1] + bonusSpells[1];
       totalSorcSpells[2] = baseSpellsPerDay[2] + bonusSpells[2];
       totalSorcSpells[3] = baseSpellsPerDay[3] + bonusSpells[3];
       totalSorcSpells[4] = baseSpellsPerDay[4] + bonusSpells[4];
       totalSorcSpells[5] = baseSpellsPerDay[5] + bonusSpells[5];
//       totalSorcSpells[6] = baseSpellsPerDay[6] + bonusSpells[6];
     //  totalSorcSpells[7] = baseSpellsPerDay[7] + bonusSpells[7];
     //  totalSorcSpells[8] = baseSpellsPerDay[8] + bonusSpells[8];
    //   totalSorcSpells[9] = baseSpellsPerDay[9] + bonusSpells[9];
       
    }
     
       public void levelUpSorc(){
        level++;
        levelUpSpecifics(level);
    }
<<<<<<< HEAD
       switch (lv) {
        //do nothing
            case 1:{
                spellDatabase dataBase2 = new spellDatabase();
                
                dataBase2.justOpen();   
                
                spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase2.readOne(spellFetch); // get a spell
                levelZeroSpellsKnown[lvZeroPlace] = HoldIt;
                levelZeroSpellsKnownNum[lvZeroPlace] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                spellFetch = diceRoll.roll2X(0, 28);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(0, 28);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelZeroSpellsKnown[lvZeroPlace] = HoldIt;
                levelZeroSpellsKnownNum[lvZeroPlace] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                
                spellFetch = diceRoll.roll2X(0, 28);
                while(spellFetch == checknums[0] || spellFetch == checknums[1] )
                {
                    spellFetch = diceRoll.roll2X(0, 28);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[2] = spellFetch;
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelZeroSpellsKnown[lvZeroPlace] = HoldIt;
                levelZeroSpellsKnownNum[lvZeroPlace] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                while(spellFetch == checknums[0] || spellFetch == checknums[1] || spellFetch == checknums[2] ){
                    spellFetch = diceRoll.roll2X(0, 28);//only rerolls until if gets a int that hasn't been rolled
                }
                HoldIt = dataBase2.readOne(spellFetch);
                levelZeroSpellsKnown[lvZeroPlace] = HoldIt;
                levelZeroSpellsKnownNum[lvZeroPlace] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                checknums[0] = 0;
               checknums[1] = 0;
               checknums[2] = 0;//reset array
               
               spellFetch = diceRoll.roll2X(28, 162);
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelOneSpellsKnown[lvOnePlace] = HoldIt;
                levelOneSpellsKnownNum[lvOnePlace] = spellFetch;//Store Rolled Spell ID
                lvOnePlace++;
                 checknums[0] = spellFetch;
               spellFetch = diceRoll.roll2X(28, 162);//2 level 1 spells
               while(checknums[0] == spellFetch){
                   spellFetch = diceRoll.roll2X(28, 162); 
               }//check against level 1 spell to make sure its not a repeat
               HoldIt = dataBase2.readOne(spellFetch);//get a spell
               levelOneSpellsKnown[lvOnePlace] = HoldIt;
               levelOneSpellsKnownNum[lvOnePlace] = spellFetch;//Store Rolled Spell ID
                lvOnePlace++;
              System.out.println("Level Zero Spells Known: " + levelZeroSpellsKnown);
              System.out.println("Level One Spells Known: " + levelOneSpellsKnown);
              
            }
                break;
            case 2:{
                spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[0] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelZeroSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase2.readOne(spellFetch); // get a spell, not a duplicate
                levelZeroSpellsKnown[totalSorcSpellsKnown[0] - 1] = HoldIt;
                levelZeroSpellsKnownNum[totalSorcSpellsKnown[0] - 1] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                break;
            }
            case 3:{
                spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(28, 162);
                for(int i = 0; i != totalSorcSpellsKnown[1] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelOneSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(28, 162);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelOneSpellsKnown[totalSorcSpellsKnown[1] - 1] = HoldIt;
                levelOneSpellsKnownNum[totalSorcSpellsKnown[1] - 1] = spellFetch;//Store Rolled Spell ID
                break;}
            case 4:{
                 spellDatabase dataBase2 = new spellDatabase();
                
                dataBase2.justOpen();   
                
                spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase2.readOne(spellFetch); // get a spell
                levelTwoSpellsKnown[lvZeroPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvZeroPlace] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                spellFetch = diceRoll.roll2X(0, 28);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(0, 28);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelZeroSpellsKnown[lvZeroPlace] = HoldIt;
                levelZeroSpellsKnownNum[lvZeroPlace] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                
                //
                
                 spellDatabase dataBase3 = new spellDatabase();
                
                dataBase3.justOpen();   
                
                spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase3.readOne(spellFetch); // get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
                spellFetch = diceRoll.roll2X(191, 427);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(191, 427);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase3.readOne(spellFetch);//get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
               
                break;}
            case 5:{
                spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(28, 162);
                for(int i = 0; i != totalSorcSpellsKnown[1] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelOneSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(28, 162);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelOneSpellsKnown[totalSorcSpellsKnown[1] - 1] = HoldIt;
                levelOneSpellsKnownNum[totalSorcSpellsKnown[1] - 1] = spellFetch;//Store Rolled Spell ID
                
                 spellDatabase dataBase3 = new spellDatabase();
                
                dataBase3.justOpen();   
                
                spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase3.readOne(spellFetch); // get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
                spellFetch = diceRoll.roll2X(191, 427);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(191, 427);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase3.readOne(spellFetch);//get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
               
                break;}
            case 6:{
                 spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[0] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelZeroSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase2.readOne(spellFetch); // get a spell, not a duplicate
                levelZeroSpellsKnown[totalSorcSpellsKnown[0] - 1] = HoldIt;
                levelZeroSpellsKnownNum[totalSorcSpellsKnown[0] - 1] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                
                //
                 spellDatabase dataBase4 = new spellDatabase();
                
                dataBase4.justOpen();   
                
                spellFetch = diceRoll.roll2X(428, 648);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase4.readOne(spellFetch); // get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                spellFetch = diceRoll.roll2X(428, 648);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(428, 648);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase4.readOne(spellFetch);//get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                break;}
            case 7:{
                spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(28, 162);
                for(int i = 0; i != totalSorcSpellsKnown[1] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelOneSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(28, 162);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelOneSpellsKnown[totalSorcSpellsKnown[1] - 1] = HoldIt;
                levelOneSpellsKnownNum[totalSorcSpellsKnown[1] - 1] = spellFetch;//Store Rolled Spell ID
                
                 spellDatabase dataBase3 = new spellDatabase();
                
                dataBase3.justOpen();   
                
                spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase3.readOne(spellFetch); // get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
                spellFetch = diceRoll.roll2X(191, 427);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(191, 427);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase3.readOne(spellFetch);//get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
               //
                spellDatabase dataBase4 = new spellDatabase();
                
                dataBase4.justOpen();   
                
                spellFetch = diceRoll.roll2X(428, 648);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase4.readOne(spellFetch); // get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                spellFetch = diceRoll.roll2X(428, 648);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(428, 648);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase4.readOne(spellFetch);//get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                break;}
            case 8:{ 
                spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[0] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelZeroSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase2.readOne(spellFetch); // get a spell, not a duplicate
                levelFourSpellsKnown[lvFourPlace] = HoldIt;
                levelFourSpellsKnownNum[lvFourPlace] = spellFetch;//Store Rolled Spell ID
                lvFourPlace++;
                //
                spellDatabase dataBase5 = new spellDatabase();
                dataBase5.justOpen();   
                spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID
                for(int i = 0; i != lvFourPlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase5.readOne(spellFetch); // get a spell, not a duplicate
                levelFourSpellsKnown[lvFourPlace] = HoldIt;
                levelFourSpellsKnownNum[lvFourPlace] = spellFetch;//Store Rolled Spell ID
                lvFourPlace++;
                
               
                break;}
            case 9:{
                 spellDatabase dataBase3 = new spellDatabase();
                
                dataBase3.justOpen();   
                
                spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase3.readOne(spellFetch); // get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
                spellFetch = diceRoll.roll2X(191, 427);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(191, 427);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase3.readOne(spellFetch);//get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
               //
                 spellDatabase dataBase4 = new spellDatabase();
                
                dataBase4.justOpen();   
                
                spellFetch = diceRoll.roll2X(428, 648);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase4.readOne(spellFetch); // get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                spellFetch = diceRoll.roll2X(428, 648);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(428, 648);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase4.readOne(spellFetch);//get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                //lv 4 spell
               spellDatabase dataBase5 = new spellDatabase();
                dataBase5.justOpen();   
                spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[3] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase5.readOne(spellFetch); // get a spell, not a duplicate
                levelFourSpellsKnown[totalSorcSpellsKnown[3] - 1] = HoldIt;
                levelFourSpellsKnownNum[totalSorcSpellsKnown[3] - 1] = spellFetch;//Store Rolled Spell ID
                lvFourPlace++;
                break;}
            case 10:{
                 spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[0] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelZeroSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase2.readOne(spellFetch); // get a spell, not a duplicate
                levelZeroSpellsKnown[totalSorcSpellsKnown[0] - 1] = HoldIt;
                levelZeroSpellsKnownNum[totalSorcSpellsKnown[0] - 1] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                //
                spellDatabase dataBase6 = new spellDatabase();
                dataBase6.justOpen();   
                spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[4] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase6.readOne(spellFetch); // get a spell, not a duplicate
                levelFiveSpellsKnown[totalSorcSpellsKnown[4] - 1] = HoldIt;
                levelFiveSpellsKnownNum[totalSorcSpellsKnown[4] - 1] = spellFetch;//Store Rolled Spell ID
                lvFivePlace++;
             
                break;}
            case 11:{
                 spellDatabase dataBase3 = new spellDatabase();
                
                dataBase3.justOpen();   
                
                spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase3.readOne(spellFetch); // get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
                spellFetch = diceRoll.roll2X(191, 427);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(191, 427);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase3.readOne(spellFetch);//get a spell
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
                  spellDatabase dataBase4 = new spellDatabase();
                
                dataBase4.justOpen();   
                
                spellFetch = diceRoll.roll2X(428, 648);//get a random spell ID
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase4.readOne(spellFetch); // get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                spellFetch = diceRoll.roll2X(428, 648);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(428, 648);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase4.readOne(spellFetch);//get a spell
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                //  
                spellDatabase dataBase5 = new spellDatabase();
                dataBase5.justOpen();   
                spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[3] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase5.readOne(spellFetch); // get a spell, not a duplicate
                levelFourSpellsKnown[totalSorcSpellsKnown[3] - 1] = HoldIt;
                levelFourSpellsKnownNum[totalSorcSpellsKnown[3] - 1] = spellFetch;//Store Rolled Spell ID
                lvFourPlace++;
               //
               spellDatabase dataBase6 = new spellDatabase();
                dataBase6.justOpen();   
                spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[4] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase6.readOne(spellFetch); // get a spell, not a duplicate
                levelFiveSpellsKnown[totalSorcSpellsKnown[4] - 1] = HoldIt;
                levelFiveSpellsKnownNum[totalSorcSpellsKnown[4] - 1] = spellFetch;//Store Rolled Spell ID
                lvFivePlace++;
             
                break;}            
            case 12:{
                spellDatabase dataBase7 = new spellDatabase();
                dataBase7.justOpen();   
                spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[5] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelSixSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase7.readOne(spellFetch); // get a spell, not a duplicate
                levelSixSpellsKnown[totalSorcSpellsKnown[5] - 1] = HoldIt;
                levelSixSpellsKnownNum[totalSorcSpellsKnown[5] - 1] = spellFetch;//Store Rolled Spell ID
                lvSixPlace++;
             
                
                
                break;}
            case 13:{
               spellDatabase dataBase5 = new spellDatabase();
                dataBase5.justOpen();   
                spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[3] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase5.readOne(spellFetch); // get a spell, not a duplicate
                levelFourSpellsKnown[totalSorcSpellsKnown[3] - 1] = HoldIt;
                levelFourSpellsKnownNum[totalSorcSpellsKnown[3] - 1] = spellFetch;//Store Rolled Spell ID
                lvFourPlace++;
                //
                spellDatabase dataBase6 = new spellDatabase();
                dataBase6.justOpen();   
                spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[4] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase6.readOne(spellFetch); // get a spell, not a duplicate
                levelFiveSpellsKnown[totalSorcSpellsKnown[4] - 1] = HoldIt;
                levelFiveSpellsKnownNum[totalSorcSpellsKnown[4] - 1] = spellFetch;//Store Rolled Spell ID
                lvFivePlace++;
             //
             spellDatabase dataBase7 = new spellDatabase();
                dataBase7.justOpen();   
                spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[5] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelSixSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase7.readOne(spellFetch); // get a spell, not a duplicate
                levelSixSpellsKnown[totalSorcSpellsKnown[5] - 1] = HoldIt;
                levelSixSpellsKnownNum[totalSorcSpellsKnown[5] - 1] = spellFetch;//Store Rolled Spell ID
                lvSixPlace++;
                break;}
            case 14:{
               spellDatabase dataBase8 = new spellDatabase();
                dataBase8.justOpen();   
                spellFetch = diceRoll.roll2X(1088, 1182);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[6] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelSixSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase8.readOne(spellFetch); // get a spell, not a duplicate
                levelSevenSpellsKnown[totalSorcSpellsKnown[6] - 1] = HoldIt;
                levelSevenSpellsKnownNum[totalSorcSpellsKnown[6] - 1] = spellFetch;//Store Rolled Spell ID
                lvSevenPlace++;
                break;}       
            case 15:{
                spellDatabase dataBase6 = new spellDatabase();
                dataBase6.justOpen();   
                spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[4] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase6.readOne(spellFetch); // get a spell, not a duplicate
                levelFiveSpellsKnown[totalSorcSpellsKnown[4] - 1] = HoldIt;
                levelFiveSpellsKnownNum[totalSorcSpellsKnown[4] - 1] = spellFetch;//Store Rolled Spell ID
                lvFivePlace++;
             //
             spellDatabase dataBase7 = new spellDatabase();
                dataBase7.justOpen();   
                spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[5] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelSixSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase7.readOne(spellFetch); // get a spell, not a duplicate
                levelSixSpellsKnown[totalSorcSpellsKnown[5] - 1] = HoldIt;
                levelSixSpellsKnownNum[totalSorcSpellsKnown[5] - 1] = spellFetch;//Store Rolled Spell ID
                lvSixPlace++;
                //
                spellDatabase dataBase8 = new spellDatabase();
                dataBase8.justOpen();   
                spellFetch = diceRoll.roll2X(1088, 1182);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[6] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelSevenSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1088, 1182);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase8.readOne(spellFetch); // get a spell, not a duplicate
                levelSevenSpellsKnown[totalSorcSpellsKnown[6] - 1] = HoldIt;
                levelSevenSpellsKnownNum[totalSorcSpellsKnown[6] - 1] = spellFetch;//Store Rolled Spell ID
                lvSevenPlace++;
                break;}
            case 16:{
            spellDatabase dataBase9 = new spellDatabase();
                dataBase9.justOpen();   
                spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[7] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelEightSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase9.readOne(spellFetch); // get a spell, not a duplicate
                levelEightSpellsKnown[totalSorcSpellsKnown[7] - 1] = HoldIt;
                levelEightSpellsKnownNum[totalSorcSpellsKnown[7] - 1] = spellFetch;//Store Rolled Spell ID
                lvEightPlace++;
                break;}
            case 17:{
              spellDatabase dataBase9 = new spellDatabase();
                dataBase9.justOpen();   
                spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[7] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelEightSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase9.readOne(spellFetch); // get a spell, not a duplicate
                levelEightSpellsKnown[totalSorcSpellsKnown[7] - 1] = HoldIt;
                levelEightSpellsKnownNum[totalSorcSpellsKnown[7] - 1] = spellFetch;//Store Rolled Spell ID
                lvEightPlace++;
                break;}
            case 18:{
              spellDatabase dataBase10 = new spellDatabase();
                dataBase10.justOpen();   
                spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[8] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelNineSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase10.readOne(spellFetch); // get a spell, not a duplicate
                levelNineSpellsKnown[totalSorcSpellsKnown[8] - 1] = HoldIt;
                levelNineSpellsKnownNum[totalSorcSpellsKnown[8] - 1] = spellFetch;//Store Rolled Spell ID
                lvNinePlace++;
                break;}
            case 19:{
              spellDatabase dataBase9 = new spellDatabase();
                dataBase9.justOpen();   
                spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[7] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelEightSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase9.readOne(spellFetch); // get a spell, not a duplicate
                levelEightSpellsKnown[totalSorcSpellsKnown[7] - 1] = HoldIt;
                levelEightSpellsKnownNum[totalSorcSpellsKnown[7] - 1] = spellFetch;//Store Rolled Spell ID
                lvEightPlace++;
                spellDatabase dataBase10 = new spellDatabase();
                dataBase10.justOpen();   
                spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[8] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelNineSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase10.readOne(spellFetch); // get a spell, not a duplicate
                levelNineSpellsKnown[totalSorcSpellsKnown[8] - 1] = HoldIt;
                levelNineSpellsKnownNum[totalSorcSpellsKnown[8] - 1] = spellFetch;//Store Rolled Spell ID
                lvNinePlace++;
                break;}
            case 20:{
               spellDatabase dataBase10 = new spellDatabase();
                dataBase10.justOpen();   
                spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID
                for(int i = 0; i != totalSorcSpellsKnown[8] - 1; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelNineSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase10.readOne(spellFetch); // get a spell, not a duplicate
                levelNineSpellsKnown[totalSorcSpellsKnown[8] - 1] = HoldIt;
                levelNineSpellsKnownNum[totalSorcSpellsKnown[8] - 1] = spellFetch;//Store Rolled Spell ID
                lvNinePlace++;
                break;}
            default:
                break;
        }
      
      }
      public void levelUpSorc(int lv){
=======
      public void levelUpSpecifics(int lv){
>>>>>>> da53c82e3d396245a2cf3653a6529d3294c365bf
          switch (lv) {
        //do nothing
            case 1:
                //do nothing. Use spawn class
                break;
             case 2:
                
                baseWillSave = 3;
                baseAttackBonus[0] = 1;
                level = 2;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(0);
                break;
            case 3:
                baseFortSave = 1;
                baseRefSave = 1;
                level = 3;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(1);
                break;
            case 4:
                
                baseWillSave = 4;
                baseAttackBonus[0] = 2;
                level = 4;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(0);
                learnSpellInterface(2);
                break;
            case 5:
                level = 5;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(1);
                learnSpellInterface(2);
                break;
            case 6:
                baseFortSave = 2;
                baseRefSave = 2;
                baseWillSave = 5;
                baseAttackBonus[0] = 3;
                level = 6;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(0);
                learnSpellInterface(3);
                break;
            case 7:
               level = 7;
               baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(1);
                learnSpellInterface(2);
                learnSpellInterface(3);
                break;
            case 8:
                baseWillSave = 6;
                baseAttackBonus[0] = 4;
                level = 8;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(0);
                learnSpellInterface(4);
                break;
            case 9:
                baseFortSave = 3;
                baseRefSave = 3;
                level = 9;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(2);
                learnSpellInterface(3);
                learnSpellInterface(4);
                break;
            case 10:
                baseWillSave = 7;
                baseAttackBonus[0] = 5;
                level = 10;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(0);
                learnSpellInterface(5);
                break;
            case 11:
               level = 11;
               baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(2);
                learnSpellInterface(3);
                learnSpellInterface(4);
                learnSpellInterface(5);
                
                break;            
            case 12:
                baseFortSave = 4;
                baseRefSave = 4;
                baseWillSave = 8;
                baseAttackBonus[0] = 6;
                baseAttackBonus[1] = 1;
                level = 12;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(6);
                break;
            case 13:
               level = 13;
               baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(4);
                learnSpellInterface(5);
                learnSpellInterface(6);
                break;
            case 14:
                baseWillSave = 9;
                baseAttackBonus[0] = 7;
                baseAttackBonus[1] = 2;
                level = 14;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(7);
                break;       
            case 15:
                baseFortSave = 5;
                baseRefSave = 5;
                level = 15;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(5);
                learnSpellInterface(6);
                learnSpellInterface(7);
                
                break;
            case 16:
                baseWillSave = 10;
                baseAttackBonus[0] = 8;
                baseAttackBonus[1] = 3;
                level = 16;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(8);
                
                break;
            case 17:
              
                level = 17;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(7);
                learnSpellInterface(8);
                
                break;
            case 18:
                baseFortSave = 6;
                baseRefSave = 6;
                baseWillSave = 10;
                baseAttackBonus[0] = 9;
                baseAttackBonus[1] = 4;
                level = 18;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(9);
                break;
            case 19:
              level = 19;
              baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(8);
                learnSpellInterface(9);
                break;
            case 20:
                baseWillSave = 12;
                baseAttackBonus[0] = 10;
                baseAttackBonus[1] = 5;
                level = 20;
                baseSpellsPerDaySorc(level);
                sorcSpellsKnown(level);
                sorcTotalSpells();
                learnSpellInterface(9);
                break;
            default:
                break;
        }
      }
      
      public void learnSpellInterface(int lv){ // note to self in the future. Spells known
          //are not affected by character stats. What you're given in base is what you get
          
          {
       RollClass diceRoll = new RollClass();
       int spellFetch;
       int[] checknums = {0,0,0,0};
       String HoldIt;
       Connection c = null;
        Statement stmt = null;
       try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
         c.setAutoCommit(false);
         System.out.println("Opened Learnsome successfully");}
         catch ( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        // System.exit(0);
        }
          switch(lv){
              case 0:{
              spellDatabase dataBase0 = new spellDatabase();
                dataBase0.justOpen();   
                spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID
                for(int i = 0; i != lvZeroPlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelZeroSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(0, 28);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase0.readOne(spellFetch); // get a spell, not a duplicate
                levelZeroSpellsKnown[lvZeroPlace] = HoldIt;
                levelZeroSpellsKnownNum[lvZeroPlace] = spellFetch;//Store Rolled Spell ID
                lvZeroPlace++;
                }
              case 1:{
              spellDatabase dataBase1 = new spellDatabase();
                dataBase1.justOpen();   
                spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID
                for(int i = 0; i != lvOnePlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelOneSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(29, 190);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase1.readOne(spellFetch); // get a spell, not a duplicate
                levelOneSpellsKnown[lvOnePlace] = HoldIt;
                levelOneSpellsKnownNum[lvOnePlace] = spellFetch;//Store Rolled Spell ID
                lvOnePlace++;
                break;
                }
              case 2:{
              spellDatabase dataBase2 = new spellDatabase();
                dataBase2.justOpen();   
                spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID
                for(int i = 0; i != lvTwoPlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelTwoSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(191, 427);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase2.readOne(spellFetch); // get a spell, not a duplicate
                levelTwoSpellsKnown[lvTwoPlace] = HoldIt;
                levelTwoSpellsKnownNum[lvTwoPlace] = spellFetch;//Store Rolled Spell ID
                lvTwoPlace++;
                break;

                }
              case 3:{
              spellDatabase dataBase3 = new spellDatabase();
                dataBase3.justOpen();   
                spellFetch = diceRoll.roll2X(428, 648);//get a random spell ID
                for(int i = 0; i != lvThreePlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelThreeSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(428, 648);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase3.readOne(spellFetch); // get a spell, not a duplicate
                levelThreeSpellsKnown[lvThreePlace] = HoldIt;
                levelThreeSpellsKnownNum[lvThreePlace] = spellFetch;//Store Rolled Spell ID
                lvThreePlace++;
                break;
                }
              case 4:{
              spellDatabase dataBase4 = new spellDatabase();
                dataBase4.justOpen();   
                spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID
                for(int i = 0; i != lvFourPlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFourSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(649, 831);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase4.readOne(spellFetch); // get a spell, not a duplicate
                levelFourSpellsKnown[lvFourPlace] = HoldIt;
                levelFourSpellsKnownNum[lvFourPlace] = spellFetch;//Store Rolled Spell ID
                lvFourPlace++;
                break;
                }
              case 5:{
              spellDatabase dataBase5 = new spellDatabase();
                dataBase5.justOpen();   
                spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID
                for(int i = 0; i != lvFivePlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelFiveSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(832, 974);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase5.readOne(spellFetch); // get a spell, not a duplicate
                levelFiveSpellsKnown[lvFivePlace] = HoldIt;
                levelFiveSpellsKnownNum[lvFivePlace] = spellFetch;//Store Rolled Spell ID
                lvFivePlace++;
                break;
                }
              case 6:{
              spellDatabase dataBase6 = new spellDatabase();
                dataBase6.justOpen();   
                spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID
                for(int i = 0; i != lvSixPlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelSixSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(975, 1087);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase6.readOne(spellFetch); // get a spell, not a duplicate
                levelSixSpellsKnown[lvSixPlace] = HoldIt;
                levelSixSpellsKnownNum[lvSixPlace] = spellFetch;//Store Rolled Spell ID
                lvSixPlace++;
                break;
                }
              case 7:{
              spellDatabase dataBase7 = new spellDatabase();
                dataBase7.justOpen();   
                spellFetch = diceRoll.roll2X(1088, 1182);//get a random spell ID
                for(int i = 0; i != lvSevenPlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelSevenSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1088, 1182);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase7.readOne(spellFetch); // get a spell, not a duplicate
                levelSevenSpellsKnown[lvSevenPlace] = HoldIt;
                levelSevenSpellsKnownNum[lvSevenPlace] = spellFetch;//Store Rolled Spell ID
                lvSevenPlace++;
                break;
                }
              case 8:{
              spellDatabase dataBase8 = new spellDatabase();
                dataBase8.justOpen();   
                spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID
                for(int i = 0; i != lvEightPlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelEightSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1183, 1245);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase8.readOne(spellFetch); // get a spell, not a duplicate
                levelEightSpellsKnown[lvEightPlace] = HoldIt;
                levelEightSpellsKnownNum[lvEightPlace] = spellFetch;//Store Rolled Spell ID
                lvEightPlace++;
                break;
                }
              case 9:{
              spellDatabase dataBase9 = new spellDatabase();
                dataBase9.justOpen();   
                spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID
                for(int i = 0; i != lvNinePlace; i++){//incriment through Spellsknown by number, checks up to the n-1 spot
                    if(spellFetch == levelNineSpellsKnownNum[i]){
                        spellFetch = diceRoll.roll2X(1246, 1301);//get a random spell ID, reroll
                        i = 0;
                    }
                    else 
                        i++;
                }
              
                HoldIt = dataBase9.readOne(spellFetch); // get a spell, not a duplicate
                levelNineSpellsKnown[lvNinePlace] = HoldIt;
                levelNineSpellsKnownNum[lvNinePlace] = spellFetch;//Store Rolled Spell ID
                lvNinePlace++;
                break;
                }
              }
          }
          
          
          
          
      }
}
      


