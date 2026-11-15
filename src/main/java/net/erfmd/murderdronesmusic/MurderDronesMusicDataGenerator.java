package net.erfmd.murderdronesmusic;

import net.erfmd.murderdronesmusic.datagen.MurderDronesMusicItemTagProvider;
import net.erfmd.murderdronesmusic.datagen.MurderDronesMusicModelProvider;
import net.erfmd.murderdronesmusic.datagen.lang.MurderDronesMusicLangEnglishProvider;
import net.erfmd.murderdronesmusic.datagen.lang.MurderDronesMusicLangRussianProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MurderDronesMusicDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MurderDronesMusicItemTagProvider::new);
		pack.addProvider(MurderDronesMusicModelProvider::new);

		pack.addProvider(MurderDronesMusicLangEnglishProvider::new);
		pack.addProvider(MurderDronesMusicLangRussianProvider::new);
	}
}
