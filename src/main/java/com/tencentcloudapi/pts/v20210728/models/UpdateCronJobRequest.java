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

public class UpdateCronJobRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Cron job ID.
    */
    @SerializedName("CronJobId")
    @Expose
    private String CronJobId;

    /**
    * Note.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Cron expression.
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
    * Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.
    */
    @SerializedName("FrequencyType")
    @Expose
    private Long FrequencyType;

    /**
    * Cron job Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Scenario ID.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Scenario name.
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * Cron job Initiator.
    */
    @SerializedName("JobOwner")
    @Expose
    private String JobOwner;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Notice ID.
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cron job ID. 
     * @return CronJobId Cron job ID.
     */
    public String getCronJobId() {
        return this.CronJobId;
    }

    /**
     * Set Cron job ID.
     * @param CronJobId Cron job ID.
     */
    public void setCronJobId(String CronJobId) {
        this.CronJobId = CronJobId;
    }

    /**
     * Get Note. 
     * @return Note Note.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Note.
     * @param Note Note.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Cron expression. 
     * @return CronExpression Cron expression.
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set Cron expression.
     * @param CronExpression Cron expression.
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    /**
     * Get Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression. 
     * @return FrequencyType Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.
     */
    public Long getFrequencyType() {
        return this.FrequencyType;
    }

    /**
     * Set Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.
     * @param FrequencyType Execution frequency type: 1, execute once only; 2, Daily; 3, Weekly; 4, Advanced mode using cron expression.
     */
    public void setFrequencyType(Long FrequencyType) {
        this.FrequencyType = FrequencyType;
    }

    /**
     * Get Cron job Name. 
     * @return Name Cron job Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cron job Name.
     * @param Name Cron job Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Scenario ID. 
     * @return ScenarioId Scenario ID.
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set Scenario ID.
     * @param ScenarioId Scenario ID.
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get Scenario name. 
     * @return ScenarioName Scenario name.
     */
    public String getScenarioName() {
        return this.ScenarioName;
    }

    /**
     * Set Scenario name.
     * @param ScenarioName Scenario name.
     */
    public void setScenarioName(String ScenarioName) {
        this.ScenarioName = ScenarioName;
    }

    /**
     * Get Cron job Initiator. 
     * @return JobOwner Cron job Initiator.
     */
    public String getJobOwner() {
        return this.JobOwner;
    }

    /**
     * Set Cron job Initiator.
     * @param JobOwner Cron job Initiator.
     */
    public void setJobOwner(String JobOwner) {
        this.JobOwner = JobOwner;
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
     * Get Notice ID. 
     * @return NoticeId Notice ID.
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set Notice ID.
     * @param NoticeId Notice ID.
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    public UpdateCronJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCronJobRequest(UpdateCronJobRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CronJobId != null) {
            this.CronJobId = new String(source.CronJobId);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
        if (source.FrequencyType != null) {
            this.FrequencyType = new Long(source.FrequencyType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.JobOwner != null) {
            this.JobOwner = new String(source.JobOwner);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CronJobId", this.CronJobId);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);
        this.setParamSimple(map, prefix + "FrequencyType", this.FrequencyType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "JobOwner", this.JobOwner);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);

    }
}

