/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IClass extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.CLASS.CLASS</code>.
	 */
	public void setClass_(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.CLASS.CLASS</code>.
	 */
	public java.lang.Integer getClass_();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IClass
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IClass from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IClass
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IClass> E into(E into);
}
