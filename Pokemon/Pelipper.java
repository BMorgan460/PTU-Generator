public class Pelipper extends Pokemon{
	{
		name = "Pelipper";
		bHP = 6;
		bAtk = 5;
		bDef = 10;
		bSpAtk = 10;
		bSpDef = 7;
		bSpd = 7;
		type1 = "Water";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Gluttony", "Rain Dish", "Lunchbox", "Big Swallow"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Wingull();
		prevReq = 25;
		height = "3\'/11\"";
		weight = 61.7;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Beach"};
		overland = 5;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 28, 33, 33, 33, 39, 44, 50, 55};
		moves = new String[]{"Supersonic", "Wing Attack", "Mist", "Water Pulse", "Payback", "Brine", "Fling", "Stockpile", "Swallow", "Spit Up", "Roost", "Tailwind", "Air Slash", "Hurricane"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Scald", "Fling", "Sky Drop", "Payback", "Giga Impact", "Fly", "Swagger", "Sleep Talk", "Substitute", "Surf", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Aqua Ring", "Brine", "Defog", "Gunk Shot", "Hydro Pump", "Icy Wind", "Iron Tail", "Knock Off", "Liquidation", "Ominous Wind", "Pluck", "Seed Bomb", "Shock Wave", "Sky Attack", "Snatch", "Snore", "Swift", "Twister", "Water Pulse", "Uproar"};
		naturalMoves = new String[]{"Hurricane", "Hydro Pump", "Snore", "Soak", "Swift", "Tailwind"};
	}
		Pelipper(){

		super();
		}
}