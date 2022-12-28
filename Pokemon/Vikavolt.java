public class Vikavolt extends Pokemon{
	{
		name = "Vikavolt";
		bHP = 8;
		bAtk = 7;
		bDef = 9;
		bSpAtk = 15;
		bSpDef = 8;
		bSpd = 4;
		type1 = "Bug";
		type2 = "Electric";
		abilities = new String[]{"Levitate", "Swarm", "Motor Drive", "Silk Threads", "Rocket"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Charjabug();
		prevReq = 30;
		height = "4\'/11\"";
		weight = 99.2;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 4;
		underdog = false;
		other = new String[]{"Threaded"};
		athl = 3;
		acro = 4;
		combat = 4;
		stealth = 3;
		percep = 4;
		focus = 5;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 25, 31, 37, 43, 49};
		moves = new String[]{"String Shot", "MudSlap", "Bite", "Bug Bite", "Spark", "Acrobatics", "Guillotine", "Bug Buzz", "Dig", "Zap Cannon", "Agility"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Roost", "Frustration", "Solar Beam", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Charge", "Charge Beam", "Sky Drop", "Acrobatics", "Giga Impact", "Volt Switch", "Thunder", "Thunder Wave", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Air Slash", "Bug Bite", "Bite", "Electroweb", "Iron Defense", "Laser Focus", "Magnet Rise", "Shock Wave", "Signal Beam", "Snore"};
		naturalMoves = new String[]{"Air Slash", "Slash", "Bite", "Charge"};
	}
		Vikavolt(){

		super();
		}
}