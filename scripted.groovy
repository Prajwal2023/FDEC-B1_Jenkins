node {
    stage = ('Pull') {
        echo "pull is ready"
    }
    stage = ('Build') {
        echo "Build is available"
    }
    stage = ('Test') {
        echo "Code is successful passing tests"
    }
    stage = ('Deploy') {
        echo "Congratulations Deployment is ready to release"
    }
}