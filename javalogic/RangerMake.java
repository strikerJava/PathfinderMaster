/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

import java.util.Arrays;

/**
 *
 * @author XPS L502X
 */
public class RangerMake extends Character {
    int[] totalRangerSpells = {0,0,0,0,0};
public void spawnLV1Ranger(){ // no spells for first 3 levels. Will revisit
        //Rangers have a companion option. Will be it's own seperate class
        //Randommake level1
        level = 1;
        populateStats();
        dexConWisArrange();
        randomAlignment();
        randomGender(); 
        hitDie1D = 10;
        ranksPerLevelBase = 6;
        if(gender.equals("Female"))
            firstName = "Jane";
        lastName = "The Ranger";
        baseFortSave = 2;
        baseRefSave = 2;
        baseWillSave = 0;
        baseAttackBonus[0] = 1;
        fortSave = 2;
        refSave = 2;
        willSave = 0;
        AttackBonus[0] = 1;
        addToSpecialSkills("First Favored Enemy");
        addToSpecialSkills("Track");
        addToSpecialSkills("Wild Empathy");
        weaponProf = "| Simple | Martial Weapons |";
        armorProf = "| Light | Medium | Sheilds ( -Tower Sheilds) |";
        
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        rangerSpellsBase(level);
        bonusSpellPerDay(characterMods[4]);
    }
       
    

       public void rangerSpellsBase(int lv){
           
           switch (lv) {
        //do nothing
            
            case 5:
                baseSpellsPerDay[1] = 1;
                break;
            case 6:
                baseSpellsPerDay[1] = 1;
                break;
            case 7:
                baseSpellsPerDay[1] = 1;
                break;
            case 8:
                baseSpellsPerDay[1] = 3;
                baseSpellsPerDay[2] = 1;
                break;
            case 9:
                baseSpellsPerDay[1] = 2;
                baseSpellsPerDay[2] = 1;
                break;
            case 10:
                baseSpellsPerDay[1] = 2;
                baseSpellsPerDay[2] = 1;
                break;
            case 11:
                baseSpellsPerDay[1] = 2;
                baseSpellsPerDay[2] = 1;
                baseSpellsPerDay[3] = 1;
                break;            
            case 12:
                baseSpellsPerDay[1] = 2;
                baseSpellsPerDay[2] = 2;
                baseSpellsPerDay[3] = 1;
                break;
            case 13:
                baseSpellsPerDay[1] = 3;
                baseSpellsPerDay[2] = 2;
                baseSpellsPerDay[3] = 1;
                break;
            case 14:
                baseSpellsPerDay[1] = 3;
                baseSpellsPerDay[2] = 2;
                baseSpellsPerDay[3] = 1;
                baseSpellsPerDay[4] = 1;
                break;       
            case 15:
                baseSpellsPerDay[1] = 3;
                baseSpellsPerDay[2] = 2;
                baseSpellsPerDay[3] = 2;
                baseSpellsPerDay[4] = 1;
                break;
            case 16:
                baseSpellsPerDay[1] = 3;
                baseSpellsPerDay[2] = 3;
                baseSpellsPerDay[3] = 2;
                baseSpellsPerDay[4] = 1;
                break;
            case 17:
                baseSpellsPerDay[1] = 4;
                baseSpellsPerDay[2] = 3;
                baseSpellsPerDay[3] = 2;
                baseSpellsPerDay[4] = 1;
                break;
            case 18:
                baseSpellsPerDay[1] = 4;
                baseSpellsPerDay[2] = 3;
                baseSpellsPerDay[3] = 2;
                baseSpellsPerDay[4] = 2;
                break;
            case 19:
                baseSpellsPerDay[1] = 4;
                baseSpellsPerDay[2] = 3;
                baseSpellsPerDay[3] = 3;
                baseSpellsPerDay[4] = 2;
                break;
            case 20:
                baseSpellsPerDay[1] = 4;
                baseSpellsPerDay[2] = 4;
                baseSpellsPerDay[3] = 3;
                baseSpellsPerDay[4] = 3;
                break;
            default:
                break;
        }
       }
      public void rangerTotalSpells(){
       totalRangerSpells[1] = baseSpellsPerDay[1] + bonusSpells[1];
       totalRangerSpells[2] = baseSpellsPerDay[2] + bonusSpells[2];
       totalRangerSpells[3] = baseSpellsPerDay[3] + bonusSpells[3];
       totalRangerSpells[4] = baseSpellsPerDay[4] + bonusSpells[4];
       }
      
