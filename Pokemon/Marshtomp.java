public class Marshtomp extends Pokemon{
	{
		name = "Marshtomp";
		bHP = 7;
		bAtk = 9;
		bDef = 7;
		bSpAtk = 6;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Water";
		type2 = "Ground";
		abilities = new String[]{"Mud Dweller", "Torrent", "Damp", "Own Tempo", "Regenerator"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Mudkip();
		prevReq = 15;
		next = new String[]{"Swampert"};
		nextReq = new String[]{"30"};
		height = "2\'/4\"";
		size = "Small";
		weight = 61.7;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Water";
		habitats = new String[]{"Marsh"};
		overland = 5;
		swim = 6;
		levitate = 0;
		burrow = 2;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Wetlands"};
		underdog = true;
		other = new String[]{"Fountain","Gilled"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{4, 9, 12, 18, 22, 28, 32, 38, 42, 48, 52};
		moves = new String[]{"Water Gun", "MudSlap", "Foresight", "Bide", "Mud Bomb", "Rock Slide", "Protect", "Muddy", "Take Down", "Earthquake", "Endeavor"};
		TMs = new String[]{"Work Up", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Brick Break", "Double Team", "Sludge", "Sludge Wave", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Scald", "Fling", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Aqua Tail", "Body Slam", "Slam", "Counter", "Defense Curl", "Dive", "Earth Power", "Endeavor", "Ice Punch", "Icy Wind", "Iron Tail", "Low Kick", "Mega Kick", "Mega Punch", "Rollout", "Snore", "Stealth Rock", "Superpower", "Uproar", "Water Pledge", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{};
	}
		Marshtomp(){

		super();
		}
}