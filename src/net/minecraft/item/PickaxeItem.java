package net.minecraft.item;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;

public class PickaxeItem extends ToolItem {
   private static final Set<Block> DIGGABLES = ImmutableSet.of(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.POWERED_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.NETHER_GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.BLUE_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.CHISELED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.GRANITE, Blocks.POLISHED_GRANITE, Blocks.DIORITE, Blocks.POLISHED_DIORITE, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, Blocks.STONE_SLAB, Blocks.SMOOTH_STONE_SLAB, Blocks.SANDSTONE_SLAB, Blocks.PETRIFIED_OAK_SLAB, Blocks.COBBLESTONE_SLAB, Blocks.BRICK_SLAB, Blocks.STONE_BRICK_SLAB, Blocks.NETHER_BRICK_SLAB, Blocks.QUARTZ_SLAB, Blocks.RED_SANDSTONE_SLAB, Blocks.PURPUR_SLAB, Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_STONE, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB, Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.END_STONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_QUARTZ_SLAB, Blocks.GRANITE_SLAB, Blocks.ANDESITE_SLAB, Blocks.RED_NETHER_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB, Blocks.DIORITE_SLAB, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX, Blocks.PISTON, Blocks.STICKY_PISTON, Blocks.PISTON_HEAD);

   protected PickaxeItem(IItemTier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Item.Properties p_i48478_4_) {
      super((float)p_i48478_2_, p_i48478_3_, p_i48478_1_, DIGGABLES, p_i48478_4_);
   }

   public boolean isCorrectToolForDrops(BlockState p_150897_1_) {
      int i = this.getTier().getLevel();
      if (!p_150897_1_.is(Blocks.OBSIDIAN) && !p_150897_1_.is(Blocks.CRYING_OBSIDIAN) && !p_150897_1_.is(Blocks.NETHERITE_BLOCK) && !p_150897_1_.is(Blocks.RESPAWN_ANCHOR) && !p_150897_1_.is(Blocks.ANCIENT_DEBRIS)) {
         if (!p_150897_1_.is(Blocks.DIAMOND_BLOCK) && !p_150897_1_.is(Blocks.DIAMOND_ORE) && !p_150897_1_.is(Blocks.EMERALD_ORE) && !p_150897_1_.is(Blocks.EMERALD_BLOCK) && !p_150897_1_.is(Blocks.GOLD_BLOCK) && !p_150897_1_.is(Blocks.GOLD_ORE) && !p_150897_1_.is(Blocks.REDSTONE_ORE)) {
            if (!p_150897_1_.is(Blocks.IRON_BLOCK) && !p_150897_1_.is(Blocks.IRON_ORE) && !p_150897_1_.is(Blocks.LAPIS_BLOCK) && !p_150897_1_.is(Blocks.LAPIS_ORE)) {
               Material material = p_150897_1_.getMaterial();
               return material == Material.STONE || material == Material.METAL || material == Material.HEAVY_METAL || p_150897_1_.is(Blocks.NETHER_GOLD_ORE);
            } else {
               return i >= 1;
            }
         } else {
            return i >= 2;
         }
      } else {
         return i >= 3;
      }
   }

   public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
      Material material = p_150893_2_.getMaterial();
      return material != Material.METAL && material != Material.HEAVY_METAL && material != Material.STONE ? super.getDestroySpeed(p_150893_1_, p_150893_2_) : this.speed;
   }
}