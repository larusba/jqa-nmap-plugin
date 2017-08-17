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

/**
 * An instance of a service on an host
 */
@Label("NetworkServiceInstance")
public interface NetworkServiceInstanceDescriptor extends NmapDescriptor {

    String getName();
    String getProduct();
    String getVersion();
    String getDeviceType();
    String getExtraInfo();

    void setName(String name);
    void setProduct(String product);
    void setVersion(String version);
    void setDeviceType(String deviceType);
    void setExtraInfo(String extraInfo);
}
