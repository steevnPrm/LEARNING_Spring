# Study Case: Keycloak & Spring Boot Security 🛡️

Ce projet est une étude de cas pratique sur la mise en œuvre d'une architecture de sécurité moderne utilisant **Keycloak** comme serveur d'identité et **Spring Boot 3** comme serveur de ressources, le tout conteneurisé avec **Docker**.

## 🚀 Objectifs du Projet

* Configurer une stack d'authentification robuste avec **OAuth2** et **OpenID Connect (OIDC)**.
* Gérer la communication réseau entre conteneurs Docker (Réseau interne vs Exposition externe).
* Sécuriser des endpoints API via la validation de jetons **JWT**.
* Persistance des données d'identité avec **PostgreSQL**.

---

## 🏗️ Architecture Technique

Le projet repose sur trois composants principaux orchestrés par Docker Compose :

1. **Keycloak (v24+)** : Fournisseur d'identité (IdP).
2. **PostgreSQL** : Base de données pour la persistance des Realms et Utilisateurs.
3. **Spring Boot API** : Serveur de ressources sécurisé.

---

## 🛠️ Défis Techniques Résolus

### Le Conflit d'Identité Réseau (The "Double Visage")

L'un des défis majeurs de ce projet a été la gestion de l'émetteur du jeton (`iss`).

* **Problème** : Keycloak émet des jetons via `localhost:8081` (pour le client externe), mais l'API Spring doit valider ces jetons via le réseau interne Docker (`keycloak:8080`).
* **Solution** : Implémentation d'un `JwtDecoder` explicite pour séparer la validation logique de l'émetteur de la récupération technique des clés cryptographiques (JWK).

### Configuration Docker Hybride

Utilisation de variables d'environnement dynamiques pour permettre à Keycloak de fonctionner en mode développement (`start-dev`) tout en restant accessible aux applications Java conteneurisées.

---

## 📋 Pré-requis

* Docker & Docker Compose
* Java 21+
* Curl (pour les tests)

---

## 🚦 Démarrage Rapide

### 1. Lancer l'infrastructure

```bash
docker compose up -d
```

### 2. Accéder à l'interface

* **Keycloak Admin Console** : `http://localhost:8081`
* **Identifiants** : `admin` / `admin`

### 3. Tester l'authentification

Générer un jeton via le terminal :

```bash
curl -X POST http://localhost:8081/realms/master-repo/protocol/openid-connect/token \
  -d "client_id=keycloak" \
  -d "username=test" \
  -d "password=test" \
  -d "grant_type=password"
```

Appeler l'API sécurisée :

```bash
curl -i http://localhost:8080/profile -H "Authorization: Bearer <VOTRE_TOKEN>"
```

---

## 🔍 Feedback & Code Review

* **Découplage** : La configuration de sécurité est extraite de manière explicite dans `SecurityConfig.java` pour éviter les comportements imprévus de l'auto-configuration Spring en milieu Docker.
* **Stateless** : L'API est configurée en mode `STATELESS` (aucune session côté serveur), garantissant une scalabilité horizontale parfaite.
* **Sécurité** : Désactivation sélective du CSRF pour les endpoints API protégés par JWT.

---

## 📚 Ressources

* [Documentation Keycloak](https://www.keycloak.org/documentation)
* [Spring Security OAuth2 Resource Server](https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/index.html)

---
*Ce projet a été réalisé dans le cadre d'un apprentissage approfondi des flux **OAuth2** et de la **conteneurisation**.*
