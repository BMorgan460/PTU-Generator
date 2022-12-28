public class Vigoroth extends Pokemon{
	{
		name = "Vigoroth";
		bHP = 8;
		bAtk = 8;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 9;
		type1 = "Normal";
		type2 = "";
		abilities = new String[]{"Vital Spirit", "Limber", "Oblivious", "Own Tempo", "Vigor"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Slakoth();
		prevReq = 15;
		next = new String[]{"Slaking"};
		nextReq = new String[]{"35"};
		height = "4\'/7\"";
		weight = 102.5;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest", "Rainforest", "Taiga"};
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Forest"};
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 4;
		combat = 2;
		stealth = 4;
		percep = 3;
		focus = 2;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 9, 14, 17, 23, 27, 33, 37, 43};
		moves = new String[]{"Encore", "Uproar", "Fury Swipes", "Endure", "Slash", "Chip Away", "Counter", "Focus Punch", "Reversal"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Taunt", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Thunderbolt", "Thunder", "Earthquake", "Return", "Shadow Ball", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Low Sweep", "Round", "Focus Blast", "Fling", "Shadow Claw", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"After You", "Body Slam", "Slam", "Covet", "Dynamic Punch", "Fire Punch", "Focus Energy", "Focus Punch", "Fury Cutter", "Gunk Shot", "Ice Punch", "Icy Wind", "Low Kick", "Mega Kick", "Mega Punch", "Rock Climb", "Seismic Toss", "Shock Wave", "Snore", "Sucker Punch", "Thunder Punch", "Water Pulse", "Uproar"};
		naturalMoves = new String[]{"Focus Energy", "Reversal"};
	}
		Vigoroth(){

		super();
		}
}