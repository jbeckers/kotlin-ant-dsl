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

import org.apache.tools.ant.types.resources.FileResource
import org.apache.tools.ant.types.resources.MultiRootFileSet
import org.apache.tools.ant.types.selectors.AndSelector
import org.apache.tools.ant.types.selectors.ContainsRegexpSelector
import org.apache.tools.ant.types.selectors.ContainsSelector
import org.apache.tools.ant.types.selectors.DateSelector
import org.apache.tools.ant.types.selectors.DependSelector
import org.apache.tools.ant.types.selectors.DepthSelector
import org.apache.tools.ant.types.selectors.DifferentSelector
import org.apache.tools.ant.types.selectors.ExtendSelector
import org.apache.tools.ant.types.selectors.FileSelector
import org.apache.tools.ant.types.selectors.FilenameSelector
import org.apache.tools.ant.types.selectors.MajoritySelector
import org.apache.tools.ant.types.selectors.NoneSelector
import org.apache.tools.ant.types.selectors.NotSelector
import org.apache.tools.ant.types.selectors.OrSelector
import org.apache.tools.ant.types.selectors.PresentSelector
import org.apache.tools.ant.types.selectors.ReadableSelector
import org.apache.tools.ant.types.selectors.SelectSelector
import org.apache.tools.ant.types.selectors.SizeSelector
import org.apache.tools.ant.types.selectors.TypeSelector
import org.apache.tools.ant.types.selectors.WritableSelector
import org.apache.tools.ant.types.selectors.modifiedselector.ModifiedSelector

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

interface IMultiRootFileSetNested : INestedComponent {
	fun multirootfileset(
		basedirs: String? = null,
		type: SetType? = null,
		cache: Boolean? = null,
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
		nested: (KMultiRootFileSet.() -> Unit)? = null)
	{
		_addMultiRootFileSet(MultiRootFileSet().apply {
			component.project.setProjectReference(this);
			_init(basedirs, type, cache, file,
				includes, excludes, includesfile, excludesfile,
				defaultexcludes, casesensitive, followsymlinks, maxlevelsofsymlinks,
				erroronmissingdir, nested)
		})
	}

	fun _addMultiRootFileSet(value: MultiRootFileSet)
}

fun IResourceCollectionNested.multirootfileset(
	basedirs: String? = null,
	type: SetType? = null,
	cache: Boolean? = null,
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
	nested: (KMultiRootFileSet.() -> Unit)? = null)
{
	_addResourceCollection(MultiRootFileSet().apply {
		component.project.setProjectReference(this);
		_init(basedirs, type, cache, file,
			includes, excludes, includesfile, excludesfile,
			defaultexcludes, casesensitive, followsymlinks, maxlevelsofsymlinks,
			erroronmissingdir, nested)
	})
}

fun MultiRootFileSet._init(
	basedirs: String?,
	type: SetType?,
	cache: Boolean?,
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
	nested: (KMultiRootFileSet.() -> Unit)?)
{
	if (basedirs != null)
		setBaseDirs(basedirs)
	if (type != null)
		setType(type.value)
	if (cache != null)
		setCache(cache)
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
	if (nested != null)
		nested(KMultiRootFileSet(this))
}

class KMultiRootFileSet(override val component: MultiRootFileSet) :
	IFileSelectorNested,
	ISelectSelectorNested,
	IAndSelectorNested,
	IOrSelectorNested,
	INotSelectorNested,
	INoneSelectorNested,
	IMajoritySelectorNested,
	IDateSelectorNested,
	ISizeSelectorNested,
	IDifferentSelectorNested,
	IFilenameSelectorNested,
	ITypeSelectorNested,
	IExtendSelectorNested,
	IContainsSelectorNested,
	IPresentSelectorNested,
	IDepthSelectorNested,
	IDependSelectorNested,
	IContainsRegexpSelectorNested,
	IModifiedSelectorNested,
	IReadableSelectorNested,
	IWritableSelectorNested
{
	fun basedir(name: String? = null, exists: Boolean? = null, lastmodified: Long? = null, directory: Boolean? = null, size: Long? = null, file: String? = null, basedir: String? = null) {
		component.addConfiguredBaseDir(FileResource().apply {
			component.project.setProjectReference(this)
			_init(name, exists, lastmodified, directory, size, file, basedir)
		})
	}
	fun patternset(includes: String? = null, excludes: String? = null, includesfile: String? = null, excludesfile: String? = null, nested: (KPatternSet.() -> Unit)? = null) {
		component.createPatternSet().apply {
			component.project.setProjectReference(this)
			_init(includes, excludes, includesfile, excludesfile, nested)
		}
	}
	fun include(name: String? = null, If: String? = null, unless: String? = null) {
		component.createInclude().apply {
			_init(name, If, unless)
		}
	}
	fun includesfile(name: String? = null, If: String? = null, unless: String? = null) {
		component.createIncludesFile().apply {
			_init(name, If, unless)
		}
	}
	fun exclude(name: String? = null, If: String? = null, unless: String? = null) {
		component.createExclude().apply {
			_init(name, If, unless)
		}
	}
	fun excludesfile(name: String? = null, If: String? = null, unless: String? = null) {
		component.createExcludesFile().apply {
			_init(name, If, unless)
		}
	}
	override fun _addFileSelector(value: FileSelector) = component.add(value)
	override fun _addSelectSelector(value: SelectSelector) = component.addSelector(value)
	override fun _addAndSelector(value: AndSelector) = component.addAnd(value)
	override fun _addOrSelector(value: OrSelector) = component.addOr(value)
	override fun _addNotSelector(value: NotSelector) = component.addNot(value)
	override fun _addNoneSelector(value: NoneSelector) = component.addNone(value)
	override fun _addMajoritySelector(value: MajoritySelector) = component.addMajority(value)
	override fun _addDateSelector(value: DateSelector) = component.addDate(value)
	override fun _addSizeSelector(value: SizeSelector) = component.addSize(value)
	override fun _addDifferentSelector(value: DifferentSelector) = component.addDifferent(value)
	override fun _addFilenameSelector(value: FilenameSelector) = component.addFilename(value)
	override fun _addTypeSelector(value: TypeSelector) = component.addType(value)
	override fun _addExtendSelector(value: ExtendSelector) = component.addCustom(value)
	override fun _addContainsSelector(value: ContainsSelector) = component.addContains(value)
	override fun _addPresentSelector(value: PresentSelector) = component.addPresent(value)
	override fun _addDepthSelector(value: DepthSelector) = component.addDepth(value)
	override fun _addDependSelector(value: DependSelector) = component.addDepend(value)
	override fun _addContainsRegexpSelector(value: ContainsRegexpSelector) = component.addContainsRegexp(value)
	override fun _addModifiedSelector(value: ModifiedSelector) = component.addModified(value)
	override fun _addReadableSelector(value: ReadableSelector) = component.addReadable(value)
	override fun _addWritableSelector(value: WritableSelector) = component.addWritable(value)
}

enum class SetType(val value: MultiRootFileSet.SetType) {
	FILE(MultiRootFileSet.SetType.file),
	DIR(MultiRootFileSet.SetType.dir),
	BOTH(MultiRootFileSet.SetType.both)
}
