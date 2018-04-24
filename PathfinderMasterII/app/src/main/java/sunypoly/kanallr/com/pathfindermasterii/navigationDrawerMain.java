package sunypoly.kanallr.com.pathfindermasterii;

import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import sunypoly.kanallr.com.pathfindermasterii.javalogic.*;

import static android.os.Environment.getExternalStorageDirectory;


public class navigationDrawerMain extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    BarbarianMake barbOne;
    BardMake bardOne;
    ClericMake clericOne;
    DruidMake druidOne;
    FighterMake fighterOne;
    MonkMake monkOne;
    PaladinMake paladinOne;
    RangerMake rangerOne;
    RougeMake rougeOne;
    WizardMake wizardOne;


    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Barbarian) {
            Fragment fr;
            fr = new FragmentBarbarianMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
            // Handle the camera action
        } else if (id == R.id.Bard) {
            Fragment fr;
            fr = new FragmentBardMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Cleric) {
            Fragment fr;
            fr = new FragmentClericMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();

        } else if (id == R.id.Druid) {
            Fragment fr;
            fr = new FragmentDruidMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();

        }  else if (id == R.id.Fighter) {
            Fragment fr;
            fr = new FragmentFighterMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Monk) {
            Fragment fr;
            fr = new FragmentMonkMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Paladin) {
            Fragment fr;
            fr = new FragmentPaladinMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Ranger) {
            Fragment fr;
            fr = new FragmentRangerMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Rouge) {
            Fragment fr;
            fr = new FragmentRougeMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Sorcerer) {
            Fragment fr;
            fr = new FragmentSorcererMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.Wizard) {
            Fragment fr;
            fr = new FragmentWizardMake();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.testDirectory) {
            Fragment fr;
            fr = new FragmentTestDir();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_Landing, fr);
            fragmentTransaction.commit();
        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
    public void spawnBarbarian(View view){
        barbOne = new BarbarianMake();
        barbOne.spawnLV1Barbarian();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(barbOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(barbOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(barbOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(barbOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(barbOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(barbOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(barbOne.sizeFeet) + "' "  + Integer.toString(barbOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(barbOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(barbOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + barbOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +barbOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(barbOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(barbOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(barbOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(barbOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(barbOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(barbOne.touchAC));
        if(barbOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(barbOne.AttackBonus[0]));
        }
        if(barbOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(barbOne.AttackBonus[1]));
        }
        if(barbOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(barbOne.AttackBonus[2]));
        }
        if(barbOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(barbOne.AttackBonus[3]));
        }
        if(barbOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[0]));
        }
        if(barbOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[1]));
        }
        if(barbOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[2]));
        }
        if(barbOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(barbOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(barbOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(barbOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(barbOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(barbOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(barbOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(barbOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(barbOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(barbOne.SpecialSkills[0]);
        textTest.append(", " + barbOne.SpecialSkills[1]);
        // firstName = barbOne.firstName;
        //incomplete

    }
    public void levelUpBarbButton(View view){

        barbOne.levelUpBarb();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(barbOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(barbOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(barbOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(barbOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(barbOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(barbOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(barbOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(barbOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(barbOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(barbOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(barbOne.touchAC));
        if(barbOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(barbOne.AttackBonus[0]));
        }
        if(barbOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(barbOne.AttackBonus[1]));
        }
        if(barbOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(barbOne.AttackBonus[2]));
        }
        if(barbOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(barbOne.AttackBonus[3]));
        }
        if(barbOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[0]));
        }
        if(barbOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[1]));
        }
        if(barbOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[2]));
        }
        if(barbOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(barbOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(barbOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(barbOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(barbOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(barbOne.SpecialSkills[c] + ", ");
            c++;
        }
        // firstName = barbOne.firstName;
        //incomplete

    }
    public void spawnBard(View view){
        bardOne = new BardMake();
        bardOne.spawnLV1Bard();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(bardOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(bardOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(bardOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(bardOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(bardOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(bardOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(bardOne.sizeFeet) + "' "  + Integer.toString(bardOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(bardOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(bardOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + bardOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +bardOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(bardOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(bardOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(bardOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(bardOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(bardOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(bardOne.touchAC));
        if(bardOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(bardOne.AttackBonus[0]));
        }
        if(bardOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(bardOne.AttackBonus[1]));
        }
        if(bardOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(bardOne.AttackBonus[2]));
        }
        if(bardOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(bardOne.AttackBonus[3]));
        }
        if(bardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[0]));
        }
        if(bardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[1]));
        }
        if(bardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[2]));
        }
        if(bardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(bardOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(bardOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(bardOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(bardOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(bardOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(bardOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(bardOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(bardOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(bardOne.SpecialSkills[0]);
        textTest.append(", " + bardOne.SpecialSkills[1]);
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[6]));

        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt0);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt1);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt2);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt3);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt4);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt5);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt6);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[6]));
        //incomplete

    }
    public void levelUpBardButton(View view){

        bardOne.levelUpBard();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(bardOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(bardOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(bardOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(bardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(bardOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(bardOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(bardOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(bardOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(bardOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(bardOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(bardOne.touchAC));
        if(bardOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(bardOne.AttackBonus[0]));
        }
        if(bardOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(bardOne.AttackBonus[1]));
        }
        if(bardOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(bardOne.AttackBonus[2]));
        }
        if(bardOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(bardOne.AttackBonus[3]));
        }
        if(bardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[0]));
        }
        if(bardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[1]));
        }
        if(bardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[2]));
        }
        if(bardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(bardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(bardOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(bardOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(bardOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(bardOne.SpecialSkills[c] + ", ");
            c++;
        }
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(bardOne.totalBardSpells[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt0);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt1);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt2);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt3);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt4);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt5);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsKnownAt6);
        textTest.setText(Integer.toString(bardOne.bardSpellsKnown[6]));

    }
    public void spawnCleric(View view){
        clericOne = new ClericMake();
        clericOne.spawnLV1Cleric();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(clericOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(clericOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(clericOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(clericOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(clericOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(clericOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(clericOne.sizeFeet) + "' "  + Integer.toString(clericOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(clericOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(clericOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + clericOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +clericOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(clericOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(clericOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(clericOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(clericOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(clericOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(clericOne.touchAC));
        if(clericOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(clericOne.AttackBonus[0]));
        }
        if(clericOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(clericOne.AttackBonus[1]));
        }
        if(clericOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(clericOne.AttackBonus[2]));
        }
        if(clericOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(clericOne.AttackBonus[3]));
        }
        if(clericOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[0]));
        }
        if(clericOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[1]));
        }
        if(clericOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[2]));
        }
        if(clericOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(clericOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(clericOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(clericOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(clericOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(clericOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(clericOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(clericOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(clericOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(clericOne.SpecialSkills[0]);
      textTest.append(", " + clericOne.SpecialSkills[1]);

        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[1]) + " + " + Integer.toString(clericOne.domainSpell[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[2]) + " + " + Integer.toString(clericOne.domainSpell[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[3]) + " + " + Integer.toString(clericOne.domainSpell[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[4]) + " + " + Integer.toString(clericOne.domainSpell[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[5]) + " + " + Integer.toString(clericOne.domainSpell[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[6]) + " + " + Integer.toString(clericOne.domainSpell[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[7]) + " + " + Integer.toString(clericOne.domainSpell[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[8]) + " + " + Integer.toString(clericOne.domainSpell[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[9]) + " + " + Integer.toString(clericOne.domainSpell[9]));
        //incomplete

    }
    public void levelUpClericButton(View view){

        clericOne.levelUpCleric();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(clericOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(clericOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(clericOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(clericOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(clericOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(clericOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(clericOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(clericOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(clericOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(clericOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(clericOne.touchAC));
        if(clericOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(clericOne.AttackBonus[0]));
        }
        if(clericOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(clericOne.AttackBonus[1]));
        }
        if(clericOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(clericOne.AttackBonus[2]));
        }
        if(clericOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(clericOne.AttackBonus[3]));
        }
        if(clericOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[0]));
        }
        if(clericOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[1]));
        }
        if(clericOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[2]));
        }
        if(clericOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(clericOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(clericOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(clericOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(clericOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(clericOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[1]) + " + " + Integer.toString(clericOne.domainSpell[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[2]) + " + " + Integer.toString(clericOne.domainSpell[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[3]) + " + " + Integer.toString(clericOne.domainSpell[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[4]) + " + " + Integer.toString(clericOne.domainSpell[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[5]) + " + " + Integer.toString(clericOne.domainSpell[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[6]) + " + " + Integer.toString(clericOne.domainSpell[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[7]) + " + " + Integer.toString(clericOne.domainSpell[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[8]) + " + " + Integer.toString(clericOne.domainSpell[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(clericOne.totalClericSpells[9]) + " + " + Integer.toString(clericOne.domainSpell[9]));
    }
    public void spawnDruid(View view){
        druidOne = new DruidMake();
        druidOne.spawnLV1Druid();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(druidOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(druidOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(druidOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(druidOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(druidOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(druidOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(druidOne.sizeFeet) + "' "  + Integer.toString(druidOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(druidOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(druidOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + druidOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +druidOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(druidOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(druidOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(druidOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(druidOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(druidOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(druidOne.touchAC));
        if(druidOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(druidOne.AttackBonus[0]));
        }
        if(druidOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(druidOne.AttackBonus[1]));
        }
        if(druidOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(druidOne.AttackBonus[2]));
        }
        if(druidOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(druidOne.AttackBonus[3]));
        }
        if(druidOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[0]));
        }
        if(druidOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[1]));
        }
        if(druidOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[2]));
        }
        if(druidOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(druidOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(druidOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(druidOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(druidOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(druidOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(druidOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(druidOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(druidOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(druidOne.SpecialSkills[0]);
        textTest.append(", " + druidOne.SpecialSkills[1]);
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[9]));

        //incomplete

    }
    public void levelUpDruidButton(View view){

        druidOne.levelUpDruid();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(druidOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(druidOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(druidOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(druidOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(druidOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(druidOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(druidOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(druidOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(druidOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(druidOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(druidOne.touchAC));
        if(druidOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(druidOne.AttackBonus[0]));
        }
        if(druidOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(druidOne.AttackBonus[1]));
        }
        if(druidOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(druidOne.AttackBonus[2]));
        }
        if(druidOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(druidOne.AttackBonus[3]));
        }
        if(druidOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[0]));
        }
        if(druidOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[1]));
        }
        if(druidOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[2]));
        }
        if(druidOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(druidOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(druidOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(druidOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(druidOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(druidOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(Integer.toString(druidOne.totalDruidSpells[9]));
    }
    public void spawnFighter(View view){
        fighterOne = new FighterMake();
        fighterOne.spawnLV1FighterStr();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(fighterOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(fighterOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(fighterOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(fighterOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(fighterOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(fighterOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(fighterOne.sizeFeet) + "' "  + Integer.toString(fighterOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(fighterOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(fighterOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + fighterOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +fighterOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(fighterOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(fighterOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(fighterOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(fighterOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(fighterOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(fighterOne.touchAC));
        if(fighterOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[0]));
        }
        if(fighterOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[1]));
        }
        if(fighterOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[2]));
        }
        if(fighterOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[3]));
        }
        if(fighterOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[0]));
        }
        if(fighterOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[1]));
        }
        if(fighterOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[2]));
        }
        if(fighterOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(fighterOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(fighterOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(fighterOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(fighterOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(fighterOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(fighterOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(fighterOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(fighterOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(fighterOne.SpecialSkills[0]);
        textTest.append(", " + fighterOne.SpecialSkills[1]);

        //incomplete

    }
    public void levelUpFighterButton(View view){

        fighterOne.levelUpFighter();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(fighterOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(fighterOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(fighterOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(fighterOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(fighterOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(fighterOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(fighterOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(fighterOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(fighterOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(fighterOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(fighterOne.touchAC));
        if(fighterOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[0]));
        }
        if(fighterOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[1]));
        }
        if(fighterOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[2]));
        }
        if(fighterOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(fighterOne.AttackBonus[3]));
        }
        if(fighterOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[0]));
        }
        if(fighterOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[1]));
        }
        if(fighterOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[2]));
        }
        if(fighterOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(fighterOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(fighterOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(fighterOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(fighterOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(fighterOne.SpecialSkills[c] + ", ");
            c++;
        }


    }
    public void spawnMonk(View view){
        monkOne = new MonkMake();
        monkOne.spawnLV1Monk();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(monkOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(monkOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(monkOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(monkOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(monkOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(monkOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(monkOne.sizeFeet) + "' "  + Integer.toString(monkOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(monkOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(monkOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + monkOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +monkOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(monkOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(monkOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(monkOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(monkOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(monkOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(monkOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(monkOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(monkOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(monkOne.touchAC));
        if(monkOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(monkOne.AttackBonus[0]));
        }
        if(monkOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(monkOne.AttackBonus[1]));
        }
        if(monkOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(monkOne.AttackBonus[2]));
        }
        if(monkOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(monkOne.AttackBonus[3]));
        }
        if(monkOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[0]));
        }
        if(monkOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[1]));
        }
        if(monkOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[2]));
        }
        if(monkOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(monkOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(monkOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(monkOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(monkOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(monkOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(monkOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(monkOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(monkOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(monkOne.SpecialSkills[0]);
        textTest.append(", " + monkOne.SpecialSkills[1]);

        //incomplete

    }
    public void levelUpMonkButton(View view){

        monkOne.levelUpMonk();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(monkOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(monkOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(monkOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(monkOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(monkOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(monkOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(monkOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(monkOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(monkOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(monkOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(monkOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(monkOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(monkOne.touchAC));
        if(monkOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(monkOne.AttackBonus[0]));
        }
        if(monkOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(monkOne.AttackBonus[1]));
        }
        if(monkOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(monkOne.AttackBonus[2]));
        }
        if(monkOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(monkOne.AttackBonus[3]));
        }
        if(monkOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[0]));
        }
        if(monkOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[1]));
        }
        if(monkOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[2]));
        }
        if(monkOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(monkOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(monkOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(monkOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(monkOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(monkOne.SpecialSkills[c] + ", ");
            c++;
        }


    }
    public void spawnPaladin(View view){
        paladinOne = new PaladinMake();
        paladinOne.spawnLV1Paladin();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(paladinOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(paladinOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(paladinOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(paladinOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(paladinOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(paladinOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(paladinOne.sizeFeet) + "' "  + Integer.toString(paladinOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(paladinOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(paladinOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + paladinOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +paladinOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(paladinOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(paladinOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(paladinOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(paladinOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(paladinOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(paladinOne.touchAC));
        if(paladinOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[0]));
        }
        if(paladinOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[1]));
        }
        if(paladinOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[2]));
        }
        if(paladinOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[3]));
        }
        if(paladinOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[0]));
        }
        if(paladinOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[1]));
        }
        if(paladinOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[2]));
        }
        if(paladinOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(paladinOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(paladinOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(paladinOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(paladinOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(paladinOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(paladinOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(paladinOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(paladinOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(paladinOne.SpecialSkills[0]);
        textTest.append(", " + paladinOne.SpecialSkills[1]);

            textTest = (TextView) this.findViewById(R.id.SpellsAt0);
            textTest.setText("0");

            textTest = (TextView) this.findViewById(R.id.SpellsAt1);
            textTest.setText("0");


            textTest = (TextView) this.findViewById(R.id.SpellsAt2);
            textTest.setText("0");

            textTest = (TextView) this.findViewById(R.id.SpellsAt3);
            textTest.setText("0");


            textTest = (TextView) this.findViewById(R.id.SpellsAt4);
            textTest.setText("0");


        //incomplete*/

    }
    public void levelUpPaladinButton(View view){

        paladinOne.levelUpPaladin();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(paladinOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(paladinOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(paladinOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(paladinOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(paladinOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(paladinOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(paladinOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(paladinOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(paladinOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(paladinOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(paladinOne.touchAC));
        if(paladinOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[0]));
        }
        if(paladinOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[1]));
        }
        if(paladinOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[2]));
        }
        if(paladinOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(paladinOne.AttackBonus[3]));
        }
        if(paladinOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[0]));
        }
        if(paladinOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[1]));
        }
        if(paladinOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[2]));
        }
        if(paladinOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(paladinOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(paladinOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(paladinOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(paladinOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(paladinOne.SpecialSkills[c] + ", ");
            c++;
        }

        if(paladinOne.totalPaladinSpells[0] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt0);
            textTest.setText("");
        }
        if(paladinOne.totalPaladinSpells[1] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt1);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[1]));

        }
        if(paladinOne.totalPaladinSpells[2] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt2);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[2]));
        }
        if(paladinOne.totalPaladinSpells[3] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt3);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[3]));
        }
        if(paladinOne.totalPaladinSpells[4] != -99){
            textTest = (TextView) this.findViewById(R.id.SpellsAt4);
            textTest.setText(Integer.toString(paladinOne.totalPaladinSpells[4]));
        }

    }
    public void spawnRanger(View view){
        rangerOne = new RangerMake();
        rangerOne.spawnLV1Ranger();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rangerOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(rangerOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rangerOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(rangerOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(rangerOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(rangerOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(rangerOne.sizeFeet) + "' "  + Integer.toString(rangerOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(rangerOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(rangerOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + rangerOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +rangerOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rangerOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rangerOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rangerOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rangerOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rangerOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rangerOne.touchAC));
        if(rangerOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[0]));
        }
        if(rangerOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[1]));
        }
        if(rangerOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[2]));
        }
        if(rangerOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[3]));
        }
        if(rangerOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[0]));
        }
        if(rangerOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[1]));
        }
        if(rangerOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[2]));
        }
        if(rangerOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rangerOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(rangerOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(rangerOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rangerOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(rangerOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(rangerOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(rangerOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rangerOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(rangerOne.SpecialSkills[0]);
        textTest.append(", " + rangerOne.SpecialSkills[1]);
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText("-");
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText("-");
        //incomplete*/

    }
    public void levelUpRangerButton(View view){

        rangerOne.levelUpRanger();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rangerOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rangerOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rangerOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rangerOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rangerOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rangerOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rangerOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rangerOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rangerOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rangerOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rangerOne.touchAC));
        if(rangerOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[0]));
        }
        if(rangerOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[1]));
        }
        if(rangerOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[2]));
        }
        if(rangerOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rangerOne.AttackBonus[3]));
        }
        if(rangerOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[0]));
        }
        if(rangerOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[1]));
        }
        if(rangerOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[2]));
        }
        if(rangerOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rangerOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rangerOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rangerOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rangerOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(rangerOne.SpecialSkills[c] + ", ");
            c++;
        }

        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(Integer.toString(rangerOne.totalRangerSpells[4]));

    }
    public void spawnRouge(View view){
        rougeOne = new RougeMake();
        rougeOne.spawnLV1Rouge();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rougeOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(rougeOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rougeOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(rougeOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(rougeOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(rougeOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(rougeOne.sizeFeet) + "' "  + Integer.toString(rougeOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(rougeOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(rougeOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + rougeOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +rougeOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rougeOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rougeOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rougeOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rougeOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rougeOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rougeOne.touchAC));
        if(rougeOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[0]));
        }
        if(rougeOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[1]));
        }
        if(rougeOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[2]));
        }
        if(rougeOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[3]));
        }
        if(rougeOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[0]));
        }
        if(rougeOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[1]));
        }
        if(rougeOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[2]));
        }
        if(rougeOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rougeOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(rougeOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(rougeOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rougeOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(rougeOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(rougeOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(rougeOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rougeOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(rougeOne.SpecialSkills[0]);
        textTest.append(", " + rougeOne.SpecialSkills[1]);

        //incomplete*/

    }
    public void levelUpRougeButton(View view){

        rougeOne.levelUpRouge();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(rougeOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(rougeOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(rougeOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(rougeOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(rougeOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(rougeOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(rougeOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(rougeOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(rougeOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(rougeOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(rougeOne.touchAC));
        if(rougeOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[0]));
        }
        if(rougeOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[1]));
        }
        if(rougeOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[2]));
        }
        if(rougeOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(rougeOne.AttackBonus[3]));
        }
        if(rougeOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[0]));
        }
        if(rougeOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[1]));
        }
        if(rougeOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[2]));
        }
        if(rougeOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(rougeOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(rougeOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(rougeOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(rougeOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);


        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(rougeOne.SpecialSkills[c] + ", ");
            c++;
        }


    }
    public void spawnWizard(View view){
        wizardOne = new WizardMake();
        wizardOne.spawnLV1Wiz();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(wizardOne.firstName);

        textTest = (TextView) this.findViewById(R.id.lastNameID);
        textTest.setText(wizardOne.lastName);
        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(wizardOne.level));
        textTest = (TextView) this.findViewById(R.id.genderID);
        textTest.setText(wizardOne.gender);
        textTest = (TextView) this.findViewById(R.id.alignmentView);
        textTest.setText(wizardOne.alignment);
        textTest = (TextView) this.findViewById(R.id.sizeClassView);
        textTest.setText(wizardOne.sizeClass);
        textTest = (TextView) this.findViewById(R.id.heightWord);
        textTest.setText(Integer.toString(wizardOne.sizeFeet) + "' "  + Integer.toString(wizardOne.sizeInches) + "''");
        textTest = (TextView) this.findViewById(R.id.Weight);
        textTest.setText(Integer.toString(wizardOne.weight) + "lbs");
        textTest = (TextView) this.findViewById(R.id.ageView);
        textTest.setText(Integer.toString(wizardOne.age));
        textTest = (TextView) this.findViewById(R.id.hairView);
        textTest.setText("hair: " + wizardOne.hair);
        textTest = (TextView) this.findViewById(R.id.eyesView);
        textTest.setText("Eyes: " +wizardOne.eyes);
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(wizardOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(wizardOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(wizardOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(wizardOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(wizardOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(wizardOne.touchAC));
        if(wizardOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[0]));
        }
        if(wizardOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[1]));
        }
        if(wizardOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[2]));
        }
        if(wizardOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[3]));
        }
        if(wizardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[0]));
        }
        if(wizardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[1]));
        }
        if(wizardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[2]));
        }
        if(wizardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(wizardOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.hitDieNum);
        textTest.setText(Integer.toString(wizardOne.hitDie1D));
        textTest = (TextView) this.findViewById(R.id.ranksNum);
        textTest.setText(Integer.toString(wizardOne.ranksPerLevelBase));
        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(wizardOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.weaponProfString);
        textTest.setText(wizardOne.weaponProf);
        textTest = (TextView) this.findViewById(R.id.armProfString);
        textTest.setText(wizardOne.armorProf);
        textTest = (TextView) this.findViewById(R.id.raceView);
        textTest.setText(wizardOne.race);
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(wizardOne.Initiative));
        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText(wizardOne.SpecialSkills[0]);
        textTest.append(", " + wizardOne.SpecialSkills[1]);
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[9]));
        //incomplete*/

    }
    public void levelUpWizardButton(View view){

        wizardOne.levelUpWiz();
        TextView textTest = (TextView) this.findViewById(R.id.firstNameID);
        textTest.setText(wizardOne.firstName);


        textTest = (TextView) this.findViewById(R.id.levelID);
        textTest.setText("Lv: " + Integer.toString(wizardOne.level));
        textTest = (TextView) this.findViewById(R.id.strNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[0]));
        textTest = (TextView) this.findViewById(R.id.dexNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[1]));
        textTest = (TextView) this.findViewById(R.id.conNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[2]));
        textTest = (TextView) this.findViewById(R.id.intNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[3]));
        textTest = (TextView) this.findViewById(R.id.wisNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[4]));
        textTest = (TextView) this.findViewById(R.id.chaNumView);
        textTest.setText(Integer.toString(wizardOne.characterStats[5]));
        textTest = (TextView) this.findViewById(R.id.strModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[0]));
        textTest = (TextView) this.findViewById(R.id.dexModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[1]));
        textTest = (TextView) this.findViewById(R.id.conModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[2]));
        textTest = (TextView) this.findViewById(R.id.intModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[3]));
        textTest = (TextView) this.findViewById(R.id.wisModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[4]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.chaModNumView);
        textTest.setText(Integer.toString(wizardOne.characterMods[5]));
        textTest = (TextView) this.findViewById(R.id.fortTotalNumView);
        textTest.setText(Integer.toString(wizardOne.fortSave));
        textTest = (TextView) this.findViewById(R.id.refTotalNumView);
        textTest.setText(Integer.toString(wizardOne.refSave));
        textTest = (TextView) this.findViewById(R.id.willTotalNumView);
        textTest.setText(Integer.toString(wizardOne.willSave));
        textTest = (TextView) this.findViewById(R.id.willBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseWillSave));
        textTest = (TextView) this.findViewById(R.id.refBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseRefSave));
        textTest = (TextView) this.findViewById(R.id.fortBaseNumView);
        textTest.setText(Integer.toString(wizardOne.baseFortSave));
        textTest = (TextView) this.findViewById(R.id.acTotalNumView);
        textTest.setText(Integer.toString(wizardOne.AC));
        textTest = (TextView) this.findViewById(R.id.flatTotalNumView);
        textTest.setText(Integer.toString(wizardOne.FlatFootAC));
        textTest = (TextView) this.findViewById(R.id.touchTotalNumView);
        textTest.setText(Integer.toString(wizardOne.touchAC));
        if(wizardOne.AttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus1);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[0]));
        }
        if(wizardOne.AttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus2);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[1]));
        }
        if(wizardOne.AttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus3);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[2]));
        }
        if(wizardOne.AttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackBonus4);
            textTest.setText(Integer.toString(wizardOne.AttackBonus[3]));
        }
        if(wizardOne.baseAttackBonus[0] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus1);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[0]));
        }
        if(wizardOne.baseAttackBonus[1] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus2);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[1]));
        }
        if(wizardOne.baseAttackBonus[2] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus3);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[2]));
        }
        if(wizardOne.baseAttackBonus[3] != -99){
            textTest = (TextView) this.findViewById(R.id.attackbaseBonus4);
            textTest.setText(Integer.toString(wizardOne.baseAttackBonus[3]));
        }
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(Integer.toString(wizardOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.moveSpeedNum);
        textTest.setText(Integer.toString(wizardOne.travelSpeed));
        textTest = (TextView) this.findViewById(R.id.InitiativeNum);
        textTest.setText(" +" + Integer.toString(wizardOne.Initiative));

        textTest = (TextView) this.findViewById(R.id.specialSkills);
        textTest.setText("");
        c = 0;
        while(c < 100){
            textTest.append(wizardOne.SpecialSkills[c] + ", ");
            c++;
        }
        textTest = (TextView) this.findViewById(R.id.SpellsAt0);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[0]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt1);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[1]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt2);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[2]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt3);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[3]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt4);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[4]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt5);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[5]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt6);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[6]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt7);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[7]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt8);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[8]));
        textTest = (TextView) this.findViewById(R.id.SpellsAt9);
        textTest.setText(" +" + Integer.toString(wizardOne.totalSorcSpells[9]));

    }
    public void makeExternalDir(View view){
        // create a directory before creating a new file inside it.
        String intStorageDirectory = getFilesDir().toString();
        File mydir = new File(Environment.getExternalStorageDirectory() + "/mydir/");
        mydir.mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("sample.txt."), "utf-8"))) {
            writer.write("Character : dsadasdasmnbdsaknmdhgbsahjdkgsahjdasgvdhjsgdahjdgashjdgasdjhsagdsjhdgsahjdgsadhjsagdhjsadgsahjdsahjdsagjhsadghjdgsdjhsagdhjasdgasjhdgsadjhas");
            writer.newLine();
            writer.close();
        }
        catch (IOException x) {
            System.err.println(x);
        }

    }

}

