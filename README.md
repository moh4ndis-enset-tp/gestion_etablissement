# Système de Gestion d'un Établissement d'Enseignement

Ce projet implémente un système orienté objet pour la gestion des personnes dans un établissement d'enseignement. Le système permet de gérer trois catégories de personnes : des secrétaires, des enseignants et des étudiants.

## Structure du Projet

Le projet est organisé autour d'une hiérarchie de classes Java :

### Classes Principales

1. **Personne** (Classe abstraite)
   - Représente une personne générique dans l'établissement
   - Contient les attributs communs : nom, prénom, âge, adresse
   - Maintient un compteur global des personnes
   - Méthodes : toString(), ecrirePersonne() (abstraite), nbPersonnes(), modifierPersonne()

2. **Enseignant** (Hérite de Personne)
   - Représente un enseignant avec des attributs spécifiques : nbHeuresCours, grincheux, specialite
   - Maintient un compteur des enseignants
   - Calcule le salaire en fonction des heures de cours et du statut "grincheux"
   - 100% du taux horaire pour les 40 premières heures
   - 150% du taux horaire pour les heures supplémentaires (uniquement pour les enseignants non grincheux)

3. **Etudiant** (Hérite de Personne)
   - Représente un étudiant avec des attributs spécifiques : noteMoyenne, diplomeEnCours
   - Maintient un compteur des étudiants

4. **Secretaire** (Hérite de Personne)
   - Représente une secrétaire avec un attribut spécifique : numeroBureau
   - Maintient un compteur des secrétaires

5. **Gestion** (Classe principale avec méthode main)
   - Crée et initialise un tableau de personnes
   - Affiche les personnes et les statistiques
   - Organise le tableau pour regrouper les secrétaires, enseignants et étudiants

## Fonctionnalités

- Création et gestion de différentes catégories de personnes
- Comptage automatique des personnes par catégorie
- Calcul de salaire pour les enseignants avec gestion des heures supplémentaires
- Tri des personnes par catégorie (secrétaires, enseignants, étudiants)
- Affichage des caractéristiques de chaque personne

## Utilisation

Pour exécuter le programme :

1. Compilez tous les fichiers Java : `javac *.java`
2. Exécutez la classe Gestion : `java Gestion`

Le programme affichera :
- La liste des personnes avant tri
- Les statistiques sur le nombre de personnes par catégorie
- La liste des personnes après tri par catégorie

## Diagramme de Classes

```mermaid
classDiagram
    class Personne {
        - nom
        - prenom
        - age
        - adresse
        + toString()
        + ecrirePersonne()
        + modifierPersonne()
    }
    class Enseignant {
        - nbHeuresCours
        - grincheux
        - specialite
        + toString()
        + ecrirePersonne()
        + salaire()
    }
    class Etudiant {
        - noteMoyenne
        - diplomeEnCours
        + toString()
        + ecrirePersonne()
    }
    class Secretaire {
        - numeroBureau
        + toString()
        + ecrirePersonne()
    }
    Personne <|-- Enseignant
    Personne <|-- Etudiant
    Personne <|-- Secretaire
```_
