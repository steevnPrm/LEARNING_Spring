# 🍃 Spring Framework: Core Fundamentals

Ce dépôt regroupe mes notes d'apprentissage basées sur le cursus **Spring Academy**. L'objectif est de comprendre l'architecture interne du framework et la transition vers des applications découplées.

## 1. Vue d'ensemble (Overview)

Le Spring Framework est l'écosystème leader pour le développement Java en entreprise.

* **Open Source :** Code source libre sous **Licence Apache 2.0**.
* **Conteneur DI (Dependency Injection) :** Son cœur assure la gestion des dépendances pour garantir un **couplage faible**.
* **Distribution :** Binaires standardisés via **Maven Central**.
* **Optimisation :** Spécialisé pour la scalabilité et la robustesse des applications métier.

## 2. Philosophie & Légèreté (Spring Boot)

Spring Boot agit comme une couche de simplification au-dessus de Spring pour accélérer le développement.

### Modèle POJO (*Plain Old Java Object*)

* **Principe :** Utilisation de classes Java simples.
* **Avantage :** Pas d'obligation d'hériter de classes propriétaires du framework. Le code reste pur, lisible et hautement testable.

### Architecture Standalone

* **Format .JAR :** L'application est packagée dans un artefact unique.
* **Auto-suffisance :** Le binaire contient le code compilé + les dépendances + un **serveur web embarqué** (ex: Tomcat).
* **Portabilité :** Exécution via une simple commande : `java -jar app.jar`.

---

## 3. Approfondissement : Le DI Container

Le **DI Container** (souvent appelé `ApplicationContext`) est le moteur qui fait vivre l'application.

### Caractéristiques techniques

* **Localisation :** Il réside intégralement dans la **mémoire RAM**.
* **Cycle de vie :** Initialisation au **Runtime** (démarrage de l'application) en quelques millisecondes.

### Processus d'action (Startup)

Le container suit un flux logique pour construire l'application :

1. **Scan :** Analyse du classpath pour identifier les **Beans** (composants annotés avec `@Component`, `@Service`, etc.).
2. **Graphe de dépendances :** Analyse des liens entre les classes (via les constructeurs ou `@Autowired`).
3. **Instanciation :** Création des objets dans le bon ordre et injection automatique des dépendances.

> **Bénéfice majeur :** En déléguant l'instanciation au container, le développeur évite le couplage fort (usage du `new` manuel) et rend les composants facilement interchangeables (notamment pour les tests unitaires).

### Prochaine étape 🚀

* [ ] Configuration du container (Java Config vs Annotations)
* [ ] Cycle de vie des Beans (Scopes)
