public class Houndoom extends Pokemon{
	{
		name = "Houndoom";
		bHP = 8;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 11;
		bSpDef = 8;
		bSpd = 10;
		type1 = "Dark";
		type2 = "Fire";
		abilities = new String[]{"Flash Fire", "Early Bird", "Brimstone", "Unnerve", "Pack Hunt"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Houndour();
		prevReq = 25;
		height = "4\'/7\"";
		weight = 77.2;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Carnivore";
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 5;
		natureWalk = new String[]{"Mountain"};
		underdog = false;
		other = new String[]{"Darkvision","Tracker"};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{4, 8, 13, 16, 20, 26, 30, 35, 41, 45, 50, 56, 60, 65};
		moves = new String[]{"Howl", "Smog", "Roar", "Bite", "Odor Sleuth", "Beat Up", "Fire Fang", "Feint Attack", "Embargo", "Foul Play", "Flamethrower", "Crunch", "Nasty Plot", "Inferno"};
		TMs = new String[]{"Strength", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Frustration", "Solar Beam", "Return", "Shadow Ball", "Double Team", "Flamethrower", "Sludge", "Sludge Bomb", "Fire Blast", "Torment", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Overheat", "Incinerate", "Embargo", "Payback", "Retaliate", "Giga Impact", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Snarl", "Dark Pulse"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Dark Pulse", "Foul Play", "Heat Wave", "Hyper Voice", "Iron Tail", "Magic Coat", "Nasty Plot", "Role Play", "Sleep Talk", "Snatch", "Snore", "Spite", "Sucker Punch", "Super Fang", "Swift", "Thunder", "Uproar"};
		naturalMoves = new String[]{"Inferno", "Nasty Plot"};
	}
		Houndoom(){

		super();
		}
}