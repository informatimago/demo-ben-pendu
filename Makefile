all:pendu1.jar pendu.jar

pendu1.jar:pendu1/pendu1.class
	jar cfe pendu1.jar pendu1.pendu1 pendu1/pendu1.class

pendu.jar:pendu/pendu.class
	jar cfe pendu.jar pendu.pendu pendu/pendu.class

%.class:%.java
	javac $<

run1:pendu1.jar
	java -jar pendu1.jar

run:pendu.jar
	java -jar pendu.jar

clean:
	-find . \( -name '*.class' -o -name '*.jar' \) -exec rm -f {} \;

