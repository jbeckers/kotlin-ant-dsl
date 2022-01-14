/*
 * Copyright 2016 Karl Tauber
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devcharly.kotlin.ant

import org.apache.tools.ant.types.selectors.PosixPermissionsSelector

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

interface IPosixPermissionsSelectorNested {
	fun posixPermissions(
		permissions: String? = null,
		followsymlinks: Boolean? = null)
	{
		_addPosixPermissionsSelector(PosixPermissionsSelector().apply {
			_init(permissions, followsymlinks)
		})
	}

	fun _addPosixPermissionsSelector(value: PosixPermissionsSelector)
}

fun PosixPermissionsSelector._init(
	permissions: String?,
	followsymlinks: Boolean?)
{
	if (permissions != null)
		setPermissions(permissions)
	if (followsymlinks != null)
		setFollowSymlinks(followsymlinks)
}
