# 📊 COMPARAISON VISUELLE : Lombok vs Sans Lombok

## 🔴 SANS Lombok - PersonWithoutLombok.java (130 lignes)

```java
public class PersonWithoutLombok {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    
    // Constructeur par défaut
    public PersonWithoutLombok() {
    }
    
    // Constructeur avec tous les paramètres
    public PersonWithoutLombok(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    
    // Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        PersonWithoutLombok that = (PersonWithoutLombok) o;
        
        if (age != that.age) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;
    }
    
    // hashCode()
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
    
    // toString()
    @Override
    public String toString() {
        return "PersonWithoutLombok{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
    
    // Builder pattern (version manuelle)
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        
        public PersonWithoutLombok build() {
            return new PersonWithoutLombok(firstName, lastName, age, email);
        }
    }
}
```

**📏 Total : ~130 lignes**
**⏱️ Temps d'écriture : ~15-20 minutes**
**🔧 Maintenance : Ajouter un champ = 7+ modifications**

---

## 🟢 AVEC Lombok - Person.java (21 lignes)

```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
}
```

**📏 Total : ~21 lignes**
**⏱️ Temps d'écriture : ~2 minutes**
**🔧 Maintenance : Ajouter un champ = 1 ligne**

---

## 💡 GAIN OBTENU

| Aspect | Réduction |
|--------|-----------|
| **Lignes de code** | **-84%** (de 130 à 21) |
| **Temps d'écriture** | **-90%** (de 20min à 2min) |
| **Complexité** | **-100%** (code généré automatiquement) |
| **Risque d'erreur** | **Drastiquement réduit** |
| **Lisibilité** | **Grandement améliorée** |

## 🎯 Fonctionnalités Identiques

Les deux classes offrent **EXACTEMENT** les mêmes fonctionnalités :

```java
// ✅ Les deux fonctionnent de la même manière !

// Sans Lombok
PersonWithoutLombok person1 = PersonWithoutLombok.builder()
    .firstName("Marie")
    .lastName("Martin")
    .age(28)
    .email("marie@example.com")
    .build();

// Avec Lombok
Person person2 = Person.builder()
    .firstName("Marie")
    .lastName("Martin")
    .age(28)
    .email("marie@example.com")
    .build();
```

## 🌟 Conclusion

Lombok génère **automatiquement** tout le code boilerplate :
- ✅ Getters / Setters
- ✅ Constructeurs
- ✅ equals() / hashCode()
- ✅ toString()
- ✅ Pattern Builder

**Résultat** : Plus de temps pour se concentrer sur la **logique métier** ! 🚀

