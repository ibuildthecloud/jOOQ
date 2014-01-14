/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PreparedStatementRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.PreparedStatementRecord> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IPreparedStatement {

	private static final long serialVersionUID = 803955179;

	/**
	 * Setter for <code>PUBLIC.PREPARED_STATEMENT.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.PREPARED_STATEMENT.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT.ID;
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
	public PreparedStatementRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreparedStatementRecord values(java.lang.Integer value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IPreparedStatement from) {
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IPreparedStatement> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PreparedStatementRecord
	 */
	public PreparedStatementRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT);
	}

	/**
	 * Create a detached, initialised PreparedStatementRecord
	 */
	public PreparedStatementRecord(java.lang.Integer id) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT);

		setValue(0, id);
	}
}
