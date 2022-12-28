public class Herdier extends Pokemon{
	{
		name = "Herdier";
		bHP = 7;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 4;
		bSpDef = 7;
		bSpd = 6;
		type1 = "Normal";
		type2 = "";
		abilities = new String[]{"Intimidate", "Vital Spirit", "Sand Rush", "Run Away", "Scrappy"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Lillipup();
		prevReq = 15;
		next = new String[]{"Stoutland"};
		nextReq = new String[]{"30"};
		height = "2\'/11\"";
		size = "Small";
		weight = 32.4;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Omnivore";
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Grassland", "Urban"};
		underdog = true;
		other = new String[]{"Tracker"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 12, 15, 20, 24, 29, 33, 38, 42, 47, 52};
		moves = new String[]{"Odor Sleuth", "Bite", "Helping Hand", "Take Down", "Work Up", "Crunch", "Roar", "Retaliate", "Reversal", "Last Resort", "Giga Impact", "Play Rough"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Return", "Shadow Ball", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Payback", "Giga Impact", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Surf", "Snarl", "Confide"};
		tutorMoves = new String[]{"After You", "Covet", "Helping Hand", "Hyper Voice", "Last Resort", "Shock Wave", "Snore", "Uproar"};
		naturalMoves = new String[]{};
	}
		Herdier(){

		super();
		}
}