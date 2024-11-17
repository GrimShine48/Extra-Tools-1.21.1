package com.peta.extratools;

import com.peta.extratools.item.ModItems;
import com.peta.extratools.util.ExcavatorUsageEvent;
import com.peta.extratools.util.HammerUsageEvent;
import com.peta.extratools.util.ScytheUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraTools implements ModInitializer {
	public static final String MOD_ID = "extratools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new ExcavatorUsageEvent());
		PlayerBlockBreakEvents.BEFORE.register(new ScytheUsageEvent());
	}
}