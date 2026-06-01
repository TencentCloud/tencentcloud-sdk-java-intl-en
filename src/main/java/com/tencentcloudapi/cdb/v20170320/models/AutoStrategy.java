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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoStrategy extends AbstractModel {

    /**
    * Auto scaling threshold. Available values: 40, 50, 60, 70, 80, 90. Represents the CPU utilization reaches 40%, 50%, 60%, 70%, 80%, or 90% to trigger auto scaling in the background.
    */
    @SerializedName("ExpandThreshold")
    @Expose
    private Long ExpandThreshold;

    /**
    * CPU utilization threshold (percent value). Valid values: 10, 20, and 30. Automatic scale-in will be triggered when CPU utilization reaches the set threshold.
    */
    @SerializedName("ShrinkThreshold")
    @Expose
    private Long ShrinkThreshold;

    /**
    * Auto-scaling observation period, in minutes, available values 1, 3, 5, 10, 15, 30. The backend will judge scaling out according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpandPeriod")
    @Expose
    private Long ExpandPeriod;

    /**
    * Automatic scaling down observation period, in minutes, available values 5, 10, 15, 30. The backend performs scale-in judgment according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShrinkPeriod")
    @Expose
    private Long ShrinkPeriod;

    /**
    * Elastic scaling observation period (in seconds). Value is 15, 30, 45, 60, 180, 300, 600, 900, or 1800.
    */
    @SerializedName("ExpandSecondPeriod")
    @Expose
    private Long ExpandSecondPeriod;

    /**
    * Scale-down observation period (in seconds). Valid values: 300, 600, 900, 1800.
    */
    @SerializedName("ShrinkSecondPeriod")
    @Expose
    private Long ShrinkSecondPeriod;

    /**
     * Get Auto scaling threshold. Available values: 40, 50, 60, 70, 80, 90. Represents the CPU utilization reaches 40%, 50%, 60%, 70%, 80%, or 90% to trigger auto scaling in the background. 
     * @return ExpandThreshold Auto scaling threshold. Available values: 40, 50, 60, 70, 80, 90. Represents the CPU utilization reaches 40%, 50%, 60%, 70%, 80%, or 90% to trigger auto scaling in the background.
     */
    public Long getExpandThreshold() {
        return this.ExpandThreshold;
    }

    /**
     * Set Auto scaling threshold. Available values: 40, 50, 60, 70, 80, 90. Represents the CPU utilization reaches 40%, 50%, 60%, 70%, 80%, or 90% to trigger auto scaling in the background.
     * @param ExpandThreshold Auto scaling threshold. Available values: 40, 50, 60, 70, 80, 90. Represents the CPU utilization reaches 40%, 50%, 60%, 70%, 80%, or 90% to trigger auto scaling in the background.
     */
    public void setExpandThreshold(Long ExpandThreshold) {
        this.ExpandThreshold = ExpandThreshold;
    }

    /**
     * Get CPU utilization threshold (percent value). Valid values: 10, 20, and 30. Automatic scale-in will be triggered when CPU utilization reaches the set threshold. 
     * @return ShrinkThreshold CPU utilization threshold (percent value). Valid values: 10, 20, and 30. Automatic scale-in will be triggered when CPU utilization reaches the set threshold.
     */
    public Long getShrinkThreshold() {
        return this.ShrinkThreshold;
    }

    /**
     * Set CPU utilization threshold (percent value). Valid values: 10, 20, and 30. Automatic scale-in will be triggered when CPU utilization reaches the set threshold.
     * @param ShrinkThreshold CPU utilization threshold (percent value). Valid values: 10, 20, and 30. Automatic scale-in will be triggered when CPU utilization reaches the set threshold.
     */
    public void setShrinkThreshold(Long ShrinkThreshold) {
        this.ShrinkThreshold = ShrinkThreshold;
    }

    /**
     * Get Auto-scaling observation period, in minutes, available values 1, 3, 5, 10, 15, 30. The backend will judge scaling out according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpandPeriod Auto-scaling observation period, in minutes, available values 1, 3, 5, 10, 15, 30. The backend will judge scaling out according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getExpandPeriod() {
        return this.ExpandPeriod;
    }

    /**
     * Set Auto-scaling observation period, in minutes, available values 1, 3, 5, 10, 15, 30. The backend will judge scaling out according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpandPeriod Auto-scaling observation period, in minutes, available values 1, 3, 5, 10, 15, 30. The backend will judge scaling out according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setExpandPeriod(Long ExpandPeriod) {
        this.ExpandPeriod = ExpandPeriod;
    }

    /**
     * Get Automatic scaling down observation period, in minutes, available values 5, 10, 15, 30. The backend performs scale-in judgment according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShrinkPeriod Automatic scaling down observation period, in minutes, available values 5, 10, 15, 30. The backend performs scale-in judgment according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getShrinkPeriod() {
        return this.ShrinkPeriod;
    }

    /**
     * Set Automatic scaling down observation period, in minutes, available values 5, 10, 15, 30. The backend performs scale-in judgment according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShrinkPeriod Automatic scaling down observation period, in minutes, available values 5, 10, 15, 30. The backend performs scale-in judgment according to the configured period.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setShrinkPeriod(Long ShrinkPeriod) {
        this.ShrinkPeriod = ShrinkPeriod;
    }

    /**
     * Get Elastic scaling observation period (in seconds). Value is 15, 30, 45, 60, 180, 300, 600, 900, or 1800. 
     * @return ExpandSecondPeriod Elastic scaling observation period (in seconds). Value is 15, 30, 45, 60, 180, 300, 600, 900, or 1800.
     */
    public Long getExpandSecondPeriod() {
        return this.ExpandSecondPeriod;
    }

    /**
     * Set Elastic scaling observation period (in seconds). Value is 15, 30, 45, 60, 180, 300, 600, 900, or 1800.
     * @param ExpandSecondPeriod Elastic scaling observation period (in seconds). Value is 15, 30, 45, 60, 180, 300, 600, 900, or 1800.
     */
    public void setExpandSecondPeriod(Long ExpandSecondPeriod) {
        this.ExpandSecondPeriod = ExpandSecondPeriod;
    }

    /**
     * Get Scale-down observation period (in seconds). Valid values: 300, 600, 900, 1800. 
     * @return ShrinkSecondPeriod Scale-down observation period (in seconds). Valid values: 300, 600, 900, 1800.
     */
    public Long getShrinkSecondPeriod() {
        return this.ShrinkSecondPeriod;
    }

    /**
     * Set Scale-down observation period (in seconds). Valid values: 300, 600, 900, 1800.
     * @param ShrinkSecondPeriod Scale-down observation period (in seconds). Valid values: 300, 600, 900, 1800.
     */
    public void setShrinkSecondPeriod(Long ShrinkSecondPeriod) {
        this.ShrinkSecondPeriod = ShrinkSecondPeriod;
    }

    public AutoStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoStrategy(AutoStrategy source) {
        if (source.ExpandThreshold != null) {
            this.ExpandThreshold = new Long(source.ExpandThreshold);
        }
        if (source.ShrinkThreshold != null) {
            this.ShrinkThreshold = new Long(source.ShrinkThreshold);
        }
        if (source.ExpandPeriod != null) {
            this.ExpandPeriod = new Long(source.ExpandPeriod);
        }
        if (source.ShrinkPeriod != null) {
            this.ShrinkPeriod = new Long(source.ShrinkPeriod);
        }
        if (source.ExpandSecondPeriod != null) {
            this.ExpandSecondPeriod = new Long(source.ExpandSecondPeriod);
        }
        if (source.ShrinkSecondPeriod != null) {
            this.ShrinkSecondPeriod = new Long(source.ShrinkSecondPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpandThreshold", this.ExpandThreshold);
        this.setParamSimple(map, prefix + "ShrinkThreshold", this.ShrinkThreshold);
        this.setParamSimple(map, prefix + "ExpandPeriod", this.ExpandPeriod);
        this.setParamSimple(map, prefix + "ShrinkPeriod", this.ShrinkPeriod);
        this.setParamSimple(map, prefix + "ExpandSecondPeriod", this.ExpandSecondPeriod);
        this.setParamSimple(map, prefix + "ShrinkSecondPeriod", this.ShrinkSecondPeriod);

    }
}

