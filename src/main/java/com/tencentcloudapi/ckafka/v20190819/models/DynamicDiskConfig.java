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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicDiskConfig extends AbstractModel {

    /**
    * Whether to enable dynamic disk expansion configuration. `0`: disable, `1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Percentage of dynamic disk expansion each time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StepForwardPercentage")
    @Expose
    private Long StepForwardPercentage;

    /**
    * Disk quota threshold (in percentage) for triggering the automatic disk expansion event.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskQuotaPercentage")
    @Expose
    private Long DiskQuotaPercentage;

    /**
    * Max disk space in GB.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDiskSpace")
    @Expose
    private Long MaxDiskSpace;

    /**
     * Get Whether to enable dynamic disk expansion configuration. `0`: disable, `1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Enable Whether to enable dynamic disk expansion configuration. `0`: disable, `1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable dynamic disk expansion configuration. `0`: disable, `1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Enable Whether to enable dynamic disk expansion configuration. `0`: disable, `1`: enable.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Percentage of dynamic disk expansion each time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StepForwardPercentage Percentage of dynamic disk expansion each time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStepForwardPercentage() {
        return this.StepForwardPercentage;
    }

    /**
     * Set Percentage of dynamic disk expansion each time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StepForwardPercentage Percentage of dynamic disk expansion each time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStepForwardPercentage(Long StepForwardPercentage) {
        this.StepForwardPercentage = StepForwardPercentage;
    }

    /**
     * Get Disk quota threshold (in percentage) for triggering the automatic disk expansion event.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DiskQuotaPercentage Disk quota threshold (in percentage) for triggering the automatic disk expansion event.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDiskQuotaPercentage() {
        return this.DiskQuotaPercentage;
    }

    /**
     * Set Disk quota threshold (in percentage) for triggering the automatic disk expansion event.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DiskQuotaPercentage Disk quota threshold (in percentage) for triggering the automatic disk expansion event.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDiskQuotaPercentage(Long DiskQuotaPercentage) {
        this.DiskQuotaPercentage = DiskQuotaPercentage;
    }

    /**
     * Get Max disk space in GB.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxDiskSpace Max disk space in GB.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxDiskSpace() {
        return this.MaxDiskSpace;
    }

    /**
     * Set Max disk space in GB.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxDiskSpace Max disk space in GB.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxDiskSpace(Long MaxDiskSpace) {
        this.MaxDiskSpace = MaxDiskSpace;
    }

    public DynamicDiskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicDiskConfig(DynamicDiskConfig source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.StepForwardPercentage != null) {
            this.StepForwardPercentage = new Long(source.StepForwardPercentage);
        }
        if (source.DiskQuotaPercentage != null) {
            this.DiskQuotaPercentage = new Long(source.DiskQuotaPercentage);
        }
        if (source.MaxDiskSpace != null) {
            this.MaxDiskSpace = new Long(source.MaxDiskSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "StepForwardPercentage", this.StepForwardPercentage);
        this.setParamSimple(map, prefix + "DiskQuotaPercentage", this.DiskQuotaPercentage);
        this.setParamSimple(map, prefix + "MaxDiskSpace", this.MaxDiskSpace);

    }
}

