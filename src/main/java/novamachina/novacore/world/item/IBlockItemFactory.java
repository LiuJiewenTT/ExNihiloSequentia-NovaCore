package novamachina.novacore.world.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public interface IBlockItemFactory {
  BlockItem blockItem(Block block, Item.Properties properties);

  // This is removed when upgrading to 1.21.3+
  BlockItem burnableBlockItem(Block block, Item.Properties properties, int burnTime);
}
