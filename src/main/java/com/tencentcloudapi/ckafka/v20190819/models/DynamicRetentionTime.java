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

public class DynamicRetentionTime extends AbstractModel {

    /**
    * Whether the dynamic message retention time configuration is enabled. 0: disabled; 1: enabled
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Disk quota threshold (in percentage) for triggering the message retention time change event
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskQuotaPercentage")
    @Expose
    private Long DiskQuotaPercentage;

    /**
    * Percentage by which the message retention time is shortened each time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("StepForwardPercentage")
    @Expose
    private Long StepForwardPercentage;

    /**
    * Minimum retention time, in minutes
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("BottomRetention")
    @Expose
    private Long BottomRetention;

    /**
     * Get Whether the dynamic message retention time configuration is enabled. 0: disabled; 1: enabled
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Enable Whether the dynamic message retention time configuration is enabled. 0: disabled; 1: enabled
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether the dynamic message retention time configuration is enabled. 0: disabled; 1: enabled
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Enable Whether the dynamic message retention time configuration is enabled. 0: disabled; 1: enabled
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Disk quota threshold (in percentage) for triggering the message retention time change event
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return DiskQuotaPercentage Disk quota threshold (in percentage) for triggering the message retention time change event
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getDiskQuotaPercentage() {
        return this.DiskQuotaPercentage;
    }

    /**
     * Set Disk quota threshold (in percentage) for triggering the message retention time change event
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param DiskQuotaPercentage Disk quota threshold (in percentage) for triggering the message retention time change event
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setDiskQuotaPercentage(Long DiskQuotaPercentage) {
        this.DiskQuotaPercentage = DiskQuotaPercentage;
    }

    /**
     * Get Percentage by which the message retention time is shortened each time
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return StepForwardPercentage Percentage by which the message retention time is shortened each time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getStepForwardPercentage() {
        return this.StepForwardPercentage;
    }

    /**
     * Set Percentage by which the message retention time is shortened each time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param StepForwardPercentage Percentage by which the message retention time is shortened each time
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setStepForwardPercentage(Long StepForwardPercentage) {
        this.StepForwardPercentage = StepForwardPercentage;
    }

    /**
     * Get Minimum retention time, in minutes
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return BottomRetention Minimum retention time, in minutes
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getBottomRetention() {
        return this.BottomRetention;
    }

    /**
     * Set Minimum retention time, in minutes
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param BottomRetention Minimum retention time, in minutes
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setBottomRetention(Long BottomRetention) {
        this.BottomRetention = BottomRetention;
    }

    public DynamicRetentionTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicRetentionTime(DynamicRetentionTime source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.DiskQuotaPercentage != null) {
            this.DiskQuotaPercentage = new Long(source.DiskQuotaPercentage);
        }
        if (source.StepForwardPercentage != null) {
            this.StepForwardPercentage = new Long(source.StepForwardPercentage);
        }
        if (source.BottomRetention != null) {
            this.BottomRetention = new Long(source.BottomRetention);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "DiskQuotaPercentage", this.DiskQuotaPercentage);
        this.setParamSimple(map, prefix + "StepForwardPercentage", this.StepForwardPercentage);
        this.setParamSimple(map, prefix + "BottomRetention", this.BottomRetention);

    }
}

