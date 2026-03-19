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
    * Number of database proxy group nodes. this parameter is no longer recommended. recommend using ProxyZones.
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory.
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Connection pool type: SessionConnectionPool (session-level connection pool).
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Whether to enable the connection pool. valid values: yes (enable), no (not enabled).
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * Connection pool threshold. measurement unit (seconds).
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Database node information (this parameter is used in combination with ProxyCount, either one must be manually input).
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get Number of database proxy group nodes. this parameter is no longer recommended. recommend using ProxyZones. 
     * @return ProxyCount Number of database proxy group nodes. this parameter is no longer recommended. recommend using ProxyZones.
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set Number of database proxy group nodes. this parameter is no longer recommended. recommend using ProxyZones.
     * @param ProxyCount Number of database proxy group nodes. this parameter is no longer recommended. recommend using ProxyZones.
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory. 
     * @return Mem Memory.
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory.
     * @param Mem Memory.
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Connection pool type: SessionConnectionPool (session-level connection pool). 
     * @return ConnectionPoolType Connection pool type: SessionConnectionPool (session-level connection pool).
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Connection pool type: SessionConnectionPool (session-level connection pool).
     * @param ConnectionPoolType Connection pool type: SessionConnectionPool (session-level connection pool).
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get Whether to enable the connection pool. valid values: yes (enable), no (not enabled). 
     * @return OpenConnectionPool Whether to enable the connection pool. valid values: yes (enable), no (not enabled).
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set Whether to enable the connection pool. valid values: yes (enable), no (not enabled).
     * @param OpenConnectionPool Whether to enable the connection pool. valid values: yes (enable), no (not enabled).
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get Connection pool threshold. measurement unit (seconds). 
     * @return ConnectionPoolTimeOut Connection pool threshold. measurement unit (seconds).
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set Connection pool threshold. measurement unit (seconds).
     * @param ConnectionPoolTimeOut Connection pool threshold. measurement unit (seconds).
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Database node information (this parameter is used in combination with ProxyCount, either one must be manually input). 
     * @return ProxyZones Database node information (this parameter is used in combination with ProxyCount, either one must be manually input).
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set Database node information (this parameter is used in combination with ProxyCount, either one must be manually input).
     * @param ProxyZones Database node information (this parameter is used in combination with ProxyCount, either one must be manually input).
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

