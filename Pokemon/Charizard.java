public class Charizard extends Pokemon{
	{
		name = "Charizard";
		bHP = 8;
		bAtk = 8;
		bDef = 8;
		bSpAtk = 11;
		bSpDef = 9;
		bSpd = 10;
		type1 = "Fire";
		type2 = "Flying";
		abilities = new String[]{"Flame Body", "Intimidate", "Solar Power", "White Flame", "Courage"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Charmeleon();
		prevReq = 30;
		height = "5\'/7\"";
		weight = 199.5;
		WC = 4;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Dragon";
		overland = 6;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 3;
		power = 8;
		natureWalk = new String[]{"Mountain"};
		underdog = false;
		other = new String[]{"Firestarter","Glow","Heater","Mountable 1"};
		athl = 5;
		acro = 3;
		combat = 4;
		stealth = 1;
		percep = 2;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 3;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{7, 10, 17, 21, 28, 32, 36, 41, 47, 56, 62, 71, 77};
		moves = new String[]{"Ember", "Smokescreen", "Dragon Rage", "Scary Face", "Fire Fang", "Flame Burst", "Wing Attack", "Slash", "Flamethrower", "Fire Spin", "Inferno", "Heat Wave", "Flare Blitz"};
		TMs = new String[]{"Cut", "Fly", "Strength", "Hone Claws", "Dragon Claw", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Earthquake", "Return", "Dig", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Echoed Voice", "Overheat", "Steel Wing", "Focus Blast", "Fling", "Sky Drop", "Incinerate", "Shadow Claw", "Giga Impact", "Swords Dance", "Bulldoze", "Rock Slide", "Dragon Tail", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Blast Burn", "Body Slam", "Slam", "Counter", "Defense Curl", "Dragon Pulse", "Dynamic Punch", "Fire Pledge", "Fire Punch", "Focus Punch", "Fury Cutter", "Growl", "Heat Wave", "Hold Hands", "Iron Tail", "Mega Kick", "Mega Punch", "Metal Claw", "Ominous Wind", "Outrage", "Rage", "Roost", "Seismic Toss", "Sleep Talk", "Snore", "Steel Wing", "Swift", "Tailwind", "Thunder Punch", "Twister"};
		naturalMoves = new String[]{};
	}
		Charizard(){

		super();
		}
}