/*
 * Copyright (c) 2017 Larus Business Automation
 *
 * This file is part of "JQAssistant Nmap plugin".
 *
 * "JQAssistant Nmap plugin" is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 *
 * "JQAssistant Nmap plugin" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;

/**
 * An IP over the network
 */
@Label("Host")
public interface HostDescriptor extends NmapDescriptor {

    String getState();
    String getAddress();
    String getHostname();

    @Relation("HAS_PORT")
    List<NetworkPortDescriptor> getPorts();

    @Relation("ON_HOST")
    @Relation.Incoming
    List<NetworkScriptDescriptor> getScripts();

    void setState(String state);
    void setAddress(String address);
    void setHostname(String hostname);

    void setPorts(List<NetworkPortDescriptor> ports);
    void setScripts(List<NetworkScriptDescriptor> scripts);
}
