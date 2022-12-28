public class Duosion extends Pokemon{
	{
		name = "Duosion";
		bHP = 7;
		bAtk = 4;
		bDef = 5;
		bSpAtk = 13;
		bSpDef = 6;
		bSpd = 3;
		type1 = "Psychic";
		type2 = "";
		abilities = new String[]{"Overcoat", "Defy Death", "Levitate", "Regenerator", "Cluster Mind"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Solosis();
		prevReq = 15;
		next = new String[]{"Reuniclus"};
		nextReq = new String[]{"35"};
		height = "2\'/0\"";
		size = "Small";
		weight = 17.6;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Omnivore";
		overland = 2;
		swim = 2;
		levitate = 4;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		underdog = true;
		other = new String[]{"Telekinetic","Telepath"};
		athl = 2;
		acro = 1;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{3, 7, 10, 14, 16, 19, 24, 25, 28, 31, 34, 39, 43, 50, 53};
		moves = new String[]{"Reflect", "Rollout", "Snatch", "Hidden Power", "Light Screen", "Charm", "Recover", "Psyshock", "Endeavor", "Future Sight", "Pain Split", "Psychic", "Skill Swap", "Heal Block", "Wonder Room"};
		TMs = new String[]{"Psyshock", "Calm Mind", "Toxic", "Hidden Power", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Thunder", "Return", "Psychic", "Shadow Ball", "Double Team", "Reflect", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Embargo", "Explosion", "Thunder", "Thunder Wave", "Gyro Ball", "Psych Up", "Rock Slide", "Infestation", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Trick", "Trick Room", "Confide"};
		tutorMoves = new String[]{"After You", "Ally Switch", "Endeavor", "Gravity", "Helping Hand", "Iron Defense", "Magic Coat", "Pain Split", "Role Play", "Shock Wave", "Signal Beam", "Skill Swap", "Snatch", "Snore", "Telekinesis", "Trick", "Wonder Room", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Duosion(){

		super();
		}
}