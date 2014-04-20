package com.geowebcommon.store;


import java.util.Map;

public interface Store extends UserStore, DeviceStore,
		DeviceLocationHistoryStore {

	/**
	 * Returns a summary of devices as in following format.
	 * 
	 * Total devices, and count. Working devices, and count. Failed devices, and
	 * count. Critical devices, and count. (Devices which need charge).
	 * 
	 * This function is used to show a quick summary to the user.
	 * 
	 * @return
	 */
	Map<String, Integer> getDevicesSummary(String userId);
}
