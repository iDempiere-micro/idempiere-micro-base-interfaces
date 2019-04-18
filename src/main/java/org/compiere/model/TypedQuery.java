package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface TypedQuery<T extends PersistentObject> {
    TypedQuery<T> setParameters(Object... queryParameters);

    @NotNull
    TypedQuery<T> setOnlyActiveRecords(boolean b);

    TypedQuery<T> setOrderBy(@NotNull String s);

    List<T> list();

    T firstOnly();

    @NotNull
    TypedQuery<T> setClientId();

    T first();

    TypedQuery<T> addJoinClause(String s);

    boolean match();

    int firstId();

    TypedQuery<T> setForUpdate(boolean forUpdate);

    TypedQuery<T> setQueryTimeout(int timeout);

    int count();
}
