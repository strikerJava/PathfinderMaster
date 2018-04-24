/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunypoly.kanallr.com.pathfindermasterii.javalogic;

/**
 *
 * @author kanallrt265
 */
import java.sql.*;
public class spellDatabase {
    public void makeDataBase(){
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      System.out.println("Created Spell database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE Spells " +
                   "(ID integer PRIMARY KEY     AUTOINCREMENT," +
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
      //System.exit(0);
    }
    System.out.println("Spell Table initilized successfully");
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      c.setAutoCommit(true);
      System.out.println("Connected to  database successfully Moving to populate");

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
            "VALUES (0010, 'Flare', 0, 'Evocation', 'Dazzles one creature (�1 on attack rolls). ','None' );";
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
      System.out.println("This is where it breaks?");
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0042, 'Winter Feathers', 1, 'Abjuration', 'The feathers of a target thicken and fluff up to ward against the winter chill. nditions as low as 50 degrees Fahrenheit without having to make Fortitude saves.','None' );";
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
            "VALUES (0075, 'Discern Next of Kin', 1, 'Divination', 'Read the mind of a target to learn about its family.','None' );";
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
            "VALUES (0085, 'Keep Watch', 1, 'Enchantment', 'You are treated as having a nights rest even while staying awake','None' );";
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
            "VALUES (0112, 'Disguise Weapon', 1, 'Illusion', 'Changes the appearance of one weapon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0113, 'Illusion of Calm', 1, 'Illusion', 'You appear to be standing still, even when you take some actions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0114, 'Magic Aura', 1, 'Illusion', 'Alters the magic aura of an object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0115, 'Negative Reaction', 1, 'Illusion', 'Targeted creature may not positively influence anyone.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0116, 'Open and Shut', 1, 'Illusion', 'Obfuscate whether a door is open or closed.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0117, 'Shadow Trap', 1, 'Illusion', 'You pin the targets shadow to its current location, causing the target to become entangled and preventing it from moving farther than 5 feet from its original position, as if its shadow were anchored to the terrain.','None' );";
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
            "VALUES (0135, 'Touch of Blindness', 1, 'Necromancy', 'A touch from your hand, which is engulfed in darkness, disrupts a creatures vision by coating its eyes in supernatural darkness.','None' );";
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
            "VALUES (0141, 'Bouncy Body', 1, 'Transmutation', 'The targets flesh becomes flexible and rubbery.','None' );";
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
            "VALUES (0145, 'Crafters Curse', 1, 'Transmutation', 'Subject takes -5 on Craft skill checks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0146, 'Crafters Fortune', 1, 'Transmutation', 'Subject gains +5 on next Craft check.','None' );";
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
            "VALUES (0168, 'Marids Mastery', 1, 'Transmutation', 'If target and opponent are touching water +1 bonus on attack and damage rolls, otherwise -4.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0169, 'Mirror Polish', 1, 'Transmutation', 'Polish a metal item until its usable as a mirror.','None' );";
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
            "VALUES (0186, 'Vocal Alteration', 1, 'Transmutation', 'Disguise targets voice','None' );";
      stmt.executeUpdate(sql);
       sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0187, 'Weaken Powder', 1, 'Transmutation', 'Targeted firearms ammunition halves the firearms range and imposes a �2 penalty on damage rolls.','None' );";
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
            "VALUES (0196, 'Crimson Confession', 2, 'Abjuration', 'Touching the marked object or area turns ones skin red.','None' );";
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
      //sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
       //     "VALUES (0210, 'SpellName', 2, 'Abjuration', 'description','None' );";
     // stmt.executeUpdate(sql);
      //copy this
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0211, 'Acid Arrow', 2, 'Conjuration', 'Ranged touch attack; 2d4 damage for 1 round + 1 round/three levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0212, 'Alter Summoned Monster', 2, 'Conjuration', 'You swap a creature summoned by a conjuration (summoning) spell for a creature you could summon with a summon monster or summon natures ally spell','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0213, 'Arrow Eruption', 2, 'Conjuration', 'Creates duplicates of killing arrow.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0214, 'Blade Tutors Spirit', 2, 'Conjuration', 'Attack penalties you choose to suffer are reduced.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0215, 'Callback', 2, 'Conjuration', 'If your familiar takes hp damage while within range of this spell, it immediately teleports to your space after the damage is applied.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0216, 'Cloud of Seasickness', 2, 'Conjuration', 'As stinking cloud, except as noted and creatures are sickened instead of nauseated.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0217, 'Create Pit', 2, 'Conjuration', 'Creates an extradimensional pit.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0218, 'Cushioning Bands', 2, 'Conjuration', 'Force bands protect against crushing.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0219, 'Dust of Twilight', 2, 'Conjuration', 'Black particles extinguish light sources within area.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0220, 'Euphoric Cloud', 2, 'Conjuration', 'Fog obscures vision and fascinates living creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0221, 'Fiery Shuriken', 2, 'Conjuration', 'Calls forth several fiery projectiles ready to be flung at opponents.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0222, 'Fog Cloud', 2, 'Conjuration', 'Fog obscures vision.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0223, 'Glitterdust', 2, 'Conjuration', 'Blinds creatures, outlines invisible creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0224, 'Instant Weapon', 2, 'Conjuration', 'You create a masterwork melee weapon sized appropriately for you from opaque force. As a force effect, it can strike and damage incorporeal creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0225, 'Mount, Communal', 2, 'Conjuration', 'As mount, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0226, 'Mud Buddy', 2, 'Conjuration', 'You create a Small minion out of mud, and it obeys your commands.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0227, 'Reloading Hands', 2, 'Conjuration', 'Loads a single shot into your weapon every round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0228, 'Retrieve Item', 2, 'Conjuration', 'Call an item instantly to you hand from nearby by speaking a special word and snapping your fingers. The spell fails if the item is in the possession of another creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0229, 'Returning Weapon', 2, 'Conjuration', 'Grants a weapon the returning special weapon quality.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0230, 'River Whip', 2, 'Conjuration', 'Create a whip of water that you wield as a weapon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0231, 'Shackle', 2, 'Conjuration', 'You summon a set of Small or Medium masterwork restraints into being.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0232, 'Slipstream', 2, 'Conjuration', 'Wave boosts creature�s speed.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0233, 'Stone Call', 2, 'Conjuration', '2d6 damage to all creatures in area.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0234, 'Stone Discus', 2, 'Conjuration', 'Flying discus deals bludgeoning or slashing damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0235, 'Summon Monster II', 2, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0236, 'Summon Swarm', 2, 'Conjuration', 'Summons swarm of bats, rats, or spiders.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0237, 'Vine Strike', 2, 'Conjuration', 'Bristles burst from your body, lodging in your opponent and blossoming into entangling vines as you pummel your target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0238, 'Web', 2, 'Conjuration', 'Fills 20-ft.-radius spread with sticky spiderwebs that can grapple foes and impair movement.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0239, 'Web Shelter', 2, 'Conjuration', 'Create a comfortable shelter made of webbing.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0240, 'Whip of Spiders', 2, 'Conjuration', 'Create a whip made of poisonous spiders.','None' );";
      stmt.executeUpdate(sql);
      //
      //
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0241, 'Carrion Compass', 2, 'Divination', 'You are lead to an undead creatures most recent controller or the cause of the creatures undeath.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0242, 'Commune with Birds', 2, 'Divination', 'You can ask birds a question.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0243, 'Create Treasure Map', 2, 'Divination', 'Creates treasure map out of a creature�s corpse.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0244, 'Detect Magic, Greater', 2, 'Divination', 'As detect magic, but learn more information.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0245, 'Detect Thoughts', 2, 'Divination', 'Allows �listening� to surface thoughts.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0246, 'Determine Depth', 2, 'Divination', 'With a touch, you determine the exact thickness of a wall, ceiling, or other solid barrier.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0247, 'Elemental Speech', 2, 'Divination', 'Enables you to speak to elementals and some creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0248, 'Embrace Destiny ', 2, 'Divination', 'Roll d20; before end of spell, use roll to replace another d20 roll before the die is rolled.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0249, 'Know Peerage', 2, 'Divination', 'Target uses your Knowledge (nobility) ranks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0250, 'Locate Object', 2, 'Divination', 'Senses direction toward object (specific or type).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0251, 'See Invisibility', 2, 'Divination', 'Reveals invisible creatures or objects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0252, 'Share Language', 2, 'Divination', 'Subject understands chosen language.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0253, 'Share Memory', 2, 'Divination', 'Share one memory with the target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0254, 'Spell Gauge', 2, 'Divination', 'You learn the spells known or prepared by the target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0255, 'Track Ship', 2, 'Divination', 'Track a ships location and movement with the aid of a nautical chart and a piece of the ship to be tracked.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0256, 'Twisted Futures', 2, 'Divination', 'A creature affected by this spell is unable to benefit from effects that grant the ability to roll multiple times and take the higher result.','None' );";
      //
      //
      //
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0257, 'Arcane Disruption', 2, 'Enchantment', 'This spell makes it difficult for the subject to cast arcane spells, use spell-like abilities, and use some abilities granted by arcane spellcasting classes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0258, 'Bestow Insight', 2, 'Enchantment', 'Target gain insight bonus on skill checks and is considered trained in that skill.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0259, 'Bestow Weapon Proficiency', 2, 'Enchantment', 'Grants a creature proficiency in a single weapon for short period of time.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0260, 'Compassionate Ally', 2, 'Enchantment', 'Target is compelled to help injured ally.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0261, 'Compulsive Liar', 2, 'Enchantment', 'Prevent target from speaking the truth.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0262, 'Daze Monster', 2, 'Enchantment', 'Living creature of 6 HD or less loses its next action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0263, 'Delay Pain', 2, 'Enchantment', 'Ignore pain for 1 hour/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0264, 'Heckle', 2, 'Enchantment', 'You shift the target�s attitude one category toward hostile regarding you and everyone within 30 feet of it at the time the spell is cast.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0265, 'Hidden Presence', 2, 'Enchantment', 'Prevent creatures from noticing your presence.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0266, 'Hideous Laughter', 2, 'Enchantment', 'Subject loses actions for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0267, 'Investigative Mind', 2, 'Enchantment', 'Roll twice and take the higher roll when using certain mental skills.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0268, 'Oppressive Boredom', 2, 'Enchantment', 'Target loses its next action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0269, 'Passing Fancy', 2, 'Enchantment', 'When you cast this spell, you dictate one specific topic or recent event and instill a magical obsession with that subject within the target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0270, 'Qualm', 2, 'Enchantment', 'Target gains penalties on ability checks, skill checks, and concentration checks until it spends an entire round doing nothing.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0271, 'Seducers Eyes', 2, 'Enchantment', 'You become more attractive to those around you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0272, 'Tactical Acumen', 2, 'Enchantment', 'You gain an additional +1 on attack rolls or to AC due to battlefield positioning.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0273, 'Touch of Idiocy', 2, 'Enchantment', 'Subject takes 1d6 penalty to Int, Wis, and Cha.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0274, 'Touch of Mercy', 2, 'Enchantment', 'The target creature deals only nonlethal damage with all of its weapon attacks','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0275, 'Unnatural Lust', 2, 'Enchantment', 'Target is compelled to kiss or caress another creature.','None' );";
      stmt.executeUpdate(sql);

      //////////
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0276, 'Admonishing Ray', 2, 'Evocation', 'You fire one nonlethal force ray plus one additional ray for every four levels (maximum three rays). Each ray deals 4d6 points of nonlethal damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0277, 'Aggressive Thundercloud', 2, 'Evocation', 'Flying storm cloud deals 3d6 electricity damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0278, 'Burning Arc', 2, 'Evocation', 'Create an arc of flame that burns one target plus one additional target/3 levels for 1d6 fire dmg/CL (maximum 10d6). Reduce the damage by 1/2 (rounded down) for every additional target the discharge arcs to.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0279, 'Burning Gaze', 2, 'Evocation', 'Inflict 1d6 fire damage to creature by looking at it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0280, 'Burst of Radiance', 2, 'Evocation', 'Fills area with shimmering light, blinding (or dazzling) creatures for 1d4 rounds and damaging evil creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0281, 'Contact Entity I', 2, 'Evocation', 'Ask eldritch entities to find and converse with you.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0282, 'Continual Flame', 2, 'Evocation', 'Makes a permanent, heatless light.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0283, 'Darkness', 2, 'Evocation', '20-ft. radius of supernatural shadow.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0284, 'Defensive Shock', 2, 'Evocation', 'Electricity damages your attackers.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0285, 'Elemental Touch', 2, 'Evocation', 'Gain energy damage touch attack.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0286, 'Fiery Runes', 2, 'Evocation', 'You charge a weapon with a magic rune of fire.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0287, 'Fire Breath', 2, 'Evocation', 'Exhale a cone of flame at will.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0288, 'Fire Sneeze', 2, 'Evocation', 'Launch flaming, forceful phlegm at your enemies.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0289, 'Flaming Sphere', 2, 'Evocation', 'Rolling ball of fire deals 3d6 fire damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0290, 'Flickering Lights', 2, 'Evocation', 'Create an area of inconsistent lighting.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0291, 'Force Sword', 2, 'Evocation', 'You create a longsword of pure force sized appropriately for you that you can wield or give to another creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0292, 'Frigid Touch', 2, 'Evocation', 'Target takes cold damage and is staggered.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0293, 'Frost Fall', 2, 'Evocation', 'The area is covered in a chilling frost.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0294, 'Gust of Wind', 2, 'Evocation', 'Blows away or knocks down smaller creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0295, 'Gusting Sphere', 2, 'Evocation', 'Ball of wind can bull rush creatures inflicting 1d6 nonlethal damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0296, 'Ice Slick', 2, 'Evocation', 'You create a blast of intense cold, coating all solid surfaces in the area with a thin coating of ice.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0297, 'Imbue with Elemental Might', 2, 'Evocation', 'As imbue with spell ability except it transfers the use of elemental assault ability.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0298, 'Pilfering Hand', 2, 'Evocation', 'You may seize an object or manipulate it from afar.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0299, 'Protective Penumbra', 2, 'Evocation', 'Shadow protects the target from light.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0300, 'Ricochet Shot', 2, 'Evocation', 'Imbues a projectile weapon to give its ammunition the ability to ricochet.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0301, 'Scorching Ray', 2, 'Evocation', 'Ranged touch attack deals 4d6 fire damage, + 1 ray/four levels (max 3).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0302, 'Shatter', 2, 'Evocation', 'Sonic energy damages objects or crystalline creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0303, 'Sonic Scream', 2, 'Evocation', 'Create a cone of damaging sound at will.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0304, 'Spontaneous Immolation', 2, 'Evocation', 'Target takes 3d6 points of fire damage and catches on fire.','None' );";
      stmt.executeUpdate(sql);
      ////
      ///
      ////
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0305, 'Blur', 2, 'Illusion', 'Attacks miss subject 20% of the time.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0306, 'Dark Whispers', 2, 'Illusion', 'Whisper through the shadows.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0307, 'Disguise Other', 2, 'Illusion', 'As disguise self, but affects you or another.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0308, 'Ghostly Disguise', 2, 'Illusion', 'You look like a ghost of yourself.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0309, 'Haunting Mists', 2, 'Illusion', 'Creatures are shaken and take Wis damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0310, 'Hidden Blades', 2, 'Illusion', 'Render a target weapon or up to 50 pieces of ammo invisible, granting the wielder a bonus on Sleight of Hand checks made to conceal the weapon or ammunition and to Bluff checks to feint with the weapon or ammo.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0311, 'Hypnotic Pattern', 2, 'Illusion', 'Fascinates 2d4 + level HD of creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0312, 'Invisibility', 2, 'Illusion', 'Subject is invisible for 1 min./level or until it attacks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0313, 'Jitterbugs', 2, 'Illusion', 'Targets gets �4 penalty on all Dex and Dex-based skill checks, and cannot take the delay, ready, or total defense actions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0314, 'Mad Hallucination', 2, 'Illusion', 'Target takes penalties to mental actions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0315, 'Magic Mouth', 2, 'Illusion', 'Object speaks once when triggered.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0316, 'Minor Image', 2, 'Illusion', 'As silent image, plus some sound.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0317, 'Mirror Image', 2, 'Illusion', 'Creates decoy duplicates of you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0318, 'Misdirection', 2, 'Illusion', 'Misleads divinations for 1 creature or object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0319, 'Phantom Trap', 2, 'Illusion', 'Makes item seem trapped.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0320, 'Shadow Anchor', 2, 'Illusion', 'Target needs to make a bull rush to move more than 5 feet away from his current square.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0321, 'Shifted Steps', 2, 'Illusion', 'Make a target sound as if elsewhere.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0322, 'Silent Table', 2, 'Illusion', 'Give yourself privacy by muffling sound leaving the area.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0323, 'Symbol of Mirroring', 2, 'Illusion', 'Triggered rune creates mirror images.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0324, 'Twilight Haze', 2, 'Illusion', 'Illusory fog obscures vision.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0325, 'Umbral Weapon', 2, 'Illusion', '1/rnd wielder of target touched melee weapon can reroll a failed attack roll. If reroll hits, the attacked creature suffers 1d8 cold damage, plus 1 per 2 caster levels (maximum 1d8+10).','None' );";
      stmt.executeUpdate(sql);
      //
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0326, 'Blindness/Deafness', 2, 'Necromancy', 'Makes subject blinded or deafened.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0327, 'Bloodbath', 2, 'Necromancy', 'Cause yourself and enemies to bleed.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0328, 'Blood in the Water', 2, 'Necromancy', 'While the spell is in effect, all sharks, feeders in the depths, and creatures with the blood frenzy ability in the area gain a +2 bonus to Strength and Constitution and take a -2 penalty to AC.','DF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0329, 'Bone Fists', 2, 'Necromancy', 'The bones of your targets joints grow thick and sharp, protruding painfully through the skin at the knuckles, elbows, shoulders, spine, and knees.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0330, 'Boneshaker', 2, 'Necromancy', 'Momentarily control a living or undead creatures skeleton.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0331, 'Brow Gasher', 2, 'Necromancy', 'Slashing weapon deals bleed damage to an opponent�s head.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0332, 'Command Undead', 2, 'Necromancy', 'Undead creature obeys your commands.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0333, 'Companion Life Link', 2, 'Necromancy', 'Sense whenever your companion is wounded and call out to it in a time of need.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0334, 'Curse Terrain, Lesser', 2, 'Necromancy', 'Curse an area with three mild hazards.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0335, 'Defending Bone', 2, 'Necromancy', 'You animate a bone which gives you damage reduction 5/bludgeoning.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0336, 'Defoliate', 2, 'Necromancy', 'You hurl a tiny ball of negative energy, destroying plant life either in a line 60 feet long or a 10-foot-radius spread.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0337, 'Dress Corpse', 2, 'Necromancy', 'Doctor the evidence on a corpse.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0338, 'False Life', 2, 'Necromancy', 'Gain 1d10 temporary hp + 1/level (max +10).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0339, 'Ghoul Touch', 2, 'Necromancy', 'Paralyzes one subject, which exudes stench that makes those nearby sickened.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0340, 'Languid Venom', 2, 'Necromancy', 'Delay a poisons onset and hide its presence.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0341, 'Life Pact', 2, 'Necromancy', 'Affected creatures automatically donate hp to stabilize fallen ally.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0342, 'Limp Lash', 2, 'Necromancy', 'Create a magical noose around targets head, possibly paralyzing them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0343, 'Pernicious Poison', 2, 'Necromancy', 'Target takes a -4 penalty against poison.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0344, 'Scare', 2, 'Necromancy', 'Frightens creatures of less than 6 HD.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0345, 'Sentry Skull', 2, 'Necromancy', 'Turn a severed head into a magical sentry.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0346, 'Skinsend', 2, 'Necromancy', 'Animate and possess your own skin as if it were a separate creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0347, 'Spectral Hand', 2, 'Necromancy', 'Creates disembodied glowing hand to deliver touch attacks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0348, 'Steal Voice', 2, 'Necromancy', 'Target gains the croaking spellblight.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0349, 'Stricken Heart', 2, 'Necromancy', 'Touch attack deals 2d6 damage and staggers target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0350, 'Touch of Bloodletting', 2, 'Necromancy', 'This spell causes existing wounds on a target to bleed profusely.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0351, 'Unshakable Chill', 2, 'Necromancy', 'Target is afflicted with severe cold.','None' );";
      stmt.executeUpdate(sql);
      ///
      ///
      //
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0352, 'Aboleths Lung', 2, 'Transmutation', 'Targets gain the ability to breathe water but can no longer breathe air.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0353, 'Accelerate Poison', 2, 'Transmutation', 'Hastens targeted poison�s onset.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0354, 'Adhesive Blood', 2, 'Transmutation', 'Attackers weapons stick to your gluey blood.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0355, 'Adoration', 2, 'Transmutation', 'You gain a bonus on Diplomacy checks and performance combat checks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0356, 'Air Step', 2, 'Transmutation', 'Tread unsteadily on air, with limitations.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0357, 'Alter Self', 2, 'Transmutation', 'Assume form of a Small or Medium humanoid.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0358, 'Amplify Stench', 2, 'Transmutation', 'You amplify your natural stench special ability�its save DC increases by 2, and creatures that fail their saving throws against your stench become nauseated rather than sickened.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0359, 'Angelic Aspect, Lesser', 2, 'Transmutation', 'You gain low-light vision, acid and cold resistance 5, and protection from evil.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0360, 'Animal Aspect', 2, 'Transmutation', 'You gain some of the beneficial qualities of an animal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0361, 'Ant Haul, Communal', 2, 'Transmutation', 'As ant haul, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0362, 'Badgers Ferocity', 2, 'Transmutation', 'Weapons are keen while you concentrate.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0363, 'Bears Endurance', 2, 'Transmutation', 'Subject gains +4 to Con for 1 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0364, 'Blood Armor', 2, 'Transmutation', 'Your blood hardens when you are wounded, increasing your AC.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0365, 'Blood Blaze', 2, 'Transmutation', 'Aura that makes injured creatures spray burning blood.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0366, 'Boiling Blood', 2, 'Transmutation', 'Targets take fire damage; orcs get +2 Strength.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0367, 'Bulls Strength', 2, 'Transmutation', 'Subject gains +4 to Str for 1 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0368, 'Buoyancy', 2, 'Transmutation', 'Several creatures or objects become very buoyant, floating automatically and must struggle to submerge.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0369, 'Carry Companion', 2, 'Transmutation', 'Your companion creature is transformed into a miniature statue which you can carry.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0370, 'Cats Grace', 2, 'Transmutation', 'Subject gains +4 to Dex for 1 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0371, 'Certain Grip', 2, 'Transmutation', 'You gain a +4 competence bonus on Acrobatics and Climb checks and to CMD.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0372, 'Codespeak', 2, 'Transmutation', 'Speak, read, and write a new code language.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0373, 'Darkvision', 2, 'Transmutation', 'See 60 ft. in total darkness.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0374, 'Destabilize Powder', 2, 'Transmutation', 'Ammunition in the targeted firearm is prone to misfire.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0375, 'Disfiguring Touch', 2, 'Transmutation', 'Target becomes disfigured.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0376, 'Eagles Splendor', 2, 'Transmutation', 'Subject gains +4 to Cha for 1 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0377, 'Eldritch Conduit', 2, 'Transmutation', 'Use an enemy as a point of origin for a cone, cylinder, line, or sphere spell.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0378, 'Extreme Flexibility', 2, 'Transmutation', 'Gain a bonus to AC, on Escape Artist checks, and when grappling.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0379, 'Fear the Sun', 2, 'Transmutation', 'Targets that fail the saving throw gain light blindness. If you cast this spell in the presence of bright light, any target that fails its save is blinded immediately, and dazzled starting at the beginning of its first turn.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0380, 'Fleshcurdle', 2, 'Transmutation', 'Cause target�s limbs to mutate to hamper attacks, defense, or movement.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0381, 'Fool�s Gold', 2, 'Transmutation', 'Those who possess gold pieces you have cast this spell on are more vulnerable to your magics.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0382, 'Foxs Cunning', 2, 'Transmutation', 'Subject gains +4 to Int for 1 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0383, 'Full Pouch', 2, 'Transmutation', 'You cast this spell as you draw out a consumable alchemical item to use. The item divides itself into two nearly identical copies and the newly separated one is delivered into your hand. The new item functions as the original in all ways except the copied item suffers a slight reduction in quality.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0384, 'Glide', 2, 'Transmutation', 'You take no falling damage, move 60 ft./round while falling.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0385, 'Greensight', 2, 'Transmutation', 'You can see through thick plant matter as though it were transparent.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0386, 'Hidden Knowledge', 2, 'Transmutation', 'You purposely forget some information which is transcribed upon you in the form of a tattoo.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0387, 'Human Potential', 2, 'Transmutation', 'The target chooses one ability score and gains a +2 enhancement bonus to that ability score. The bonus confers the usual benefit to skills and abilities based on the ability enhanced, but does not affect bonus spells or skill ranks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0388, 'Kinetic Reverberation', 2, 'Transmutation', 'Channels the force of an enemy�s attack back into its weapon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0389, 'Knock', 2, 'Transmutation', 'Opens locked or magically sealed door.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0390, 'Levitate', 2, 'Transmutation', 'Subject moves up and down at your direction.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0391, 'Magic Siege Engine', 2, 'Transmutation', 'Siege gains +1 on targeting and damage rolls.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0392, 'Make Whole', 2, 'Transmutation', 'Repairs an object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0393, 'Masterwork Transformation', 2, 'Transmutation', 'Make a normal item into a masterwork one.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0394, 'Merge with Familiar', 2, 'Transmutation', 'Your familiar merges harmlessly into your body.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0395, 'Mirror Hideaway', 2, 'Transmutation', 'As many as eight creatures hide in an extradimensional space.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0396, 'Molten Orb', 2, 'Transmutation', 'Molten metal splash weapon deals 2d6 fire damage plus ongoing damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0397, 'Owls Wisdom', 2, 'Transmutation', 'Subject gains +4 to Wis for 1 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0398, 'Pyrotechnics', 2, 'Transmutation', 'Turns fire into blinding light or thick smoke.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0399, 'Quick Change', 2, 'Transmutation', 'Use change shape as a swift action and surprise foes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0400, 'Ravens Flight', 2, 'Transmutation', 'You can cast this spell only if it is the first action you take on your turn. In a burst of shadowy feathers, you turn into a Tiny blurred shape reminiscent of a black raven until the beginning of your next turn.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0401, 'Recoil Fire', 2, 'Transmutation', 'Ammunition in the targeted firearm generates excessive recoil.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0402, 'Reinforce Armaments, Communal', 2, 'As reinforce armaments, but you may divide the duration among objects touched.', 'description','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0403, 'Rope Trick', 2, 'Transmutation', 'As many as eight creatures hide in extradimensional space.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0404, 'Scale Spikes', 2, 'Transmutation', 'When the target is affected by this spell, its scales grow jagged spikes. These spikes act like +1 armor spikes. The subject is automatically considered proficient with these scale spikes.','DF/M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0405, 'Sculpt Simulacrum', 2, 'Transmutation', 'Alter a simulacrums appearance.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0406, 'Silk To Steel', 2, 'Transmutation', 'Use a scarf as a shield or whip.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0407, 'Snow Shape', 2, 'Transmutation', 'As stone shape except with snow. You can create simple weapons composed of ice that last for 24 hours before melting.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0408, 'Spider Climb', 2, 'Transmutation', 'Grants ability to walk on walls and ceilings.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0409, 'Splinter Spell Resistance', 2, 'Transmutation', 'You create an aura around the target weapon that weakens a foe�s spell resistance with each successful attack.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0410, 'Stabilize Powder', 2, 'Transmutation', 'Ammunition in the targeted firearm is less likely to misfire.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0411, 'Staggering Fall', 2, 'Transmutation', 'Cause additional damage to a falling creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0412, 'Steal Breath', 2, 'Transmutation', 'You pull the breath from a creatures lungs, dealing damage and leaving it unable to speak, use breath weapons, or cast spells with verbal components.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0413, 'Steal Size', 2, 'Transmutation', 'Reduce one humanoids size by one size category (if it is larger than you) and you grow one size category.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0414, 'Stone Throwing', 2, 'Transmutation', 'The subject gains the rock throwing and rock catching abilities usable with solid, inflexible objects with hardness of at least 5.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0415, 'Strong Wings', 2, 'Transmutation', 'Touched targets wings grow more powerful, increasing its fly speed by +10 ft. and maneuverability by one category (to a maximum of good).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0416, 'Tattoo Potion', 2, 'Transmutation', 'Cause a potion to turn into a spell tattoo when it is drunk.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0417, 'Tears to Wine', 2, 'Transmutation', 'This spell turns nonmagic liquids into mead or wine of average quality.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0418, 'Telekinetic Assembly', 2, 'Transmutation', 'Assembles a siege engine using 1 fewer worker for every two caster levels.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0419, 'Telekinetic Volley', 2, 'Transmutation', 'Up to one touched object per level weighing up to 5 lbs. each levitates in your space and you can attack with them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0420, 'Thunder Fire', 2, 'Transmutation', 'Ammunition in the targeted firearm deafens opponents.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0421, 'Time Shudder', 2, 'Transmutation', 'Nearby creatures are affected by haste or slow each round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0422, 'Tremor Blast', 2, 'Transmutation', 'You create a minor earthquake that can trip creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0423, 'Twisted Space', 2, 'Transmutation', 'Targeted creature�s attacks target a random square instead of the intended target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0424, 'Visualization of the Body', 2, 'Transmutation', 'You focus your mind on one aspect of your body, aligning the energies within your body to enhance that element.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0425, 'Visualization of the Mind', 2, 'Transmutation', 'You enhance a single aspect of your mind, nurturing and empowering it.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0426, 'Whispering Wind', 2, 'Transmutation', 'Sends a short message 1 mile/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0427, 'Winged Sword', 2, 'Transmutation', 'Target weapon grows small feathered wings and acts as if it had the throwing weapon special ability.','None' );";
      stmt.executeUpdate(sql);
      //level 2 done
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0428, 'Ablative Sphere', 3, 'Abjuration', 'An immobile, crystalline, globe provides you with improved cover but does not block line of sight or line of effect.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0429, 'Blade Snare', 3, 'Abjuration', 'This spell creates an invisible magic field that does not stop weapons (whether manufactured or natural) from moving toward you, but impedes their motion when they are retracted.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0430, 'Cloak of Winds', 3, 'Abjuration', 'Creates a screen of wind around you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0431, 'Dispel Magic', 3, 'Abjuration', 'Cancels one magical spell or effect.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0432, 'Explosive Runes', 3, 'Abjuration', 'Deals 6d6 damage when read.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0433, 'Guardian Monument, Lesser', 3, 'Abjuration', 'An unattended, non-magical object you touch emanates a shimmering aura that protects humans in the area. Humans gain DR 2/magic while in the area. If the object is touched or moves the effect is suppressed but resumes if the object is put back or when no longer touched. If the touched object is a monument to human achievement, the area increases to a 60-foot radius.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0434, 'Magic Circle against Chaos/Evil/Good/Law', 3, 'Abjuration', 'As protection spells, but 10-ft. radius and 10 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0435, 'Nondetection', 3, 'Abjuration', 'Hides subject from divination, scrying.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0436, 'Protection from Arrows, Communal', 3, 'Abjuration', 'As protection from arrows, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0437, 'Protection from Arrows, Communal', 3, 'Abjuration', 'As protection from arrows, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0438, 'Protection from Energy', 3, 'Abjuration', 'Absorbs 12 points/level of damage from one kind of energy.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0439, 'Quell Energy', 3, 'Abjuration', 'You reduce the target creature’s ability to tap into a single energy type (acid, cold, electricity, fire, or sonic) of your choice. This reduces damage of the selected type the creature deals with spells, spell-like abilities, and supernatural abilities by 10 points.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0440, 'Resist Energy, Communal', 3, 'Abjuration', 'As resist energy, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0441, 'Scales of Deflection', 3, 'Abjuration', 'Brilliant draconic iconography matching your draconic heritage.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0442, 'Selective Alarm', 3, 'Abjuration', 'As alarm, but only against selected creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0443, 'Shield Companion', 3, 'Abjuration', 'As shield other, but affecting your companion creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0444, 'Stunning Barrier, Greater', 3, 'Abjuration', 'Magical field grants a +2 bonus to AC and on saves, and stuns multiple creatures attacking you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0445, 'Ablative Barrier', 3, 'Conjuration', 'Surrounds the target with layers of force.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0446, 'Aqueous Orb', 3, 'Conjuration', 'Creates rolling sphere of water.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0447, 'Ash Storm', 3, 'Conjuration', 'Hamper vision and movement.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0448, 'Conjure Carriage', 3, 'Conjuration', 'Create a fine carriage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0449, 'Force Anchor', 3, 'Conjuration', 'Ranged touch attack deals a target 1d4 points of force damage per 2 caster levels (max 5d4) and becomes lodged in the target limiting it’s movement.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0450, 'Gloomblind Bolts', 3, 'Conjuration', 'Ranged touch attack that deals 4d6 negative energy, 1 bolt +1/four levels (max 3).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0451, 'Ice Spears', 3, 'Conjuration', 'Cause icy spears to strike foes for 2d6 piercing and 2d6 cold damage; can knock foes down.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0452, 'Infernal Challenger', 3, 'Conjuration', 'This spell summons a bearded devil, causing it to appear where you designate.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0453, 'Mad Monkeys', 3, 'Conjuration', 'Summon a swarm of mischievous monkeys.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0454, 'Nauseating Trail', 3, 'Conjuration', 'Creature leaves a trail of stinking cloud squares.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0455, 'Pellet Blast', 3, 'Conjuration', 'Creates an explosion of conjured metal pellets.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0456, 'Penumbral Disguise', 3, 'Conjuration', 'You mask your features with shadowy illumination.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0457, 'Phantom Driver', 3, 'Conjuration', 'Conjures a phantom to drive vehicles.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0458, 'Phantom Steed', 3, 'Conjuration', 'Magic horse appears for 1 hour/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0459, 'Planar Inquiry', 3, 'Conjuration', 'This spell calls a creature from another plane to your precise location, functioning like lesser planar ally except as noted.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0460, 'Rain of Frogs', 3, 'Conjuration', 'Summon a swarm of poisonous frogs.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0461, 'Returning Weapon, Communal', 3, 'Conjuration', 'As returning weapon, but you may divide the duration among weapons touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0462, 'Sepia Snake Sigil', 3, 'Conjuration', 'Creates text symbol that immobilizes reader.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0463, 'Silver Darts', 3, 'Conjuration', 'Cone of silver darts deals 1d6 piercing damage/level, less against armored targets','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0464, 'Sleet Storm', 3, 'Conjuration', 'Hampers vision and movement.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0465, 'Spiked Pit', 3, 'Conjuration', 'As create pit, but filled with spikes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0466, 'Stinking Cloud', 3, 'Conjuration', 'Nauseating vapors, 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0467, 'Storm Step', 3, 'Conjuration', 'You are able to transport yourself a short distance by taking the form of a furious, sizzling bolt of elemental electricity.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0468, 'Summon Monster III', 3, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0469, 'Summon Totem Creature', 3, 'Conjuration', 'As summon nature’s ally III except for different creatures as options.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0470, 'Sundered Serpent Coil', 3, 'Conjuration', 'As black tentacles, except it creates a Large decapitated snake, which erupts from the ground and grapples a creature you specify within its 5-foot reach. As a standard action, you can command the snake to release its grappled target and direct it to attack a different creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0471, 'Swarm of Fangs', 3, 'Conjuration', 'You summon a swarm of thousands of animate, flying teeth in a 10-foot-by-10-foot cube.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0472, 'Urban Step', 3, 'Conjuration', 'Step into one doorway and out another.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0473, 'Waves of Blood', 3, 'Conjuration', 'A cone of blood pushes creatures, sickens them, and makes the ground slick.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0474, 'Web Bolt', 3, 'Conjuration', 'You launch a ball of webbing at a target, which must make a save or be affected as if by a web spell occupying only the creature’s space.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0475, 'Arcane Sight', 3, 'Divination', 'Magical auras become visible to you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0476, 'Aura Sight', 3, 'Divination', 'Alignment auras become visible to you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0477, 'Blood Biography', 3, 'Divination', 'Learn about a creature with its blood.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0478, 'Clairaudience/Clairvoyance	', 3, 'Divination', 'Hear or see at a distance for 1 min./level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0479, 'Detect Anxieties', 3, 'Divination', 'Learn what makes creatures anxious.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0480, 'Detect Desires', 3, 'Divination', 'Learn what creatures desire.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0481, 'Discern Value', 3, 'Divination', 'You can quickly analyze the monetary value of objects and identify which are most valuable to an average trader.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0482, 'Find Fault', 3, 'Divination', 'You instantly learn many of the target’s weaknesses.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0483, 'Harrowing', 3, 'Divination', 'You use a Harrow deck to tell a fortune for yourself or someone else.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0484, 'Insect Scouts', 3, 'Divination', 'This spell summons one or more vermin to investigate a single location or building you can see. Your scouts must spend 1d6 hours investigating the target location, but need no oversight.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0485, 'Locate Weakness', 3, 'Divination', 'You roll damage twice when you roll damage for a critical hit and take the best damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0486, 'Pack Empathy', 3, 'Divination', 'Create an empathic bond with allies.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0487, 'Perfect Placement', 3, 'Divination', 'Affected creatures gain tactical knowledge and maximize their efficiency on the field of battle.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0488, 'Pierce Disguise', 3, 'Divination', 'See through low-level magical disguises.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0489, 'See Beyond', 3, 'Divination', 'You attune your mind and your sight to the hidden world of spirits.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0490, 'Seek Thoughts', 3, 'Divination', 'Detects thinking creatures thoughts.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0491, 'Share Language, Communal', 3, 'Divination', 'As share language, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0492, 'Spherescry', 3, 'Divination', 'Remotely view through spheres that have consumed some portion of the caster’s body.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0493, 'Spirit Bonds', 3, 'Divination', 'You know the direction, relative distance to, and condition of target creatures or objects.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0494, 'Tongues', 3, 'Divination', 'Speak and understand any language.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0495, 'Unravel Destiny', 3, 'Divination', 'A target suffers penalties to checks depending on how many hero points it has, and takes damage if it uses them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0496, 'Voluminous Vocabulary', 3, 'Divination', 'Grant ability to speak, read, and write one or more languages for 8 hours.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0497, 'Burdened Thoughts', 3, 'Enchantment', 'Target creature gains heavy encumbrance and is cannot fly.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0498, 'Charitable Impulse', 3, 'Enchantment', 'Affected creature practices nonviolent combat behaviors according to a list of priorities.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0499, 'Deep Slumber', 3, 'Enchantment', 'Puts 10 HD of creatures to sleep.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0500, 'Deflect Blame', 3, 'Enchantment', 'Blame someone else for your action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0501, 'Draconic Malice', 3, 'Enchantment', 'You surround yourself with a palpable aura of draconic fear and dread.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0502, 'Heroism', 3, 'Enchantment', 'Gives +2 bonus on attack rolls, saves, skill checks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0503, 'Hold Person', 3, 'Enchantment', 'Paralyzes one humanoid for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0504, 'Lover’s Vengeance', 3, 'Enchantment', 'You inspire yourself or a lover to a vengeful rage against a chosen enemy.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0505, 'Matchmaker', 3, 'Enchantment', 'Cause two creatures to fall in love.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0506, 'Mindlocked Messenger', 3, 'Enchantment', 'Target gains a message that can be given only to its intended recipient.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0507, 'Nixie’s lure', 3, 'Enchantment', 'Unearthly and infectious song that seductively summons up to 24 HD of creatures and fascinate them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0508, 'Open Book', 3, 'Enchantment', 'Make it permanently easier to learn more about a target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0509, 'Psychic Leech', 3, 'Enchantment', 'The target experiences feelings of ennui and lethargy, becoming fatigued for the spell’s duration. While the target is fatigued and is within the spell’s range, you gain a +2 enhancement bonus to Strength and Dexterity.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0510, 'Pugwampi’s Grace', 3, 'Enchantment', 'One creature rolls 2d20 whenever it needs to roll a d20, and must take the lower result.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0511, 'Rage', 3, 'Enchantment', 'Gives +2 to Str and Con, +1 on Will saves, –2 to AC.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0512, 'Reckless Infatuation', 3, 'Enchantment', 'Target is compelled to stay near another.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0513, 'Shadow Enchantment', 3, 'Enchantment', 'You use material from the Shadow Plane to cast a quasi-real, illusory version of a psychic, sorcerer, or wizard enchantment spell of 2nd level or lower.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0514, 'Stage Fright', 3, 'Enchantment', 'You fill your targets with the sudden fear of failure. A creature that fails its saving throw takes a –4 penalty on ability checks, skill checks, and any checks that require concentration (such as casting a spell in difficult circumstances or operating a complex device).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0515, 'Suggestion', 3, 'Enchantment', 'Compels a subject to follow stated course of action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0516, 'Unadulterated Loathing', 3, 'Enchantment', 'Target is compelled to avoid another creature.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0517, 'Air Geyser', 3, 'Evocation', 'Blast of air deals 2d6 bludgeoning damage and knocks opponent upward.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0518, 'Battering Blast', 3, 'Evocation', 'You hurl a fist-sized ball of force resembling a sphere of spikes to ram a designated creature or object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0519, 'BlackLight', 3, 'Evocation', 'You create an area of darkness impenetrable even to darkvision, but you can see normally within it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0520, 'Call the Void', 3, 'Evocation', 'An aura of nothingness damages and suffocates creatures adjacent to you.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0521, 'Campfire Wall', 3, 'Evocation', 'Creates a shelter around a campfire.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0522, 'Chain of Perdition', 3, 'Evocation', 'Creates a floating chain of force.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0523, 'Channel the Gift', 3, 'Evocation', 'Channel magical power into target to fuel their spellcasting. The next 3rd level or lower spell target casts does not expend a spell slot; instead you use your spell slot to power their spell.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0524, 'Contact Entity II', 3, 'Evocation', 'Ask more powerful eldritch entities to find and converse with you.','M' );";
      stmt.executeUpdate(sql);

      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0525, 'Contingent Action', 3, 'Evocation', 'Set the condition for triggering a targets readied standard, move, or swift action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0526, 'Daylight', 3, 'Evocation', '60-ft. radius of bright light.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0527, 'Diamond Spray', 3, 'Evocation', 'A cone of tiny, sparkling slivers as hard and sharp as filed diamonds springs from your outstretched fingers at tremendous speed.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0528, 'Distracting Cacophony', 3, 'Evocation', 'Noise makes it difficult to cast.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0529, 'Draconic Reservoir', 3, 'Evocation', 'Subject can absorb energy damage and enhance melee attacks with it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0530, 'Elemental Aura', 3, 'Evocation', 'Creates an aura of energy around you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0531, 'Final Sacrifice', 3, 'Evocation', 'You disrupt the conjuring energies within a summoned creature, causing it to violently explode. If the target fails its Fortitude save, it is immediately slain and all creatures within 20 feet of the target take 1d4 points of damage per spell level of the summoning spell that conjured the target','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0532, 'Fireball', 3, 'Evocation', '1d6 damage per level, 20-ft. radius.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0533, 'Firestream', 3, 'Evocation', '2d6 points of fire damage in a 20-ft. line, that can change each round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0534, 'Force Punch', 3, 'Evocation', 'Target takes force damage and is pushed away.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0535, 'Heatstroke', 3, 'Evocation', 'As ray of exhaustion plus 1d4 nonlethal damage and characters wearing heavy clothing or armor of any sort take a –4 penalty on their saves.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0536, 'Hydraulic Torrent', 3, 'Evocation', 'Creates torrent of water that bull rushes any creature in its path.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0537, 'Lightning Bolt', 3, 'Evocation', 'Electricity deals 1d6/level damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0538, 'Motes of Dusk And Dawn', 3, 'Evocation', 'When you cast this spell, you create up to four motes that shed light or darkness in a 20-foot-radius, increasing or decreasing the illumination level by up to two categories. You decide whether each individual mote sheds light or darkness when the spell is cast.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0539, 'Pain Strike', 3, 'Evocation', 'Inflicts 1d6 nonlethal damage 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0540, 'Sheet Lightning', 3, 'Evocation', 'Deal electricity damage and daze creatures in a 20-foot spread.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0541, 'Spotlight', 3, 'Evocation', 'You create a mobile area of bright light centered on one target while simultaneously suppressing other light sources surrounding it.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0542, 'Thunderstomp, Greater', 3, 'Evocation', 'Trip multiple creatures within range.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0543, 'Tiny Hut', 3, 'Evocation', 'Creates shelter for 10 creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0544, 'Trial of Fire and Acid', 3, 'Evocation', 'The target creature is covered in burning acid that deals 1d6 points of acid damage and 1d6 points of fire damage each round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0545, 'Twilight Knife', 3, 'Evocation', 'Floating knife attacks with you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0546, 'Vengeful Comets', 3, 'Evocation', 'Creates 1 comet/4 levels; provides fire protection and shoots comets at spellcasting foes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0547, 'Wall of Split Illumination	', 3, 'Evocation', 'An immobile curtain of illumination springs into existence.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0548, 'Wind Wall', 3, 'Evocation', 'Deflects arrows, smaller creatures, and gases.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0549, 'Adjustable Disguise', 3, 'Illusion', 'As disguise self, but you can change the disguise as a swift action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0550, 'Appearance of Life', 3, 'Illusion', 'Undead appear to be alive.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0551, 'Audiovisual Hallucination', 3, 'Illusion', 'Create a phantasm with auditory and visual effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0552, 'Dazzling Blade, Mass', 3, 'Illusion', 'Multiple weapons become shiny, granting bonuses to combat maneuvers.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0553, 'Displacement', 3, 'Illusion', 'Attacks miss subject 50% of the time.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0554, 'Fearsome Duplicate', 3, 'Illusion', 'Make a monstrously distorted duplicate of you and control it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0555, 'Illusory Poison', 3, 'Illusion', 'Coat a weapon with phantasmal poison.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0556, 'Illusory Script', 3, 'Illusion', 'Only select creatures can read text.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0557, 'Invisibility Sphere	', 3, 'Illusion', 'Makes everyone within 10 ft. invisible.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0558, 'Isolate', 3, 'Illusion', 'You cause the target to become invisible and silent, but only to his allies.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0559, 'Loathsome Veil', 3, 'Illusion', 'Nauseate and/or sicken weak creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0560, 'Major Image', 3, 'Illusion', 'As silent image, plus sound, smell and thermal effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0561, 'Minor Dream', 3, 'Illusion', 'As dream but messenger is you or a gnome, and the message cannot be longer than 20 words.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0562, 'Phantasmal Affliction', 3, 'Illusion', 'Convince a target that it contracted an affliction.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0563, 'Phantasmal Reminder', 3, 'Illusion', 'Create a memory loop of a successful attack made against the target, forcing its conscious mind to recall the details of the attack in such excruciating detail that its physical body is racked by the recollection.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0564, 'Shadowmind', 3, 'Illusion', 'You dim your targets perceptions of light and shadow, convincing them the space they occupy is dark.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0565, 'Vision of Hell', 3, 'Illusion', 'Illusory hellscape makes creatures shaken.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0566, 'Wall of Nausea', 3, 'Illusion', 'Creatures that pass through the wall are nauseated and might fall prone.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0567, 'Accursed Glare', 3, 'Necromancy', 'Cause one creature to reroll attacks and saving throws, taking the worse result','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0568, 'Animate Dead, Lesser', 3, 'Necromancy', 'Create one skeleton or zombie.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0569, 'Aura of Cannibalism', 3, 'Necromancy', 'You emanate an aura that saps the strength of others of your kind and channels their energy into you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0570, 'Barrow Haze', 3, 'Necromancy', 'Fog obscures the vision of others and extends the range of your hexes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0571, 'Deathwine', 3, 'Necromancy', 'Turn a healing potion into a pool of necromantic energy that does not heal but instead increases the caster level of the next necromancy spell you cast in the next minute.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0572, 'Eldritch Fever', 3, 'Necromancy', 'Target gains the eldritch ague spellblight.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0573, 'Gentle Repose', 3, 'Necromancy', 'Preserves one corpse.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0574, 'Halt Undead', 3, 'Necromancy', 'Immobilizes undead for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0575, 'Healing Thief', 3, 'Necromancy', 'You siphon half of all magical healing that the targeted creature receives.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0576, 'Howling Agony', 3, 'Necromancy', 'Screaming pain limits the target’s actions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0577, 'Hydrophobia', 3, 'Necromancy', 'Targets in the area must succeed at a Will save or become deathly afraid of drowning.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0578, 'Ki Leech', 3, 'Necromancy', 'Add to your ki pool when you critically hit.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0579, 'Malediction', 3, 'Necromancy', 'Touch to kill an unconscious creature and gain a number of temporary hero points depending on how powerful it was.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0580, 'Marionette Possession', 3, 'Necromancy', 'As magic jar, but limited to line of sight.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0581, 'Ray of Exhaustion', 3, 'Necromancy', 'Ray makes subject exhausted.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0582, 'Sands of Time', 3, 'Necromancy', 'Target temporarily ages.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0583, 'Symbol of Exsanguination', 3, 'Necromancy', 'Triggered rune causes nearby creatures to bleed.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0584, 'Toxic Gift', 3, 'Necromancy', 'Target suffers the effect of the poison in you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0585, 'Unliving Rage', 3, 'Necromancy', 'As rage, except affecting only undead.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0586, 'Vampiric Touch', 3, 'Necromancy', 'Touch deals 1d6 damage per two levels; caster gains damage as temporary hp.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0587, 'Air Breathing', 3, 'Transmutation', 'The transmuted creatures can breathe air freely.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0588, 'Ancestral Regression', 3, 'Transmutation', 'Transform a drow into a surface elf.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0589, 'Anchored Step', 3, 'Transmutation', 'Vines beneath your feet stabilize you but slow you down.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0590, 'Anthropomorphic Animal', 3, 'Transmutation', 'Animal becomes bipedal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0591, 'Ape Walk', 3, 'Transmutation', 'Target gains climb 30 and +8 racial bonus on Climb skill checks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0592, 'Aristocrat’s Nightmare', 3, 'Transmutation', 'Temporarily curse a creature so its touch lessens the value of coins it touches.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0593, 'Armor Lock', 3, 'Transmutation', 'You lock up an opponent in their own armor, entangling or staggering them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0594, 'Assume Appearance', 3, 'Transmutation', 'Use a creature’s corpse to adopt its form.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0595, 'Beast Shape I', 3, 'Transmutation', 'You take the form and some of the powers of a Small or Medium animal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0596, 'Blast Barrier', 3, 'Transmutation', 'Creates unstable wall for cover that eventually explodes for 2d6 slashing damage plus 1d6 sonic/3 levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0597, 'Blink', 3, 'Transmutation', 'You randomly vanish and reappear for 1 round per level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0598, 'Blood Scent', 3, 'Transmutation', 'Gain scent ability against injured creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0599, 'Blood Sentinel', 3, 'Transmutation', 'Animate an animal sculpture to be your temporary familiar.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0600, 'Blot', 3, 'Transmutation', 'Ruins writing.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0600, 'Burrow', 3, 'Transmutation', 'Target gains a burrow speed of 15.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0601, 'Control Vermin', 3, 'Transmutation', 'You and a number of allies less than or equal to your caster level designated upon casting can use Handle Animal and Ride checks to influence or control the targeted vermin as if they were animals and had animal-level intelligence.','DF/M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0602, 'Countless Eyes', 3, 'Transmutation', 'Extra eyes give all-around vision.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0603, 'Darkvision, Communal', 3, 'Transmutation', 'As darkvision, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0604, 'Deft Digits', 3, 'Transmutation', 'You animate a glove with your own hand from a distance moving as you direct it with a fly speed of 30 feet and average maneuverability.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0605, 'Devolution', 3, 'Transmutation', 'Target eidolon temporarily loses 1 evolution +1/five levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0606, 'Disable Construct', 3, 'Transmutation', 'Touch attack makes a construct helpless for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0607, 'Enter Image', 3, 'Transmutation', 'Transfers your consciousness to an object bearing your likeness.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0608, 'Eruptive Pustules', 3, 'Transmutation', 'Acid boils burst when you are attacked.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0609, 'Excruciating Deformation', 3, 'Transmutation', 'Target takes Dex and Con damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0610, 'Fins to Feet', 3, 'Abjuration', 'Transform the targets fins, flippers, or tail into legs and feet.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0611, 'Fire Trail', 3, 'Transmutation', 'Trail of flame that follows your movements and deal 1d6+1 per CL (max +10).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0612, 'First World Revisions', 3, 'Transmutation', 'As ancestral regression, except as noted.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0613, 'Flame Arrow', 3, 'Transmutation', 'Arrows deal +1d6 fire damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0614, 'Flash Fire', 3, 'Transmutation', 'Ammunition in the targeted firearm creates a tremendous flash capable of blinding the weapon’s bearer and those around him.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0615, 'Fly', 3, 'Transmutation', 'Subject flies at speed of 60 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0616, 'Form of the Alien Dragon I', 3, 'Transmutation', 'You become a Medium esoteric or outer dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0617, 'Form of the Exotic Dragon I', 3, 'Transmutation', 'You become a Medium imperial or primal dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0618, 'Fractions of Heal and Harm', 3, 'Transmutation', 'Heal yourself when you cast your next damaging spell.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0619, 'Gaseous Form', 3, 'Transmutation', 'Subject becomes insubstantial and can fly slowly.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0620, 'Haste', 3, 'Transmutation', 'One creature/level moves faster, +1 on attack rolls, AC, and Reflex saves.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0621, 'Heart of the Metal', 3, 'Transmutation', 'Enable weapons to overcome DR like adamantine, cold iron, or silver.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0622, 'Hollow Blades', 3, 'Transmutation', 'Target creatures melee and natural attacks deal damage as if it were one size category smaller.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0623, 'Hostile Levitation', 3, 'Transmutation', 'Levitates the targeted creature up off the ground.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0624, 'Imbue With Addiction', 3, 'Transmutation', 'Target becomes addicted to drug used in casting; if target was addicted to the drug in the past, it takes a –4 penalty on its saving throw.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0625, 'Improve trap', 3, 'Transmutation', 'Improve one specific element of a trap.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0626, 'Keen Edge', 3, 'Transmutation', 'Doubles normal weapon’s threat range.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0627, 'Magic Weapon, Greater', 3, 'Transmutation', 'Weapon gains +1 bonus/four levels (max +5).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0628, 'Monstrous Extremities', 3, 'Transmutation', 'You change one of the extremities of the creature touched—arms or legs only—into another shape of approximately the same size and mass. You can choose a tentacle, a hoof, or a wing.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0629, 'Monstrous Physique I', 3, 'Transmutation', 'Take the form and some of the powers of a Small or Medium monstrous humanoid.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0630, 'Paragon Surge', 3, 'Transmutation', 'Gain +2 enhancement bonus to Dex and Int and gain one feat for which you meet the prerequisites.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0631, 'Polymorph Familiar', 3, 'Transmutation', 'Give your familiar the shape of another animal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0632, 'Prehensile Pilfer', 3, 'Transmutation', 'Use tail to make a dirty trick or steal combat maneuver as a swift action when making full-attack action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0633, 'Pup Shape', 3, 'Transmutation', 'Transforms a single animal or magical beast into a younger and cuter version of itself for a short period of time.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0634, 'Raging Rubble', 3, 'Transmutation', 'Swarm of stones damaging (1d6) and distracting anything within it.','DF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0635, 'Resinous Skin', 3, 'Transmutation', 'You gain DR 5/piercing and +4 to CMD against disarm attempts.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0636, 'Scale Spikes, Greater', 3, 'Transmutation', 'As scale spikes, except that the spikes growing out of the scales have an enhancement bonus on attack and damage rolls equal to +1 for every 4 caster levels (maximum +5). This bonus does not allow the spikes to bypass damage reduction aside from magic.','DF/M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0637, 'Secret Page', 3, 'Transmutation', 'Changes one page to hide its real content.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0638, 'Shifting Sand', 3, 'Transmutation', 'Creates difficult terrain and erases tracks, can carry along some creatures and objects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0639, 'Shrink Item', 3, 'Transmutation', 'Object shrinks to one-sixteenth size.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0640, 'Slow', 3, 'Transmutation', 'One subject/level takes only one action/round, –1 to AC, Reflex saves, and attack rolls.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0641, 'Spellsword', 3, 'Transmutation', 'You can hide a rod or staff in an extradimensional space within a target weapon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0642, 'Spider Climb, Communal', 3, 'Transmutation', 'As spider climb, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0643, 'Strangling Hair', 3, 'Transmutation', 'Your hair animates and grapples.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0644, 'Tail Strike', 3, 'Transmutation', 'You grow a draconic tail (clothing and armor adjust as necessary), or if you already have a tail, it takes on a draconic appearance.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0645, 'Touch Injection', 3, 'Transmutation', 'You can deliver an infusion, elixir, poison, or potion as a touch attack.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0646, 'Undead Anatomy I', 3, 'Transmutation', 'Take the form and some of the powers of a Small or Medium undead.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0647, 'Versatile Weapon', 3, 'Transmutation', 'Weapon bypasses some DR.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0648, 'Water Breathing', 3, 'Transmutation', 'Subjects can breathe underwater.','None' );";
      stmt.executeUpdate(sql);
      //end of level 3
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0649, 'Transmutation', 4, 'Abjuration', 'Interfere with nearby teleportation effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0650, 'Curse of Magic Negation', 4, 'Abjuration', 'Target gains the negated spellblight.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0651, 'Dimensional Anchor', 4, 'Abjuration', 'Bars extradimensional movement.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0652, 'Dream Shield', 4, 'Abjuration', 'You ward the target’s mind against intrusion and influence while she is unconscious.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0653, 'Enchantment Foil', 4, 'Abjuration', 'Trick opponents who try to cast enchantments on you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0654, 'Fire Trap', 4, 'Abjuration', 'Opened object deals 1d4 damage + 1/level.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0655, 'Firewalkers Meditation', 4, 'Abjuration', 'You focus your mind on blocking out pain, allowing your body to endure punishments that would be otherwise unbearable.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0656, 'Globe of Invulnerability, Lesser', 4, 'Abjuration', 'Stops 1st- through 3rd-level spell effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0657, 'Medusas Bane', 4, 'Abjuration', 'This spell causes your eyes to take on a silvery mirror-like quality, transforming your eyes into metallic-looking orbs that reflect the world you see.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0658, 'Nondetection, Communal', 4, 'Abjuration', 'As nondetection, but you may divide the duration among creatures touched.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0659, 'Protection from Energy, Communal', 4, 'Abjuration', 'As protection from energy, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0660, 'Remove Curse', 4, 'Abjuration', 'Frees object or person from curse.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0661, 'Spellcrash, Lesser', 4, 'Abjuration', 'Target loses a 3rd-level prepared spell or spell slot.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0662, 'Stoneskin', 4, 'Abjuration', 'Grants DR 10/adamantine.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0663, 'Suppress Primal Magic', 4, 'Abjuration', 'Prevent primal magic events from occurring in a 10-ft. radius around you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0664, 'Tough Crowd', 4, 'Abjuration', 'You fortify your allies against attempts to control or mislead them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0665, 'True Form', 4, 'Abjuration', 'Removes polymorph effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0666, 'Ward Shield', 4, 'Abjuration', 'Your shield is effective at resisting some types of spells.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0667, 'Acid Pit', 4, 'Conjuration', 'Creates a pit with a layer of acid on the bottom.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0668, 'Bind Sage', 4, 'Conjuration', 'Similar to planar binding but used to call a single caulborn only.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0669, 'Black Tentacles', 4, 'Conjuration', 'Tentacles grapple all creatures within a 20-ft. spread.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0670, 'Celestial Healing, Greater', 4, 'Conjuration', 'As celestial healing, except the target gains fast healing 4 and the target radiates the aura of a good cleric.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0671, 'Conjure Deadfall', 4, 'Conjuration', 'You conjure a large metal cube covered in sharp spikes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0672, 'Create Armaments', 4, 'Conjuration', 'You create one non-magical weapon, shield, or set of armor but it might be broken.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0673, 'Dimension Door', 4, 'Conjuration', 'Teleports you a short distance.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0674, 'Fleshworm Infestation', 4, 'Conjuration', 'Worms deal hp and Dex damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0675, 'Ghost Wolf', 4, 'Conjuration', 'Conjure a Large, quasi-real, wolf-like creature made of black smoke that radiates fear and functions as phantom steed, and which can make attacks.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0676, 'Infernal Healing, Greater', 4, 'Conjuration', 'Touch a creature with devils blood, giving it fast healing 4.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0677, 'Master’s Escape', 4, 'Conjuration', 'You create an extradimensional link between yourself and one summoned creature you control that allows you to switch places. After casting master’s escape, you can teleport to your summoned creature’s space as a swift action, causing your summoned creature to teleport to your former space','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0678, 'Minor Creation', 4, 'Conjuration', 'Creates one cloth or wood object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0679, 'Phantom Chariot', 4, 'Conjuration', 'Conjures a quasi-real heavy chariot pulled by four horses.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0680, 'Phantom Steed, Communal', 4, 'Conjuration', 'As phantom steed, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0681, 'Secure Shelter', 4, 'Conjuration', 'Creates sturdy cottage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0682, 'Solid Fog', 4, 'Conjuration', 'Blocks vision and slows movement.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0683, 'Summon Accuser', 4, 'Conjuration', 'Summons a single accuser devil from Hell to do your bidding.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0684, 'Summon Monster IV', 4, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0685, 'Touch of Slime', 4, 'Conjuration', 'Touch infests a target with green slime.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0686, 'Trade Items', 4, 'Conjuration', 'Swap a focus object with a target object.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0687, 'Akashic Communion', 4, 'Divination', 'Attempt to gain a glimpse of some specific event from the Akashic Record.','M/DF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0688, 'Arcane Eye', 4, 'Divination', 'Invisible floating eye moves 30 ft./round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0689, 'Detect Scrying', 4, 'Divination', 'Alerts you to magical eavesdropping.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0690, 'Insect Spies', 4, 'Divination', 'Use magic beetles as spies.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0691, 'Locate Creature', 4, 'Divination', 'Indicates direction to familiar creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0692, 'Meticulous Match', 4, 'Divination', 'Determine if two things are identical.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0693, 'Named Bullet', 4, 'Divination', 'Imbues ammunition with accuracy against a specific creature type.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0694, 'Scrying', 4, 'Divination', 'Spies on subject from a distance.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0695, 'Share Senses', 4, 'Divination', 'See/hear/smell what your familiar is.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0696, 'Symbol of Revelation', 4, 'Divination', 'Triggered symbol reveals illusions.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0697, 'Tongues, Communal', 4, 'Divination', 'As tongues, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0698, 'Vicarious View', 4, 'Divination', 'Plant a scrying sensor that you can use to spy on a creature, object, or location.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0699, 'Watchful Animal', 4, 'Divination', 'You place a scrying sensor on your animal companion or familiar.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0700, 'Antithetical Constraint', 4, 'Enchantment', 'The target automatically misses with attacks against creatures that are not of the opposite alignment of it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0701, 'Aura of the Unremarkable', 4, 'Enchantment', 'Make actions seem mundane to nearby creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0702, 'Charm Monster', 4, 'Enchantment', 'Makes monster believe it is your ally.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0703, 'Confusion', 4, 'Enchantment', 'Subjects behave oddly for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0704, 'Control Summoned Creature', 4, 'Enchantment', 'Direct a summoned monster as if you had summoned it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0705, 'Crushing Despair', 4, 'Enchantment', 'Subjects take –2 on attack rolls, damage rolls, saves, and checks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0706, 'Daze, Mass', 4, 'Enchantment', 'As daze, but affecting multiple creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0707, 'Demanding Message', 4, 'Enchantment', 'Send messages as per message with a suggestion for one creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0708, 'Forgetful Slumber', 4, 'Enchantment', 'As deeper slumber and make target forgets the last 5 minutes.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0709, 'Geas, Lesser', 4, 'Enchantment', 'Commands subject of 7 HD or less.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0710, 'Hollow Heroism', 4, 'Enchantment', 'Provide a heroism effect that you can reverse at any time.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0711, 'Mad Sultans Melody', 4, 'Enchantment', 'Bizarre cacophony fascinates eldritch creatures.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0712, 'Malfunction', 4, 'Enchantment', 'Construct behaves oddly for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0713, 'Malicious Spite', 4, 'Enchantment', 'Target is compelled to plot against another.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0714, 'Moonstruck', 4, 'Enchantment', 'Subject is enraged and confused.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0715, 'Overwhelming Grief', 4, 'Enchantment', 'Grieving target can take no actions and is denied its Dex bonus.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0716, 'Symbol of Laughter', 4, 'Enchantment', 'Triggered rune makes nearby creatures lose actions for 1 round/level.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0717, 'Terrible Remorse', 4, 'Enchantment', 'Creature is compelled to harm itself.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0718, 'Triggered Suggestion', 4, 'Enchantment', 'As suggestion, but triggered only and target does not remember the suggestion.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0719, 'Aggressive Thundercloud, Greater', 4, 'Evocation', 'Flying storm cloud deals 6d6 electricity damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0720, 'Agonize', 4, 'Evocation', 'Pain encourages an outsider to obey you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0721, 'Ball Lightning', 4, 'Evocation', 'Flying balls of lightning deal 3d6 electricity damage each.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0722, 'Contingent Scroll', 4, 'Evocation', 'Transfer a scroll’s power to the target; the scroll is then triggered as contingency.','F,M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0723, 'Controlled Fireball', 4, 'Evocation', 'As fireball, but secretly deals less damage to your allies.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0724, 'Creeping Ice', 4, 'Evocation', 'Sheet of ice slowly spreads outward on a horizontal surface.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0725, 'Deadmans Contingency', 4, 'Evocation', 'Set one of a list of contingencies for your demise.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0726, 'Detonate', 4, 'Evocation', 'Inflicts 1d8/level energy damage to all creatures within 15 ft.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0727, 'Dragon’s Breath', 4, 'Evocation', 'Gives you a dragon’s breath weapon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0728, 'Fire Shield', 4, 'Evocation', 'Creatures attacking you take fire damage; you’re protected from heat or cold.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0729, 'Flaming Sphere, Greater', 4, 'Evocation', 'Rolling ball of fire deals 6d6 fire damage and ignites targets.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0730, 'Hurricane Blast', 4, 'Evocation', 'Creates a severe blast of wind.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0731, 'Ice Storm', 4, 'Evocation', 'Hail deals 5d6 damage in cylinder 40 ft. across.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0732, 'Mydriatic Spontaneity', 4, 'Evocation', 'You overstimulate the target with alternating flashes of light and shadow within its eyes, causing its pupils to rapidly dilate and contract.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0733, 'Pyrotechnic Eruption', 24 'Evocation', 'Erupting flames burn a target several times.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0734, 'Resilient Sphere', 4, 'Evocation', 'Force globe protects but traps one subject.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0735, 'River of Wind', 4, 'Evocation', 'A stream of wind causes nonlethal damage and can knock down or push creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0736, 'Shout', 4, 'Evocation', 'Deafens all within cone and deals 5d6 sonic damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0737, 'Telekinetic Charge', 4, 'Evocation', 'Launches an ally through the air.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0738, 'Unbearable Brightness', 4, 'Evocation', 'Your glowing body dazzles or blinds others.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0739, 'Vitriolic Mist', 4, 'Evocation', 'As fire shield, except acid damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0740, 'Volcanic Storm', 4, 'Evocation', 'Hot rocks deal 5d6 damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0741, 'Wall of Fire', 4, 'Evocation', 'Deals 2d4 fire damage out to 10 ft. and 1d4 out to 20 ft. Passing through wall deals 2d6 damage + 1/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0742, 'Wall of Ice', 4, 'Evocation', 'Ice plane creates wall or hemisphere creates dome.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0743, 'Complex Hallucination', 4, 'llusion', 'Create a phantasm with effects for all senses.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0744, 'Dreadscape', 4, 'llusion', 'Surroundings and unfamiliar creatures seem like something out of a nightmare.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0745, 'Fools Teleport', 4, 'llusion', 'This spell instantly renders you unseen as per invisibility, but creates a visual and auditory display that makes it appear as if you had teleported away.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0746, 'Hallucinatory Terrain', 4, 'llusion', 'Makes one type of terrain appear like another (field as forest, or the like).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0747, 'Horrific Doubles', 4, 'llusion', 'Call forth disturbing mirror images.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0748, 'Illusion of Treachery', 4, 'llusion', 'Make it seem like another is also responsible for your attacks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0749, 'Illusory Wall', 4, 'llusion', 'Wall, floor, or ceiling looks real, but anything can pass through.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0750, 'Instant Fake', 4, 'llusion', 'Provide a short-term replica of an object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0751, 'Invisibility, Greater', 4, 'llusion', 'As invisibility, but subject can attack and stay invisible.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0752, 'Magic Aura, Greater', 4, 'llusion', 'As magic aura, but also affects creatures and allows more options.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0753, 'Majestic Image', 4, 'llusion', 'As enter image, but also gain bonuses on social skills while in the image.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0754, 'Minor Phantom Object', 4, 'llusion', 'As minor creation spell, except the object created is a semi-real phantasm).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0755, 'Phantasmal Asphyxiation', 4, 'llusion', 'Trick a creature into thinking it can’t breathe.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0756, 'Phantasmal Killer', 4, 'llusion', 'Fearsome illusion kills subject or deals 3d6 damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0757, 'Quieting Weapons', 4, 'llusion', 'Weapons make no sound and quiet their victims.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0758, 'Rainbow Pattern', 4, 'llusion', 'Lights fascinate 24 HD of creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0759, 'Shadowform', 4, 'llusion', 'You replace the target’s body with mystic shadow material drawn from the Shadow Plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0760, 'Shadow Barbs', 4, 'llusion', 'Creates a shadowy vicious spiked chain that radiates darkness around you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0761, 'Shadow Conjuration', 4, 'llusion', 'Mimics conjuration spell below 4th level, but only 20% real.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0762, 'Shadow Step', 4, 'llusion', 'Teleport from one shadow to another.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0763, 'Shocking Image', 4, 'llusion', 'As mirror image, but the duplicates emit electrical damage when destroyed.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0764, 'Simulacrum, Lesser', 4, 'llusion', 'Creates a double of a weak creature.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0765, 'Wandering Star Motes', 4, 'llusion', 'Outlines subject and produces light as a sunrod.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0766, 'Aggravate Affliction', 4, 'Necromancy', 'All recurring afflictions possessed by the targeted creature immediately trigger, requiring an immediate saving throw to avoid suffering their effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0767, 'Animate Dead', 4, 'Necromancy', 'Creates undead skeletons and zombies out of corpses.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0768, 'Bestow Curse', 4, 'Necromancy', '–6 to an ability score; –4 on attack rolls, saves, and checks; or 50% chance of losing each action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0769, 'Bloatbomb', 4, 'Necromancy', 'Kill a weak creature and turn its corpse into an explosive trap.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0770, 'Bloody Arrows', 4, 'Necromancy', 'When you deal piercing or slashing damage with a ranged weapon the victim also takes bleed damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0771, 'Boneshatter', 4, 'Necromancy', 'The targets bones (or exoskeleton) splinter.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0772, 'Contagion', 4, 'Necromancy', 'Infects subject with chosen disease.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0773, 'Contingent Venom', 4, 'Necromancy', 'As languid venom, but with a triggering condition.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0774, 'Curse Terrain', 4, 'Necromancy', 'Curse an area with four hazards.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0775, 'Earsend', 4, 'Necromancy', 'Cause one of your ears to tear itself free of your body and transform into a fly-like magical creature you control.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0776, 'Enervation', 4, 'Necromancy', 'Subject gains 1d4 negative levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0777, 'False Life, Greater', 4, 'Necromancy', 'Gain 2d10 temporary hp + 1/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0778, 'Familiar Melding', 4, 'Necromancy', 'Possess your familiar.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0779, 'Fear', 4, 'Necromancy', 'Subjects within cone flee for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0780, 'Flesh Puppet', 4, 'Necromancy', 'Control a zombie in human guise.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0781, 'Hunger for Flesh', 4, 'Necromancy', 'Give a creature a bite attack and a hunger for its own kind’s flesh.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0782, 'Masochistic Shadow', 4, 'Necromancy', 'You animate the target’s shadow with semi-living energies drawn from the Shadow Plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0783, 'Sadomasochism', 4, 'Necromancy', 'When you are dealt damage, your attacker must roll damage for the attack twice and take the higher roll, but the attacker must also succeed at a Will saving throw or become demoralized for 1 round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0784, 'Shadow Projection', 4, 'Necromancy', 'Temporarily become a shadow.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0785, 'Skeleton Crew', 4, 'Necromancy', 'Turn corpses into skeletons that act as a ships crew and obey your commands.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0786, 'Umbral Infusion', 4, 'Necromancy', 'You infuse the target mindless undead creature with power drawn from the Shadow Plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0787, 'Wall of Blindness/Deafness', 4, 'Necromancy', 'Translucent wall blinds or deafens creatures that pass through it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0788, 'Wall of Bone', 4, 'Necromancy', 'Create a vertical wall of skeletal arms that attaches itself to any solid surface.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0789, 'Absorbing Inhalation', 4, 'Transmutation', 'Inhale a gas removing it from the area without harm and use it as a breath weapon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0790, 'Abyssal Vermin', 4, 'Transmutation', 'Grant one vermin or vermin swarm the fiendish creature simple template.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0791, 'Adjustable Polymorph', 4, 'Transmutation', 'As alter self, but you can change the shape as a swift action.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0792, 'Age Resistance, Lesser', 4, 'Transmutation', 'Ignore penalties from middle age.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0793, 'Animal Aspect, Greater', 4, 'Transmutation', 'As animal aspect, but you gain two animal qualities.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0794, 'Assume Appearance, Greater', 4, 'Transmutation', 'Use a likeness to adopt a dead creatures form.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0795, 'Beast Shape II', 4, 'Transmutation', 'You take the form and some of the powers of a Tiny or Large animal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0796, 'Calcific Touch', 4, 'Transmutation', 'Touch attack slows target, 1d4 Dex damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0797, 'Claim Identity', 4, 'Transmutation', 'You steal the targets face, transforming yourself into a flawless imitation of it. All of the targets facial features, vocal cues, and identifying physical traits change, transforming it into an unremarkable member of its race and gender.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0798, 'Cloud Shape', 4, 'Abjuration', 'Subject becomes insubstantial and can fly slowly.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0799, 'Conversing Wind', 4, 'Transmutation', 'As whispering wind, except it can carry responses and doesn’t end after delivering its first message.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0800, 'Create Holds', 4, 'Transmutation', 'You create a path of handholds on earthen, plaster, stone, or wooden walls.','None' );";
      stmt.executeUpdate(sql);

      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0801, 'Curse of Burning Sleep', 4, 'Transmutation', 'Creature catches fire the next time it sleeps for an hour.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0802, 'Darkvision, Greater', 4, 'Transmutation', 'See 120 ft. in total darkness.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0803, 'Earth Glide', 4, 'Transmutation', 'Gain the ability to pass through stone, dirt and earth.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0804, 'Elemental Body I', 4, 'Transmutation', 'Turns you into a Small elemental.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0805, 'Enlarge Person, Mass', 4, 'Transmutation', '1 humanoid creature/level doubles in size.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0806, 'Eyes of the Void', 4, 'Transmutation', 'See 60 ft. in darkness, including magical darkness.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0807, 'Firefall', 4, 'Transmutation', 'Causes fire to burst up, dealing 2d6 fire damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0808, 'Hellmouth Lash', 4, 'Transmutation', 'Transform your tongue into an energy whip dealing 1d8 points of damage/2 caster levels (max 5d8).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0809, 'Ignoble Form', 4, 'Transmutation', 'Target drow takes on the form of a half-elf and loses its darkvision, light blindness, and light sensitivity traits, if it normally has them but gains low-light vision; a +3 racial bonus on a single Craft, Knowledge, Perform, or Profession skill of its choice; and both a +4 bonus on Bluff checks and a +10 bonus on Disguise checks to pass itself off as a half-elf.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0810, 'Innocuous Shape', 4, 'Transmutation', 'Transform a creature into a Medium or smaller animal or humanoid of no more than 1 Hit Die.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0811, 'Irregular Size', 4, 'Transmutation', 'Curse a creature so one set of its limbs shrivels in size.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0812, 'Liquefy', 4, 'Transmutation', 'The object you target becomes a liquid version of itself.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0813, 'Magic Siege Engine, Greater', 4, 'Transmutation', 'Siege engine gains +1 on targeting and damage rolls for every four caster levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0814, 'Make Whole, Greater', 4, 'Transmutation', 'Repairs 1d6 +1 points per caster level on a construct (maximum 10d6+10) and can fix destroyed magic items or technological items (items at 0 hit points or fewer), and restores the magic properties of the item if your caster level at least equal to that of the item. This spell otherwise functions as make whole.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0815, 'Miasmatic Form', 4, 'Transmutation', 'As gaseous form except your turn into a stinking or poison cloud.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0816, 'Mirror Transport', 4, 'Transmutation', 'Mirror becomes a multiple-use dimension door.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0817, 'Monstrous Physique II', 4, 'Transmutation', 'Take the form and some of the powers of a Tiny or Large monstrous humanoid.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0818, 'Obsidian Flow', 4, 'Transmutation', 'Converts the surface of the ground into molten glass.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0819, 'Rags to Riches', 4, 'Transmutation', 'The target object is enhanced to function as a masterwork item.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0820, 'Reduce Person, Mass', 4, 'Transmutation', 'As reduce person, but affects 1 humanoid creature/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0821, 'Resilient Reservoir', 4, 'Transmutation', 'Redirect damage from melee attacks and touch spells into bonus to a skill check, attack roll, damage roll or combat maneuver.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0822, 'Revenant Armor', 4, 'Transmutation', 'When the wearer of a suit of armor warded by revenant armor is brought below 0 hp or becomes unconscious in combat, the armor animates allowing the unconscious wearer to move about under the constructs control.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0823, 'Ride the Waves', 4, 'Transmutation', 'Target can breathe water and swim.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0824, 'Rigor Mortis', 4, 'Transmutation', 'Painfully swell a targets joints.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0825, 'Scorching Ash Form', 4, 'Transmutation', 'As gaseous form, except you become a swirl of ash.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0826, 'Shadowy Haven', 4, 'Transmutation', 'As rope trick, except the point of entry is through a 5-foot-square instead of a rope.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0827, 'Stone Shape', 4, 'Transmutation', 'Sculpts stone into any shape.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0828, 'Symbol of Slowing', 4, 'Transmutation', 'Triggered rune slows creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0829, 'Temporary Graft', 4, 'Transmutation', 'Graft a body part onto yourself to gain one of several benefits.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0830, 'Vermin Shape I', 4, 'Transmutation', 'Take the form and some of the powers of a Small or Medium vermin.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0831, 'Warp Metal', 4, 'Transmutation', 'Cause metal to bend and warp, permanently destroying its straightness, form, and strength.','None' );";
      stmt.executeUpdate(sql);
      //end of level 4
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0832, 'Banishing Blade', 5, 'Abjuration', 'You imbue a weapon with the ability to bull rush a creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0833, 'Break Enchantment', 5, 'Abjuration', 'Frees subjects from enchantments, transmutations, and curses.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0834, 'Calm Air', 5, 'Abjuration', 'You calm the air and disperse fog, dust, and other particles.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0835, 'Covetous Aura', 5, 'Abjuration', 'Anytime a harmless spell of 3rd level or lower is cast within the area of effect, you may choose to gain the benefit of that spell as if it had also targeted you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0836, 'Darkvault', 5, 'Abjuration', 'You ward an areas shadows such that light cannot penetrate them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0837, 'Dismissal', 5, 'Abjuration', 'Forces a creature to return to its native plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0838, 'Globe of Tranquil Water', 5, 'Abjuration', 'Upon casting this spell, a rippling bubble of calm water extends outward from you to a radius of 20 feet and remains centered on you when you move.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0839, 'Guardian Monument, Greater', 5, 'Abjuration', 'As lesser guardian monument, except it grants DR 4/magic.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0840, 'Life Bubble', 5, 'Abjuration', 'Protects creature from sustained environmental effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0841, 'Mages Private Sanctum', 5, 'Abjuration', 'Prevents anyone from viewing or scrying an area for 24 hours.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0842, 'Peacebond, Greater', 5, 'Abjuration', 'As peacebond, but on multiple weapons, even if they aren’t sheathed.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0843, 'Siphon Magic', 5, 'Abjuration', 'Transfers a magical effect from touched creature to yourself.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0844, 'Soothe Construct', 5, 'Abjuration', 'Reduce the berserk chance of a construct.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0845, 'Spell Absorption', 5, 'Abjuration', 'Counterspell a 3rd-level or lower-level spell to regain some spellcasting power.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0846, 'Spellsteal', 5, 'Abjuration', 'You create a discordant blast of energy that disrupts the target’s available magic and transfers knowledge of that magic to you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0847, 'Stoneskin, Communal', 5, 'Abjuration', 'As stoneskin, but you may divide the duration among creatures touched.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0848, 'Unbreakable Construct', 5, 'Abjuration', 'Increase construct hardness or DR.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0849, 'Wreath of Blades', 5, 'Abjuration', 'Four mithral daggers speed around you, attacking nearby creatures and protecting your spellcasting from attacks of opportunity.','F' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0850, 'Acidic Spray', 5, 'Conjuration', '1d6/level acid damage plus 1 round of acid.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0851, 'Callback, Greater', 5, 'Conjuration', 'As callback but with increased range.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0852, 'Cloudkill', 5, 'Conjuration', 'Kills 3 HD or less; 4–6 HD save or die, 6+ HD take Con damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0853, 'Corrosive Consumption', 5, 'Conjuration', 'Acidic patch damages an opponent.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0854, 'Damnation Stride', 5, 'Conjuration', 'Teleports you a short distance and produce a burst of fire.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0855, 'Duplicate Familiar', 5, 'Conjuration', 'You create a duplicate of a familiar.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0856, 'Flash Forward', 5, 'Conjuration', 'At end of charge, alter time and return to your original position before you charged.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0857, 'Geyser', 5, 'Conjuration', 'Creates a geyser of boiling water.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0858, 'Hostile Juxtaposition', 5, 'Conjuration', 'You create a dimensional link with a targeted creature, and switch spots with it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0859, 'Hungry Pit', 5, 'Conjuration', 'As create pit, but dealing 4d6 damage to those in it as it closes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0860, 'Mage’s Faithful Hound', 5, 'Conjuration', 'Phantom dog can guard a location and attack intruders.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0861, 'Major Creation', 5, 'Conjuration', 'As minor creation, plus stone and metal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0862, 'Planar Binding, Lesser', 5, 'Conjuration', 'Traps extraplanar creature of 6 HD or less until it performs a task.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0863, 'Release The Hounds', 5, 'Conjuration', 'Summon a pack of canines that respond to your commands and act in perfect unison, causing them to function like a swarm.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0864, 'Roaming Pit', 5, 'Conjuration', 'As create pit, except the pit is capable of movement.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0865, 'Secret Chest', 5, 'Conjuration', 'Hides expensive chest on Ethereal Plane; you retrieve it at will.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0866, 'Straitjacket', 5, 'Conjuration', 'Restrain a creature’s arms and grant it a second saving throw against certain magic.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0867, 'Summon Infernal Host', 5, 'Conjuration', 'Summon host devils.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0868, 'Summon Lesser Psychopomp', 5, 'Conjuration', 'As summon monster, except summons 1d3 esobok psychopomps or 1d4+1 nosoi psychopomps.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0869, 'Summon Monster V', 5, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0870, 'Teleport', 5, 'Conjuration', 'Instantly transports you as far as 100 miles per level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0871, 'Unseen Crew', 5, 'Conjuration', 'Create 1 unseen crewmember per caster level to attend to ships riggings and other affairs.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0872, 'Wall of Stone', 5, 'Conjuration', 'Creates a stone wall that can be shaped.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0873, 'Whip of Centipedes', 5, 'Conjuration', 'Whip of Centipedes','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0874, 'Contact Other Plane', 5, 'Divination', 'Lets you ask question of extraplanar entity.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0875, 'Foretell Failure', 5, 'Divination', 'You cast this spell immediately before taking an action that requires a d20 roll, granting you an ability to change your action if it would fail on a roll of 9 or less on the roll.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0876, 'Glimpse of Truth', 5, 'Divination', 'Gain true seeing for 1 round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0877, 'Locate Gate', 5, 'Divination', 'Find a nearby magical portal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0878, 'Mask From Divination', 5, 'Divination', 'You lock a mask on the target’s face, after which it adheres tightly to the target for the spell’s duration and cannot be removed by physical force.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0879, 'Prying Eyes', 5, 'Divination', '1d4 + 1/level floating eyes scout for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0880, 'Symbol of Scrying', 5, 'Divination', 'Triggered rune activates scrying sensor.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0881, 'Telepathic Bond', 5, 'Divination', 'Link lets allies communicate.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0882, 'Trace Teleport', 5, 'Divination', 'Determine where and when teleportation occurred, and glimpse the origin or destination.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0883, 'Apparent Master', 5, 'Enchantment', 'Charm makes a construct regard you as its master.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0884, 'Charm Person, Mass', 5, 'Enchantment', 'As charm person, but affects multiple creatures within 30 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0885, 'Compelling Rant', 5, 'Enchantment', 'People believe your ridiculous speech as long as you keep talking.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0886, 'Constricting Coils', 5, 'Enchantment', 'As hold monster, but does 1d6+6 bludgeoning damage/round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0887, 'Curse of Disgust', 5, 'Enchantment', 'Target is sickened when viewing a trigger.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0888, 'Dominate Person', 5, 'Enchantment', 'Controls humanoid telepathically.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0889, 'Feeblemind', 5, 'Enchantment', 'Subjects Int and Cha drop to 1.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0890, 'Grand Destiny', 5, 'Enchantment', 'The target gains a +4 competence bonus that it can choose to apply before rolling any attack roll, caster level check, saving throw, or skill check.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0891, 'Hold Monster', 5, 'Enchantment', 'As hold person, but any creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0892, 'Mind Fog', 5, 'Enchantment', 'Subjects in fog get –10 to Wis and Will checks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0893, 'Passing Fancy, Mass', 5, 'Enchantment', 'This spell functions as per passing fancy except target is one living creature/level, no two of which can be more than 30 ft. apart.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0894, 'Pessimism', 5, 'Enchantment', 'Force a creature to see the negative side of things.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0895, 'Sleepwalking Suggestion', 5, 'Enchantment', 'Cause a creature to perform a suggested action while asleep.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0896, 'Smug Narcissism', 5, 'Enchantment', 'Target is distracted by its sense of self.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0897, 'Symbol of Sleep', 5, 'Enchantment', 'Triggered rune puts nearby creatures into catatonic slumber.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0898, 'Touch of Slumber', 5, 'Enchantment', 'A touched creature with an attitude toward you of indifferent or better (and not hostile toward your visible allies) must succeed a Will save or fall asleep.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0899, 'Charnel House', 5, 'Illusion', 'Create an area of semi-real gore.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0900, 'Dream', 5, 'Illusion', 'Sends message to anyone sleeping.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0901, 'False Future', 5, 'Illusion', 'Cause divinations of the future to reveal the result you choose.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0902, 'False Vision', 5, 'Illusion', 'Fools scrying with an illusion.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0903, 'Impossible Angles', 5, 'Illusion', 'Distort geometry in an area.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0904, 'Major Phantom Object', 5, 'Illusion', 'As major creation but the creation is semi-real phantasm.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0905, 'Mirage Arcana', 5, 'Illusion', 'As hallucinatory terrain, plus structures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0906, 'Nightmare', 5 'Illusion', 'Sends vision dealing 1d10 damage, fatigue.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0907, 'Persistent Image', 5, 'Illusion', 'As major image, but with no concentration required.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0908, 'Phantasmal Web', 5, 'Illusion', 'Catches subjects in illusory web.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0909, 'Scripted Hallucination', 'Illusion', 'As complex hallucination, but without concentration','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0910, 'Seeming', 5, 'Illusion', 'Changes appearance of 1 person per 2 levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0911, 'Shadow Evocation', 5, 'Illusion', 'Mimics evocation spell below 5th level, but only 20% real.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0912, 'Symbol of Striking', 5, 'Illusion', 'As symbol of death, but fills a 5-foot square.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0913, 'Absorb Toxicity', 5, 'Necromancy', 'You become immune to diseases and toxins, absorb one, and then spread it to others.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0914, 'Astral Projection, Lesser', 5, 'Necromancy', 'Limited astral travel.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0915, 'Black Spot', 5, 'Necromancy', 'Curse a creature so that it is easier for others to attack it and it takes Constitution damage every day until removed.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0916, 'Blight', 5, 'Necromancy', 'Withers one plant or deals 1d6/level damage to plant creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0917, 'Blood Boil', 5, 'Necromancy', 'Raise temperature of target creatures blood (or other similar body fluid) over 3 rounds causing first fatigue, then Constitution damage, then hp damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0918, 'Conditional Curse', 5, 'Necromancy', 'Bestow a curse that is difficult to remove without fulfilling a condition.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0919, 'Daywalker', 5, 'Necromancy', 'You reshape the substance of a willing undead creature to resemble a living, breathing creature of the same size.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0920, 'Decollate', 5, 'Necromancy', 'A target can safely remove its head.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0921, 'Empathy Conduit', 5, 'Necromancy', 'You make a conduit between the targeted master and her familiar, allowing you to target the master or the familiar with your spells in order to affect the other.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0922, 'Feast on Fear', 5, 'Necromancy', 'Targets are panicked, and you gain temporary hit points.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0923, 'Flesh Puppet Horde', 5, 'Necromancy', 'Control multiple zombies in human guise.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0924, 'Ghoul Army', 5, 'Necromancy', '1d4+1 ghouls and 1 ghast fight for you and explode when killed to deal damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0925, 'Magic Jar', 5, 'Necromancy', 'Enables possession of another creature.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0926, 'Plague Carrier', 5, 'Necromancy', 'Target’s attacks carry filth fever.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0927, 'Possess Object', 5, 'Necromancy', '	Possess and animate one object.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0928, 'Red Hand of the Killer', 5, 'Necromancy', 'Stain the hand of a creature’s killer red.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0929, 'Repair Undead, Mass', 5, 'Necromancy', 'Heals undead of 1d8 hp + 1/level; affects 1 undead/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0930, 'Soulswitch', 5, 'Necromancy', 'You place your soul into the body of your familiar, and your familiar’s soul is placed in your body.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0931, 'Suffocation', 5, 'Necromancy', 'Target quickly suffocates to death.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0932, 'Summoner Conduit', 5, 'Necromancy', 'The target eidolon’s summoner takes damage whenever the eidolon does.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0933, 'Symbol of Pain', 5, 'Necromancy', 'Triggered rune wracks creatures with pain.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0934, 'Torpid Reanimation', 5, 'Necromancy', 'Animate dead when a specific trigger condition occurs.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0935, 'Vampiric Shadow Shield', 5, 'Necromancy', 'As fire shield, except attackers take negative energy damage and attacks heal you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0936, 'Waves of Fatigue', 5, 'Necromancy', 'Several targets become fatigued.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0937, 'Angelic Aspect', 5, 'Transmutation', 'As lesser angelic aspect, plus you gain darkvision 60 ft., acid and cold resistance increases to 10, you gain DR 5/evil, you sprout wings granting fly speed 30 ft. (average maneuverability) and your natural weapons or weapons you wield are considered good-aligned for the purpose of overcoming damage reduction.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0938, 'Animal Growth', 5, 'Transmutation', 'One animal doubles in size.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0939, 'Baleful Polymorph', 5, 'Transmutation', 'Turns subject into harmless animal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0940, 'Beast Shape III', 5, 'Transmutation', 'You take the form of a Diminutive or Huge animal, or Small or Medium magical beast.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0941, 'Caustic Blood', 5, 'Transmutation', 'Acidic blood spurts from your body when you take piercing or slashing damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0942, 'Dissolution', 5, 'Transmutation', 'You touch a Tiny or smaller item, causing the item to vanish as if it did not exist at all. The item ceases to be visible to or interact with the world in any way, as if it no longer existed.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0943, 'Echolocation', 5, 'Transmutation', 'Sonic sense gives you blindsight 40 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0944, 'Elemental Body II', 5, 'Transmutation', 'Turns you into a Medium elemental.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0945, 'Energy Siege Shot', 5, 'Transmutation', 'A Large siege engine deals energy damage that you designate with other effects depending on the type of energy you choose','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0946, 'Fabricate', 5, 'Transmutation', 'Transforms raw materials into finished items.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0947, 'Fickle Winds', 5, 'Transmutation', 'Wind walls selectively block attacks.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0948, 'Flexile Curse', 5, 'Transmutation', 'Curse your target with a withering aura that degrades its armor and shield (if any).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0949, 'Geniekind', 5, 'Transmutation', 'Gain your choice of genie-themed powers.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0950, 'Gift of the Deep', 5, 'Transmutation', 'You give the one non-mutated sahuagin/level the appearance and many of the abilities of sahuagin mutants.','DF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0951, 'Half-blood Extraction', 5, 'Transmutation', 'Transform an half-orc into a full-blooded orc.','M/DF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0952, 'Hungry Earth', 5, 'Transmutation', 'The ground attempts to pull creatures beneath its surface as if hungry for the flesh of mortals.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0953, 'Lighten Object, Mass', 5, 'Transmutation', 'Multiple objects are half as heavy as normal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0954, 'Master’s Mutation', 5, 'Transmutation', 'You can mold the ephemeral substance of the Outer Planes, mutating one summoned creature that you control to better suit your needs','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0955, 'Monstrous Physique III', 5, 'Transmutation', 'Take the form and some of the powers of a Diminutive or Huge monstrous humanoid.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0956, 'Open Arms', 5, 'Transmutation', 'You cast this spell in response to a specific cavaliers challenge, inquisitors judgment, or smite (such as a paladins smite evil) declared against you by an enemy creature. It can also be cast if a creature uses a spell that causes you to qualify as the creatures favored enemy when you normally would not, such as instant enemy (Advanced Players Guide 229).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0957, 'Overland Flight', 5, 'Transmutation', 'You fly at a speed of 40 ft. and can hustle over long distances.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0958, 'Passwall', 5, 'Transmutation', 'Creates passage through wood or stone wall.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0959, 'Planar Adaptation', 5, 'Transmutation', 'Resist harmful effects of other plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0960, 'Plant Shape I', 5, 'Transmutation', 'Turns you into a Small or Medium plant.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0961, 'Polymorph', 5, 'Transmutation', 'Gives one willing subject a new form.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0962, 'Rapid Repair', 5, 'Transmutation', 'Construct gains fast healing 5.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0963, 'Rubberskin', 5, 'Transmutation', 'Bludgeoning and falling damage you take is converted into nonlethal damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0964, 'Rune of Ruin', 5, 'Transmutation', 'You curse a magic item, reducing it to 1/4 its normal hit point total, granting it the broken condition.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0965, 'Slough', 5, 'Transmutation', '	Slough off a target’s skin.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0966, 'Telekinesis', 5, 'Transmutation', 'Moves object, attacks creature, or hurls object or creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0967, 'Transmute Mud to Rock', 5, 'Transmutation', 'Transforms two 10-ft. cubes per level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0968, 'Transmute Rock to Mud', 5, 'Transmutation', 'Transforms two 10-ft. cubes per level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0969, 'Transplant Visage', 5, 'Transmutation', 'You add or remove a creature’s face to or from your own.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0970, 'Treasure Stitching', 5, 'Transmutation', 'Objects on cloth become embroidered.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0971, 'Undead Anatomy II', 5, 'Transmutation', 'Take the form and some of the powers of a Tiny or Large undead.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0972, 'Vermin Shape II', 5, 'Transmutation', 'As vermin shape, but Tiny or Large.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0973, 'Vile Dog Transformation', 5, 'Transmutation', 'Transform ordinary dogs into fiendish minions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0974, 'Permanency', 5, 'Universal', 'Makes certain spells permanent.','M' );";
      stmt.executeUpdate(sql);
      //end of level 5
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0975, 'Antimagic Field', 6, 'Abjuration', 'Negates magic within 10 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0976, 'Dispel Magic, Greater', 6, 'Abjuration', 'As dispel magic, but with multiple targets.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0977, 'Dust Ward', 6, 'Abjuration', 'You ward a magic item against other creatures who try to learn to use or copy it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0978, 'Globe of Invulnerability', 6, 'Abjuration', 'As lesser globe of invulnerability, plus 4th-level spell effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0979, 'Guards and Wards', 6, 'Abjuration', 'Array of magic effects protect area.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0980, 'Repulsion', 6, 'Abjuration', 'Creatures can’t approach you.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0981, 'Spellcrash', 6, 'Abjuration', 'Target loses a 5th-level prepared spell or spell slot.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0982, 'Symbol of Sealing', 6, 'Abjuration', 'Create triggered wall of force.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0983, 'Undeath Ward', 6, 'Abjuration', 'Undeath Ward','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0984, 'Acid Fog', 6, 'Conjuration', 'Fog deals acid damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0985, 'Chains of Light', 6, 'Conjuration', 'Target is held immobile by glowing golden chains composed of pure light.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0986, 'Conjure Black Pudding', 6, 'Conjuration', 'Summon a black pudding.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0987, 'Cruel Jaunt', 6, 'Conjuration', 'Sense creatures suffering from fear, then teleport close to them.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0988, 'Getaway', 6, 'Conjuration', 'Teleports you and select creatures to predetermined location.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0989, 'Ice Crystal Teleport', 6, 'Conjuration', 'Target is frozen, then teleported.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0990, 'Planar Binding', 6, 'Conjuration', 'As lesser planar binding, but up to 12 HD.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0991, 'Summon Monster VI', 6, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0992, 'Summon Vanth', 6, 'Conjuration', 'As summon monster, except summons a single vanth psychopomp.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0993, 'Treacherous Teleport', 6, 'Conjuration', 'As teleport, except you choose some creatures to suffer a mishap or go elsewhere.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0994, 'Wall of Iron', 6, 'Conjuration', '30 hp/four levels; can topple onto foes.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0995, 'Whip of Ants', 6, 'Conjuration', 'Create a whip made of army ants.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0996, 'Analyze Dweomer', 6, 'Divination', 'Reveals magical aspects of subject.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0997, 'Battlemind Link', 6, 'Divination', 'You and an ally gain attack and AC bonuses.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0998, 'Legend Lore', 6, 'Divination', 'Lets you learn tales about a person, place, or thing.','MF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (0999, 'Named Bullet, Greater', 6, 'Divination', 'As named bullet, but deals 2 points of damage for every caster level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1000, 'Telepathy', 6, 'Divination', 'Communicate mentally with creatures within 100 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1001, 'True Seeing', 6, 'Divination', 'Lets you see all things as they really are.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1002, 'Cloak of Dreams', 6, 'Enchantment', 'Creatures within 5 ft. fall asleep.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1003, 'Envious Urge', 6, 'Enchantment', 'Targets steal from or disarm others.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1004, 'Geas/Quest', 6, 'Enchantment', 'As lesser geas, but affects any creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1005, 'Heroism, Greater', 6, 'Enchantment', 'Gives +4 bonus on attack rolls, saves, skill checks; immunity to fear; temporary hp.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1006, 'Phobia', 6, 'Enchantment', 'Induce an irrational fear in a creature to the point of madness.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1007, 'Serenity', 6, 'Enchantment', 'Peaceful feelings harm those attempting violence.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1008, 'Shadow Enchantment, Greater', 6, 'Enchantment', 'As shadow enchantment but up to 5th level spells.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1009, 'Suggestion, Mass', 6, 'Enchantment', 'As suggestion, affects 1 subject/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1010, 'Symbol of Distraction', 6, 'Enchantment', 'As symbol of death, except all creatures within the radius become fascinated by the symbol for 10 min./CL (other minor effects, see spell details).','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1011, 'Symbol of Persuasion', 6, 'Enchantment', 'Triggered rune charms creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1012, 'Unconscious Agenda', 6, 'Enchantment', '	Plant subconscious directive in target creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1013, 'Utter Contempt', 6, 'Enchantment', 'Target’s attitude worsens by two categories','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1014, 'Vengeful Outrage', 6, 'Enchantment', 'Target is compelled to destroy one enemy.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1015, 'Chains of Fire', 6, 'Evocation', '1d6/level damage and 1 secondary bolt/level.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1016, 'Chain Lightning', 6, 'Evocation', '1d6/level damage and 1 secondary bolt/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1017, 'Cold Ice Strike', 6, 'Evocation', 'Cone of ice slivers deals 1d6 cold/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1018, 'Contagious Flame', 6, 'Evocation', 'Scorching rays cause 4d6 fire damage, then move on to new targets.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1019, 'Contingency', 6, 'Evocation', 'Sets trigger condition for another spell.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1020, 'Decapitate', 6, 'Evocation', 'Turn a critical hit into a decapitation.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1021, 'Defending Sword', 6, 'Evocation', 'As mages sword except as noted.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1022, 'Elemental Assessor', 6, 'Evocation', 'Elemental ray does 2d6 acid, cold, electricity, and fire damage, with one type persisting for 1d4 rounds.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1023, 'Forceful Hand', 6, 'Evocation', 'Hand pushes creatures away.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1024, 'Freezing Sphere', 6, 'Evocation', 'Freezes water or deals cold damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1025, 'Hellfire Ray', 6, 'Evocation', 'A blast of hellfire deals 1d6 damage per caster level (maximum 15d6) to the target (half fire damage half unholy damage.) If a creature is killed by this damage it must make a Will save or be damned to Hell.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1026, 'Leashed Shackles', 6, 'Evocation', 'Target is restricted to a specific location.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1027, 'Mages Decree', 6, 'Evocation', 'Send a message to creatures within miles.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1028, 'Path of the Winds', 6, 'Evocation', 'Winds sweep area clear of anything of Small or smaller size, and after act as wind wall.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1029, 'Sirocco', 6, 'Evocation', 'Hot wind does 4d6 damage, fatigues those damaged, and knocks creatures prone.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1030, 'Spellblight Jinx', 6, 'Evocation', 'Inflict a curse similar to the spell burn spellblight on a creature.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1031, 'Baleful Shadow Transmutation', 6, 'Illusion', 'You infuse a targets shadow with energies from the Shadow Plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1032, 'Illusion of Treachery, Greater', 6, 'Illusion', 'Make it seem like another is responsible for your attacks while concealing your own actions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1033, 'Mislead', 6, 'Illusion', 'Turns you invisible and creates illusory double.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1034, 'Night Terrors', 6, 'Illusion', 'Disturb a creature’s rest with dark dreams.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1035, 'Permanent Image', 6, 'Illusion', 'Permanent illusion, includes sight, sound, smell, and thermal effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1036, 'Phantasmal Putrefaction', 6, 'Illusion', 'Trick creatures into thinking their flesh is rotting.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1037, 'Programmed Image', 6, 'Illusion', 'As major image, but triggered by event.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1038, 'Shadow Transmutation', 6, 'Illusion', 'You suffuse one subject’s body with energy from the Shadow Plane, altering its form to match a creature from the Shadow Plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1039, 'Shadow Walk', 6, 'Illusion', 'Step into shadow to travel rapidly.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1040, 'Transfer Familiar', 6, 'Illusion', 'You temporarily grant control of your familiar to another willing creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1041, 'Triggered Hallucination', 6, 'Illusion', 'As scripted hallucination, but it only appears when triggered.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1042, 'Veil', 6, 'Illusion', 'Changes appearance of a group of creatures.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1043, 'Banshee Blast', 6, 'Necromancy', 'Cone deals 1d4 per level and panics creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1044, 'Circle of Death', 6, 'Necromancy', 'Kills 1d4/level HD of creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1045, 'Contagion, Greater', 6, 'Necromancy', 'Infect a subject with a magical disease.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1046, 'Create Undead', 6, 'Necromancy', 'Raises ghouls, ghasts, mummies, or mohrgs from physical remains.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1047, 'Curse, Major', 6, 'Necromancy', 'Description','As bestow curse, but harder to remove.' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1048, 'Curse Terrain, Greater', 6, 'Necromancy', 'Curse an area with six dangerous hazards.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1049, 'Eyebite', 6, 'Necromancy', 'Description','Target becomes panicked, sickened, and comatose.' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1050, 'Flesh Wall', 6, 'Necromancy', 'Create a wall of zombies.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1051, 'Symbol of Fear', 6, 'Necromancy', '	Triggered rune panics nearby creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1052, 'Undeath to Death', 6, 'Necromancy', 'Destroys 1d4/level HD of undead (max. 20d4).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1053, 'Unwilling Shield', 6, 'Necromancy', 'Subject shares wounds you receive.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1054, 'Wither Limb', 6, 'Necromancy', 'Make one of the target’s limbs useless.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1055, 'Age Resistance', 6, 'Transmutation', 'Ignore penalties from old age.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1056, 'Bears Endurance, Mass', 6, 'Transmutation', 'As bear’s endurance, affects one subject/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1057, 'Beast Shape IV', 6, 'Transmutation', 'You take the form of a Diminutive to Huge animal or a Tiny to Large magical beast.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1058, 'Break, Greater', 6, 'Transmutation', 'Break all nearby objects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1059, 'Bull’s Strength, Mass', 6, 'Transmutation', 'As bull’s strength, affects 1 subject per level.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1060, 'Cat’s Grace, Mass', 6, 'Transmutation', 'As cat’s grace, affects 1 subject/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1061, 'Claim Identity, Greater', 6, 'Transmutation', 'This spell functions as claim identity, except it transforms its target into a helpless, inanimate porcelain mask for the spell’s duration.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1062, 'Control Water', 6, 'Transmutation', 'Raises or lowers bodies of water.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1063, 'Dimensional Blade', 6, 'Transmutation', 'For one round attacks made with a held melee weapon are melee touch attacks that ignore all armor. Bludgeoning weapons deal half damage and are treated as slashing weapons.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1064, 'Disintegrate', 6, 'Transmutation', 'Reduces one creature or object to dust.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1065, 'Eagle’s Splendor, Mass', 6, 'Transmutation', 'As eagle’s splendor, 1 subject/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1066, 'Eldritch Conduit, Greater', 6, 'Transmutation', 'Use multiple enemies as points of origin for cone, cylinder, line, or sphere spells.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1067, 'Elemental Body III', 6, 'Transmutation', 'Turns you into a Large elemental.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1068, 'Emblem of Greed', 6, 'Transmutation', 'You transform one masterwork or magical melee weapon into a +1 flaming glaive.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1069, 'Enemy Hammer', 6, 'Transmutation', 'Allows you to telekinetically use a creature as a weapon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1070, 'Energy Siege Shot, Greater', 6, 'Transmutation', 'As energy siege shot, but you can affect any size siege engine.	','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1070, 'Flesh to Stone', 6, 'Transmutation', 'Turns subject creature into statue.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1071, 'Fluid Form', 6, 'Transmutation', 'Gain DR 10/slashing, increases reach 10 ft., and breath water','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1072, 'Form of the Dragon I', 6, 'Transmutation', 'Turns you into a Medium dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1073, 'Fox’s Cunning, Mass', 6, 'Transmutation', '	As fox’s cunning, affects 1 subject/ level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1074, 'Hardening', 6, 'Transmutation', 'Permanently increases the hardness of materials by 1 point per 2 caster levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1075, 'Human Potential, Mass', 6, 'Transmutation', 'As human potential, except it affects multiple creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1076, 'Impart Mind', 6, 'Transmutation', 'Grant temporary intelligence and powers to a magic item.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1077, 'Monstrous Physique IV', 6, 'Transmutation', 'As monstrous physique III, with more abilities.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1078, 'Move Earth', 6, 'Transmutation', 'Description','Digs trenches and builds hills.' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1079, 'Oasis', 6, 'Transmutation', 'Description','This spell redirects the flow of water in the ground toward the surface at the designated point, creating a permanent water source similar to a natural spring.' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1080, 'Owl’s Wisdom, Mass', 6, 'Transmutation', 'As owl’s wisdom, affects 1 subject/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1081, 'Plant Shape II', 6, 'Transmutation', 'Turns you into a Large plant creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1082, 'Sabotage Construct', 6, 'Transmutation', 'As confusion, except that it affects only constructs.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1083, 'Sonic Form', 6, 'Transmutation', 'Turn yourself into a creature of semisolid sound.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1084, 'Stone to Flesh', 6, 'Transmutation', 'Restores petrified creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1085, 'Tar Pool', 6, 'Transmutation', 'Converts the top layer of the ground into hot tar.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1086, 'Transformation', 6, 'Transmutation', 'You gain combat bonuses.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1087, 'Undead Anatomy III', 6, 'Transmutation', 'Take the form and some of the powers of a Diminutive or Huge undead.','None' );";
      stmt.executeUpdate(sql);
      //end of level 6
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1088, 'Banishment', 7, 'Abjuration', 'Banishes 2 HD/level of extraplanar creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1089, 'Circle of Clarity', 7, 'Abjuration', 'Emanation hampers illusions and stealth.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1090, 'Expend', 7, 'Abjuration', 'Wastes creatures’ limited use magical ability.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1091, 'Magnetic Field', 7, 'Abjuration', 'You create a spherical magnetic field that surrounds you to a range of 30 feet and follows you for the duration of the spell.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1092, 'Sequester', 7, 'Abjuration', 'Subject is invisible to sight and scrying; renders creature comatose.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1093, 'Spell Turning', 7, 'Abjuration', 'Reflect 1d4+6 spell levels back at caster.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1094, 'Teleport Trap', 7, 'Abjuration', 'You can cause those teleporting into an area to appear in a specific part of that area.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1095, 'Caustic Eruption', 7, 'Conjuration', 'Burst deals 1d6 acid/level and lingers.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1096, 'Create Demiplane, Lesser', 7, 'Conjuration', 'Create your own demiplane.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1097, 'Dimensional Bounce', 7, 'Conjuration', 'Teleport multiple times between two designated locations.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1098, 'Hostile Juxtaposition, Greater', 7, 'Conjuration', 'You may target one creature for every four of your caster levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1099, 'Instant Summons', 7, 'Conjuration', 'Prepared object appears in your hand.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1100, 'Joyful Rapture', 7, 'Conjuration', 'Negate harmful emotions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1101, 'Mage’s Magnificent Mansion', 7, 'Conjuration', 'Door leads to extradimensional mansion.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1102, 'Phase Door', 7, 'Conjuration', 'Creates an invisible passage through a barrier.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1103, 'Planar Refuge', 7, 'Conjuration', 'This spell enforces the rules of the Material Plane on other planes of existence.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1104, 'Plane Shift', 7, 'Conjuration', 'As many as eight subjects travel to another plane.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1105, 'Rampart', 7, 'Conjuration', 'Creates 5-ft.-thick earthen barrier.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1106, 'Summon Monster VII', 7, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1107, 'Teleport, Greater	', 7, 'Conjuration', 'As teleport, but no range limit and no off-target arrival.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1108, 'Teleport Object', 7, 'Conjuration', 'As teleport, but affects a touched object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1109, 'Walk through Space', 7, 'Conjuration', 'You can spend a move action to teleport 30 feet or to stand while prone without provoking attacks of opportunity.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1100, 'Arcane Sight, Greater', 7, 'Divination', 'As arcane sight, but also reveals magic effects on creatures and objects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1111, 'Insect Spies, Greater', 7, 'Divination', 'Use magic beetles as spies and also share their senses.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1112, 'Scrying, Greater', 7, 'Divination', 'As scrying, but faster and longer.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1113, 'Vision', 7, 'Divination', 'As legend lore, but quicker.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1114, 'Crime Wave', 7, 'Enchantment', 'Compel targets to commit criminal actions','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1115, 'Demanding Message, Mass', 7, 'Enchantment', 'Send messages as per message with one suggestion for each creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1116, 'Hold Person, Mass', 7, 'Enchantment', 'As hold person, but all within 30 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1117, 'Hollow Heroism, Greater', 7, 'Enchantment', 'Provide a greater heroism effect that you can reverse at any time.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1118, 'Insanity', 7, 'Enchantment', 'Subject suffers continuous confusion.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1119, 'Lost Legacy', 7, 'Enchantment', 'Inflict a powerful curse on a touched creature that causes others to quickly forget positive aspects of their interactions with the target.','DF/F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1120, 'Power Word Blind', 7, 'Enchantment', 'Blinds creature with 200 hp or less.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1121, 'Pox of Rumors', 7, 'Enchantment', 'Curse a creature to attract nasty rumors.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1122, 'Symbol of Stunning', 7, 'Enchantment', 'Triggered rune stuns creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1123, 'Waves of Ecstasy', 7, 'Enchantment', 'Pleasure stuns and staggers creatures.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1124, 'Archons Trumpet', 7, 'School', 'Upon hearing a booming report, as if from a trumpet archon’s mighty horn, all creatures in the area of the burst are paralyzed for 1d4 rounds.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1125, 'Contact Entity IV', 7, 'School', 'Ask extraordinarily powerful eldritch entities to find and converse with you, or they may reply telepathically.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1126, 'Delayed Blast Fireball', 7, 'School', '1d6/level fire damage; you can postpone blast for up to 5 rounds.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1127, 'Forcecage', 7, 'School', 'Cube or cage of force imprisons all inside.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1128, 'Grasping Hand', 7, 'School', 'Hand provides cover, pushes, or grapples.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1129, 'Hungry Darkness', 7, 'School', 'As deeper darkness, but inflicts 3d6 force damage and 2 Con damage per round; victims continue to bleed after leaving darkness.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1130, 'Ki Shout', 7, 'School', 'Target takes 1d6 sonic/level and is stunned.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1131, 'Mages Sword', 7, 'School', 'Floating magic blade strikes opponents.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1132, 'Mydriatic Spontaneity, Mass', 7, 'School', 'As mydriatic spontaneity, except it can affect multiple creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1133, 'Prismatic Spray', 7, 'School', 'Rays hit subjects with variety of effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1134, 'Scouring Winds', 7, 'School', 'Winds block vision and deal 3d6 damage per round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1135, 'Vortex', 7, 'School', 'Creates a whirlpool in water','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1136, 'False Vision, Greater', 7, 'Illusion', 'As false vision, but moves with the target.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1137, 'Invisibility, Mass', 7, 'Illusion', 'As invisibility, but affects all in range.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1138, 'Lunar Veil', 7, 'Illusion', 'Dispel light and revert lycanthropes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1139, 'Permanent Hallucination', 7, 'Illusion', 'As scripted hallucination, but permanent.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1140, 'Phantasmal Revenge', 7, 'Illusion', 'Ghost from corpse hunts killer.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1141, 'Project Image', 7, 'Illusion', 'Illusory double can talk and cast spells.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1142, 'Shadow Conjuration, Greater', 7, 'Illusion', 'As shadow conjuration, but up to 6th level and 60% real.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1143, 'Simulacrum', 7, 'Illusion', 'Creates partially real double of a creature.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1144, 'Subjective Reality', 7, 'Illusion', 'You alter your perceptions to become convinced the target is an illusion.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1145, 'Control Undead', 7, 'Necromancy', 'Undead don’t attack you while under your command.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1146, 'Create Variant Mummy', 7, 'Necromancy', 'As create undead, except it creates one of the following variant mummies: bog mummy, ice mummy, or pharaonic guardian.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1147, 'Epidemic', 7, 'Necromancy', 'Infect a subject with a highly contagious disease.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1148, 'Finger of Death', 7, 'Necromancy', 'Deals 10 damage/level to one subject.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1149, 'Hunger for Flesh, Mass', 7, 'Necromancy', 'Give creatures bite attacks and a hunger for their own kind’s flesh.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1150, 'Plague Storm', 7, 'Necromancy', 'Cloud infects creatures like contagion.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1151, 'Plundered Power', 7, 'Necromancy', 'Kill a creature and steal its strongest spell-like ability.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1152, 'Symbol of Weakness', 7, 'Necromancy', 'Triggered rune weakens creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1153, 'Temporary Resurrection', 7, 'Necromancy', 'Bring a creature to life for 24 hours, after which it dies again.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1154, 'Umbral Strike', 7, 'Necromancy', 'You create a bolt of dark energy and use it to make a ranged touch attack that ignores concealment (but not total concealment).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1155, 'Waves of Exhaustion', 7, 'Necromancy', 'Several targets become exhausted.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1156, 'Age Resistance, Greater', 7, 'Transmutation', 'Ignore penalties from venerable age.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1157, 'Arcane Cannon', 7, 'Transmutation', 'Your focus becomes a magical cannon that fires on its own.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1158, 'Artificer’s Curse', 7, 'Transmutation', 'You temporarily suppress the most powerful qualities of a magical item.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1159, 'Black Tentacles, Greater', 7, 'Transmutation', 'This spell causes tall grass, weeds, and other plants to swell into Gargantuan vines and tendrils that erupt from the ground, reaching for any structure or any creature of evil alignment, functioning like black tentacles except as noted.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1160, 'Control Construct', 7, 'Transmutation', 'Take control of a construct.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1161, 'Control Weather', 7, 'Transmutation', 'Changes weather in local area.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1162, 'Elemental Body IV', 7, 'Transmutation', 'Turns you into a Huge elemental.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1163, 'Ethereal Jaunt', 7, 'Transmutation', 'You become ethereal for 1 round/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1164, 'Firebrand', 7, 'Transmutation', 'Allies gain flaming weapons, immunity to your fire spells, and a one-use ray of fire attack.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1165, 'Fly, Mass', 7, 'Transmutation', 'One creature/level gains ability to fly.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1166, 'Form of the Alien Dragon II', 7, 'Transmutation', 'As form of the alien dragon I, except it also allows you to assume the form of a Large esoteric or outer dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1167, 'Form of the Exotic Dragon II', 7, 'Transmutation', 'As form of the exotic dragon I, except it also allows you to assume the form of a Large imperial or primal dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1168, 'Form of the Dragon II', 7, 'Transmutation', 'Turns you into a Large dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1169, 'Giant Form I', 7, 'Transmutation', 'Turns you into a Large giant.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1170, 'Ice Body', 7, 'Transmutation', 'Your body becomes living ice.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1171, 'Legendary Proportions', 7, 'Transmutation', 'You call upon the primordial power of ancient megafauna to boost the size of your target. The creature’s height doubles and its weight increases by a factor of 8.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1172, 'Magic Army', 7, 'Transmutation', '	You imbue all manufactured weapons carried by allies within range with magic, granting each weapon a +1 enhancement bonus on attack rolls and damage rolls per 5 caster levels (maximum +4).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1173, 'Memory of Function', 7, 'Transmutation', 'You restore a broken object or damaged construct to a functional state, as if it were new and intact.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1174, 'Particulate Form', 7, 'Transmutation', 'Targets’ physical forms undergo a bizarre transformation becoming composed of countless particles that separate and reconnect to remain whole.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1175, 'Planar Adaptation, Mass', 7, 'Transmutation', 'As planar adaptation, but affects multiple creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1176, 'Plant Shape III', 7, 'Transmutation', 'Turns you into a Huge plant.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1177, 'Polymorph, Greater', 7, 'Transmutation', 'Gives one willing subject a new, more powerful form.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1178, 'Resonating Word', 7, 'Transmutation', 'Target is damaged, staggered, and stunned.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1179, 'Reverse Gravity', 7, 'Transmutation', 'Objects and creatures fall upward.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1180, 'Statue', 7, 'Transmutation', 'Subject can become a statue at will.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1181, 'Submerge Ship', 7, 'Transmutation', 'Protects a ship and all aboard from drowning and pressure, but not from damage from outside obstacles or creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1182, 'Limited Wish', 7, 'Universal', 'Alters reality (within limits).','M' );";
      stmt.executeUpdate(sql);
      //end of lv 7
      //
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1183, 'Dimensional Lock', 8, 'Abjuration', 'Teleportation and interplanar travel blocked for 1 day/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1184, 'Mind Blank', 8, 'Abjuration', 'Subject is protected from mental/emotional magic and scrying.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1185, 'Prismatic Wall', 8, 'Abjuration', 'Wall’s colors have array of effects','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1186, 'Protection from Spells', 8, 'Abjuration', 'Confers +8 resistance bonus.','MF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1187, 'Spell Absorption, Greater', 8, 'Abjuration', 'Counterspell a 6rd-level or lower-level spell to regain some spellcasting power.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1188, 'Spellscar', 8, 'Abjuration', 'Infuse area with primal magic.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1189, 'Symbol of Dispelling', 8, 'Abjuration', 'As symbol of death, except that all creatures within 40 feet are effect by greater dispel magic.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1190, 'Call Construct', 8, 'Conjuration', 'Summon your construct to you.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1191, 'Create Demiplane', 8, 'Conjuration', 'As lesser create demiplane, but larger and with planar traits.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1192, 'Incendiary Cloud', 8, 'Conjuration', 'Cloud deals 6d6 fire damage/round.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1193, 'Instant Summons, Greater', 8, 'Conjuration', 'As instant summons, but for multiple objects and creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1194, 'Maze', 8, 'Conjuration', 'Traps subject in extradimensional maze.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1195, 'Planar Binding, Greater', 8, 'Conjuration', 'As lesser planar binding, but up to 18 HD.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1196, 'Rain of Arrows', 8, 'Conjuration', 'You conjure a cloud of magical arrows that rain down on any creatures and objects in an area.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1197, 'Rift of Ruin', 8, 'Conjuration', 'Tears a rift in reality, creating an extra-dimensional hole with a depth of 60 feet.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1198, 'Seamantle', 8, 'Conjuration', 'Sheathes you in protective water/','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1199, 'Spellcrash, Greater', 8, 'Conjuration', 'Target loses a 7th-level prepared spell or spell slot.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1200, 'Summon Monster VIII', 8, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1201, 'Trap the Soul', 8, 'Conjuration', 'Imprisons subject within gem','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1202, 'Wall of Lava', 8, 'Conjuration', 'Wall damages foes that try to enter, periodically launches lava at nearby targets.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1203, 'Discern Location', 8, 'Divination', 'Reveals exact location of creature or object.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1204, 'Moment of Prescience', 8, 'Divination', 'You gain +1/level insight bonus on single attack roll, check, or save.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1205, 'Prediction of Failure', 8, 'Divination', 'Target is permanently shaken and sickened, and may gain a spellblight.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1206, 'Prying Eyes, Greater', 8, 'Divination', 'As prying eyes, but eyes have true seeing.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1207, 'Antipathy', 8, 'Enchantment', 'Object or location affected by spell repels certain creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1208, 'Binding', 8, 'Enchantment', 'Utilizes an array of techniques to imprison a creature.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1209, 'Charm Monster, Mass', 8, 'Enchantment', 'As charm monster, but all within 30 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1210, 'Demand', 8, 'Enchantment', 'As sending, plus you can send suggestion.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1211, 'Euphoric Tranquility', 8, 'Enchantment', 'Makes a creature friendly.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1212, 'Irresistible Dance', 8, 'Enchantment', 'Forces subject to dance.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1213, 'Life of Crime', 8, 'Enchantment', 'Permanently turn someone into a crazed criminal.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1214, 'Power Word Stun', 8, 'Enchantment', 'Stuns creature with 150 hp or less.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1215, 'Symbol of Insanity', 8, 'Enchantment', 'Triggered rune renders nearby creatures insane.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1216, 'Sympathy', 8, 'Enchantment', 'Object or location attracts certain creatures.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1217, 'Clenched Fist', 8, 'Evocation', 'Large hand provides cover, pushes, or attacks your foes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1218, 'Curse of Night', 8, 'Evocation', 'Curse an area with eternal night.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1219, 'Polar Ray', 8, 'Evocation', 'Ranged touch attack deals 1d6/level cold damage and 1d4 points of Dexterity drain.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1220, 'Shout, Greater', 8, 'Evocation', 'Devastating yell deals 10d6 sonic damage; stuns creatures.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1221, 'Stormbolts', 8, 'Evocation', '1d8 damage/level (max 20d8) to targets.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1222, 'Sunburst', 8, 'Evocation', 'Blinds all within 10 ft., deals 6d6 damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1223, 'Telekinetic Sphere', 8, 'Evocation', 'As resilient sphere, but you move the sphere telekinetically.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1224, 'Scintillating Pattern', 8, 'Illusion', 'Twisting colors confuse, stun, or render unconscious.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1225, 'Screen', 8, 'Illusion', 'Illusion hides area from vision and scrying.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1226, 'Shadow Evocation, Greater', 8, 'Illusion', 'As shadow evocation, but up to 7th level and 60% real.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1227, 'Clone', 8, 'Necromancy', 'Duplicate awakens when original dies.','MF' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1228, 'Create Greater Undead', 8, 'Necromancy', 'Creates shadows, wraiths, spectres, or devourers.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1229, 'Curse Terrain, Supreme', 8, 'Necromancy', 'Curse an area with seven deadly hazards.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1230, 'Death Clutch', 8, 'Necromancy', 'Rip out someone’s heart.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1231, 'Horrid Wilting', 8, 'Necromancy', 'Deals 1d6/level damage within 30 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1232, 'Orb of the Void', 8, 'Necromancy', 'Sphere inflicts negative levels.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1233, 'Symbol of Death', 8, 'Necromancy', 'Triggered rune kills nearby creatures.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1234, 'Umbral Infusion, Mass', 8, 'Necromancy', 'As umbral infusion, except it can affect multiple mindless undead creatures.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1235, 'Angelic Aspect, Greater', 8, 'Transmutation', 'As angelic aspect but DR increases to 10/evil; you gain immunity to acid, cold, and petrification; resistance to electricity and fire 10; +4 racial bonus on saves against poison; a protective aura, and truespeech as supernatural abilities. Also, your fly speed increases to 60 ft. (good maneuverability).','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1236, 'Form of the Alien Dragon III', 8, 'Transmutation', 'This spell functions as per form of the alien dragon II, except it also allows you to take the form of a Huge esoteric or outer dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1237, 'Form of the Exotic Dragon III', 8, 'Transmutation', 'As form of the exotic dragon II except that it also allows you to take the form of a Huge imperial or primal dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1238, 'Form of the Dragon III', 8, 'Transmutation', 'Turns you into a Huge dragon.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1239, 'Frightful Aspect', 8, 'Transmutation', 'You take on a terrifying, Large-sized form of yourself and emit an aura that causes creatures to become shaken or frightened.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1240, 'Giant Form II', 8, 'Transmutation', 'Turns you into a Huge giant.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1241, 'Iron Body', 8, 'Transmutation', 'Your body becomes living iron.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1242, 'Phasic Challenge', 8, 'Transmutation', 'Target one enemy and one willing ally. Both targets remain visible and audible, and can see and hear other creatures, but cannot physically interact with any creature save one another.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1243, 'Polymorph Any Object', 8, 'Transmutation', 'Changes a subject into anything else.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1244, 'Temporal Stasis', 8, 'Transmutation', 'Puts subject into suspended animation','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1245, 'Undead Anatomy IV', 8, 'Transmutation', 'As undead anatomy III, but with more abilities.','None' );";
      stmt.executeUpdate(sql);
      ////
      //end of level 8
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1246, 'Freedom', 9, 'Abjuration', 'Releases creature from imprisonment.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1247, 'Impenetrable Veil', 9, 'Abjuration', 'Enchant a target so it is nearly impossible to detect by both magical and mundane means, granting it multiple benefits.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1248, 'Imprisonment', 9, 'Abjuration', 'Entombs subject beneath the earth.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1249, 'Mage’s Disjunction', 9, 'Abjuration', 'Dispels magic, disenchants magic items.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1250, 'Mage’s Excellent Enclosure', 9, 'Abjuration', 'You make an impenetrable barrier of force that negates all magic within it.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1251, 'Mind Blank, Communal', 9, 'Abjuration', 'As mind blank, but you may divide the duration among creatures touched.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1252, 'Prismatic Sphere', 9, 'Abjuration', 'As prismatic wall, but surrounds on all sides.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1253, 'Spellbane', 9, 'Abjuration', 'Prevent 1 spell per 5 levels from working in a 10-foot emanation.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1254, 'Symbol of Vulnerability', 9, 'Abjuration', 'Triggered rune gives penalties.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1255, 'Wall of Suppression', 9, 'Abjuration', 'Creates wall that disables magic.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1256, 'Clashing Rocks', 9, 'Conjuration', '20d6 damage to target creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1257, 'Create Demiplane, Greater', 9, 'Conjuration', 'As create demiplane, but larger and with more planar traits.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1258, 'Gate', 9, 'Conjuration', 'Connects two planes for travel or summoning.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1259, 'Interplanetary Teleport', 9, 'Conjuration', 'Teleport to another planet','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1260, 'Maze of Madness and Suffering', 9, 'Conjuration', 'Send a target into a dangerous extradimensional maze.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1261, 'Refuge', 9, 'Conjuration', 'Alters item to transport its possessor to your abode.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1262, 'Resplendent Mansion', 9, 'Conjuration', 'Conjure an opulent mansion several stories tall.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1263, 'Summon Monster IX', 9, 'Conjuration', 'Summons extraplanar creature to fight for you.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1264, 'Teleportation Circle', 9, 'Conjuration', 'Teleports creatures inside circle.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1265, 'Tsunami', 9, 'Conjuration', 'Huge wave damages and sweeps up all in its path.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1266, 'Wooden Phalanx', 9, 'Conjuration', 'Creates 1d4+2 temporary wood golems to fight for you.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1267, 'Foresight', 9, 'Divination', '“Sixth sense” warns of impending danger.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1268, 'Dominate Monster', 9, 'Enchantment', 'As dominate person, but any creature.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1269, 'Heroic Invocation', 9, 'Enchantment', 'Grants a number of creatures bonuses on attacks and damage, temporary hit points, and immunity to fear and charm effects.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1270, 'Hold Monster, Mass', 9, 'Enchantment', 'As hold monster, but all within 30 ft.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1271, 'Overwhelming Presence', 9, 'Enchantment', 'Creatures bow before you as if you were divine.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1272, 'Power Word Kill', 9, 'Enchantment', 'Kills one creature with 100 hp or less.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1273, 'Symbol of Strife', 9, 'Enchantment', 'Triggered rune makes creatures attack.','M' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1274, 'Crushing Hand', 9, 'Evocation', 'Large hand provides cover, pushes, or crushes your foes.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1275, 'Defending Sword, Mass', 9, 'Evocation', 'This spell functions as defending sword, except you can create one sword per 5 caster levels, each of which must defend a different creature within range.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1276, 'Icy Prison, Mass', 9, 'Evocation', 'As icy prison, but it affects 1 creature/level.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1277, 'Meteor Swarm', 9, 'Evocation', 'Four exploding spheres each deal 6d6 fire damage.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1278, 'Ride the Lightning', 9, 'Evocation', 'Transform into electricity.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1279, 'Winds of Vengeance', 9, 'Evocation', 'Gives you the ability to fly and attack with wind.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1280, 'Shades', 9, 'Illusion', 'As shadow conjuration, but up to 8th level and 80% real.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1281, 'Shadow Transmutation, Greater', 9, 'Illusion', 'As shadow transmutation, except it can mimic greater polymorph instead of polymorph. The illusory attacks and special abilities of any shape assumed using greater shadow transmutation deal three-fifths (60%) damage to nonbelievers, and non-damaging effects are 60% likely to work against nonbelievers.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1282, 'Weird', 9, 'Illusion', 'As phantasmal killer, but affects all within 30 ft','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1283, 'Astral Projection', 9, 'Necromancy', 'Projects you and companions onto Astral Plane.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1284, 'Canopic Conversion', 9, 'Necromancy', 'Eviscerates target, inflicting 1d6 dmg/caster level (maximum 20d6). If kills target, spell seals his organs in jars; creating a dune mummy 1d4 rounds later.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1285, 'Cursed Earth', 9, 'Necromancy', 'Plants die, living creatures catch diseases, or dead creatures rise as zombies.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1286, 'Energy Drain', 9, 'Necromancy', 'Subject gains 2d4 negative levels.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1287, 'Massacre', 9, 'Necromancy', 'Slaughter creatures in a line.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1288, 'Soul Bind', 9, 'Necromancy', 'Traps newly dead soul to prevent resurrection.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1289, 'Suffocation, Mass', 9, 'Necromancy', 'One creature/level suffocates to death.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1290, 'Wail of the Banshee', 9, 'Necromancy', 'Deals 10 damage/level to 1 creature/level.','None' );";
      stmt.executeUpdate(sql);
      //
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1291, 'Curse of Fell Seasons', 9, 'Transmutation', 'Curse an area’s weather.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1292, 'Etherealness', 9, 'Transmutation', 'Travel to Ethereal Plane with companions.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1293, 'Fiery Body', 9, 'Transmutation', 'You gain various fire-related powers.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1294, 'Salvage', 9, 'Transmutation', 'Raise and repair a sunken ship.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1295, 'Scribe’s Binding', 9, 'Transmutation', 'This spell binds a single creature into a prepared book, sustaining it in suspended animation and filling the book with its experience and knowledge.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1296, 'Shapechange', 9, 'Transmutation', 'Transforms you into certain creatures, and lets you change forms once per round.','F' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1297, 'Time Stop', 9, 'Transmutation', 'You act freely for 1d4+1 rounds.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1298, 'Transmute Blood to Acid', 9, 'Transmutation', 'Target takes acid damage each round, and its attackers take acid damage.','M' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1299, 'Transmute Golem', 9, 'Transmutation', 'You turn one type of golem into another.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1300, 'World Wave', 9, 'Transmutation', '	Earth moves you across distances.','None' );";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1301, 'Wish', 9, 'Universal', 'As limited wish, but with fewer limits.','M' );";
      stmt.executeUpdate(sql);


      //Fresh copy statement
      /*sql = "INSERT INTO Spells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
            "VALUES (1000, 'SpellName', , 'School', 'Description','None' );";
      stmt.executeUpdate(sql);*/
      stmt.close();
      //c.commit();
      //c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      //System.exit(0);
    }
    System.out.println("All Spells created successfully I hope");

   // Connection c = null;
    //Statement stmt = null;
    try {
     Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      //c.setAutoCommit(false);
      System.out.println("REad it Opened database successfully");

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
      //rs.close();
      //stmt.close();
      //c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      //.exit(0);
    }
    System.out.println("Operation Axed successfully");
}
public void justOpen(){
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      System.out.println("justOpen has run");

    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    }

}
public String readOne(int theSpellID){
    Connection c = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsData.db");
      c.setAutoCommit(false);
      System.out.println("Searching for Spell(line 1433 spellDatabase.java)");
      stmt = c.createStatement();
       rs = c.createStatement().executeQuery( "SELECT ID, NAME FROM Spells WHERE ID = " + theSpellID + ";");
      System.out.println("Searching for Spell(line 1436 spellDatabase.java)");
      while (rs.next()) {
          String please = rs.getString("NAME");
          System.out.println(please + "Is the spell you came up with");
          return please;
}
      //String  name = rs1.getString("NAME");
      System.out.println("Searching for Spell(line 1438 spellDatabase.java)");
      //return please;
        // rs.close();
      //stmt.close();
     // c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Return 1  done successfully");
    //return name;

    return null;
  }

