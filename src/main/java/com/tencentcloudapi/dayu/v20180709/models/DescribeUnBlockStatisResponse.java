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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUnBlockStatisResponse extends AbstractModel {

    /**
    * Total number of unblocking chances
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of used chances
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * Statistics start time
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Statistics end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of unblocking chances 
     * @return Total Total number of unblocking chances
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of unblocking chances
     * @param Total Total number of unblocking chances
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of used chances 
     * @return Used Number of used chances
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set Number of used chances
     * @param Used Number of used chances
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get Statistics start time 
     * @return BeginTime Statistics start time
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Statistics start time
     * @param BeginTime Statistics start time
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Statistics end time 
     * @return EndTime Statistics end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Statistics end time
     * @param EndTime Statistics end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    public DescribeUnBlockStatisResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnBlockStatisResponse(DescribeUnBlockStatisResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

