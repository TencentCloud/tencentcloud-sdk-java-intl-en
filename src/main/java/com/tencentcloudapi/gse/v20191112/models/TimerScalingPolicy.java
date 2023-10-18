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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerScalingPolicy extends AbstractModel {

    /**
    * Unique ID of the policy. When it’s filled in, the policy will be updated.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
    * Scheduled scaling policy name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerName")
    @Expose
    private String TimerName;

    /**
    * Scheduled scaling policy status. `0`: Undefined, `1`: Not started, 2: Activated, `3`: Stopped, `4`: Expired
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerStatus")
    @Expose
    private Long TimerStatus;

    /**
    * The capacity configurations of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerFleetCapacity")
    @Expose
    private TimerFleetCapacity TimerFleetCapacity;

    /**
    * The recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimerConfiguration")
    @Expose
    private TimerConfiguration TimerConfiguration;

    /**
     * Get Unique ID of the policy. When it’s filled in, the policy will be updated.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerId Unique ID of the policy. When it’s filled in, the policy will be updated.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set Unique ID of the policy. When it’s filled in, the policy will be updated.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimerId Unique ID of the policy. When it’s filled in, the policy will be updated.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    /**
     * Get Scheduled scaling policy name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerName Scheduled scaling policy name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTimerName() {
        return this.TimerName;
    }

    /**
     * Set Scheduled scaling policy name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimerName Scheduled scaling policy name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerName(String TimerName) {
        this.TimerName = TimerName;
    }

    /**
     * Get Scheduled scaling policy status. `0`: Undefined, `1`: Not started, 2: Activated, `3`: Stopped, `4`: Expired
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerStatus Scheduled scaling policy status. `0`: Undefined, `1`: Not started, 2: Activated, `3`: Stopped, `4`: Expired
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTimerStatus() {
        return this.TimerStatus;
    }

    /**
     * Set Scheduled scaling policy status. `0`: Undefined, `1`: Not started, 2: Activated, `3`: Stopped, `4`: Expired
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimerStatus Scheduled scaling policy status. `0`: Undefined, `1`: Not started, 2: Activated, `3`: Stopped, `4`: Expired
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerStatus(Long TimerStatus) {
        this.TimerStatus = TimerStatus;
    }

    /**
     * Get The capacity configurations of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerFleetCapacity The capacity configurations of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TimerFleetCapacity getTimerFleetCapacity() {
        return this.TimerFleetCapacity;
    }

    /**
     * Set The capacity configurations of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimerFleetCapacity The capacity configurations of the scheduled scaling policy
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerFleetCapacity(TimerFleetCapacity TimerFleetCapacity) {
        this.TimerFleetCapacity = TimerFleetCapacity;
    }

    /**
     * Get The recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimerConfiguration The recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TimerConfiguration getTimerConfiguration() {
        return this.TimerConfiguration;
    }

    /**
     * Set The recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimerConfiguration The recurrence pattern of auto-scaling
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimerConfiguration(TimerConfiguration TimerConfiguration) {
        this.TimerConfiguration = TimerConfiguration;
    }

    public TimerScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerScalingPolicy(TimerScalingPolicy source) {
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
        }
        if (source.TimerName != null) {
            this.TimerName = new String(source.TimerName);
        }
        if (source.TimerStatus != null) {
            this.TimerStatus = new Long(source.TimerStatus);
        }
        if (source.TimerFleetCapacity != null) {
            this.TimerFleetCapacity = new TimerFleetCapacity(source.TimerFleetCapacity);
        }
        if (source.TimerConfiguration != null) {
            this.TimerConfiguration = new TimerConfiguration(source.TimerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);
        this.setParamSimple(map, prefix + "TimerName", this.TimerName);
        this.setParamSimple(map, prefix + "TimerStatus", this.TimerStatus);
        this.setParamObj(map, prefix + "TimerFleetCapacity.", this.TimerFleetCapacity);
        this.setParamObj(map, prefix + "TimerConfiguration.", this.TimerConfiguration);

    }
}

