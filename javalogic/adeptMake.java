/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;
//This class needs a spell database created for it. 
//Class has it's own specific sub database of what appears to be cleric spells
/**
 *
 * @author XPS L502X
 */
public class adeptMake extends Character  {
    int hitDie1D = 6;
    int ranksPerLevelBase = 2;
    int[] adeptSpellsDay = {0,0,0,0,0};//NPC class, kept out of main character class
    int[] totalAdeptSpells = {0,0,0,0,0};//NPC class, kept out of main character class
    public void spawnLv1Adept(){
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
       // SpecialSkills = " ";
        weaponProf = "Simple ";
        armorProf = " None ";
        lastName = "The Adept";
        level = 1;
        if(gender.equals("Female"))
            firstName = "Jane";
        firstLevelHitDie(hitDie1D, characterMods[2]);
        LevelSavesUpdate();
        LevelAttackBonusUpdate();
        adeptSpellsDay(level);
        bonusSpellPerDay(characterStats[5]);
        adeptTotalSpells();
    }
    
     public void adeptSpellsDay(int lv){
        //sets base spells to what it should be for the level. Update total must be called after
        //each level. Send in Level of character
        switch (lv) {
        //do nothing
            case 1:
                adeptSpellsDay[0] = 3;
                adeptSpellsDay[1] = 1;
                break;
            case 2:
                //nospells change
                break;
            case 3:
                adeptSpellsDay[1] = 2;
                break;
            case 4:
                //2nd level technicly available
                break;
            case 5:
                adeptSpellsDay[2] = 1;
                break;
            case 6:
                //no change
                break;
            case 7:
                adeptSpellsDay[1] = 3;
                adeptSpellsDay[2] = 2;
                break;
            case 8:
                //3rd level available
                break;
            case 9:
                adeptSpellsDay[3] = 2;
                break;
            case 10:
                //no change available
                break;
            case 11:
                adeptSpellsDay[2] = 3;
                adeptSpellsDay[3] = 2;
                break;            
            case 12:
                //4th now available
                break;
            case 13:
                adeptSpellsDay[4] = 1;
                break;
            case 14:
                //nothing changes
                break;       
            case 15:
                adeptSpellsDay[3] = 3;
                adeptSpellsDay[4] = 2;
                break;
            case 16:
                //5th level spells now available
                break;
            case 17:
                adeptSpellsDay[5] = 1;
               
                break;
            case 18:
                adeptSpellsDay[8] = 3;
                adeptSpellsDay[9] = 2;
                break;
            case 19:
                adeptSpellsDay[4] = 3;
                adeptSpellsDay[5] = 2;
                break;
            case 20:
                //no change in spells available
                break;
            default:
                break;
        }
     }
     public void adeptTotalSpells(){
       totalAdeptSpells[0] = adeptSpellsDay[0] + bonusSpells[0];
       totalAdeptSpells[1] = adeptSpellsDay[1] + bonusSpells[1];
       totalAdeptSpells[2] = adeptSpellsDay[2] + bonusSpells[2];
       totalAdeptSpells[3] = adeptSpellsDay[3] + bonusSpells[3];
       totalAdeptSpells[4] = adeptSpellsDay[4] + bonusSpells[4];
       totalAdeptSpells[5] = adeptSpellsDay[5] + bonusSpells[5];
       
    }
}
