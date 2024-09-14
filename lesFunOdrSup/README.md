### Des fonctions particulières
#### Ecrire une expression lambda
D'un côté, les paramètres de la fonction anonyme qui compose l'expression lambda, en les séparant par une virgule, et de l'autre côté, le traitement à appliquer à ces paramètres.<br>
C'est deux parties qui compose l'expression lambda sont séparée par l'opérateur ->, et tout vient entre accolade.

Première étape fonction anonyme:
```
val hello = fun(){
    println("Hello!")
    }
```
Deusième étape lambda:
```
val hello = { () -> println("Hello!") }
```
Troisième étape lambda:
```
val hello = { println("Hello!") }
```
Faire une boucle sur une liste avec forEach()
```
forEach(action: (T) -> Unit)
```
Le lambda est exécuté pour le premier élément, puis pour le deuxième, et ainsi de suite pour chaque élément de la collection.<br>
T correspond au type de données que contient la collection.