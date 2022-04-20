import antlr.*;
import ASTNodes.*;
import ASTVisitors.*;
import org.antlr.v4.runtime.*;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

public class ExecuteAST {

    public static void main(String[] args) throws IOException {

        CharStream input = CharStreams.fromFileName("src\\main\\java\\mvp.txt");

        GrammarLexer lexer;
        CommonTokenStream tokens;
        GrammarParser parser;

        lexer = new GrammarLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new GrammarParser(tokens);

        GrammarParser.SContext cst = parser.s();

        ASTbuilder builder = new ASTbuilder();

        ASTNode root = builder.visitS(cst);

        Prettyprinter pp = new Prettyprinter();

        root.accept(pp);
    }
}