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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayStatInfo extends AbstractModel{

    /**
    * Data time point.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Value of bandwidth/traffic/number of requests/number of concurrent connections/download speed. If there is no data, the value is 0.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get Data time point. 
     * @return Time Data time point.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Data time point.
     * @param Time Data time point.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Value of bandwidth/traffic/number of requests/number of concurrent connections/download speed. If there is no data, the value is 0.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Value of bandwidth/traffic/number of requests/number of concurrent connections/download speed. If there is no data, the value is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Value of bandwidth/traffic/number of requests/number of concurrent connections/download speed. If there is no data, the value is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Value of bandwidth/traffic/number of requests/number of concurrent connections/download speed. If there is no data, the value is 0.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

