package novamachina.novacore.core.registries;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public abstract class AbstractRegistry<T> {
// public abstract class AbstractRegistry<T, K> { // This is for 1.21.3+
  private final List<T> registry = new ArrayList<>();
  private final String modId;

  // This added when upgrading to 1.21.3+
  // private final ResourceKey<? extends Registry<K>> registryKey;

  protected AbstractRegistry(String modId) {
    this.modId = modId;
  }

  // This is for 1.21.3+
  // protected AbstractRegistry(String modId, ResourceKey<? extends Registry<K>> registryKey) {
  //   this.modId = modId;
  //   this.registryKey = registryKey;
  // }

  protected ResourceLocation id(String name) {
  // public ResourceLocation id(String name) {  // This is for 1.21.3+
    return ResourceLocation.fromNamespaceAndPath(this.modId, name);
  }

  // This is added when upgrading to 1.21.3+
  // public ResourceKey<K> key(String name) {
  //   return ResourceKey.create(registryKey, id(name));
  // }

  protected void register(T registryObject) {
    this.registry.add(registryObject);
  }

  public List<T> getRegistry() {
    return this.registry;
  }
}
