public class Skuntank extends Pokemon{
	{
		name = "Skuntank";
		bHP = 10;
		bAtk = 9;
		bDef = 7;
		bSpAtk = 7;
		bSpDef = 6;
		bSpd = 8;
		type1 = "Poison";
		type2 = "Dark";
		abilities = new String[]{"Stench", "Keen Eye", "Odious Spray", "Pickup", "Aftermath"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Stunky();
		prevReq = 35;
		height = "3\'/3\"";
		weight = 83.8;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Darkvision"};
		athl = 4;
		acro = 1;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{3, 7, 9, 13, 15, 19, 21, 25, 27, 31, 33, 37, 39, 43, 45};
		moves = new String[]{"Poison Gas", "Screech", "Fury Swipes", "Smokescreen", "Feint", "Acid Spray", "Bite", "Slash", "Toxic", "Night Slash", "Memento", "Venom Drench", "Sucker Punch", "Belch", "Explosion"};
		TMs = new String[]{"Roar", "Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Shadow Ball", "Double Team", "Flamethrower", "Sludge", "Sludge Bomb", "Fire Blast", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Explosion", "Shadow Claw", "Payback", "Giga Impact", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Snarl", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Defog", "Foul Play", "Fury Cutter", "Iron Tail", "Snatch", "Snore", "Sucker Punch", "Swift", "Throat Chop"};
		naturalMoves = new String[]{};
	}
		Skuntank(){

		super();
		}
}