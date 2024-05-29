# Variables
JAVAC = javac
JAVA = java
SRC_DIR = ../src
TARGET_DIR = .

# Packages
MODEL_PKG = modele
VIEW_PKG = vue
CONTROLLER_PKG = controleur

# Classes
MODEL_CLASSES = Baleine.java Bateau.java Case.java Clavier.java De.java Effet.java Explorateur.java Joueur.java Marin.java Pion.java Plateau.java Requin.java SerpentMer.java Terrain.java Tuile.java Type_couleur.java Type_effet.java
VIEW_CLASSES = Fenetre.java Grille.java Menu.java MenuPseudo.java Vue.java VueMainJoueur.java VuePions.java ZonePasser.java ZonePreview.java ZoneText.java
CONTROLLER_CLASSES = Controleur.java

# Targets
.PHONY: all run clean

all: $(TARGET_DIR) $(TARGET_DIR)/Controleur.class

# Create target directory
$(TARGET_DIR):
	mkdir -p $(TARGET_DIR)

# Copy source files to target
$(TARGET_DIR)/%.java: $(SRC_DIR)/$(MODEL_PKG)/%.java | $(TARGET_DIR)
	cp $< $@

$(TARGET_DIR)/%.java: $(SRC_DIR)/$(VIEW_PKG)/%.java | $(TARGET_DIR)
	cp $< $@

$(TARGET_DIR)/%.java: $(SRC_DIR)/$(CONTROLLER_PKG)/%.java | $(TARGET_DIR)
	cp $< $@

# Compile model classes
$(TARGET_DIR)/Baleine.class: $(TARGET_DIR)/Baleine.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Bateau.class: $(TARGET_DIR)/Bateau.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Case.class: $(TARGET_DIR)/Case.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Clavier.class: $(TARGET_DIR)/Clavier.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/De.class: $(TARGET_DIR)/De.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Effet.class: $(TARGET_DIR)/Effet.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Explorateur.class: $(TARGET_DIR)/Explorateur.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Joueur.class: $(TARGET_DIR)/Joueur.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Marin.class: $(TARGET_DIR)/Marin.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Pion.class: $(TARGET_DIR)/Pion.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Plateau.class: $(TARGET_DIR)/Plateau.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Requin.class: $(TARGET_DIR)/Requin.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/SerpentMer.class: $(TARGET_DIR)/SerpentMer.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Terrain.class: $(TARGET_DIR)/Terrain.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Tuile.class: $(TARGET_DIR)/Tuile.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Type_couleur.class: $(TARGET_DIR)/Type_couleur.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Type_effet.class: $(TARGET_DIR)/Type_effet.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Fenetre.class: $(TARGET_DIR)/Fenetre.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Grille.class: $(TARGET_DIR)/Grille.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Menu.class: $(TARGET_DIR)/Menu.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/MenuPseudo.class: $(TARGET_DIR)/MenuPseudo.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Vue.class: $(TARGET_DIR)/Vue.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/VueMainJoueur.class: $(TARGET_DIR)/VueMainJoueur.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/VuePions.class: $(TARGET_DIR)/VuePions.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/ZonePasser.class: $(TARGET_DIR)/ZonePasser.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/ZonePreview.class: $(TARGET_DIR)/ZonePreview.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/ZoneText.class: $(TARGET_DIR)/ZoneText.java
	$(JAVAC) -d $(TARGET_DIR) $<

$(TARGET_DIR)/Controleur.class: $(TARGET_DIR)/Controleur.java
	$(JAVAC) -d $(TARGET_DIR) -cp $(TARGET_DIR) $<

clean:
	rm -rf $(TARGET_DIR)/*

run: all
	$(JAVA) -cp $(TARGET_DIR) Controleur
