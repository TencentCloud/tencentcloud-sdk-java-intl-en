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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobDto extends AbstractModel {

    /**
    * Task ID of the data exploration.

    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Task name.
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Task type
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * Script ID
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * Subtask List
    */
    @SerializedName("JobExecutionList")
    @Expose
    private JobExecutionDto [] JobExecutionList;

    /**
    * Specifies the script content.
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * State of a task.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * End time.

    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Root account UIN.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Account UIN.
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * Duration. specifies the time taken.

    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * Specifies whether the script content is truncated.

    */
    @SerializedName("ScriptContentTruncate")
    @Expose
    private Boolean ScriptContentTruncate;

    /**
     * Get Task ID of the data exploration.
 
     * @return JobId Task ID of the data exploration.

     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID of the data exploration.

     * @param JobId Task ID of the data exploration.

     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Task name. 
     * @return JobName Task name.
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Task name.
     * @param JobName Task name.
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Task type 
     * @return JobType Task type
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Task type
     * @param JobType Task type
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get Script ID 
     * @return ScriptId Script ID
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set Script ID
     * @param ScriptId Script ID
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get Subtask List 
     * @return JobExecutionList Subtask List
     */
    public JobExecutionDto [] getJobExecutionList() {
        return this.JobExecutionList;
    }

    /**
     * Set Subtask List
     * @param JobExecutionList Subtask List
     */
    public void setJobExecutionList(JobExecutionDto [] JobExecutionList) {
        this.JobExecutionList = JobExecutionList;
    }

    /**
     * Get Specifies the script content. 
     * @return ScriptContent Specifies the script content.
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Specifies the script content.
     * @param ScriptContent Specifies the script content.
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get State of a task. 
     * @return Status State of a task.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set State of a task.
     * @param Status State of a task.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get Root account UIN. 
     * @return OwnerUin Root account UIN.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Root account UIN.
     * @param OwnerUin Root account UIN.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Account UIN. 
     * @return UserUin Account UIN.
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set Account UIN.
     * @param UserUin Account UIN.
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get Duration. specifies the time taken.
 
     * @return TimeCost Duration. specifies the time taken.

     */
    public Long getTimeCost() {
        return this.TimeCost;
    }

    /**
     * Set Duration. specifies the time taken.

     * @param TimeCost Duration. specifies the time taken.

     */
    public void setTimeCost(Long TimeCost) {
        this.TimeCost = TimeCost;
    }

    /**
     * Get Specifies whether the script content is truncated.
 
     * @return ScriptContentTruncate Specifies whether the script content is truncated.

     */
    public Boolean getScriptContentTruncate() {
        return this.ScriptContentTruncate;
    }

    /**
     * Set Specifies whether the script content is truncated.

     * @param ScriptContentTruncate Specifies whether the script content is truncated.

     */
    public void setScriptContentTruncate(Boolean ScriptContentTruncate) {
        this.ScriptContentTruncate = ScriptContentTruncate;
    }

    public JobDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobDto(JobDto source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.JobExecutionList != null) {
            this.JobExecutionList = new JobExecutionDto[source.JobExecutionList.length];
            for (int i = 0; i < source.JobExecutionList.length; i++) {
                this.JobExecutionList[i] = new JobExecutionDto(source.JobExecutionList[i]);
            }
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.TimeCost != null) {
            this.TimeCost = new Long(source.TimeCost);
        }
        if (source.ScriptContentTruncate != null) {
            this.ScriptContentTruncate = new Boolean(source.ScriptContentTruncate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamArrayObj(map, prefix + "JobExecutionList.", this.JobExecutionList);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "TimeCost", this.TimeCost);
        this.setParamSimple(map, prefix + "ScriptContentTruncate", this.ScriptContentTruncate);

    }
}

