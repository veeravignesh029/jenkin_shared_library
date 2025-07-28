def call(List stagesList) {
    stagesList.each { stageConfig ->
        stage(stageConfig.name) {
            stageConfig.steps.call()
        }
    }
}
