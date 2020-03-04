# Makefile template: https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html

JC = javac

.SUFFIXES:	.java .class

.java.class:
	$(JC) $*.java

CLASSES = \
  Main.java \
	UserPanel.java \
	ViewLibrary.java \
	SearchTab.java

default:	classes

classes:	$(CLASSES:.java=.class)

clean:
	rm -f *.class
