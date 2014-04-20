package com.geoweb.entities;

/**
 * 
 * @author goms
 * 
 */

public class DeviceInfo {

	private final String deviceId;
	private final String name;

	public DeviceInfo(final String deviceId, final String name) {
		this.deviceId = deviceId;
		this.name = name;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public String getName() {
		return name;
	}

}
