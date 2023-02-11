package net.galastom.tpmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TP_mod implements ModInitializer {
	public static final String MOD_ID = "gala_tp_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tp-mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}