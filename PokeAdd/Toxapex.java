public class Toxapex extends Pokemon{
	{
		name = "Toxapex";
		bHP = 5;
		bAtk = 6;
		bDef = 15;
		bSpAtk = 5;
		bSpDef = 14;
		bSpd = 4;
		type1 = "Poison";
		type2 = "Water";
		abilities = new String[]{"Limber", "Cruelty", "Defy Death", "Regenerator", "Merciless"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Mareanie();
		prevReq = 35;
		height = "2\'/4\"";
		size = "Small";
		weight = 32;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		habitats = new String[]{"Ocean"};
		overland = 4;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		underdog = false;
		other = new String[]{"Gilled"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 5;
		percep = 4;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 44, 51, 58};
		moves = new String[]{"Peck", "Bite", "Toxic Spikes", "Wide Guard", "Toxic", "Venoshock", "Spike Cannon", "Recover", "Poison Jab", "Venom Drench", "Pin Missile", "Liquidation"};
		TMs = new String[]{"Toxic", "Hail", "Venoshock", "Hidden Power", "Ice Beam", "Blizzard", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Smack Down", "Return", "Double Team", "Sludge", "Sludge Wave", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Scald", "Payback", "Frost Breath", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Surf", "Confide"};
		tutorMoves = new String[]{"After You", "Block", "Covet", "Gastro Acid", "Acid", "Gunk Shot", "Iron Defense", "Icy Wind", "Knock Off", "Liquidation", "Magic Coat", "Pain Split", "Snatch", "Snore", "Spite", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Toxapex(){

		super();
		}
}