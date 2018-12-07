package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DocType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DocType {

  /** TableName=C_DocType */
  String Table_Name = "C_DocType";

  /** AD_Table_ID=217 */
  int Table_ID = 217;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_PrintFormat_ID */
  String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";

  /** Set Print Format. Data Print Format */
  void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

  /** Get Print Format. Data Print Format */
  int getAD_PrintFormat_ID();

  /** Column name C_DocTypeDifference_ID */
  String COLUMNNAME_C_DocTypeDifference_ID = "C_DocTypeDifference_ID";

  /** Set Difference Document. Document type for generating in dispute Shipments */
  void setC_DocTypeDifference_ID(int C_DocTypeDifference_ID);

  /** Get Difference Document. Document type for generating in dispute Shipments */
  int getC_DocTypeDifference_ID();

  I_C_DocType getC_DocTypeDifference() throws RuntimeException;

  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Column name C_DocTypeInvoice_ID */
  String COLUMNNAME_C_DocTypeInvoice_ID = "C_DocTypeInvoice_ID";

  /**
   * Set Document Type for Invoice. Document type used for invoices generated from this sales
   * document
   */
  void setC_DocTypeInvoice_ID(int C_DocTypeInvoice_ID);

  /**
   * Get Document Type for Invoice. Document type used for invoices generated from this sales
   * document
   */
  int getC_DocTypeInvoice_ID();

  I_C_DocType getC_DocTypeInvoice() throws RuntimeException;

  /** Column name C_DocTypeProforma_ID */
  String COLUMNNAME_C_DocTypeProforma_ID = "C_DocTypeProforma_ID";

  /**
   * Set Document Type for ProForma. Document type used for pro forma invoices generated from this
   * sales document
   */
  void setC_DocTypeProforma_ID(int C_DocTypeProforma_ID);

  /**
   * Get Document Type for ProForma. Document type used for pro forma invoices generated from this
   * sales document
   */
  int getC_DocTypeProforma_ID();

  I_C_DocType getC_DocTypeProforma() throws RuntimeException;

  /** Column name C_DocTypeShipment_ID */
  String COLUMNNAME_C_DocTypeShipment_ID = "C_DocTypeShipment_ID";

  /**
   * Set Document Type for Shipment. Document type used for shipments generated from this sales
   * document
   */
  void setC_DocTypeShipment_ID(int C_DocTypeShipment_ID);

  /**
   * Get Document Type for Shipment. Document type used for shipments generated from this sales
   * document
   */
  int getC_DocTypeShipment_ID();

  I_C_DocType getC_DocTypeShipment() throws RuntimeException;

  /** Column name C_DocType_UU */
  String COLUMNNAME_C_DocType_UU = "C_DocType_UU";

  /** Set C_DocType_UU */
  void setC_DocType_UU(String C_DocType_UU);

  /** Get C_DocType_UU */
  String getC_DocType_UU();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name DefiniteSequence_ID */
  String COLUMNNAME_DefiniteSequence_ID = "DefiniteSequence_ID";

  /** Set Definite Sequence */
  void setDefiniteSequence_ID(int DefiniteSequence_ID);

  /** Get Definite Sequence */
  int getDefiniteSequence_ID();

  I_AD_Sequence getDefiniteSequence() throws RuntimeException;

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Column name DocBaseType */
  String COLUMNNAME_DocBaseType = "DocBaseType";

  /** Set Document BaseType. Logical type of document */
  void setDocBaseType(String DocBaseType);

  /** Get Document BaseType. Logical type of document */
  String getDocBaseType();

  /** Column name DocNoSequence_ID */
  String COLUMNNAME_DocNoSequence_ID = "DocNoSequence_ID";

  /** Set Document Sequence. Document sequence determines the numbering of documents */
  void setDocNoSequence_ID(int DocNoSequence_ID);

  /** Get Document Sequence. Document sequence determines the numbering of documents */
  int getDocNoSequence_ID();

  I_AD_Sequence getDocNoSequence() throws RuntimeException;

  /** Column name DocSubTypeInv */
  String COLUMNNAME_DocSubTypeInv = "DocSubTypeInv";

  /** Set Inv Sub Type. Inventory Sub Type */
  void setDocSubTypeInv(String DocSubTypeInv);

  /** Get Inv Sub Type. Inventory Sub Type */
  String getDocSubTypeInv();

  /** Column name DocSubTypeSO */
  String COLUMNNAME_DocSubTypeSO = "DocSubTypeSO";

  /** Set SO Sub Type. Sales Order Sub Type */
  void setDocSubTypeSO(String DocSubTypeSO);

  /** Get SO Sub Type. Sales Order Sub Type */
  String getDocSubTypeSO();

  /** Column name DocumentCopies */
  String COLUMNNAME_DocumentCopies = "DocumentCopies";

  /** Set Document Copies. Number of copies to be printed */
  void setDocumentCopies(int DocumentCopies);

  /** Get Document Copies. Number of copies to be printed */
  int getDocumentCopies();

  /** Column name DocumentNote */
  String COLUMNNAME_DocumentNote = "DocumentNote";

  /** Set Document Note. Additional information for a Document */
  void setDocumentNote(String DocumentNote);

  /** Get Document Note. Additional information for a Document */
  String getDocumentNote();

  /** Column name GL_Category_ID */
  String COLUMNNAME_GL_Category_ID = "GL_Category_ID";

  /** Set GL Category. General Ledger Category */
  void setGL_Category_ID(int GL_Category_ID);

  /** Get GL Category. General Ledger Category */
  int getGL_Category_ID();

  /** Column name HasCharges */
  String COLUMNNAME_HasCharges = "HasCharges";

  /** Set Charges. Charges can be added to the document */
  void setHasCharges(boolean HasCharges);

  /** Get Charges. Charges can be added to the document */
  boolean isHasCharges();

  /** Column name HasProforma */
  String COLUMNNAME_HasProforma = "HasProforma";

  /** Set Pro forma Invoice. Indicates if Pro Forma Invoices can be generated from this document */
  void setHasProforma(boolean HasProforma);

  /** Get Pro forma Invoice. Indicates if Pro Forma Invoices can be generated from this document */
  boolean isHasProforma();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsChargeOrProductMandatory */
  String COLUMNNAME_IsChargeOrProductMandatory = "IsChargeOrProductMandatory";

  /** Set Mandatory Charge or Product */
  void setIsChargeOrProductMandatory(boolean IsChargeOrProductMandatory);

  /** Get Mandatory Charge or Product */
  boolean isChargeOrProductMandatory();

  /** Column name IsCreateCounter */
  String COLUMNNAME_IsCreateCounter = "IsCreateCounter";

  /** Set Create Counter Document. Create Counter Document */
  void setIsCreateCounter(boolean IsCreateCounter);

  /** Get Create Counter Document. Create Counter Document */
  boolean isCreateCounter();

  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Column name IsDefaultCounterDoc */
  String COLUMNNAME_IsDefaultCounterDoc = "IsDefaultCounterDoc";

  /** Set Default Counter Document. The document type is the default counter document type */
  void setIsDefaultCounterDoc(boolean IsDefaultCounterDoc);

  /** Get Default Counter Document. The document type is the default counter document type */
  boolean isDefaultCounterDoc();

  /** Column name IsDocNoControlled */
  String COLUMNNAME_IsDocNoControlled = "IsDocNoControlled";

  /** Set Document is Number Controlled. The document has a document sequence */
  void setIsDocNoControlled(boolean IsDocNoControlled);

  /** Get Document is Number Controlled. The document has a document sequence */
  boolean isDocNoControlled();

  /** Column name IsIndexed */
  String COLUMNNAME_IsIndexed = "IsIndexed";

  /** Set Indexed. Index the document for the internal search engine */
  void setIsIndexed(boolean IsIndexed);

  /** Get Indexed. Index the document for the internal search engine */
  boolean isIndexed();

  /** Column name IsInTransit */
  String COLUMNNAME_IsInTransit = "IsInTransit";

  /** Set In Transit. Movement is in transit */
  void setIsInTransit(boolean IsInTransit);

  /** Get In Transit. Movement is in transit */
  boolean isInTransit();

  /** Column name IsOverwriteDateOnComplete */
  String COLUMNNAME_IsOverwriteDateOnComplete = "IsOverwriteDateOnComplete";

  /** Set Overwrite Date on Complete */
  void setIsOverwriteDateOnComplete(boolean IsOverwriteDateOnComplete);

  /** Get Overwrite Date on Complete */
  boolean isOverwriteDateOnComplete();

  /** Column name IsOverwriteSeqOnComplete */
  String COLUMNNAME_IsOverwriteSeqOnComplete = "IsOverwriteSeqOnComplete";

  /** Set Overwrite Sequence on Complete */
  void setIsOverwriteSeqOnComplete(boolean IsOverwriteSeqOnComplete);

  /** Get Overwrite Sequence on Complete */
  boolean isOverwriteSeqOnComplete();

  /** Column name IsPickQAConfirm */
  String COLUMNNAME_IsPickQAConfirm = "IsPickQAConfirm";

  /** Set Pick/QA Confirmation. Require Pick or QA Confirmation before processing */
  void setIsPickQAConfirm(boolean IsPickQAConfirm);

  /** Get Pick/QA Confirmation. Require Pick or QA Confirmation before processing */
  boolean isPickQAConfirm();

  /** Column name IsPrepareSplitDocument */
  String COLUMNNAME_IsPrepareSplitDocument = "IsPrepareSplitDocument";

  /** Set Prepare Split Document. Prepare generated split shipment/receipt document */
  void setIsPrepareSplitDocument(boolean IsPrepareSplitDocument);

  /** Get Prepare Split Document. Prepare generated split shipment/receipt document */
  boolean isPrepareSplitDocument();

  /** Column name IsShipConfirm */
  String COLUMNNAME_IsShipConfirm = "IsShipConfirm";

  /** Set Ship/Receipt Confirmation. Require Ship or Receipt Confirmation before processing */
  void setIsShipConfirm(boolean IsShipConfirm);

  /** Get Ship/Receipt Confirmation. Require Ship or Receipt Confirmation before processing */
  boolean isShipConfirm();

  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Column name IsSplitWhenDifference */
  String COLUMNNAME_IsSplitWhenDifference = "IsSplitWhenDifference";

  /** Set Split when Difference. Split document when there is a difference */
  void setIsSplitWhenDifference(boolean IsSplitWhenDifference);

  /** Get Split when Difference. Split document when there is a difference */
  boolean isSplitWhenDifference();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name PrintName */
  String COLUMNNAME_PrintName = "PrintName";

  /** Set Print Text. The label text to be printed on a document or correspondence. */
  void setPrintName(String PrintName);

  /** Get Print Text. The label text to be printed on a document or correspondence. */
  String getPrintName();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
