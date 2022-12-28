public class Amoonguss extends Pokemon{
	{
		name = "Amoonguss";
		bHP = 11;
		bAtk = 9;
		bDef = 7;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 3;
		type1 = "Grass";
		type2 = "Poison";
		abilities = new String[]{"Effect Spore", "Spinning Dance", "Liquid Ooze", "Root Down", "Regenerator"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Foongus();
		prevReq = 35;
		height = "2\'/0\"";
		size = "Small";
		weight = 23.1;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "Phototroph";
		habitats = new String[]{"Cave", "Forest", "Grassland"};
		overland = 5;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Mushroom Harvest","Shrinkable"};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 4;
		percep = 4;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 1;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{6, 8, 12, 15, 18, 20, 24, 28, 32, 35, 43, 49, 54, 62};
		moves = new String[]{"Growth", "Astonish", "Bide", "Mega Drain", "Ingrain", "Feint Attack", "Sweet Scent", "Giga Drain", "Toxic", "Synthesis", "Clear Smog", "Solar Beam", "Rage Powder", "Spore"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Return", "Double Team", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Payback", "Giga Impact", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"After You", "Foul Play", "Gastro Acid", "Acid", "Giga Drain", "Seed Bomb", "Snore", "Stomping Tantrum", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Amoonguss(){

		super();
		}
}