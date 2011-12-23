/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -582387819;

	/**
	 * The singleton instance of v_book
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.sqlserver.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord> __RECORD_TYPE = org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.VARBINARY, this);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super("v_book", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * No further instances allowed
	 */
	private VBook(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.VBook.V_BOOK);
	}

	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.VBook as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.VBook(alias);
	}
}
