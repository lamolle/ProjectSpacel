# ProjectSpacel
Spacel est une plate-forme sémantique de formation multimédia permettant la personnalisation de parcours adaptatif et collaboratif fondée sur des ontologies et orchestrée par un système multi-agents (SMA) sémantique .
Pour la realisation de ce projet, il est nécessaire d’avoir des modèles ontologiques pour représenter les profils-utilisateurs et les formations mais aussi afin de guider les utilisateurs par un SMA permettant d’interroger les ontologies,construire ou recommander des parcours et des ressources pédagogiques adaptés, synchroniser les utilisateurs quand ils souhaitent collaborer avec d’autres apprenants.
# Composants
 #Les ontolgies
(1)l’ontologie des profils-utilisateur (UPO) qui contient les in-formations personnelles et les préférences de tout utilisateurainsi que ses compétences initiales ou acquises avec SPACe-L et les parcours d’apprentissage personnalisés faits ou en cours .
(2)l’ontologie des domaines de formation (TO) décrivant lescompétences à acquérir pour un métier, les objets et lesressources pédagogiques disponibles permettant de constru-ire des parcours de de formation .
 #Le systemes multi-agents
 Pour la gestion et la maintenance des événements captés par notre plate-forme une architectute de SMAs est mis en place comme suit:
 (1) Un Agent Managerqui analyse les requêtes reçues et gère lasituation selon la nature de la requête. Il joue un doublerôle selon la situation d’apprentissage, soit individuelle parl’intermédiaire d’un agent de recommandation, soit collabo-rative. Il gère alors un réseau d’agents de recommandationpour la synchronisation des apprenants.
 (2) le Recommandation Agent(RA) ou agent de recommanda-tion va s’occuper de la génération du parcours personnalisé sous la forme d’un graphe en associant des ressources péd-agogiques pertinentes à chaque noeud. La génération dugraphe se fait en fonction du profil-utilisateur et la recom-mandation des ressources pédagogiques en fonction de plu-sieurs critères dont les préférences des apprenants, la duréede  la  session,  des  évaluations  qualitatives  des  autres  ap-prenants ou formateurs.
 
