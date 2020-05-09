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

public class DescribeBasicAlarmListResponse extends AbstractModel{

    /**
    * Alarm list.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Alarms")
    @Expose
    private DescribeBasicAlarmListAlarms [] Alarms;

    /**
    * Total number.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Alarm list.
Note: This field may return null, indicating that no valid value was found. 
     * @return Alarms Alarm list.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribeBasicAlarmListAlarms [] getAlarms() {
        return this.Alarms;
    }

    /**
     * Set Alarm list.
Note: This field may return null, indicating that no valid value was found.
     * @param Alarms Alarm list.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAlarms(DescribeBasicAlarmListAlarms [] Alarms) {
        this.Alarms = Alarms;
    }

    /**
     * Get Total number.
Note: This field may return null, indicating that no valid value was found. 
     * @return Total Total number.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number.
Note: This field may return null, indicating that no valid value was found.
     * @param Total Total number.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Alarms.", this.Alarms);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

