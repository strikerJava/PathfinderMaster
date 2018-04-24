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
public class ClericMake extends Character{
    int[] totalClericSpells = {0,0,0,0,0,0,0,0,0,0}; //level 0s are considered orisons. 
    int[] domainSpell = {0,0,0,0,0,0,0,0,0,0};
    ///0 level spells with a limited amount of casts
    

    public void spawnLV1Cleric(){
        //Randommake level1
        level = 1;
        populateStats();
        charWisConStr();
        randomAlignment();//allignment must be within one step of god's. 
        //Will come back to make godAlignmentSort() or something
        randomGender(); 
        hitDie1D = 8;
        ranksPerLevelBase = 2;
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
        addToSpecialSkills("Aura");
        addToSpecialSkills("Channel Energy(1D6)");
        addToSpecialSkills("Domains");
        addToSpecialSkills("Orisons");
        weaponProf = "Simple | Favored weapon of Diety | "; //Diety function
        armorProf = "Light | Medium | Shields (- Tower) |";
        lastName = "The Cleric";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        baseSpellsPerDayCleric(level);
        domainSpellsAmount(level);
        bonusSpellPerDay(characterMods[4]);
        clericTotalSpells();
        
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
         public void baseSpellsPerDayCleric(int lv){
        
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
                baseSpellsPerDay[1] = 3;
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
         
    public void domainSpellsAmount( int lv){
        switch(lv){
            case 1: domainSpell[1] = 1;
                    break;
            case 3: domainSpell[2] = 1;
                    break;
            case 5: domainSpell[3] = 1;
                    break;
            case 7: domainSpell[4] = 1;
                    break;
            case 9: domainSpell[5] = 1;
                    break;
            case 11: domainSpell[6] = 1;
                    break;
            case 13: domainSpell[7] = 1;
                    break;
            case 15: domainSpell[8] = 1;
                    break;
            case 17: domainSpell[9] = 1;
                    break;
            default: break;
            
        }
        
    }
        public void clericTotalSpells(){
       totalClericSpells[0] = baseSpellsPerDay[0] + bonusSpells[0];
       totalClericSpells[1] = baseSpellsPerDay[1] + bonusSpells[1];
       totalClericSpells[2] = baseSpellsPerDay[2] + bonusSpells[2];
       totalClericSpells[3] = baseSpellsPerDay[3] + bonusSpells[3];
       totalClericSpells[4] = baseSpellsPerDay[4] + bonusSpells[4];
       totalClericSpells[5] = baseSpellsPerDay[5] + bonusSpells[5];
       totalClericSpells[6] = baseSpellsPerDay[6] + bonusSpells[6];
       totalClericSpells[7] = baseSpellsPerDay[7] + bonusSpells[7];
       totalClericSpells[8] = baseSpellsPerDay[8] + bonusSpells[8];
       totalClericSpells[9] = baseSpellsPerDay[9] + bonusSpells[9];
        }
        
         public void levelUpCleric(int lv){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
            baseAttackBonus[0] = 1;
            baseFortSave = 3;
            baseWillSave = 3;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 3:{
            baseAttackBonus[0] = 2;
            baseRefSave = 1;
            domainSpellsAmount(level);
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            replaceASpecialSkill("Channel Energy(1D6)", "Channel Energy(2D6)");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 4:{
            characterMods[4] = characterMods[4] + 1;
            updateMods();
            bonusSpellPerDay(characterMods[4]);
            baseAttackBonus[0] = 3;
            baseFortSave = 4;
            baseWillSave = 4;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 5:{
              domainSpellsAmount(level);
              baseSpellsPerDayCleric(level);
              clericTotalSpells();
              replaceASpecialSkill("Channel Energy(2D6)", "Channel Energy(3D6)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 6:{
            baseAttackBonus[0] = 4;
            baseFortSave = 5;
            baseRefSave = 2;
            baseWillSave = 5;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 7:{
            baseAttackBonus[0] = 5;
            domainSpellsAmount(level);
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            replaceASpecialSkill("Channel Energy(3D6)", "Channel Energy(4D6)");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 8:{
            characterMods[4] = characterMods[4] + 1;
            updateMods();
            bonusSpellPerDay(characterMods[4]);
            baseAttackBonus[0] = 6;  
            baseAttackBonus[1] = 1; 
            baseFortSave = 6;
            baseWillSave = 6;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 9:{
            baseRefSave = 3;
            domainSpellsAmount(level);
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            replaceASpecialSkill("Channel Energy(4D6)", "Channel Energy(5D6)");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 10:{
            baseAttackBonus[0] = 7;  
            baseAttackBonus[1] = 2;
            baseFortSave = 7;
            baseWillSave = 7;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 11:{
            baseAttackBonus[0] = 8;  
            baseAttackBonus[1] = 3;  
            domainSpellsAmount(level);
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            replaceASpecialSkill("Channel Energy(5D6)", "Channel Energy(6D6)");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 12:{
            characterMods[2] = characterMods[2] + 1;
            updateMods();
            baseAttackBonus[0] = 9;  
            baseAttackBonus[1] = 4;
            baseFortSave = 8;
            baseRefSave = 4;
            baseWillSave = 8;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 13:{
              domainSpellsAmount(level);
              baseSpellsPerDayCleric(level);
              clericTotalSpells();
              replaceASpecialSkill("Channel Energy(6D6)", "Channel Energy(7D6)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 14:{
            baseAttackBonus[0] = 10;  
            baseAttackBonus[1] = 5;
            baseFortSave = 9;
            baseWillSave = 9;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
            
                  break;}
          case 15:{
            baseAttackBonus[0] = 11;  
            baseAttackBonus[1] = 6;
            baseAttackBonus[2] = 1;  
            baseRefSave = 5;
            domainSpellsAmount(level);
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            replaceASpecialSkill("Channel Energy(7D6)", "Channel Energy(8D6)");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 16:{
            characterMods[2] = characterMods[2] + 1;
            updateMods();
            baseAttackBonus[0] = 12;  
            baseAttackBonus[1] = 7;
            baseAttackBonus[2] = 2; 
             baseFortSave = 10;
             baseWillSave = 10;
             baseSpellsPerDayCleric(level);
             clericTotalSpells();
             HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 17:{
              domainSpellsAmount(level);
              baseSpellsPerDayCleric(level);
              clericTotalSpells();
              replaceASpecialSkill("Channel Energy(8D6)", "Channel Energy(9D6)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 18:{
            baseAttackBonus[0] = 13;  
            baseAttackBonus[1] = 8;
            baseAttackBonus[2] = 3;
            baseFortSave = 11;
            baseRefSave = 6;
            baseWillSave = 11;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 19:{
            baseAttackBonus[0] = 14;  
            baseAttackBonus[1] = 9;
            baseAttackBonus[2] = 4;   
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            replaceASpecialSkill("Channel Energy(9D6)", "Channel Energy(10D6)");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 20:{
            characterMods[0] = characterMods[0] + 1;
            updateMods();
            baseAttackBonus[0] = 15;  
            baseAttackBonus[1] = 10;
            baseAttackBonus[2] = 5;
            baseFortSave = 12;
            baseWillSave = 12;
            baseSpellsPerDayCleric(level);
            clericTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          
          
          }
        
    }
}   
