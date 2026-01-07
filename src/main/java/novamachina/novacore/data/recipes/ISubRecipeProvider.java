package novamachina.novacore.data.recipes;

import net.minecraft.core.HolderGetter;
import net.minecraft.data.recipes.RecipeOutput;

public interface ISubRecipeProvider {
  void addRecipes(RecipeOutput consumer);

  // This is for 1.21.3+
  // void addRecipes(HolderGetter.Provider holderGetter, RecipeOutput consumer);
}
