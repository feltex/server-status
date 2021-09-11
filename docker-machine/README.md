## Criando a máquina virtual

    docker-machine create --driver virtualbox vm-docker

# Direcionando docker para a VM

    eval $(docker-machine env vm-docker)

# Verificando qual é a máquina ativa

    docker-machine active

# Obtendo informações da VM

    docker-machine inspect vm-docker

# Rodando um container Docker

    docker run -d --name server-status -p 8080:8080 andrefelix/server-status:V2


# Acessando o container

    curl http://localhost:8080 # Vai dar erro, pois o container não está rodando na nossa máquina e sim na VM
    
    docker-machine ip vm-docker 

    curl http://<IP-VM>:8080


# Conectando via SSH a VM

    docker-machine ssh vm-docker

# Direcionando o docker para o nosso host

    eval $(docker-machine env -u)

# Deletando uma machine

    docker-machine rm -f vm-docker
