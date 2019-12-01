/**
 * This is the overall Pokemon class all Pokemon  inherit from
 * @Author : Mageman460/GrandMage460
 */
public class Pokemon {

	//base stats
    protected String name;
    protected int bHP;
	protected int bAtk;
	protected int bDef;
	protected int bSpAtk;
	protected int bSpDef;
	protected int bSpd;
	
	//nature changed base stats
	private int nHP;
    private int nAtk;
    private int nDef;
    private int nSpAtk;
    private int nSpDef;
    private int nSpd;
	
	protected int level;
	
	protected String nature;
	
	//adjusted stats
	protected int HP;
	protected int atk;
	protected int def;
	protected int spAtk;
	protected int spDef;
	protected int spd;
	
	//types
	protected String type1;
	protected String type2;
	
	//abilities
	protected String abilities1;
	protected String abilities2;
	protected String abilities3;
	protected String abilities4;
	protected String abilities5;
	
	protected String[] abilities;
	protected int[] abilityTypeCount;
	
	protected boolean singleBasic;
	
	//evolutions
	protected Pokemon previous;
	protected Pokemon next;
	protected String prevReq;
	protected String nextReq;
	
	//size
	protected String height;
	protected String weight;
	protected String size;
	protected String WC;
	
	
	//egg groups
	protected int maleRatio;
	protected int femaleRatio;
	protected String egg1;
	protected String egg2;
	
	//habitats
	protected String[] habitats;
	
	//capabilities
	protected int overland;
	protected int swim;
	protected int levitate;
	protected int sky;
	protected int burrow;
	protected int lJump;
	protected int hJump;
	protected int power;
	protected boolean underdog;
	protected String[] natureWalk;
	protected String[] others;
	
	//skill ranks
	protected int athl;
	protected int acro;
	protected int combat;
	protected int stealth;
	protected int percep;
	protected int focus;
	
	//skill bonus
	protected int athlBonus;
	protected int acroBonus;
	protected int combatBonus;
	protected int stealthBonus;
	protected int percepBonus;
	protected int focusBonus;
	
	//Move list
	protected String[] moves;
	protected String[] eggMoves;
	protected String[] tutorMoves;
	protected String[] TMs;
	protected int[] movesLevels;
	protected String[] naturalMoves;
	
	protected String[] moveList;
	
	//constructor
	public Pokemon() {
	    
	}
	
	//methods
	/**
	 * Decides what nature a Pokemon is
	 * 
	 */
	public void setNature() {
	    String[][] natures = {
	        {"Composed","Cuddly","Distracted","Proud","Decisive","Patient"},
	        {"Desperate","Hardy","Lonely","Adamant","Naughty","Brave"},
	        {"Stark","Bold","Docile","Impish","Lax","Relaxed"},
	        {"Curious","Modest","Mild","Bashful","Rash","Quiet"},
	        {"Dreamy","Calm","Gentle","Careful","Quirky","Sassy"},
	        {"Skittish","Timid","Hasty","Jolly","Naive","Serious"}
	        };
	    int up = (int)(Math.random()*6)+1;
	    int down = (int)(Math.random()*6)+1;
	    this.nature = natures[up-1][down-1];
	    setNature(up,down);
	}
	public void normalize() {
	    HP = nHP;
	    atk = nAtk;
	    def = nDef;
	    spAtk = nSpAtk;
	    spDef = nSpDef;
	    spd = nSpd;
	}
	/**
	 * Distributes level up points according to BSR
	 * 
	 */
	public void levelUp(int lvl) {
	    if(lvl > 100) {
	        lvl = 100;
	    }if(lvl < 0) {
	        lvl = 0;
	    }
	    level += lvl;
	    int levelPoints = lvl + 10;
	    for(int i = 0; i < levelPoints; i++) {
	       String[] addables = getBSRAddable();
	       int ind = (int)(Math.random() * addables.length);
	       String add = addables[ind];
	       switch (add) {
	           case "HP":
	               HP++;
	               break;
	           case "Atk":
                   atk++;
                   break;
	           case "Def":
                   def++;
                   break;
	           case "SpAtk":
                   spAtk++;
                   break;
	           case "SpDef":
                   spDef++;
                   break;
	           case "Spd":
                   spd++;
                   break;
               default:
                   break;
	       }
	    }
	}
	
