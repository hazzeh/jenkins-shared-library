def call() {
    println "Hello"
    echo "Run gradle"
    sh label: 'Test from gradle', script: 'ls'
}

