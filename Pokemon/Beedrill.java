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
		combat = 4;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 3;
		combatBonus = 1;
		stealthBonus = 3;
		percepBonus = 3;
		focusBonus = 3;
		movesLevels = new int[]{10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 45};
		moves = new String[]{"Fury Attack", "Focus Energy", "Twineedle", "Rage", "Pursuit", "Toxic Spikes", "Pin Missile", "Agility", "Assurance", "Poison Jab", "Endeavor", "Fell Stinger"};
		TMs = new String[]{"Cut", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "False Swipe", "Acrobatics", "Payback", "Giga Impact", "Flash", "Swords Dance", "Struggle Bug", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Drill Run", "Electroweb", "Endeavor", "Fury Cutter", "Giga Drain", "Knock Off", "Ominous Wind", "Roost", "Silver Wind", "Sleep Talk", "Snore", "String Shot", "Swift", "Tailwind"};
		naturalMoves = new String[]{};
	}
		Beedrill(){

		super();
		}
}