	/**
	 * Checks what stats are addable to
	 * 
	 * @return : returns an array of addable stats
	 */
	private String[] getBSRAddable() {
        String done = "";
        if(bsr(1)) {
            done += "HP ";
        }if(bsr(2)) {
            done += "Atk ";
        }if(bsr(3)) {
            done += "Def ";
        }if(bsr(4)) {
            done += "SpAtk ";
        }if(bsr(5)) {
            done += "SpDef ";
        }if(bsr(6)) {
            done += "Spd ";
        }
        String[] result = done.split(" ");
        return result;
    }
	
	public String[] generateAbilities() {
	    String[] abilities = { "", "", ""};
	    int abi1 = (int)(Math.random()*abilityTypeCount[0]);
	    abilities[0] = this.abilities[abi1];
	    int abi2 = -1;
	    int abi3 = -1;
	    if(level >= 20) {
	        abi2 = (int)(Math.random() * (abilityTypeCount[0] + abilityTypeCount[1]));
	        while(abi2 == abi1) {
	            abi2 = (int)(Math.random() * (abilityTypeCount[0] + abilityTypeCount[1]));
	        }
	        abilities[1] = this.abilities[abi2];
	    }if(level >= 40) {
	        abi3 = (int)(Math.random() * (abilityTypeCount[0] + abilityTypeCount[1] + abilityTypeCount[2]));
            while(abi3 == abi1 || abi3 == abi2) {
                abi3 = (int)(Math.random() * (abilityTypeCount[0] + abilityTypeCount[1] + abilityTypeCount[2]));
            }
            abilities[2] = this.abilities[abi3];
	    }
	    return abilities;
	}
	
	/**
	 * Compares an array of integers to see if there are
	 * two values that are equal
	 * 
	 * @param : ia : the array being compared
	 * @return : true or false, false if every value is unique
	 */
	private boolean compareIA(int[] ia) {
	    boolean flag = false;
	    for(int i = 0; i < 5;i++) {
            for(int j = i + 1; j < 6; j++) {
                if(ia[i] == ia[j]) {
                    flag = true;
                }
            }
        }
	    return flag;
	}
	/**
	 * Generates a move list of length 6
	 * 
	 * @return : moveList : returns the moves list of the pokemon
	 */
	public String[] generateMoveList() {
	    String levelMoves = "";
	    
	    for(int i = 0; i < moves.length; i++) {
	        if(movesLevels[i] <= level) {
	            levelMoves += moves[i].replace(' ', '_') + " ";
	        }
	    }
	    
	    int index1 = naturalMoves.length;
	    String[] levelMovesA = levelMoves.split(" ");
	    String[] availableMoves = new String[index1 + levelMovesA.length];
	    for(int i = 0; i < naturalMoves.length;i++) {
	        availableMoves[i] = naturalMoves[i];
	    }
	    for(int i = 0; i < levelMovesA.length;i++) {
            availableMoves[i + index1] = levelMovesA[i];
        }
	    
	    String[] moveList = new String[6];
	    if(availableMoves.length > 6) {
    	    int[] rng = new int[6];
    	    for(int i = 0; i < 6; i++) {
                rng[i] = (int)(Math.random() * availableMoves.length-1);
            }
    	    while(compareIA(rng)) {
    	        for(int i = 0; i < 5;i++) {
    	            for(int j = i + 1; j < 6; j++) {
    	                if(rng[i] == rng[j]) {
    	                    rng[j] = (int)(Math.random()*availableMoves.length-1);
    	                }
    	            }
    	        }
    	    }
    	    for(int i = 0; i < 6; i++) {
    	        moveList[i] = availableMoves[rng[i]];
    	    }
	    }else {
	        moveList = availableMoves;
	    }
	    
	    return moveList;
	}
	
