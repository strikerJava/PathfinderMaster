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
public class PaladinMake extends Character{
     int[] totalPaladinSpells = {-99,-99,-99,-99,-99}; //level 0s are considered orisons.
    public void spawnLV1Paladin(){
        //Randommake level1
        level = 1;
        populateStats();
        charStrConCha();
        randomAlignment();
        if(!alignment.equals("LG") || !alignment.equals("LN") || !alignment.equals("LE"))
            while(!alignment.equals("LG") || !alignment.equals("LN") || !alignment.equals("LE"))
            {
                randomAlignment();
            }
        randomGender(); 
        hitDie1D = 10;
        ranksPerLevelBase = 2;
        if(gender.equals("Female"))
            firstName = "Jane";
        lastName = "The Paladin";
        baseFortSave = 2;
        baseRefSave = 0;
        baseWillSave = 2;
        baseAttackBonus[0] = 1;
        fortSave = 2;
        refSave = 0;
        willSave = 2;
        AttackBonus[0] = 1;
        addToSpecialSkills("Aura of Good");
        addToSpecialSkills("Detect Evil");
        addToSpecialSkills("Smite evil(1/day)"); 
        weaponProf = "Simple | Martial | ";
        armorProf = "Light | Medium | Heavy | Shields (- Tower) |";
        
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        bonusSpellPerDay(characterMods[5]);//Charisma for bonus
        baseSpellsPerDayPaladin(level);
        paladinTotalSpells();
        
    }
    public void baseSpellsPerDayPaladin(int lv){
        
        switch (lv) {
        //do nothing
            
            case 4:
            baseSpellsPerDay[1] = 0;
                break;
            case 5:
            baseSpellsPerDay[1] = 1;    
                break;
            case 6:
               
                break;
            case 7:
            baseSpellsPerDay[2] = 0;
                break;
            case 8:
            baseSpellsPerDay[2] = 1;   
                break;
            case 9:
            baseSpellsPerDay[1] = 2;    
                break;
            case 10:
            baseSpellsPerDay[3] = 0;   
                break;
            case 11:
            baseSpellsPerDay[3] = 1;    
                break;            
            case 12:
            baseSpellsPerDay[2] = 2;    
                break;
            case 13:
            baseSpellsPerDay[1] = 3;
            baseSpellsPerDay[4] = 0;
                break;
            case 14:
             baseSpellsPerDay[4] = 1;    
                break;       
            case 15:
            baseSpellsPerDay[3] = 2;   
                break;
            case 16:
            baseSpellsPerDay[2] = 3;    
                break;
            case 17:
            baseSpellsPerDay[1] = 4;   
                break;
            case 18:
            baseSpellsPerDay[4] = 2;   
                break;
            case 19:
            baseSpellsPerDay[3] = 3;    
                break;
            case 20:
            baseSpellsPerDay[2] = 4;
            baseSpellsPerDay[4] = 3;
                break;
            default:
                break;
        }
    }
    public void paladinTotalSpells(){
      
       baseSpellsPerDay[1] = baseSpellsPerDay[1] + bonusSpells[1];
       baseSpellsPerDay[2] = baseSpellsPerDay[2] + bonusSpells[2];
       baseSpellsPerDay[3] = baseSpellsPerDay[3] + bonusSpells[3];
       baseSpellsPerDay[4] = baseSpellsPerDay[4] + bonusSpells[4];
    
    }
        public void levelUpPaladin(int lv){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
            
            baseAttackBonus[0] = 2;
            baseFortSave = 3;
            baseWillSave = 3;
            addToSpecialSkills("Divine grace");
            addToSpecialSkills("lay on hands");
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            
                  break;}
          case 3:{
               baseAttackBonus[0] = 3;
              baseRefSave = 1;
               addToSpecialSkills("Aura of courage");
               addToSpecialSkills("divine health");
               addToSpecialSkills("Mercy(1)");
               LevelSavesUpdate();
               HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 4:{
            characterMods[5] = characterMods[5] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 4;
            baseFortSave = 4;
            baseWillSave = 4;
            addToSpecialSkills("Channel positive energy");
             replaceASpecialSkill("Smite evil(1/day)", "Smite evil(2/day)");
             baseSpellsPerDayPaladin(level);
             paladinTotalSpells();
             LevelSavesUpdate();
             HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 5:{
            baseAttackBonus[0] = 5;
            addToSpecialSkills("Divine bond");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 6:{
            baseAttackBonus[0] = 6;
            baseAttackBonus[1] = 1;
            baseFortSave = 5;
            baseRefSave = 2;
            baseWillSave = 5;
            addToSpecialSkills("Mercy(2)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 7:{
            baseAttackBonus[0] = 7;
            baseAttackBonus[1] = 2;
            replaceASpecialSkill("Smite evil(2/day)", "Smite evil(3/day)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 8:{
            characterMods[5] = characterMods[5] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 8;
            baseAttackBonus[1] = 3;
            baseFortSave = 6;
            baseWillSave = 6;
            addToSpecialSkills("Aura of resolve");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 9:{
            baseAttackBonus[0] = 9;
            baseAttackBonus[1] = 4;
            baseRefSave = 3;
            addToSpecialSkills("Mercy(3)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 10:{
            baseAttackBonus[0] = 10;
            baseAttackBonus[1] = 5;
            baseFortSave = 7;
            baseWillSave = 7;
            replaceASpecialSkill("Smite evil(3/day)", "Smite evil(4/day)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 11:{
            baseAttackBonus[0] = 11;
            baseAttackBonus[1] = 6;
            baseAttackBonus[2] = 1;
            addToSpecialSkills("Aura of justice");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 12:{
              characterMods[2] = characterMods[2] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 12;
            baseAttackBonus[1] = 7;
            baseAttackBonus[2] = 2;
            baseFortSave = 8;
            baseRefSave = 4;
            baseWillSave = 8;
            addToSpecialSkills("Mercy(4)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 13:{
            baseAttackBonus[0] = 13;
            baseAttackBonus[1] = 8;
            baseAttackBonus[2] = 3;
            replaceASpecialSkill("Smite evil(4/day)", "Smite evil(5/day)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 14:{
            baseAttackBonus[0] = 14;
            baseAttackBonus[1] = 9;
            baseAttackBonus[2] = 4;
            baseFortSave = 9;
            baseWillSave = 9;
            addToSpecialSkills("Aura of faith");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 15:{
            baseAttackBonus[0] = 15;
            baseAttackBonus[1] = 10;
            baseAttackBonus[2] = 5;
            baseRefSave = 5;
            addToSpecialSkills("Mercy(5)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 16:{
              characterMods[2] = characterMods[2] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 16;
            baseAttackBonus[1] = 11;
            baseAttackBonus[2] = 6;   
            baseAttackBonus[3] = 1;
            baseFortSave = 10;
            baseWillSave = 10;
            replaceASpecialSkill("Smite evil(5/day)", "Smite evil(6/day)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 17:{
            baseAttackBonus[0] = 17;
            baseAttackBonus[1] = 12;
            baseAttackBonus[2] = 7;   
            baseAttackBonus[3] = 2;
            addToSpecialSkills("Aura of righteousness");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 18:{
            baseAttackBonus[0] = 18;
            baseAttackBonus[1] = 13;
            baseAttackBonus[2] = 9;   
            baseAttackBonus[3] = 3;
            baseFortSave = 11;
            baseRefSave = 6;
            baseWillSave = 11;
            LevelSavesUpdate();
            addToSpecialSkills("Mercy(6)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 19:{
            baseAttackBonus[0] = 19;
            baseAttackBonus[1] = 14;
            baseAttackBonus[2] = 9;   
            baseAttackBonus[3] = 4;
            replaceASpecialSkill("Smite evil(6/day)", "Smite evil(7/day)");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 20:{
              characterMods[5] = characterMods[5] +1;
            LevelSavesUpdate();
            baseAttackBonus[0] = 20;
            baseAttackBonus[1] = 15;
            baseAttackBonus[2] = 10;   
            baseAttackBonus[3] = 5;
            baseFortSave = 12;
            baseWillSave = 12;
            addToSpecialSkills("Holy Champion");
            baseSpellsPerDayPaladin(level);
            paladinTotalSpells();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          
          
          }
        
    }
}