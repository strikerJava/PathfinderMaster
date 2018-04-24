/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pathfinder.pathfindermaster.javalogic;
import java.util.Random;
/**
 *
 * @author XPS L502X
 */
public class RollClass {
    
   public int yourRoll;
    
    public int roll4(){
        Random randomGenerator = new Random();
        yourRoll = randomGenerator.nextInt(4) + 1;
        return yourRoll;
    }
     public int roll6(){   
        Random randomGenerator = new Random();
        yourRoll = yourRoll = randomGenerator.nextInt(6) + 1;
        return yourRoll;
    }
    public int roll8(){
        Random randomGenerator = new Random();
        yourRoll = yourRoll = randomGenerator.nextInt(8) + 1;
        return yourRoll;
    }
    
    public int roll10(){
        Random randomGenerator = new Random();
        yourRoll = randomGenerator.nextInt(10) + 1;
        return yourRoll;
    }
    
    public int roll20(){
        Random randomGenerator = new Random();
        yourRoll = randomGenerator.nextInt(20) + 1;
        return yourRoll;
    }
    
    public int roll100(){
        Random randomGenerator = new Random();
        yourRoll = randomGenerator.nextInt(100) + 1;
        return yourRoll;
    }
    
    public int rollX( int maxRoll){
        Random randomGenerator = new Random();
        yourRoll = randomGenerator.nextInt(maxRoll) + 1;
        return yourRoll;
    }
     public int roll2X(int basement, int range){
        Random randomGenerator = new Random();
        yourRoll = randomGenerator.nextInt(range) + 1;
        yourRoll = yourRoll + basement;
        //System.out.println(yourRoll + " Was roll2x result");
        return yourRoll;
    }
    public int makeStat(){
        int[] rolls = {0,0,0,0};
        //System.out.println("INt[] inti");
        int TotalRuns = 0;
        Random randomGenerator = new Random();
        while(TotalRuns < 4){//roll 4 times
         yourRoll = randomGenerator.nextInt(6) + 1;
          rolls[3] = rolls[2];
          rolls[2] = rolls[1];
          rolls[1] = rolls[0];
          rolls[0] = yourRoll; //This is really Janky. Fix later.
          TotalRuns++;
        }
         sortRolls(rolls);
         yourRoll = addThree(rolls);
        return yourRoll;
         
    }
    
    public void sortRolls(int[] array ){
        //Really junky sort method. Bose-Nelson Algorithm used?
        //http://pages.ripco.net/~jgamble/nw.html
        int tmp;
        if(array[0] < array[1]){
            tmp = array[0];
            array[0] = array[1];
            array[1] = tmp;
        }
        if(array[2] < array[3]){
            tmp = array[2];
            array[2] = array[3];
            array[3] = tmp;
        }
        if(array[0] < array[2]){
            tmp = array[0];
            array[0] = array[2];
            array[2] = tmp;
        }
         if(array[1] < array[3]){
            tmp = array[1];
            array[1] = array[3];
            array[3] = tmp;
        }
         if(array[1] < array[2]){
            tmp = array[1];
            array[1] = array[2];
            array[2] = tmp;
        }
    
    }       
    public int addThree(int[] array){
        //Adds top three together, then returns the result as one of your character stats.
      //  System.out.println("Top three rolls" + array[0] + "+" + array[1] + "+" + array[2]);
      //  System.out.println("Thrown out roll: " + array[3]);
      //  System.out.println("adding the following numbers: " + array[0] + "+" array[1] + "+" +  array[2]);
         int topThree = array[0] + array[1] + array[2];
         return topThree;
   }

}