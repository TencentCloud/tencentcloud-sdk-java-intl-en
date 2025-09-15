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

public class SchedulerTaskInfo extends AbstractModel {

    /**
    * Scheduler type
    */
    @SerializedName("SchedulerName")
    @Expose
    private String SchedulerName;

    /**
    * Operation type
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * Start time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Status.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Details")
    @Expose
    private SchedulerTaskDetail [] Details;

    /**
     * Get Scheduler type 
     * @return SchedulerName Scheduler type
     */
    public String getSchedulerName() {
        return this.SchedulerName;
    }

    /**
     * Set Scheduler type
     * @param SchedulerName Scheduler type
     */
    public void setSchedulerName(String SchedulerName) {
        this.SchedulerName = SchedulerName;
    }

    /**
     * Get Operation type 
     * @return OperatorName Operation type
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set Operation type
     * @param OperatorName Operation type
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get Start time. 
     * @return CreateTime Start time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Start time.
     * @param CreateTime Start time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Status. 
     * @return State Status.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Status.
     * @param State Status.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Details Details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SchedulerTaskDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set Details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Details Details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetails(SchedulerTaskDetail [] Details) {
        this.Details = Details;
    }

    public SchedulerTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulerTaskInfo(SchedulerTaskInfo source) {
        if (source.SchedulerName != null) {
            this.SchedulerName = new String(source.SchedulerName);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Details != null) {
            this.Details = new SchedulerTaskDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new SchedulerTaskDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SchedulerName", this.SchedulerName);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

