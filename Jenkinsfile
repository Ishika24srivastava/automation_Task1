pipeline {
    agent any

    stages 
    {
        stage('Build') 
        {
            steps 
            {
                echo 'Build World'
            }
        }
        stage('Test')
        {
            steps 
            {
                echo 'Test World'
            }
        }
        stage('Deploy') 
        {
            steps {
                echo 'Deploy World'
            }
        }
    }
    post
    {
        always{
                    emailext body: 'summary', subject: 'pipeline status', to: 'isrivastava@bebotechnologies.com'
            }
        
    }
}
