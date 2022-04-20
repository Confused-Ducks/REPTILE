grammar Grammar;

s               :       importStmt* Begin dcl* cmdStmt? gameLoop End EOF
                ;

dcl             :       playerDcl
                |       levelDcl
                |       entityDcl
                |       COMMENT
                |       LINE_COMMENT
                ;

importStmt      :       Import LessThan ID FileType GreaterThan
                ;

cmdStmt         :       Command LBRACE Actions* RBRACE
                ;

iterativeStmt   :       For LPAREN Tile COLON Tiles RPAREN LBRACE controlStmt* RBRACE
                ;

controlStmt     :       If LPAREN bexpr RPAREN LBRACE placement* RBRACE
                |       If LPAREN bexpr RPAREN LBRACE placement* RBRACE Else LBRACE placement* RBRACE
                ;

playerDcl       :       Player LBRACE attr+ RBRACE
                ;

attr            :       Lives COLON DIGIT
                ;

levelDcl        :       LevelDesign LBRACE levels+ RBRACE
                ;

levels          :       levelName size LBRACE placement* RBRACE
                ;

size            :       LPAREN DIGIT COMMA DIGIT RPAREN
                ;

placement       :       place
                |       iterativeStmt
                |       controlStmt
                |       rspnd
                ;

place           :       Place LPAREN ID (PERIOD ID)? LPAREN (DIGIT | DIGIT COLON DIGIT | STRING) RPAREN RPAREN location
                |       Place LPAREN (Entrance | Wall | gate | ID) RPAREN location
                ;

entityDcl       :       Entities LBRACE entities* RBRACE
                ;

entities        :       ID AssignOprt (enemy | item)
                ;

enemy           :       Enemy LPAREN DIGIT COMMA DIGIT (COMMA STRING)? RPAREN
                ;

item            :       Item LPAREN STRING COMMA (DIGIT | DIGIT COLON DIGIT) RPAREN
                ;

bexpr           :       bexpr logoprt bterm
                |       bterm
                ;

bterm           :       bterm reloprt baexpr
                |       baterm
                ;

baexpr          :       baexpr asoprt baterm
                |       baterm
                ;

baterm          :       baterm mmdoprt bfactor
                |       bfactor
                ;

bfactor         :       LPAREN bexpr RPAREN
                |       condexpr
                ;

condexpr        :       aexpr
                |       Tile
                |       tileXY
                |       PlayerPosition
                |       coordinate
                |       ID
            //  |       tilestate
                ;

aexpr           :       aexpr asoprt term
                |       term
                ;

term            :       term mmdoprt factor
                |       factor
                ;

factor          :       LPAREN aexpr RPAREN
                |       DIGIT
                ;

logoprt         :       (AndOprt | OrOprt)
                ;

reloprt         :       (CompareOprt | GreaterOrEqual | LessOrEqual | LessThan | GreaterThan | CompareOprt | NotOprt)
                ;

asoprt          :       (AddOprt | SubOprt)
                ;

mmdoprt         :       (MultiOprt | DivOprt | ModOprt)
                ;

rspnd           :       Print STRING
                ;

location        :       ON (coordinate | Tile)
                ;

gameLoop        :       Game LPAREN levelName RPAREN LBRACE placement* RBRACE
                ;

coordinate      :       LPAREN DIGIT COMMA DIGIT RPAREN
                ;

tileXY          :       Tile PERIOD (COORDINATEX | COORDINATEY)
                ;

levelName       :       Level ID
                ;

gate            :       Gate LPAREN (levelName | Finish) RPAREN
                ;

Begin           :       'begin'
                ;

End             :       'end'
                ;

For             :       'for'
                ;

If              :       'if'
                ;

Else            :       'else'
                ;

Import          :       'import'
                ;

Quotes          :       '"'
                ;

FileType        :       '.rpt'
                ;

Player          :       'Player'
                ;

Lives           :       'Lives'
                ;

LevelDesign     :       'LevelDesign'
                ;

Entities        :       'Entities'
                ;

Game            :       'Game'
                ;

Enemy           :       'Enemy'
                ;

Item            :       'Item'
                ;

Place           :       'place'
                ;

Wall            :       'Wall'
                ;

Entrance        :       'Entrance'
                ;

Print           :       'Print'
                ;

Command         :       'Command'
                ;

ON              :       'on'
                ;

Level           :       'level-'
                ;

Gate            :       'Gate'
                ;

Finish          :       'Finish'
                ;

Actions         :       ('move' | 'take' | 'attack' | 'equip' | 'status') // opdater grammatik
                ;

Tile            :       'Tile'
                ;

COORDINATEX     :       'x'
                ;

COORDINATEY     :       'y'
                ;

Tiles           :       'Tiles'
                ;

PlayerPosition  :       'PlayerPosition'
                ;

AddOprt         :       '+'
                ;

SubOprt         :       '-'
                ;

MultiOprt       :       '*'
                ;

DivOprt         :       '/'
                ;

ModOprt         :       '%'
                ;

AssignOprt      :       '='
                ;

LessThan        :       '<'
                ;

GreaterThan     :       '>'
                ;

GreaterOrEqual  :       '>='
                ;

LessOrEqual     :       '<='
                ;

AndOprt         :       'and'
                ;

NotOprt         :       'not'
                ;

OrOprt          :       'or'
                ;

CompareOprt     :       'is'
                ;

LBRACE          :       '{'
                ;

RBRACE          :       '}'
                ;

LPAREN          :       '('
                ;

RPAREN          :       ')'
                ;

COMMA           :       ','
                ;

PERIOD          :       '.'
                ;

SEMICOLON       :       ';'
                ;

COLON           :       ':'
                ;

DIGIT           :       [0-9]+
                ;

ID              :       IDe
                ;

fragment IDe    :       [a-zA-Z_][a-zA-Z_0-9]*
                ;

STRING			: 		'"'~["]*'"'
                ;

DAMAGE          :       'Damage'
                ;

COMMENT         :       '/*' .*? '*/' -> skip
                ;

LINE_COMMENT    :       '//' ~[\r\n]* -> skip
                ;

WS              :       [ \t\r\n] -> channel(HIDDEN)
                ;

