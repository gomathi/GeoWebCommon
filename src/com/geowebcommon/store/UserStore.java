package com.geowebcommon.store;
/**
 * 
 */


import java.util.List;
import java.util.Map;

/**
 * @author goms
 * 
 */
public interface UserStore {

	/**
	 * 
	 * @param userId
	 * @param password
	 * @return
	 */
	boolean addUser(final String userId, final String password);

	/**
	 * 
	 * @param userId
	 * @return
	 */
	boolean removeUser(final String userId);

	/**
	 * 
	 * @param userId
	 * @param password
	 * @return
	 */
	boolean validateUser(final String userId, final String password);

	/**
	 * 
	 * @param phoneNos
	 * @return
	 */
	Map<String, Boolean> sendAlertMessagesTo(final String userId,
			final List<String> phoneNos);
}
