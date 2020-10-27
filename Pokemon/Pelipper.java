public class Pelipper extends Pokemon{
	{
		name = "Pelipper";
		bHP = 6;
		bAtk = 5;
		bDef = 10;
		bSpAtk = 9;
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
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 25, 28, 33, 33, 33, 39, 44, 50, 55};
		moves = new String[]{"Supersonic", "Wing Attack", "Mist", "Water Pulse", "Payback", "Roost", "Protect", "Brine", "Stockpile", "Swallow", "Spit Up", "Fling", "Tailwind", "Hydro Pump", "Hurricane"};
		TMs = new String[]{"Surf", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Scald", "Fling", "Sky Drop", "Payback", "Giga Impact", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Brine", "Defog", "Gunk Shot", "Hydro Pump", "Icy Wind", "Knock Off", "Ominous Wind", "Pluck", "Roost", "Seed Bomb", "Shock Wave", "Sky Attack", "Sleep Talk", "Snore", "Steel Wing", "Swift", "Tailwind", "Twister", "Uproar"};
		naturalMoves = new String[]{"Hurricane", "Hydro Pump"};
	}
		Pelipper(){

		super();
		}
}