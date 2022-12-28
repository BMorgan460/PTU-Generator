public class Beautifly extends Pokemon{
	{
		name = "Beautifly";
		bHP = 6;
		bAtk = 7;
		bDef = 5;
		bSpAtk = 10;
		bSpDef = 5;
		bSpd = 7;
		type1 = "Bug";
		type2 = "Flying";
		abilities = new String[]{"Pride", "Rivalry", "Cruelty", "Swarm", "Sap Sipper"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Silcoon();
		prevReq = 10;
		height = "3\'/3\"";
		weight = 62.6;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 2;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 3;
		combat = 2;
		stealth = 2;
		percep = 6;
		focus = 5;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 3;
		focusBonus = 0;
		movesLevels = new int[]{12, 15, 17, 20, 22, 25, 27, 30, 32, 35, 37, 40};
		moves = new String[]{"Absorb", "Stun Spore", "Morning Sun", "Air Cutter", "Mega Drain", "Silver Wind", "Attract", "Whirlwind", "Giga Drain", "Bug Buzz", "Rage", "Quiver Dance"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Roost", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Shadow Ball", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Acrobatics", "Giga Impact", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Defog", "Electroweb", "Giga Drain", "Laser Focus", "Ominous Wind", "Roost", "Secret Power", "Signal Beam", "Snore", "String Shot", "Swift", "Tailwind", "Twister"};
		naturalMoves = new String[]{};
	}
		Beautifly(){

		super();
		}
}