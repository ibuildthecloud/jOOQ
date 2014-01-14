/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mariadb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mariadb.generatedclasses.tables.records.TExoticTypesRecord> implements org.jooq.Record2<java.lang.Integer, java.util.UUID> {

	private static final long serialVersionUID = 43067669;

	/**
	 * Setter for <code>test.t_exotic_types.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.t_exotic_types.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>test.t_exotic_types.UU</code>. 
	 */
	public void setUu(java.util.UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.t_exotic_types.UU</code>. 
	 */
	public java.util.UUID getUu() {
		return (java.util.UUID) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mariadb.generatedclasses.tables.TExoticTypes.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return org.jooq.test.mariadb.generatedclasses.tables.TExoticTypes.UU;
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
	public java.util.UUID value2() {
		return getUu();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value2(java.util.UUID value) {
		setUu(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord values(java.lang.Integer value1, java.util.UUID value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(org.jooq.test.mariadb.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}

	/**
	 * Create a detached, initialised TExoticTypesRecord
	 */
	public TExoticTypesRecord(java.lang.Integer id, java.util.UUID uu) {
		super(org.jooq.test.mariadb.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);

		setValue(0, id);
		setValue(1, uu);
	}
}
