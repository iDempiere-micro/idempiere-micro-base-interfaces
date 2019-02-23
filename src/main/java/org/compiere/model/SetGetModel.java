package org.compiere.model;

import java.util.Properties;

/**
 * Set Get Object interface
 *
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public interface SetGetModel {
    Properties getCtx();

    //
    int getTableId();

    String getTableName();

    //
    boolean setAttrValue(String name, Object value);

    Object getAttrValue(String name);

    boolean isAttrValueChanged(String ColumnName);
}