public void makeClericDatabase(){

Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsClericData.db");
      System.out.println("Created Spell database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE ClericSpells " +
                   "(ID integer PRIMARY KEY     AUTOINCREMENT," +
                   " NAME           TEXT    NOT NULL, " +
                   " LEVEL          INT     NOT NULL, " +
                   " DESCRIPTION    STRING, " +
                   " Component      STRING)";
      stmt.executeUpdate(sql);
      //stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      //System.exit(0);
    }
    //need to create the database, form bellow
    //sql = "INSERT INTO ClericSpells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
    //        "VALUES (0000, 'SpellName', 0, 'Description','None' );";
    //  stmt.executeUpdate(sql);*/
}

public void makeBardDatabase(){

Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsBardData.db");
      System.out.println("Created Spell database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE BardSpells " +
                   "(ID integer PRIMARY KEY     AUTOINCREMENT," +
                   " NAME           TEXT    NOT NULL, " +
                   " LEVEL          INT     NOT NULL, " +
                   " DESCRIPTION    STRING, " +
                   " Component      STRING)";
      stmt.executeUpdate(sql);
      //stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      //System.exit(0);
    }
    //need to create the database, form bellow
    //sql = "INSERT INTO BardSpells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
    //        "VALUES (0000, 'SpellName', 0, 'Description','None' );";
    //  stmt.executeUpdate(sql);*/
}

public void makeRangerDatabase(){

Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:spellsRangerData.db");
      System.out.println("Created Spell database successfully");

      stmt = c.createStatement();
      String sql = "CREATE TABLE RangerSpells " +
                   "(ID integer PRIMARY KEY     AUTOINCREMENT," +
                   " NAME           TEXT    NOT NULL, " +
                   " LEVEL          INT     NOT NULL, " +
                   " DESCRIPTION    STRING, " +
                   " Component      STRING)";
      stmt.executeUpdate(sql);
      //stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      //System.exit(0);
    }
    //need to create the database, form bellow
    //sql = "INSERT INTO RangerSpells (ID,NAME,LEVEL,SCHOOL,DESCRIPTION,Component) " +
    //        "VALUES (0000, 'SpellName', 0, 'Description','None' );";
    //  stmt.executeUpdate(sql);*/
}

}
