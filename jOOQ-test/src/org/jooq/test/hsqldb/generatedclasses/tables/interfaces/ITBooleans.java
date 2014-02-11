/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITBooleans extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.ID</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.ONE_ZERO</code>.
	 */
	public void setOneZero(org.jooq.test._.converters.Boolean_10 value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.ONE_ZERO</code>.
	 */
	public org.jooq.test._.converters.Boolean_10 getOneZero();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.TRUE_FALSE_LC</code>.
	 */
	public void setTrueFalseLc(org.jooq.test._.converters.Boolean_TF_LC value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.TRUE_FALSE_LC</code>.
	 */
	public org.jooq.test._.converters.Boolean_TF_LC getTrueFalseLc();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.TRUE_FALSE_UC</code>.
	 */
	public void setTrueFalseUc(org.jooq.test._.converters.Boolean_TF_UC value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.TRUE_FALSE_UC</code>.
	 */
	public org.jooq.test._.converters.Boolean_TF_UC getTrueFalseUc();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.YES_NO_LC</code>.
	 */
	public void setYesNoLc(org.jooq.test._.converters.Boolean_YES_NO_LC value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.YES_NO_LC</code>.
	 */
	public org.jooq.test._.converters.Boolean_YES_NO_LC getYesNoLc();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.YES_NO_UC</code>.
	 */
	public void setYesNoUc(org.jooq.test._.converters.Boolean_YES_NO_UC value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.YES_NO_UC</code>.
	 */
	public org.jooq.test._.converters.Boolean_YES_NO_UC getYesNoUc();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.Y_N_LC</code>.
	 */
	public void setYNLc(org.jooq.test._.converters.Boolean_YN_LC value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.Y_N_LC</code>.
	 */
	public org.jooq.test._.converters.Boolean_YN_LC getYNLc();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.Y_N_UC</code>.
	 */
	public void setYNUc(org.jooq.test._.converters.Boolean_YN_UC value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.Y_N_UC</code>.
	 */
	public org.jooq.test._.converters.Boolean_YN_UC getYNUc();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.VC_BOOLEAN</code>.
	 */
	public void setVcBoolean(java.lang.Boolean value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.VC_BOOLEAN</code>.
	 */
	public java.lang.Boolean getVcBoolean();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.C_BOOLEAN</code>.
	 */
	public void setCBoolean(java.lang.Boolean value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.C_BOOLEAN</code>.
	 */
	public java.lang.Boolean getCBoolean();

	/**
	 * Setter for <code>PUBLIC.T_BOOLEANS.N_BOOLEAN</code>.
	 */
	public void setNBoolean(java.lang.Boolean value);

	/**
	 * Getter for <code>PUBLIC.T_BOOLEANS.N_BOOLEAN</code>.
	 */
	public java.lang.Boolean getNBoolean();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITBooleans
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBooleans from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITBooleans
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBooleans> E into(E into);
}
