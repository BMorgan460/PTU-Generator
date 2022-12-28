public class Pignite extends Pokemon{
	{
		name = "Pignite";
		bHP = 9;
		bAtk = 9;
		bDef = 6;
		bSpAtk = 7;
		bSpDef = 6;
		bSpd = 6;
		type1 = "Fire";
		type2 = "Fighting";
		abilities = new String[]{"Blaze", "Thick Fat", "Gluttony", "Reckless", "Bodyguard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Tepig();
		prevReq = 15;
		next = new String[]{"Emboar"};
		nextReq = new String[]{"30"};
		height = "3\'/3\"";
		weight = 122.4;
		WC = 4;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest", "Grassland", "Mountain"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Grassland"};
		underdog = true;
		other = new String[]{"Firestarter","Heater","Tracker"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 7, 9, 13, 15, 20, 23, 28, 31, 36, 39, 44, 47, 52};
		moves = new String[]{"Tail Whip", "Ember", "Odor Sleuth", "Defense Curl", "Flame Charge", "Smog", "Rollout", "Take Down", "Heat Crash", "Assurance", "Flamethrower", "Head Smash", "Roar", "Flare Blitz"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Frustration", "Solar Beam", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Facade", "Flame Charge", "Rest", "Attract", "Low Sweep", "Round", "Echoed Voice", "Overheat", "Focus Blast", "Fling", "Stone Edge", "Gyro Ball", "Bulldoze", "Rock Slide", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Covet", "Endeavor", "Fire Pledge", "Fire Punch", "Focus Punch", "Heat Wave", "Helping Hand", "Iron Tail", "Low Kick", "Snore", "Stomping Tantrum", "Superpower", "Thunder Punch", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Pignite(){

		super();
		}
}