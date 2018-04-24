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
public class MonkMake extends Character {
    int[] fluryOfBlows = {0,0,0,0,0,0,0}; 
    int fastMove = 0;
    int monkACBonus = 0;
    int[] unarmedDamage = {1,6};
    
     public void spawnLV1Monk(){
       
        level = 1;
        hitDie1D = 8;
        ranksPerLevelBase = 4;
        
        populateStats();
        charWisConStr();
        randomAlignment();
        if(!alignment.equals("LG") || !alignment.equals("LN") || !alignment.equals("LE"))
            while(!alignment.equals("LG") || !alignment.equals("LN") || !alignment.equals("LE"))
            {
                randomAlignment();
            }
        randomGender();
        baseFortSave = 2;
        baseRefSave = 2;
        baseWillSave = 2;
        baseAttackBonus[0] = 0;
        fluryOfBlows[0] = -1;
        fluryOfBlows[1] = -1;
        fortSave = 2;
        refSave = 2;
        willSave = 2;
        AttackBonus[0] = 0;
        addToSpecialSkills("Bonus Monk Feat");
        addToSpecialSkills("Flurry of Blows");
        addToSpecialSkills("Stunning Fist");
        addToSpecialSkills("Unarmed Strike");
        addToSpecialSkills("Bonus Monk Feat"); //Adds 4 starting skills to the array of special Skills
        
        //SpecialSkills = "Bonus Monk Feet | Flurry of Blows | Stunning Fist | Unarmed Strike ";//Functions that check chart incoming
        weaponProf = "Club | Crossbows | dagger | Handaxe | Javelin | Kama | Nunchaku | Quarterstaff | sai | Shortspear | Short Sword "
                + "| Shuriken | Siangham | Sling | Spear";
        armorProf = "None";
        lastName = "The Monk";
        if(gender.equals("Female"))
            firstName = "Jane";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
    }
    public void levelUpMonk(int lv){
        level++;
        levelUpSpecifics(level);
    }
     public void levelUpSpecifics(int lv){
        switch (lv) {
        //do nothing
            
            case 2:{
                baseFortSave = 3;
                baseRefSave = 3;
                baseWillSave = 3;
                baseAttackBonus[0] = 1;
                fluryOfBlows[0] = 0;
                fluryOfBlows[1] = 0;
                addToSpecialSkills("Bonus Monk Feat");
                addToSpecialSkills("Evasion");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 3:{
                baseAttackBonus[0] = 2;
                fluryOfBlows[0] = 1;
                fluryOfBlows[1] = 1;
                fastMove = 10;
                addToSpecialSkills("Fast movement");
                addToSpecialSkills("Maneuver training");
                addToSpecialSkills("Still Mind");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 4:{
                baseFortSave = 4;
                baseRefSave = 4;
                baseWillSave = 4;
                baseAttackBonus[0] = 3;
                fluryOfBlows[0] = 2;
                fluryOfBlows[1] = 2;
                monkACBonus = 1;
                unarmedDamage[1] = 8;
                characterStats[5] =  characterStats[5] + 1;
                addToSpecialSkills("Ki Pool(magic)");
                addToSpecialSkills("Slow Fall(20ft)");
                updateMods();
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 5:{
                
                baseAttackBonus[0] = 3;
                fluryOfBlows[0] = 3;
                fluryOfBlows[1] = 3;
                addToSpecialSkills("High Jump");
                addToSpecialSkills("Purity of Body");
                LevelAttackBonusUpdate();
                 break;}
            case 6:{
                baseFortSave = 5;
                baseRefSave = 5;
                baseWillSave = 5;
                baseAttackBonus[0] = 4;
                fluryOfBlows[1] = 4;
                fluryOfBlows[2] = -1;
                fastMove = 20;
                addToSpecialSkills("High Jump");
                replaceASpecialSkill("Slow Fall(20ft)", "Slow Fall(30ft)");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 7:{
                baseAttackBonus[0] = 5;
                fluryOfBlows[0] = 5;
                fluryOfBlows[1] = 5;
                fluryOfBlows[2] = 0;
                addToSpecialSkills("Ki Pool(cold iron/silver)");
                addToSpecialSkills("Wholeness of body");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 8:{
                baseAttackBonus[0] = 6;
                baseAttackBonus[1] = 1;
                baseFortSave = 6;
                baseRefSave = 6;
                baseWillSave = 6;
                fluryOfBlows[0] = 6;
                fluryOfBlows[1] = 6;
                fluryOfBlows[2] = 1;
                fluryOfBlows[3] = 1;
                monkACBonus = 2;
                unarmedDamage[1] = 10;
                replaceASpecialSkill("Slow Fall(30ft)", "Slow Fall(40ft)");
                characterStats[5] =  characterStats[5] + 1;
                updateMods();
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 9:{
                
                fluryOfBlows[0] = 7;
                fluryOfBlows[1] = 7;
                fluryOfBlows[2] = 2;
                fluryOfBlows[3] = 2;
                fastMove = 30;
                addToSpecialSkills("Improved Evasion");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 10:{
                baseAttackBonus[0] = 7;
                baseAttackBonus[1] = 2;
                baseFortSave = 7;
                baseRefSave = 7;
                baseWillSave = 7;
                fluryOfBlows[0] = 8;
                fluryOfBlows[1] = 8;
                fluryOfBlows[2] = 3;
                fluryOfBlows[3] = 3;
                addToSpecialSkills("Bonus Monk Feat");
                addToSpecialSkills("Ki Pool(lawful)");
                replaceASpecialSkill("Slow Fall(40ft)", "Slow Fall(50ft)");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 11:{
                baseAttackBonus[0] = 8;
                baseAttackBonus[1] = 3;
                fluryOfBlows[0] = 9;
                fluryOfBlows[1] = 9;
                fluryOfBlows[2] = 4;
                fluryOfBlows[3] = 4;
                fluryOfBlows[4] = -1;
                addToSpecialSkills("Diamond soul");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}          
            case 12:{
                baseAttackBonus[0] = 9;
                baseAttackBonus[1] = 4;
                baseFortSave = 8;
                baseRefSave = 8;
                baseWillSave = 8;
                fluryOfBlows[0] = 10;
                fluryOfBlows[1] = 10;
                fluryOfBlows[2] = 5;
                fluryOfBlows[3] = 5;
                fluryOfBlows[4] = 0;
                monkACBonus = 3;
                fastMove = 40;
                unarmedDamage[0] = 2;
                unarmedDamage[1] = 6;
                addToSpecialSkills("Abundant step");
                replaceASpecialSkill("Slow Fall(50ft)", "Slow Fall(60ft)");
                characterStats[5] =  characterStats[2] + 1;
                updateMods();
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 13:{
                
                fluryOfBlows[0] = 11;
                fluryOfBlows[1] = 11;
                fluryOfBlows[2] = 6;
                fluryOfBlows[3] = 6;
                fluryOfBlows[4] = 1;
                addToSpecialSkills("Diamond soul");
                LevelSavesUpdate();
                 break;}
            case 14:{
                baseAttackBonus[0] = 10;
                baseAttackBonus[1] = 5;
                baseFortSave = 9;
                baseRefSave = 9;
                baseWillSave = 9;
                fluryOfBlows[0] = 12;
                fluryOfBlows[1] = 12;
                fluryOfBlows[2] = 7;
                fluryOfBlows[3] = 7;
                fluryOfBlows[4] = 2;
                addToSpecialSkills("Bonus Monk Feat");
                replaceASpecialSkill("Slow Fall(60ft)", "Slow Fall(70ft)");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}    
            case 15:{
                baseAttackBonus[0] = 11;
                baseAttackBonus[1] = 6;
                baseAttackBonus[2] = 1;
                fluryOfBlows[0] = 13;
                fluryOfBlows[1] = 13;
                fluryOfBlows[2] = 8;
                fluryOfBlows[3] = 8;
                fluryOfBlows[4] = 3;
                fluryOfBlows[5] = 3;
                fastMove = 50;
                addToSpecialSkills("Quivering Palm");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 16:{
                baseAttackBonus[0] = 12;
                baseAttackBonus[1] = 7;
                baseAttackBonus[2] = 2;
                baseFortSave = 10;
                baseRefSave = 10;
                baseWillSave = 10;
                fluryOfBlows[0] = 14;
                fluryOfBlows[1] = 14;
                fluryOfBlows[2] = 9;
                fluryOfBlows[3] = 9;
                fluryOfBlows[4] = 4;
                fluryOfBlows[5] = 4;
                fluryOfBlows[6] = -1;
                monkACBonus = 4;
                unarmedDamage[1] = 8;
                addToSpecialSkills("Ki Pool(Adamantine)");
                replaceASpecialSkill("Slow Fall(70ft)", "Slow Fall(80ft)");
                characterStats[5] =  characterStats[2] + 1;
                updateMods();
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 17:{
                fluryOfBlows[0] = 15;
                fluryOfBlows[1] = 15;
                fluryOfBlows[2] = 10;
                fluryOfBlows[3] = 10;
                fluryOfBlows[4] = 5;
                fluryOfBlows[5] = 5;
                fluryOfBlows[6] = 0;
                addToSpecialSkills("Timeless body");
                addToSpecialSkills("Tongue of the sun and moon");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 18:{
                baseAttackBonus[0] = 13;
                baseAttackBonus[1] = 8;
                baseAttackBonus[2] = 3;
                baseFortSave = 11;
                baseRefSave = 11;
                baseWillSave = 11;
                fluryOfBlows[0] = 16;
                fluryOfBlows[1] = 16;
                fluryOfBlows[2] = 11;
                fluryOfBlows[3] = 11;
                fluryOfBlows[4] = 6;
                fluryOfBlows[5] = 6;
                fluryOfBlows[6] = 1;
                fastMove = 60;
                addToSpecialSkills("Bonus Monk Feat");
                replaceASpecialSkill("Slow Fall(80ft)", "Slow Fall(90ft)");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 19:{
                baseAttackBonus[0] = 14;
                baseAttackBonus[1] = 9;
                baseAttackBonus[2] = 4;
                fluryOfBlows[0] = 17;
                fluryOfBlows[1] = 17;
                fluryOfBlows[2] = 12;
                fluryOfBlows[3] = 12;
                fluryOfBlows[4] = 7;
                fluryOfBlows[5] = 7;
                fluryOfBlows[6] = 2;
                addToSpecialSkills("Empty Body");
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            case 20:{
                baseAttackBonus[0] = 15;
                baseAttackBonus[1] = 10;
                baseAttackBonus[2] = 5;
                baseFortSave = 12;
                baseRefSave = 12;
                baseWillSave = 12;
                fluryOfBlows[0] = 18;
                fluryOfBlows[1] = 18;
                fluryOfBlows[2] = 13;
                fluryOfBlows[3] = 13;
                fluryOfBlows[4] = 8;
                fluryOfBlows[5] = 8;
                fluryOfBlows[6] = 3;
                monkACBonus = 5;
                unarmedDamage[1] = 10;
                addToSpecialSkills("Perfect Self");
                replaceASpecialSkill("Slow Fall(90ft)", "Slow Fall(Any Distance)");
                characterStats[5] =  characterStats[1] + 1;
                updateMods();
                LevelSavesUpdate();
                LevelAttackBonusUpdate();
                 break;}
            default:
                break;
        }
        
        
    }
}
