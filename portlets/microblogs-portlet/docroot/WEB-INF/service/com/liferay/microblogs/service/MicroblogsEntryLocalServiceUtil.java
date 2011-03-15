/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.microblogs.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the microblogs entry local service. This utility wraps {@link com.liferay.microblogs.service.impl.MicroblogsEntryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MicroblogsEntryLocalService
 * @see com.liferay.microblogs.service.base.MicroblogsEntryLocalServiceBaseImpl
 * @see com.liferay.microblogs.service.impl.MicroblogsEntryLocalServiceImpl
 * @generated
 */
public class MicroblogsEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.microblogs.service.impl.MicroblogsEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the microblogs entry to the database. Also notifies the appropriate model listeners.
	*
	* @param microblogsEntry the microblogs entry to add
	* @return the microblogs entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.microblogs.model.MicroblogsEntry addMicroblogsEntry(
		com.liferay.microblogs.model.MicroblogsEntry microblogsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMicroblogsEntry(microblogsEntry);
	}

	/**
	* Creates a new microblogs entry with the primary key. Does not add the microblogs entry to the database.
	*
	* @param microblogsEntryId the primary key for the new microblogs entry
	* @return the new microblogs entry
	*/
	public static com.liferay.microblogs.model.MicroblogsEntry createMicroblogsEntry(
		long microblogsEntryId) {
		return getService().createMicroblogsEntry(microblogsEntryId);
	}

	/**
	* Deletes the microblogs entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param microblogsEntryId the primary key of the microblogs entry to delete
	* @throws PortalException if a microblogs entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteMicroblogsEntry(long microblogsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteMicroblogsEntry(microblogsEntryId);
	}

	/**
	* Deletes the microblogs entry from the database. Also notifies the appropriate model listeners.
	*
	* @param microblogsEntry the microblogs entry to delete
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteMicroblogsEntry(
		com.liferay.microblogs.model.MicroblogsEntry microblogsEntry)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteMicroblogsEntry(microblogsEntry);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the microblogs entry with the primary key.
	*
	* @param microblogsEntryId the primary key of the microblogs entry to get
	* @return the microblogs entry
	* @throws PortalException if a microblogs entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.microblogs.model.MicroblogsEntry getMicroblogsEntry(
		long microblogsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMicroblogsEntry(microblogsEntryId);
	}

	/**
	* Gets a range of all the microblogs entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of microblogs entries to return
	* @param end the upper bound of the range of microblogs entries to return (not inclusive)
	* @return the range of microblogs entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.microblogs.model.MicroblogsEntry> getMicroblogsEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMicroblogsEntries(start, end);
	}

	/**
	* Gets the number of microblogs entries.
	*
	* @return the number of microblogs entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getMicroblogsEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMicroblogsEntriesCount();
	}

	/**
	* Updates the microblogs entry in the database. Also notifies the appropriate model listeners.
	*
	* @param microblogsEntry the microblogs entry to update
	* @return the microblogs entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.microblogs.model.MicroblogsEntry updateMicroblogsEntry(
		com.liferay.microblogs.model.MicroblogsEntry microblogsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMicroblogsEntry(microblogsEntry);
	}

	/**
	* Updates the microblogs entry in the database. Also notifies the appropriate model listeners.
	*
	* @param microblogsEntry the microblogs entry to update
	* @param merge whether to merge the microblogs entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the microblogs entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.microblogs.model.MicroblogsEntry updateMicroblogsEntry(
		com.liferay.microblogs.model.MicroblogsEntry microblogsEntry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMicroblogsEntry(microblogsEntry, merge);
	}

	public static com.liferay.microblogs.model.MicroblogsEntry addMicroblogsEntry(
		long userId, java.lang.String content, int type, long receiverUserId,
		long receiverEntryId, int socialRelationType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addMicroblogsEntry(userId, content, type, receiverUserId,
			receiverEntryId, socialRelationType, serviceContext);
	}

	public static void addMicroblogsEntryResources(
		com.liferay.microblogs.model.MicroblogsEntry microblogsEntry)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().addMicroblogsEntryResources(microblogsEntry);
	}

	public static void deleteUserMicroblogsEntries(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserMicroblogsEntries(userId);
	}

	public static java.util.List<com.liferay.microblogs.model.MicroblogsEntry> getCompanyMicroblogsEntries(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyMicroblogsEntries(companyId, start, end);
	}

	public static int getCompanyMicroblogsEntriesCount(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyMicroblogsEntriesCount(companyId);
	}

	public static java.util.List<com.liferay.microblogs.model.MicroblogsEntry> getEntryMicroblogsEntriesByType(
		int type, long receiverEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEntryMicroblogsEntriesByType(type, receiverEntryId,
			start, end);
	}

	public static int getEntryMicroblogsEntriesCountByType(int type,
		long receiverEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEntryMicroblogsEntriesCountByType(type, receiverEntryId);
	}

	public static java.util.List<com.liferay.microblogs.model.MicroblogsEntry> getReceiverMicroblogsEntriesByType(
		int type, long receiverUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getReceiverMicroblogsEntriesByType(type, receiverUserId,
			start, end);
	}

	public static int getRecieverMicroblogsEntriesCountByType(int type,
		long receiverUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getRecieverMicroblogsEntriesCountByType(type, receiverUserId);
	}

	public static java.util.List<com.liferay.microblogs.model.MicroblogsEntry> getUserMicroblogsEntries(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserMicroblogsEntries(userId, start, end);
	}

	public static int getUserMicroblogsEntriesCount(long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserMicroblogsEntriesCount(userId);
	}

	public static java.util.List<com.liferay.microblogs.model.MicroblogsEntry> getUserMicroblogsEntriesByType(
		long userId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getUserMicroblogsEntriesByType(userId, type, start, end);
	}

	public static int getUserMicroblogsEntriesCountByType(long userId, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserMicroblogsEntriesCountByType(userId, type);
	}

	public static java.util.List<com.liferay.microblogs.model.MicroblogsEntry> getUsersMicroblogsEntries(
		long[] userIds, long viewerUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getUsersMicroblogsEntries(userIds, viewerUserId, start, end);
	}

	public static int getUsersMicroblogsEntriesCount(long[] userIds,
		long viewerUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUsersMicroblogsEntriesCount(userIds, viewerUserId);
	}

	public static com.liferay.microblogs.model.MicroblogsEntry updateMicroblogsEntry(
		long microblogsEntryId, java.lang.String content,
		int socialRelationType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateMicroblogsEntry(microblogsEntryId, content,
			socialRelationType, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static MicroblogsEntryLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MicroblogsEntryLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					MicroblogsEntryLocalService.class.getName(),
					portletClassLoader);

			_service = new MicroblogsEntryLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(MicroblogsEntryLocalServiceUtil.class,
				"_service");
			MethodCache.remove(MicroblogsEntryLocalService.class);
		}

		return _service;
	}

	public void setService(MicroblogsEntryLocalService service) {
		MethodCache.remove(MicroblogsEntryLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(MicroblogsEntryLocalServiceUtil.class,
			"_service");
		MethodCache.remove(MicroblogsEntryLocalService.class);
	}

	private static MicroblogsEntryLocalService _service;
}