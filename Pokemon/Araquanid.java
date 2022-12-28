public class Araquanid extends Pokemon{
	{
		name = "Araquanid";
		bHP = 7;
		bAtk = 7;
		bDef = 9;
		bSpAtk = 5;
		bSpDef = 13;
		bSpd = 4;
		type1 = "Water";
		type2 = "Bug";
		abilities = new String[]{"Water Bubble", "Friend Guard", "Overcoat", "Water Absorb", "Hydration"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Dewpider();
		prevReq = 20;
		height = "5\'/11\"";
		weight = 180.8;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Fresh", "Water", "Grassland"};
		overland = 6;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		underdog = true;
		other = new String[]{"Gilled","Wallclimber"};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 13, 16, 21, 26, 33, 38, 45, 50, 57, 62};
		moves = new String[]{"Infestation", "Spider Web", "Bug Bite", "Bubblebeam", "Bite", "Aqua Ring", "Leech Life", "Crunch", "Lunge", "Mirror Coat", "Liquidation", "Entrainment"};
		TMs = new String[]{"Toxic", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Safeguard", "Frustration", "Return", "Leech Life", "Double Team", "Reflect", "Facade", "Rest", "Attract", "Round", "Scald", "Frost Breath", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Ring", "Bug Bite", "Bite", "Giga Drain", "Iron Defense", "Icy Wind", "Laser Focus", "Liquidation", "Magic Coat", "Magic Room", "Signal Beam", "Snore", "Water Pulse", "Wide Guard", "Wonder Room"};
		naturalMoves = new String[]{"Snore", "Soak", "Wide Guard"};
	}
		Araquanid(){

		super();
		}
}