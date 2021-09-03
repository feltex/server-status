# Comandos para fazer o deploy no Minikube

Projeto que exibe o status do servidor onde a aplicação está rodando. Link do vídeo https://youtu.be/-8_dCdNquM8


## Comando para executar localmente

Iniciar o cluster utilizando o docker

    minikube start --driver=docker    

Verificar o status do Cluster

    minikube status

Ler informações do Cluster

    kubectl cluster-info

Fazer o deploy

    kubectl apply -f deployment.yaml

Ler informações dos recursos do cluster

    kubectl get all

Ler o IP e porta do serviço 

    minikube service server-status --url

Abra o browser e acessar o IP obtido ou utilize o comando curl


Listar os pods

    kubectl get pods

delete todos os recursos criados

    minikube delete
