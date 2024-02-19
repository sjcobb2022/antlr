{ stdenv, jdk, antlr, makeWrapper, just, ant }:

stdenv.mkDerivation {
  name = "Antlr Build";
  src = ./.;

  nativeBuildInputs = [ jdk ant antlr just makeWrapper ];

  buildPhase = ''
    antlr -o src Imp.g4 -visitor 
    javac -d build src/*.java     
  '';

  installPhase = ''
    mkdir -p $out/bin
    cp -r build/* $out/bin
    
    makeWrapper ${jdk}/bin/java org.antlr.v4.gui.TestRig \
  '';

}
