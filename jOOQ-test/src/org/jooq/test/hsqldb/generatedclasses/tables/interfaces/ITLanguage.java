/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITLanguage extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.CD</code>.
	 */
	public void setCd(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.CD</code>.
	 */
	public java.lang.String getCd();

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION</code>.
	 */
	public java.lang.String getDescription();

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>.
	 */
	public void setDescriptionEnglish(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>.
	 */
	public java.lang.String getDescriptionEnglish();

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.ID</code>.
	 */
	public java.lang.Integer getId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITLanguage
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITLanguage from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITLanguage
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITLanguage> E into(E into);
}
