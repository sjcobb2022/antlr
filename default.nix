{ stdenv, jdk, jre, antlr, makeWrapper, just }:

stdenv.mkDerivation {
  name = "Antlr Build";
  src = ./.;

  nativeBuildInputs = [ jdk antlr just makeWrapper jre ];

  buildPhase = ''
    just build
  '';

  installPhase = ''
    mkdir -p $out/bin
    cp -r build/* $out/bin
    alias grun='java  -cp $out/bin'
    makeWrapper ${jre}/bin/java org.antlr.v4.runtime.misc.TestRig \
    --add-flags "-cp $out/bin"
  '';

}
