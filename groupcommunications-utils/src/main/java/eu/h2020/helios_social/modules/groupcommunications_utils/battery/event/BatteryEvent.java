package eu.h2020.helios_social.modules.groupcommunications_utils.battery.event;

import eu.h2020.helios_social.modules.groupcommunications_utils.sync.event.Event;

/**
 * An event that is broadcast when the device starts or stops charging.
 */
public class BatteryEvent extends Event {

	private final boolean charging;

	public BatteryEvent(boolean charging) {
		this.charging = charging;
	}

	public boolean isCharging() {
		return charging;
	}
}
