public class Larvitar extends Pokemon{
	{
		name = "Larvitar";
		bHP = 5;
		bAtk = 6;
		bDef = 5;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 4;
		type1 = "Rock";
		type2 = "Ground";
		abilities = new String[]{"Guts", "Battle Armor", "Sand Veil", "Gluttony", "Unnerve"};
		abilityTypeCount = new int[] {1,3,1};
		next = new String[]{"Pupitar", "Tyranitar"};
		nextReq = new String[]{"50"};
		height = "2\'/0\"";
		size = "Small";
		weight = 158.7;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "";
		overland = 4;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 7;
		natureWalk = new String[]{"Mountain"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 2;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 55};
		moves = new String[]{"Bite", "Leer", "Sandstorm", "Screech", "Chip Away", "Rock Slide", "Scary Face", "Thrash", "Dark Pulse", "Payback", "Crunch", "Earthquake", "Stone Edge", "Hyper Beam"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Earthquake", "Return", "Brick Break", "Double Team", "Sandstorm", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Round", "Payback", "Rock Polish", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Snarl", "Dark Pulse", "Confide"};
		eggMoves = new String[]{"Ancient Power", "Assurance", "Curse", "Dragon Dance", "Focus Energy", "Iron Defense", "Iron Head", "Iron Tail", "Outrage", "Pursuit", "Stealth Rock", "Stomp"};
		tutorMoves = new String[]{"Ancient Power", "Body Slam", "Slam", "Earth Power", "Iron Defense", "Iron Head", "Iron Tail", "Outrage", "Snore", "Spite", "Stealth Rock", "Superpower", "Uproar"};
		naturalMoves = new String[]{};
	}
		Larvitar(){

		super();
		}
}