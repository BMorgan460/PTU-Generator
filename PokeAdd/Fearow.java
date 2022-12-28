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
		movesLevels = new int[]{4, 8, 11, 15, 18, 23, 27, 32, 36, 41, 45};
		moves = new String[]{"Leer", "Pursuit", "Fury Attack", "Aerial Ace", "Mirror Move", "Assurance", "Agility", "Focus Energy", "Roost", "Drill Peck", "Drill Run"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "False Swipe", "Giga Impact", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Drill Run", "Heat Wave", "Laser Focus", "Ominous Wind", "Sky Attack", "Snore", "Swift", "Tailwind", "Throat Chop", "Twister", "Uproar"};
		naturalMoves = new String[]{"Drill Run", "Pluck"};
	}
		Fearow(){

		super();
		}
}