# server-status-app

Projeto que exibe o status do servidor onde a aplicação está rodando. Link do vídeo https://youtu.be/feltexbr


## Acesse o nosso Canal no Youtube

https://www.youtube.com/feltexbr

Veja toda a playlist sobre AWS completa no youtube:

- https://youtu.be/-vsBkITZnOo - Como criar sua conta no Amazon
- https://youtu.be/LJBvf1WYTWI - Configurando o AWS CLI no Windows 10
- https://youtu.be/0x1sDeGPTwI - Configurando o AWS CLI no Linux
- https://youtu.be/9VLmE2dIA7k - Como publicar API com Docker, MySQL na AWS
- https://youtu.be/Y8Y6xakM-28 - Como Instalar sua aplicação na nuvem em Poucos Cliques
- https://youtu.be/3e1hGPVWl8c - Como Salvar Dados na Amazon S3
- https://youtu.be/sBmONQSMI0c - Como Criar um Banco de Dados MySQL na amazon 
- https://youtu.be/uG_cOXCjJnY - Como Instalar sua aplicação na Amazon Usando EC2
- https://youtu.be/-8_dCdNquM8 - Como usar o amazon Elastic Beanstalk | Via o browser
- https://youtu.be/G0lr1E7U7M8 - Usando Docker na amazon - publicando imagens


## Deploy no ElasticBeanstalk

1. Instalar o Beanstalk command line
    https://docs.aws.amazon.com/pt_br/elasticbeanstalk/latest/dg/eb-cli3.html
   
1. Configurar a aplicação. Será criado um arquivo: ```.elasticbeanstalk/config.yml```
    ```
    eb init
    ```

1. Adicione esta linhas ao seu arquivo .elasticbeanstalk/config.yml    
   ```
        deploy:
            artifact: target/server-status.jar
    ```
1. Criar o ambiente. 
    ```
    eb create
    ```
   
1. Definir a variável de ambiente para acesso à aplicação. 

    ```eb setenv SERVER_PORT=5000```

1. Fazer o deploy

    ```eb deploy```

1. Verificar o status do deploy

    ```eb status```

1. Abrir a aplicação.

    ```eb open```

1. Criar mais de uma instância.

    ```eb scale 2```
   
1. Terminar todas as instâncias. Adicione (--force) para evitar a confirmação.

    ```eb terminate --all``` 
    
    
  ##  Gerando a image Docker do projeto
  
  ### Criar a imagem localmente
  
  `docker build -t andrefelix/server-status:v5 .`
  
  ### Enviar a imagem para o DockerHub
  
  `docker push andrefelix/server-status:v5`
   
  
