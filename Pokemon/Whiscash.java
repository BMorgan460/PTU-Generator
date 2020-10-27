public class Whiscash extends Pokemon{
	{
		name = "Whiscash";
		bHP = 11;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 7;
		bSpd = 6;
		type1 = "Water";
		type2 = "Ground";
		abilities = new String[]{"Oblivious", "Anticipation", "Gulp", "Mud Dweller", "Hydration"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Barboach();
		prevReq = 30;
		height = "2\'/11\"";
		weight = 52;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 3;
		swim = 5;
		levitate = 0;
		burrow = 2;
		lJump = 3 ;
		hJump = 3;
		power = 3;
		natureWalk = new String[]{"Wetlands"};
		underdog = false;
		other = new String[]{"Tremorsense","Gilled","Fountain"};
		athl = 4;
		acro = 2;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 6, 9, 13, 15, 17, 20, 25, 25, 28, 30, 34, 39, 45, 52};
		moves = new String[]{"Mud Sport", "Water Sport", "Water Gun", "Mud Bomb", "Amnesia", "Water Pulse", "Magnitude", "Rest", "Snore", "Aqua Tail", "Zen Headbutt", "Earthquake", "Muddy Water", "Future Sight", "Fissure"};
		TMs = new String[]{"Surf", "Strength", "Waterfall", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Scald", "Giga Impact", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Aqua Tail", "Bounce", "Dive", "Earth Power", "Icy Wind", "Sleep Talk", "Snore"};
		naturalMoves = new String[]{};
	}
		Whiscash(){

		super();
		}
}