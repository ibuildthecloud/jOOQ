/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.functions;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class FormatType extends org.jooq.impl.StoredFunctionImpl<java.lang.String> {

	private static final long serialVersionUID = -67880102;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long> _1 = new org.jooq.impl.ParameterImpl<java.lang.Long>("_1", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("_2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new function call instance
	 */
	public FormatType() {
		super(org.jooq.SQLDialect.POSTGRES, "format_type", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 */
	public void set__1(java.lang.Long value) {
		setValue(_1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Long> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 */
	public void set__2(java.lang.Integer value) {
		setValue(_2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Integer> field) {
		setField(_2, field);
	}
}
