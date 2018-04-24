/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 
 */
package com.example.pathfinder.pathfindermaster.javalogic;


/**
 *
 * @author XPS L502X
 */
public class BardMake extends Character {
    int[] totalBardSpells = {0,0,0,0,0,0};

    
   public void spawnLV1Bard(){
       level = 1;
        hitDie1D = 8;
        ranksPerLevelBase = 6;
        
        //Randommake level1
        populateStats();
        strConDexArrange();
        randomAlignment();
        randomGender();
        baseFortSave = 0;
        baseRefSave = 2;
        baseWillSave = 2;
        baseAttackBonus[0] = 0;
        fortSave = 0;
        refSave = 2;
        willSave = 2;
        AttackBonus[0] = 1;
        addToSpecialSkills("Bardic Knowledge");
        addToSpecialSkills("Bardic Performance");
        addToSpecialSkills("Cantrips");
        addToSpecialSkills("Counter Song");
        addToSpecialSkills("Distraction");
        addToSpecialSkills("fascinate");
        addToSpecialSkills("Inspire courage(+1)");
        weaponProf = "Simple | Longsword | rapier | sap | short sword | shortbow | whip";
        armorProf = "Light | Shields( - Tower) |";
        lastName = "The Bard";
        if(gender.equals("Female"))
            firstName = "Jane";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        baseSpellsPerDay(level);
        bonusSpellPerDay(characterStats[5]);
        bardSpellsKnown(level);
        bardTotalSpells();
        
    }
    public void printBarb(){
        basicPrintOut();
        System.out.println("Gender: " + gender);
        System.out.println("Alignment:" + alignment);
        System.out.println("Hitpoints: " + hitPoints);
        System.out.println("fort save: " + fortSave);
        System.out.println("ref save: " + refSave);
        System.out.println("will save: " + willSave); 
    //    System.out.println("AttackBonus: " + AttackBonus); 
      // System.out.println("Skills:" + SpecialSkills);
        System.out.println("Weapon Proficiency:" + weaponProf);
        System.out.println("ArmorProf: " + armorProf);
        
        
        
    }
    public void baseSpellsPerDay(int lv){
        
        switch (lv) {
        //do nothing
            case 1:
                baseSpellsPerDay[0] = 1;
                break;
            case 2:
                baseSpellsPerDay[0] = 2;
                
                break;
            case 3:
                baseSpellsPerDay[0] = 3;
               
                break;
            case 4:
                baseSpellsPerDay[1] = 1;
                
                break;
            case 5:
                baseSpellsPerDay[0] = 4;
                baseSpellsPerDay[1] = 2;
                break;
            case 6:
                baseSpellsPerDay[1] = 3;
                
                break;
            case 7:
                baseSpellsPerDay[2] = 1;
                break;
            case 8:
                baseSpellsPerDay[1] = 4;
                baseSpellsPerDay[2] = 2;
                
                break;
            case 9:
                baseSpellsPerDay[0] = 5;
                baseSpellsPerDay[2] = 3;
                
                break;
            case 10:
                baseSpellsPerDay[3] = 1;
                
                break;
            case 11:
                baseSpellsPerDay[2] = 4;
                baseSpellsPerDay[3] = 2;
                break;            
            case 12:
                baseSpellsPerDay[1] = 5;
                baseSpellsPerDay[3] = 3;
                
                break;
            case 13:
                baseSpellsPerDay[4] = 1;
                break;
            case 14:
                baseSpellsPerDay[3] = 4;
                baseSpellsPerDay[4] = 2;
                
                break;       
            case 15:
                baseSpellsPerDay[2] = 5;
                baseSpellsPerDay[4] = 3;
                
                break;
            case 16:
                baseSpellsPerDay[5] = 1;
                
                break;
            case 17:
                baseSpellsPerDay[4] = 4;
                baseSpellsPerDay[5] = 2;
                break;
            case 18:
                baseSpellsPerDay[3] = 5;
                baseSpellsPerDay[5] = 3;
                break;
            case 19:
                baseSpellsPerDay[4] = 5;
                baseSpellsPerDay[5] = 4;
                break;
            case 20:
                baseSpellsPerDay[5] = 5;
                
                break;
            default:
                break;
        }
        }
    public void bardSpellsKnown(int lv){
        switch (lv) {
        //do nothing
            case 1:
                bardSpellsKnown[0] = 4;
                bardSpellsKnown[1] = 2;
                break;
            case 2:
                bardSpellsKnown[0] = 5;
                bardSpellsKnown[1] = 3;
                break;
            case 3:
                bardSpellsKnown[0] = 6;
                bardSpellsKnown[1] = 4;
                break;
            case 4:
                bardSpellsKnown[2] = 2;
                break;
            case 5:
                bardSpellsKnown[2] = 3;
                break;
            case 6:
                bardSpellsKnown[2] = 4;
                break;
            case 7:
                bardSpellsKnown[1] = 5;
                bardSpellsKnown[3] = 2;
                break;
            case 8:
                bardSpellsKnown[3] = 3;
               
                break;
            case 9:
                 bardSpellsKnown[3] = 4;
                break;
            case 10:
                bardSpellsKnown[2] = 5;
                bardSpellsKnown[4] = 2;
                break;
            case 11:
                bardSpellsKnown[1] = 6;
                bardSpellsKnown[4] = 3;
                break;            
            case 12:
                bardSpellsKnown[4] = 4;
                break;
            case 13:
                bardSpellsKnown[3] = 5;
                bardSpellsKnown[5] = 2;
                break;
            case 14:
                bardSpellsKnown[2] = 6;
                bardSpellsKnown[5] = 3;
                break;       
            case 15:
                bardSpellsKnown[5] = 4;
                break;
            case 16:
                bardSpellsKnown[4] = 5;
                bardSpellsKnown[6] = 2;
                break;
            case 17:
                bardSpellsKnown[3] = 6;
                bardSpellsKnown[6] = 3;
                break;
            case 18:
                bardSpellsKnown[6] = 4;
                break;
            case 19:
                bardSpellsKnown[5] = 5;
                break;
            case 20:
                bardSpellsKnown[4] = 6;
                bardSpellsKnown[6] = 5;
                break;
            default:
                break;
        }
    }
    public void bardTotalSpells(){
       totalBardSpells[0] = baseSpellsPerDay[0] + bonusSpells[0];
       totalBardSpells[1] = baseSpellsPerDay[1] + bonusSpells[1];
       totalBardSpells[2] = baseSpellsPerDay[2] + bonusSpells[2];
       totalBardSpells[3] = baseSpellsPerDay[3] + bonusSpells[3];
       totalBardSpells[4] = baseSpellsPerDay[4] + bonusSpells[4];
       totalBardSpells[5] = baseSpellsPerDay[5] + bonusSpells[5];
       
    }
    
