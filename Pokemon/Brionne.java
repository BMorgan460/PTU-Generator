public class Brionne extends Pokemon{
	{
		name = "Brionne";
		bHP = 6;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 5;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Swift Swim", "Torrent", "Liquid Voice", "Drown Out", "Wash Away"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Popplio();
		prevReq = 15;
		next = new String[]{"Primarina"};
		nextReq = new String[]{"30"};
		height = "2\'/0\"";
		size = "Small";
		weight = 38.6;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Water";
		egg2 = " ";
		overland = 4;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		underdog = true;
		other = new String[]{"Fountain"};
		athl = 3;
		acro = 4;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 4;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{4, 8, 11, 14, 16, 19, 24, 28, 33, 37, 42, 46, 51, 55};
		moves = new String[]{"Growl", "Disarming Voice", "BabyDoll", "Aqua Jet", "Icy Wind", "Encore", "Bubblebeam", "Sing", "Double Slap", "Hyper Voice", "Moonblast", "Captivate", "Hydro Pump", "Misty Terrain"};
		TMs = new String[]{"Work Up", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Scald", "Acrobatics", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Ring", "Aqua Tail", "Covet", "Helping Hand", "Hyper Voice", "Icy Wind", "Iron Tail", "Snore", "Uproar", "Water Pledge", "Water Pulse", "Wonder Room"};
		naturalMoves = new String[]{};
	}
		Brionne(){

		super();
		}
}