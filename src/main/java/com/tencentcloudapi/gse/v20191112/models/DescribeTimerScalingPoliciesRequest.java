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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimerScalingPoliciesRequest extends AbstractModel {

    /**
    * ID of the fleet to be bound with the policy
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Scheduled scaling policy name
    */
    @SerializedName("TimerName")
    @Expose
    private String TimerName;

    /**
    * Start time of the scheduled scaling policy
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of the scheduled scaling policy
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get ID of the fleet to be bound with the policy 
     * @return FleetId ID of the fleet to be bound with the policy
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set ID of the fleet to be bound with the policy
     * @param FleetId ID of the fleet to be bound with the policy
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Scheduled scaling policy name 
     * @return TimerName Scheduled scaling policy name
     */
    public String getTimerName() {
        return this.TimerName;
    }

    /**
     * Set Scheduled scaling policy name
     * @param TimerName Scheduled scaling policy name
     */
    public void setTimerName(String TimerName) {
        this.TimerName = TimerName;
    }

    /**
     * Get Start time of the scheduled scaling policy 
     * @return BeginTime Start time of the scheduled scaling policy
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the scheduled scaling policy
     * @param BeginTime Start time of the scheduled scaling policy
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of the scheduled scaling policy 
     * @return EndTime End time of the scheduled scaling policy
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the scheduled scaling policy
     * @param EndTime End time of the scheduled scaling policy
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page 
     * @return Limit Number of entries per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page
     * @param Limit Number of entries per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTimerScalingPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimerScalingPoliciesRequest(DescribeTimerScalingPoliciesRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.TimerName != null) {
            this.TimerName = new String(source.TimerName);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "TimerName", this.TimerName);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

