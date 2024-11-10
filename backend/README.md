# Whatsapp clone (fullstack project) Spring boot, Angular, Bootstrap, PostgreSQL, Keycloak

Spring boot backend of the whatsapp clone



### Key Features:
- 💬 Real-time messaging
- 👥 Conversations management
- 📁 File sharing (images, videos, documents)
- 🔐 Authentication and Authorization (Role management) with Keycloak (OAuth2)
- 🏢 Hexagonal architecture

## Usage
### Prerequisites
- [JDK 21](https://adoptium.net/temurin/releases/)
- [PostgreSQL](https://www.postgresql.org/download/)

#### Run keycloak
``docker-compose src/main/docker/keycloak.yml up -d``

#### Maven
``./mvnw spring-boot:run``
