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
    * Query statement.
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * Execution duration.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * Start time in milliseconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time in milliseconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Status.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * User.
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
    * Execution engine.
    */
    @SerializedName("ExecutionEngine")
    @Expose
    private String ExecutionEngine;

    /**
    * Query ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Query statement. 
     * @return Statement Query statement.
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set Query statement.
     * @param Statement Query statement.
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get Execution duration. 
     * @return Duration Execution duration.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Execution duration.
     * @param Duration Execution duration.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Start time in milliseconds. 
     * @return StartTime Start time in milliseconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in milliseconds.
     * @param StartTime Start time in milliseconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in milliseconds. 
     * @return EndTime End time in milliseconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in milliseconds.
     * @param EndTime End time in milliseconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Status. 
     * @return State Status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status.
     * @param State Status.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get User. 
     * @return User User.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User.
     * @param User User.
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
     * Get Execution engine. 
     * @return ExecutionEngine Execution engine.
     */
    public String getExecutionEngine() {
        return this.ExecutionEngine;
    }

    /**
     * Set Execution engine.
     * @param ExecutionEngine Execution engine.
     */
    public void setExecutionEngine(String ExecutionEngine) {
        this.ExecutionEngine = ExecutionEngine;
    }

    /**
     * Get Query ID. 
     * @return Id Query ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Query ID.
     * @param Id Query ID.
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

