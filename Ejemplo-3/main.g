//! nombre del archivo, en este caso "main"
grammar main; 


// imports que se quieran incluir
@header {}

// datos miembros que se quieran incluir en el parser
@menbers {}

// * reglas gramaticales siempre en minusculas
init: id*;
id      : ID {System.out.println("ID reconocido: " + $ID.text);};
// * reglas lexicas siempre en mayusculas
ID      : ('a'..'z'|'A'..'Z'|'-')('a'..'z'|'A'..'Z'|'0'..'9'|'-')*;
WS : (' '|'\n'|'\t'|'\r')+{$channel=HIDDEN;};