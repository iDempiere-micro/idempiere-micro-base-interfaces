package org.compiere.model;

public interface IArchiveStore {

    byte[] loadLOBData(I_AD_Archive archive, I_AD_StorageProvider prov);

    void save(I_AD_Archive archive, I_AD_StorageProvider prov, byte[] inflatedData);

    boolean deleteArchive(I_AD_Archive archive, I_AD_StorageProvider prov);
}
