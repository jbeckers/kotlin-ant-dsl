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

import org.apache.tools.ant.taskdefs.Untar
import org.apache.tools.ant.types.PatternSet
import org.apache.tools.ant.types.ResourceCollection
import org.apache.tools.ant.util.FileNameMapper

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

fun Ant.untar(
	src: String? = null,
	dest: String? = null,
	overwrite: Boolean? = null,
	compression: UntarCompressionMethod? = null,
	encoding: String? = null,
	failonemptyarchive: Boolean? = null,
	stripabsolutepathspec: Boolean? = null,
	scanforunicodeextrafields: Boolean? = null,
	allowfilestoescapedest: Boolean? = null,
	nested: (KUntar.() -> Unit)? = null)
{
	Untar().execute("untar") { task ->
		if (src != null)
			task.setSrc(project.resolveFile(src))
		if (dest != null)
			task.setDest(project.resolveFile(dest))
		if (overwrite != null)
			task.setOverwrite(overwrite)
		if (compression != null)
			task.setCompression(Untar.UntarCompressionMethod().apply { this.value = compression.value })
		if (encoding != null)
			task.setEncoding(encoding)
		if (failonemptyarchive != null)
			task.setFailOnEmptyArchive(failonemptyarchive)
		if (stripabsolutepathspec != null)
			task.setStripAbsolutePathSpec(stripabsolutepathspec)
		if (scanforunicodeextrafields != null)
			task.setScanForUnicodeExtraFields(scanforunicodeextrafields)
		if (allowfilestoescapedest != null)
			task.setAllowFilesToEscapeDest(allowfilestoescapedest)
		if (nested != null)
			nested(KUntar(task))
	}
}

class KUntar(override val component: Untar) :
	IFileNameMapperNested,
	IResourceCollectionNested,
	IPatternSetNested
{
	override fun _addFileNameMapper(value: FileNameMapper) = component.add(value)
	override fun _addResourceCollection(value: ResourceCollection) = component.add(value)
	override fun _addPatternSet(value: PatternSet) = component.addPatternset(value)
}

enum class UntarCompressionMethod(val value: String) { NONE("none"), GZIP("gzip"), BZIP2("bzip2"), XZ("xz") }
