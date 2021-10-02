/**
 * 
 *
 */
public class NodeMulop extends Node {

    private String mulop;

    public NodeMulop(int pos, String mulop) {
	this.pos=pos;
	this.mulop=mulop;
    }

    
    /**
     * @param o1 first int operand
     * @param o2 second int operand
     * @return int value of o1/o2 or o1 * o1
     * @throws EvalException
     */
    public int op(int o1, int o2) throws EvalException {
	if (mulop.equals("*"))
	    return o1*o2;
	if (mulop.equals("/"))
	    return o1/o2;
	throw new EvalException(pos,"bogus mulop: "+mulop);
    }

}
