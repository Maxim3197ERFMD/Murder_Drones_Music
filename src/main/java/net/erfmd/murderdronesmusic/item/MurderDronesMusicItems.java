package net.erfmd.murderdronesmusic.item;

import net.erfmd.murderdronesmusic.MurderDronesMusic;
import net.erfmd.murderdronesmusic.sound.MurderDronesMusicSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class MurderDronesMusicItems {

    public static final Item MUSIC_DISC_DISASSEMBLY_REQUIRED = registerItem("music_disc_disassembly_required",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.DISASSEMBLY_REQUIRED_KEY)));
    public static final Item MUSIC_DISC_MURDER_BRINGS = registerItem("music_disc_murder_brings",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.MURDER_BRINGS_KEY)));
    public static final Item MUSIC_DISC_MURDER_DRONES = registerItem("music_disc_murder_drones",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.MURDER_DRONES_KEY)));
    public static final Item MUSIC_DISC_UZI_DOESNT_READ_THE_ASSIGNMENT = registerItem("music_disc_uzi_doesnt_read_the_assignment",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.UZI_DOESNT_READ_THE_ASSIGNMENT_KEY)));
    public static final Item MUSIC_DISC_THAD_IS_CHILL = registerItem("music_disc_thad_is_chill",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THAD_IS_CHILL_KEY)));
    public static final Item MUSIC_DISC_UZI_THE_DRONE_KILLER = registerItem("music_disc_uzi_the_drone_killer",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.UZI_THE_DRONE_KILLER_KEY)));
    public static final Item MUSIC_DISC_WHISPERS_IN_THE_SKY = registerItem("music_disc_whispers_in_the_sky",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.WHISPERS_IN_THE_SKY_KEY)));
    public static final Item MUSIC_DISC_GOTH_GIRL_ANIME_LOVER_VS_WHOLESOME_KILLER_BOY = registerItem("music_disc_goth_girl_anime_lover_vs_wholesome_killer_boy",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GOTH_GIRL_ANIME_LOVER_VS_WHOLESOME_KILLER_BOY_KEY)));
    public static final Item MUSIC_DISC_N_DISASSEMBLY_DRONES_LEADER = registerItem("music_disc_n_disassembly_drones_leader",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.N_DISASSEMBLY_DRONES_LEADER_KEY)));
    public static final Item MUSIC_DISC_V_AND_J_SEEM_NICE = registerItem("music_disc_v_and_j_seem_nice",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.V_AND_J_SEEM_NICE_KEY)));
    public static final Item MUSIC_DISC_THE_PLOT = registerItem("music_disc_the_plot",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THE_PLOT_KEY)));
    public static final Item MUSIC_DISC_GIN_RUMMY = registerItem("music_disc_gin_rummy",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GIN_RUMMY_KEY)));
    public static final Item MUSIC_DISC_THE_DAD_ENING = registerItem("music_disc_the_dad_ening",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THE_DAD_ENING_KEY)));
    public static final Item MUSIC_DISC_THE_PLOT_2_THIS_TIME_ITS_PERSONAL = registerItem("music_disc_the_plot_2_this_time_its_personal",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THE_PLOT_2_THIS_TIME_ITS_PERSONAL_KEY)));
    public static final Item MUSIC_DISC_CLICK = registerItem("music_disc_click",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.CLICK_KEY)));
    public static final Item MUSIC_DISC_THE_DAD_ENING_2_ITS_ACTUALLY_PERSONAL = registerItem("music_disc_the_dad_ening_2_its_actually_personal",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THE_DAD_ENING_2_ITS_ACTUALLY_PERSONAL_KEY)));
    public static final Item MUSIC_DISC_UZI_NEEDS_A_TIME_OUT = registerItem("music_disc_uzi_needs_a_time_out",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.UZI_NEEDS_A_TIME_OUT_KEY)));



    public static final Item MUSIC_DISC_SPOOKY_FLASHBACK_OOOOO = registerItem("music_disc_spooky_flashback_ooooo",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.SPOOKY_FLASHBACK_OOOOO_KEY)));
    public static final Item MUSIC_DISC_BUDDIES_CHILLIN = registerItem("music_disc_buddies_chillin",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.BUDDIES_CHILLIN_KEY)));
    public static final Item MUSIC_DISC_HEART_EMOJI = registerItem("music_disc_heart_emoji",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.HEART_EMOJI_KEY)));
    public static final Item MUSIC_DISC_BUDDIES_CHILLIN_BUT_OUTSIDE = registerItem("music_disc_buddies_chillin_but_outside",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.BUDDIES_CHILLIN_BUT_OUTSIDE_KEY)));
    public static final Item MUSIC_DISC_GIMME_A_HAND = registerItem("music_disc_gimme_a_hand",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GIMME_A_HAND_KEY)));
    public static final Item MUSIC_DISC_AAAAHHH = registerItem("music_disc_aaaahhh",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.AAAAHHH_KEY)));
    public static final Item MUSIC_DISC_ELDRITCH_J_XD = registerItem("music_disc_eldritch_j_xd",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.ELDRITCH_J_XD_KEY)));
    public static final Item MUSIC_DISC_DOLL = registerItem("music_disc_doll",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.DOLL_KEY)));



    public static final Item MUSIC_DISC_GIMME_AN_ARM = registerItem("music_disc_gimme_an_arm",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GIMME_AN_ARM_KEY)));
    public static final Item MUSIC_DISC_UUUGGHHH = registerItem("music_disc_uuugghhh",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.UUUGGHHH_KEY)));
    public static final Item MUSIC_DISC_DAPPER = registerItem("music_disc_dapper",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.DAPPER_KEY)));
    public static final Item MUSIC_DISC_BATHTUB = registerItem("music_disc_bathtub",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.BATHTUB_KEY)));
    public static final Item MUSIC_DISC_GET_PROMMED = registerItem("music_disc_get_prommed",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GET_PROMMED_KEY)));
    public static final Item MUSIC_DISC_THE_KNIFE_DANCE = registerItem("music_disc_the_knife_dance",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THE_KNIFE_DANCE_KEY)));
    public static final Item MUSIC_DISC_YUM_YUM = registerItem("music_disc_yum_yum",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.YUM_YUM_KEY)));
    public static final Item MUSIC_DISC_SPACE_GIRL = registerItem("music_disc_space_girl",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.SPACE_GIRL_KEY)));



    public static final Item MUSIC_DISC_RADIO = registerItem("music_disc_98.7",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.RADIO_KEY)));
    public static final Item MUSIC_DISC_CAMPING = registerItem("music_disc_camping.mp3",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.CAMPING_KEY)));
    public static final Item MUSIC_DISC_IM_CONFUSED = registerItem("music_disc_im_confused",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.IM_CONFUSED_KEY)));
    public static final Item MUSIC_DISC_LITERALLY_JUST_NOISE = registerItem("music_disc_literally_just_noise",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.LITERALLY_JUST_NOISE_KEY)));
    public static final Item MUSIC_DISC_SOLVER_UZI = registerItem("music_disc_solver_uzi",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.SOLVER_UZI_KEY)));
    public static final Item MUSIC_DISC_FALLING_FOR_YOU = registerItem("music_disc_falling_for_you",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.FALLING_FOR_YOU_KEY)));
    public static final Item MUSIC_DISC_MAGIC_SCHOOL_BUS = registerItem("music_disc_magic_school_bus",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.MAGIC_SCHOOL_BUS_KEY)));



    public static final Item MUSIC_DISC_GR_ENERGY = registerItem("music_disc_gr_energy",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GR_ENERGY_KEY)));
    public static final Item MUSIC_DISC_CRISS_CROSS_APPLE_SAUCE = registerItem("music_disc_criss_cross_apple_sauce",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.CRISS_CROSS_APPLE_SAUCE_KEY)));
    public static final Item MUSIC_DISC_THE_HUMAN_GALA = registerItem("music_disc_the_human_gala",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THE_HUMAN_GALA_KEY)));
    public static final Item MUSIC_DISC_DARKXWOLF17 = registerItem("music_disc_darkxwolf17",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.DARKXWOLF17_KEY)));
    public static final Item MUSIC_DISC_LIVE_LAUGH_LOVE = registerItem("music_disc_live_laugh_love",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.LIVE_LAUGH_LOVE_KEY)));
    public static final Item MUSIC_DISC_FRUMPLEBUCKET = registerItem("music_disc_frumplebucket",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.FRUMPLEBUCKET_KEY)));
    public static final Item MUSIC_DISC_YOU_DIDNT_HA = registerItem("music_disc_you_didnt_ha",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.YOU_DIDNT_HA_KEY)));
    public static final Item MUSIC_DISC_BOTH_VERY_SCARY = registerItem("music_disc_both_very_scary",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.BOTH_VERY_SCARY_KEY)));
    public static final Item MUSIC_DISC_GENTLE = registerItem("music_disc_gentle",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GENTLE_KEY)));



    public static final Item MUSIC_DISC_ETERNAL_DREAM = registerItem("music_disc_eternal_dream",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.ETERNAL_DREAM_KEY)));
    public static final Item MUSIC_DISC_THE_PLOT_3_IM_STILL_CONFUSED = registerItem("music_disc_the_plot_3_im_still_confused",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THE_PLOT_3_IM_STILL_CONFUSED_KEY)));
    public static final Item MUSIC_DISC_OK_YEA_THATS_PRETTY_DARK = registerItem("music_disc_ok_yea_thats_pretty_dark",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.OK_YEA_THATS_PRETTY_DARK_KEY)));
    public static final Item MUSIC_DISC_WOW_OK_THATS_PRETTY_DARK = registerItem("music_disc_wow_okay_thats_pretty_dark",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.WOW_OK_THATS_PRETTY_DARK_KEY)));
    public static final Item MUSIC_DISC_EARTH = registerItem("music_disc_earth",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.EARTH_KEY)));
    public static final Item MUSIC_DISC_SENTINAL_000D = registerItem("music_disc_sentinal_000d",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.SENTINAL_000D_KEY)));
    public static final Item MUSIC_DISC_HUGGIE_WUGGIES = registerItem("music_disc_huggie_wuggies",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.HUGGIE_WUGGIES_KEY)));
    public static final Item MUSIC_DISC_THATS_A_NICE_HALLWAY_YOU_EVER_SEE_A_HALLWAY_THAT_NICE = registerItem("music_disc_thats_a_nice_hallway_you_ever_see_a_hallway_that_nice",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.THATS_A_NICE_HALLWAY_YOU_EVER_SEE_A_HALLWAY_THAT_NICE_KEY)));
    public static final Item MUSIC_DISC_HEH_NOTHING_PERSONAL_KID = registerItem("music_disc_heh_nothing_personal_kid",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.HEH_NOTHING_PERSONAL_KID_KEY)));



    public static final Item MUSIC_DISC_MATH_AND_SCIENCE = registerItem("music_disc_math_and_science",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.MATH_AND_SCIENCE_KEY)));
    public static final Item MUSIC_DISC_GAMER_MOM = registerItem("music_disc_gamer_mom",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.GAMER_MOM_KEY)));
    public static final Item MUSIC_DISC_WHEN_YOU_FORGET_TO_PLAY = registerItem("music_disc_when_you_forget_to_pray",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.WHEN_YOU_FORGET_TO_PLAY_KEY)));
    public static final Item MUSIC_DISC_IPOD_4TH_GEN = registerItem("music_disc_ipod_4th_gen",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.IPOD_4TH_GEN_KEY)));
    public static final Item MUSIC_DISC_HEY_GUYS_JUST_WANTED_TO_SAY_WHATS_UP = registerItem("music_disc_hey_guys_just_wanted_to_say_whats_up",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.HEY_GUYS_JUST_WANTED_TO_SAY_WHATS_UP_KEY)));
    public static final Item MUSIC_DISC_RUN = registerItem("music_disc_run",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.RUN_KEY)));
    public static final Item MUSIC_DISC_UR_AIGHT = registerItem("music_disc_ur_aight",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.UR_AIGHT_KEY)));
    public static final Item MUSIC_DISC_NORI = registerItem("music_disc_nori",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.NORI_KEY)));
    public static final Item MUSIC_DISC_DOLL_WARN = registerItem("music_disc_doll_warn",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.DOLL_WARN_KEY)));
    public static final Item MUSIC_DISC_YOURE_FREAKIN_GROUNDED = registerItem("music_disc_youre_freakin_grounded",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.YOURE_FREAKIN_GROUNDED_KEY)));
    public static final Item MUSIC_DISC_HAND_OUT = registerItem("music_disc_hand_out",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.HAND_OUT_KEY)));
    public static final Item MUSIC_DISC_ABSOLUTE_SOLVER = registerItem("music_disc_absolute_solver",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.ABSOLUTE_SOLVER_KEY)));
    public static final Item MUSIC_DISC_DIE_MAD = registerItem("music_disc_die_mad",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.DIE_MAD_KEY)));



    public static final Item MUSIC_DISC_IF_U_A_LIL_B = registerItem("music_disc_if_u_a_lil_b",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.IF_U_A_LIL_B_KEY)));
    public static final Item MUSIC_DISC_FALLING_WITH_YOU = registerItem("music_disc_falling_with_you",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.FALLING_WITH_YOU_KEY)));
    public static final Item MUSIC_DISC_ETERNAL_DESTROYER = registerItem("music_disc_eternal_destroyer",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.ETERNAL_DESTROYER_KEY)));
    public static final Item MUSIC_DISC_UZI_AND_N_THE_DRONE_KILLERS = registerItem("music_disc_uzi_and_n_the_drone_killers",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.UZI_AND_N_THE_DRONE_KILLERS_KEY)));
    public static final Item MUSIC_DISC_SYS_CYN_CALLBACKPING_UZI = registerItem("music_disc_sys_cyn_callbackping_uzi",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.SYS_CYN_CALLBACKPING_UZI_KEY)));
    public static final Item MUSIC_DISC_K = registerItem("music_disc_k",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.K_KEY)));
    public static final Item MUSIC_DISC_BITE_ME = registerItem("music_disc_bite_me",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.BITE_ME_KEY)));
    public static final Item MUSIC_DISC_HAHA_YEA_DUDE_THATS_SICK = registerItem("music_disc_haha_yea_dude_thats_sick",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.HAHA_YEA_DUDE_THATS_SICK_KEY)));
    public static final Item MUSIC_DISC_FOREVER = registerItem("music_disc_forever",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.FOREVER_KEY)));
    public static final Item MUSIC_DISC_BITE_ME_NORMAL_PITCH = registerItem("music_disc_bite_me_normal_pitch",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.BITE_ME_NORMAL_PITCH_KEY)));
    public static final Item MUSIC_DISC_BITE_ME_NIGHTCORED_AGAIN = registerItem("music_disc_bite_me_nightcored_again",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.BITE_ME_NIGHTCORED_AGAIN_KEY)));



    public static final Item MUSIC_DISC_FOREVER_FULL_VERSION = registerItem("music_disc_forever_full",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.FOREVER_FULL_VERSION_KEY)));
    public static final Item MUSIC_DISC_FIGHT_TIL_IM_GOOD_ENOUGH = registerItem("music_disc_fight_til_im_good_enough",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.FIGHT_TIL_IM_GOOD_ENOUGH_KEY)));
    public static final Item MUSIC_DISC_STARGAZING_WITH_MURDEROUS_DRONE_INTENT = registerItem("music_disc_stargazing_with_murderous_drone_intent",
            new Item((new Item.Settings()).maxCount(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(MurderDronesMusicSounds.STARGAZING_WITH_MURDEROUS_DRONE_INTENT_KEY)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MurderDronesMusic.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MurderDronesMusic.LOGGER.info("Registering Mod Items for " + MurderDronesMusic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {});
    }
}
