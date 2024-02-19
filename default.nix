{ stdenv, jdk, antlr }:

stdenv.mkDerivation {
  name = "Antlr Build";
  src = ./.;

  nativeBuildInputs = [ jdk antlr ];

  buildPhase = ''
      	antlr -o src Imp.g4
    	  javac -d build src/*.java

  '';

  installPhase = '''';

}
