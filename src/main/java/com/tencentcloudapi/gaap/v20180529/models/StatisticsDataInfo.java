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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticsDataInfo extends AbstractModel{

    /**
    * Corresponding time point
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Statistics value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private Float Data;

    /**
     * Get Corresponding time point 
     * @return Time Corresponding time point
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Corresponding time point
     * @param Time Corresponding time point
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Statistics value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Statistics value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getData() {
        return this.Data;
    }

    /**
     * Set Statistics value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Statistics value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(Float Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

