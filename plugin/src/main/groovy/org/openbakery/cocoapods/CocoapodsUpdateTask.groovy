package org.openbakery.cocoapods

import org.gradle.api.tasks.TaskAction

/**
 * Created by rene on 04.02.16.
 */
class CocoapodsUpdateTask extends AbstractCocoapodsTask {


	public CocoapodsUpdateTask() {
		super()
		setDescription "Updates the pods for the given project"
	}

	@TaskAction
	void update() throws IOException {
		runInstallCocoapods()
		runPod("update")
	}
}
