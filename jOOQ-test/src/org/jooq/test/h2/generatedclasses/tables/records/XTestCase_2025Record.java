/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record> implements org.jooq.Record2<java.lang.Integer, java.lang.String>, org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025 {

	private static final long serialVersionUID = 1498127373;

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_2025.REF_ID</code>.
	 */
	@Override
	public void setRefId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_2025.REF_ID</code>.
	 */
	@Override
	public java.lang.Integer getRefId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	@Override
	public void setRefName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	@Override
	public java.lang.String getRefName() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_2025.REF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_2025.REF_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRefId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getRefName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_2025Record value1(java.lang.Integer value) {
		setRefId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_2025Record value2(java.lang.String value) {
		setRefName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_2025Record values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025 from) {
		setRefId(from.getRefId());
		setRefName(from.getRefName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_2025Record
	 */
	public XTestCase_2025Record() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025);
	}

	/**
	 * Create a detached, initialised XTestCase_2025Record
	 */
	public XTestCase_2025Record(java.lang.Integer refId, java.lang.String refName) {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025);

		setValue(0, refId);
		setValue(1, refName);
	}
}
