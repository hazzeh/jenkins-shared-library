def call(Map params) {
    echo params.foo
    echo env.BUILD_ID
    echo env.BRANCH_NAME
}
