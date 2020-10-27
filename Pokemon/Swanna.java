public class Swanna extends Pokemon{
	{
		name = "Swanna";
		bHP = 8;
		bAtk = 9;
		bDef = 6;
		bSpAtk = 9;
		bSpDef = 6;
		bSpd = 10;
		type1 = "Water";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Big Pecks", "Adaptability", "Hydration", "Serene Grace"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Ducklett();
		prevReq = 35;
		height = "4\'/3\"";
		weight = 53.4;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		overland = 4;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 2;
		underdog = false;
		other = new String[]{"Fountain","Guster"};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 6, 9, 13, 15, 19, 21, 24, 27, 30, 34, 40, 47, 55};
		moves = new String[]{"Water Sport", "Defog", "Wing Attack", "Water Pulse", "Aerial Ace", "Bubble Beam", "Feather Dance", "Aqua Ring", "Air Slash", "Roost", "Rain Dance", "Tailwind", "Brave Bird", "Hurricane"};
		TMs = new String[]{"Fly", "Surf", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Steel Wing", "Scald", "Giga Impact", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Endeavor", "Icy Wind", "Pluck", "Roost", "Sky Attack", "Sleep Talk", "Snore", "Tailwind", "Uproar"};
		naturalMoves = new String[]{};
	}
		Swanna(){

		super();
		}
}