	private int getBHP() {
	    return bHP;
	}
	
	private int getBAtk() {
        return bAtk;
    }
	
	private int getBDef() {
        return bDef;
    }
	
	private int getBSpAtk() {
        return bSpAtk;
    }
	
	private int getBSpDef() {
        return bSpDef;
    }
	
	private int getBSpd() {
        return bSpd;
    }
	/**
	 * Sets the nature of the Pokemon, and changes the Base Stats accordingly
	 * 
	 * @param : up : stat to go up, based on an integer
	 * @param : down : stat to go down, based on integer
	 * @param : nature : the name of the nature
	 */
	private void setNature(int up, int down) {
	    //System.out.println("UP: " + up + "\nDOWN: " + down);
	    if(up == down) {
	        
	    }else {
	        switch (up) {
	            case 1:
	                nHP = getBHP() + 1;
	                break;
	            case 2:
                    nAtk = getBAtk() + 2;
                    break;
	            case 3:
	                nDef = getBDef() + 2;
                    break;
	            case 4:
	                nSpAtk = getBSpAtk() + 2;
	                break;
	            case 5:
	                nSpDef = getBSpDef() + 2;
	                break;
	            case 6:
	                nSpd = getBSpd() + 2;
                    break;
                default:
                    System.out.println("Error " + up);
	        }
	        switch (down) {
                case 1:
                    nHP = getBHP() - 1;
                    break;
                case 2:
                    nAtk = getBAtk() - 2;
                    break;
                case 3:
                    nDef = getBDef() - 2;
                    break;
                case 4:
                    nSpAtk = getBSpAtk() - 2;
                    break;
                case 5:
                    nSpDef = getBSpDef() - 2;
                    break;
                case 6:
                    nSpd = getBSpd() - 2;
                    break;
                default:
                    System.out.println("Error " + down);
            }
	    }
	    if(nHP == 0) {
	        nHP = bHP;
	    }if(nAtk == 0) {
            nAtk = bAtk;
        }if(nDef == 0) {
            nDef = bDef;
        }if(nSpAtk == 0) {
            nSpAtk = bSpAtk;
        }if(nSpDef == 0) {
            nSpDef = bSpDef;
        }if(nSpd == 0) {
            nSpd = bSpd;
        }
	}
	
