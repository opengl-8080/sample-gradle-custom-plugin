package sample.gradle.plugin

import org.apache.commons.lang3.StringUtils
import org.gradle.api.Plugin
import org.gradle.api.Project;;

class MyGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('hello') {
            doLast {
                def result = StringUtils.join("foo", "bar")
                println "result=$result"
                println 'Hello My Gradle Plugin!!'
            }
        }
    }
}
