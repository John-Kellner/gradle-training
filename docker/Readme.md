

# Install Docker Image

1. Starten in dem Ordner mit dem Skript
2. Lt Konvention muss das docker-compose File docker-compose.yml heißen 


```
docker-compose up -d
```

![Docker Image](img/docker.PNG)

### Passwort von Nexus auslesen 
```
docker ps
docker exec -it nexus-nexus-1 /bin/bash
cd nexus 
```