	/**
	 * Checks if a certain stat is addable to
	 * A stat can be added to when it is less than any base stat that is higher
	 * 
	 * @param : stat : the number corresponfing to the stat
	 * @return : true if it is addable to, false other wise
	 */
	private boolean bsr(int stat) {
		switch (stat){
			case 1:
				if(nHP < nAtk) {
					if(HP == (atk - 1)) {
						return false;
					}
				}if(nHP < nDef) {
					if(HP == (def - 1)) {
						return false;
					}
				}if(nHP < nSpAtk) {
					if(HP == (spAtk - 1)) {
						return false;
					}
				}if(nHP < nSpDef) {
					if(HP == (spDef - 1)) {
						return false;
					}
				}if(nHP < nSpd) {
					if(HP == (spd - 1)) {
						return false;
					}
				}
				break;
			case 2:
				if(nAtk < nHP) {
					if(atk == (HP - 1)) {
						return false;
					}
				}if(nAtk < nDef) {
					if(atk == (def - 1)) {
						return false;
					}
				}if(nAtk < nSpAtk) {
					if(atk == (spAtk - 1)) {
						return false;
					}
				}if(nAtk < nSpDef) {
					if(atk == (spDef - 1)) {
						return false;
					}
				}if(nAtk < nSpd) {
					if(atk == (spd - 1)) {
						return false;
					}
				}
				break;
			case 3:
				if(nDef < nAtk) {
					if(def == (atk - 1)) {
						return false;
					}
				}if(nDef < nHP) {
					if(def == (HP - 1)) {
						return false;
					}
				}if(nDef < nSpAtk) {
					if(def == (spAtk - 1)) {
						return false;
					}
				}if(nDef < nSpDef) {
					if(def == (spDef - 1)) {
						return false;
					}
				}if(nDef < nSpd) {
					if(def == (spd - 1)) {
						return false;
					}
				}
				break;
			case 4:
				if(nSpAtk < nAtk) {
					if(spAtk == (atk - 1)) {
						return false;
					}
				}if(nSpAtk < nDef) {
					if(spAtk == (def - 1)) {
						return false;
					}
				}if(nSpAtk < nHP) {
					if(spAtk == (HP - 1)) {
						return false;
					}
				}if(nSpAtk < nSpDef) {
					if(spAtk == (spDef - 1)) {
						return false;
					}
				}if(nSpAtk < nSpd) {
					if(spAtk == (spd - 1)) {
						return false;
					}
				}
				break;
			case 5:
				if(nSpDef < nAtk) {
					if(spDef == (atk - 1)) {
						return false;
					}
				}if(nSpDef < nDef) {
					if(spDef == (def - 1)) {
						return false;
					}
				}if(nSpDef < nSpAtk) {
					if(spDef == (spAtk - 1)) {
						return false;
					}
				}if(nHP > nSpDef) {
					if(spDef == (HP - 1)) {
						return false;
					}
				}if(nSpDef < nSpd) {
					if(spDef == (spd - 1)) {
						return false;
					}
				}
				break;
			case 6:
				if(nSpd < nAtk) {
					if(spd == (atk - 1)) {
						return false;
					}
				}if(nSpd < nDef) {
					if(spd == (def - 1)) {
						return false;
					}
				}if(nSpd < nSpAtk) {
					if(spd == (spAtk - 1)) {
						return false;
					}
				}if(nSpd < nSpDef) {
					if(spd == (spDef - 1)) {
						return false;
					}
				}if(nSpd < nHP) {
					if(spd == (spDef - 1)) {
						return false;
					}
				}
				break;
		}
		return true;
	}
	
	public String toString() {
	    String result = String.format("%s\nBase HP: %d\nBase ATK: %d\nBase DEF: %d\nBase SATK: %d\nBase SDEF: %d\nBase SPD: %d\n", name, nHP, nAtk, nDef, nSpAtk, nSpDef, nSpd);
	    result += String.format("Nature: %s\n", nature);
	    result += String.format("Adjusted\nHP: %d\nATK: %d\nDEF: %d\nSATK: %d\nSDEF: %d\nSPD: %d\n", HP, atk, def, spAtk, spDef, spd);
	    return result;
	}
	
