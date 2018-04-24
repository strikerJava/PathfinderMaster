/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pathfinder.pathfindermaster.javalogic;
//will audit this in the future

import java.sql.*;

/**
 *
 * @author kanallrt265
 */
public class WizardMake extends Character{
   // int[] totalSorcSpells = {0,0,0,0,0,0,0,0,0,0}; // spot 0 will not be used. does not need
    //int[] totalSorcSpellsKnown = {0,0,0,0,0,0,0,0,0,0};
    String levelZeroSpellsKnown = "";
    String levelOneSpellsKnown = "";
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
        addToSpecialSkills("Arcane bond");
        addToSpecialSkills("arcane school");
        addToSpecialSkills("cantrips");
        addToSpecialSkills("Scribe Scroll");
        
        weaponProf = "Simple ";
        armorProf = " None ";
        lastName = "The Wizard";
        level = 1;
        if(gender.equals("Female"))
            firstName = "Jane";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        baseSpellsPerDayWiz(level); 
        bonusSpellPerDay(characterStats[5]);
        wizTotalSpells();
       
    }
     public void baseSpellsPerDayWiz(int lv){
        
        switch (lv) {
        //do nothing
            case 1:
                baseSpellsPerDay[0] = 3;
                baseSpellsPerDay[1] = 1;
                break;
            case 2:
                baseSpellsPerDay[0] = 4;
                baseSpellsPerDay[1] = 2;
                break;
            case 3:
                baseSpellsPerDay[2] = 1;
                break;
            case 4:
                baseSpellsPerDay[1] = 3;
                baseSpellsPerDay[2] = 2;
                break;
            case 5:
                baseSpellsPerDay[3] = 1;
                break;
            case 6:
                baseSpellsPerDay[2] = 3;
                baseSpellsPerDay[3] = 2;
                break;
            case 7:
                baseSpellsPerDay[1] = 4;
                baseSpellsPerDay[4] = 1;
                break;
            case 8:
                baseSpellsPerDay[3] = 3;
                baseSpellsPerDay[4] = 2;
                break;
            case 9:
                baseSpellsPerDay[2] = 4;
                baseSpellsPerDay[5] = 1;
                break;
            case 10:
                baseSpellsPerDay[4] = 3;
                baseSpellsPerDay[5] = 2;
                break;
            case 11:
                baseSpellsPerDay[3] = 6;
                baseSpellsPerDay[6] = 1;
                break;            
            case 12:
                baseSpellsPerDay[5] = 3;
                baseSpellsPerDay[6] = 2;
                break;
            case 13:
                baseSpellsPerDay[4] = 4;
                baseSpellsPerDay[7] = 1;
                break;
            case 14:
                baseSpellsPerDay[6] = 3;
                baseSpellsPerDay[7] = 2;
                break;       
            case 15:
                baseSpellsPerDay[5] = 4;
                baseSpellsPerDay[8] = 1;
                break;
            case 16:
                baseSpellsPerDay[7] = 3;
                baseSpellsPerDay[8] = 2;
                break;
            case 17:
                baseSpellsPerDay[6] = 4;
                baseSpellsPerDay[9] = 1;
                break;
            case 18:
                baseSpellsPerDay[8] = 3;
                baseSpellsPerDay[9] = 2;
                break;
            case 19:
                baseSpellsPerDay[7] = 4;
                baseSpellsPerDay[8] = 3;
                baseSpellsPerDay[9] = 3;
                break;
            case 20:
                baseSpellsPerDay[8] = 4;
                baseSpellsPerDay[9] = 4;
                break;
            default:
                break;
        }
        }
     
      public void wizTotalSpells(){
       totalSorcSpells[0] = baseSpellsPerDay[0] + bonusSpells[0];
       totalSorcSpells[1] = baseSpellsPerDay[1] + bonusSpells[1];
       totalSorcSpells[2] = baseSpellsPerDay[2] + bonusSpells[2];
       totalSorcSpells[3] = baseSpellsPerDay[3] + bonusSpells[3];
       totalSorcSpells[4] = baseSpellsPerDay[4] + bonusSpells[4];
       totalSorcSpells[5] = baseSpellsPerDay[5] + bonusSpells[5];
       
    }
             public void levelUpWiz(){
        level++;
        levelUpSpecifics(level);
    }
      public void levelUpSpecifics(int lv){
          switch (lv) {
        //do nothing
            case 1:
                //do nothing. Use spawn class
                break;
             case 2:
                 HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 1;
            baseWillSave = 3;
            baseSpellsPerDayWiz(level);
            wizTotalSpells();
            LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 3:
                HitDieUpdate(hitDie1D, characterMods[2]);
                baseFortSave = 1;
                baseRefSave = 1; 
                baseSpellsPerDayWiz(level);
                wizTotalSpells();
                LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 4:
                characterMods[4] = characterMods[4] + 1;
                updateMods();
                HitDieUpdate(hitDie1D, characterMods[2]);
                baseAttackBonus[0] = 2;
                baseWillSave = 4;
                 baseSpellsPerDayWiz(level);
                 wizTotalSpells();
                 LevelSavesUpdate();
        LevelAttackBonusUpdate();
                 
                break;
            case 5:
                HitDieUpdate(hitDie1D, characterMods[2]);
               addToSpecialSkills("Bonus Feat (1)");
                baseSpellsPerDayWiz(level);
                wizTotalSpells();
                LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 6:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 3;
            baseFortSave = 2;
            baseRefSave = 2;
            baseWillSave = 5;
             baseSpellsPerDayWiz(level);
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 7:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayWiz(level);
            wizTotalSpells();
            LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 8:
                characterMods[4] = characterMods[4] + 1;
                updateMods();
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[4] = 1;
            baseWillSave = 6;
             baseSpellsPerDayWiz(level);
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 9:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseFortSave = 3;
            baseRefSave = 3;
             baseSpellsPerDayWiz(level);
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 10:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 5;
            baseWillSave = 7;
            addToSpecialSkills("Bonus Feat (2)");
             baseSpellsPerDayWiz(level);
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 11:
                HitDieUpdate(hitDie1D, characterMods[2]);
                baseSpellsPerDayWiz(level);
                wizTotalSpells();
                LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;            
            case 12:
                characterMods[2] = characterMods[2] + 1;
                updateMods();
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 6;
            baseAttackBonus[1] = 1;
            baseFortSave = 4;
            baseRefSave = 4;
            baseWillSave = 8;
             baseSpellsPerDayWiz(level);
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 13:
                HitDieUpdate(hitDie1D, characterMods[2]);
                 baseSpellsPerDayWiz(level);
                 wizTotalSpells();
                 LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 14:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 7;
            baseAttackBonus[1] = 2;
            baseWillSave = 9;
             baseSpellsPerDayWiz(level);
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;       
            case 15:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseFortSave = 5;
            baseRefSave = 5;
            addToSpecialSkills("Bonus Feat (3)");
             baseSpellsPerDayWiz(level);    
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
            break;
            case 16:
                characterMods[2] = characterMods[2] + 1;
                updateMods();
                    HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 8;
            baseAttackBonus[1] = 3;
            baseWillSave = 10;
             baseSpellsPerDayWiz(level);
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
            break;
            case 17:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayWiz(level);
            wizTotalSpells();
            LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 18:
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 9;
            baseAttackBonus[1] = 4;
            baseFortSave = 6;
            baseRefSave = 6;
            baseWillSave = 11;
             baseSpellsPerDayWiz(level);
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
            break;
            case 19:
                HitDieUpdate(hitDie1D, characterMods[2]);
                baseSpellsPerDayWiz(level);
                wizTotalSpells();
                LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            case 20:
                characterMods[4] = characterMods[4] + 1;
                updateMods();
                HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 10;
            baseAttackBonus[1] = 5;
            baseWillSave = 12;
            addToSpecialSkills("Bonus Feat (4)");
             baseSpellsPerDayWiz(level);
             
             wizTotalSpells();
             LevelSavesUpdate();
        LevelAttackBonusUpdate();
                break;
            default:
                break;
        }
      }
      
      //This will be commendted out until I can get this sorted out with school requirements
     /* public void learnSomeSpells(int lv){ 
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
       switch (lv) {
        //do nothing
            case 1:{
                spellDatabase dataBase2 = new spellDatabase();
                System.out.println("PointA Switch");
                dataBase2.justOpen();   
                System.out.println("Catch 1 learnsome");
                spellFetch = diceRoll.roll2X(0, 28);
                checknums[0] = spellFetch;//holding to check to see if you get duplicates
                HoldIt = dataBase2.readOne(spellFetch); // get a spell
                levelZeroSpellsKnown = levelZeroSpellsKnown.concat( HoldIt + "|");
                spellFetch = diceRoll.roll2X(0, 28);
                while(spellFetch == checknums[0]){
                    spellFetch = diceRoll.roll2X(0, 28);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[1] = spellFetch;
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelZeroSpellsKnown = levelZeroSpellsKnown.concat( HoldIt + "|");
                
                spellFetch = diceRoll.roll2X(0, 28);
                while(spellFetch == checknums[0] || spellFetch == checknums[1] )
                {
                    spellFetch = diceRoll.roll2X(0, 28);//only rerolls until if gets a int that hasn't been rolled
                }
                checknums[2] = spellFetch;
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelZeroSpellsKnown = levelZeroSpellsKnown.concat( HoldIt + "|");
                spellFetch = diceRoll.roll2X(0, 28);
                while(spellFetch == checknums[0] || spellFetch == checknums[1] || spellFetch == checknums[2] ){
                    spellFetch = diceRoll.roll2X(0, 28);//only rerolls until if gets a int that hasn't been rolled
                }
                HoldIt = dataBase2.readOne(spellFetch);
                levelZeroSpellsKnown = levelZeroSpellsKnown.concat( HoldIt + "|");
                checknums[0] = 0;
               checknums[1] = 0;
               checknums[2] = 0;//reset array
               
               spellFetch = diceRoll.roll2X(28, 162);
                HoldIt = dataBase2.readOne(spellFetch);//get a spell
                levelOneSpellsKnown = levelOneSpellsKnown.concat(HoldIt + "|");
                 checknums[0] = spellFetch;
               spellFetch = diceRoll.roll2X(28, 162);//2 level 1 spells
               while(checknums[0] == spellFetch){
                   spellFetch = diceRoll.roll2X(28, 162); 
               }//check against level 1 spell to make sure its not a repeat
               HoldIt = dataBase2.readOne(spellFetch);//get a spell
               levelOneSpellsKnown = levelOneSpellsKnown.concat(HoldIt + "|");
              System.out.println("Level Zero Spells Known: " + levelZeroSpellsKnown);
              System.out.println("Level One Spells Known: " + levelOneSpellsKnown);
            }
                break;
            case 2:
                
                break;
            case 3:
                //
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
               
                break;
            case 8:
               
                break;
            case 9:
                 
                break;
            case 10:
             
                break;
            case 11:
               
                break;            
            case 12:
                
                break;
            case 13:
               
                break;
            case 14:
               
                
                break;       
            case 15:
              
                break;
            case 16:
                
                break;
            case 17:
              
                break;
            case 18:
              
                break;
            case 19:
              
                break;
            case 20:
             
                break;
            default:
                break;
        }
      
      }
      */
}
