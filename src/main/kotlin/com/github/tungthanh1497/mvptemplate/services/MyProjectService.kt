package com.github.tungthanh1497.mvptemplate.services

import com.github.tungthanh1497.mvptemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
