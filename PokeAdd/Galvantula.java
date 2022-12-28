public class Galvantula extends Pokemon{
	{
		name = "Galvantula";
		bHP = 7;
		bAtk = 8;
		bDef = 6;
		bSpAtk = 10;
		bSpDef = 6;
		bSpd = 11;
		type1 = "Bug";
		type2 = "Electric";
		abilities = new String[]{"Compound Eyes", "Unnerve", "Static", "Swarm", "Sequence"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Joltik();
		prevReq = 35;
		height = "2\'/7\"";
		size = "Small";
		weight = 31.5;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Carnivore";
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 2;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Threaded","Wallclimber","Zapper"};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 12, 15, 18, 23, 26, 29, 34, 40, 46, 54, 60};
		moves = new String[]{"Thunder Wave", "Screech", "Fury Cutter", "Electroweb", "Bug Bite", "Gastro Acid", "Slash", "Electro Ball", "Signal Beam", "Agility", "Sucker Punch", "Discharge", "Bug Buzz"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Leech Life", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Charge", "Charge Beam", "Giga Impact", "Volt Switch", "Thunder", "Thunder Wave", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Bounce", "Bug Bite", "Bite", "Electroweb", "Fury Cutter", "Gastro Acid", "Acid", "Giga Drain", "Magnet Rise", "Rock Climb", "Shock Wave", "Signal Beam", "Snore", "Sucker Punch", "Throat Chop"};
		naturalMoves = new String[]{};
	}
		Galvantula(){

		super();
		}
}