package it.larus.jqassistant.plugin.nmap.scanner;

import com.buschmais.jqassistant.core.store.api.Store;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.core.store.api.model.FullQualifiedNameDescriptor;
import com.buschmais.xo.api.Query;
import it.larus.jqassistant.plugin.nmap.domain.*;
import org.neo4j.graphdb.GraphDatabaseService;

import java.util.*;

/**
 * Created by omar on 17/07/17.
 */
public class StoreStub implements Store{

    public Map<Class, List> instances;

    public StoreStub() {
        this.instances = new HashMap<>();
    }

    static Map<Class, Class> stubmap = new HashMap<>();
    static{
        stubmap.put(NetworkDescriptor.class, NetworkDescriptorStub.class);
        stubmap.put(FileNetworkDescriptor.class, FileNetworkDescriptorStub.class);
        stubmap.put(HostDescriptor.class, HostDescriptorStub.class);
        stubmap.put(NetworkPortDescriptor.class, NetworkPortDescriptorStub.class);
        stubmap.put(NetworkServiceDescriptor.class, NetworkServiceDescriptorStub.class);
        stubmap.put(NetworkServiceInstanceDescriptor.class, NetworkServiceInstanceDescriptorStub.class);
        stubmap.put(NetworkScriptDescriptor.class, NetworkScriptDescriptorStub.class);
        stubmap.put(NetworkScriptElemDescriptor.class, NetworkScriptElemDescriptorStub.class);
        stubmap.put(NetworkScriptTableDescriptor.class, NetworkScriptTableDescriptorStub.class);

    }

    @Override
    public void start(Collection<Class<?>> collection) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void beginTransaction() {

    }

    @Override
    public void commitTransaction() {

    }

    @Override
    public void rollbackTransaction() {

    }

    @Override
    public <T extends Descriptor> T create(Class<T> aClass) {
        Class stubClass = stubmap.get(aClass);

        return (T) addInstance(aClass, stubClass);
    }

    private <T extends Descriptor> Object addInstance(Class<T> aClass, Class stub) {

        try {
            Object instance = stub.newInstance();

            List list = instances.get(aClass);
            if(list == null){
                list = new ArrayList();
                instances.put(aClass, list);
            }
            list.add(instance);

            return instance;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public <S extends Descriptor, R extends Descriptor, T extends Descriptor> R create(S s, Class<R> aClass, T t) {
        return null;
    }

    @Override
    public <T extends FullQualifiedNameDescriptor> T create(Class<T> aClass, String s) {
        return null;
    }

    @Override
    public <T extends Descriptor> void delete(T t) {

    }

    @Override
    public <T extends Descriptor, C> C migrate(T t, Class<C> aClass, Class<?>[] classes) {
        return null;
    }

    @Override
    public <T extends Descriptor, N extends Descriptor> N addDescriptorType(T t, Class<?> aClass, Class<N> aClass1) {
        return null;
    }

    @Override
    public <T extends Descriptor, N extends Descriptor> N addDescriptorType(T t, Class<N> aClass) {
        return null;
    }

    @Override
    public <T extends Descriptor, N extends Descriptor> N removeDescriptorType(T t, Class<?> aClass, Class<N> aClass1) {
        return null;
    }

    @Override
    public <T extends Descriptor> T find(Class<T> aClass, String s) {
        return null;
    }

    @Override
    public Query.Result<Query.Result.CompositeRowObject> executeQuery(String s, Map<String, Object> map) {
        return null;
    }

    @Override
    public Query.Result<Query.Result.CompositeRowObject> executeQuery(String s) {
        return null;
    }

    @Override
    public <Q> Query.Result<Q> executeQuery(Class<Q> aClass, Map<String, Object> map) {
        return null;
    }

    @Override
    public GraphDatabaseService getGraphDatabaseService() {
        return null;
    }
}
