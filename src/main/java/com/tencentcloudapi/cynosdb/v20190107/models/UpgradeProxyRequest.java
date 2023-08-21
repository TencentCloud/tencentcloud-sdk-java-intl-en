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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeProxyRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Number of nodes in the proxy group
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * ID of the database proxy group (disused)
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Load rebalance mode. Valid values: `auto`, `manual`
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * Upgrade time. Valid values: `no` (upon upgrade completion), `timeWindow` (upgrade during instance maintenance time)
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
    * Node information of the atabase proxy
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get Memory 
     * @return Mem Memory
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory
     * @param Mem Memory
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Number of nodes in the proxy group 
     * @return ProxyCount Number of nodes in the proxy group
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set Number of nodes in the proxy group
     * @param ProxyCount Number of nodes in the proxy group
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get ID of the database proxy group (disused) 
     * @return ProxyGroupId ID of the database proxy group (disused)
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set ID of the database proxy group (disused)
     * @param ProxyGroupId ID of the database proxy group (disused)
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Load rebalance mode. Valid values: `auto`, `manual` 
     * @return ReloadBalance Load rebalance mode. Valid values: `auto`, `manual`
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set Load rebalance mode. Valid values: `auto`, `manual`
     * @param ReloadBalance Load rebalance mode. Valid values: `auto`, `manual`
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    /**
     * Get Upgrade time. Valid values: `no` (upon upgrade completion), `timeWindow` (upgrade during instance maintenance time) 
     * @return IsInMaintainPeriod Upgrade time. Valid values: `no` (upon upgrade completion), `timeWindow` (upgrade during instance maintenance time)
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set Upgrade time. Valid values: `no` (upon upgrade completion), `timeWindow` (upgrade during instance maintenance time)
     * @param IsInMaintainPeriod Upgrade time. Valid values: `no` (upon upgrade completion), `timeWindow` (upgrade during instance maintenance time)
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    /**
     * Get Node information of the atabase proxy 
     * @return ProxyZones Node information of the atabase proxy
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set Node information of the atabase proxy
     * @param ProxyZones Node information of the atabase proxy
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public UpgradeProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeProxyRequest(UpgradeProxyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ReloadBalance != null) {
            this.ReloadBalance = new String(source.ReloadBalance);
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

