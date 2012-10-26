/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TLanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1809770125;

	/**
	 * The table column <code>TEST.T_LANGUAGE.CD</code>
	 */
	public void setCd(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.CD, value);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.CD</code>
	 */
	public java.lang.String getCd() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.CD);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION</code>
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.DESCRIPTION, value);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION</code>
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.DESCRIPTION);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	public void setDescriptionEnglish(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH, value);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	public java.lang.String getDescriptionEnglish() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.ID, value);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.ID);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.derby.generatedclasses.tables.records.TBookRecord> fetchTBookList() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.derby.generatedclasses.tables.TBook.LANGUAGE_ID.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TLanguage.ID)))
			.fetch();
	}

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.test.derby.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}
}