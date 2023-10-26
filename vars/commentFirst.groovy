def call() {
    sh '''
    sudo apt update
sudo apt -y install software-properties-common
sudo apt-add-repository ppa:ansible/ansible -y
sudo apt install ansible -y
'''
}
