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
		abilities = new String[]{"Volt Absorb", "Levitate", "Beam Cannon", "Targeting System", "Analytic"};
		abilityTypeCount = new int[] {1,1,3};
		weight = 99.2;
		WC = 4;
		overland = 4;
		swim = 2;
		levitate = 6;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Forest", "Mountain"};
		underdog = false;
		other = new String[]{"Threaded","Wallclimber","Zapper","X_Ray Vision"};
		athl = 2;
		acro = 4;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{1, 1, 1, 4, 7, 10, 13, 16, 19, 25, 25, 31, 37, 41, 49};
		moves = new String[]{"Air Slash", "Charge", "Vice Grip", "String Shot", "Mud_Slap", "Bite", "Bug Bite", "Spark", "Acrobatics", "Guillotine", "LockOn", "Bug Buzz", "Dig", "Zap Cannon", "Agility"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Roost", "Frustration", "Solar Beam", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Charge Beam", "Sky Drop", "Acrobatics", "Giga Impact", "Volt Switch", "Thunder Wave", "XScissor", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Flash Cannon", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Signal Beam", "Magnet Rise", "Iron Defense", "Electroweb", "Snore", "Shock Wave", "Laser Focus"};
		naturalMoves = new String[]{};
	}
		Vikavolt(){

		super();
		}
}