/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the dbo schema
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.test.sqlserver.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> IDENTITY_t_identity = createIdentity(org.jooq.test.sqlserver.generatedclasses.tables.TIdentity.T_IDENTITY, org.jooq.test.sqlserver.generatedclasses.tables.TIdentity.T_IDENTITY.ID);
	public static final org.jooq.Identity<org.jooq.test.sqlserver.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> IDENTITY_t_identity_pk = createIdentity(org.jooq.test.sqlserver.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.sqlserver.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
	public static final org.jooq.Identity<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> IDENTITY_t_triggers = createIdentity(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_639NumbersTableRecord> pk_t_639_numbers_table = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.sqlserver.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord> pk_t_725_lob_test = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord> pk_t_author = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.sqlserver.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord> pk_t_book = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlserver.generatedclasses.tables.TBook.T_BOOK.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord> uk_t_book_store_name = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.sqlserver.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord> pk_b2bs = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord> pk_t_booleans = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.sqlserver.generatedclasses.tables.TBooleans.T_BOOLEANS.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TIdentityPkRecord> pk_t_identity_pk = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.sqlserver.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> pk_t_triggers = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record> pk_x_test_case_64_69 = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record> pk_x_test_case_71 = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record> pk_x_test_case_85 = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord> pk_x_unused = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.ID, org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord> uk_x_unused_id = createUniqueKey(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord> fk_t_book_author_id = createForeignKey(pk_t_author, org.jooq.test.sqlserver.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlserver.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord> fk_t_book_co_author_id = createForeignKey(pk_t_author, org.jooq.test.sqlserver.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlserver.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord> fk_b2bs_bs_name = createForeignKey(uk_t_book_store_name, org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord> fk_b2bs_b_id = createForeignKey(pk_t_book, org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord> fk_x_test_case_64_69 = createForeignKey(uk_x_unused_id, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record> fk_x_test_case_71 = createForeignKey(pk_x_test_case_64_69, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord> fk_x_test_case_85 = createForeignKey(pk_x_unused, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord> fk_x_unused_self = createForeignKey(pk_x_unused, org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.ID_REF, org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF);

	/**
	 * No instances
	 */
	private Keys() {}
}
