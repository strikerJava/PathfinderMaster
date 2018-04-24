/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

/**
 *
 * @author kanallrt265
 */
public class BarbarianMake extends Character{
    String badAlignmentOne = "LG";
    String badAlignmentTwo = "LN";
    String badAlignmentThree = "LE";//redundant?
    int hitDie1D = 12;
    int ranksPerLevelBase = 4;
    int fastMove = 10;
    
    public void spawnLV1Barbarian(){
        //Randommake level1
        populateStats();
        strConDexArrange();
        randomAlignment();
        if(alignment.equals("LG") || alignment.equals("LN") || alignment.equals("LE"))
            while(alignment.equals("LG") || alignment.equals("LN") || alignment.equals("LE"))
            {
                randomAlignment();
            }
        randomGender();
        level = 1;
        baseFortSave = 2;
        baseRefSave = 0;
        baseWillSave = 0;
        baseAttackBonus[0] = 1;
        fortSave = 2;
        refSave = 0;
        willSave = 0;
        AttackBonus[0] = 1;
        //SpecialSkills = "Fast Movement | Rage | ";//will add to bottom of character sheet by going up until the |
        addToSpecialSkills("Fast Movement");
        addToSpecialSkills("Rage");
        weaponProf = "Simple | Martial | ";
        armorProf = "Light | Medium | Heavy | Shields( - Tower) |";
        lastName = "The Barbarian";
        if(gender.equals("Female"))
            firstName = "Jane";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
    }

    
   
