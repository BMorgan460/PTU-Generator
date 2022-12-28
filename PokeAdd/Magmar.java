public class Magmar extends Pokemon{
	{
		name = "Magmar";
		bHP = 7;
		bAtk = 10;
		bDef = 6;
		bSpAtk = 10;
		bSpDef = 9;
		bSpd = 10;
		type1 = "Fire";
		type2 = "";
		abilities = new String[]{"Flame Body", "Oblivious", "Vital Spirit", "Flash Fire", "Type Aura"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Magby();
		prevReq = 30;
		next = new String[]{"Magmortar"};
		nextReq = new String[]{"40"};
		height = "4\'/3\"";
		weight = 98.1;
		WC = 3;
		maleRatio = 75.0;
		femaleRatio = 25.0;
		egg1 = "Humanshape";
		egg2 = "Omnivore";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 5;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = false;
		other = new String[]{"Egg Warmer","Firestarter","Glow","Heater"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 1;
		percep = 3;
		focus = 3;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55};
		moves = new String[]{"Ember", "Smokescreen", "Feint Attack", "Fire Spin", "Clear Smog", "Flame Burst", "Confuse Ray", "Fire Punch", "Lava Plume", "Sunny Day", "Flamethrower", "Fire Blast"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Return", "Psychic", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Overheat", "Focus Blast", "Fling", "Giga Impact", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Covet", "Dual Chop", "Dynamic Punch", "Fire Punch", "Focus Punch", "Heat Wave", "Helping Hand", "Iron Tail", "Low Kick", "Mega Kick", "Mega Punch", "Seismic Toss", "Snore", "Thunder Punch", "Uproar"};
		naturalMoves = new String[]{};
	}
		Magmar(){

		super();
		}
}