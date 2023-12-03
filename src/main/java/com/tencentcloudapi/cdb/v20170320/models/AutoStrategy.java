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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoStrategy extends AbstractModel {

    /**
    * CPU utilization threshold (percent value). Valid values: 70, 80, and 90. Automatic scale-out will be triggered when CPU utilization reaches the set threshold.
    */
    @SerializedName("ExpandThreshold")
    @Expose
    private Long ExpandThreshold;

    /**
    * Interval, in seconds. Valid values: 1, 3, 5, 10, 15, and 30. The system backend determines whether automatic scale-out is required at the set interval.
    */
    @SerializedName("ExpandPeriod")
    @Expose
    private Long ExpandPeriod;

    /**
    * CPU utilization threshold (percent value). Valid values: 10, 20, and 30. Automatic scale-in will be triggered when CPU utilization reaches the set threshold.
    */
    @SerializedName("ShrinkThreshold")
    @Expose
    private Long ShrinkThreshold;

    /**
    * Interval, in seconds. Valid values: 5, 10, 15, and 30. The system backend determines whether automatic scale-in is required at the set interval.
    */
    @SerializedName("ShrinkPeriod")
    @Expose
    private Long ShrinkPeriod;

    /**
     * Get CPU utilization threshold (percent value). Valid values: 70, 80, and 90. Automatic scale-out will be triggered when CPU utilization reaches the set threshold. 
     * @return ExpandThreshold CPU utilization threshold (percent value). Valid values: 70, 80, and 90. Automatic scale-out will be triggered when CPU utilization reaches the set threshold.
     */
    public Long getExpandThreshold() {
        return this.ExpandThreshold;
    }

    /**
     * Set CPU utilization threshold (percent value). Valid values: 70, 80, and 90. Automatic scale-out will be triggered when CPU utilization reaches the set threshold.
     * @param ExpandThreshold CPU utilization threshold (percent value). Valid values: 70, 80, and 90. Automatic scale-out will be triggered when CPU utilization reaches the set threshold.
     */
    public void setExpandThreshold(Long ExpandThreshold) {
        this.ExpandThreshold = ExpandThreshold;
    }

    /**
     * Get Interval, in seconds. Valid values: 1, 3, 5, 10, 15, and 30. The system backend determines whether automatic scale-out is required at the set interval. 
     * @return ExpandPeriod Interval, in seconds. Valid values: 1, 3, 5, 10, 15, and 30. The system backend determines whether automatic scale-out is required at the set interval.
     */
    public Long getExpandPeriod() {
        return this.ExpandPeriod;
    }

    /**
     * Set Interval, in seconds. Valid values: 1, 3, 5, 10, 15, and 30. The system backend determines whether automatic scale-out is required at the set interval.
     * @param ExpandPeriod Interval, in seconds. Valid values: 1, 3, 5, 10, 15, and 30. The system backend determines whether automatic scale-out is required at the set interval.
     */
    public void setExpandPeriod(Long ExpandPeriod) {
        this.ExpandPeriod = ExpandPeriod;
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
     * Get Interval, in seconds. Valid values: 5, 10, 15, and 30. The system backend determines whether automatic scale-in is required at the set interval. 
     * @return ShrinkPeriod Interval, in seconds. Valid values: 5, 10, 15, and 30. The system backend determines whether automatic scale-in is required at the set interval.
     */
    public Long getShrinkPeriod() {
        return this.ShrinkPeriod;
    }

    /**
     * Set Interval, in seconds. Valid values: 5, 10, 15, and 30. The system backend determines whether automatic scale-in is required at the set interval.
     * @param ShrinkPeriod Interval, in seconds. Valid values: 5, 10, 15, and 30. The system backend determines whether automatic scale-in is required at the set interval.
     */
    public void setShrinkPeriod(Long ShrinkPeriod) {
        this.ShrinkPeriod = ShrinkPeriod;
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
        if (source.ExpandPeriod != null) {
            this.ExpandPeriod = new Long(source.ExpandPeriod);
        }
        if (source.ShrinkThreshold != null) {
            this.ShrinkThreshold = new Long(source.ShrinkThreshold);
        }
        if (source.ShrinkPeriod != null) {
            this.ShrinkPeriod = new Long(source.ShrinkPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpandThreshold", this.ExpandThreshold);
        this.setParamSimple(map, prefix + "ExpandPeriod", this.ExpandPeriod);
        this.setParamSimple(map, prefix + "ShrinkThreshold", this.ShrinkThreshold);
        this.setParamSimple(map, prefix + "ShrinkPeriod", this.ShrinkPeriod);

    }
}

