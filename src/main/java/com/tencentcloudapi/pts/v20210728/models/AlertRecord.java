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

public class AlertRecord extends AbstractModel {

    /**
    * Alert history record ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AlertRecordId")
    @Expose
    private String AlertRecordId;

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
    * Status.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private AlertRecordStatus Status;

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
    * Job ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

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
    * Scenario name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * Alert target.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * SLA ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("JobSLAId")
    @Expose
    private String JobSLAId;

    /**
    * SLA description.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("JobSLADescription")
    @Expose
    private String JobSLADescription;

    /**
     * Get Alert history record ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return AlertRecordId Alert history record ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getAlertRecordId() {
        return this.AlertRecordId;
    }

    /**
     * Set Alert history record ID.

Note: This field may return null, indicating that no valid value is found.
     * @param AlertRecordId Alert history record ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAlertRecordId(String AlertRecordId) {
        this.AlertRecordId = AlertRecordId;
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
     * Get Status.

Note: This field may return null, indicating that no valid value is found. 
     * @return Status Status.

Note: This field may return null, indicating that no valid value is found.
     */
    public AlertRecordStatus getStatus() {
        return this.Status;
    }

    /**
     * Set Status.

Note: This field may return null, indicating that no valid value is found.
     * @param Status Status.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(AlertRecordStatus Status) {
        this.Status = Status;
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
     * Get Job ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return JobId Job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID.

Note: This field may return null, indicating that no valid value is found.
     * @param JobId Job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
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
     * Get Alert target.

Note: This field may return null, indicating that no valid value is found. 
     * @return Target Alert target.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Alert target.

Note: This field may return null, indicating that no valid value is found.
     * @param Target Alert target.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get SLA ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return JobSLAId SLA ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getJobSLAId() {
        return this.JobSLAId;
    }

    /**
     * Set SLA ID.

Note: This field may return null, indicating that no valid value is found.
     * @param JobSLAId SLA ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setJobSLAId(String JobSLAId) {
        this.JobSLAId = JobSLAId;
    }

    /**
     * Get SLA description.

Note: This field may return null, indicating that no valid value is found. 
     * @return JobSLADescription SLA description.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getJobSLADescription() {
        return this.JobSLADescription;
    }

    /**
     * Set SLA description.

Note: This field may return null, indicating that no valid value is found.
     * @param JobSLADescription SLA description.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setJobSLADescription(String JobSLADescription) {
        this.JobSLADescription = JobSLADescription;
    }

    public AlertRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertRecord(AlertRecord source) {
        if (source.AlertRecordId != null) {
            this.AlertRecordId = new String(source.AlertRecordId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Status != null) {
            this.Status = new AlertRecordStatus(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
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
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.JobSLAId != null) {
            this.JobSLAId = new String(source.JobSLAId);
        }
        if (source.JobSLADescription != null) {
            this.JobSLADescription = new String(source.JobSLADescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertRecordId", this.AlertRecordId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "JobSLAId", this.JobSLAId);
        this.setParamSimple(map, prefix + "JobSLADescription", this.JobSLADescription);

    }
}

