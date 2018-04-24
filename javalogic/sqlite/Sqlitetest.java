/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitetest;
// https://www.tutorialspoint.com/sqlite/sqlite_java.htm
import java.sql.*;

public class Sqlitetest
{
   public static void main( String args[] )
  {
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
      //stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Spell Table initilized successfully");
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      String sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
                   "VALUES (0001, 'Resistance', 0, 'Abjuration', 'Subject gains +1 on saving throws. ','None' );"; 
      stmt.executeUpdate(sql);

      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0002, 'Acid Splash', 0, 'Conjuration', 'Orb deals 1d3 acid damage.','None' );"; 
      stmt.executeUpdate(sql);

      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0003, 'Drench', 0, 'Conjuration', 'A sudden downpour soaks a target creature or object. ','None' );"; 
      stmt.executeUpdate(sql);

       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0004, 'Detect Magic', 0, 'Divination', 'Detects all spells and magic items within 60 ft. ','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0005, 'Detect Poison', 0, 'Divination', 'Detects poison in one creature or small object. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0006, 'Read Magic', 0, 'Divination', 'Read scrolls and spellbooks. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0007, 'Daze', 0, 'Enchantment', 'A single humanoid creature with 4 HD or less loses its next action. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0008, 'Breeze', 0, 'Evocation', 'Create a light wind that blows against target from direction of your choice. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0009, 'Dancing Lights', 0, 'Evocation', 'Creates torches or other lights.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0010, 'Flare', 0, 'Evocation', 'Dazzles one creature (–1 on attack rolls). ','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0011, 'Light', 0, 'Evocation', 'Object shines like a torch.','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0012, 'Penumbra', 0, 'Evocation', 'Protects creature or object touched from bright light. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0013, 'Ray of Frost', 0, 'Evocation', 'Ray deals 1d3 cold damage. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0014, 'Scoop', 0, 'Evocation', 'Create a scoop of force to pick up or carry liquids. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0015, 'Spark', 0, 'Evocation', 'Ignites flammable objects. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0016, 'Ghost Sound', 0, 'Illusion', 'Figment sounds. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0017, 'Haunted Fey Aspect', 0, 'Illusion', 'You surround yourself with disturbing illusions. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0018, 'Bleed', 0, 'Necromancy', 'Cause a stabilized creature to resume dying. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0019, 'Disrupt Undead', 0, 'Necromancy', 'Deals 1d6 damage to one undead. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0020, 'Touch of Fatigue', 0, 'Necromancy', 'Touch attack fatigues target. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0021, 'Jolt', 0, 'Transmutation', 'Deal 1d3 electrical damage with a ranged touch attack. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0022, 'Mage Hand', 0, 'Transmutation', '5-pound telekinesis. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0023, 'Mending', 0, 'Transmutation', 'Makes minor repairs on an object. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0024, 'Message', 0, 'Transmutation', 'Whisper conversation at distance. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0025, 'Open/Close', 0, 'Transmutation', 'Opens or closes small or light things.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0026, 'Root', 0, 'Transmutation', 'Reinforces a subjects defense against being moved or tripped. ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0027, 'Arcane Mark', 0, 'Universal', 'Inscribes a personal rune on an object or creature (visible or invisible). ','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0028, 'Prestidigitation', 0, 'Universal', 'Performs minor tricks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0029, 'Adjuring Step', 1, 'Abjuration', 'You can move slowly and safely and still cast spells, until you move quickly, make an attack, or cast a harmful spell.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0030, 'Alarm', 1, 'Abjuration', 'Wards an area for 2 hours/level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0031, 'Endure Elements', 1, 'Abjuration', 'Exist comfortably in hot or cold regions.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0032, 'Hold Portal', 1, 'Abjuration', 'Holds door shut.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0033, 'Invisibility Alarm', 1, 'Abjuration', 'As alarm, but reacting only to invisible creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0034, 'Line in the Sand', 1, 'Abjuration', 'Increase your attacks of opportunity per round.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0035, 'Obscure Poison', 1, 'Abjuration', 'Make it harder to detect a poison or a venomous creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0036, 'Protection from Chaos/Evil/Good/Law', 1, 'Abjuration', '2 to AC and saves, plus additional protection against selected alignment.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0037, 'Rite of Centered Mind', 1, 'Abjuration', 'You heighten your awareness of your own thoughts, allowing you to more easily resist outside influences.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0038, 'Shield', 1, 'Abjuration', 'Invisible disc gives +4 to AC, blocks magic missiles.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0039, 'Shock Shield', 1, 'Abjuration', 'A shield of force protects you until you dismiss it in an explosion of electricity.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0040, 'Stunning Barrier', 1, 'Abjuration', 'Magical field grants a +1 bonus to AC and on saves, and stuns one creature attacking you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0041, 'Wave Shield', 1, 'Abjuration', 'Water blunts one incoming attack or fire effect.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0042, 'Winter Feathers', 1, 'Abjuration', 'The target's feathers thicken and fluff up to ward against winter's chill. The target suffers no harm from being in a cold environment, and can exist comfortably in conditions as low as –50 degrees Fahrenheit without having to make Fortitude saves.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0043, 'Abundant Ammunition', 1, 'Conjuration', 'Replaces nonmagical ammunition every round.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0044, 'Adhesive Spittle', 1, 'Conjuration', 'Spit a tanglefoot bag at a creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0045, 'Air Bubble', 1, 'Conjuration', 'Creates a small pocket of air around your head or an object.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0046, 'Celestial Healing', 1, 'Conjuration', 'You anoint a wounded creature with the blood of a good outsider.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0047, 'Corrosive Touch', 1, 'Conjuration', 'Touch attack deals 1d4 acid/level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0048, 'Desperate Weapon', 1, 'Conjuration', 'Create an improvised weapon.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0049, 'Expeditious Construction', 1, 'Conjuration', 'You create a low wall or other simple structure of packed earth or loose stone measuring 3 feet thick, 3 feet tall, and 10 feet long per 3 caster levels you possess (minimum 10 feet).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0050, 'Glue Seal', 1, 'Conjuration', 'Makes one 5-ft. square or one object sticky.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0051, 'Grease', 1, 'Conjuration', 'Makes 10-ft. square or one object slippery.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0052, 'Guardian Armor', 1, 'Conjuration', 'Teleport armor you are wearing off of you and onto an ally within range.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0053, 'Icicle Dagger', 1, 'Conjuration', 'Masterwork ice dagger deals +1 cold damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0054, 'Infernal Healing', 1, 'Conjuration', 'Touch a creature with devils blood, giving it fast healing 1.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0055, 'Ki Arrow', 1, 'Conjuration', 'Arrow deals damage as your unarmed strike.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0056, 'Linked Legacy', 1, 'Conjuration', 'This spell helps build community and ensure a shared vision for the future.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0057, 'Mage Armor', 1, 'Conjuration', 'Gives subject +4 armor bonus.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0058, 'Mount', 1, 'Conjuration', 'Summons riding horse for 2 hours/level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0059, 'Mudball', 1, 'Conjuration', 'Range touch attack that cause the target to be blinded.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0060, 'Obscuring Mist', 1, 'Conjuration', 'Fog surrounds you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0061, 'Secluded Grimoire', 1, 'Conjuration', 'Send a spellbook into a random safe location on the Ethereal Plane, where it remains indefinitely. You can retrieve it later by concentrating as a standard action, causing it to reappear in your hands.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0062, 'Snowball', 1, 'Conjuration', 'Ranged touch delivers 1d6/level cold damage (max 5d6) and might stagger a foe.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0063, 'Stone Shield	', 1, 'Conjuration', 'A 1-inch-thick slab of stone springs up from the ground, interposing itself between you and an opponent of your choice.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0064, 'Stumble Gap', 1, 'Conjuration', 'Small hole trips creatures.','F' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0065, 'Summon Minor Monster', 1, 'Conjuration', 'Summon 1d3 Tiny animals.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0066, 'Summon Monster I', 1, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0067, 'Unseen Servant', 1, 'Conjuration', 'Invisible force obeys your commands.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0068, 'Anticipate Peril', 1, 'Divination', 'Target gains a bonus on one initiative check.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0069, 'Comprehend Languages', 1, 'Divination', 'You understand all spoken and written languages.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0070, 'Cultural Adaptation', 1, 'Divination', 'Adapt to fit the local culture.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0071, 'Detect Charm', 1, 'Divination', 'As detect magic, except you immediately detect the strength and location of each charm, compulsion, and possession aura on all creatures in the area.','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0072, 'Detect Metal', 1, 'Divination', 'You detect any metal objects or creatures within a 60-foot cone.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0073, 'Detect Secret Doors', 1, 'Divination', 'Reveals hidden doors within 60 ft.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0074, 'Detect Undead', 1, 'Divination', 'Reveals undead within 60 ft.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0075, 'Discern Next of Kin', 1, 'Divination', 'Read the target's mind to learn about its family.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0076, 'Identify', 1, 'Divination', 'Gives +10 bonus to identify magic items.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0077, 'See Alignment', 1, 'Divination', 'Pick an alignment; in your sight, creatures and items with that alignment emit a ghostly radiance.','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0078, 'Technomancy', 1, 'Divination', 'As detect magic, except detects the presence of technological objects instead of magical objects and grants the Technologist feat for attempting Knowledge (engineering) checks to identify the properties of technological items. If you already possess this feat, you gain a +10 bonus on Knowledge (engineering) checks to identify item properties.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0079, 'True Strike', 1, 'Divination', '+20 on your next attack roll.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0080, 'Aphasia', 1, 'Enchantment', 'Prevent a target from understanding language.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0081, 'Bungle', 1, 'Enchantment', 'Target takes a -20 penalty on its next attack roll or check.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0082, 'Charm Person', 1, 'Enchantment', 'Makes one person your friend.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0083, 'Delusional Pride', 1, 'Enchantment', 'Target is penalized on attacks and checks but gains bonus against charms and compulsions.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0084, 'Hypnotism', 1, 'Enchantment', 'Fascinates 2d4 HD of creatures.','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0085, 'Keep Watch', 1, 'Enchantment', 'You are treated as having a night's rest even while staying awake','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0086, 'Lock Gaze', 1, 'Enchantment', 'You compel the target to only look at you for the duration of the spell.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0087, 'Memorize Page', 1, 'Enchantment', 'Target perfectly memorizes one page of information.','F' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0088, 'Memory Lapse', 1, 'Enchantment', 'Subject forgets events back to last turn.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0089, 'Moment of Greatness', 1, 'Enchantment', 'Doubles a morale bonus.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0090, 'Sleep', 1, 'Enchantment', 'Puts 4 HD of creatures into magical slumber.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0091, 'Unprepared Combatant', 1, 'Enchantment', 'Target takes -4 on initiative and Reflex saves.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0092, 'Burning Hands', 1, 'Evocation', '1d4/level fire damage (max 5d4).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0093, 'Dancing Darkness', 1, 'Evocation', 'You create either up to four spheres of darkness that each reduce the illumination level by one step within a 20-foot-radius, or one dimly lit, vaguely humanoid shape. Each sphere of dancing darkness must stay within a 10-foot-radius area of one another but can otherwise move as you desire (no concentration required): forward or back, up or down, straight or turning corners, or the like.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0094, 'Ear-Piercing Scream', 1, 'Evocation', 'Deal sonic damage and daze target.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0095, 'Flare Burst', 1, 'Evocation', 'As flare, but affects all creatures in 10 ft.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0096, 'Floating Disk', 1, 'Evocation', 'Creates 3-ft.-diameter horizontal disk that holds 100 lbs./level.','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0097, 'Gentle Breeze', 1, 'Evocation', 'Light wind protects one target from clouds, gases, heat, and vapors.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0098, 'Hydraulic Push', 1, 'Evocation', 'Wave of water bull rushes an enemy.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0099, 'Magic Missile', 1, 'Evocation', '1d4+1 damage; +1 missile per two levels above 1st (max 5).','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0100, 'Shocking Grasp', 1, 'Evocation', 'Touch delivers 1d6/level electricity damage (max 5d6).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0101, 'Thunderstomp', 1, 'Evocation', 'Trip one creature within range.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0102, 'Touch of Combustion', 1, 'Evocation', 'Touched target ignites in flame, suffering 1d6 fire damage and possibly catching on fire','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0103, 'Alter Musical Instrument', 1, 'Illusion', 'Make one instrument sound like a different kind of instrument.','F' );"; 
      stmt.executeUpdate(sql);
        sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0104, 'Auditory Hallucination', 1, 'Illusion', 'Create a phantasm with auditory effects.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0105, 'Blend', 1, 'Illusion', 'Gain a bonus to Stealth and make checks without cover or concealment. Elf only','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0106, 'Blurred Movement', 1, 'Illusion', 'As blur, but only while you are moving.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0107, 'Clarion Call', 1, 'Illusion', 'Your voice can be heard across great distances','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0108, 'Color Spray', 1, 'Illusion', 'Knocks unconscious, blinds, and/or stuns weak creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0109, 'Darting Duplicate', 1, 'Illusion', 'You create an illusory duplicate of yourself that opponents might waste an attack of opportunity on.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0110, 'Dazzling Blade', 1, 'Illusion', 'Your weapon becomes shiny, gaining bonuses to several combat maneuvers','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0111, 'Disguise Self', 1, 'Illusion', 'Changes your appearance.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0112, 'Disguise Weapon', 1, 'Illusion', 'Changes one weapon's appearance.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0113, 'Illusion of Calm', 1, 'Illusion', 'You appear to be standing still, even when you take some actions.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0114, 'Magic Aura', 1, 'Illusion', 'Alters object's magic aura.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0115, 'Negative Reaction', 1, 'Illusion', 'Targeted creature may not positively influence anyone.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0116, 'Open and Shut', 1, 'Illusion', 'Obfuscate whether a door is open or closed.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0117, 'Shadow Trap', 1, 'Illusion', 'You pin the target's shadow to its current location, causing the target to become entangled and preventing it from moving farther than 5 feet from its original position, as if its shadow were anchored to the terrain.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0118, 'Shadow Weapon', 1, 'Illusion', 'Create a quasi-real masterwork weapon.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0119, 'Silent Image', 1, 'Illusion', 'Creates minor illusion of your design.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0120, 'Vanish', 1, 'Illusion', 'As invisibility for 1 round/level (5 max).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0121, 'Ventriloquism', 1, 'Illusion', 'Throws voice for 1 min./level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0122, 'Bed of Iron', 1, 'Necromancy', 'You can sleep comfortably in armor without suffering fatigue.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0123, 'Cause Fear', 1, 'Necromancy', 'One creature of 5 HD or less flees for 1d4 rounds.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0124, 'Chill Touch', 1, 'Necromancy', 'One touch/level deals 1d6 damage and possibly 1 Str damage','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0125, 'Decompose Corpse', 1, 'Necromancy', 'Turn a corpse into a clean skeleton','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0126, 'Grasping Corpse', 1, 'Necromancy', 'Cause a corpse to grab or trip a foe.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0127, 'Interrogation', 1, 'Necromancy', 'Target answers questions or suffers pain.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0128, 'Itching Curse', 1, 'Necromancy', 'Curse target with a distracting, unbearable itch.	','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0129, 'Phantom Blood', 1, 'Necromancy', 'Gain temporary hp if Con loss would knock you out or kill you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0130, 'Ray of Enfeeblement', 1, 'Necromancy', 'Ray causes 1d6 Str penalty + 1 per 2 levels.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0131, 'Ray of Sickening', 1, 'Necromancy', 'Ray makes the subject sickened.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0132, 'Repair Undead', 1, 'Necromancy', 'Heals one undead of 1d8 hp + 1/level (max +5).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0133, 'Restore Corpse', 1, 'Necromancy', 'Skeletal corpse grows flesh.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0134, 'Sculpt Corpse', 1, 'Necromancy', 'Makes corpse look like another creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0135, 'Touch of Blindness', 1, 'Necromancy', 'A touch from your hand, which is engulfed in darkness, disrupts a creature's vision by coating its eyes in supernatural darkness.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0136, 'Alchemical Tinkering', 1, 'Transmutation', 'Transform one firearm or alchemical item into another one.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0137, 'Alter Winds', 1, 'Transmutation', 'Increase/decrease strength of natural winds.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0138, 'Animate Rope', 1, 'Transmutation', 'Makes a rope move at your command.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0139, 'Ant Haul', 1, 'Transmutation', 'Triples carrying capacity of a creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0140, 'Body Capacitance', 1, 'Transmutation', 'Store electricity attacks used against you and release the energy as a touch attack.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0141, 'Bouncy Body', 1, 'Transmutation', 'The target's flesh becomes flexible and rubbery.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0142, 'Break', 1, 'Transmutation', 'Gives an object the broken condition.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0143, 'Blood Money', 1, 'Transmutation', 'Use your blood to create material components for spells.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0144, 'Burning Disarm', 1, 'Transmutation', 'A metal object instantly becomes red hot possibly causing the wielder to drop it or take damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0145, 'Crafter's Curse', 1, 'Transmutation', 'Subject takes –5 on Craft skill checks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0146, 'Crafter's Fortune', 1, 'Transmutation', 'Subject gains +5 on next Craft check.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0147, 'Damp Powder', 1, 'Transmutation', 'Ruins ammunition loaded in the targeted firearm.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0148, 'Dancing Lantern', 1, 'Transmutation', 'Animates a lantern that follows you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0149, 'Emblazon Crest', 1, 'Transmutation', 'Your coat of arms is magically displayed on any suitable item you carry.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0150, 'Endothermic Touch', 1, 'Transmutation', 'This spell slows the metabolism and other bodily functions of a creature for a short amount of time.','DF/M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0151, 'Enlarge Person', 1, 'Transmutation', 'Humanoid creature doubles in size.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0152, 'Erase', 1, 'Transmutation', 'Mundane or magical writing vanishes.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0153, 'Expeditious Excavation', 1, 'Transmutation', 'Moves 5-ft. cubes of earth.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0154, 'Expeditious Retreat', 1, 'Transmutation', 'Your base speed increases by 30 ft.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0155, 'Fabricate Bullets', 1, 'Transmutation', 'Converts 1 pound of metal into ammunition.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0156, 'Expeditious Retreat', 1, 'Transmutation', 'Create a disguise in an instant.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0157, 'Feather Fall', 1, 'Transmutation', 'Objects or creatures fall slowly.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0158, 'Forced Quiet', 1, 'Transmutation', 'Target cannot make loud noises.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0159, 'Gravity Bow', 1, 'Transmutation', 'Arrows do damage as though one size category larger.','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0160, 'Handy Grapnel', 1, 'Transmutation', 'Transform a ropelike object into a retracting grapple.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0161, 'Jump', 1, 'Transmutation', 'Subject gets bonus on Acrobatics checks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0162, 'Jury-Rig', 1, 'Transmutation', 'Removes the broken condition from the targeted object.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0163, 'Liberating Command', 1, 'Transmutation', 'Target makes an Escape Artist check as an immediate action and gains a bonus on it.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0164, 'Lighten Object', 1, 'Transmutation', 'One object weighs half as much as normal','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0165, 'Long Arm', 1, 'Transmutation', 'Your arms lengthen, giving you extra reach.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0166, 'Longshot', 1, 'Transmutation', 'Grants a +10-foot bonus to the range increment for any ranged weapon fired.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0167, 'Magic Weapon', 1, 'Transmutation', 'Weapon gains +1 bonus.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0168, 'Marid's Mastery', 1, 'Transmutation', 'If target and opponent are touching water +1 bonus on attack and damage rolls, otherwise -4.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0169, 'Mirror Polish', 1, 'Transmutation', 'Polish a metal item until it's usable as a mirror.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0170, 'Mirror Strike', 1, 'Transmutation', 'You may strike multiple opponents with a single attack.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0171, 'Monkey Fish', 1, 'Transmutation', 'Gain a climb speed and a swim speed of 10 ft. for a time.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0172, 'Poisoned Egg', 1, 'Transmutation', 'You transform the contents of a normal egg into a single dose of small centipede poison (injury; save DC 11; frequency 1/round for 4 rounds; effect 1 Dex; cure 1 save).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0173, 'Polypurpose Panacea', 1, 'Transmutation', 'Gain a relaxing or entertaining effect','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0174, 'Recharge Innate Magic', 1, 'Transmutation', 'Regain one use of all 0 and 1st-level spell-like abilities of a racial trait.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0175, 'Reduce Person', 1, 'Transmutation', 'Humanoid creature halves in size.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0176, 'Refine Improvised Weapon', 1, 'Transmutation', 'Transform improvised weapon into a masterwork simple or martial weapon.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0177, 'Reinforce Armaments', 1, 'Transmutation', 'Temporarily mitigates the fragile quality in targeted weapon or armor.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0178, 'Snapdragon Fireworks', 1, 'Transmutation', 'Create 1 dragon firework/level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0179, 'Stone Fist', 1, 'Transmutation', 'Your unarmed strikes are lethal.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0180, 'Stone Fist', 1, 'Transmutation', 'Sundering Shards','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0181, 'Swift Girding', 1, 'Transmutation', 'Your allies are instantly suited up','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0182, 'Touch of Gracelessness', 1, 'Transmutation', 'Subject loses 1d6 + 1 Dex/two levels and is prone to falling down.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0183, 'Touch of the Sea', 1, 'Transmutation', 'Swim speed becomes 30 ft.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0184, 'Transfer Tattoo', 1, 'Transmutation', 'Move a magic tattoo from one creature to another.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0185, 'Unerring Weapon', 1, 'Transmutation', 'Grants a +2 bonus, +1 per four caster levels, on attack rolls to confirm a critical hit.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0186, 'Vocal Alteration', 1, 'Transmutation', 'Disguise target's voice','None' );"; 
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0187, 'Weaken Powder', 1, 'Transmutation', 'Targeted firearm's ammunition halves the firearm's range and imposes a –2 penalty on damage rolls.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0188, 'Windy Escape', 1, 'Transmutation', 'You respond to an attack by briefly becoming vaporous and insubstantial, allowing the attack to pass harmlessly through you. You gain DR 10/magic against this attack and are immune to any poison, sneak attacks, or critical hit effect from that attack.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0189, 'Wizened Appearance', 1, 'Transmutation', 'Make a target appear as an older version of itself.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0190, 'Youthful Appearance', 1, 'Transmutation', 'Target appears younger.','None' );"; 
      stmt.executeUpdate(sql);
      // End of level 1 spells
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0191, 'Anti-Summoning Shield', 2, 'Abjuration', 'Within the area of effect, this spell impedes the use of spells of the summoning subschool and other effects that summon creatures.	','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0192, 'Arcane Lock', 2, 'Abjuration', 'Magically locks a portal or chest.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0193, 'Book Ward', 2, 'Abjuration', 'As protection from energy, except lasts much longer and only protects against acid and fire damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0194, 'Bullet Shield', 2, 'Abjuration', 'You gain a +4 deflection bonus to AC against firearm attacks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0195, 'Bullet Ward', 2, 'Abjuration', 'Adamantine bullets intercept firearm attacks.','F' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0196, 'Crimson Confession', 2, 'Abjuration', 'Touching the marked object or area turns one's skin red.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0197, 'Death from Below', 2, 'Abjuration', 'Grant bonus to AC against larger creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0198, 'Disrupt Link', 2, 'Abjuration', 'The target has her link with her bonded creature temporarily severed.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0199, 'Endure Elements, Communal', 2, 'Abjuration', 'As endure elements, but you may divide the duration among creatures touched.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0200, 'Escaping Ward', 2, 'Abjuration', 'Move 5 feet away from a larger attacking creature as an immediate action.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0201, 'Gird Ally', 2, 'Abjuration', 'You create a magical field around summoned creatures you control that deflects attacks made against them. The targets gain a deflection bonus to their AC equal to 1 + 1 for every 6 caster levels you possess (maximum +4 deflection bonus at 18th level)','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0202, 'Miserable Pity', 2, 'Abjuration', 'Opponents cannot attack a pathetic creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0203, 'Obscure Object', 2, 'Abjuration', 'Masks object against scrying.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0204, 'Protection from Arrows', 2, 'Abjuration', 'Subject gains DR 10/magic against ranged attacks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0205, 'Protection from Chaos, Communal', 2, 'Abjuration', 'As protection from chaos, but you may divide the duration among creatures touched.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0206, 'Protection from Evil, Communal', 2, 'Abjuration', 'As protection from evil, but you may divide the duration among creatures touched.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0207, 'Protection from Good, Communal', 2, 'Abjuration', 'As protection from good, but you may divide the duration among creatures touched.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0208, 'Protection from Law, Communal', 2, 'Abjuration', 'As protection from law, but you may divide the duration among creatures touched.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0209, 'Resist Energy', 2, 'Abjuration', 'Ignores first 10 (or more) points of damage per attack from specified energy type.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0210, 'Warding Weapon', 2, 'Abjuration', 'The weapon you use for the focus of this spell defends you, allowing you to cast spells without provoking attacks of opportunity.','F' );"; 
      stmt.executeUpdate(sql);
      //end of abjuration lv 2
      //
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0210, 'SpellName', 2, 'Abjuration', 'description','None' );"; 
      stmt.executeUpdate(sql);
      //copy this
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0210, 'Acid Arrow', 2, 'Conjuration', 'Ranged touch attack; 2d4 damage for 1 round + 1 round/three levels.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0211, 'Alter Summoned Monster', 2, 'Conjuration', 'You swap a creature summoned by a conjuration (summoning) spell for a creature you could summon with a summon monster or summon nature's ally spell','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0212, 'Arrow Eruption', 2, 'Conjuration', 'Creates duplicates of killing arrow.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0213, 'Blade Tutor's Spirit', 2, 'Conjuration', 'Attack penalties you choose to suffer are reduced.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0214, 'Callback', 2, 'Conjuration', 'If your familiar takes hp damage while within range of this spell, it immediately teleports to your space after the damage is applied.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0215, 'Cloud of Seasickness', 2, 'Conjuration', 'As stinking cloud, except as noted and creatures are sickened instead of nauseated.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0216, 'Create Pit', 2, 'Conjuration', 'Creates an extradimensional pit.','F' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0217, 'Cushioning Bands', 2, 'Conjuration', 'Force bands protect against crushing.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0218, 'Dust of Twilight', 2, 'Conjuration', 'Black particles extinguish light sources within area.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0219, 'Euphoric Cloud', 2, 'Conjuration', 'Fog obscures vision and fascinates living creatures.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0220, 'Fiery Shuriken', 2, 'Conjuration', 'Calls forth several fiery projectiles ready to be flung at opponents.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0221, 'Fog Cloud', 2, 'Conjuration', 'Fog obscures vision.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0222, 'Glitterdust', 2, 'Conjuration', 'Blinds creatures, outlines invisible creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0223, 'Instant Weapon', 2, 'Conjuration', 'You create a masterwork melee weapon sized appropriately for you from opaque force. As a force effect, it can strike and damage incorporeal creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0224, 'Mount, Communal', 2, 'Conjuration', 'As mount, but you may divide the duration among creatures touched.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0225, 'Mud Buddy', 2, 'Conjuration', 'You create a Small minion out of mud, and it obeys your commands.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0226, 'Reloading Hands', 2, 'Conjuration', 'Loads a single shot into your weapon every round.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0227, 'Retrieve Item', 2, 'Conjuration', 'Call an item instantly to you hand from nearby by speaking a special word and snapping your fingers. The spell fails if the item is in the possession of another creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0228, 'Returning Weapon', 2, 'Conjuration', 'Grants a weapon the returning special weapon quality.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0229, 'River Whip', 2, 'Conjuration', 'Create a whip of water that you wield as a weapon.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0230, 'Shackle', 2, 'Conjuration', 'You summon a set of Small or Medium masterwork restraints into being.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0231, 'Slipstream', 2, 'Conjuration', 'Wave boosts creature’s speed.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0232, 'Stone Call', 2, 'Conjuration', '2d6 damage to all creatures in area.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0233, 'Stone Discus', 2, 'Conjuration', 'Flying discus deals bludgeoning or slashing damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0234, 'Summon Monster II', 2, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0235, 'Summon Swarm', 2, 'Conjuration', 'Summons swarm of bats, rats, or spiders.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0236, 'Vine Strike', 2, 'Conjuration', 'Bristles burst from your body, lodging in your opponent and blossoming into entangling vines as you pummel your target.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0237, 'Web', 2, 'Conjuration', 'Fills 20-ft.-radius spread with sticky spiderwebs that can grapple foes and impair movement.	','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0238, 'Web Shelter', 2, 'Conjuration', 'Create a comfortable shelter made of webbing.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0239, 'Whip of Spiders', 2, 'Conjuration', 'Create a whip made of poisonous spiders.','None' );"; 
      stmt.executeUpdate(sql);
      //
      //
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0240, 'Carrion Compass', 2, 'Divination', 'You are lead to an undead creature's most recent controller or the cause of the creature's undeath.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0241, 'Commune with Birds', 2, 'Divination', 'You can ask birds a question.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0242, 'Create Treasure Map', 2, 'Divination', 'Creates treasure map out of a creature’s corpse.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0243, 'Detect Magic, Greater', 2, 'Divination', 'As detect magic, but learn more information.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0244, 'Detect Thoughts', 2, 'Divination', 'Allows “listening” to surface thoughts.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0245, 'Determine Depth', 2, 'Divination', 'With a touch, you determine the exact thickness of a wall, ceiling, or other solid barrier.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0246, 'Elemental Speech', 2, 'Divination', 'Enables you to speak to elementals and some creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0247, 'Embrace Destiny ', 2, 'Divination', 'Roll d20; before end of spell, use roll to replace another d20 roll before the die is rolled.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0248, 'Know Peerage', 2, 'Divination', 'Target uses your Knowledge (nobility) ranks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0249, 'Locate Object', 2, 'Divination', 'Senses direction toward object (specific or type).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0250, 'See Invisibility', 2, 'Divination', 'Reveals invisible creatures or objects.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0251, 'Share Language', 2, 'Divination', 'Subject understands chosen language.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0252, 'Share Memory', 2, 'Divination', 'Share one memory with the target.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0253, 'Spell Gauge', 2, 'Divination', 'You learn the spells known or prepared by the target.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0254, 'Track Ship', 2, 'Divination', 'Track a ships location and movement with the aid of a nautical chart and a piece of the ship to be tracked.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0255, 'Twisted Futures', 2, 'Divination', 'A creature affected by this spell is unable to benefit from effects that grant the ability to roll multiple times and take the higher result.','None' );"; 
      //
      //
      //
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0256, 'Arcane Disruption', 2, 'Enchantment', 'This spell makes it difficult for the subject to cast arcane spells, use spell-like abilities, and use some abilities granted by arcane spellcasting classes.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0257, 'Bestow Insight', 2, 'Enchantment', 'Target gain insight bonus on skill checks and is considered trained in that skill.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0258, 'Bestow Weapon Proficiency', 2, 'Enchantment', 'Grants a creature proficiency in a single weapon for short period of time.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0259, 'Compassionate Ally', 2, 'Enchantment', 'Target is compelled to help injured ally.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0260, 'Compulsive Liar', 2, 'Enchantment', 'Prevent target from speaking the truth.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0261, 'Daze Monster', 2, 'Enchantment', 'Living creature of 6 HD or less loses its next action.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0262, 'Delay Pain', 2, 'Enchantment', 'Ignore pain for 1 hour/level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0263, 'Heckle', 2, 'Enchantment', 'You shift the target’s attitude one category toward hostile regarding you and everyone within 30 feet of it at the time the spell is cast.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0264, 'Hidden Presence', 2, 'Enchantment', 'Prevent creatures from noticing your presence.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0265, 'Hideous Laughter', 2, 'Enchantment', 'Subject loses actions for 1 round/level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0266, 'Investigative Mind', 2, 'Enchantment', 'Roll twice and take the higher roll when using certain mental skills.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0267, 'Oppressive Boredom', 2, 'Enchantment', 'Target loses its next action.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0268, 'Passing Fancy', 2, 'Enchantment', 'When you cast this spell, you dictate one specific topic or recent event and instill a magical obsession with that subject within the target.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0269, 'Qualm', 2, 'Enchantment', 'Target gains penalties on ability checks, skill checks, and concentration checks until it spends an entire round doing nothing.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0270, 'Seducer's Eyes', 2, 'Enchantment', 'You become more attractive to those around you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0271, 'Tactical Acumen', 2, 'Enchantment', 'You gain an additional +1 on attack rolls or to AC due to battlefield positioning.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0272, 'Touch of Idiocy', 2, 'Enchantment', 'Subject takes 1d6 penalty to Int, Wis, and Cha.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0273, 'Touch of Mercy', 2, 'Enchantment', 'The target creature deals only nonlethal damage with all of its weapon attacks','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0274, 'Unnatural Lust', 2, 'Enchantment', 'Target is compelled to kiss or caress another creature.','None' );"; 
      stmt.executeUpdate(sql);
      
      //////////
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0275, 'Admonishing Ray', 2, 'Evocation', 'You fire one nonlethal force ray plus one additional ray for every four levels (maximum three rays). Each ray deals 4d6 points of nonlethal damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0276, 'Aggressive Thundercloud', 2, 'Evocation', 'Flying storm cloud deals 3d6 electricity damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0277, 'Burning Arc', 2, 'Evocation', 'Create an arc of flame that burns one target plus one additional target/3 levels for 1d6 fire dmg/CL (maximum 10d6). Reduce the damage by 1/2 (rounded down) for every additional target the discharge arcs to.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0278, 'Burning Gaze', 2, 'Evocation', 'Inflict 1d6 fire damage to creature by looking at it.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0279, 'Burst of Radiance', 2, 'Evocation', 'Fills area with shimmering light, blinding (or dazzling) creatures for 1d4 rounds and damaging evil creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0280, 'Contact Entity I', 2, 'Evocation', 'Ask eldritch entities to find and converse with you.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0281, 'Continual Flame', 2, 'Evocation', 'Makes a permanent, heatless light.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0282, 'Darkness', 2, 'Evocation', '20-ft. radius of supernatural shadow.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0283, 'Defensive Shock', 2, 'Evocation', 'Electricity damages your attackers.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0284, 'Elemental Touch', 2, 'Evocation', 'Gain energy damage touch attack.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0285, 'Fiery Runes', 2, 'Evocation', 'You charge a weapon with a magic rune of fire.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0286, 'Fire Breath', 2, 'Evocation', 'Exhale a cone of flame at will.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0287, 'Fire Sneeze', 2, 'Evocation', 'Launch flaming, forceful phlegm at your enemies.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0288, 'Flaming Sphere', 2, 'Evocation', 'Rolling ball of fire deals 3d6 fire damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0289, 'Flickering Lights', 2, 'Evocation', 'Create an area of inconsistent lighting.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0290, 'Force Sword', 2, 'Evocation', 'You create a longsword of pure force sized appropriately for you that you can wield or give to another creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0291, 'Frigid Touch', 2, 'Evocation', 'Target takes cold damage and is staggered.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0292, 'Frost Fall', 2, 'Evocation', 'The area is covered in a chilling frost.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0293, 'Gust of Wind', 2, 'Evocation', 'Blows away or knocks down smaller creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0294, 'Gusting Sphere', 2, 'Evocation', 'Ball of wind can bull rush creatures inflicting 1d6 nonlethal damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0295, 'Ice Slick', 2, 'Evocation', 'You create a blast of intense cold, coating all solid surfaces in the area with a thin coating of ice.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0296, 'Imbue with Elemental Might', 2, 'Evocation', 'As imbue with spell ability except it transfers the use of elemental assault ability.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0297, 'Pilfering Hand', 2, 'Evocation', 'You may seize an object or manipulate it from afar.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0298, 'Protective Penumbra', 2, 'Evocation', 'Shadow protects the target from light.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0299, 'Ricochet Shot', 2, 'Evocation', 'Imbues a projectile weapon to give its ammunition the ability to ricochet.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0300, 'Scorching Ray', 2, 'Evocation', 'Ranged touch attack deals 4d6 fire damage, + 1 ray/four levels (max 3).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0301, 'Shatter', 2, 'Evocation', 'Sonic energy damages objects or crystalline creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0302, 'Sonic Scream', 2, 'Evocation', 'Create a cone of damaging sound at will.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0303, 'Spontaneous Immolation', 2, 'Evocation', 'Target takes 3d6 points of fire damage and catches on fire.','None' );"; 
      stmt.executeUpdate(sql);
      ////
      ////
      ////
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0304, 'Blur', 2, 'Illusion', 'Attacks miss subject 20% of the time.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0305, 'Dark Whispers', 2, 'Illusion', 'Whisper through the shadows.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0306, 'Disguise Other', 2, 'Illusion', 'As disguise self, but affects you or another.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0307, 'Ghostly Disguise', 2, 'Illusion', 'You look like a ghost of yourself.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0308, 'Haunting Mists', 2, 'Illusion', 'Creatures are shaken and take Wis damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0309, 'Hidden Blades', 2, 'Illusion', 'Render a target weapon or up to 50 pieces of ammo invisible, granting the wielder a bonus on Sleight of Hand checks made to conceal the weapon or ammunition and to Bluff checks to feint with the weapon or ammo.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0310, 'Hypnotic Pattern', 2, 'Illusion', 'Fascinates 2d4 + level HD of creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0311, 'Invisibility', 2, 'Illusion', 'Subject is invisible for 1 min./level or until it attacks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0312, 'Jitterbugs', 2, 'Illusion', 'Targets gets –4 penalty on all Dex and Dex-based skill checks, and cannot take the delay, ready, or total defense actions.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0313, 'Mad Hallucination', 2, 'Illusion', 'Target takes penalties to mental actions.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0314, 'Magic Mouth', 2, 'Illusion', 'Object speaks once when triggered.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0315, 'Minor Image', 2, 'Illusion', 'As silent image, plus some sound.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0316, 'Mirror Image', 2, 'Illusion', 'Creates decoy duplicates of you.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0317, 'Misdirection', 2, 'Illusion', 'Misleads divinations for 1 creature or object.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0318, 'Phantom Trap', 2, 'Illusion', 'Makes item seem trapped.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0319, 'Shadow Anchor', 2, 'Illusion', 'Target needs to make a bull rush to move more than 5 feet away from his current square.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0320, 'Shifted Steps', 2, 'Illusion', 'Make a target sound as if elsewhere.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0321, 'Silent Table', 2, 'Illusion', 'Give yourself privacy by muffling sound leaving the area.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0322, 'Symbol of Mirroring', 2, 'Illusion', 'Triggered rune creates mirror images.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0323, 'Twilight Haze', 2, 'Illusion', 'Illusory fog obscures vision.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0324, 'Umbral Weapon', 2, 'Illusion', '1/rnd wielder of target touched melee weapon can reroll a failed attack roll. If reroll hits, the attacked creature suffers 1d8 cold damage, plus 1 per 2 caster levels (maximum 1d8+10).','None' );"; 
      stmt.executeUpdate(sql);
      //
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0325, 'Blindness/Deafness', 2, 'Necromancy', 'Makes subject blinded or deafened.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0326, 'Bloodbath', 2, 'Necromancy', 'Cause yourself and enemies to bleed.','F' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0327, 'Blood in the Water', 2, 'Necromancy', 'While the spell is in effect, all sharks, feeders in the depths, and creatures with the blood frenzy ability in the area gain a +2 bonus to Strength and Constitution and take a –2 penalty to AC.','DF' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0328, 'Bone Fists', 2, 'Necromancy', 'The bones of your targets' joints grow thick and sharp, protruding painfully through the skin at the knuckles, elbows, shoulders, spine, and knees.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0329, 'Boneshaker', 2, 'Necromancy', 'Momentarily control a living or undead creature’s skeleton.','F' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0330, 'Brow Gasher', 2, 'Necromancy', 'Slashing weapon deals bleed damage to an opponent’s head.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0331, 'Command Undead', 2, 'Necromancy', 'Undead creature obeys your commands.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0332, 'Companion Life Link', 2, 'Necromancy', 'Sense whenever your companion is wounded and call out to it in a time of need.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0333, 'Curse Terrain, Lesser', 2, 'Necromancy', 'Curse an area with three mild hazards.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0334, 'Defending Bone', 2, 'Necromancy', 'You animate a bone which gives you damage reduction 5/bludgeoning.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0335, 'Defoliate', 2, 'Necromancy', 'You hurl a tiny ball of negative energy, destroying plant life either in a line 60 feet long or a 10-foot-radius spread.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0336, 'Dress Corpse', 2, 'Necromancy', 'Doctor the evidence on a corpse.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0337, 'False Life', 2, 'Necromancy', 'Gain 1d10 temporary hp + 1/level (max +10).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0338, 'Ghoul Touch', 2, 'Necromancy', 'Paralyzes one subject, which exudes stench that makes those nearby sickened.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0339, 'Languid Venom', 2, 'Necromancy', 'Delay a poison's onset and hide its presence.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0340, 'Life Pact', 2, 'Necromancy', 'Affected creatures automatically donate hp to stabilize fallen ally.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0341, 'Limp Lash', 2, 'Necromancy', 'Create a magical noose around target's head, possibly paralyzing them.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0342, 'Pernicious Poison', 2, 'Necromancy', 'Target takes a -4 penalty against poison.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0343, 'Scare', 2, 'Necromancy', 'Frightens creatures of less than 6 HD.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0344, 'Sentry Skull', 2, 'Necromancy', 'Turn a severed head into a magical sentry.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0345, 'Skinsend', 2, 'Necromancy', 'Animate and possess your own skin as if it were a separate creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0346, 'Spectral Hand', 2, 'Necromancy', 'Creates disembodied glowing hand to deliver touch attacks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0347, 'Steal Voice', 2, 'Necromancy', 'Target gains the croaking spellblight.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0348, 'Stricken Heart', 2, 'Necromancy', 'Touch attack deals 2d6 damage and staggers target.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0349, 'Touch of Bloodletting', 2, 'Necromancy', 'This spell causes existing wounds on a target to bleed profusely.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0350, 'Unshakable Chill', 2, 'Necromancy', 'Target is afflicted with severe cold.','None' );"; 
      stmt.executeUpdate(sql);
      ///
      ///
      //
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0351, 'Aboleth's Lung', 2, 'Transmutation', 'Targets gain the ability to breathe water but can no longer breathe air.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0352, 'Accelerate Poison', 2, 'Transmutation', 'Hastens targeted poison’s onset.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0353, 'Adhesive Blood', 2, 'Transmutation', 'Attackers' weapons stick to your gluey blood.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0354, 'Adoration', 2, 'Transmutation', 'You gain a bonus on Diplomacy checks and performance combat checks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0355, 'Air Step', 2, 'Transmutation', 'Tread unsteadily on air, with limitations.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0356, 'Alter Self', 2, 'Transmutation', 'Assume form of a Small or Medium humanoid.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0357, 'Amplify Stench', 2, 'Transmutation', 'You amplify your natural stench special ability—its save DC increases by 2, and creatures that fail their saving throws against your stench become nauseated rather than sickened.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0358, 'Angelic Aspect, Lesser', 2, 'Transmutation', 'You gain low-light vision, acid and cold resistance 5, and protection from evil.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0359, 'Animal Aspect', 2, 'Transmutation', 'You gain some of the beneficial qualities of an animal.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0360, 'Ant Haul, Communal', 2, 'Transmutation', 'As ant haul, but you may divide the duration among creatures touched.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0361, 'Badger's Ferocity', 2, 'Transmutation', 'Weapons are keen while you concentrate.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0362, 'Bear's Endurance', 2, 'Transmutation', 'Subject gains +4 to Con for 1 min./level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0363, 'Blood Armor', 2, 'Transmutation', 'Your blood hardens when you are wounded, increasing your AC.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0364, 'Blood Blaze', 2, 'Transmutation', 'Aura that makes injured creatures spray burning blood.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0365, 'Boiling Blood', 2, 'Transmutation', 'Targets take fire damage; orcs get +2 Strength.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0366, 'Bull's Strength', 2, 'Transmutation', 'Subject gains +4 to Str for 1 min./level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0367, 'Buoyancy', 2, 'Transmutation', 'Several creatures or objects become very buoyant, floating automatically and must struggle to submerge.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0368, 'Carry Companion', 2, 'Transmutation', 'Your companion creature is transformed into a miniature statue which you can carry.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0369, 'Cat's Grace', 2, 'Transmutation', 'Subject gains +4 to Dex for 1 min./level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0370, 'Certain Grip', 2, 'Transmutation', 'You gain a +4 competence bonus on Acrobatics and Climb checks and to CMD.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0371, 'Codespeak', 2, 'Transmutation', 'Speak, read, and write a new code language.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0372, 'Darkvision', 2, 'Transmutation', 'See 60 ft. in total darkness.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0373, 'Destabilize Powder', 2, 'Transmutation', 'Ammunition in the targeted firearm is prone to misfire.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0374, 'Disfiguring Touch', 2, 'Transmutation', 'Target becomes disfigured.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0375, 'Eagle's Splendor', 2, 'Transmutation', 'Subject gains +4 to Cha for 1 min./level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0376, 'Eldritch Conduit', 2, 'Transmutation', 'Use an enemy as a point of origin for a cone, cylinder, line, or sphere spell.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0377, 'Extreme Flexibility', 2, 'Transmutation', 'Gain a bonus to AC, on Escape Artist checks, and when grappling.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0378, 'Fear the Sun', 2, 'Transmutation', 'Targets that fail the saving throw gain light blindness. If you cast this spell in the presence of bright light, any target that fails its save is blinded immediately, and dazzled starting at the beginning of its first turn.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0379, 'Fleshcurdle', 2, 'Transmutation', 'Cause target’s limbs to mutate to hamper attacks, defense, or movement.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0380, 'Fool’s Gold', 2, 'Transmutation', 'Those who possess gold pieces you have cast this spell on are more vulnerable to your magics.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0381, 'Fox's Cunning', 2, 'Transmutation', 'Subject gains +4 to Int for 1 min./level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0382, 'Full Pouch', 2, 'Transmutation', 'You cast this spell as you draw out a consumable alchemical item to use. The item divides itself into two nearly identical copies and the newly separated one is delivered into your hand. The new item functions as the original in all ways except the copied item suffers a slight reduction in quality.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0383, 'Glide', 2, 'Transmutation', 'You take no falling damage, move 60 ft./round while falling.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0384, 'Greensight', 2, 'Transmutation', 'You can see through thick plant matter as though it were transparent.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0385, 'Hidden Knowledge', 2, 'Transmutation', 'You purposely forget some information which is transcribed upon you in the form of a tattoo.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0386, 'Human Potential', 2, 'Transmutation', 'The target chooses one ability score and gains a +2 enhancement bonus to that ability score. The bonus confers the usual benefit to skills and abilities based on the ability enhanced, but does not affect bonus spells or skill ranks.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0387, 'Kinetic Reverberation', 2, 'Transmutation', 'Channels the force of an enemy’s attack back into its weapon.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0388, 'Knock', 2, 'Transmutation', 'Opens locked or magically sealed door.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0389, 'Levitate', 2, 'Transmutation', 'Subject moves up and down at your direction.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0390, 'Magic Siege Engine', 2, 'Transmutation', 'Siege gains +1 on targeting and damage rolls.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0391, 'Make Whole', 2, 'Transmutation', 'Repairs an object.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0392, 'Masterwork Transformation', 2, 'Transmutation', 'Make a normal item into a masterwork one.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0393, 'Merge with Familiar', 2, 'Transmutation', 'Your familiar merges harmlessly into your body.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0394, 'Mirror Hideaway', 2, 'Transmutation', 'As many as eight creatures hide in an extradimensional space.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0395, 'Molten Orb', 2, 'Transmutation', 'Molten metal splash weapon deals 2d6 fire damage plus ongoing damage.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0396, 'Owl's Wisdom', 2, 'Transmutation', 'Subject gains +4 to Wis for 1 min./level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0397, 'Pyrotechnics', 2, 'Transmutation', 'Turns fire into blinding light or thick smoke.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0398, 'Quick Change', 2, 'Transmutation', 'Use change shape as a swift action and surprise foes.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0399, 'Raven's Flight', 2, 'Transmutation', 'You can cast this spell only if it is the first action you take on your turn. In a burst of shadowy feathers, you turn into a Tiny blurred shape reminiscent of a black raven until the beginning of your next turn.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0400, 'Recoil Fire', 2, 'Transmutation', 'Ammunition in the targeted firearm generates excessive recoil.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0401, 'Reinforce Armaments, Communal', 2, 'As reinforce armaments, but you may divide the duration among objects touched.', 'description','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0402, 'Rope Trick', 2, 'Transmutation', 'As many as eight creatures hide in extradimensional space.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0403, 'Scale Spikes', 2, 'Transmutation', 'When the target is affected by this spell, its scales grow jagged spikes. These spikes act like +1 armor spikes. The subject is automatically considered proficient with these scale spikes.','DF/M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0404, 'Sculpt Simulacrum', 2, 'Transmutation', 'Alter a simulacrum's appearance.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0405, 'Silk To Steel', 2, 'Transmutation', 'Use a scarf as a shield or whip.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0406, 'Snow Shape', 2, 'Transmutation', 'As stone shape except with snow. You can create simple weapons composed of ice that last for 24 hours before melting.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0407, 'Spider Climb', 2, 'Transmutation', 'Grants ability to walk on walls and ceilings.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0408, 'Splinter Spell Resistance', 2, 'Transmutation', 'You create an aura around the target weapon that weakens a foe’s spell resistance with each successful attack.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0409, 'Stabilize Powder', 2, 'Transmutation', 'Ammunition in the targeted firearm is less likely to misfire.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0410, 'Staggering Fall', 2, 'Transmutation', 'Cause additional damage to a falling creature.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0411, 'Steal Breath', 2, 'Transmutation', 'You pull the breath from a creature's lungs, dealing damage and leaving it unable to speak, use breath weapons, or cast spells with verbal components.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0412, 'Steal Size', 2, 'Transmutation', 'Reduce one humanoid's size by one size category (if it is larger than you) and you grow one size category.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0413, 'Stone Throwing', 2, 'Transmutation', 'The subject gains the rock throwing and rock catching abilities usable with solid, inflexible objects with hardness of at least 5.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0414, 'Strong Wings', 2, 'Transmutation', 'Touched target's wings grow more powerful, increasing its fly speed by +10 ft. and maneuverability by one category (to a maximum of good).','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0415, 'Tattoo Potion', 2, 'Transmutation', 'Cause a potion to turn into a spell tattoo when it is drunk.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0416, 'Tears to Wine', 2, 'Transmutation', 'This spell turns nonmagic liquids into mead or wine of average quality.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0417, 'Telekinetic Assembly', 2, 'Transmutation', 'Assembles a siege engine using 1 fewer worker for every two caster levels.','F' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0418, 'Telekinetic Volley', 2, 'Transmutation', 'Up to one touched object per level weighing up to 5 lbs. each levitates in your space and you can attack with them.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0419, 'Thunder Fire', 2, 'Transmutation', 'Ammunition in the targeted firearm deafens opponents.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0420, 'Time Shudder', 2, 'Transmutation', 'Nearby creatures are affected by haste or slow each round.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0421, 'Tremor Blast', 2, 'Transmutation', 'You create a minor earthquake that can trip creatures.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0422, 'Twisted Space', 2, 'Transmutation', 'Targeted creature’s attacks target a random square instead of the intended target.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0423, 'Visualization of the Body', 2, 'Transmutation', 'You focus your mind on one aspect of your body, aligning the energies within your body to enhance that element.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0424, 'Visualization of the Mind', 2, 'Transmutation', 'You enhance a single aspect of your mind, nurturing and empowering it.','M' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0425, 'Whispering Wind', 2, 'Transmutation', 'Sends a short message 1 mile/level.','None' );"; 
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0426, 'Winged Sword', 2, 'Transmutation', 'Target weapon grows small feathered wings and acts as if it had the throwing weapon special ability.','None' );"; 
      stmt.executeUpdate(sql);
      //level 2 done
      
      
      
      //Fresh copy statement
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0427, 'SpellName', 2, 'Abjuration', 'description','None' );"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.commit();
      //c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
    
   // Connection c = null;
    //Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM Spells;" );
      while ( rs.next() ) {
         int id = rs.getInt("ID");
         String  name = rs.getString("NAME");
         int LEVEL  = rs.getInt("LEVEL");
         String  SCHOOL = rs.getString("SCHOOL");
         String DESCRIPTION = rs.getString("DESCRIPTION");
         String Component = rs.getString("Component");
         System.out.println( "ID = " + id );
         System.out.println( "NAME = " + name );
         System.out.println( "LEVEL = " + LEVEL );
         System.out.println( "SCHOOL = " + SCHOOL );
         System.out.println( "DESCRIPTION = " + DESCRIPTION );
         System.out.println( "Component = " + Component );
         System.out.println();
      }
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Operation done successfully");
  }
}
                   