       public void levelUpRanger(int lv){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 2; 
            baseFortSave = 3;
            baseRefSave = 3;
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Combat style feat(1)");
                  break;}
          case 3:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 3;
            baseWillSave = 1;
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Endurance");
            addToSpecialSkills("1st favored terrain");
                  break;}
          case 4:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            characterMods[1] = characterMods[1] +1;
            baseAttackBonus[0] = 4;
            baseFortSave = 4;
            baseRefSave = 4;
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Hunter’s bond");
                  break;}
          case 5:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 5;
            rangerSpellsBase(level);
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("2nd favored enemy");
                  break;}
          case 6:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 6;
            baseAttackBonus[1] = 1;
            baseFortSave = 5;
            baseRefSave = 5;
            baseWillSave = 2;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Combat style feat(2)");
                  break;}
          case 7:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 7;
            baseAttackBonus[1] = 2; 
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Woodland stride");
                  break;}
          case 8:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            characterMods[1] = characterMods[1] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 8;
            baseAttackBonus[1] = 3;
            baseFortSave = 6;
            baseRefSave = 6;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Swift tracker");
            addToSpecialSkills("2nd favored terrain");
              
                  break;}
          case 9:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 9;
            baseAttackBonus[1] = 4;
            baseWillSave = 3;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Evasion");
                  break;}
          case 10:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 10;
            baseAttackBonus[1] = 5;
            baseFortSave = 7;
            baseRefSave = 7;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
             addToSpecialSkills("3rd favored enemy");
             addToSpecialSkills("Combat style feat(3)");
                  break;}
          case 11:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 11;
            baseAttackBonus[1] = 6;
            baseAttackBonus[2] = 1;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Quarry");
            
                  break;}
          case 12:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            characterMods[2] = characterMods[2] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 12;
            baseAttackBonus[1] = 7;
            baseAttackBonus[2] = 2;
            baseFortSave = 8;
            baseRefSave = 8;
            baseWillSave = 4;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Camouflage");
                  break;}
          case 13:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 13;
            baseAttackBonus[1] = 8;
            baseAttackBonus[2] = 3;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("3rd favored terrain");
                  break;}
          case 14:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 14;
            baseAttackBonus[1] = 9;
            baseAttackBonus[2] = 4;
            baseFortSave = 9;
            baseRefSave = 9;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Combat style feat(4)");
                  break;}
          case 15:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 15;
            baseAttackBonus[1] = 10;
            baseAttackBonus[2] = 5;
            baseWillSave = 5;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("4th favored enemy");
                  break;}
          case 16:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            characterMods[2] = characterMods[2] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 16;
            baseAttackBonus[1] = 11;
            baseAttackBonus[2] = 6;  
            baseAttackBonus[3] = 1;
            baseFortSave = 10;
            baseRefSave = 10;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Improved evasion");
                  break;}
          case 17:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 17;
            baseAttackBonus[1] = 12;
            baseAttackBonus[2] = 7;  
            baseAttackBonus[3] = 2;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Hide in plain sight");
                  break;}
          case 18:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 18;
            baseAttackBonus[1] = 13;
            baseAttackBonus[2] = 8;  
            baseAttackBonus[3] = 3;
            baseFortSave = 11;
            baseRefSave = 11;
            baseWillSave = 6;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("4th favored terrain");
            addToSpecialSkills("combat style feat(5)");
                  break;}
          case 19:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 19;
            baseAttackBonus[1] = 14;
            baseAttackBonus[2] = 9;  
            baseAttackBonus[3] = 4;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("Improved quarry	");
                  break;}
          case 20:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            characterMods[1] = characterMods[1] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 20;
            baseAttackBonus[1] = 15;
            baseAttackBonus[2] = 10;  
            baseAttackBonus[3] = 5;
            baseFortSave = 12;
            baseRefSave = 12;
            rangerSpellsBase(level);
            rangerTotalSpells();
            LevelSavesUpdate();
            LevelAttackBonusUpdate();
            addToSpecialSkills("5th favored enemy");
            addToSpecialSkills("master hunter");
                  break;}
          
          
          }
        
    }
}