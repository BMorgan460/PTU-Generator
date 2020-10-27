public class Glaceon extends Pokemon{
	{
		name = "Glaceon";
		bHP = 7;
		bAtk = 6;
		bDef = 11;
		bSpAtk = 13;
		bSpDef = 10;
		bSpd = 7;
		type1 = "Ice";
		type2 = "";
		abilities = new String[]{"Snow Cloak", "Covert", "Ice Body", "Winter's Kiss", "Frostbite"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Eevee();
		prevReq = 6;
		height = "2\'/7\"";
		weight = 57.1;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Omnivore";
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Tundra"};
		underdog = false;
		other = new String[]{"Freezer","Tracker"};
		athl = 5;
		acro = 3;
		combat = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Sand Attack", "Icy Wind", "Quick Attack", "Bite", "Ice Fang", "Ice Shard", "Barrier", "Mirror Coat", "Hail", "Last Resort", "Blizzard"};
		TMs = new String[]{"Strength", "Roar", "Toxic", "Hail", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Dig", "Shadow Ball", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Retaliate", "Giga Impact", "Frost Breath", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Aqua Tail", "Avalanche", "Covet", "Heal Bell", "Helping Hand", "Hyper Voice", "Icy Wind", "Iron Tail", "Last Resort", "Signal Beam", "Sleep Talk", "Snore", "Swift", "Work Up"};
		naturalMoves = new String[]{};
	}
		Glaceon(){

		super();
		}
}