public class Charmeleon extends Pokemon{
	{
		name = "Charmeleon";
		bHP = 6;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 8;
		bSpDef = 7;
		bSpd = 8;
		type1 = "Fire";
		type2 = "";
		abilities = new String[]{"Blaze", "Intimidate", "Solar Power", "Prime Fury", "White Flame"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Charmander();
		prevReq = 15;
		next = new String[]{"Charizard"};
		nextReq = new String[]{"30"};
		height = "3\'/7\"";
		weight = 41.9;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Dragon";
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Mountain"};
		underdog = true;
		other = new String[]{"Firestarter","Glow"};
		athl = 4;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 7, 10, 17, 21, 28, 32, 39, 43, 50, 54};
		moves = new String[]{"Growl", "Ember", "Smokescreen", "Dragon Rage", "Scary Face", "Fire Fang", "Flame Burst", "Slash", "Flamethrower", "Fire Spin", "Inferno"};
		TMs = new String[]{"Work Up", "Dragon Claw", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Echoed Voice", "Overheat", "Fling", "Shadow Claw", "Swords Dance", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Defense Curl", "Dragon Pulse", "Dynamic Punch", "Fire Pledge", "Fire Punch", "Focus Punch", "Fury Cutter", "Heat Wave", "Iron Tail", "Mega Kick", "Mega Punch", "Metal Claw", "Outrage", "Rage", "Seismic Toss", "Snore", "Swift", "Thunder Punch"};
		naturalMoves = new String[]{};
	}
		Charmeleon(){

		super();
		}
}