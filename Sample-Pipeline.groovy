pipeline {
    agent any

    stages {
  stage('buils') {
    steps {
      echo 'building....'
    }
  }

  stage('test') {
    steps {
      echo 'testing....'
    }
  }

  stage('deploy') {
    steps {
      echo 'deploying....'
      echo 'Done!'
    }
  }

}

}