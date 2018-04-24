/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pathfinder.pathfindermaster.javalogic;

import java.util.Arrays;

/**
 *
 * @author XPS L502X
 */
public class DruidMake extends Character{
     int[] totalDruidSpells = {0,0,0,0,0,0,0,0,0,0}; //level 0s are considered orisons. 
    
   public void spawnLV1Druid(){
        //Randommake level1
        level = 1;
        populateStats();
        charWisConStr();
        randomAlignment();
        if(!alignment.equals("NG") || !alignment.equals("NN") || !alignment.equals("NE"))
            while(!alignment.equals("NG") || !alignment.equals("NN") || !alignment.equals("NE"))
            {
                randomAlignment();
            }
    //allignment must be within one step of god's. 
        //Will come back to make godAlignmentSort() or something
        randomGender(); 
        hitDie1D = 8;
        ranksPerLevelBase = 4;
        if(gender.equals("Female"))
            firstName = "Jane";
        baseFortSave = 2;
        baseRefSave = 0;
        baseWillSave = 2;
        baseAttackBonus[0] = 0;
        fortSave = 2;
        refSave = 0;
        willSave = 2;
        AttackBonus[0] = 0;
        addToSpecialSkills("Nature Bond");
        addToSpecialSkills("Nature Sense");
        addToSpecialSkills("Wild Empathy");
        addToSpecialSkills("Orisons");
        weaponProf = "Club | Dagger | Dart | Quarterstaff | Scimitar | Natural Weapons |"
                + "Scyth | Sickle | Shortspear | Sling | Spear"; //Diety function
        armorProf = "Light[NM] | Medium[NM] | Shields[NM] (- Tower) |"; //NM == non metal
        lastName = "The Druid";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        baseSpellsPerDayDruid(level);
        bonusSpellPerDay(characterMods[4]);//wisdom for bonus
        druidTotalSpells();
        
    }
       public void printCleric(){
        basicPrintOut();
        System.out.println("Gender: " + gender);
        System.out.println("Alignment:" + alignment);
        System.out.println("Hitpoints: " + hitPoints);
        System.out.println("fort save: " + fortSave);
        System.out.println("ref save: " + refSave);
        System.out.println("will save: " + willSave); 
        System.out.println("AttackBonus: " + AttackBonus); 
        System.out.println("Skills:" + SpecialSkills);
        System.out.println("Weapon Proficiency:" + weaponProf);
        System.out.println("ArmorProf: " + armorProf);
        
        
        
    }
         public void baseSpellsPerDayDruid(int lv){
        
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
                baseSpellsPerDay[3] = 4;
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
         
   
    public void druidTotalSpells(){
       totalDruidSpells[0] = baseSpellsPerDay[0] + bonusSpells[0];
       totalDruidSpells[1] = baseSpellsPerDay[1] + bonusSpells[1];
       totalDruidSpells[2] = baseSpellsPerDay[2] + bonusSpells[2];
       totalDruidSpells[3] = baseSpellsPerDay[3] + bonusSpells[3];
       totalDruidSpells[4] = baseSpellsPerDay[4] + bonusSpells[4];
       totalDruidSpells[5] = baseSpellsPerDay[5] + bonusSpells[5];
       totalDruidSpells[6] = baseSpellsPerDay[6] + bonusSpells[6];
       totalDruidSpells[7] = baseSpellsPerDay[7] + bonusSpells[7];
       totalDruidSpells[8] = baseSpellsPerDay[8] + bonusSpells[8];
       totalDruidSpells[9] = baseSpellsPerDay[9] + bonusSpells[9];
    }
    public void levelUpDruid(int lv){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
              baseAttackBonus[0] = 1;
              baseFortSave = 3;
              baseWillSave = 3;
             addToSpecialSkills("Woodland stride");
             LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 3:{
              baseAttackBonus[0] = 2;
              baseRefSave = 1;
              addToSpecialSkills("Trackless step");
               LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 4:{
              characterMods[4] = characterMods[4] + 1;
              updateMods();
              bonusSpellPerDay(characterMods[4]);
              baseAttackBonus[0] = 3;
              baseFortSave = 4;
              baseWillSave = 4;
             addToSpecialSkills("Resist nature’s lure");
             addToSpecialSkills("Wild shape(1/day)");
              LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 5:{
              HitDieUpdate(hitDie1D, characterMods[2]);
              baseSpellsPerDayDruid(level);
              druidTotalSpells();
                  break;}
          case 6:{
              baseAttackBonus[0] = 4;
              baseFortSave = 5;
              baseRefSave = 2;
              baseWillSave = 5;
              replaceASpecialSkill("Wild shape(1/day)", "Wild shape(2/day)");
               LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 7:{
             baseAttackBonus[0] = 5;
              LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 8:{
              characterMods[4] = characterMods[4] + 1;
              updateMods();
               bonusSpellPerDay(characterMods[4]);
              baseAttackBonus[0] = 6;
              baseAttackBonus[1] = 1;
              
              baseFortSave = 6;
              baseWillSave = 6;
              replaceASpecialSkill("Wild shape(2/day)", "Wild shape(3/day)");
               LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              baseSpellsPerDayDruid(level);
              druidTotalSpells();
                  break;}
          case 9:{
              baseRefSave = 3;
              addToSpecialSkills("Venom immunity");
               LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 10:{
              baseAttackBonus[0] = 7;
              baseAttackBonus[1] = 2;
              baseFortSave = 7;
              baseWillSave = 7;
             replaceASpecialSkill("Wild shape(3/day)", "Wild shape(4/day)");
              LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 11:{
             baseAttackBonus[0] = 8;
              baseAttackBonus[1] = 3;
               LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 12:{
            characterMods[2] = characterMods[2] + 1;  
            updateMods();
             bonusSpellPerDay(characterMods[4]);
            baseAttackBonus[0] = 9;
            baseAttackBonus[1] = 4;
            baseFortSave = 8;
            baseRefSave = 4;
            baseWillSave = 8;
            replaceASpecialSkill("Wild shape(4/day)", "Wild shape(5/day)");
             LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 13:{
              addToSpecialSkills("A thousand faces");
               LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 14:{
              baseAttackBonus[0] = 10;
              baseAttackBonus[1] = 5;
              baseFortSave = 9;
              baseWillSave = 9;
              replaceASpecialSkill("Wild shape(5/day)", "Wild shape(6/day)");
               LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 15:{
              baseAttackBonus[0] = 11;
              baseAttackBonus[1] = 6;
              baseAttackBonus[2] = 1;
              baseRefSave = 5;
             addToSpecialSkills("Timeless body");
              LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 16:{ 
            characterMods[2] = characterMods[2] + 1;
            updateMods();
             bonusSpellPerDay(characterMods[4]);
            baseAttackBonus[0] = 12;
            baseAttackBonus[1] = 7;
            baseAttackBonus[2] = 2;  
           
            baseFortSave = 10;
            baseWillSave = 10;
            replaceASpecialSkill("Wild shape(6/day)", "Wild shape(7/day)");
             LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 17:{
              HitDieUpdate(hitDie1D, characterMods[2]);
              baseSpellsPerDayDruid(level);
              druidTotalSpells();
                  break;}
          case 18:{
            baseAttackBonus[0] = 13;
            baseAttackBonus[1] = 8;
            baseAttackBonus[2] = 3;
            baseFortSave = 11;
            baseRefSave = 6;
            baseWillSave = 11;
            replaceASpecialSkill("Wild shape(7/day)", "Wild shape(8/day)");
             LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 19:{
            baseAttackBonus[0] = 14;
            baseAttackBonus[1] = 9;
            baseAttackBonus[2] = 4;
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          case 20:{
            characterMods[1] = characterMods[1] + 1;
            updateMods();
             bonusSpellPerDay(characterMods[4]);
            baseAttackBonus[0] = 15;
            baseAttackBonus[1] = 10;
            baseAttackBonus[2] = 5;
            
            baseFortSave = 12;
            baseWillSave = 12;
            replaceASpecialSkill("Wild shape(8/day)", "Wild shape(at will)");
             LevelSavesUpdate();
            LevelAttackBonusUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseSpellsPerDayDruid(level);
            druidTotalSpells();
                  break;}
          
          
          }
        
    }
}
