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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GCJobInfo extends AbstractModel {

    /**
    * Job ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Job status
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * Creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Scheduling information
    */
    @SerializedName("Schedule")
    @Expose
    private Schedule Schedule;

    /**
     * Get Job ID 
     * @return ID Job ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Job ID
     * @param ID Job ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Job status 
     * @return JobStatus Job status
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set Job status
     * @param JobStatus Job status
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get Creation time 
     * @return CreationTime Creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time
     * @param CreationTime Creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Scheduling information 
     * @return Schedule Scheduling information
     */
    public Schedule getSchedule() {
        return this.Schedule;
    }

    /**
     * Set Scheduling information
     * @param Schedule Scheduling information
     */
    public void setSchedule(Schedule Schedule) {
        this.Schedule = Schedule;
    }

    public GCJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GCJobInfo(GCJobInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Schedule != null) {
            this.Schedule = new Schedule(source.Schedule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);

    }
}

