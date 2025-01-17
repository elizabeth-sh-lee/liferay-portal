/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.runtime.util;

import com.liferay.portal.kernel.exception.DuplicateRoleException;
import com.liferay.portal.kernel.exception.NoSuchRoleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.LocaleUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author Michael C. Han
 */
public class RoleUtil {

	public static Role getRole(
			String name, int roleType, boolean autoCreate,
			ServiceContext serviceContext)
		throws PortalException {

		Role role = null;

		try {
			role = RoleLocalServiceUtil.getRole(
				serviceContext.getCompanyId(), name);

			if (role.getType() != roleType) {
				throw new DuplicateRoleException(
					"Role already exists with name " + name);
			}
		}
		catch (NoSuchRoleException noSuchRoleException) {
			if (!autoCreate) {
				throw noSuchRoleException;
			}

			Map<Locale, String> descriptionMap = HashMapBuilder.put(
				LocaleUtil.getDefault(),
				"This is an autogenerated role from the workflow definition."
			).build();

			role = RoleLocalServiceUtil.addRole(
				serviceContext.getUserId(), null, 0, name, null, descriptionMap,
				roleType, null, null);
		}

		return role;
	}

	public static List<Long> getRoleIds(ServiceContext serviceContext) {
		List<Role> roles = RoleLocalServiceUtil.getUserRoles(
			serviceContext.getUserId());

		List<Long> roleIds = new ArrayList<>(roles.size());

		for (Role role : roles) {
			roleIds.add(role.getRoleId());
		}

		return roleIds;
	}

	public static int getRoleType(String roleType) {
		if (roleType.equals(RoleConstants.TYPE_ORGANIZATION_LABEL)) {
			return RoleConstants.TYPE_ORGANIZATION;
		}
		else if (roleType.equals(RoleConstants.TYPE_SITE_LABEL) ||
				 roleType.equals(_LEGACY_TYPE_COMMUNITY_LABEL)) {

			return RoleConstants.TYPE_SITE;
		}

		return RoleConstants.TYPE_REGULAR;
	}

	private static final String _LEGACY_TYPE_COMMUNITY_LABEL = "community";

}