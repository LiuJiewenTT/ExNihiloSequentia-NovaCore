package novamachina.novacore.world.item.crafting;

import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
// import net.minecraft.world.item.crafting.PlacementInfo;        // This is for 1.21.3+
import net.minecraft.world.item.crafting.Recipe;
// import net.minecraft.world.item.crafting.RecipeBookCategories; // This is for 1.21.3+
// import net.minecraft.world.item.crafting.RecipeBookCategory;   // This is for 1.21.3+
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.level.Level;

public abstract class AbstractRecipe implements Recipe<RecipeInput> {

  @Override
  public boolean matches(RecipeInput pContainer, Level pLevel) {
    return false;
  }

  @Override
  public ItemStack assemble(RecipeInput pContainer, HolderLookup.Provider provider) {
    return ItemStack.EMPTY;
  }

  @Override
  public boolean canCraftInDimensions(int pWidth, int pHeight) {
    return true;
  }

  // This is for 1.21.3+
  // @Override
  // public PlacementInfo placementInfo() {
  //   return PlacementInfo.NOT_PLACEABLE;
  // }

  @Override
  public ItemStack getResultItem(HolderLookup.Provider provider) {
    return ItemStack.EMPTY;
  }

  // This is for 1.21.3+
  // @Override
  // public RecipeBookCategory recipeBookCategory() {
  //   return RecipeBookCategories.CRAFTING_MISC;
  // }
}
