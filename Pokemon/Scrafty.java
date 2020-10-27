public class Scrafty extends Pokemon{
	{
		name = "Scrafty";
		bHP = 7;
		bAtk = 9;
		bDef = 12;
		bSpAtk = 5;
		bSpDef = 12;
		bSpd = 6;
		type1 = "Dark";
		type2 = "Fighting";
		abilities = new String[]{"Shed Skin", "Moxie", "Intimidate", "Reckless", "Bully"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Scraggy();
		prevReq = 35;
		height = "3\'/7\"";
		weight = 66.1;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Dragon";
		habitats = new String[]{"Cave", "Desert", "Mountain"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 6;
		natureWalk = new String[]{"Desert", "Mountain"};
		underdog = false;
		other = new String[]{"Darkvision","Stealth","Pack Mon"};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 45, 51, 58, 65};
		moves = new String[]{"Sand Attack", "Feint Attack", "Headbutt", "Swagger", "Brick Break", "Payback", "Chip Away", "Hi", "Scary Face", "Crunch", "Facade", "Rock Climb", "Focus Punch", "Head Smash"};
		TMs = new String[]{"Strength", "Dragon Claw", "Roar", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Return", "Dig", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Focus Blast", "Fling", "Incinerate", "Payback", "Retaliate", "Giga Impact", "Stone Edge", "Rock Slide", "Dragon Tail", "Poison Jab", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Snarl", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Dark Pulse", "Dragon Pulse", "Drain Punch", "Dual Chop", "Fire Punch", "Foul Play", "Ice Punch", "Iron Defense", "Iron Head", "Iron Tail", "Knock Off", "Low Kick", "Outrage", "Sleep Talk", "Snatch", "Snore", "Spite", "Super Fang", "Thunder Punch", "Work Up", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Scrafty(){

		super();
		}
}