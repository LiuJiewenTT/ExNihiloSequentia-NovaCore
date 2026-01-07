package novamachina.novacore.core.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;

public class SoundEventRegistry extends AbstractRegistry<SoundEvent> {
// This is for 1.21.3+
// public class SoundEventRegistry extends AbstractRegistry<SoundEvent, SoundEvent> {

  public SoundEventRegistry(String modId) {
    super(modId);
    // This is for 1.21.3+
    // super(modId, Registries.SOUND_EVENT);
  }

  public SoundEvent soundEvent(String shortId) {
    SoundEvent event = SoundEvent.createVariableRangeEvent(id(shortId));
    this.register(event);
    return event;
  }
}
