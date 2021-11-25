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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventsResponse extends AbstractModel{

    /**
    * Whether the logset ends.
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * Credential for viewing more logs.
    */
    @SerializedName("NextToken")
    @Expose
    private Long NextToken;

    /**
    * Logset.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Events")
    @Expose
    private Event [] Events;

    /**
    * Total number of events.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether the logset ends. 
     * @return ListOver Whether the logset ends.
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set Whether the logset ends.
     * @param ListOver Whether the logset ends.
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get Credential for viewing more logs. 
     * @return NextToken Credential for viewing more logs.
     */
    public Long getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Credential for viewing more logs.
     * @param NextToken Credential for viewing more logs.
     */
    public void setNextToken(Long NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Logset.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Events Logset.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Event [] getEvents() {
        return this.Events;
    }

    /**
     * Set Logset.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Events Logset.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setEvents(Event [] Events) {
        this.Events = Events;
    }

    /**
     * Get Total number of events.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of events.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of events.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TotalCount Total number of events.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeEventsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventsResponse(DescribeEventsResponse source) {
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.NextToken != null) {
            this.NextToken = new Long(source.NextToken);
        }
        if (source.Events != null) {
            this.Events = new Event[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new Event(source.Events[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

