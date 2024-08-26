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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadGroupConfig extends AbstractModel {

    /**
    * Resource group name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkloadGroupName")
    @Expose
    private String WorkloadGroupName;

    /**
    * CPU weight
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuShare")
    @Expose
    private Long CpuShare;

    /**
    * Memory limit. The sum of memory limit values of all resource groups should be less than or equal to 100.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemoryLimit")
    @Expose
    private Long MemoryLimit;

    /**
    * Whether to allow over-allocation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableMemoryOverCommit")
    @Expose
    private Boolean EnableMemoryOverCommit;

    /**
    * CPU hard limit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuHardLimit")
    @Expose
    private String CpuHardLimit;

    /**
     * Get Resource group name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkloadGroupName Resource group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkloadGroupName() {
        return this.WorkloadGroupName;
    }

    /**
     * Set Resource group name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkloadGroupName Resource group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkloadGroupName(String WorkloadGroupName) {
        this.WorkloadGroupName = WorkloadGroupName;
    }

    /**
     * Get CPU weight
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CpuShare CPU weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpuShare() {
        return this.CpuShare;
    }

    /**
     * Set CPU weight
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CpuShare CPU weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuShare(Long CpuShare) {
        this.CpuShare = CpuShare;
    }

    /**
     * Get Memory limit. The sum of memory limit values of all resource groups should be less than or equal to 100.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemoryLimit Memory limit. The sum of memory limit values of all resource groups should be less than or equal to 100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set Memory limit. The sum of memory limit values of all resource groups should be less than or equal to 100.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemoryLimit Memory limit. The sum of memory limit values of all resource groups should be less than or equal to 100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemoryLimit(Long MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get Whether to allow over-allocation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableMemoryOverCommit Whether to allow over-allocation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableMemoryOverCommit() {
        return this.EnableMemoryOverCommit;
    }

    /**
     * Set Whether to allow over-allocation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableMemoryOverCommit Whether to allow over-allocation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableMemoryOverCommit(Boolean EnableMemoryOverCommit) {
        this.EnableMemoryOverCommit = EnableMemoryOverCommit;
    }

    /**
     * Get CPU hard limit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CpuHardLimit CPU hard limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCpuHardLimit() {
        return this.CpuHardLimit;
    }

    /**
     * Set CPU hard limit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CpuHardLimit CPU hard limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuHardLimit(String CpuHardLimit) {
        this.CpuHardLimit = CpuHardLimit;
    }

    public WorkloadGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadGroupConfig(WorkloadGroupConfig source) {
        if (source.WorkloadGroupName != null) {
            this.WorkloadGroupName = new String(source.WorkloadGroupName);
        }
        if (source.CpuShare != null) {
            this.CpuShare = new Long(source.CpuShare);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new Long(source.MemoryLimit);
        }
        if (source.EnableMemoryOverCommit != null) {
            this.EnableMemoryOverCommit = new Boolean(source.EnableMemoryOverCommit);
        }
        if (source.CpuHardLimit != null) {
            this.CpuHardLimit = new String(source.CpuHardLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkloadGroupName", this.WorkloadGroupName);
        this.setParamSimple(map, prefix + "CpuShare", this.CpuShare);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "EnableMemoryOverCommit", this.EnableMemoryOverCommit);
        this.setParamSimple(map, prefix + "CpuHardLimit", this.CpuHardLimit);

    }
}

