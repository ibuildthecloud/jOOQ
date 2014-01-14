/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgInherits extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -93462755;

	/**
	 * The singleton instance of <code>pg_catalog.pg_inherits</code>
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgInherits PG_INHERITS = new org.jooq.util.postgres.pg_catalog.tables.PgInherits();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_inherits.inhrelid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INHRELID = createField("inhrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>pg_catalog.pg_inherits.inhparent</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INHPARENT = createField("inhparent", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>pg_catalog.pg_inherits.inhseqno</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> INHSEQNO = createField("inhseqno", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>pg_catalog.pg_inherits</code> table reference
	 */
	public PgInherits() {
		super("pg_inherits", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_inherits</code> table reference
	 */
	public PgInherits(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.pg_catalog.tables.PgInherits.PG_INHERITS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgInherits as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgInherits(alias);
	}
}
