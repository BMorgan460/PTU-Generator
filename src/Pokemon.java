/**
 * This is the overall Pokemon class all Pokemon  inherit from
 * @Author : Mageman460/GrandMage460
 */
public class Pokemon {
	//base stats
	protected int bHP;
	protected int bAtk;
	protected int bDef;
	protected int bSpAtk;
	protected int bSpDef;
	protected int bSpd;
	
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
	
	protected boolean singleBasic;
	
	//evolutions
	protected String previous;
	protected String next;
	protected String prevReq;
	protected String nextReq;
	
	//size
	protected String height;
	protected int weight;
	protected String size;
	protected int WC;
	
	//egg groups
	protected String egg1;
	protected String egg2;
	
	//habitats
	protected String[] habitats;
	
	//capabilities
	protected int overland;
	protected int swim;
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
	protected int combBonus;
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
	private void setNature() {
	    
	}
	
	/**
	 * Distributes level up points according to BSR
	 * 
	 */
	private void levelUp() {
	   int levelPoints = level + 10;
	   for(int i = 0; i < levelPoints; i++) {
	       
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
	private String[] generateMoveList() {
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
	    for(int i = 0; i < moves.length;i++) {
            availableMoves[i + index1] = moves[i];
        }
	    
	    String[] moveList = new String[6];
	    if(availableMoves.length > 6) {
    	    int[] rng = new int[6];
    	    for(int i = 0; i < 6; i++) {
                rng[i] = (int)(Math.random()*availableMoves.length-1);
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
	
	/**
	 * Sets the nature of the Pokemon, and changes the Base Stats accordingly
	 * 
	 * @param : up : stat to go up, based on an integer
	 * @param : down : stat to go down, based on integer
	 * @param : nature : the name of the nature
	 */
	private void setNature(int up, int down, String nature) {
	    this.nature = nature;
	    if(up == down) {
	        
	    }else {
	        switch (up) {
	            case 1:
	                bHP++;
	                break;
	            case 2:
	                bAtk += 2;
                    break;
	            case 3:
	                bDef += 2;
                    break;
	            case 4:
	                bSpAtk += 2;
                    break;
	            case 5:
	                bSpDef +=2;
                    break;
	            case 6:
	                bSpd += 2;
                    break;
	        }
	        switch (down) {
                case 1:
                    bHP--;
                    break;
                case 2:
                    bAtk -= 2;
                    break;
                case 3:
                    bDef -= 2;
                    break;
                case 4:
                    bSpAtk -= 2;
                    break;
                case 5:
                    bSpDef -=2;
                    break;
                case 6:
                    bSpd -= 2;
                    break;
            }
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
				if(bHP < bAtk) {
					if(HP == (atk - 1)) {
						return false;
					}
				}if(bHP < bDef) {
					if(HP == (def - 1)) {
						return false;
					}
				}if(bHP < bSpAtk) {
					if(HP == (spAtk - 1)) {
						return false;
					}
				}if(bHP < bSpDef) {
					if(HP == (spDef - 1)) {
						return false;
					}
				}if(bHP < bSpd) {
					if(HP == (spd - 1)) {
						return false;
					}
				}
				break;
			case 2:
				if(bAtk < bHP) {
					if(atk == (HP - 1)) {
						return false;
					}
				}if(bAtk < bDef) {
					if(atk == (def - 1)) {
						return false;
					}
				}if(bAtk < bSpAtk) {
					if(atk == (spAtk - 1)) {
						return false;
					}
				}if(bAtk < bSpDef) {
					if(atk == (spDef - 1)) {
						return false;
					}
				}if(bAtk < bSpd) {
					if(atk == (spd - 1)) {
						return false;
					}
				}
				break;
			case 3:
				if(bDef < bAtk) {
					if(def == (atk - 1)) {
						return false;
					}
				}if(bDef < HP) {
					if(def == (HP - 1)) {
						return false;
					}
				}if(bDef < bSpAtk) {
					if(def == (spAtk - 1)) {
						return false;
					}
				}if(bDef < bSpDef) {
					if(def == (spDef - 1)) {
						return false;
					}
				}if(bDef < bSpd) {
					if(def == (spd - 1)) {
						return false;
					}
				}
				break;
			case 4:
				if(bSpAtk < bAtk) {
					if(spAtk == (atk - 1)) {
						return false;
					}
				}if(bSpAtk < bDef) {
					if(spAtk == (def - 1)) {
						return false;
					}
				}if(bSpAtk < bHP) {
					if(spAtk == (HP - 1)) {
						return false;
					}
				}if(bSpAtk < bSpDef) {
					if(spAtk == (spDef - 1)) {
						return false;
					}
				}if(bSpAtk < bSpd) {
					if(spAtk == (spd - 1)) {
						return false;
					}
				}
				break;
			case 5:
				if(bSpDef < bAtk) {
					if(spDef == (atk - 1)) {
						return false;
					}
				}if(bSpDef < bDef) {
					if(spDef == (def - 1)) {
						return false;
					}
				}if(bSpDef < bSpAtk) {
					if(spDef == (spAtk - 1)) {
						return false;
					}
				}if(bHP > bSpDef) {
					if(spDef == (HP - 1)) {
						return false;
					}
				}if(bSpDef < bSpd) {
					if(spDef == (spd - 1)) {
						return false;
					}
				}
				break;
			case 6:
				if(bSpd < bAtk) {
					if(spd == (atk - 1)) {
						return false;
					}
				}if(bSpd < bDef) {
					if(spd == (def - 1)) {
						return false;
					}
				}if(bSpd < bSpAtk) {
					if(spd == (spAtk - 1)) {
						return false;
					}
				}if(bSpd < bSpDef) {
					if(spd == (spDef - 1)) {
						return false;
					}
				}if(bSpd < bHP) {
					if(spd == (spDef - 1)) {
						return false;
					}
				}
				break;
		}
		return true;
	}

	
}
