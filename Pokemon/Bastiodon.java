public class Bastiodon extends Pokemon{
	{
		name = "Bastiodon";
		bHP = 6;
		bAtk = 5;
		bDef = 17;
		bSpAtk = 5;
		bSpDef = 14;
		bSpd = 3;
		type1 = "Rock";
		type2 = "Steel";
		abilities = new String[]{"Sturdy", "Rock Head", "Bodyguard", "Soundproof", "Vigor"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Shieldon();
		prevReq = 30;
		height = "4\'/3\"";
		weight = 329.6;
		WC = 5;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Herbivore";
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 8;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = false;
		other = new String[]{"Mountable 1"};
		athl = 4;
		acro = 1;
		combat = 4;
		stealth = 2;
		percep = 4;
		focus = 4;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{6, 10, 15, 19, 24, 28, 36, 43, 51, 58};
		moves = new String[]{"Taunt", "Metal Sound", "Take Down", "Iron Defense", "Swagger", "Ancient Power", "Endure", "Metal Burst", "Iron Head", "Heavy Slam"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Thunderbolt", "Thunder", "Earthquake", "Return", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Round", "Giga Impact", "Rock Polish", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Block", "Body Slam", "Slam", "Counter", "Earth Power", "Iron Defense", "Iron Head", "Iron Tail", "Magic Coat", "Magnet Rise", "Outrage", "Shock Wave", "Snore", "Stealth Rock", "Stomping Tantrum"};
		naturalMoves = new String[]{};
	}
		Bastiodon(){

		super();
		}
}