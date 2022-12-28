public class Escavalier extends Pokemon{
	{
		name = "Escavalier";
		bHP = 7;
		bAtk = 14;
		bDef = 11;
		bSpAtk = 6;
		bSpDef = 11;
		bSpd = 2;
		type1 = "Bug";
		type2 = "Steel";
		abilities = new String[]{"Shell Armor", "Lancer", "Overcoat", "Swarm", "Analytic"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Karrablast();
		prevReq = 20;
		height = "3\'/3\"";
		weight = 72.8;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Forest"};
		underdog = false;
		other = new String[]{};
		athl = 4;
		acro = 3;
		combat = 4;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{4, 8, 13, 16, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56, 60};
		moves = new String[]{"Leer", "Quick Guard", "Twineedle", "Fury Attack", "Headbutt", "False Swipe", "Bug Buzz", "Slash", "Iron Head", "Iron Defense", "XScissor", "Reversal", "Swords Dance", "Giga Impact", "Fell Stinger"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Focus Blast", "Energy Ball", "False Swipe", "Brutal Swing", "Smart Strike", "Giga Impact", "Swords Dance", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Drill Run", "Fell Stinger", "Giga Drain", "Iron Defense", "Iron Head", "Knock Off", "Laser Focus", "Signal Beam", "Snore"};
		naturalMoves = new String[]{"Bite", "Fell Stinger"};
	}
		Escavalier(){

		super();
		}
}