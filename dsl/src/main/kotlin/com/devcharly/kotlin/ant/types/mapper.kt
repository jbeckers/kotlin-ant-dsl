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

import org.apache.tools.ant.types.Mapper
import org.apache.tools.ant.types.Path
import org.apache.tools.ant.types.Reference
import org.apache.tools.ant.util.FileNameMapper

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

interface IMapperNested : INestedComponent {
	fun mapper(
		type: MapperType? = null,
		classname: String? = null,
		classpath: String? = null,
		classpathref: String? = null,
		from: String? = null,
		to: String? = null,
		nested: (KMapper.() -> Unit)? = null)
	{
		_addMapper(Mapper(component.project).apply {
			component.project.setProjectReference(this);
			_init(type, classname, classpath, classpathref,
				from, to, nested)
		})
	}

	fun _addMapper(value: Mapper)
}

fun Mapper._init(
	type: MapperType?,
	classname: String?,
	classpath: String?,
	classpathref: String?,
	from: String?,
	to: String?,
	nested: (KMapper.() -> Unit)?)
{
	if (type != null)
		setType(Mapper.MapperType().apply { this.value = type.value })
	if (classname != null)
		setClassname(classname)
	if (classpath != null)
		setClasspath(Path(project, classpath))
	if (classpathref != null)
		setClasspathRef(Reference(project, classpathref))
	if (from != null)
		setFrom(from)
	if (to != null)
		setTo(to)
	if (nested != null)
		nested(KMapper(this))
}

class KMapper(val component: Mapper) :
	IFileNameMapperNested
{
	fun classpath(location: String? = null, path: String? = null, cache: Boolean? = null, nested: (KPath.() -> Unit)? = null) {
		component.createClasspath().apply {
			component.project.setProjectReference(this)
			_init(location, path, cache, nested)
		}
	}
	override fun _addFileNameMapper(value: FileNameMapper) = component.addConfigured(value)
}

enum class MapperType(val value: String) { IDENTITY("identity"), FLATTEN("flatten"), GLOB("glob"), MERGE("merge"), REGEXP("regexp"), PACKAGE("package"), UNPACKAGE("unpackage") }
