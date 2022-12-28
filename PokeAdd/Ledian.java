public class Ledian extends Pokemon{
	{
		name = "Ledian";
		bHP = 6;
		bAtk = 4;
		bDef = 5;
		bSpAtk = 6;
		bSpDef = 11;
		bSpd = 9;
		type1 = "Bug";
		type2 = "Flying";
		abilities = new String[]{"Early Bird", "Huge Power", "Iron Fist", "Swarm", "Starlight"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Ledyba();
		prevReq = 15;
		height = "4\'/7\"";
		weight = 78.5;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Wallclimber"};
		athl = 4;
		acro = 4;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 3;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 12, 12, 12, 15, 20, 24, 29, 33, 38, 42, 47};
		moves = new String[]{"Supersonic", "Swift", "Light Screen", "Reflect", "Safeguard", "Mach Punch", "Silver Wind", "Comet Punch", "Baton Pass", "Agility", "Bug Buzz", "Air Slash", "DoubleEdge"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Roost", "Safeguard", "Frustration", "Solar Beam", "Return", "Brick Break", "Double Team", "Reflect", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Focus Blast", "Fling", "Acrobatics", "Swords Dance", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Defog", "Drain Punch", "Dynamic Punch", "Focus Punch", "Giga Drain", "Ice Punch", "Knock Off", "Mega Punch", "Ominous Wind", "Rollout", "Silver Wind", "Snore", "String Shot", "Swift", "Tailwind", "Thunder Punch", "Uproar"};
		naturalMoves = new String[]{};
	}
		Ledian(){

		super();
		}
}