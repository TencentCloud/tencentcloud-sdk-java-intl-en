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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQDataPoint extends AbstractModel {

    /**
    * Monitoring value array, which corresponds one-to-one with Timestamps
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * Monitoring data point position. For example, a day is divided into 1,440 points per minute, with each point having a serial number between 0 and 1439. If a certain serial number is not in the array, it indicates a missing data point.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get Monitoring value array, which corresponds one-to-one with Timestamps
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timestamps Monitoring value array, which corresponds one-to-one with Timestamps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set Monitoring value array, which corresponds one-to-one with Timestamps
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timestamps Monitoring value array, which corresponds one-to-one with Timestamps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get Monitoring data point position. For example, a day is divided into 1,440 points per minute, with each point having a serial number between 0 and 1439. If a certain serial number is not in the array, it indicates a missing data point.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Values Monitoring data point position. For example, a day is divided into 1,440 points per minute, with each point having a serial number between 0 and 1439. If a certain serial number is not in the array, it indicates a missing data point.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set Monitoring data point position. For example, a day is divided into 1,440 points per minute, with each point having a serial number between 0 and 1439. If a certain serial number is not in the array, it indicates a missing data point.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Values Monitoring data point position. For example, a day is divided into 1,440 points per minute, with each point having a serial number between 0 and 1439. If a certain serial number is not in the array, it indicates a missing data point.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public RocketMQDataPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQDataPoint(RocketMQDataPoint source) {
        if (source.Timestamps != null) {
            this.Timestamps = new Long[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Long(source.Timestamps[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

