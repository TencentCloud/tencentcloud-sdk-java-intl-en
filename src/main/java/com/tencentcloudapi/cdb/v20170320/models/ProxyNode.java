/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNode extends AbstractModel{

    /**
    * Proxy node ID Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Number of CPU cores Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Node status Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Proxy node AZ Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Proxy node region Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Connections Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Connection")
    @Expose
    private Long Connection;

    /**
     * Get Proxy node ID Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyId Proxy node ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Proxy node ID Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyId Proxy node ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Number of CPU cores Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cpu Number of CPU cores Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cpu Number of CPU cores Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mem Memory size Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory size Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mem Memory size Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Node status Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Node status Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Node status Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Proxy node AZ Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Proxy node AZ Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Proxy node AZ Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Proxy node AZ Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Proxy node region Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Proxy node region Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Proxy node region Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Proxy node region Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Connections Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Connection Connections Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConnection() {
        return this.Connection;
    }

    /**
     * Set Connections Note: This field may return null, indicating that no valid values can be obtained.
     * @param Connection Connections Note: This field may return null, indicating that no valid values can be obtained.
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

