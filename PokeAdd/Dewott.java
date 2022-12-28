public class Dewott extends Pokemon{
	{
		name = "Dewott";
		bHP = 8;
		bAtk = 8;
		bDef = 6;
		bSpAtk = 8;
		bSpDef = 6;
		bSpd = 6;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Inner Focus", "Torrent", "Shell Armor", "Water Absorb", "Parry"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Oshawott();
		prevReq = 15;
		next = new String[]{"Samurott"};
		nextReq = new String[]{"30"};
		height = "2\'/7\"";
		weight = 54;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Herbivore";
		overland = 6;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Ocean"};
		underdog = true;
		other = new String[]{"Fountain","Wielder"};
		athl = 4;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 3;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 7, 11, 13, 18, 21, 26, 29, 34, 37, 42, 45, 50, 53};
		moves = new String[]{"Tail Whip", "Water Gun", "Water Sport", "Focus Energy", "Razor Shell", "Fury Cutter", "Water Pulse", "Revenge", "Aqua Jet", "Encore", "Aqua Tail", "Retaliate", "Swords Dance", "Hydro Pump"};
		TMs = new String[]{"Work Up", "Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "False Swipe", "Scald", "Fling", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Covet", "Helping Hand", "Icy Wind", "Iron Tail", "Snore", "Water Pledge", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Dewott(){

		super();
		}
}