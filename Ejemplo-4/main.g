grammar main;

@header{ // imports que se queiran incluir 
}

@members { // datos miembro que se quieran incluir en el parser
}

// * reglas gramaticales siempre en minusculas

init : (id|entero)*;
id  : ID {System.out.println("Reconocido Identificador "+$ID.text);} ;
entero : INT {System.out.println("Reconocido Entero "+$INT.text);} ;

// * reglas lexicas siempre en mayusculas
ID  : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
INT : ('0'..'9')+;
WS  : ('_'|'\n'|'\t'|'\r')+ { $channel=HIDDEN; } ;