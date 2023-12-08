# TP noté sur les tests 

## Fichiers mis à disposition
Pour ce TP noté sur les tests, vous disposez des fichiers suivants

+ README.md                          ce fichier, qui vous indique ce qu'il faut faire.
+ **Direction.java**                 une classe java inspirée de celle à 4 directions de Luc Hernandez mais pour 8 directions.
+ Exemple.java                       des exemples d'uilisation de cette implémentation.
+ TestsFournisDirection.java         des tests fournis pour corriger Direction.java
+ **TestsACompleterDirection.java**  un fichier squelette de tests à compléter.
+ **Reponses.txt**                   un fichier texte à compléter

Seuls les fichiers dont les noms sont **en gras** ci-dessus sont à compléter et à rendre.
Pour les modalités, voir ci-dessous.

## Avant la premioère partie : questions 
aller compléter le fichier **Reponses.txt**

## Première partie : debug 
Un certains nombres de tests sont fournis. Vous ne devez pas changer ces derniers.
Vous devez exécuter ces tests puis changer le code de la classe **Direction** idéalement jusqu'à ce que les tests fournis soient satisfaits.

Chaque ligne de **Direction.java** changée devra être suivi du commentaire //BUGFIX éventuellement suivi de texte
Si il y a plusieurs bugs sur la ligne, vous pouvez les indiquez l'un après l'autre.

Par exemple : 
Pour 1 bug
> return (this.index); //BUGFIX enlevé +1
Pour 2 bugs
> if (a < b) { //BUGFIX remplacé <= par < //BUGFIX ajouté un crochet.

**Attention** Le correcteur utilise grep pour corriger et il faut suivre exactement la consigne ci-dessus sans peine de voir son travail évalué à 0.

## Seconde partie : test 
Vous devez compléter le fichier **TestsACompleterDirection.java**
Il n'est pas demandé de changer le code de **Direction.java** pour passer ces nouveaux tests.



## Modalité de rendu 
Vous devez rendre votre travail sur devoir
l'url est :
www.iut-fbleau.fr/site/site/DEVOIR/

Il faut pour ce faire soumettre une archive tests.tar.gz **contenant uniquement les deux fichiers .java** (on ne veut pas les .class) suivants, édités par vos soins comme indiqué dans les questions ci-dessus :
**Direction.java**
**TestsACompleterDirection.java**
**Reponses.txt**

Pour ceux qui ont oublié comment faire :

> bob@box:~$ tar czvvf tests.tar.gz Direction.java TestsACompleterDirection.java Reponses.txt 

