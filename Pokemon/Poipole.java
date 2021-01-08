public class Poipole extends Pokemon{
	{
		name = "Poipole";
		bHP = 7;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 7;
		type1 = "Poison";
		type2 = "";
		abilities = new String[]{"Beast Boost", "Deadly Poison", "Sniper", "Poison Touch", "Corrosive Toxins"};
		abilityTypeCount = new int[] {1,3,1};
		size = "Small";
		weight = 4.0;
		WC = 1;
		overland = 4;
		swim = 3;
		levitate = 6;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		underdog = false;
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 4;
		percep = 5;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 1, 1, 1, 7, 13, 19, 23, 31, 37, 41, 47};
		moves = new String[]{"Dragon Pulse", "Peck", "Growl", "Helping Hand", "Acid", "Fury Attack", "Venoshock", "Charm", "Venom Drench", "Nasty Plot", "Poison Jab", "Toxic", "Fell Stinger"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Protect", "Frustration", "Return", "Sludge Wave", "Sludge Bomb", "Façade", "Rest", "Round", "Echoed Voice", "Poison Jab", "Sleep Talk", "Substitute", "Confide", "Tutor", "Covet", "Signal Beam", "Gunk Shot", "Uproar", "Dragon Pulse", "Iron Tail", "Snore", "Gastro Acid", "Helping Hand", "Snatch"};
	}
		Poipole(){

		super();
		}
}