# Project Spacel
# SPACeL
## Introduction {#intro-id}
Le projet SPACeL (Semantic Platform for Adaptative and Collaborative e-Learning) a pour but de créer une plateforme d'apprentissage adaptatif et collaboratif en proposant des formations à des métiers pour acquérir les compétences inhérentes. Dans le cas des métiers manuels, l'apprentissage des gestes se fera principalement grâce à des vidéos.

Cette plateforme propose des parcours personnalisés en apprentissage individuel ou en collaboration.

## Description de la plateforme {#descritpion-id}
SPACeL est fondée sur :
- un réseau d'ontologies : l'ontologie des profils-utilisateurs, l'ontologie des domaines de formation et l'ontologie des vidéos ;
- un système multi-agents : pour réprésenter chaque utilisateur (apprenants, tuteurs, experts, formateurs, etc.).

<img src="SMA_v2.jpg" alt="Architecture de la plateforme" width="40%">


## Présentation des ontologies {#ontologies-id}
Les ontologies sont écrites dans le langage OWL. Pour l'instant, elles sont interrogées par des requêtes écrites en langage SPARQL.
### UPO (User-Profile Ontology) {#UPO-id}
Cette ontologie contient les profils des utilisateurs dont des informations personnelles (nom, prénom, âge, langues préférées, etc.), tous les parcours pédagogiques réalisés ou en cours de réalisation, les évaluations concernant les utlisateurs, les évaluations des ressources pédagogiques, parcours, etc.

### TO (Training Ontology) {#TO-id}
Cette ontologie contient toutes les formations définies par des formateurs ou experts. Par exemple, pour le métier de pâtissier, différentes formations sont possibles avec différents parcours définis par des grains pédagogiques. Des ressources pédagogiques sont associées à chaque grain.

### VO (Video Ontology) {#TO-id}
Cette ontologie contient une description de toutes les vidéos déposées sur la plateforme ou accessibles sur d'autres plateformes comme YouTube.


## Présentation du Systèmes Multi-Agents {#SMA-id}
- L'"Agent Manager" (AM) gère les cycles de vie des agents de recommandation de parcours personnalisé. Ainsi, pour chaque objet d'apprentissage choisi, s’il ne l'a pas encore fait, le composant crée un agent de recommandation. L’agent créé sera détruit par l'\textbf{AM} dès qu’il n’y aura plus d'apprenant sur sa file d’attente.
- Les "Recomendation Agent" (RA) gèrent la synchronisation entre les apprenants et assurent le bon déroulement des parcours en évitant les cas critiques qui peuvent être créés au cours de la session d’apprentissage. Ainsi, chaque RA gère une file d’attente d'apprenants sur un objet d’apprentissage lors de parcours de formation.
- L'agent "Critical Case Management Agent" (CCMA) a comme tâche de trouver une solution au problème de cas critique. Par exemple, en mode collaboratif, un apprenant est supposé en cas critique après l'expiration de sa durée d'attente permise sans que l’agent lui trouve un groupe pour collaborer. Un tel cas peut se produire par absence d'apprenants sur l’objet d’apprentissage ou à cause de l'hétérogénéité des profils des apprenants. 
