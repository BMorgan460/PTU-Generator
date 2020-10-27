public class Donphan extends Pokemon{
	{
		name = "Donphan";
		bHP = 9;
		bAtk = 12;
		bDef = 12;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 5;
		type1 = "Ground";
		type2 = "";
		abilities = new String[]{"Sturdy", "Frisk", "Sand Veil", "Run Up", "Sand Force"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Phanpy();
		prevReq = 25;
		height = "3\'/7\"";
		weight = 264.6;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 7;
		natureWalk = new String[]{"Forest", "Mountain"};
		underdog = false;
		other = new String[]{"Tracker","Mountable 1"};
		athl = 5;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{6, 10, 15, 19, 24, 25, 30, 37, 43, 50};
		moves = new String[]{"Rapid Spin", "Rollout", "Assurance", "Knock Off", "Slam", "Fury Attack", "Magnitude", "Scary Face", "Earthquake", "Giga Impact"};
		TMs = new String[]{"Strength", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Earthquake", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Giga Impact", "Rock Polish", "Stone Edge", "Gyro Ball", "Bulldoze", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Ancient Power", "Block", "Body Slam", "Slam", "Bounce", "Counter", "Earth Power", "Endeavor", "Flail", "Gunk Shot", "Horn Attack", "Hyper Voice", "Iron Defense", "Iron Tail", "Knock Off", "Last Resort", "Odor Sleuth", "Rollout", "Seed Bomb", "Sleep Talk", "Snore", "Stealth Rock", "Superpower", "Thunder"};
		naturalMoves = new String[]{};
	}
		Donphan(){

		super();
		}
}