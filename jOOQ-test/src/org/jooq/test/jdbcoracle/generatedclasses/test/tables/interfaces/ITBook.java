/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITBook extends java.io.Serializable {

	/**
	 * Setter for <code>TEST.T_BOOK.ID</code>. 
	 */
	public void setId(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_BOOK.ID</code>. 
	 */
	public java.math.BigDecimal getId();

	/**
	 * Setter for <code>TEST.T_BOOK.AUTHOR_ID</code>. 
	 */
	public void setAuthorId(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_BOOK.AUTHOR_ID</code>. 
	 */
	public java.math.BigDecimal getAuthorId();

	/**
	 * Setter for <code>TEST.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public void setCoAuthorId(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public java.math.BigDecimal getCoAuthorId();

	/**
	 * Setter for <code>TEST.T_BOOK.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_BOOK.DETAILS_ID</code>. 
	 */
	public java.math.BigDecimal getDetailsId();

	/**
	 * Setter for <code>TEST.T_BOOK.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value);

	/**
	 * Getter for <code>TEST.T_BOOK.TITLE</code>. 
	 */
	public java.lang.String getTitle();

	/**
	 * Setter for <code>TEST.T_BOOK.PUBLISHED_IN</code>. 
	 */
	public void setPublishedIn(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_BOOK.PUBLISHED_IN</code>. 
	 */
	public java.math.BigDecimal getPublishedIn();

	/**
	 * Setter for <code>TEST.T_BOOK.LANGUAGE_ID</code>. 
	 */
	public void setLanguageId(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_BOOK.LANGUAGE_ID</code>. 
	 */
	public java.math.BigDecimal getLanguageId();

	/**
	 * Setter for <code>TEST.T_BOOK.CONTENT_TEXT</code>. 
	 */
	public void setContentText(java.lang.String value);

	/**
	 * Getter for <code>TEST.T_BOOK.CONTENT_TEXT</code>. 
	 */
	public java.lang.String getContentText();

	/**
	 * Setter for <code>TEST.T_BOOK.CONTENT_PDF</code>. 
	 */
	public void setContentPdf(byte[] value);

	/**
	 * Getter for <code>TEST.T_BOOK.CONTENT_PDF</code>. 
	 */
	public byte[] getContentPdf();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITBook
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBook from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITBook
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBook> E into(E into);
}
