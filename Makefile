PATH_TO_FX=lib/javafx-sdk-17.0.1/lib

SRC_DIR=src
BUILD_DIR=build

SOURCES=$(shell find $(SRC_DIR) -name *.java)

CLASSES=$(SOURCES:$(SRC_DIR)/%.java=$(BUILD_DIR)/%.class)

JAVAC=javac
JAVA=java

JAVAC_FLAGS=--module-path $(PATH_TO_FX) --add-modules javafx.controls -d $(BUILD_DIR)

default: compile run

compile: $(CLASSES)

$(BUILD_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(dir $@)
	$(JAVAC) $(JAVAC_FLAGS) $<

run:
	$(JAVA) --module-path $(PATH_TO_FX) --add-modules javafx.controls -cp $(BUILD_DIR) Main

clean:
	rm -rf $(BUILD_DIR)
