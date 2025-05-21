#  Application de Gestion de Livres 

##  Objectif?
Ce projet a été conçu pour mettre en pratique les bases solides du développement Java, en particulier autour de la programmation orientée objet (POO), 
des tests unitaires et fonctionnels, ainsi que de l'automatisation avec Maven et GitHub Actions. C'est un projet qui couvre des étapes essentielles d’un vrai projet logiciel.

---

##  Technologies utilisées
- **Java 21** : pour profiter des dernières améliorations du langage.
- **Maven** : gestion des dépendances et du cycle de vie du projet.
- **JUnit 5** : framework de test moderne et flexible.
- **GitHub Actions** : intégration continue (CI) pour valider automatiquement les modifications.

---

##  Fonctionnalités principales
L'application permet de gérer une petite bibliothèque de livres via des opérations simples :

- ✅ Ajouter un livre
- ❌ Supprimer un livre par son titre (insensible à la casse)
- 🔍 Rechercher un livre par son titre
- 📋 Lister tous les livres disponibles

---

##  Exemple d’utilisation (scénario fonctionnel simulé)
1. Ajout de “1984” de George Orwell (1949)
2. Ajout de “Dune” de Frank Herbert (1965)
3. Suppression de “1984”
4. Affichage des livres restants

**Sortie attendue :**


---

## Tests automatisés
- **Tests unitaires** (fichier `LibraryTest.java`) : testent chaque fonctionnalité isolément.
- **Test fonctionnel** (fichier `LibraryFunctionalTest.java`) : simule un scénario utilisateur complet.

L’objectif est de s’assurer que chaque méthode fonctionne comme prévu, dans tous les cas classiques et limites.

---

##  CI/CD avec GitHub Actions
Un workflow CI est configuré dans `.github/workflows/maven.yml`. Il permet de :

- Compiler le projet à chaque `push` ou `pull request` sur `main`
- Exécuter automatiquement tous les tests

C’est un moyen simple mais puissant de garantir la stabilité du projet à chaque modification.

---

## ▶️ Comment lancer le projet

### 1. Compilation
```bash
mvn clean compile
