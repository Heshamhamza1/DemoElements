pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                echo "Cloning the repository..."
                checkout scm
            }
        }

        stage('Install Dependencies') {
            steps {
                echo "Installing dependencies..."
                bat 'pip install -r requirements.txt'  // use `bat` since you're on Windows
            }
        }

        stage('Run Tests') {
            steps {
                echo "Running automation tests..."
                bat 'pytest --junitxml=results.xml'  // example for Python
            }
        }
        }
    }
}
