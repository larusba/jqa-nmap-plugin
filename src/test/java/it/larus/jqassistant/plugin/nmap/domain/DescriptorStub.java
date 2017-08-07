package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;

public abstract class DescriptorStub implements Descriptor {

    @Override
    public <I> I getId() {
        return null;
    }

    @Override
    public <T> T as(Class<T> type) {
        return type.cast(this);
    }

    @Override
    public <D> D getDelegate() {
        return null;
    }

}