    public void levelUpBard(int lv){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
              baseAttackBonus[0] = 1;
              baseRefSave = 3;
              baseWillSave = 3;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Versatile performance(1)");
              addToSpecialSkills("well-versed");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 3:{
               baseAttackBonus[0] = 2;
               baseFortSave = 1;
               LevelSavesUpdate();
               bardSpellsKnown(level);
               baseSpellsPerDay(level);
               bardTotalSpells();
               addToSpecialSkills("Inspire competence(+2)");
               HitDieUpdate(hitDie1D, characterMods[2]);
               
                  break;}
          case 4:{
              characterStats[5] = characterStats[5] + 1;
              updateMods();
               bonusSpellPerDay(characterStats[5]);
              baseAttackBonus[0] = 3;
              baseRefSave = 4;
              baseWillSave = 4;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 5:{
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              replaceASpecialSkill("Inspire courage(+1)", "Inspire courage(+2)");
              addToSpecialSkills("Lore Master (1/Day)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 6:{
              baseAttackBonus[0] = 4;
              baseFortSave = 2;
              baseRefSave = 5;
              baseWillSave = 5;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Suggestion");
              addToSpecialSkills("Versatile Performance(2)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 7:{
              baseAttackBonus[0] = 5;
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              replaceASpecialSkill("Inspire competence(+2)", "Inspire competence(+3)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 8:{
              characterStats[5] = characterStats[5] + 1;
              updateMods();
               bonusSpellPerDay(characterStats[5]);
              baseAttackBonus[0] = 6;
              baseAttackBonus[1] = 1;
              baseRefSave = 6;
              baseWillSave = 6;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Dirge of doom");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 9:{
              baseFortSave = 3;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Inspire greatness");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 10:{
              baseAttackBonus[0] = 7;
              baseAttackBonus[1] = 2;
              baseRefSave = 7;
              baseWillSave = 7;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Jack-Of-All-Trades");
              addToSpecialSkills("Versatile performance(3)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 11:{
              baseAttackBonus[0] = 8;
              baseAttackBonus[1] = 3;
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              replaceASpecialSkill("Inspire competence(+3)", "Inspire competence(+4)");
              replaceASpecialSkill("Inspire courage(+2)", "Inspire courage(+3)");
              replaceASpecialSkill("Lore Master (1/Day)", "Lore Master (2/Day)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 12:{
              characterStats[2] = characterStats[2] + 1;
              updateMods();
              baseAttackBonus[0] = 9;
              baseAttackBonus[1] = 4;
              baseFortSave = 4;
              baseRefSave = 8;
              baseWillSave = 8;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Soothing performance");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 13:{
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 14:{
              baseAttackBonus[0] = 10;
              baseAttackBonus[1] = 5;
              baseRefSave = 9;
              baseWillSave = 9;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();addToSpecialSkills("Frightening tune");
              addToSpecialSkills("Versatile performance(4)");
              HitDieUpdate(hitDie1D, characterMods[2]);
              
                  break;}
          case 15:{
              baseAttackBonus[0] = 11;
              baseAttackBonus[1] = 6;
              baseAttackBonus[2] = 1;
              baseFortSave = 5;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              replaceASpecialSkill("Inspire competence(+4)", "Inspire competence(+5)");
              addToSpecialSkills("Inspire Heroics");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 16:{
              characterStats[2] = characterStats[2] + 1;
              updateMods();
              baseAttackBonus[0] = 12;
              baseAttackBonus[1] = 7;
              baseAttackBonus[2] = 2;
              baseRefSave = 10;
              baseWillSave = 10;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 17:{
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              replaceASpecialSkill("Inspire courage(+3)", "Inspire courage(+4)");
              replaceASpecialSkill("Lore Master (2/Day)", "Lore Master (3/Day)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 18:{
              baseAttackBonus[0] = 13;
              baseAttackBonus[1] = 8;
              baseAttackBonus[2] = 3;
              baseFortSave = 6;
              baseRefSave = 11;
              baseWillSave = 11;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Mass suggestion");
              addToSpecialSkills("Versatile performance(5)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 19:{
              baseAttackBonus[0] = 14;
              baseAttackBonus[1] = 9;
              baseAttackBonus[2] = 4;
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              replaceASpecialSkill("Inspire competence(+5)", "Inspire competence(+6)");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 20:{
              characterStats[1] = characterStats[1] + 1;
              updateMods();
              baseAttackBonus[0] = 15;
              baseAttackBonus[1] = 10;
              baseAttackBonus[2] = 5;
              baseRefSave = 12;
              baseWillSave = 12;
              LevelSavesUpdate();
              bardSpellsKnown(level);
              baseSpellsPerDay(level);
              bardTotalSpells();
              addToSpecialSkills("Deadly performance");
              HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          
          
          }
        
    }
    }   
