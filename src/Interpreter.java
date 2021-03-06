// This is the main class/method for the interpreter.
// Each command-line argument is a complete program,
// which is scanned, parsed, and evaluated.
// All evaluations share the same environment,
// so they can share variables.
//test test 12 3
public class Interpreter {

    public static void main(String[] args) {
	Parser parser=new Parser();
	Environment env=new Environment();
	for (String stmt: args)
	    try {
	    	
	    	//stmt needs to be combined so that all args are evaluated together
		System.out.println(parser.parse(stmt).eval(env));
	    } catch (SyntaxException e) {
		System.err.println(e);
	    } catch (EvalException e) {
		System.err.println(e);
	    }
    }

}
