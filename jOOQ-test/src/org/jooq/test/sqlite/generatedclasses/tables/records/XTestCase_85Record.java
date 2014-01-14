/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1184318339;

	/**
	 * Setter for <code>x_test_case_85.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>x_test_case_85.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>x_test_case_85.x_unused_id</code>. 
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>x_test_case_85.x_unused_id</code>. 
	 */
	public java.lang.Integer getXUnusedId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>x_test_case_85.x_unused_name</code>. 
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>x_test_case_85.x_unused_name</code>. 
	 */
	public java.lang.String getXUnusedName() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getXUnusedId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getXUnusedName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_85Record value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_85Record value2(java.lang.Integer value) {
		setXUnusedId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_85Record value3(java.lang.String value) {
		setXUnusedName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_85Record values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}

	/**
	 * Create a detached, initialised XTestCase_85Record
	 */
	public XTestCase_85Record(java.lang.Integer id, java.lang.Integer xUnusedId, java.lang.String xUnusedName) {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);

		setValue(0, id);
		setValue(1, xUnusedId);
		setValue(2, xUnusedName);
	}
}
