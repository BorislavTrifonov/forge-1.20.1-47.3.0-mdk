package net.boro.tutorialmod.item;

import net.boro.tutorialmod.TutorialMod;
import net.boro.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //items
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        //blocks
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CUSTOM_FOODS = CREATIVE_MODE_TABS.register("custom_foods_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FRIED_RICE.get()))
                    .title(Component.translatable("creativetab.custom_foods_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //items
                        pOutput.accept(ModItems.FRIED_RICE.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MORE_TYPES_OF_WOOD = CREATIVE_MODE_TABS.register("more_types_of_wood_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ROSEWOOD_PLANKS.get()))
                    .title(Component.translatable("creativetab.more_types_of_wood_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //blocks
                        pOutput.accept(ModBlocks.ROSEWOOD_PLANKS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}

