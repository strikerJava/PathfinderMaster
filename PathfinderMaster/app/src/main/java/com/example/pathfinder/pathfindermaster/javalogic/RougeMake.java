/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pathfinder.pathfindermaster.javalogic;

/**
 *
 * @author XPS L502X
 */
public class RougeMake extends Character{
     public void spawnLV1Rouge(){
        //Randommake level1
        level = 1;
        populateStats();
        dexConStrArrange2();
        randomAlignment();
        randomGender(); 
        hitDie1D = 8;
        ranksPerLevelBase = 8;
        if(gender.equals("Female"))
            firstName = "Jane";
        lastName = "The Rouge";
        baseFortSave = 0;
        baseRefSave = 2;
        baseWillSave = 0;
        baseAttackBonus[0] = 0;
        fortSave = 0;
        refSave = 2;
        willSave = 0;
        AttackBonus[0] = 0;
        addToSpecialSkills("Sneak attack(+1d6)");
        addToSpecialSkills("Trapfinding");
       
        weaponProf = "| Simple | Hand Crossbows | Rapier | Sap | Shortbow | Short Sword  ";
        armorProf = "| Light |";
        
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
    }
       

       
       
        public void levelUpRouge(int lv){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 1;
            baseRefSave = 3;
            LevelSavesUpdate();
            addToSpecialSkills("Evasion");
            addToSpecialSkills("Rogue talent(1)");
                  break;}
          case 3:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 2; 
            baseFortSave = 1;
            baseWillSave = 1;
            LevelSavesUpdate();
            replaceASpecialSkill("Sneak attack(+1d6)", "Sneak attack(+2d6)");
            addToSpecialSkills("Trap Sense(+1)");
                  break;}
          case 4:{
            characterMods[1] = characterMods[1] + 1;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 3;
            baseRefSave = 4;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(2)");
            addToSpecialSkills("uncanny dodge");
           
            
                  break;}
          case 5:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            replaceASpecialSkill("Sneak attack(+2d6)", "Sneak attack(+3d6)");
                  break;}
          case 6:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 4;
            baseFortSave = 2;
            baseRefSave = 5;
            baseWillSave = 2;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(3)");
            replaceASpecialSkill("Trap Sense(+1)", "Trap Sense(+2)");
                  break;}
          case 7:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 5;
            LevelSavesUpdate();
            replaceASpecialSkill("Sneak attack(+3d6)", "Sneak attack(+4d6)");
                  break;}
          case 8:{
            characterMods[1] = characterMods[1] + 1;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 6;
            baseAttackBonus[1] = 1;
            baseRefSave = 6;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(4)");
            addToSpecialSkills("Improved uncanny dodge");
              
                  break;}
          case 9:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            replaceASpecialSkill("Sneak attack(+4d6)", "Sneak attack(+5d6)");
            replaceASpecialSkill("Trap Sense(+2)", "Trap Sense(+3)");
                  break;}
          case 10:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 7;
            baseAttackBonus[1] = 2;
            baseFortSave = 3;
            baseRefSave = 7;
            baseWillSave = 3;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(5)");
            addToSpecialSkills("Advanced Talents");
                  break;}
          case 11:{
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 8;
            baseAttackBonus[1] = 3;
            LevelSavesUpdate();
            replaceASpecialSkill("Sneak attack(+5d6)", "Sneak attack(+6d6)");
                  break;}
          
          case 12:{
            characterMods[2] = characterMods[2] + 1;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
            baseAttackBonus[0] = 9;
            baseAttackBonus[1] = 4;
            baseFortSave = 4;
            baseRefSave = 8;
            baseWillSave = 4;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(6)");
            replaceASpecialSkill("Trap Sense(+3)", "Trap Sense(+4)");
                  break;}
          case 13:{
            HitDieUpdate(hitDie1D, characterMods[2]);  
            replaceASpecialSkill("Sneak attack(+6d6)", "Sneak attack(+7d6)");
            
                  break;}
          case 14:{
            HitDieUpdate(hitDie1D, characterMods[2]);  
            baseAttackBonus[0] = 10;
            baseAttackBonus[1] = 5;
            baseRefSave = 9;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(7)");
                  break;}
          case 15:{
            HitDieUpdate(hitDie1D, characterMods[2]);  
            baseAttackBonus[0] = 11;
            baseAttackBonus[1] = 6;
            baseAttackBonus[0] = 1;
            baseFortSave = 5;
            baseWillSave = 5;
            LevelSavesUpdate();
            replaceASpecialSkill("Sneak attack(+7d6)", "Sneak attack(+8d6)");
            replaceASpecialSkill("Trap Sense(+4)", "Trap Sense(+5)");
                  break;}
          case 16:{
            characterMods[2] = characterMods[2] + 1;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);  
            baseAttackBonus[0] = 12;
            baseAttackBonus[1] = 7;
            baseAttackBonus[0] = 2;
            baseRefSave = 10;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(8)");  
                  break;}
          case 17:{
            HitDieUpdate(hitDie1D, characterMods[2]);  
            replaceASpecialSkill("Sneak attack(+8d6)", "Sneak attack(+9d6)");  
                  break;}
          case 18:{
            HitDieUpdate(hitDie1D, characterMods[2]);  
            baseAttackBonus[0] = 13;
            baseAttackBonus[1] = 8;
            baseAttackBonus[0] = 3;
            baseFortSave = 6;
            baseRefSave = 2;
            baseWillSave = 6;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(9)");
            replaceASpecialSkill("Trap Sense(+5)", "Trap Sense(+6)");
                  break;}
          case 19:{
            HitDieUpdate(hitDie1D, characterMods[2]);  
            baseAttackBonus[0] = 14;
            baseAttackBonus[1] = 9;
            baseAttackBonus[0] = 4;
            LevelSavesUpdate();
            replaceASpecialSkill("Sneak attack(+9d6)", "Sneak attack(+10d6)");
                  break;}
          case 20:{
            characterMods[1] = characterMods[1] + 1;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);  
            baseAttackBonus[0] = 15;
            baseAttackBonus[1] = 10;
            baseAttackBonus[0] = 5;
            baseRefSave = 12;
            LevelSavesUpdate();
            addToSpecialSkills("Rogue talent(10)");
            addToSpecialSkills("Master Strike");
                  break;}
          
          
          }
        
    }
}