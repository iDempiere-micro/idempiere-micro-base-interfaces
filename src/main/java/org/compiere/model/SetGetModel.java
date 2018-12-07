package org.compiere.model;

import java.util.Properties;

/**
 * Set Get Object interface
 *
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public interface SetGetModel {
    Properties getCtx();

    String get_TrxName();

    //
    int get_Table_ID();

    String get_TableName();

    //
    boolean set_AttrValue(String name, Object value);

    Object get_AttrValue(String name);

    boolean is_AttrValueChanged(String ColumnName);
}
