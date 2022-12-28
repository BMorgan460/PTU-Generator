public class Sandslash extends Pokemon{
	{
		name = "Sandslash";
		bHP = 8;
		bAtk = 10;
		bDef = 11;
		bSpAtk = 5;
		bSpDef = 6;
		bSpd = 7;
		type1 = "Ground";
		type2 = "";
		abilities = new String[]{"Pickup", "Quick Curl", "Sand Rush", "Sand Veil", "Dig Away"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Sandshrew();
		prevReq = 20;
		height = "3\'/3\"";
		weight = 65;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Carnivore";
		habitats = new String[]{"Cave", "Desert", "Forest"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 6;
		lJump = 1 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Desert", "Grassland"};
		underdog = false;
		other = new String[]{"Groundshaper","Tremorsense"};
		athl = 4;
		acro = 3;
		combat = 4;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{3, 5, 7, 9, 11, 14, 17, 20, 24, 28, 33, 38, 43, 48, 53};
		moves = new String[]{"Sand Attack", "Poison Sting", "Rollout", "Rapid Spin", "Fury Cutter", "Magnitude", "Swift", "Fury Swipes", "Sand Tomb", "Slash", "Dig", "Gyro Ball", "Swords Dance", "Sandstorm", "Earthquake"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Safeguard", "Frustration", "Earthquake", "Return", "Brick Break", "Double Team", "Sandstorm", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Focus Blast", "Fling", "Shadow Claw", "Giga Impact", "Stone Edge", "Gyro Ball", "Swords Dance", "Bulldoze", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Covet", "Crush Claw", "Dynamic Punch", "Earth Power", "Focus Punch", "Fury Cutter", "Iron Tail", "Knock Off", "Rollout", "Seismic Toss", "Snore", "Stealth Rock", "Stomping Tantrum", "Super Fang", "Swift"};
		naturalMoves = new String[]{"Crush Claw"};
	}
		Sandslash(){

		super();
		}
}