package org.compiere.model;

/**
 * Set Get Object interface
 *
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public interface SetGetModel {
    //
    int getTableId();

    String getTableName();

    //
    boolean setAttrValue(String name, Object value);

    Object getAttrValue(String name);

    boolean isAttrValueChanged(String ColumnName);
}
