# 🚀 Démonstration Lombok : Comparaison Avec vs Sans

Ce module démontre **le gain de temps et de code** obtenu en utilisant Lombok.

## 📁 Structure du Projet

```
lombokdemo/
├── models/
│   ├── Person.java                  ✅ AVEC Lombok (~21 lignes)
│   ├── PersonWithoutLombok.java     ❌ SANS Lombok (~130 lignes)
│   └── Product.java                 ✅ AVEC Lombok
├── LombokDemo.java                  🎯 Classe principale de démonstration
└── LombokComparison.java            📊 Comparaison détaillée
```

## 🎯 Objectif

Montrer concrètement le temps et les lignes de code économisés grâce à Lombok en comparant :
- **PersonWithoutLombok.java** : Implémentation traditionnelle complète (~130 lignes)
- **Person.java** : Implémentation avec Lombok (~21 lignes)

## 💡 Résultats de la Comparaison

| Métrique | Sans Lombok | Avec Lombok | Gain |
|----------|-------------|-------------|------|
| **Lignes de code** | ~130 lignes | ~21 lignes | **-84%** |
| **Temps d'écriture** | ~20 minutes | ~2 minutes | **-90%** |
| **Méthodes à écrire** | ~15 méthodes | 0 méthode | **-100%** |
| **Lisibilité** | Moyenne | Excellente | **+++** |
| **Maintenance** | Complexe | Simple | **+++** |

## 🔍 Ce que Génère Lombok

Avec ces 4 simples annotations :
```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
```

Lombok génère automatiquement :
- ✅ Tous les **getters**
- ✅ Tous les **setters**
- ✅ La méthode **equals()**
- ✅ La méthode **hashCode()**
- ✅ La méthode **toString()**
- ✅ Le **pattern Builder** complet
- ✅ Le **constructeur par défaut**
- ✅ Le **constructeur avec tous les paramètres**

## 🚀 Exécuter la Démonstration

```bash
# Depuis le répertoire racine du projet
mvn clean install
mvn exec:java -pl mainapp
```

La démonstration affichera :
1. 📊 Une comparaison détaillée des deux approches
2. 🔧 Une preuve d'équivalence fonctionnelle
3. 📈 Des statistiques de gain de temps et de code
4. 🎯 Des exemples pratiques d'utilisation

## 📝 Points Clés

### ❌ Sans Lombok (PersonWithoutLombok.java)
- Code verbeux et répétitif
- Risque d'erreurs humaines
- Maintenance laborieuse (ajouter un champ = 7+ modifications)
- Difficile à lire et à comprendre rapidement

### ✅ Avec Lombok (Person.java)
- Code clair et concis
- Code généré automatiquement (moins d'erreurs)
- Maintenance facile (ajouter un champ = 1 ligne)
- Lisibilité excellente

## 🎓 Annotations Lombok Utilisées

### `@Data`
Combine `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode` et `@RequiredArgsConstructor`

### `@Builder`
Génère un pattern Builder pour créer des objets de manière fluide

### `@NoArgsConstructor`
Génère un constructeur sans paramètre

### `@AllArgsConstructor`
Génère un constructeur avec tous les paramètres

### `@Getter` / `@Setter`
Génèrent les getters et setters individuellement

### `@ToString`
Génère la méthode toString()

## 🌟 Conclusion

Lombok permet de :
- ✅ **Réduire le code de 84%**
- ✅ **Gagner 90% de temps**
- ✅ **Améliorer la lisibilité**
- ✅ **Réduire les erreurs**
- ✅ **Faciliter la maintenance**
- ✅ **Se concentrer sur la logique métier**

---

**💡 Astuce** : Consultez les fichiers Person.java et PersonWithoutLombok.java côte à côte pour voir visuellement la différence !

