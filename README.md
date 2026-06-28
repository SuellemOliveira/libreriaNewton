# LibreriaNewton - Progetto di Evoluzione del Software

Questo progetto è un'applicazione web completa per la gestione bibliotecaria, sviluppata con l'obiettivo di dimostrare le competenze di **dockerizzazione** e **cloud deployment**.

## Live Demo su AWS
L'applicazione è attualmente ospitata su un'istanza **Amazon EC2** (Regione: Stockholm).
 **Accedi qui:** [http://51.20.129.199:1001](http://51.20.129.199:1001)

## Architettura e Tecnologie
*   **Backend:** Java 22 con Spring Boot 3.x.
*   **Database:** MySQL 8.0 per la persistenza dei dati.
*   **Frontend:** Thymeleaf e HTML5 con un design personalizzato.
*   **Containerizzazione:** Docker e Docker Compose per l'orchestrazione dei servizi.
*   **Cloud:** AWS (Amazon Web Services) con gestione di Security Groups e Inbound Rules.

## Dettagli della Dockerizzazione
Il progetto utilizza un'architettura a due container:
1.  **spring-app:** L'applicazione Java, configurata con un `Dockerfile` basato su `openjdk:22-jdk-slim`.
2.  **mysql-db:** Il database MySQL, configurato con variabili d'ambiente per la creazione automatica dello schema `book`.

I container comunicano all'interno di una rete virtuale Docker, garantendo l'isolamento e la portabilità del software, come studiato nei moduli di **Docker parte 1 e 3**.

## Come eseguire localmente
1.  Clona il repository: `git clone https://github.com/SuellemOliveira/libreriaNewton.git`
2.  Assicurati di avere il file `.jar` nella cartella `target/`.
3.  Esegui il comando:
    ```bash
    docker-compose up --build
    ```
4.  L'applicazione sarà disponibile su `http://localhost:1001`.
