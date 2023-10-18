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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAbnormalProcessEventsResponse extends AbstractModel {

    /**
    * Total number of events
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Array of abnormal processes
    */
    @SerializedName("EventSet")
    @Expose
    private AbnormalProcessEventInfo [] EventSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of events 
     * @return TotalCount Total number of events
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of events
     * @param TotalCount Total number of events
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Array of abnormal processes 
     * @return EventSet Array of abnormal processes
     */
    public AbnormalProcessEventInfo [] getEventSet() {
        return this.EventSet;
    }

    /**
     * Set Array of abnormal processes
     * @param EventSet Array of abnormal processes
     */
    public void setEventSet(AbnormalProcessEventInfo [] EventSet) {
        this.EventSet = EventSet;
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

    public DescribeAbnormalProcessEventsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAbnormalProcessEventsResponse(DescribeAbnormalProcessEventsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EventSet != null) {
            this.EventSet = new AbnormalProcessEventInfo[source.EventSet.length];
            for (int i = 0; i < source.EventSet.length; i++) {
                this.EventSet[i] = new AbnormalProcessEventInfo(source.EventSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "EventSet.", this.EventSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

