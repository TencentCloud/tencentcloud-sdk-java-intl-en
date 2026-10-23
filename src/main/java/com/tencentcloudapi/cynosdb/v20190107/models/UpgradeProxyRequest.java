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

public class UpgradeProxyRequest extends AbstractModel {

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
    * memory
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Number of database proxy group nodes
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * Database Proxy Group ID (abandoned)
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Load rebalance: auto (automatic), manual
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * Upgrade time: no (upon upgrade completion); yes (instance maintenance time)
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
    * Database proxy node information
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
    * Whether to perform a rolling upgrade
    */
    @SerializedName("IsRollUpgrade")
    @Expose
    private String IsRollUpgrade;

    /**
    * In-place rolling upgrade waiting time. Unit: seconds
    */
    @SerializedName("RollUpgradeWaitingTime")
    @Expose
    private Long RollUpgradeWaitingTime;

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
     * Get memory 
     * @return Mem memory
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set memory
     * @param Mem memory
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Number of database proxy group nodes 
     * @return ProxyCount Number of database proxy group nodes
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set Number of database proxy group nodes
     * @param ProxyCount Number of database proxy group nodes
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get Database Proxy Group ID (abandoned) 
     * @return ProxyGroupId Database Proxy Group ID (abandoned)
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Database Proxy Group ID (abandoned)
     * @param ProxyGroupId Database Proxy Group ID (abandoned)
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Load rebalance: auto (automatic), manual 
     * @return ReloadBalance Load rebalance: auto (automatic), manual
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set Load rebalance: auto (automatic), manual
     * @param ReloadBalance Load rebalance: auto (automatic), manual
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    /**
     * Get Upgrade time: no (upon upgrade completion); yes (instance maintenance time) 
     * @return IsInMaintainPeriod Upgrade time: no (upon upgrade completion); yes (instance maintenance time)
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set Upgrade time: no (upon upgrade completion); yes (instance maintenance time)
     * @param IsInMaintainPeriod Upgrade time: no (upon upgrade completion); yes (instance maintenance time)
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    /**
     * Get Database proxy node information 
     * @return ProxyZones Database proxy node information
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set Database proxy node information
     * @param ProxyZones Database proxy node information
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    /**
     * Get Whether to perform a rolling upgrade 
     * @return IsRollUpgrade Whether to perform a rolling upgrade
     */
    public String getIsRollUpgrade() {
        return this.IsRollUpgrade;
    }

    /**
     * Set Whether to perform a rolling upgrade
     * @param IsRollUpgrade Whether to perform a rolling upgrade
     */
    public void setIsRollUpgrade(String IsRollUpgrade) {
        this.IsRollUpgrade = IsRollUpgrade;
    }

    /**
     * Get In-place rolling upgrade waiting time. Unit: seconds 
     * @return RollUpgradeWaitingTime In-place rolling upgrade waiting time. Unit: seconds
     */
    public Long getRollUpgradeWaitingTime() {
        return this.RollUpgradeWaitingTime;
    }

    /**
     * Set In-place rolling upgrade waiting time. Unit: seconds
     * @param RollUpgradeWaitingTime In-place rolling upgrade waiting time. Unit: seconds
     */
    public void setRollUpgradeWaitingTime(Long RollUpgradeWaitingTime) {
        this.RollUpgradeWaitingTime = RollUpgradeWaitingTime;
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
        if (source.IsRollUpgrade != null) {
            this.IsRollUpgrade = new String(source.IsRollUpgrade);
        }
        if (source.RollUpgradeWaitingTime != null) {
            this.RollUpgradeWaitingTime = new Long(source.RollUpgradeWaitingTime);
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
        this.setParamSimple(map, prefix + "IsRollUpgrade", this.IsRollUpgrade);
        this.setParamSimple(map, prefix + "RollUpgradeWaitingTime", this.RollUpgradeWaitingTime);

    }
}

