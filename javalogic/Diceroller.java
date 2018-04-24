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
public class Diceroller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          spellDatabase dataBase = new spellDatabase();
          dataBase.justOpen();
          dataBase.makeDataBase();
          SorcererMake levelOneSorc = new SorcererMake();
          levelOneSorc.spawnLV1Sorc();
          
    }
    
}
