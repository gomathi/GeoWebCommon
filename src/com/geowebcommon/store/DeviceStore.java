package com.geowebcommon.store;


import java.util.List;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.entities.DeviceTemperatureInfo;

/**
 * 
 * @author goms
 * 
 */
public interface DeviceStore {

	/**
	 * Registers a new device for the user.
	 * 
	 * @param userId
	 *            , The ownerId of the device
	 * @param deviceId
	 *            , DeviceId is unique and pre-generated.
	 * @param name
	 *            , A custom name that is given by the user.
	 * 
	 * @return
	 */
	boolean addDevice(final String userId, final String deviceId,
			final String name);

	/**
	 * Given the deviceId returns the deviceInfo.
	 * 
	 * @param userId
	 * @param deviceId
	 * @return
	 */

	DeviceInfo getDeviceInfo(final String userId, final String deviceId);

	/**
	 * @param currUserId
	 * @param newUserId
	 * @param deviceId
	 * @return
	 */
	boolean updateDeviceOwner(final String currUserId, final String newUserId,
			final String deviceId);

	/**
	 * 
	 * @param userId
	 * @param name
	 * @param deviceId
	 * @return
	 */
	boolean updateDeviceInfo(final String userId, final String name,
			final String deviceId);

	/**
	 * 
	 * @param userId
	 * @return
	 */
	List<DeviceInfo> getAllDevicesFor(String userId);

	/**
	 * 
	 * @param userId
	 * @param deviceId
	 * @return
	 */
	DeviceBatteryInfo getDeviceBatteryInfo(final String userId,
			final String deviceId);

	/**
	 * 
	 * @param userId
	 * @param deviceId
	 * @param searchPat
	 * @return
	 */
	List<DeviceInfo> getDeviceBatteryInfo(final String userId,
			final String deviceId, final String searchPat);

	/**
	 * 
	 * @param userId
	 * @param deviceId
	 * @param batteryLevel
	 * 
	 * @return
	 */
	boolean updateDeviceBatteryInfo(final String userId, final String deviceId,
			final float batteryLevel);

	/**
	 * 
	 * @param userId
	 * @param deviceId
	 * @return
	 */
	DeviceTemperatureInfo getDeviceTemperatureInfo(final String userId,
			final String deviceId);

	/**
	 * 
	 * @param userId
	 * @param deviceId
	 * @param deviceTempLevel
	 * 
	 * @return
	 */
	boolean updateDeviceTemperatureInfo(final String userId,
			final String deviceId, final float deviceTempLevel);

}