   public void levelUpBarb(){
        level++;
        levelUpSpecifics(level);
    }
    public void levelUpSpecifics(int lv){
          switch (lv) {
          case 2:{
            baseAttackBonus[0] = 2;
            addToSpecialSkills("Rage Power(1)");
            addToSpecialSkills("Uncanny Dodge");
            baseFortSave = 3;
            baseRefSave = 0;
            baseWillSave = 0;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 3:{
                    baseAttackBonus[0] = 3;
            addToSpecialSkills("Trap Sense(+1)");
            baseFortSave = 3;
            baseRefSave = 1;
            baseWillSave = 1;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);   
                  break;}
          case 4:{
           baseAttackBonus[0] = 4;
        addToSpecialSkills("Rage Power(2)");
        //SpecialSkills = SpecialSkills.concat("Rage Power(2) | ");
        baseFortSave = 4;
        baseRefSave = 1;
        baseWillSave = 1;
        characterMods[2] = characterMods[2] + 1;//  ability point add
        updateMods();
        LevelSavesUpdate();
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 5:{
            baseAttackBonus[0] = 5;
            addToSpecialSkills("Improved uncanny Dodge");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 6:{
            baseAttackBonus[0] = 6;
            baseAttackBonus[1] = 1;
            addToSpecialSkills("Rage Power(3)");
            replaceASpecialSkill("Trap Sense(+1)", "Trap Sense(+2)");
            baseFortSave = 5;
            baseRefSave = 2;
            baseWillSave = 2;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 7:{
            baseAttackBonus[0] = 7;
            baseAttackBonus[1] = 2;
            addToSpecialSkills("Damage Reduction(1/-)");
            //SpecialSkills = SpecialSkills.concat("Damage Reduction (1/-) |  ");
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 8:{
            baseAttackBonus[0] = 8;
            baseAttackBonus[1] = 3;
            addToSpecialSkills("Rage Power(4)");
            baseFortSave = 6;
            characterMods[2] = characterMods[2] + 1;//  ability point add
            updateMods();
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 9:{
            baseAttackBonus[0] = 9;
            baseAttackBonus[1] = 4;
            replaceASpecialSkill("Trap Sense(+2)", "Trap Sense(+3)");
            baseRefSave = 3;
            baseWillSave = 3;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]); 
                  break;}
          case 10:{
            baseAttackBonus[0] = 10;
        baseAttackBonus[1] = 5;
        addToSpecialSkills("Rage Power(5)");
       replaceASpecialSkill("Damage Reduction(1/-)", "Damage Reduction(2/-)");
       
        baseFortSave = 7;
        LevelSavesUpdate();
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 11:{
            baseAttackBonus[0] = 11;
        baseAttackBonus[1] = 6;
        baseAttackBonus[2] = 1;
        addToSpecialSkills("Greater Rage");
        //SpecialSkills = SpecialSkills.concat("Greater Rage | ");
        LevelSavesUpdate();
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 12:{
            baseAttackBonus[0] = 12;
        baseAttackBonus[1] = 7;
        baseAttackBonus[2] = 2;
        addToSpecialSkills("Rage Power(6)");
        replaceASpecialSkill("Trap Sense(+3)", "Trap Sense(+4)");
       
        baseFortSave = 8;
        baseRefSave = 4;
        baseWillSave = 4;
        characterMods[2] = characterMods[0] + 1;//  ability point add
        updateMods();
        LevelSavesUpdate();
        
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 13:{
            baseAttackBonus[0] = 13;
        baseAttackBonus[1] = 8;
        baseAttackBonus[2] = 3;
        replaceASpecialSkill("Damage Reduction(2/-)", "Damage Reduction(3/-)");
        
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 14:{
            baseAttackBonus[0] = 14;
        baseAttackBonus[1] = 9;
        baseAttackBonus[2] = 4;
        addToSpecialSkills("Indomitable Will");
        addToSpecialSkills("Rage Power(7)");
        
        baseFortSave = 9;
        LevelSavesUpdate();
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 15:{
            baseAttackBonus[0] = 15;
            baseAttackBonus[1] = 10;
            baseAttackBonus[2] = 4;
            replaceASpecialSkill("Trap Sense(+4)", "Trap Sense(+5)");
        
            baseRefSave = 5;
            baseWillSave = 5;
            LevelSavesUpdate();
            HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 16:{
           baseAttackBonus[0] = 16;
        baseAttackBonus[1] = 11;
        baseAttackBonus[2] = 6;
        baseAttackBonus[3] = 1;
        addToSpecialSkills("Rage Power(8)");
        replaceASpecialSkill("Damage Reduction(3/-)", "Damage Reduction(4/-)");
        
        baseFortSave = 10;
        characterMods[2] = characterMods[0] + 1;//  ability point add
        updateMods();
        LevelSavesUpdate();
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 17:{
            baseAttackBonus[0] = 17;
        baseAttackBonus[1] = 12;
        baseAttackBonus[2] = 7;
        baseAttackBonus[3] = 2;
        addToSpecialSkills("Tireless Rage");
        
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 18:{
            baseAttackBonus[0] = 18;
        baseAttackBonus[1] = 13;
        baseAttackBonus[2] = 8;
        baseAttackBonus[3] = 3;
        addToSpecialSkills("Rage Power(9)");
        replaceASpecialSkill("Trap Sense(+5)", "Trap Sense(+6)");
       
        baseFortSave = 11;
        baseRefSave = 6;
        baseWillSave = 6;
        LevelSavesUpdate();
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 19:{
            baseAttackBonus[0] = 19;
        baseAttackBonus[1] = 14;
        baseAttackBonus[2] = 9;
        baseAttackBonus[3] = 4;
        replaceASpecialSkill("Damage Reduction(4/-)", "Damage Reduction(5/-)");
        
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          case 20:{
            baseAttackBonus[0] = 20;
        baseAttackBonus[1] = 15;
        baseAttackBonus[2] = 9;
        baseAttackBonus[3] = 5;
        addToSpecialSkills("Mighty Rage");
        addToSpecialSkills("Rage Power(10)");
        
        baseFortSave = 12;
        characterMods[2] = characterMods[0] + 1;//  ability point add
        updateMods();
        LevelSavesUpdate();
        HitDieUpdate(hitDie1D, characterMods[2]);
                  break;}
          
          
          }
        
    }
    
    
    public void printBarb(){//depreciated
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

}   
