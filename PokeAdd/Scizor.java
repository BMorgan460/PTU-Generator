public class Scizor extends Pokemon{
	{
		name = "Scizor";
		bHP = 7;
		bAtk = 13;
		bDef = 10;
		bSpAtk = 6;
		bSpDef = 8;
		bSpd = 7;
		type1 = "Bug";
		type2 = "Steel";
		abilities = new String[]{"Technician", "Light Metal", "Swarm", "Steadfast", "Parry"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Scyther();
		prevReq = 30;
		height = "5\'/11\"";
		weight = 260.1;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Carnivore";
		overland = 7;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 6;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{};
		athl = 5;
		acro = 4;
		combat = 4;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 50, 57, 61};
		moves = new String[]{"Focus Energy", "Pursuit", "False Swipe", "Agility", "Metal Claw", "Fury Cutter", "Slash", "Razor Wind", "Iron Defense", "XScissor", "Night Slash", "Double Hit", "Iron Head", "Swords Dance", "Feint"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Roost", "Safeguard", "Frustration", "Return", "Brick Break", "Double Team", "Sandstorm", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Steel Wing", "False Swipe", "Fling", "Brutal Swing", "Acrobatics", "Giga Impact", "Swords Dance", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Bullet Punch", "Counter", "Defog", "Fury Cutter", "Iron Defense", "Iron Head", "Knock Off", "Laser Focus", "Ominous Wind", "Snore", "Superpower", "Swift", "Tailwind"};
		naturalMoves = new String[]{"Bullet Punch", "Feint"};
	}
		Scizor(){

		super();
		}
}