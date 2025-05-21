#  Application de Gestion de Livres 

##  Objectif
Ce projet a été conçu pour mettre en pratique les bases du développement Java autour de la programmation orientée objet (POO), 
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
1.  Ajout de "Et si on arrêtait de se mentir" – Olivier Sibony (2023)
2.  Ajout de "La vie est une fête" – David Laroche (2022)
3. Suppression du premier livre
4. Affichage attendu :

```
La vie est une fête by David Laroche (2022)
```


---

## Tests 
- **Tests unitaires** (fichier `LibraryTest.java`) : testent chaque fonctionnalité isolément.
- **Test fonctionnel** (fichier `LibraryFunctionalTest.java`) : simule un scénario utilisateur complet.

L’objectif est de s’assurer que chaque méthode fonctionne comme prévu, dans tous les cas classiques et limites.

---

##  CI/CD
Un workflow CI est configuré dans `.github/workflows/maven.yml`. Il permet de :

- Compiler le projet à chaque `push` ou `pull request` sur `main`
- Exécuter automatiquement tous les tests

C’est un moyen simple mais puissant de garantir la stabilité du projet à chaque modification.

---

## ▶️ Comment lancer le projet

### Compilation & Tests
```bash
# Compiler le projet
mvn clean compile
```

# Exécuter les tests
```bash
mvn test
```

