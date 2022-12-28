public class Vaporeon extends Pokemon{
	{
		name = "Vaporeon";
		bHP = 13;
		bAtk = 7;
		bDef = 6;
		bSpAtk = 11;
		bSpDef = 10;
		bSpd = 7;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Water Absorb", "Swift Swim", "Type Aura", "Hydration", "Wash Away"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Eevee();
		prevReq = 20;
		height = "3\'/3\"";
		weight = 63.9;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Omnivore";
		overland = 5;
		swim = 8;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		underdog = false;
		other = new String[]{"Amorphous","Amorphous","Fountain","Gilled","Tracker"};
		athl = 5;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 20, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Sand Attack", "BabyDoll", "Quick Attack", "Water Pulse", "Aurora Beam", "Aqua Ring", "Acid Armor", "Haze", "Muddy Water", "Last Resort", "Hydro Pump"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hail", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Shadow Ball", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Scald", "Giga Impact", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Ring", "Aqua Tail", "Body Slam", "Slam", "Brine", "Covet", "Dive", "Heal Bell", "Helping Hand", "Hyper Voice", "Icy Wind", "Iron Tail", "Laser Focus", "Last Resort", "Signal Beam", "Snore", "Swift", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Helping Hand"};
	}
		Vaporeon(){

		super();
		}
}