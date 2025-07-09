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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronJob extends AbstractModel {

    /**
    * Cron job ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CronJobId")
    @Expose
    private String CronJobId;

    /**
    * Cron job name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Scenario ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Scenario name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * Cron expression.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
    * End time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Abort reason.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AbortReason")
    @Expose
    private Long AbortReason;

    /**
    * Cron job status.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Notice ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * Create time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("FrequencyType")
    @Expose
    private Long FrequencyType;

    /**
    * Note.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Cron job initiator.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("JobOwner")
    @Expose
    private String JobOwner;

    /**
    * App ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub account uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get Cron job ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return CronJobId Cron job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCronJobId() {
        return this.CronJobId;
    }

    /**
     * Set Cron job ID.

Note: This field may return null, indicating that no valid value is found.
     * @param CronJobId Cron job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCronJobId(String CronJobId) {
        this.CronJobId = CronJobId;
    }

    /**
     * Get Cron job name.

Note: This field may return null, indicating that no valid value is found. 
     * @return Name Cron job name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cron job name.

Note: This field may return null, indicating that no valid value is found.
     * @param Name Cron job name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid value is found.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Scenario ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return ScenarioId Scenario ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set Scenario ID.

Note: This field may return null, indicating that no valid value is found.
     * @param ScenarioId Scenario ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get Scenario name.

Note: This field may return null, indicating that no valid value is found. 
     * @return ScenarioName Scenario name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getScenarioName() {
        return this.ScenarioName;
    }

    /**
     * Set Scenario name.

Note: This field may return null, indicating that no valid value is found.
     * @param ScenarioName Scenario name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScenarioName(String ScenarioName) {
        this.ScenarioName = ScenarioName;
    }

    /**
     * Get Cron expression.

Note: This field may return null, indicating that no valid value is found. 
     * @return CronExpression Cron expression.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set Cron expression.

Note: This field may return null, indicating that no valid value is found.
     * @param CronExpression Cron expression.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    /**
     * Get End time.

Note: This field may return null, indicating that no valid value is found. 
     * @return EndTime End time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.

Note: This field may return null, indicating that no valid value is found.
     * @param EndTime End time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Abort reason.

Note: This field may return null, indicating that no valid value is found. 
     * @return AbortReason Abort reason.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAbortReason() {
        return this.AbortReason;
    }

    /**
     * Set Abort reason.

Note: This field may return null, indicating that no valid value is found.
     * @param AbortReason Abort reason.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAbortReason(Long AbortReason) {
        this.AbortReason = AbortReason;
    }

    /**
     * Get Cron job status.

Note: This field may return null, indicating that no valid value is found. 
     * @return Status Cron job status.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cron job status.

Note: This field may return null, indicating that no valid value is found.
     * @param Status Cron job status.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Notice ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return NoticeId Notice ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set Notice ID.

Note: This field may return null, indicating that no valid value is found.
     * @param NoticeId Notice ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get Create time.

Note: This field may return null, indicating that no valid value is found. 
     * @return CreatedAt Create time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Create time.

Note: This field may return null, indicating that no valid value is found.
     * @param CreatedAt Create time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time.

Note: This field may return null, indicating that no valid value is found. 
     * @return UpdatedAt Update time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.

Note: This field may return null, indicating that no valid value is found.
     * @param UpdatedAt Update time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.

Note: This field may return null, indicating that no valid value is found. 
     * @return FrequencyType Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getFrequencyType() {
        return this.FrequencyType;
    }

    /**
     * Set Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.

Note: This field may return null, indicating that no valid value is found.
     * @param FrequencyType Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setFrequencyType(Long FrequencyType) {
        this.FrequencyType = FrequencyType;
    }

    /**
     * Get Note.

Note: This field may return null, indicating that no valid value is found. 
     * @return Note Note.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Note.

Note: This field may return null, indicating that no valid value is found.
     * @param Note Note.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Cron job initiator.

Note: This field may return null, indicating that no valid value is found. 
     * @return JobOwner Cron job initiator.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getJobOwner() {
        return this.JobOwner;
    }

    /**
     * Set Cron job initiator.

Note: This field may return null, indicating that no valid value is found.
     * @param JobOwner Cron job initiator.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setJobOwner(String JobOwner) {
        this.JobOwner = JobOwner;
    }

    /**
     * Get App ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return AppId App ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID.

Note: This field may return null, indicating that no valid value is found.
     * @param AppId App ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return Uin Account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account uin.

Note: This field may return null, indicating that no valid value is found.
     * @param Uin Account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub account uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     * @param SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    public CronJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronJob(CronJob source) {
        if (source.CronJobId != null) {
            this.CronJobId = new String(source.CronJobId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AbortReason != null) {
            this.AbortReason = new Long(source.AbortReason);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.FrequencyType != null) {
            this.FrequencyType = new Long(source.FrequencyType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.JobOwner != null) {
            this.JobOwner = new String(source.JobOwner);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CronJobId", this.CronJobId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AbortReason", this.AbortReason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "FrequencyType", this.FrequencyType);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "JobOwner", this.JobOwner);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

