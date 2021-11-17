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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamsEventResponse extends AbstractModel{

    /**
    * Total number of modified parameters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Details of parameter modification events
    */
    @SerializedName("EventItems")
    @Expose
    private EventItem [] EventItems;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of modified parameters 
     * @return TotalCount Total number of modified parameters
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of modified parameters
     * @param TotalCount Total number of modified parameters
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Details of parameter modification events 
     * @return EventItems Details of parameter modification events
     */
    public EventItem [] getEventItems() {
        return this.EventItems;
    }

    /**
     * Set Details of parameter modification events
     * @param EventItems Details of parameter modification events
     */
    public void setEventItems(EventItem [] EventItems) {
        this.EventItems = EventItems;
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

    public DescribeParamsEventResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamsEventResponse(DescribeParamsEventResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EventItems != null) {
            this.EventItems = new EventItem[source.EventItems.length];
            for (int i = 0; i < source.EventItems.length; i++) {
                this.EventItems[i] = new EventItem(source.EventItems[i]);
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
        this.setParamArrayObj(map, prefix + "EventItems.", this.EventItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

