# Java Lab

Projet Java modulaire servant de laboratoire pour tester diverses fonctionnalités Java (ex. Lombok, JPA, design patterns).

## Architecture du Projet

Le projet est organisé en modules Maven clairs et indépendants :

```
java-lab/
├── core/                      # Module des utilitaires communs
│   └── src/main/java/com/javalab/core/
│       └── utils/
│           └── Logger.java    # Utilitaire de logging simple
│
├── demos/                     # Module parent des démonstrations
│   └── lombokdemo/           # Démonstration de Lombok
│       └── src/main/java/com/javalab/demos/lombokdemo/
│           ├── models/       # Modèles de données
│           │   ├── Person.java
│           │   └── Product.java
│           └── LombokDemo.java  # Classe d'exécution de la démo
│
└── mainapp/                   # Application principale
    └── src/main/java/com/javalab/mainapp/
        └── MainApp.java       # Point d'entrée central
```

## Modules

### Core
Module contenant les utilitaires communs partagés par tous les autres modules :
- **Logger** : Utilitaire de logging simple avec timestamps

### Demos
Module parent contenant les sous-modules de démonstration indépendants :

#### LombokDemo
Démonstration des fonctionnalités de Lombok :
- **Person** : Modèle avec `@Data`, `@Builder`, `@NoArgsConstructor`, `@AllArgsConstructor`
- **Product** : Modèle avec `@Getter`, `@Setter`, `@ToString`
- **LombokDemo** : Classe d'exécution qui présente les fonctionnalités

### MainApp
Application centrale permettant de lancer toutes les démonstrations via un menu interactif.

## Prérequis

- Java 11 ou supérieur
- Maven 3.6 ou supérieur

## Installation et Compilation

1. Cloner le repository :
```bash
git clone https://github.com/youss-uiux/java-lab.git
cd java-lab
```

2. Compiler le projet :
```bash
mvn clean install
```

## Exécution

Pour lancer l'application principale :

```bash
cd mainapp
java -cp target/mainapp-1.0-SNAPSHOT.jar:../core/target/core-1.0-SNAPSHOT.jar:../demos/lombokdemo/target/lombokdemo-1.0-SNAPSHOT.jar com.javalab.mainapp.MainApp
```

Ou utiliser Maven pour exécuter :
```bash
cd mainapp
mvn exec:java -Dexec.mainClass="com.javalab.mainapp.MainApp"
```

## Ajouter une Nouvelle Démonstration

1. Créer un nouveau module dans le dossier `demos/`
2. Ajouter le module dans `demos/pom.xml`
3. Créer les modèles dans un package `models`
4. Créer une classe de démonstration avec une méthode `run()`
5. Ajouter l'option dans le menu de `MainApp.java`

## Technologies Utilisées

- **Java 11** : Langage de programmation
- **Maven** : Gestion de projet et de dépendances
- **Lombok** : Réduction du code boilerplate

## Licence

Ce projet est un laboratoire d'apprentissage pour expérimenter avec diverses fonctionnalités Java. 
