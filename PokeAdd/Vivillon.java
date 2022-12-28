public class Vivillon extends Pokemon{
	{
		name = "Vivillon";
		bHP = 8;
		bAtk = 5;
		bDef = 5;
		bSpAtk = 9;
		bSpDef = 5;
		bSpd = 9;
		type1 = "Bug";
		type2 = "Flying";
		abilities = new String[]{"Compound Eyes", "Shield Dust", "Friend Guard", "Wonder Skin", "Effect Spore"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Spewpa();
		prevReq = 10;
		height = "3\'/11\"";
		weight = 37.5;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 3;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 1;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Threaded","Wallclimber"};
		athl = 3;
		acro = 4;
		combat = 2;
		stealth = 2;
		percep = 5;
		focus = 2;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{12, 17, 21, 25, 31, 35, 41, 45, 50, 55};
		moves = new String[]{"Light Screen", "Psybeam", "Supersonic", "Draining Kiss", "Aromatherapy", "Bug Buzz", "Safeguard", "Quiver Dance", "Hurricane", "Powder"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Roost", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Acrobatics", "Giga Impact", "Psych Up", "Infestation", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Bite", "Defog", "Electroweb", "Endeavor", "Giga Drain", "Hold Hands", "Laser Focus", "Poison Powder", "Signal Beam", "Sleep Powder", "Snore", "Stun Spore", "Tailwind"};
		naturalMoves = new String[]{"Poison Powder", "Powder", "Powder", "Sleep Powder", "Powder", "Stun Spore", "Spore"};
	}
		Vivillon(){

		super();
		}
}