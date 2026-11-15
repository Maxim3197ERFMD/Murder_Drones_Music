package net.erfmd.murderdronesmusic;

import net.erfmd.murderdronesmusic.item.MurderDronesMusicGroups;
import net.erfmd.murderdronesmusic.item.MurderDronesMusicItems;
import net.erfmd.murderdronesmusic.sound.MurderDronesMusicSounds;
import net.erfmd.murderdronesmusic.util.MurderDronesMusicLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MurderDronesMusic implements ModInitializer {
	public static final String MOD_ID = "murderdronesmusic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MurderDronesMusicGroups.registerItemGroups();
		MurderDronesMusicItems.registerModItems();

		MurderDronesMusicSounds.registerSounds();

		MurderDronesMusicLootTableModifiers.modifyLootTables();
	}
}