/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaFilmActorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmActorRecord> implements org.jooq.Record3<java.lang.Short, java.lang.Short, java.sql.Timestamp> {

	private static final long serialVersionUID = 1447306681;

	/**
	 * Setter for <code>sakila.film_actor.actor_id</code>. 
	 */
	public void setActorId(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.film_actor.actor_id</code>. 
	 */
	public java.lang.Short getActorId() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>sakila.film_actor.film_id</code>. 
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.film_actor.film_id</code>. 
	 */
	public java.lang.Short getFilmId() {
		return (java.lang.Short) getValue(1);
	}

	/**
	 * Setter for <code>sakila.film_actor.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.film_actor.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Short, java.lang.Short> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.Short, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.Short, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR.ACTOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR.FILM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getActorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getFilmId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SakilaFilmActorRecord
	 */
	public SakilaFilmActorRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR);
	}

	/**
	 * Create a detached, initialised SakilaFilmActorRecord
	 */
	public SakilaFilmActorRecord(java.lang.Short actorId, java.lang.Short filmId, java.sql.Timestamp lastUpdate) {
		super(org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR);

		setValue(0, actorId);
		setValue(1, filmId);
		setValue(2, lastUpdate);
	}
}
