package org.javers.core.diff.changetype.map;

import org.javers.core.diff.changetype.Atomic;

import java.util.Objects;

import static org.javers.common.validation.Validate.argumentIsNotNull;

/**
 * @author bartosz walacik
 */
public abstract class EntryChange {
    private final Atomic key;

    EntryChange(Object key) {
        argumentIsNotNull(key);
        this.key = new Atomic(key);
    }

    public Object getKey() {
        return key.unwrap();
    }

    public Atomic getWrappedKey() {
        return key;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EntryChange) {
            EntryChange that = (EntryChange) obj;
            return Objects.equals(this.key, that.key);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), key);
    }
}
