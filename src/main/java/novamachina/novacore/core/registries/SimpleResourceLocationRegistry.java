package novamachina.novacore.core.registries;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class SimpleResourceLocationRegistry extends AbstractRegistry<ResourceLocation> {
// This is for 1.21.3+
// public class SimpleResourceLocationRegistry extends AbstractRegistry<ResourceLocation, Object> {
  public SimpleResourceLocationRegistry(String modId) {
    super(modId);
    // This is for 1.21.3+
    // super(modId, null);
  }

  // This is added when upgrading to 1.21.3+
  // @Override
  // public ResourceKey<Object> key(String name) {
  //   throw new UnsupportedOperationException();
  // }

  public ResourceLocation register(String shortId) {
    ResourceLocation statResourceLocation = id(shortId);
    this.register(statResourceLocation);
    return statResourceLocation;
  }
}
