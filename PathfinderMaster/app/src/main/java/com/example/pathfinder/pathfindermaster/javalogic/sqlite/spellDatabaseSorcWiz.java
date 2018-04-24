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
import java.sql.*;
public class spellDatabaseSorcWiz {
    public void initilizeSpellData(){
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      System.out.println("Created Spell database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE Spells " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " + 
                   " LEVEL          INT     NOT NULL, " +
                   " SCHOOL         STRING, " + 
                   " DESCRIPTION    STRING, " +
                   " Component      STRING)"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Spell Table initilized successfully");
    }
    
    public void allTheSpells(){
      Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:test.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
                   "VALUES (001, 'Resistance', 0, 'Abjuration', 'Subject gains +1 on saving throws. ','None' );"; 
      stmt.executeUpdate(sql);

      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (002, 'Acid Splash', 0, 'Conjuration', 'Orb deals 1d3 acid damage.','None' );"; 
      stmt.executeUpdate(sql);

      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (003, 'Drench', 0, 'Conjuration', 'A sudden downpour soaks a target creature or object. ','None' );"; 
      stmt.executeUpdate(sql);

       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (004, 'Detect Magic', 0, 'Divination', 'Detects all spells and magic items within 60 ft. ','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (005, 'Detect Poison', 0, 'Divination', 'Detects poison in one creature or small object. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (006, 'Read Magic', 0, 'Divination', 'Read scrolls and spellbooks. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (007, 'Daze', 0, 'Enchantment', 'A single humanoid creature with 4 HD or less loses its next action. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (008, 'Breeze', 0, 'Evocation', 'Create a light wind that blows against target from direction of your choice. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (009, 'Dancing Lights', 0, 'Evocation', 'Creates torches or other lights.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (010, 'Flare', 0, 'Evocation', 'Dazzles one creature (–1 on attack rolls). ','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (011, 'Light', 0, 'Evocation', 'Object shines like a torch.','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (012, 'Penumbra', 0, 'Evocation', 'Protects creature or object touched from bright light. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (013, 'Ray of Frost', 0, 'Evocation', 'Ray deals 1d3 cold damage. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (014, 'Scoop', 0, 'Evocation', 'Create a scoop of force to pick up or carry liquids. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (015, 'Spark', 0, 'Evocation', 'Ignites flammable objects. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (016, 'Ghost Sound', 0, 'Illusion', 'Figment sounds. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (017, 'Haunted Fey Aspect', 0, 'Illusion', 'You surround yourself with disturbing illusions. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (018, 'Bleed', 0, 'Necromancy', 'Cause a stabilized creature to resume dying. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (019, 'Disrupt Undead', 0, 'Necromancy', 'Deals 1d6 damage to one undead. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (020, 'Touch of Fatigue', 0, 'Necromancy', 'Touch attack fatigues target. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (021, 'Jolt', 0, 'Transmutation', 'Deal 1d3 electrical damage with a ranged touch attack. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (022, 'Mage Hand', 0, 'Transmutation', '5-pound telekinesis. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (023, 'Mending', 0, 'Transmutation', 'Makes minor repairs on an object. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (024, 'Message', 0, 'Transmutation', 'Whisper conversation at distance. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (025, 'Open/Close', 0, 'Transmutation', 'Opens or closes small or light things.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (026, 'Root', 0, 'Transmutation', 'Reinforces a subjects defense against being moved or tripped. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (027, 'Arcane Mark', 0, 'Universal', 'Inscribes a personal rune on an object or creature (visible or invisible). ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (028, 'Prestidigitation', 0, 'Universal', 'Performs minor tricks.','None' );"; 
      stmt.executeUpdate(sql);
      
      stmt.close();
      c.commit();
      //c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
    }
    
    
}