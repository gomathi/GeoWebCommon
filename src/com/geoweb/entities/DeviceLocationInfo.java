/**
 * 
 */
package com.geoweb.entities;

/**
 * @author goms
 * 
 */
public class DeviceLocationInfo {

	private final long lat, lon;
	private final String usableName;
	private final long timeStamp;

	public DeviceLocationInfo(final long lat, final long lon,
			final String usableName, final long timeStamp) {
		this.lat = lat;
		this.lon = lon;
		this.usableName = usableName;
		this.timeStamp = timeStamp;
	}

	public long getLat() {
		return lat;
	}

	public long getLon() {
		return lon;
	}

	public String getUsableName() {
		return usableName;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

}
