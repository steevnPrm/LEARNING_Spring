# 🍃 MASTER REPOSITORY : Parcours Spring Professional

Ce dépôt est un **journal d'apprentissage structuré** documentant ma montée en compétences sur l'écosystème Spring. L'objectif est de démontrer une compréhension profonde, allant des mécanismes internes du framework jusqu'à la mise en production d'une API sécurisée.

---

## 📂 Structure du Repository

Voici l'organisation de ce projet, segmentée par étapes de progression technique :

```md
.
├── part_1-spring-essentials/         # Fondamentaux & Fonctionnement bas niveau
│   ├── 01-java-config/               # Beans, @Configuration, @Bean
│   ├── 02-bean-lifecycle/            # Post-processors, init/destroy phases
│   ├── 03-aop-proxies/               # Aspect Oriented Programming
│   └── README.md                     # Documentation théorique (Bas niveau)
├── part_2-spring-boot-features/      # Fonctionnalités haut niveau & Autoconfig
│   ├── 01-data-jpa/                  # Persistance & Repositories
│   ├── 02-security-basics/           # Authentication / Authorization
│   ├── 03-actuator-metrics/          # Observabilité & Monitoring
│   └── README.md                     # Documentation des outils Spring Boot
├── part_3-cashcard-api/              # Projet de mise en pratique (Case Study)
│   ├── src/                          # Code source de l'application
│   ├── tests/                        # Suite de tests TDD
│   ├── pom.xml                       # Gestion des dépendances
│   └── README.md                     # Spécifications de l'API Family Cash Card
└── README.md                         # Portail d'entrée (ce fichier)
```

---

## 🚀 Objectif du Repository

Contrairement à un projet monolithique unique, ce repository sert de base de connaissances technique. Chaque module contient des exemples de code et des tests d'intégration validant les concepts abordés dans le cursus officiel **Spring Academy**.

---

## 📚 Sommaire du Parcours

### 🧩 Partie 1 : Fondamentaux du Framework (Spring Essentials)

*Focus : Comprendre le fonctionnement interne et la gestion du contexte.*



* **Core Container** : Maîtrise de l'Inversion de Contrôle (IoC) et de l'Injection de Dépendances (DI).
* **Bean Lifecycle** : Étude approfondie des phases d'initialisation et de destruction au sein du conteneur.
* **AOP (Aspect Oriented Programming)** : Implémentation de problématiques transverses via les Proxies, Pointcuts et Advices.
* **Data Access & Transactions** : Simplification JDBC (`JdbcTemplate`) et gestion déclarative des transactions (`@Transactional`).

---

### ⚡ Partie 2 : Productivité & Abstractions (Spring Boot)

*Focus : Utiliser les outils haut niveau pour le développement d'applications modernes.*



* **Auto-configuration** : Compréhension du mécanisme "Opinionated" et de l'annotation `@SpringBootApplication`.
* **Spring Data JPA** : Abstraction de la persistance, gestion des entités et des Repositories.
* **Web & REST** : Développement de couches Web via Spring MVC.
* **Spring Boot Actuator** : Mise en place de l'observabilité (Metrics, Health, Info).

---

### 🛠️ Partie 3 : Mise en pratique (Projet "Family Cash Card")

*Focus : Application concrète des concepts via une approche TDD.*

Réalisation d'un service de gestion de cartes de débit numériques couvrant l'intégralité du cycle de vie du développement :

* **Méthodologie TDD** : Application rigoureuse du cycle *Red-Green-Refactor*.
* **Opérations CRUD Avancées** : Implémentation du **Pagination et Tri** sur les endpoints GET.
* **Sécurité Appliquée** : Isolation des données par utilisateur (un utilisateur ne peut accéder qu'à ses propres cartes).

---

## 🛠 Environnement Technique

* **Langage** : Java 21+
* **Build Tool** : Maven
* **Framework** : Spring Boot 3.x
* **Tests** : JUnit 5, AssertJ, Mockito

---

> *"L'élégance du code Spring réside dans sa capacité à rendre le complexe invisible."*