/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F2502_1 extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 978129990;

	/**
	 * The parameter <code>PUBLIC.F2502_1.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2502_1.CONFIGURATION</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> CONFIGURATION = createParameter("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2502_1.CONFIGURATION_</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> CONFIGURATION_ = createParameter("CONFIGURATION_", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public F2502_1() {
		super("F2502_1", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(CONFIGURATION);
		addInParameter(CONFIGURATION_);
	}

	/**
	 * Set the <code>CONFIGURATION</code> parameter IN value to the routine
	 */
	public void setConfiguration(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2502_1.CONFIGURATION, value);
	}

	/**
	 * Set the <code>CONFIGURATION</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConfiguration(org.jooq.Field<java.lang.Integer> field) {
		setField(CONFIGURATION, field);
	}

	/**
	 * Set the <code>CONFIGURATION_</code> parameter IN value to the routine
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2502_1.CONFIGURATION_, value);
	}

	/**
	 * Set the <code>CONFIGURATION_</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConfiguration_(org.jooq.Field<java.lang.Integer> field) {
		setField(CONFIGURATION_, field);
	}
}