	private int getMaxEXP() {
	    int maxEXP;
	    switch (level) {
            case 1:
                maxEXP = 0;break;
            case 2:
                maxEXP = 10;break;
            case 3:
                maxEXP = 20;break;
            case 4:
                maxEXP = 30;break;
            case 5:
                maxEXP = 40;break;
            case 6:
                maxEXP = 50;break;
            case 7:
                maxEXP = 60;break;
            case 8:
                maxEXP = 70;break;
            case 9:
                maxEXP = 80;break;
            case 10:
                maxEXP = 90;break;
            case 11:
                maxEXP = 110;break;
            case 12:
                maxEXP = 135;break;
            case 13:
                maxEXP = 160;break;
            case 14:
                maxEXP = 190;break;
            case 15:
                maxEXP = 220;break;
            case 16:
                maxEXP = 250;break;
            case 17:
                maxEXP = 285;break;
            case 18:
                maxEXP = 320;break;
            case 19:
                maxEXP = 360;break;
            case 20:
                maxEXP = 400;break;
            case 21:
                maxEXP = 460;break;
            case 22:
                maxEXP = 530;break;
            case 23:
                maxEXP = 600;break;
            case 24:
                maxEXP = 670;break;
            case 25:
                maxEXP = 745;break;
            case 26:
                maxEXP = 820;break;
            case 27:
                maxEXP = 900;break;
            case 28:
                maxEXP = 990;break;
            case 29:
                maxEXP = 1075;break;
            case 30:
                maxEXP = 1165;break;
            case 31:
                maxEXP = 1260;break;
            case 32:
                maxEXP = 1355;break;
            case 33:
                maxEXP = 1455;break;
            case 34:
                maxEXP = 1555;break;
            case 35:
                maxEXP = 1660;break;
            case 36:
                maxEXP = 1770;break;
            case 37:
                maxEXP = 1880;break;
            case 38:
                maxEXP = 1995;break;
            case 39:
                maxEXP = 2110;break;
            case 40:
                maxEXP = 2230;break;
            case 41:
                maxEXP = 2355;break;
            case 42:
                maxEXP = 2480;break;
            case 43:
                maxEXP = 2610;break;
            case 44:
                maxEXP = 2740;break;
            case 45:
                maxEXP = 2875;break;
            case 46:
                maxEXP = 3015;break;
            case 47:
                maxEXP = 3155;break;
            case 48:
                maxEXP = 3300;break;
            case 49:
                maxEXP = 3445;break;
            case 50:
                maxEXP = 3645;break;
            case 51:
                maxEXP = 3850;break;
            case 52:
                maxEXP = 4060;break;
            case 53:
                maxEXP = 4270;break;
            case 54:
                maxEXP = 4485;break;
            case 55:
                maxEXP = 4705;break;
            case 56:
                maxEXP = 4930;break;
            case 57:
                maxEXP = 5160;break;
            case 58:
                maxEXP = 5390;break;
            case 59:
                maxEXP = 5625;break;
            case 60:
                maxEXP = 5865;break;
            case 61:
                maxEXP = 6110;break;
            case 62:
                maxEXP = 6360;break;
            case 63:
                maxEXP = 6610;break;
            case 64:
                maxEXP = 6865;break;
            case 65:
                maxEXP = 7125;break;
            case 66:
                maxEXP = 7390;break;
            case 67:
                maxEXP = 7660;break;
            case 68:
                maxEXP = 7925;break;
            case 69:
                maxEXP = 8205;break;
            case 70:
                maxEXP = 8485;break;
            case 71:
                maxEXP = 8770;break;
            case 72:
                maxEXP = 9060;break;
            case 73:
                maxEXP = 9350;break;
            case 74:
                maxEXP = 9645;break;
            case 75:
                maxEXP = 9945;break;
            case 76:
                maxEXP = 10250;break;
            case 77:
                maxEXP = 10560;break;
            case 78:
                maxEXP = 10870;break;
            case 79:
                maxEXP = 11185;break;
            case 80:
                maxEXP = 11505;break;
            case 81:
                maxEXP = 11910;break;
            case 82:
                maxEXP = 12320;break;
            case 83:
                maxEXP = 12735;break;
            case 84:
                maxEXP = 13155;break;
            case 85:
                maxEXP = 13580;break;
            case 86:
                maxEXP = 14010;break;
            case 87:
                maxEXP = 14445;break;
            case 88:
                maxEXP = 14885;break;
            case 89:
                maxEXP = 15330;break;
            case 90:
                maxEXP = 15780;break;
            case 91:
                maxEXP = 16235;break;
            case 92:
                maxEXP = 16695;break;
            case 93:
                maxEXP = 17160;break;
            case 94:
                maxEXP = 17630;break;
            case 95:
                maxEXP = 18105;break;
            case 96:
                maxEXP = 18585;break;
            case 97:
                maxEXP = 19070;break;
            case 98:
                maxEXP = 19560;break;
            case 99:
                maxEXP = 20055;break;
            case 100:
                maxEXP = 20555;break;
            default:
                maxEXP = 0;
        }
	    return maxEXP;
	}
	
	private String gender() {
	    int dice = (int)(Math.random() * 101) + 1;
	    if(dice >= maleRatio) {
	        return "Male";
	    }
	    return "Female";
	}
	
