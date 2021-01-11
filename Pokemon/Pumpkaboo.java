public class Pumpkaboo extends Pokemon{
	{
		name = "Pumpkaboo";
		bHP = 5;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 4;
		bSpDef = 5;
		bSpd = 5;
		type1 = "Ghost";
		type2 = "Grass";
		abilities = new String[]{"Pickup", "Frisk", "Insomnia", "Life Force", "Flash Fire"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Gourgeist"};
		nextReq = new String[]{"25"};
		height = "1\'/04’\"";
		size = "Small";
		weight = 11.0;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Amorphous";
		egg2 = "";
		overland = 2;
		swim = 2;
		levitate = 5;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 1;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Phasing","Invisibility","Invisibility","Dead Silent"};
		athl = 2;
		acro = 2;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 1, 4, 6, 11, 16, 20, 23, 26, 30, 36, 40, 42, 48};
		moves = new String[]{"Astonish", "Trick", "Confuse Ray", "Scary Face", "Trick or Treat", "Worry Seed", "Razor Leaf", "Leech Seed", "Bullet Seed", "Shadow Sneak", "Shadow Ball", "Pain Split", "Seed Bomb"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Shadow Ball", "Double Team", "Flamethrower", "Sludge", "Sludge Bomb", "Fire Blast", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Charge", "Charge Beam", "Incinerate", "Explosion", "Flash", "Gyro Ball", "Rock Slide", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Rock Smash", "Nature Power", "Dark Pulse", "Confide"};
		eggMoves = new String[]{"Bestow", "Destiny Bond", "Disable"};
		tutorMoves = new String[]{"Foul Play", "Giga Drain", "Magic Coat", "Pain Split", "Role Play", "Seed Bomb", "Skill Swap", "Spite", "Synthesis", "Trick", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Pumpkaboo(){
		    super();
		    int size = (int)(Math.random()*4);
            switch(size) {
                case 0://Small
                    bHP--;
                    bSpd++;
                    name += "-Small";
                    break;
                case 1://Average
                    name += "-Average";
                    break;
                case 2://Large
                    name += "-Large";
                    break;
                case 3://Super
                    bHP++;
                    bSpd--;
                    name += "-Super";
                    WC++;
                    break;
            }
		}
}