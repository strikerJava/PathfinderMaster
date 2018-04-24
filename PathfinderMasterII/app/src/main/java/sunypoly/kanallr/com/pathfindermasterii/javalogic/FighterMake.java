/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunypoly.kanallr.com.pathfindermasterii.javalogic;



/**
 *
 * @author XPS L502X
 */
public class FighterMake extends Character{
    
       public void spawnLV1FighterStr(){
        //Randommake level1
           level = 1;
        populateStats();
        strConDexArrange();
           getARace();
           basicCharacteristics();
        randomAlignment();
        randomGender(); 
        hitDie1D = 10;
        ranksPerLevelBase = 2;
        if(gender.equals("Female"))
            firstName = "Jane";
        baseFortSave = 2;
        baseRefSave = 0;
        baseWillSave = 0;
        baseAttackBonus[0] = 1;
        fortSave = 2;
        refSave = 0;
        willSave = 0;
        AttackBonus[0] = 1;
        addToSpecialSkills("Fighter Bonus Feat(1)");
        
        weaponProf = "Simple | Martial | ";
        armorProf = "Light | Medium | Heavy | Shields |";
        lastName = "The Fighter";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
    }
       
       public void levelUpFighter(){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
            baseAttackBonus[0] = 2;
            addToSpecialSkills("Bonus Feat(1)");
            addToSpecialSkills("Bravery(+1)");
            baseFortSave = 3;
            baseRefSave = 0;
            baseWillSave = 0;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 3:{
            baseAttackBonus[0] = 3;
            addToSpecialSkills("Armor training(1)");
            baseFortSave = 3;
            baseRefSave = 1;
            baseWillSave = 1;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 4:{
            baseAttackBonus[0] = 4;
            addToSpecialSkills("Bonus Feat(2)");
            baseFortSave = 4;
            baseRefSave = 1;
            baseWillSave = 1;
            characterMods[2] = characterMods[2] + 1;//  ability point add
            updateMods();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 5:{
            baseAttackBonus[0] = 5;
            addToSpecialSkills("Weapon training(1)");
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 6:{
            baseAttackBonus[0] = 6;
            baseAttackBonus[1] = 1;addToSpecialSkills("Bonus Feat(3)");
            replaceASpecialSkill("Bravery(+1)", "Bravery(+2)");
            baseFortSave = 5;
            baseRefSave = 2;
            baseWillSave = 2;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 7:{
            baseAttackBonus[0] = 7;
            baseAttackBonus[1] = 2;
            addToSpecialSkills("Armor training(2)");
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 8:{
            baseAttackBonus[0] = 8;
            baseAttackBonus[1] = 3;
            addToSpecialSkills("Bonus Feat(3)");
            baseFortSave = 6;
              LevelAttackBonusUpdate();
            characterMods[2] = characterMods[2] + 1;//  ability point add
            updateMods();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
              
                  break;}
          case 9:{
            baseAttackBonus[0] = 9;
            baseAttackBonus[1] = 4;
            addToSpecialSkills("Weapon training(or advanced weapon training)");
            baseRefSave = 3;
            baseWillSave = 3;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 10:{
            baseAttackBonus[0] = 10;
            baseAttackBonus[1] = 5;
            addToSpecialSkills("Bonus Feat(4)");
            replaceASpecialSkill("Bravery(+2)", "Bravery(+3)");
            baseFortSave = 7;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 11:{
            baseAttackBonus[0] = 11;
            baseAttackBonus[1] = 6;
            baseAttackBonus[2] = 1;
            addToSpecialSkills("Armor training(3)");
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 12:{
            baseAttackBonus[0] = 12;
            baseAttackBonus[1] = 7;
            baseAttackBonus[2] = 2;
            addToSpecialSkills("Bonus Feat(5)");
            baseFortSave = 8;
            baseRefSave = 4;
            baseWillSave = 4;
            characterMods[2] = characterMods[0] + 1;//  ability point add
            updateMods();
            LevelSavesUpdate();
        
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
              
                  break;}
          case 13:{
            baseAttackBonus[0] = 13;
            baseAttackBonus[1] = 8;
            baseAttackBonus[2] = 3;
            addToSpecialSkills("Weapon training(2)");
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 14:{
            baseAttackBonus[0] = 14;
            baseAttackBonus[1] = 9;
            baseAttackBonus[2] = 4;
             addToSpecialSkills("Bonus Feat(6)");
             replaceASpecialSkill("Bravery(+3)", "Bravery(+4)");
            baseFortSave = 9;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 15:{
            baseAttackBonus[0] = 15;
            baseAttackBonus[1] = 10;
            baseAttackBonus[2] = 4;
            addToSpecialSkills("Armor training(4)");
            baseRefSave = 5;
            baseWillSave = 5;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 16:{
            baseAttackBonus[0] = 16;
            baseAttackBonus[1] = 11;
            baseAttackBonus[2] = 6;
            baseAttackBonus[3] = 1;
            addToSpecialSkills("Bonus Feat(7)");
              LevelAttackBonusUpdate();

            baseFortSave = 10;
            characterMods[2] = characterMods[0] + 1;//  ability point add
            updateMods();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
              
                  break;}
          case 17:{
            baseAttackBonus[0] = 17;
            baseAttackBonus[1] = 12;
            baseAttackBonus[2] = 7;
            baseAttackBonus[3] = 2;
            addToSpecialSkills("Weapon training(3)");
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 18:{
            baseAttackBonus[0] = 18;
            baseAttackBonus[1] = 13;
            baseAttackBonus[2] = 8;
            baseAttackBonus[3] = 3;
            addToSpecialSkills("Bonus Feat(8)");
            replaceASpecialSkill("Bravery(+4)", "Bravery(+5)");
            baseFortSave = 11;
            baseRefSave = 6;
            baseWillSave = 6;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 19:{
            baseAttackBonus[0] = 19;
            baseAttackBonus[1] = 14;
            baseAttackBonus[2] = 9;
            baseAttackBonus[3] = 4;
            addToSpecialSkills("Armor mastery");
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          case 20:{
            baseAttackBonus[0] = 20;
            baseAttackBonus[1] = 15;
            baseAttackBonus[2] = 9;
            baseAttackBonus[3] = 5;
            addToSpecialSkills("Bonus Feat(9)");
            addToSpecialSkills("Weapon mastery");
            baseFortSave = 12;
            characterMods[2] = characterMods[0] + 1;//  ability point add
            updateMods();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
              LevelAttackBonusUpdate();
                  break;}
          
          
          }
        
    }
}   