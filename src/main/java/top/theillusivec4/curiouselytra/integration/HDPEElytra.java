package top.theillusivec4.curiouselytra.integration;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import top.theillusivec4.caelus.api.RenderElytraEvent;

public class HDPEElytra implements ICustomElytra {

  private static final ResourceLocation HDPE_ELYTRA =
      new ResourceLocation("mekanism:hdpe_elytra");

  @Override
  public boolean attachCapability(ItemStack stack) {
    return matches(stack, HDPE_ELYTRA);
  }

  @Override
  public boolean renderElytra(ItemStack stack, RenderElytraEvent evt) {

    if (matches(stack, HDPE_ELYTRA)) {
      evt.setResourceLocation(
          new ResourceLocation("mekanism:textures/entity/hdpe_elytra.png"));
      return true;
    }
    return false;
  }
}
