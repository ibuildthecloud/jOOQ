/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ObjectRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Object>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IObject {

	private static final long serialVersionUID = 1015438700;

	/**
	 * Setter for <code>PUBLIC.OBJECT.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.OBJECT.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.OBJECT.OTHER</code>. 
	 */
	@Override
	public void setOther(java.lang.Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.OBJECT.OTHER</code>. 
	 */
	@Override
	public java.lang.Object getOther() {
		return (java.lang.Object) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Object> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Object> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT.OTHER;
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
	public java.lang.Object value2() {
		return getOther();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjectRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjectRecord value2(java.lang.Object value) {
		setOther(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjectRecord values(java.lang.Integer value1, java.lang.Object value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IObject from) {
		setId(from.getId());
		setOther(from.getOther());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IObject> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ObjectRecord
	 */
	public ObjectRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT);
	}

	/**
	 * Create a detached, initialised ObjectRecord
	 */
	public ObjectRecord(java.lang.Integer id, java.lang.Object other) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT);

		setValue(0, id);
		setValue(1, other);
	}
}
