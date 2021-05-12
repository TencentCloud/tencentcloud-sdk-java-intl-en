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

public class DescribeProductEventListResponse extends AbstractModel{

    /**
    * Event list
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Events")
    @Expose
    private DescribeProductEventListEvents [] Events;

    /**
    * Event statistics.
    */
    @SerializedName("OverView")
    @Expose
    private DescribeProductEventListOverView OverView;

    /**
    * Total number of events.
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
     * Get Event list
Note: This field may return null, indicating that no valid value was found. 
     * @return Events Event list
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribeProductEventListEvents [] getEvents() {
        return this.Events;
    }

    /**
     * Set Event list
Note: This field may return null, indicating that no valid value was found.
     * @param Events Event list
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEvents(DescribeProductEventListEvents [] Events) {
        this.Events = Events;
    }

    /**
     * Get Event statistics. 
     * @return OverView Event statistics.
     */
    public DescribeProductEventListOverView getOverView() {
        return this.OverView;
    }

    /**
     * Set Event statistics.
     * @param OverView Event statistics.
     */
    public void setOverView(DescribeProductEventListOverView OverView) {
        this.OverView = OverView;
    }

    /**
     * Get Total number of events.
Note: This field may return null, indicating that no valid value was found. 
     * @return Total Total number of events.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of events.
Note: This field may return null, indicating that no valid value was found.
     * @param Total Total number of events.
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

    public DescribeProductEventListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListResponse(DescribeProductEventListResponse source) {
        if (source.Events != null) {
            this.Events = new DescribeProductEventListEvents[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new DescribeProductEventListEvents(source.Events[i]);
            }
        }
        if (source.OverView != null) {
            this.OverView = new DescribeProductEventListOverView(source.OverView);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamObj(map, prefix + "OverView.", this.OverView);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

