#LibreriaNewton

Questo progetto è un'applicazione web per la gestione dei libri, sviluppata per il corso di **Evoluzione del Software**. L'applicazione utilizza un'architettura moderna ed è pronta per gli ambienti di produzione attraverso i container.

## Tecnologie Utilizzate
* **Linguaggio:** Java 17
* **Framework:** Spring Boot 3.x
* **Database:** MySQL 8.0
* **Frontend:** Thymeleaf / HTML5
* **Infrastruttura:** Docker & Docker Compose
* **Cloud:** AWS (Amazon EC2)

## Dockerizzazione
Il progetto è stato strutturato per essere eseguito in container, garantendo che l'ambiente di sviluppo sia identico a quello di produzione.
* **Dockerfile:** Configura l'immagine dell'applicazione Spring Boot.
* **Docker Compose:** Orchestra l'applicazione e il database MySQL in una rete isolata.

## Deploy su AWS
L'applicazione è disponibile per il test tramite il servizio **Amazon EC2**.
**Accedi qui:** http://51.20.129.199:1001

## Come eseguire localmente
1. Assicurati di avere Docker installato.
2. Clona il repository: `git clone https://github.com/SuellemOliveira/libreriaNewton.git`
3. Nella cartella principale del progetto, esegui:
   ```bash
   docker-compose up --build
