public class NodeAddop extends Node {

    private String addop;

    public NodeAddop(int pos, String addop) {
	this.pos=pos;
	this.addop=addop;
    }
    
    /**
     * @param o1 int value of the parsed string value       o1(+)o2
     * @param o2 int value of the second string value	
     * @return sum or diffrence of o1 + o2
     * @throws EvalException
     */
    public int op(int o1, int o2) throws EvalException {
	if (addop.equals("+"))
	    return o1+o2;
	if (addop.equals("-"))
	    return o1-o2;
	throw new EvalException(pos,"bogus addop: "+addop);
    }

}
