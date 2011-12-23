/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Inventory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> {

	private static final long serialVersionUID = -712099866;

	/**
	 * The singleton instance of inventory
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Inventory INVENTORY = new org.jooq.examples.mysql.sakila.tables.Inventory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.InventoryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Integer> INVENTORY_ID = createField("inventory_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.inventory.film_id]
	 * REFERENCES film [sakila.film.film_id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.inventory.store_id]
	 * REFERENCES store [sakila.store.store_id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Byte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Inventory() {
		super("inventory", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private Inventory(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_inventory;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_inventory_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_inventory_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.fk_inventory_film, org.jooq.examples.mysql.sakila.Keys.fk_inventory_store);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Inventory as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Inventory(alias);
	}
}
