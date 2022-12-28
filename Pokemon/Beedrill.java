public class Beedrill extends Pokemon{
	{
		name = "Beedrill";
		bHP = 7;
		bAtk = 9;
		bDef = 4;
		bSpAtk = 5;
		bSpDef = 8;
		bSpd = 8;
		type1 = "Bug";
		type2 = "Poison";
		abilities = new String[]{"Sniper", "Poison Touch", "Technician", "Swarm", "Vanguard"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Kakuna();
		prevReq = 10;
		height = "3\'/3\"";
		weight = 65;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest"};
		overland = 2;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 4;
		power = 4;
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 5;
		combat = 2;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 3;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 3;
		focusBonus = 3;
		movesLevels = new int[]{11, 14, 17, 20, 23, 26, 29, 32, 35, 38, 41, 44};
		moves = new String[]{"Fury Attack", "Rage", "Pursuit", "Focus Energy", "Venoshock", "Assurance", "Toxic Spikes", "Pin Missile", "Poison Jab", "Agility", "Endeavor", "Fell Stinger"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "False Swipe", "Brutal Swing", "Acrobatics", "Payback", "Giga Impact", "Swords Dance", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Defog", "Drill Run", "Electroweb", "Endeavor", "Fury Cutter", "Giga Drain", "Knock Off", "Laser Focus", "Ominous Wind", "Roost", "Silver Wind", "Snore", "String Shot", "Swift", "Tailwind", "Throat Chop"};
		naturalMoves = new String[]{};
	}
		Beedrill(){

		super();
		}
}