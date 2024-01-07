# binary search program makefile
# Hussein Suleman
# 27 March 2017
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

JAVAC=/usr/bin/javac
JAVA=/usr/bin/java

$(BINDIR)/%.class: $(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

CLASSES2=Vaccination.class VaccineArray.class RandomizeVaccines.class \
         BinaryTreeNode.class BTQueueNode.class \
         BTQueue.class BinaryTree.class \
         AVLTree.class AVLExperiment.class

CLASSES=$(CLASSES2:%.class=$(BINDIR)/%.class)

default: $(CLASSES)

run: $(CLASSES)
	$(JAVA) -cp $(BINDIR) AVLExperiment
	
clean:
	rm *.class
