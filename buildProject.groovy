job('Build Project - Refactoring') {
    scm {
        git('git://github.com/renanreismartins/refactoring') {
            node -> // is hudson.plugins.git.GitSCM
                node / gitConfigName('Renan Reis')
                node / gitConfigEmail('renanreismartins@gmail.com')
        }
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        gradle('-e clean build')
    }
}
