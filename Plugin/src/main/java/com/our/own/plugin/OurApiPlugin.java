package com.our.own.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class OurApiPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        project.getTasks().register("autocopy", task -> {
            task.doLast(unused -> {
                System.out.println("Hello from Our Plugin");
            });
        });
    }
}

