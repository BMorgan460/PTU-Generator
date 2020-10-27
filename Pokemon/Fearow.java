public class Fearow extends Pokemon{
	{
		name = "Fearow";
		bHP = 7;
		bAtk = 9;
		bDef = 7;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 10;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Sniper", "Scrappy", "Early Bird", "Vanguard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Spearow();
		prevReq = 20;
		height = "3\'/11\"";
		weight = 83.8;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Omnivore";
		habitats = new String[]{"Forest", "Grassland", "Mountain"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 5;
		underdog = true;
		other = new String[]{"Mountable 1"};
		athl = 4;
		acro = 3;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 23, 29, 35, 41, 47, 53};
		moves = new String[]{"Leer", "Fury Attack", "Pursuit", "Aerial Ace", "Mirror Move", "Agility", "Assurance", "Roost", "Drill Peck", "Drill Run"};
		TMs = new String[]{"Fly", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "False Swipe", "Giga Impact", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Drill Run", "Heat Wave", "Ominous Wind", "Roost", "Sky Attack", "Sleep Talk", "Snore", "Steel Wing", "Swift", "Tailwind", "Twister", "Uproar", "Work Up"};
		naturalMoves = new String[]{};
	}
		Fearow(){

		super();
		}
}