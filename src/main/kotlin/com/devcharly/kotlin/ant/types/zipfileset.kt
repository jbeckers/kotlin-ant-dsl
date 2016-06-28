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

import org.apache.tools.ant.types.Resource
import org.apache.tools.ant.types.ResourceCollection
import org.apache.tools.ant.types.ZipFileSet
import org.apache.tools.ant.types.selectors.FileSelector

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

interface IZipFileSetNested : INestedComponent {
	fun zipfileset(
		file: String? = null,
		includes: String? = null,
		excludes: String? = null,
		includesfile: String? = null,
		excludesfile: String? = null,
		defaultexcludes: Boolean? = null,
		casesensitive: Boolean? = null,
		followsymlinks: Boolean? = null,
		maxlevelsofsymlinks: Int? = null,
		erroronmissingdir: Boolean? = null,
		dir: String? = null,
		src: String? = null,
		srcresource: String? = null,
		erroronmissingarchive: Boolean? = null,
		prefix: String? = null,
		fullpath: String? = null,
		encoding: String? = null,
		filemode: String? = null,
		dirmode: String? = null,
		nested: (KZipFileSet.() -> Unit)? = null)
	{
		_addZipFileSet(ZipFileSet().apply {
			component.project.setProjectReference(this);
			_init(file, includes, excludes, includesfile,
				excludesfile, defaultexcludes, casesensitive, followsymlinks,
				maxlevelsofsymlinks, erroronmissingdir, dir, src,
				srcresource, erroronmissingarchive, prefix, fullpath,
				encoding, filemode, dirmode, nested)
		})
	}

	fun _addZipFileSet(value: ZipFileSet)
}

fun IFileSetNested.zipfileset(
	file: String? = null,
	includes: String? = null,
	excludes: String? = null,
	includesfile: String? = null,
	excludesfile: String? = null,
	defaultexcludes: Boolean? = null,
	casesensitive: Boolean? = null,
	followsymlinks: Boolean? = null,
	maxlevelsofsymlinks: Int? = null,
	erroronmissingdir: Boolean? = null,
	dir: String? = null,
	src: String? = null,
	srcresource: String? = null,
	erroronmissingarchive: Boolean? = null,
	prefix: String? = null,
	fullpath: String? = null,
	encoding: String? = null,
	filemode: String? = null,
	dirmode: String? = null,
	nested: (KZipFileSet.() -> Unit)? = null)
{
	_addFileSet(ZipFileSet().apply {
		component.project.setProjectReference(this);
		_init(file, includes, excludes, includesfile,
			excludesfile, defaultexcludes, casesensitive, followsymlinks,
			maxlevelsofsymlinks, erroronmissingdir, dir, src,
			srcresource, erroronmissingarchive, prefix, fullpath,
			encoding, filemode, dirmode, nested)
	})
}

fun IResourceCollectionNested.zipfileset(
	file: String? = null,
	includes: String? = null,
	excludes: String? = null,
	includesfile: String? = null,
	excludesfile: String? = null,
	defaultexcludes: Boolean? = null,
	casesensitive: Boolean? = null,
	followsymlinks: Boolean? = null,
	maxlevelsofsymlinks: Int? = null,
	erroronmissingdir: Boolean? = null,
	dir: String? = null,
	src: String? = null,
	srcresource: String? = null,
	erroronmissingarchive: Boolean? = null,
	prefix: String? = null,
	fullpath: String? = null,
	encoding: String? = null,
	filemode: String? = null,
	dirmode: String? = null,
	nested: (KZipFileSet.() -> Unit)? = null)
{
	_addResourceCollection(ZipFileSet().apply {
		component.project.setProjectReference(this);
		_init(file, includes, excludes, includesfile,
			excludesfile, defaultexcludes, casesensitive, followsymlinks,
			maxlevelsofsymlinks, erroronmissingdir, dir, src,
			srcresource, erroronmissingarchive, prefix, fullpath,
			encoding, filemode, dirmode, nested)
	})
}

fun ZipFileSet._init(
	file: String?,
	includes: String?,
	excludes: String?,
	includesfile: String?,
	excludesfile: String?,
	defaultexcludes: Boolean?,
	casesensitive: Boolean?,
	followsymlinks: Boolean?,
	maxlevelsofsymlinks: Int?,
	erroronmissingdir: Boolean?,
	dir: String?,
	src: String?,
	srcresource: String?,
	erroronmissingarchive: Boolean?,
	prefix: String?,
	fullpath: String?,
	encoding: String?,
	filemode: String?,
	dirmode: String?,
	nested: (KZipFileSet.() -> Unit)?)
{
	if (file != null)
		setFile(project.resolveFile(file))
	if (includes != null)
		setIncludes(includes)
	if (excludes != null)
		setExcludes(excludes)
	if (includesfile != null)
		setIncludesfile(project.resolveFile(includesfile))
	if (excludesfile != null)
		setExcludesfile(project.resolveFile(excludesfile))
	if (defaultexcludes != null)
		setDefaultexcludes(defaultexcludes)
	if (casesensitive != null)
		setCaseSensitive(casesensitive)
	if (followsymlinks != null)
		setFollowSymlinks(followsymlinks)
	if (maxlevelsofsymlinks != null)
		setMaxLevelsOfSymlinks(maxlevelsofsymlinks)
	if (erroronmissingdir != null)
		setErrorOnMissingDir(erroronmissingdir)
	if (dir != null)
		setDir(project.resolveFile(dir))
	if (src != null)
		setSrc(project.resolveFile(src))
	if (srcresource != null)
		setSrcResource(Resource(srcresource))
	if (erroronmissingarchive != null)
		setErrorOnMissingArchive(erroronmissingarchive)
	if (prefix != null)
		setPrefix(prefix)
	if (fullpath != null)
		setFullpath(fullpath)
	if (encoding != null)
		setEncoding(encoding)
	if (filemode != null)
		setFileMode(filemode)
	if (dirmode != null)
		setDirMode(dirmode)
	if (nested != null)
		nested(KZipFileSet(this))
}

class KZipFileSet(override val component: ZipFileSet) : IFileSelectorNested, IResourceCollectionNested {
	fun patternset(includes: String? = null, excludes: String? = null, includesfile: String? = null, excludesfile: String? = null, nested: (KPatternSet.() -> Unit)? = null) {
		component.createPatternSet().apply {
			_init(includes, excludes, includesfile, excludesfile, nested)
		}
	}
	fun include(name: String? = null, If: String? = null, unless: String? = null) {
		component.createInclude().apply {
			_init(name, If, unless)
		}
	}
	fun exclude(name: String? = null, If: String? = null, unless: String? = null) {
		component.createExclude().apply {
			_init(name, If, unless)
		}
	}
	override fun _addFileSelector(value: FileSelector) = component.add(value)
	override fun _addResourceCollection(value: ResourceCollection) = component.addConfigured(value)
}
