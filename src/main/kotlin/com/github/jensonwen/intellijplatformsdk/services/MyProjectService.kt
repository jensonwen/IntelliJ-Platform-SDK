package com.github.jensonwen.intellijplatformsdk.services

import com.github.jensonwen.intellijplatformsdk.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
