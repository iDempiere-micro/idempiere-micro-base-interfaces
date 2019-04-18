package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface I_Query<T extends PersistentObject> {
    I_Query<T> setParameters(Object... queryParameters);

    @NotNull
    I_Query<T> setOnlyActiveRecords(boolean b);

    I_Query<T> setOrderBy(@NotNull String s);

    List<T> list();

    T firstOnly();

    @NotNull
    I_Query<T> setClientId();

    T first();

    I_Query<T> addJoinClause(String s);

    boolean match();

    int firstId();

    I_Query<T> setForUpdate(boolean forUpdate);

    I_Query<T> setQueryTimeout(int timeout);

    int count();
}
