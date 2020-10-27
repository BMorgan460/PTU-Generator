public class Swellow extends Pokemon{
	{
		name = "Swellow";
		bHP = 6;
		bAtk = 9;
		bDef = 6;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 13;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Guts", "Vital Spirit", "Scrappy", "Big Pecks", "Defiant"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Taillow();
		prevReq = 20;
		height = "2\'/4\"";
		weight = 43.7;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 1;
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 21, 27, 33, 39, 45, 51};
		moves = new String[]{"Focus Energy", "Quick Attack", "Wing Attack", "Double Team", "Aerial Ace", "Quick Guard", "Agility", "Endeavor", "Air Slash", "Brave Bird"};
		TMs = new String[]{"Fly", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Giga Impact", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Air Slash", "Brave Bird", "Counter", "Defog", "Endeavor", "Heat Wave", "Ominous Wind", "Roost", "Sky Attack", "Sleep Talk", "Snore", "Steel Wing", "Swift", "Tailwind", "Twister", "Work Up"};
		naturalMoves = new String[]{"Air Slash", "Slash", "Brave Bird"};
	}
		Swellow(){

		super();
		}
}