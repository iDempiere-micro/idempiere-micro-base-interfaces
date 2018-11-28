package org.idempiere.icommon.model;

// to be used instead of PO
public interface IBasePO extends software.hsharp.core.models.IBasePO {
  int getId();

  String get_TrxName();

  int getOrgId();

  int getTableId();
}
