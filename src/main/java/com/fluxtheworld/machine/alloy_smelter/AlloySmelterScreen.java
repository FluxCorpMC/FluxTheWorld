package com.fluxtheworld.machine.alloy_smelter;

import com.fluxtheworld.core.gui.screen.MachineScreen;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class AlloySmelterScreen extends MachineScreen<AlloySmelterMenu> {

  public AlloySmelterScreen(AlloySmelterMenu menu, Inventory playerInventory, Component title) {
    super(menu, playerInventory, title);
  }

}
