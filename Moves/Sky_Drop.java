public class Sky_Drop extends Move{
		{
		name = "Sky Drop";
		type = "Flying";
		frequency = "Scene";
		AC = 3;
		damageBase = 6;
		mDamageBase = 6;
		category = "Physical";
		range = "Melee, Target, Set-Up Set-Up";
		effects = "Make Sky Drop’s Accuracy Check If the user hits, the user and target are moved 25 meters into the air The target forfeits their next turn, and cannot Shift or take actions until Sky Drop is resolved Resolution Effect Shift while in the air, and lower both the user and the target heights back to the ground Then apply Sky Drop’s damage If the target has a Sky or Levitate Speed, Sky Drop fails to deal damage If the user is Fainted after the Set-Up but before the Resolution, the target falls to the ground and takes damage as if Sky Drop had a Damage Base of 3 (1d6+58) unless they have a Sky or Levitate Speed, in which case they take no damage";
		}
}