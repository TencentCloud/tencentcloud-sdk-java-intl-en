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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpVisitResponse extends AbstractModel{

    /**
    * Time granularity of data statistics, which supports 5min (5 minutes) and day (1 day).
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Origin-pull data details of each resource.
    */
    @SerializedName("Data")
    @Expose
    private ResourceData [] Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Time granularity of data statistics, which supports 5min (5 minutes) and day (1 day). 
     * @return Interval Time granularity of data statistics, which supports 5min (5 minutes) and day (1 day).
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of data statistics, which supports 5min (5 minutes) and day (1 day).
     * @param Interval Time granularity of data statistics, which supports 5min (5 minutes) and day (1 day).
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Origin-pull data details of each resource. 
     * @return Data Origin-pull data details of each resource.
     */
    public ResourceData [] getData() {
        return this.Data;
    }

    /**
     * Set Origin-pull data details of each resource.
     * @param Data Origin-pull data details of each resource.
     */
    public void setData(ResourceData [] Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