	private String getCapabilities() {
	    String result = String.format("{\"Overland\":%d,\"Swim\":%d,\"Power\":%d,\"HJ\":%d,\"LJ\":%d",overland,swim, power, hJump, lJump);
	    if (sky > 0) {
	        result += String.format(",\"Sky\":%d,",sky);
	    }
	    if (levitate > 0) {
	        result += String.format(",\"Levitate\":%d,",levitate);
	    }
	    if (burrow > 0) {
	        result += String.format(",\"Burrow\":%d,",burrow);
	    }
	    if(natureWalk.length > 0) {
	        for(int i = 0; i < natureWalk.length; i++) {
	            result += ",\"Naturewalk(" + natureWalk[i] + ")\":true";
	        }
	    }
	    for(int i = 0; i < others.length; i++) {
	        result += String.format(",\"%s\":true", others[i]);
	    }
	    if(underdog) {
	        result += ",\"Underdog\":true";
	    }
	    result += "}";
	    return result;
	}
	
	public String toJSON() {
	    int maxEXP = getMaxEXP();
	    if(type2 == null) {
	        type2 = "";
	    }
	    String gender = gender();
	    int aHP = HP - nHP;
	    int aAtk = atk - nAtk;
        int aDef = def - nDef;
        int aSpAtk = spAtk - nSpAtk;
        int aSpDef = spDef - nSpDef;
        int aSpd = spd - nSpd;
        int tutorPoints = level / 5;
        String capabilities = getCapabilities();
	    String result = String.format("{\"CharType\":0,\"nickname\":\"\",\"species\":\"%s\",\"type1\":\"%s\",\"type2\":\"%s\",\"Level\":%d,\"EXP_max\":%d,\"HeldItem\":\"\",\"Gender\":\"%s\",\"Nature\":\"%s\",\"Height\":\"%s\",\"WeightClass\":%s,\"base_HP\":%d,\"base_ATK\":%d,\"base_DEF\":%d,\"base_SPATK\":%d,\"base_SPDEF\":%d,\"base_SPEED\":%d,\"HP\":%d,\"ATK\":%d,\"DEF\":%d,\"SPATK\":%d,\"SPDEF\":%d,\"SPEED\":%d,\"Capabilities\":%s,\"Acrobatics\":%d,\"Athletics\":%d,\"Combat\":%d,\"Intimidate\":2,\"Stealth\":%d,\"Survival\":2,\"GeneralEducation\":1,\"MedicineEducation\":1,\"OccultEducation\":1,\"PokemonEducation\":1,\"TechnologyEducation\":1,\"Guile\":2,\"Perception\":%d,\"Charm\":2,\"Command\":2,\"Focus\":%d,\"Intuition\":2,\"Acrobatics_bonus\":%d,\"Athletics_bonus\":%d,\"Combat_bonus\":%d,\"Intimidate_bonus\":0,\"Stealth_bonus\":%d,\"Survival_bonus\":0,\"GeneralEducation_bonus\":0,\"MedicineEducation_bonus\":0,\"OccultEducation_bonus\":0,\"PokemonEducation_bonus\":0,\"TechnologyEducation_bonus\":0,\"Guile_bonus\":0,\"Perception_bonus\":%d,\"Charm_bonus\":0,\"Command_bonus\":0,\"Focus_bonus\":%d,\"Intuition_bonus\":0,\"TutorPoints\":%d,\"TutorPoints_max\":%d", 
	        name, type1, type2, level, maxEXP, gender, nature, size, WC, nHP, nAtk, nDef, nSpAtk, nSpDef, nSpd, aHP, aAtk, aDef, aSpAtk, aSpDef, aSpd, capabilities, acro, athl, combat, stealth, percep, focus, acroBonus, athlBonus, combatBonus, stealthBonus, percepBonus, focusBonus, tutorPoints, tutorPoints);
	    return result;
	}
}