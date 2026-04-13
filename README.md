# 🍃 MASTER REPOSITORY : Parcours Spring Professional

Ce dépôt est un **journal d'apprentissage structuré** documentant ma montée en compétences sur l'écosystème Spring. L'objectif est de démontrer une compréhension profonde, allant des mécanismes internes du framework jusqu'à la mise en production d'une API sécurisée.

---

## 📂 Structure du Repository

```text
.
├── MasterRepo/
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   ├── README.md
│   │
│   ├── part_1-spring-essentials/
│   │   ├── 01-java-config.md
│   │   ├── 02-bean-lifecycle.md
│   │   ├── 03-aop-proxies.md
│   │   ├── README.md
│   │   └── sandbox/
│   │
│   ├── part_2-spring-boot-features/
│   │   ├── 01-data-jpa.md
│   │   ├── 02-security-basics.md
│   │   ├── 03-actuator-metrics.md
│   │   ├── README.md
│   │   └── sandbox/
│   │
│   ├── src/
       ├── main/
       └── test/

```

---

## 🚀 Objectif du Repository

Contrairement à un projet monolithique unique, ce repository sert de base de connaissances technique. Chaque module contient des exemples de code et des tests d'intégration validant les concepts abordés dans le cursus officiel **Spring Academy**.

---

## 📚 Sommaire du Parcours

### 🧩 Partie 1 : Fondamentaux du Framework (Spring Essentials)

*Focus : Comprendre le fonctionnement interne et la gestion du contexte.*

* **Core Container** : Inversion de Contrôle (IoC) et Injection de Dépendances (DI)
* **Bean Lifecycle** : Phases d'initialisation et de destruction
* **AOP** : Proxies, Pointcuts, Advices
* **Data Access & Transactions** : `JdbcTemplate`, `@Transactional`

---

### ⚡ Partie 2 : Productivité & Abstractions (Spring Boot)

*Focus : Développement d'applications modernes.*

* **Auto-configuration** : `@SpringBootApplication`, mécanisme opinionated
* **Spring Data JPA** : Entités et repositories
* **Web & REST** : Spring MVC
* **Actuator** : Metrics, Health, Info

---

### 🛠️ Partie 3 : Mise en pratique (Projet "Family Cash Card")

*Focus : Application via TDD.*

* **TDD** : Red → Green → Refactor
* **CRUD avancé** : Pagination & tri
* **Sécurité** : Isolation des données par utilisateur

---

## 🧩 Structure des synthèses techniques

👉 Cette section définit le **format standard utilisé dans chaque chapitre**.

Chaque module (`01-java-config`, `02-bean-lifecycle`, etc.) contient un `README.md` structuré de la manière suivante :

### 1. 🎯 Objectif

Définir ce que le chapitre permet de comprendre.

### 2. ❓ Pourquoi

Expliquer le problème technique résolu et le contexte d’utilisation.

### 3. 🧭 Diagramme (UML / Mermaid)

Visualisation du concept pour faciliter la compréhension.

### 4. ⚙️ Process

Décrire le fonctionnement ou les étapes de mise en place.

---

## 🛠 Environnement Technique

* **Langage** : Java 21+
* **Build Tool** : Maven
* **Framework** : Spring Boot 3.x
* **Tests** : JUnit 5, AssertJ, Mockito

---

> *"L'élégance du code Spring réside dans sa capacité à rendre le complexe invisible."*
