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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRollbackTimeRangeResponse extends AbstractModel{

    /**
    * Start time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeRangeStart")
    @Expose
    private String TimeRangeStart;

    /**
    * End time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * Time range available for rollback
    */
    @SerializedName("RollbackTimeRanges")
    @Expose
    private RollbackTimeRange [] RollbackTimeRanges;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Start time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeRangeStart Start time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeRangeStart() {
        return this.TimeRangeStart;
    }

    /**
     * Set Start time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeRangeStart Start time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeRangeStart(String TimeRangeStart) {
        this.TimeRangeStart = TimeRangeStart;
    }

    /**
     * Get End time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeRangeEnd End time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set End time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeRangeEnd End time of valid rollback time range (disused)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get Time range available for rollback 
     * @return RollbackTimeRanges Time range available for rollback
     */
    public RollbackTimeRange [] getRollbackTimeRanges() {
        return this.RollbackTimeRanges;
    }

    /**
     * Set Time range available for rollback
     * @param RollbackTimeRanges Time range available for rollback
     */
    public void setRollbackTimeRanges(RollbackTimeRange [] RollbackTimeRanges) {
        this.RollbackTimeRanges = RollbackTimeRanges;
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

    public DescribeRollbackTimeRangeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackTimeRangeResponse(DescribeRollbackTimeRangeResponse source) {
        if (source.TimeRangeStart != null) {
            this.TimeRangeStart = new String(source.TimeRangeStart);
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
        }
        if (source.RollbackTimeRanges != null) {
            this.RollbackTimeRanges = new RollbackTimeRange[source.RollbackTimeRanges.length];
            for (int i = 0; i < source.RollbackTimeRanges.length; i++) {
                this.RollbackTimeRanges[i] = new RollbackTimeRange(source.RollbackTimeRanges[i]);
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
        this.setParamSimple(map, prefix + "TimeRangeStart", this.TimeRangeStart);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);
        this.setParamArrayObj(map, prefix + "RollbackTimeRanges.", this.RollbackTimeRanges);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

