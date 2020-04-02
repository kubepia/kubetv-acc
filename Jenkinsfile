node('agent') {
    stage ('build'){
        def result = openshift.raw( 'status', '-v' )
        echo "Cluster status: ${result.out}"
    }
}