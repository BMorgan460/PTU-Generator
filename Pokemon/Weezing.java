public class Weezing extends Pokemon{
	{
		name = "Weezing";
		bHP = 7;
		bAtk = 9;
		bDef = 12;
		bSpAtk = 9;
		bSpDef = 7;
		bSpd = 6;
		type1 = "Poison";
		type2 = "";
		abilities = new String[]{"Levitate", "Sticky Smoke", "Aftermath", "Stench", "White Smoke"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Koffing();
		prevReq = 35;
		height = "3\'/11\"";
		weight = 20.9;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Nullivore";
		habitats = new String[]{"Marsh", "Mountain", "Urban"};
		overland = 2;
		swim = 1;
		levitate = 4;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		underdog = false;
		other = new String[]{"Volatile Bomb"};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 1;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 12, 15, 18, 23, 26, 29, 34, 40, 46, 51, 57};
		moves = new String[]{"Smog", "Smokescreen", "Assurance", "Clear Smog", "Sludge", "SelfDestruct", "Haze", "Double Hit", "Sludge Bomb", "Explosion", "Destiny Bond", "Belch", "Memento"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Shadow Ball", "Double Team", "Flamethrower", "Sludge", "Sludge Bomb", "Fire Blast", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Incinerate", "Explosion", "Payback", "Giga Impact", "Flash", "Gyro Ball", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Dark Pulse"};
		tutorMoves = new String[]{"Dark Pulse", "Pain Split", "Rollout", "Snore", "Spite", "Uproar", "Shock Wave"};
		naturalMoves = new String[]{};
	}
		Weezing(){

		super();
		}
}