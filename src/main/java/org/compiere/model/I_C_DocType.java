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
  /** Column name AD_PrintFormat_ID */
  String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
  /** Column name C_DocTypeDifference_ID */
  String COLUMNNAME_C_DocTypeDifference_ID = "C_DocTypeDifference_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_DocTypeInvoice_ID */
  String COLUMNNAME_C_DocTypeInvoice_ID = "C_DocTypeInvoice_ID";
  /** Column name C_DocTypeProforma_ID */
  String COLUMNNAME_C_DocTypeProforma_ID = "C_DocTypeProforma_ID";
  /** Column name C_DocTypeShipment_ID */
  String COLUMNNAME_C_DocTypeShipment_ID = "C_DocTypeShipment_ID";
  /** Column name C_DocType_UU */
  String COLUMNNAME_C_DocType_UU = "C_DocType_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DefiniteSequence_ID */
  String COLUMNNAME_DefiniteSequence_ID = "DefiniteSequence_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocBaseType */
  String COLUMNNAME_DocBaseType = "DocBaseType";
  /** Column name DocNoSequence_ID */
  String COLUMNNAME_DocNoSequence_ID = "DocNoSequence_ID";
  /** Column name DocSubTypeInv */
  String COLUMNNAME_DocSubTypeInv = "DocSubTypeInv";
  /** Column name DocSubTypeSO */
  String COLUMNNAME_DocSubTypeSO = "DocSubTypeSO";
  /** Column name DocumentCopies */
  String COLUMNNAME_DocumentCopies = "DocumentCopies";
  /** Column name DocumentNote */
  String COLUMNNAME_DocumentNote = "DocumentNote";
  /** Column name GL_Category_ID */
  String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
  /** Column name HasCharges */
  String COLUMNNAME_HasCharges = "HasCharges";
  /** Column name HasProforma */
  String COLUMNNAME_HasProforma = "HasProforma";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsChargeOrProductMandatory */
  String COLUMNNAME_IsChargeOrProductMandatory = "IsChargeOrProductMandatory";
  /** Column name IsCreateCounter */
  String COLUMNNAME_IsCreateCounter = "IsCreateCounter";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name IsDefaultCounterDoc */
  String COLUMNNAME_IsDefaultCounterDoc = "IsDefaultCounterDoc";
  /** Column name IsDocNoControlled */
  String COLUMNNAME_IsDocNoControlled = "IsDocNoControlled";
  /** Column name IsIndexed */
  String COLUMNNAME_IsIndexed = "IsIndexed";
  /** Column name IsInTransit */
  String COLUMNNAME_IsInTransit = "IsInTransit";
  /** Column name IsOverwriteDateOnComplete */
  String COLUMNNAME_IsOverwriteDateOnComplete = "IsOverwriteDateOnComplete";
  /** Column name IsOverwriteSeqOnComplete */
  String COLUMNNAME_IsOverwriteSeqOnComplete = "IsOverwriteSeqOnComplete";
  /** Column name IsPickQAConfirm */
  String COLUMNNAME_IsPickQAConfirm = "IsPickQAConfirm";
  /** Column name IsPrepareSplitDocument */
  String COLUMNNAME_IsPrepareSplitDocument = "IsPrepareSplitDocument";
  /** Column name IsShipConfirm */
  String COLUMNNAME_IsShipConfirm = "IsShipConfirm";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name IsSplitWhenDifference */
  String COLUMNNAME_IsSplitWhenDifference = "IsSplitWhenDifference";
  /** Column name PrintName */
  String COLUMNNAME_PrintName = "PrintName";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Print Format. Data Print Format */
  int getAD_PrintFormat_ID();

  /** Set Print Format. Data Print Format */
  void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

  /** Get Difference Document. Document type for generating in dispute Shipments */
  int getC_DocTypeDifference_ID();

  /** Set Difference Document. Document type for generating in dispute Shipments */
  void setC_DocTypeDifference_ID(int C_DocTypeDifference_ID);

  I_C_DocType getC_DocTypeDifference() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  /**
   * Get Document Type for Invoice. Document type used for invoices generated from this sales
   * document
   */
  int getC_DocTypeInvoice_ID();

  /**
   * Set Document Type for Invoice. Document type used for invoices generated from this sales
   * document
   */
  void setC_DocTypeInvoice_ID(int C_DocTypeInvoice_ID);

  I_C_DocType getC_DocTypeInvoice() throws RuntimeException;

  /**
   * Get Document Type for ProForma. Document type used for pro forma invoices generated from this
   * sales document
   */
  int getC_DocTypeProforma_ID();

  /**
   * Set Document Type for ProForma. Document type used for pro forma invoices generated from this
   * sales document
   */
  void setC_DocTypeProforma_ID(int C_DocTypeProforma_ID);

  I_C_DocType getC_DocTypeProforma() throws RuntimeException;

  /**
   * Get Document Type for Shipment. Document type used for shipments generated from this sales
   * document
   */
  int getC_DocTypeShipment_ID();

  /**
   * Set Document Type for Shipment. Document type used for shipments generated from this sales
   * document
   */
  void setC_DocTypeShipment_ID(int C_DocTypeShipment_ID);

  I_C_DocType getC_DocTypeShipment() throws RuntimeException;

  /** Get C_DocType_UU */
  String getC_DocType_UU();

  /** Set C_DocType_UU */
  void setC_DocType_UU(String C_DocType_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Definite Sequence */
  int getDefiniteSequence_ID();

  /** Set Definite Sequence */
  void setDefiniteSequence_ID(int DefiniteSequence_ID);

  I_AD_Sequence getDefiniteSequence() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document BaseType. Logical type of document */
  String getDocBaseType();

  /** Set Document BaseType. Logical type of document */
  void setDocBaseType(String DocBaseType);

  /** Get Document Sequence. Document sequence determines the numbering of documents */
  int getDocNoSequence_ID();

  /** Set Document Sequence. Document sequence determines the numbering of documents */
  void setDocNoSequence_ID(int DocNoSequence_ID);

  I_AD_Sequence getDocNoSequence() throws RuntimeException;

  /** Get Inv Sub Type. Inventory Sub Type */
  String getDocSubTypeInv();

  /** Set Inv Sub Type. Inventory Sub Type */
  void setDocSubTypeInv(String DocSubTypeInv);

  /** Get SO Sub Type. Sales Order Sub Type */
  String getDocSubTypeSO();

  /** Set SO Sub Type. Sales Order Sub Type */
  void setDocSubTypeSO(String DocSubTypeSO);

  /** Get Document Copies. Number of copies to be printed */
  int getDocumentCopies();

  /** Set Document Copies. Number of copies to be printed */
  void setDocumentCopies(int DocumentCopies);

  /** Get Document Note. Additional information for a Document */
  String getDocumentNote();

  /** Set Document Note. Additional information for a Document */
  void setDocumentNote(String DocumentNote);

  /** Get GL Category. General Ledger Category */
  int getGL_Category_ID();

  /** Set GL Category. General Ledger Category */
  void setGL_Category_ID(int GL_Category_ID);

  /** Get Charges. Charges can be added to the document */
  boolean isHasCharges();

  /** Set Charges. Charges can be added to the document */
  void setHasCharges(boolean HasCharges);

  /** Get Pro forma Invoice. Indicates if Pro Forma Invoices can be generated from this document */
  boolean isHasProforma();

  /** Set Pro forma Invoice. Indicates if Pro Forma Invoices can be generated from this document */
  void setHasProforma(boolean HasProforma);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Mandatory Charge or Product */
  void setIsChargeOrProductMandatory(boolean IsChargeOrProductMandatory);

  /** Get Mandatory Charge or Product */
  boolean isChargeOrProductMandatory();

  /** Set Create Counter Document. Create Counter Document */
  void setIsCreateCounter(boolean IsCreateCounter);

  /** Get Create Counter Document. Create Counter Document */
  boolean isCreateCounter();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Set Default Counter Document. The document type is the default counter document type */
  void setIsDefaultCounterDoc(boolean IsDefaultCounterDoc);

  /** Get Default Counter Document. The document type is the default counter document type */
  boolean isDefaultCounterDoc();

  /** Set Document is Number Controlled. The document has a document sequence */
  void setIsDocNoControlled(boolean IsDocNoControlled);

  /** Get Document is Number Controlled. The document has a document sequence */
  boolean isDocNoControlled();

  /** Set Indexed. Index the document for the internal search engine */
  void setIsIndexed(boolean IsIndexed);

  /** Get Indexed. Index the document for the internal search engine */
  boolean isIndexed();

  /** Set In Transit. Movement is in transit */
  void setIsInTransit(boolean IsInTransit);

  /** Get In Transit. Movement is in transit */
  boolean isInTransit();

  /** Set Overwrite Date on Complete */
  void setIsOverwriteDateOnComplete(boolean IsOverwriteDateOnComplete);

  /** Get Overwrite Date on Complete */
  boolean isOverwriteDateOnComplete();

  /** Set Overwrite Sequence on Complete */
  void setIsOverwriteSeqOnComplete(boolean IsOverwriteSeqOnComplete);

  /** Get Overwrite Sequence on Complete */
  boolean isOverwriteSeqOnComplete();

  /** Set Pick/QA Confirmation. Require Pick or QA Confirmation before processing */
  void setIsPickQAConfirm(boolean IsPickQAConfirm);

  /** Get Pick/QA Confirmation. Require Pick or QA Confirmation before processing */
  boolean isPickQAConfirm();

  /** Set Prepare Split Document. Prepare generated split shipment/receipt document */
  void setIsPrepareSplitDocument(boolean IsPrepareSplitDocument);

  /** Get Prepare Split Document. Prepare generated split shipment/receipt document */
  boolean isPrepareSplitDocument();

  /** Set Ship/Receipt Confirmation. Require Ship or Receipt Confirmation before processing */
  void setIsShipConfirm(boolean IsShipConfirm);

  /** Get Ship/Receipt Confirmation. Require Ship or Receipt Confirmation before processing */
  boolean isShipConfirm();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Set Split when Difference. Split document when there is a difference */
  void setIsSplitWhenDifference(boolean IsSplitWhenDifference);

  /** Get Split when Difference. Split document when there is a difference */
  boolean isSplitWhenDifference();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Print Text. The label text to be printed on a document or correspondence. */
  String getPrintName();

  /** Set Print Text. The label text to be printed on a document or correspondence. */
  void setPrintName(String PrintName);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
