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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenRegionMachines extends AbstractModel {

    /**
    * All regions
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region description in Chinese
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Host list
    */
    @SerializedName("Machines")
    @Expose
    private ScreenMachine [] Machines;

    /**
    * Total number of hosts in this region
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Number of risky hosts
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * Number of potentially risky hosts
    */
    @SerializedName("AttackCnt")
    @Expose
    private Long AttackCnt;

    /**
    * Number of risk-free hosts
    */
    @SerializedName("SafetyCnt")
    @Expose
    private Long SafetyCnt;

    /**
    * Number of hosts in offline/uninstalled status
    */
    @SerializedName("UnAgentOfflineCnt")
    @Expose
    private Long UnAgentOfflineCnt;

    /**
    * Number of hosts that are omitted from displaying. When it is equal to 0, no hosts are omitted.
    */
    @SerializedName("IgnoreCnt")
    @Expose
    private Long IgnoreCnt;

    /**
     * Get All regions 
     * @return Region All regions
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set All regions
     * @param Region All regions
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region description in Chinese 
     * @return RegionName Region description in Chinese
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region description in Chinese
     * @param RegionName Region description in Chinese
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Host list 
     * @return Machines Host list
     */
    public ScreenMachine [] getMachines() {
        return this.Machines;
    }

    /**
     * Set Host list
     * @param Machines Host list
     */
    public void setMachines(ScreenMachine [] Machines) {
        this.Machines = Machines;
    }

    /**
     * Get Total number of hosts in this region 
     * @return TotalCount Total number of hosts in this region
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of hosts in this region
     * @param TotalCount Total number of hosts in this region
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Number of risky hosts 
     * @return RiskCnt Number of risky hosts
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Number of risky hosts
     * @param RiskCnt Number of risky hosts
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get Number of potentially risky hosts 
     * @return AttackCnt Number of potentially risky hosts
     */
    public Long getAttackCnt() {
        return this.AttackCnt;
    }

    /**
     * Set Number of potentially risky hosts
     * @param AttackCnt Number of potentially risky hosts
     */
    public void setAttackCnt(Long AttackCnt) {
        this.AttackCnt = AttackCnt;
    }

    /**
     * Get Number of risk-free hosts 
     * @return SafetyCnt Number of risk-free hosts
     */
    public Long getSafetyCnt() {
        return this.SafetyCnt;
    }

    /**
     * Set Number of risk-free hosts
     * @param SafetyCnt Number of risk-free hosts
     */
    public void setSafetyCnt(Long SafetyCnt) {
        this.SafetyCnt = SafetyCnt;
    }

    /**
     * Get Number of hosts in offline/uninstalled status 
     * @return UnAgentOfflineCnt Number of hosts in offline/uninstalled status
     */
    public Long getUnAgentOfflineCnt() {
        return this.UnAgentOfflineCnt;
    }

    /**
     * Set Number of hosts in offline/uninstalled status
     * @param UnAgentOfflineCnt Number of hosts in offline/uninstalled status
     */
    public void setUnAgentOfflineCnt(Long UnAgentOfflineCnt) {
        this.UnAgentOfflineCnt = UnAgentOfflineCnt;
    }

    /**
     * Get Number of hosts that are omitted from displaying. When it is equal to 0, no hosts are omitted. 
     * @return IgnoreCnt Number of hosts that are omitted from displaying. When it is equal to 0, no hosts are omitted.
     */
    public Long getIgnoreCnt() {
        return this.IgnoreCnt;
    }

    /**
     * Set Number of hosts that are omitted from displaying. When it is equal to 0, no hosts are omitted.
     * @param IgnoreCnt Number of hosts that are omitted from displaying. When it is equal to 0, no hosts are omitted.
     */
    public void setIgnoreCnt(Long IgnoreCnt) {
        this.IgnoreCnt = IgnoreCnt;
    }

    public ScreenRegionMachines() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenRegionMachines(ScreenRegionMachines source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Machines != null) {
            this.Machines = new ScreenMachine[source.Machines.length];
            for (int i = 0; i < source.Machines.length; i++) {
                this.Machines[i] = new ScreenMachine(source.Machines[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.AttackCnt != null) {
            this.AttackCnt = new Long(source.AttackCnt);
        }
        if (source.SafetyCnt != null) {
            this.SafetyCnt = new Long(source.SafetyCnt);
        }
        if (source.UnAgentOfflineCnt != null) {
            this.UnAgentOfflineCnt = new Long(source.UnAgentOfflineCnt);
        }
        if (source.IgnoreCnt != null) {
            this.IgnoreCnt = new Long(source.IgnoreCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "AttackCnt", this.AttackCnt);
        this.setParamSimple(map, prefix + "SafetyCnt", this.SafetyCnt);
        this.setParamSimple(map, prefix + "UnAgentOfflineCnt", this.UnAgentOfflineCnt);
        this.setParamSimple(map, prefix + "IgnoreCnt", this.IgnoreCnt);

    }
}

