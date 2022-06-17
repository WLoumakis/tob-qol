package com.tobqolimprovements;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("ToB QoL Improvements")
public interface ToBQoLImprovementsConfig extends Config
{
	@ConfigItem(
		keyName = "swapBuyOption",
		name = "Swap Buy Option",
		description = "Swap the 'Value' menu option with the 'Buy-1' menu option at the supply chest in ToB."
	)
	default boolean swapBuyOption()
	{
		return true;
	}

	@ConfigItem(
			keyName = "tobLootReminder",
			name = "Loot Reminder",
			description = "Outline and place an arrow over unclaimed loot outside the theatre."
	)
	default boolean lootReminder()
	{
		return true;
	};
}
