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

import org.apache.tools.ant.types.FileList.FileName

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

interface IFileNameNested : INestedComponent {
	fun filename(
		name: String? = null)
	{
		_addFileName(FileName().apply {
			component.project.setProjectReference(this);
			_init(name)
		})
	}

	fun _addFileName(value: FileName)
}

fun FileName._init(
	name: String?)
{
	if (name != null)
		setName(name)
}
