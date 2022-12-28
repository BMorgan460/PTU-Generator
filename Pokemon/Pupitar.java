public class Pupitar extends Pokemon{
	{
		name = "Pupitar";
		bHP = 7;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Rock";
		type2 = "Ground";
		abilities = new String[]{"Shed Skin", "Battle Armor", "Sand Veil", "Deep Sleep", "Unnerve"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Larvitar();
		prevReq = 30;
		next = new String[]{"Tyranitar"};
		nextReq = new String[]{"50"};
		height = "3\'/11\"";
		weight = 335.1;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Terravore";
		overland = 3;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 8;
		natureWalk = new String[]{"Mountain"};
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 1;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{5, 10, 14, 19, 23, 28, 34, 41, 47, 54, 60, 67};
		moves = new String[]{"Sandstorm", "Screech", "Chip Away", "Rock Slide", "Scary Face", "Thrash", "Dark Pulse", "Payback", "Crunch", "Earthquake", "Stone Edge", "Hyper Beam"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Earthquake", "Return", "Brick Break", "Double Team", "Sandstorm", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Round", "Payback", "Rock Polish", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Snarl", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Body Slam", "Slam", "Earth Power", "Iron Defense", "Iron Head", "Iron Tail", "Outrage", "Snore", "Spite", "Stealth Rock", "Superpower", "Uproar"};
		naturalMoves = new String[]{};
	}
		Pupitar(){

		super();
		}
}