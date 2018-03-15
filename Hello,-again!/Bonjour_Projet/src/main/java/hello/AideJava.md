# java, c'est pas de la menthe à l'eau

**tous vos noms de classes doivent commencer par une majuscule ;**

**tous vos noms de variables doivent commencer par une minuscule ;**

-si le nom d'une variable est composé de plusieurs mots, le premier commence par une minuscule, le ou les autres par une majuscule, et ce, sans séparation ;
tout ceci sans accentuation !
Les opérateurs arithmétiques sont ceux que l'on apprend à l'école primaire… ou presque :

|opérareur|fonction|
|:---:|:---:|
|« + » :| permet d'additionner deux variables numériques (mais aussi de concaténer des chaînes de caractères ; ne vous inquiétez pas, on aura l'occasion d'y revenir).|
|« - » :| permet de soustraire deux variables numériques.|
|« * » : |permet de multiplier deux variables numériques.|
|« / » : |permet de diviser deux variables numériques (mais je crois que vous aviez deviné).|
|« % » : |permet de renvoyer le reste de la division entière de deux variables de type numérique ; cet opérateur s'appelle le modulo.|
# Les variables de type numérique

## Variables de type simple ou « primitif »

|Type de la variable|Description|exemple
|:---:|:---:|:---:|
|Le typebyte(1 octet)| peut contenir les entiers entre -128 et +127.|`byte temperature; temperature = 64;`|
|Le typeshort(2 octets)| contient les entiers compris entre -32768 et +32767.|`short vitesseMax;vitesseMax = 32000;`
|Le typeint(4 octets)| va de -2*109 à 2*109 (2 et 9 zéros derrière… ce qui fait déjà un joli nombre).|`int temperatureSoleil; temperatureSoleil = 15600000;` //La température est exprimée en kelvins
|Le type long (8 octets)| peut aller de −9×1018  à 9×1018 (encore plus gros…).|`long anneeLumiere; anneeLumiere = 9460700000000000L;`
|Le typefloat(4 octets)| est utilisé pour les nombres avec une virgule flottante.|`float pi;pi = 3.141592653f;`
|Le typedouble(8 octets)| est identique àfloat, si ce n'est qu'il contient plus de chiffres derrière la virgule et qu'il n'a pas de suffixe.|`double division; division = 0.333333333333333333333333333333333333333333334d;`|
|Le typechar|contient un caractère stocké entre apostrophes (« ' ' »),| comme ceci : `char caractere; caractere = 'A';`|
|Le type boolean|lui, ne peut contenir que deux valeurs  :true(vrai) oufalse(faux), sans guillemets (ces valeurs sont natives dans le langage, il les comprend directement et sait les interpréter).|`boolean question; question = true;`|
|Le type String permet de gérer les chaînes de caractères, c'est-à-dire le stockage de texte.|Il s'agit d'une variable d'un type plus complexe que l'on appelle objet. Vous verrez que celle-ci s'utilise un peu différemment des variables précédentes :|//Première méthode de déclaration `String phrase; phrase = "Titi et Grosminet";`//Deuxième méthode de déclaration`String str = new String(); str = "Une autre chaîne de caractères";`//Troisième méthode de déclaration `String string = "Une autre chaîne`; //Quatrième méthode de déclaration`String chaine = new String("Et une de plus !");`|
**Attention : String commence par une majuscule ! Et lors de l'initialisation, on utilise des guillemets doubles (« " " »).**

# Ensuite
Pour afficher le contenu d'une variable dans la console, appelez l'instruction `System.out.println(maVariable);`, ou encore `System.out.print(maVariable);`

***Les variables d'instance*** : ce sont elles qui définiront les caractéristiques de notre objet.

***Les variables de classe***: celles-ci sont communes à toutes les instances de votre classe.

***Les variables locales***: ce sont des variables que nous utiliserons pour travailler dans notre objet.