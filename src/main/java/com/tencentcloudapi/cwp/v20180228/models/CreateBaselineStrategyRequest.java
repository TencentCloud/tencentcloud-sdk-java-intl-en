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

public class CreateBaselineStrategyRequest extends AbstractModel {

    /**
    * Policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Check cycle, indicating the number of days between checks. Example: 2, indicating that the check is carried out every 2 days.
    */
    @SerializedName("ScanCycle")
    @Expose
    private Long ScanCycle;

    /**
    * Time for a periodic check. The scan task is issued at this time. Example: "22:00", indicating that the task is issued at 22:00.
    */
    @SerializedName("ScanAt")
    @Expose
    private String ScanAt;

    /**
    * Array of selected baseline IDs under this policy. Example: [1,3,5,7]
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * Whether all servers are scanned. 1: yes; 0: no. If the value is 1, all Professional Edition hosts are scanned.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Cloud host type:
CVM: virtual machine
BM: bare metal server
ECM: edge computing machine
LH: Lighthouse 
Other: hybrid cloud machine
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Host region. Example: "ap-guangzhou"
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Host ID array. Example: ["quuid1","quuid2"]
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

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
     * Get Check cycle, indicating the number of days between checks. Example: 2, indicating that the check is carried out every 2 days. 
     * @return ScanCycle Check cycle, indicating the number of days between checks. Example: 2, indicating that the check is carried out every 2 days.
     */
    public Long getScanCycle() {
        return this.ScanCycle;
    }

    /**
     * Set Check cycle, indicating the number of days between checks. Example: 2, indicating that the check is carried out every 2 days.
     * @param ScanCycle Check cycle, indicating the number of days between checks. Example: 2, indicating that the check is carried out every 2 days.
     */
    public void setScanCycle(Long ScanCycle) {
        this.ScanCycle = ScanCycle;
    }

    /**
     * Get Time for a periodic check. The scan task is issued at this time. Example: "22:00", indicating that the task is issued at 22:00. 
     * @return ScanAt Time for a periodic check. The scan task is issued at this time. Example: "22:00", indicating that the task is issued at 22:00.
     */
    public String getScanAt() {
        return this.ScanAt;
    }

    /**
     * Set Time for a periodic check. The scan task is issued at this time. Example: "22:00", indicating that the task is issued at 22:00.
     * @param ScanAt Time for a periodic check. The scan task is issued at this time. Example: "22:00", indicating that the task is issued at 22:00.
     */
    public void setScanAt(String ScanAt) {
        this.ScanAt = ScanAt;
    }

    /**
     * Get Array of selected baseline IDs under this policy. Example: [1,3,5,7] 
     * @return CategoryIds Array of selected baseline IDs under this policy. Example: [1,3,5,7]
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set Array of selected baseline IDs under this policy. Example: [1,3,5,7]
     * @param CategoryIds Array of selected baseline IDs under this policy. Example: [1,3,5,7]
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get Whether all servers are scanned. 1: yes; 0: no. If the value is 1, all Professional Edition hosts are scanned. 
     * @return IsGlobal Whether all servers are scanned. 1: yes; 0: no. If the value is 1, all Professional Edition hosts are scanned.
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether all servers are scanned. 1: yes; 0: no. If the value is 1, all Professional Edition hosts are scanned.
     * @param IsGlobal Whether all servers are scanned. 1: yes; 0: no. If the value is 1, all Professional Edition hosts are scanned.
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Cloud host type:
CVM: virtual machine
BM: bare metal server
ECM: edge computing machine
LH: Lighthouse 
Other: hybrid cloud machine 
     * @return MachineType Cloud host type:
CVM: virtual machine
BM: bare metal server
ECM: edge computing machine
LH: Lighthouse 
Other: hybrid cloud machine
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Cloud host type:
CVM: virtual machine
BM: bare metal server
ECM: edge computing machine
LH: Lighthouse 
Other: hybrid cloud machine
     * @param MachineType Cloud host type:
CVM: virtual machine
BM: bare metal server
ECM: edge computing machine
LH: Lighthouse 
Other: hybrid cloud machine
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Host region. Example: "ap-guangzhou" 
     * @return RegionCode Host region. Example: "ap-guangzhou"
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Host region. Example: "ap-guangzhou"
     * @param RegionCode Host region. Example: "ap-guangzhou"
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Host ID array. Example: ["quuid1","quuid2"] 
     * @return Quuids Host ID array. Example: ["quuid1","quuid2"]
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Host ID array. Example: ["quuid1","quuid2"]
     * @param Quuids Host ID array. Example: ["quuid1","quuid2"]
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public CreateBaselineStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBaselineStrategyRequest(CreateBaselineStrategyRequest source) {
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
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
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

