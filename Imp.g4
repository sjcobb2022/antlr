grammar Imp;

cmd : 'skip'                                                       # Skip 
    | VAR ':=' aexp                                                # Assignment
    | first=cmd ';' second=cmd                                     # Sequence
    | 'if' condition=bexp 'then' true=cmd 'else' false=cmd 'fi'    # If
    | 'while' condition=bexp 'do' body=cmd 'od'                    # While
    ;

aexp : INT                                                         # Atom
     | VAR                                                         # Variable
     | '(' inner=aexp ')'                                          # Brackets
     | left=aexp '*' right=aexp                                    # Multiplication
     | left=aexp '/' right=aexp                                    # Division
     | left=aexp '+' right=aexp                                    # Addition
     | left=aexp '-' right=aexp                                    # Subtraction
     ;

bexp : 'true'                                                      # True
     | 'false'                                                     # False
     | left=aexp '='  right=aexp                                   # Equals 
     | left=aexp '<'  right=aexp                                   # Smaller
     | left=aexp '>'  right=aexp                                   # Greater
     | left=aexp '<>' right=aexp                                   # Inequality
     | 'not' inner=bexp                                            # Not
     | '(' left=bexp 'and' right=bexp ')'                          # And 
     | '(' left=bexp 'or'  right=bexp ')'                          # Or
     ;

VAR : [a-zA-Z][a-zA-Z0-9_]* ;
INT : [0-9]+ ;
WS  : [ \r\n\t] -> skip ;
