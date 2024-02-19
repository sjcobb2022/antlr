{ callPackage, jdk, antlr, just }:

let
  mainPkg = callPackage ./default.nix { };
in
mainPkg.overrideAttrs (oa: {
  nativeBuildInputs = [
    # Additional java tooling
    just
  ] ++ (oa.nativeBuildInputs or [ ]);
})
