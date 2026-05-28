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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyConfig extends AbstractModel {

    /**
    * <p>Number of database proxy group nodes. This parameter is no longer recommended. Recommend using ProxyZones.</p>
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * <p>cpu cores</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>Connection pool type: SessionConnectionPool (session-level connection pool)</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>Whether the connection pool is enabled, yes-enable, no-disable</p>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>Connection pool threshold: Measurement unit (seconds)</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * <p>description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Database node information (this parameter is used in combination with ProxyCount and either one must be input)</p>
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get <p>Number of database proxy group nodes. This parameter is no longer recommended. Recommend using ProxyZones.</p> 
     * @return ProxyCount <p>Number of database proxy group nodes. This parameter is no longer recommended. Recommend using ProxyZones.</p>
     * @deprecated
     */
    @Deprecated
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set <p>Number of database proxy group nodes. This parameter is no longer recommended. Recommend using ProxyZones.</p>
     * @param ProxyCount <p>Number of database proxy group nodes. This parameter is no longer recommended. Recommend using ProxyZones.</p>
     * @deprecated
     */
    @Deprecated
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get <p>cpu cores</p> 
     * @return Cpu <p>cpu cores</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu cores</p>
     * @param Cpu <p>cpu cores</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory</p> 
     * @return Mem <p>Memory</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>Memory</p>
     * @param Mem <p>Memory</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>Connection pool type: SessionConnectionPool (session-level connection pool)</p> 
     * @return ConnectionPoolType <p>Connection pool type: SessionConnectionPool (session-level connection pool)</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>Connection pool type: SessionConnectionPool (session-level connection pool)</p>
     * @param ConnectionPoolType <p>Connection pool type: SessionConnectionPool (session-level connection pool)</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>Whether the connection pool is enabled, yes-enable, no-disable</p> 
     * @return OpenConnectionPool <p>Whether the connection pool is enabled, yes-enable, no-disable</p>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>Whether the connection pool is enabled, yes-enable, no-disable</p>
     * @param OpenConnectionPool <p>Whether the connection pool is enabled, yes-enable, no-disable</p>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>Connection pool threshold: Measurement unit (seconds)</p> 
     * @return ConnectionPoolTimeOut <p>Connection pool threshold: Measurement unit (seconds)</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>Connection pool threshold: Measurement unit (seconds)</p>
     * @param ConnectionPoolTimeOut <p>Connection pool threshold: Measurement unit (seconds)</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get <p>description</p> 
     * @return Description <p>description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>description</p>
     * @param Description <p>description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Database node information (this parameter is used in combination with ProxyCount and either one must be input)</p> 
     * @return ProxyZones <p>Database node information (this parameter is used in combination with ProxyCount and either one must be input)</p>
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set <p>Database node information (this parameter is used in combination with ProxyCount and either one must be input)</p>
     * @param ProxyZones <p>Database node information (this parameter is used in combination with ProxyCount and either one must be input)</p>
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public ProxyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyConfig(ProxyConfig source) {
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new String(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolTimeOut != null) {
            this.ConnectionPoolTimeOut = new Long(source.ConnectionPoolTimeOut);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

