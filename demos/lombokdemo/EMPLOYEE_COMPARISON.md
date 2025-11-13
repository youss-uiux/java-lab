# Comparaison Employee : Sans Lombok vs Avec Lombok

## 📊 Vue d'ensemble

Ce dossier contient une démonstration pratique de la puissance de Lombok en comparant deux versions identiques d'une classe `Employee` :

| Classe | Lignes de code | Annotations Lombok | Fonctionnalités |
|--------|----------------|-------------------|-----------------|
| **Employee.java** | 95 lignes | ❌ Aucune | Getters, Setters, equals(), hashCode(), toString(), constructeurs |
| **EmployeeLombok.java** | 26 lignes | ✅ @Data, @Builder, @NoArgsConstructor, @AllArgsConstructor | **Exactement les mêmes** + Pattern Builder |

**Réduction de code : 72% ! 🎉**

## 📁 Fichiers

### 1. `Employee.java` (Version classique - 95 lignes)
Classe traditionnelle écrite manuellement avec tout le code boilerplate :
- ✍️ 4 getters écrits manuellement
- ✍️ 4 setters écrits manuellement
- ✍️ equals() écrit manuellement (15 lignes)
- ✍️ hashCode() écrit manuellement (7 lignes)
- ✍️ toString() écrit manuellement (8 lignes)
- ✍️ 2 constructeurs écrits manuellement

### 2. `EmployeeLombok.java` (Version Lombok - 26 lignes)
Même classe avec les annotations Lombok :
```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLombok {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
```

**C'est tout !** Lombok génère automatiquement tout le reste à la compilation.

### 3. `EmployeeComparison.java`
Programme de démonstration qui montre que les deux versions ont exactement les mêmes fonctionnalités.

## 🚀 Exécution de la démonstration

```bash
# Compiler le projet
mvn clean compile

# Exécuter la comparaison
mvn exec:java -Dexec.mainClass="com.javalab.demos.lombokdemo.EmployeeComparison"
```

## 📖 Annotations Lombok expliquées

### `@Data`
Génère automatiquement :
- Tous les **getters** pour tous les champs
- Tous les **setters** pour tous les champs non-final
- Une méthode **equals()** qui compare tous les champs
- Une méthode **hashCode()** cohérente avec equals()
- Une méthode **toString()** qui affiche tous les champs

### `@Builder`
Génère le pattern Builder :
```java
EmployeeLombok emp = EmployeeLombok.builder()
    .firstName("John")
    .lastName("Doe")
    .age(30)
    .email("john@example.com")
    .build();
```

### `@NoArgsConstructor`
Génère un constructeur sans paramètre :
```java
public EmployeeLombok() {}
```

### `@AllArgsConstructor`
Génère un constructeur avec tous les paramètres :
```java
public EmployeeLombok(String firstName, String lastName, int age, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.email = email;
}
```

## ✅ Avantages de Lombok

1. **Moins de code** : 72% de réduction de lignes
2. **Plus maintenable** : Un seul endroit où définir les champs
3. **Moins d'erreurs** : Pas de risque d'oublier un champ dans equals() ou hashCode()
4. **Plus productif** : Focus sur la logique métier, pas le boilerplate
5. **Code plus lisible** : Les intentions sont claires avec les annotations
6. **Refactoring facile** : Ajouter/supprimer un champ = modifier une ligne

## ⚠️ Points d'attention

- **Builder immutable** : Préférer `@Value` + `@Builder` pour des objets immutables
- **Héritage** : Utiliser `@EqualsAndHashCode(callSuper = true)` avec des classes parentes
- **Logs** : Utiliser `@Slf4j` pour ajouter un logger automatiquement
- **Configuration IDE** : Installer le plugin Lombok dans votre IDE

## 🎓 Pour les étudiants

Cette démonstration montre que :
1. **Le code boilerplate est répétitif et ennuyeux** → Lombok l'élimine
2. **Plus de code = Plus de bugs potentiels** → Moins de code = Plus de qualité
3. **Les outils modernes existent pour nous faciliter la vie** → Utilisez-les !

**Question** : Quelle version préférez-vous maintenir : 95 lignes ou 26 lignes ? 🤔

## 📚 Ressources

- [Documentation officielle Lombok](https://projectlombok.org/)
- [Liste complète des annotations](https://projectlombok.org/features/)
- [Guide des bonnes pratiques](https://projectlombok.org/features/delombok)

