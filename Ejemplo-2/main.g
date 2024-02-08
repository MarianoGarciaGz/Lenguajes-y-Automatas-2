//! nombre del archivo, en este caso "main"
grammar main; 


// imports que se quieran incluir
@header {}

// datos miembros que se quieran incluir en el parser
@menbers {}

// * reglas gramaticales siempre en minusculas
init: id*;
id : ID;
// * reglas lexicas siempre en mayusculas
ID : ('a' ..'z' | 'A' ..'Z' )+;
WS : (' '|'\n'|'\t'|'\r')+{$channel=HIDDEN;};