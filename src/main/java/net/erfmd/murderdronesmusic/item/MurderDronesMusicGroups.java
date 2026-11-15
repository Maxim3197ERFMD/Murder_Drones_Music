package net.erfmd.murderdronesmusic.item;

import net.erfmd.murderdronesmusic.MurderDronesMusic;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MurderDronesMusicGroups {
    public static final ItemGroup EPISODE_1_AND_2_MUSIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MurderDronesMusic.MOD_ID, "ep_1-2"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ep_1-2"))
                    .icon(() -> new ItemStack(MurderDronesMusicItems.MUSIC_DISC_MURDER_DRONES)).entries((displayContext, entries) -> {
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_DISASSEMBLY_REQUIRED);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_MURDER_BRINGS);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_MURDER_DRONES);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_UZI_DOESNT_READ_THE_ASSIGNMENT);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THAD_IS_CHILL);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_UZI_THE_DRONE_KILLER);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_WHISPERS_IN_THE_SKY);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GOTH_GIRL_ANIME_LOVER_VS_WHOLESOME_KILLER_BOY);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_N_DISASSEMBLY_DRONES_LEADER);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_V_AND_J_SEEM_NICE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THE_PLOT);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GIN_RUMMY);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THE_DAD_ENING);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THE_PLOT_2_THIS_TIME_ITS_PERSONAL);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_CLICK);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THE_DAD_ENING_2_ITS_ACTUALLY_PERSONAL);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_UZI_NEEDS_A_TIME_OUT);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_SPOOKY_FLASHBACK_OOOOO);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_BUDDIES_CHILLIN);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_HEART_EMOJI);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_BUDDIES_CHILLIN_BUT_OUTSIDE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GIMME_A_HAND);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_AAAAHHH);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_ELDRITCH_J_XD);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_DOLL);
                    }).build());
    public static final ItemGroup EPISODE_3_AND_4_MUSIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MurderDronesMusic.MOD_ID, "ep_3-4"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ep_3-4"))
                    .icon(() -> new ItemStack(MurderDronesMusicItems.MUSIC_DISC_MURDER_DRONES)).entries((displayContext, entries) -> {
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GIMME_AN_ARM);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_UUUGGHHH);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_DAPPER);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_BATHTUB);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GET_PROMMED);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THE_KNIFE_DANCE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_YUM_YUM);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_SPACE_GIRL);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_RADIO);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_CAMPING);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_IM_CONFUSED);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_LITERALLY_JUST_NOISE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_SOLVER_UZI);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_FALLING_FOR_YOU);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_MAGIC_SCHOOL_BUS);
                    }).build());
    public static final ItemGroup EPISODE_5_AND_6_MUSIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MurderDronesMusic.MOD_ID, "ep_5-6"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ep_5-6"))
                    .icon(() -> new ItemStack(MurderDronesMusicItems.MUSIC_DISC_MURDER_DRONES)).entries((displayContext, entries) -> {
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GR_ENERGY);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_CRISS_CROSS_APPLE_SAUCE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THE_HUMAN_GALA);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_DARKXWOLF17);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_LIVE_LAUGH_LOVE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_FRUMPLEBUCKET);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_YOU_DIDNT_HA);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_BOTH_VERY_SCARY);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GENTLE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_ETERNAL_DREAM);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THE_PLOT_3_IM_STILL_CONFUSED);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_OK_YEA_THATS_PRETTY_DARK);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_WOW_OK_THATS_PRETTY_DARK);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_EARTH);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_SENTINAL_000D);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_HUGGIE_WUGGIES);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_THATS_A_NICE_HALLWAY_YOU_EVER_SEE_A_HALLWAY_THAT_NICE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_HEH_NOTHING_PERSONAL_KID);
                    }).build());
    public static final ItemGroup EPISODE_7_AND_8_MUSIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MurderDronesMusic.MOD_ID, "ep_7-8"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ep_7-8"))
                    .icon(() -> new ItemStack(MurderDronesMusicItems.MUSIC_DISC_MURDER_DRONES)).entries((displayContext, entries) -> {
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_MATH_AND_SCIENCE);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_GAMER_MOM);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_WHEN_YOU_FORGET_TO_PLAY);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_IPOD_4TH_GEN);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_HEY_GUYS_JUST_WANTED_TO_SAY_WHATS_UP);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_RUN);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_UR_AIGHT);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_NORI);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_DOLL_WARN);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_YOURE_FREAKIN_GROUNDED);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_HAND_OUT);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_ABSOLUTE_SOLVER);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_DIE_MAD);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_IF_U_A_LIL_B);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_FALLING_WITH_YOU);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_ETERNAL_DESTROYER);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_UZI_AND_N_THE_DRONE_KILLERS);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_SYS_CYN_CALLBACKPING_UZI);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_K);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_BITE_ME);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_HAHA_YEA_DUDE_THATS_SICK);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_FOREVER);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_BITE_ME_NORMAL_PITCH);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_BITE_ME_NIGHTCORED_AGAIN);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_FOREVER_FULL_VERSION);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_FIGHT_TIL_IM_GOOD_ENOUGH);
                        entries.add(MurderDronesMusicItems.MUSIC_DISC_STARGAZING_WITH_MURDEROUS_DRONE_INTENT);
                    }).build());

    public static void registerItemGroups() {
        MurderDronesMusic.LOGGER.info("Registering Item Groups for " + MurderDronesMusic.MOD_ID);
    }
}
