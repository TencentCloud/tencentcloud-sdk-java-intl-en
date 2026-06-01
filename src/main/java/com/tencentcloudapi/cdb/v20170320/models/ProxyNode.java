/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNode extends AbstractModel {

    /**
    * Proxy node ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Number of CPU cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size, measured in MB.
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Node status: 0 - Initializing, 1 - Online, 2 - Offline, 3 - Being destroyed, 4 - Recovering, 5 - Node fault, 6 - Switching.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Proxy node availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Proxy Node Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Number of connections
    */
    @SerializedName("Connection")
    @Expose
    private Long Connection;

    /**
     * Get Proxy node ID 
     * @return ProxyId Proxy node ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Proxy node ID
     * @param ProxyId Proxy node ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Number of CPU cores. 
     * @return Cpu Number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores.
     * @param Cpu Number of CPU cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size, measured in MB. 
     * @return Mem Memory size, measured in MB.
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory size, measured in MB.
     * @param Mem Memory size, measured in MB.
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Node status: 0 - Initializing, 1 - Online, 2 - Offline, 3 - Being destroyed, 4 - Recovering, 5 - Node fault, 6 - Switching. 
     * @return Status Node status: 0 - Initializing, 1 - Online, 2 - Offline, 3 - Being destroyed, 4 - Recovering, 5 - Node fault, 6 - Switching.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status: 0 - Initializing, 1 - Online, 2 - Offline, 3 - Being destroyed, 4 - Recovering, 5 - Node fault, 6 - Switching.
     * @param Status Node status: 0 - Initializing, 1 - Online, 2 - Offline, 3 - Being destroyed, 4 - Recovering, 5 - Node fault, 6 - Switching.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Proxy node availability zone 
     * @return Zone Proxy node availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Proxy node availability zone
     * @param Zone Proxy node availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Proxy Node Region 
     * @return Region Proxy Node Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Proxy Node Region
     * @param Region Proxy Node Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Number of connections 
     * @return Connection Number of connections
     */
    public Long getConnection() {
        return this.Connection;
    }

    /**
     * Set Number of connections
     * @param Connection Number of connections
     */
    public void setConnection(Long Connection) {
        this.Connection = Connection;
    }

    public ProxyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNode(ProxyNode source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Connection != null) {
            this.Connection = new Long(source.Connection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Connection", this.Connection);

    }
}

