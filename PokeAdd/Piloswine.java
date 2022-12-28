public class Piloswine extends Pokemon{
	{
		name = "Piloswine";
		bHP = 10;
		bAtk = 10;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 5;
		type1 = "Ice";
		type2 = "Ground";
		abilities = new String[]{"Thick Fat", "Pickup", "Oblivious", "Snow Cloak", "Kiss"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Swinub();
		prevReq = 30;
		next = new String[]{"Mamoswine"};
		nextReq = new String[]{"Ancient"};
		height = "3\'/7\"";
		weight = 123;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Cave", "Taiga", "Tundra"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Tundra"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 1;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 11, 14, 18, 21, 24, 28, 37, 41, 46, 52, 58};
		moves = new String[]{"Mud Sport", "Powder Snow", "MudSlap", "Endure", "Mud Bomb", "Icy Wind", "Ice Fang", "Take Down", "Mist", "Thrash", "Earthquake", "Blizzard", "Amnesia"};
		TMs = new String[]{"Roar", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Double Team", "Reflect", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Giga Impact", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Avalanche", "Body Slam", "Slam", "Defense Curl", "Earth Power", "Endeavor", "Icy Wind", "Snore", "Stealth Rock", "Stomping Tantrum", "Superpower"};
		naturalMoves = new String[]{"Ancient Power", "Peck"};
	}
		Piloswine(){

		super();
		}
}