/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -847580542;

	/**
	 * The singleton instance of v_author
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.ingres.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord> __RECORD_TYPE = org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		super("v_author", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}
}
