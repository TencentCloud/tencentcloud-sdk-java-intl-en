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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAlarmThreshold extends AbstractModel {

    /**
    * Alarm threshold type. 1: inbound traffic, 2: cleansed traffic
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * Alarm threshold, which should be greater than 0 (currently scheduled value)
    */
    @SerializedName("AlarmThreshold")
    @Expose
    private Long AlarmThreshold;

    /**
     * Get Alarm threshold type. 1: inbound traffic, 2: cleansed traffic 
     * @return AlarmType Alarm threshold type. 1: inbound traffic, 2: cleansed traffic
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm threshold type. 1: inbound traffic, 2: cleansed traffic
     * @param AlarmType Alarm threshold type. 1: inbound traffic, 2: cleansed traffic
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Alarm threshold, which should be greater than 0 (currently scheduled value) 
     * @return AlarmThreshold Alarm threshold, which should be greater than 0 (currently scheduled value)
     */
    public Long getAlarmThreshold() {
        return this.AlarmThreshold;
    }

    /**
     * Set Alarm threshold, which should be greater than 0 (currently scheduled value)
     * @param AlarmThreshold Alarm threshold, which should be greater than 0 (currently scheduled value)
     */
    public void setAlarmThreshold(Long AlarmThreshold) {
        this.AlarmThreshold = AlarmThreshold;
    }

    public DDoSAlarmThreshold() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAlarmThreshold(DDoSAlarmThreshold source) {
        if (source.AlarmType != null) {
            this.AlarmType = new Long(source.AlarmType);
        }
        if (source.AlarmThreshold != null) {
            this.AlarmThreshold = new Long(source.AlarmThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmThreshold", this.AlarmThreshold);

    }
}

