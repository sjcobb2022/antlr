build:
	@echo "Building..."
	antlr -o src Imp.g4
	javac -d build src/*.java

visitor:
	@echo "Running visitors..."
	antlr -o src Imp.g4 -visitor
	javac -d build src/*.java

gui START_SYMBOL:
	@echo "Running GUI..."
	cd build; grun Imp {{ START_SYMBOL }} -gui < ../input.txt
