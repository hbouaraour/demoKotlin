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