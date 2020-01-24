public class Earthquake extends Move{
		{
		name = "Earthquake";
		type = "Ground";
		frequency = "Scene";
		AC = 2;
		damageBase = 10;
		mDamageBase = 10;
		category = "Physical";
		range = "Burst 3, Groundsource";
		effects = "Earthquake can hit targets that are underground, including those using the Move Dig";
		}
}