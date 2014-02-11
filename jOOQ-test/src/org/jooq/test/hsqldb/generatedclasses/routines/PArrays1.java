/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PArrays1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1027544982;

	/**
	 * The parameter <code>PUBLIC.P_ARRAYS1.IN_ARRAY</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * The parameter <code>PUBLIC.P_ARRAYS1.OUT_ARRAY</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> OUT_ARRAY = createParameter("OUT_ARRAY", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PArrays1() {
		super("P_ARRAYS1", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.PArrays1.IN_ARRAY, value);
	}

	/**
	 * Get the <code>OUT_ARRAY</code> parameter OUT value from the routine
	 */
	public java.lang.Integer[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
