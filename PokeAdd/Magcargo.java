public class Magcargo extends Pokemon{
	{
		name = "Magcargo";
		bHP = 6;
		bAtk = 5;
		bDef = 12;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 3;
		type1 = "Fire";
		type2 = "Rock";
		abilities = new String[]{"Magma Armor", "Sun Blanket", "Heat Mirage", "Thermosensitive", "Sol Veil"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Slugma();
		prevReq = 35;
		height = "2\'/7\"";
		weight = 121.3;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Terravore";
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 0;
		power = 4;
		underdog = false;
		other = new String[]{"Egg Warmer","Firestarter","Glow","Heater"};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 3;
		percep = 4;
		focus = 5;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 3;
		movesLevels = new int[]{6, 8, 13, 15, 20, 22, 27, 29, 34, 36, 43, 47, 54, 58};
		moves = new String[]{"Ember", "Rock Throw", "Harden", "Incinerate", "Clear Smog", "Ancient Power", "Flame Burst", "Rock Slide", "Lava Plume", "Amnesia", "Body Slam", "Recover", "Flamethrower", "Earth Power"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Frustration", "Solar Beam", "Smack Down", "Earthquake", "Return", "Double Team", "Reflect", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Overheat", "Explosion", "Giga Impact", "Rock Polish", "Stone Edge", "Gyro Ball", "Bulldoze", "Rock Slide", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"After You", "Ancient Power", "Defense Curl", "Earth Power", "Heat Wave", "Iron Defense", "Pain Split", "Rollout", "Snore", "Stealth Rock", "Stomping Tantrum"};
		naturalMoves = new String[]{"Earth Power"};
	}
		Magcargo(){

		super();
		}
}