public class Excadrill extends Pokemon{
	{
		name = "Excadrill";
		bHP = 11;
		bAtk = 14;
		bDef = 6;
		bSpAtk = 5;
		bSpDef = 7;
		bSpd = 9;
		type1 = "Ground";
		type2 = "Steel";
		abilities = new String[]{"Sand Rush", "Sand Force", "Mold Breaker", "Sand Veil", "Parry"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Drilbur();
		prevReq = 30;
		height = "2\'/4\"";
		size = "Small";
		weight = 89.1;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		overland = 5;
		swim = 4;
		levitate = 0;
		burrow = 8;
		lJump = 1 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = false;
		other = new String[]{"Groundshaper","Tremorsense"};
		athl = 4;
		acro = 3;
		combat = 4;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55, 62};
		moves = new String[]{"Rapid Spin", "MudSlap", "Fury Swipes", "Metal Claw", "Dig", "Hone Claws", "Slash", "Rock Slide", "Earthquake", "Swords Dance", "Sandstorm", "Drill Run", "Fissure"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Protect", "Frustration", "Earthquake", "Return", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Sandstorm", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Focus Blast", "Fling", "Brutal Swing", "Shadow Claw", "Smart Strike", "Giga Impact", "Swords Dance", "Bulldoze", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Drill Run", "Earth Power", "Iron Defense", "Iron Head", "Magnet Rise", "Rock Climb", "Snore", "Stealth Rock", "Stomping Tantrum"};
		naturalMoves = new String[]{"Rototiller"};
	}
		Excadrill(){

		super();
		}
}