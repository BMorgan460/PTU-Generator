public class Boldore extends Pokemon{
	{
		name = "Boldore";
		bHP = 7;
		bAtk = 11;
		bDef = 11;
		bSpAtk = 5;
		bSpDef = 4;
		bSpd = 2;
		type1 = "Rock";
		type2 = "";
		abilities = new String[]{"Sturdy", "Sand Rush", "Sand Force", "Sand Veil", "Solar Power"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Roggenrola();
		prevReq = 25;
		next = new String[]{"Gigalith"};
		nextReq = new String[]{"40"};
		height = "2\'/11\"";
		weight = 224.9;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Mineral";
		egg2 = "Terravore";
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 8;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{4, 7, 10, 14, 17, 20, 23, 25, 30, 36, 42, 48, 55};
		moves = new String[]{"Harden", "Sand Attack", "Headbutt", "Rock Blast", "MudSlap", "Iron Defense", "Smack Down", "Power Gem", "Rock Slide", "Stealth Rock", "Sandstorm", "Stone Edge", "Explosion"};
		TMs = new String[]{"Strength", "Toxic", "Hidden Power", "Protect", "Frustration", "Smack Down", "Earthquake", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Explosion", "Rock Polish", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Rock Smash", "Nature Power"};
		tutorMoves = new String[]{"Block", "Earth Power", "Gravity", "Iron Defense", "Sleep Talk", "Snore", "Stealth Rock"};
		naturalMoves = new String[]{};
	}
		Boldore(){

		super();
		}
}