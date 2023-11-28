public class Arbok extends Pokemon{
	{
		name = "Arbok";
		bHP = 6;
		bAtk = 10;
		bDef = 7;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 8;
		type1 = "Poison";
		type2 = "";
		abilities = new String[]{"Shed Skin", "Intimidate", "Serpents Mark", "Serpents Mark"};
		abilityTypeCount = new int[] {2,1,1};
		height = "11\'/6\"";
		weight = 143.3;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Dragon";
		habitats = new String[]{"Forest", "Grassland", "Marsh"};
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Grassland"};
		underdog = false;
		other = new String[]{"Darkvision","Stealth"};
		athl = 4;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 1;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{4, 9, 12, 17, 20, 27, 27, 27, 32, 39, 44, 48, 51, 56, 63};
		moves = new String[]{"Poison Sting", "Bite", "Glare", "Screech", "Acid", "Spit Up", "Stockpile", "Swallow", "Acid Spray", "Mud Bomb", "Gastro Acid", "Belch", "Haze", "Coil", "Gunk Shot"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Double Team", "Sludge", "Sludge Wave", "Sludge", "Sludge Bomb", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Brutal Swing", "Payback", "Giga Impact", "Bulldoze", "Rock Slide", "Dragon Tail", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Dark Pulse", "Confide"};
		eggMoves = new String[]{"Beat Up", "Disable", "Iron Tail", "Poison Fang", "Poison Tail", "Pursuit", "Scary Face", "Slam", "Snatch", "Spite", "Sucker Punch", "Switcheroo"};
		tutorMoves = new String[]{"Aqua Tail", "Bind", "Body Slam", "Slam", "Fire Fang", "Gastro Acid", "Acid", "Giga Drain", "Gunk Shot", "Ice Fang", "Iron Tail", "Seed Bomb", "Snatch", "Snore", "Spite", "Stomping Tantrum", "Throat Chop", "Thunder Fang"};
		naturalMoves = new String[]{"Fire Fang", "Ice Fang", "Thunder Fang"};
	}
		public Arbok(){
			super();
			
		}
		
		@Override
		public String[] generateAbilities() {
			super.generateAbilities();
			
			int pattern = (int)(Math.random()*6);
			String[] newAbilityList = {abilityList[0], abilityList[1], abilityList[2], "", ""};
			if(level >= 20 && level < 40) {
				if(abilityList[1].equals("Serpents Mark")) {
					switch (pattern) {
						case 0:
							newAbilityList[2] = "Strong Jaw";
							break;
						case 1:
							newAbilityList[2] = "Crush Trap";
							break;
						case 2:
							newAbilityList[2] = "Unnerve";
							break;
						case 3:
							newAbilityList[2] = "Regenerator";
							break;
						case 4:
							newAbilityList[2] = "Run Away";
							break;
						case 5:
							newAbilityList[2] = "Infiltrator";
							break;
					}
				}
			} else if(level >= 40) {
				boolean highAbility = false;
				if(abilityList[1].equals("Serpents Mark")) {
					switch (pattern) {
						case 0:
							newAbilityList[3] = "Strong Jaw";
							highAbility = true;
							break;
						case 1:
							newAbilityList[3] = "Crush Trap";
							highAbility = true;
							break;
						case 2:
							newAbilityList[3] = "Unnerve";
							highAbility = true;
							break;
						case 3:
							newAbilityList[3] = "Regenerator";
							highAbility = true;
							break;
						case 4:
							newAbilityList[3] = "Run Away";
							highAbility = true;
							break;
						case 5:
							newAbilityList[3] = "Infiltrator";
							highAbility = true;
							break;
					}
				} if(abilityList[2].equals("Serpents Mark")) {
					switch (pattern) {
						case 0:
							newAbilityList[4] = ((highAbility) ? "Guts" : "Strong Jaw");
							break;
						case 1:
							newAbilityList[4] = ((highAbility) ? "Frisk" : "Crush Trap");
							break;
						case 2:
							newAbilityList[4] = ((highAbility) ? "Regal Challenge" : "Unnerve");
							break;
						case 3:
							newAbilityList[4] = ((highAbility) ? "Defy Death" : "Regenerator");
							break;
						case 4:
							newAbilityList[4] = ((highAbility) ? "Speed Boost" : "Run Away");
							break;
						case 5:
							newAbilityList[4] = ((highAbility) ? "Ambush" : "Infiltrator");
							break;
					}
				}
			}
			
			this.abilityList = newAbilityList;
			
			return abilityList;
		}
}