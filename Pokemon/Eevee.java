public class Eevee extends Pokemon{
	{
		name = "Eevee";
		bHP = 6;
		bAtk = 6;
		bDef = 5;
		bSpAtk = 5;
		bSpDef = 7;
		bSpd = 6;
		type1 = "Normal";
		type2 = "";
		abilities = new String[]{"Run Away", "Sprint", "Last Chance", "Anticipation", "Celebrate"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Vaporeon"};
		nextReq = new String[]{"20"};
		height = "1\'/0\"";
		size = "Small";
		weight = 14.3;
		WC = 1;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		underdog = true;
		other = new String[]{"Tracker"};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 2;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 1, 1, 5, 9, 13, 17, 17, 20, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Helping Hand", "Growl", "Tackle", "Tail Whip", "Sand Attack", "BabyDoll", "Quick Attack", "Bite", "Swift", "Refresh", "Take Down", "Charm", "Baton Pass", "DoubleEdge", "Last Resort", "Trump Card"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Frustration", "Return", "Shadow Ball", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		eggMoves = new String[]{"Captivate", "Charm", "Covet", "Curse", "Detect", "Endure", "Fake Tears", "Flail", "Natural Gift", "Stored Power", "Synchronoise", "Tickle", "Wish", "Yawn"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Heal Bell", "Helping Hand", "Hyper Voice", "Iron Tail", "Laser Focus", "Last Resort", "Snore", "Swift"};
		naturalMoves = new String[]{"Slam", "Covet", "Helping Hand"};
	}
		Eevee(){

		super();
		}
}