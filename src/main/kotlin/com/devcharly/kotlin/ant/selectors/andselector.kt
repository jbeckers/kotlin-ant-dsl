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

import org.apache.tools.ant.types.selectors.AndSelector
import org.apache.tools.ant.types.selectors.ContainsRegexpSelector
import org.apache.tools.ant.types.selectors.ContainsSelector
import org.apache.tools.ant.types.selectors.DependSelector
import org.apache.tools.ant.types.selectors.DepthSelector
import org.apache.tools.ant.types.selectors.DifferentSelector
import org.apache.tools.ant.types.selectors.FileSelector
import org.apache.tools.ant.types.selectors.FilenameSelector
import org.apache.tools.ant.types.selectors.MajoritySelector
import org.apache.tools.ant.types.selectors.NoneSelector
import org.apache.tools.ant.types.selectors.NotSelector
import org.apache.tools.ant.types.selectors.OrSelector
import org.apache.tools.ant.types.selectors.PresentSelector
import org.apache.tools.ant.types.selectors.ReadableSelector
import org.apache.tools.ant.types.selectors.SelectSelector
import org.apache.tools.ant.types.selectors.TypeSelector
import org.apache.tools.ant.types.selectors.WritableSelector

/******************************************************************************
DO NOT EDIT - this file was generated
******************************************************************************/

interface IAndSelectorNested : INestedComponent {
	fun and(
		error: String? = null,
		nested: (KAndSelector.() -> Unit)? = null)
	{
		_addAndSelector(AndSelector().apply {
			component.project.setProjectReference(this);
			_init(error, nested)
		})
	}

	fun _addAndSelector(value: AndSelector)
}

fun AndSelector._init(
	error: String?,
	nested: (KAndSelector.() -> Unit)?)
{
	if (error != null)
		setError(error)
	if (nested != null)
		nested(KAndSelector(this))
}

class KAndSelector(override val component: AndSelector) :
	IFileSelectorNested,
	ISelectSelectorNested,
	IAndSelectorNested,
	IOrSelectorNested,
	INotSelectorNested,
	INoneSelectorNested,
	IMajoritySelectorNested,
	IFilenameSelectorNested,
	IContainsSelectorNested,
	IPresentSelectorNested,
	IDepthSelectorNested,
	IDependSelectorNested,
	IDifferentSelectorNested,
	ITypeSelectorNested,
	IContainsRegexpSelectorNested,
	IReadableSelectorNested,
	IWritableSelectorNested
{
	override fun _addFileSelector(value: FileSelector) = component.add(value)
	override fun _addSelectSelector(value: SelectSelector) = component.addSelector(value)
	override fun _addAndSelector(value: AndSelector) = component.addAnd(value)
	override fun _addOrSelector(value: OrSelector) = component.addOr(value)
	override fun _addNotSelector(value: NotSelector) = component.addNot(value)
	override fun _addNoneSelector(value: NoneSelector) = component.addNone(value)
	override fun _addMajoritySelector(value: MajoritySelector) = component.addMajority(value)
	override fun _addFilenameSelector(value: FilenameSelector) = component.addFilename(value)
	override fun _addContainsSelector(value: ContainsSelector) = component.addContains(value)
	override fun _addPresentSelector(value: PresentSelector) = component.addPresent(value)
	override fun _addDepthSelector(value: DepthSelector) = component.addDepth(value)
	override fun _addDependSelector(value: DependSelector) = component.addDepend(value)
	override fun _addDifferentSelector(value: DifferentSelector) = component.addDifferent(value)
	override fun _addTypeSelector(value: TypeSelector) = component.addType(value)
	override fun _addContainsRegexpSelector(value: ContainsRegexpSelector) = component.addContainsRegexp(value)
	override fun _addReadableSelector(value: ReadableSelector) = component.addReadable(value)
	override fun _addWritableSelector(value: WritableSelector) = component.addWritable(value)
}
