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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Point extends AbstractModel{

    /**
    * Time point when this monitoring data point is generated
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Monitoring data point value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get Time point when this monitoring data point is generated 
     * @return Timestamp Time point when this monitoring data point is generated
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time point when this monitoring data point is generated
     * @param Timestamp Time point when this monitoring data point is generated
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Monitoring data point value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Value Monitoring data point value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Monitoring data point value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Value Monitoring data point value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

