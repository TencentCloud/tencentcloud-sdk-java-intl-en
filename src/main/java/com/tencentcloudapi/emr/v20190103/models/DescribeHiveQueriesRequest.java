/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHiveQueriesRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time (s).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time (s). The difference between the values of EndTime and StartTime cannot exceed 86,400 seconds (one day).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Starting offset for pages, starting from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Value range: [1, 100].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Execution status, for example, ERROR.
    */
    @SerializedName("State")
    @Expose
    private String [] State;

    /**
    * Time point earlier than the end time.
    */
    @SerializedName("EndTimeGte")
    @Expose
    private Long EndTimeGte;

    /**
    * Time point later than the end time.
    */
    @SerializedName("EndTimeLte")
    @Expose
    private Long EndTimeLte;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time (s). 
     * @return StartTime Start time (s).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (s).
     * @param StartTime Start time (s).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (s). The difference between the values of EndTime and StartTime cannot exceed 86,400 seconds (one day). 
     * @return EndTime End time (s). The difference between the values of EndTime and StartTime cannot exceed 86,400 seconds (one day).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (s). The difference between the values of EndTime and StartTime cannot exceed 86,400 seconds (one day).
     * @param EndTime End time (s). The difference between the values of EndTime and StartTime cannot exceed 86,400 seconds (one day).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Starting offset for pages, starting from 0. 
     * @return Offset Starting offset for pages, starting from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset for pages, starting from 0.
     * @param Offset Starting offset for pages, starting from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Value range: [1, 100]. 
     * @return Limit Number of entries per page. Value range: [1, 100].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Value range: [1, 100].
     * @param Limit Number of entries per page. Value range: [1, 100].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Execution status, for example, ERROR. 
     * @return State Execution status, for example, ERROR.
     */
    public String [] getState() {
        return this.State;
    }

    /**
     * Set Execution status, for example, ERROR.
     * @param State Execution status, for example, ERROR.
     */
    public void setState(String [] State) {
        this.State = State;
    }

    /**
     * Get Time point earlier than the end time. 
     * @return EndTimeGte Time point earlier than the end time.
     */
    public Long getEndTimeGte() {
        return this.EndTimeGte;
    }

    /**
     * Set Time point earlier than the end time.
     * @param EndTimeGte Time point earlier than the end time.
     */
    public void setEndTimeGte(Long EndTimeGte) {
        this.EndTimeGte = EndTimeGte;
    }

    /**
     * Get Time point later than the end time. 
     * @return EndTimeLte Time point later than the end time.
     */
    public Long getEndTimeLte() {
        return this.EndTimeLte;
    }

    /**
     * Set Time point later than the end time.
     * @param EndTimeLte Time point later than the end time.
     */
    public void setEndTimeLte(Long EndTimeLte) {
        this.EndTimeLte = EndTimeLte;
    }

    public DescribeHiveQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHiveQueriesRequest(DescribeHiveQueriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.State != null) {
            this.State = new String[source.State.length];
            for (int i = 0; i < source.State.length; i++) {
                this.State[i] = new String(source.State[i]);
            }
        }
        if (source.EndTimeGte != null) {
            this.EndTimeGte = new Long(source.EndTimeGte);
        }
        if (source.EndTimeLte != null) {
            this.EndTimeLte = new Long(source.EndTimeLte);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "State.", this.State);
        this.setParamSimple(map, prefix + "EndTimeGte", this.EndTimeGte);
        this.setParamSimple(map, prefix + "EndTimeLte", this.EndTimeLte);

    }
}

