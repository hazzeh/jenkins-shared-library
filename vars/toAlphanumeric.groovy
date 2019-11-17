def call(Map params) {
    echo params.foo
    echo env.BUILD_ID
    if (params.test) {
      print("testar")
    }
    echo env.BRANCH_NAME
    echo "Calling buildGradle"
    sh 'ls'
    sh label: 'Test2', script: 'date'
    loginfo 'Starting'
    println(params)
    buildGradle()
}
