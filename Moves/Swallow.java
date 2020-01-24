public class Swallow extends Move{
		{
		name = "Swallow";
		type = "Normal";
		frequency = "Daily";
		AC = 0;
		category = "Status";
		range = "Self";
		effects = "If the user’s Stockpiled count is 1, they are healed 25 of their full Hit Point value; if their Stockpiled count is 2, they are healed half of their full Hit Point value; if their Stockpiled count is 3, they are healed back to full Hit Points After using Swallow, the user’s Stockpiled count is set to 0 If the user has no Stockpiled count, Swallow does nothing";
		}
}