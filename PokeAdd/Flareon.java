public class Flareon extends Pokemon{
	{
		name = "Flareon";
		bHP = 7;
		bAtk = 13;
		bDef = 6;
		bSpAtk = 10;
		bSpDef = 11;
		bSpd = 7;
		type1 = "Fire";
		type2 = "";
		abilities = new String[]{"Flash Fire", "Flame Body", "Type Aura", "Defiant", "Guts"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Eevee();
		prevReq = 20;
		height = "2\'/11\"";
		weight = 55.1;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Omnivore";
		habitats = new String[]{"Cave", "Mountain", "Urban"};
		overland = 7;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		underdog = false;
		other = new String[]{"Egg Warmer","Firestarter","Tracker"};
		athl = 5;
		acro = 3;
		combat = 4;
		stealth = 3;
		percep = 4;
		focus = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 1;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 20, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Sand Attack", "BabyDoll", "Quick Attack", "Bite", "Fire Fang", "Fire Spin", "Scary Face", "Smog", "Lava Plume", "Last Resort", "Flare Blitz"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Shadow Ball", "Double Team", "Flamethrower", "Fire Blast", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Echoed Voice", "Overheat", "Giga Impact", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Covet", "Heal Bell", "Heat Wave", "Helping Hand", "Hyper Voice", "Iron Tail", "Laser Focus", "Last Resort", "Leer", "Snore", "Superpower", "Swift"};
		naturalMoves = new String[]{"Helping Hand"};
	}
		Flareon(){

		super();
		}
}