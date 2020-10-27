public class Mamoswine extends Pokemon{
	{
		name = "Mamoswine";
		bHP = 11;
		bAtk = 13;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 6;
		bSpd = 8;
		type1 = "Ice";
		type2 = "Ground";
		abilities = new String[]{"Oblivious", "Snow Cloak", "Thick Fat", "Gluttony", "Ice Body"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Piloswine();
		prevReq = 50;
		height = "8\'/2\"";
		size = "Large";
		weight = 641.5;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Tundra"};
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 10;
		natureWalk = new String[]{"Tundra"};
		underdog = false;
		other = new String[]{"Chilled","Freezer","Mountable 1"};
		athl = 5;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 2;
		focus = 4;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 11, 14, 18, 21, 24, 28, 33, 37, 41, 46, 52, 58};
		moves = new String[]{"Mud Sport", "Powder Snow", "MudSlap", "Endure", "Mud Bomb", "Icy Wind", "Ice Shard", "Take Down", "Double Hit", "Mist", "Thrash", "Earthquake", "Blizzard", "Scary Face"};
		TMs = new String[]{"Strength", "Roar", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Dig", "Double Team", "Reflect", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Giga Impact", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Ancient Power", "Avalanche", "Block", "Body Slam", "Slam", "Defense Curl", "Earth Power", "Endeavor", "Horn Attack", "Icy Wind", "Iron Head", "Knock Off", "Rock Climb", "Scary Face", "Sleep Talk", "Snore", "Stealth Rock", "Superpower"};
		naturalMoves = new String[]{"Ancient Power", "Peck", "Scary Face"};
	}
		Mamoswine(){

		super();
		}
}