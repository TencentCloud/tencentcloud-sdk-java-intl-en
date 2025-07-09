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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateBaselineStrategyRequest extends AbstractModel {

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Detection period
    */
    @SerializedName("ScanCycle")
    @Expose
    private Long ScanCycle;

    /**
    * Time when routine detection scans are triggered.
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * Array of baseline IDs selected under this policy
    */
    @SerializedName("CategoryIds")
    @Expose
    private String [] CategoryIds;

    /**
    * Whether all servers are scanned: 1: yes; 0 :no. If the value is 1, all Professional Edition hosts are scanned.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * CVM type:
cvm: Tencent Cloud Virtual Machine
bm: bare metal
ecm: edge computing host
lh: Tencent Cloud Lighthouse
other: hybrid cloud machine
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Host region ap-guangzhou
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Host ID array
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get Policy ID 
     * @return StrategyId Policy ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
     * @param StrategyId Policy ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Policy name 
     * @return StrategyName Policy name
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name
     * @param StrategyName Policy name
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Detection period 
     * @return ScanCycle Detection period
     */
    public Long getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set Detection period
     * @param ScanCycle Detection period
     */
    public void setScanCycle(Long ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get Time when routine detection scans are triggered. 
     * @return ScanAt Time when routine detection scans are triggered.
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set Time when routine detection scans are triggered.
     * @param ScanAt Time when routine detection scans are triggered.
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get Array of baseline IDs selected under this policy 
     * @return CategoryIds Array of baseline IDs selected under this policy
     */
    public String [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set Array of baseline IDs selected under this policy
     * @param CategoryIds Array of baseline IDs selected under this policy
     */
    public void setCategoryIds(String [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get Whether all servers are scanned: 1: yes; 0 :no. If the value is 1, all Professional Edition hosts are scanned. 
     * @return IsGlobal Whether all servers are scanned: 1: yes; 0 :no. If the value is 1, all Professional Edition hosts are scanned.
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether all servers are scanned: 1: yes; 0 :no. If the value is 1, all Professional Edition hosts are scanned.
     * @param IsGlobal Whether all servers are scanned: 1: yes; 0 :no. If the value is 1, all Professional Edition hosts are scanned.
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get CVM type:
cvm: Tencent Cloud Virtual Machine
bm: bare metal
ecm: edge computing host
lh: Tencent Cloud Lighthouse
other: hybrid cloud machine 
     * @return MachineType CVM type:
cvm: Tencent Cloud Virtual Machine
bm: bare metal
ecm: edge computing host
lh: Tencent Cloud Lighthouse
other: hybrid cloud machine
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set CVM type:
cvm: Tencent Cloud Virtual Machine
bm: bare metal
ecm: edge computing host
lh: Tencent Cloud Lighthouse
other: hybrid cloud machine
     * @param MachineType CVM type:
cvm: Tencent Cloud Virtual Machine
bm: bare metal
ecm: edge computing host
lh: Tencent Cloud Lighthouse
other: hybrid cloud machine
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Host region ap-guangzhou 
     * @return RegionCode Host region ap-guangzhou
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Host region ap-guangzhou
     * @param RegionCode Host region ap-guangzhou
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Host ID array 
     * @return Quuids Host ID array
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Host ID array
     * @param Quuids Host ID array
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public UpdateBaselineStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBaselineStrategyRequest(UpdateBaselineStrategyRequest source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.ScanCycle != null) {
            this.ScanCycle = new Long(source.ScanCycle);
        }
        if (source.ScanAt != null) {
            this.ScanAt = new String(source.ScanAt);
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new String[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new String(source.CategoryIds[i]);
            }
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "ScanCycle", this.ScanCycle);
        this.setParamSimple(map, prefix + "ScanAt", this.ScanAt);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

