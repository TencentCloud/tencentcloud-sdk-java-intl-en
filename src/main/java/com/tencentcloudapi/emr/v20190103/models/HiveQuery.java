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

public class HiveQuery extends AbstractModel {

    /**
    * Query statementNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * Execution Duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * Start Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * StatusNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * UserNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * AppId List
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * Execution Engine
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionEngine")
    @Expose
    private String ExecutionEngine;

    /**
    * Query ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Query statementNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Statement Query statementNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set Query statementNote: This field may return null, indicating that no valid values can be obtained.
     * @param Statement Query statementNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get Execution Duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Duration Execution Duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Execution Duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Duration Execution Duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Start Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End Time in Milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get StatusNote: This field may return null, indicating that no valid values can be obtained. 
     * @return State StatusNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set StatusNote: This field may return null, indicating that no valid values can be obtained.
     * @param State StatusNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get UserNote: This field may return null, indicating that no valid values can be obtained. 
     * @return User UserNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set UserNote: This field may return null, indicating that no valid values can be obtained.
     * @param User UserNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get AppId List
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobIds AppId List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set AppId List
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobIds AppId List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Get Execution Engine
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionEngine Execution Engine
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionEngine() {
        return this.ExecutionEngine;
    }

    /**
     * Set Execution Engine
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionEngine Execution Engine
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionEngine(String ExecutionEngine) {
        this.ExecutionEngine = ExecutionEngine;
    }

    /**
     * Get Query ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Query ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Query ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Query ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public HiveQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiveQuery(HiveQuery source) {
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
        if (source.ExecutionEngine != null) {
            this.ExecutionEngine = new String(source.ExecutionEngine);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamSimple(map, prefix + "ExecutionEngine", this.ExecutionEngine);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

