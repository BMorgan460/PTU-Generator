
public class Thousand_Arrows extends Move {
	{
		name = "Thousand Arrows";
		type = "Ground";
		frequency = "Scene";
		AC = 2;
		damageBase = 9;
		mDamageBase = 9;
		category = "Physical";
		range = "6, 1 Target";
		effects = "When calculating Weakness and Resistance for Thousand Arrows, Flying-Typed targets calculate damage as if Flying was neutral to Ground. Thousand Arrows ignores the Levitate ability. The target is knocked down to ground level, and loses all Sky or Levitate Speeds for 3 turns. During this time, they maybe hit by Ground-Type Moves even if normally immune.";
	}
}
