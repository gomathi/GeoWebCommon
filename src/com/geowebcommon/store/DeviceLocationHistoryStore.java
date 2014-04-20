package com.geowebcommon.store;


import java.util.Iterator;

import com.geoweb.entities.DeviceLocationInfo;

/**
 * 
 * @author goms
 * 
 */

public interface DeviceLocationHistoryStore {

	/**
	 * Returns major locations where device has stayed for longer period of time.
	 * The results are supposed to be returned with latest ones on the top.
	 * 
	 * @param deviceId
	 * @return
	 */
	Iterator<DeviceLocationInfo> getDeviceLocationHistory(String deviceId);

}
