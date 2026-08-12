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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulFixTaskItem extends AbstractModel {

    /**
    * Primary key ID of the fix task
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Task ID, hash flag for interactive
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * JobId, corresponding to the Task ID of the task system.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * List of vulnerability IDs to be fixed
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * List of fixed KB patch IDs
    */
    @SerializedName("KBIds")
    @Expose
    private Long [] KBIds;

    /**
    * Repair the total number of assets
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * Number of successfully fixed hosts
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of hosts failed to be fixed
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * Progress percentage of the repair
Valid values: [0, 100]
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Number of users in the fix task
    */
    @SerializedName("TargetAppIdsCount")
    @Expose
    private Long TargetAppIdsCount;

    /**
    * Remediation status
Enumeration value:
0: initialization
1: In remediation
2: Repair successful
3: Partially fix failed
4: All fix failures
5: Stop repair
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * Maximum repair time
Unit: seconds.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Fix startup time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Fix end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Record creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * List of vulnerability names to be fixed, making it easy to show directly on the list page
    */
    @SerializedName("VulNames")
    @Expose
    private String [] VulNames;

    /**
    * Vulnerability Type List
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
    */
    @SerializedName("VulCategory")
    @Expose
    private String [] VulCategory;

    /**
    * Creator AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get Primary key ID of the fix task 
     * @return Id Primary key ID of the fix task
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Primary key ID of the fix task
     * @param Id Primary key ID of the fix task
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Task ID, hash flag for interactive 
     * @return TaskId Task ID, hash flag for interactive
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID, hash flag for interactive
     * @param TaskId Task ID, hash flag for interactive
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get JobId, corresponding to the Task ID of the task system. 
     * @return JobId JobId, corresponding to the Task ID of the task system.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set JobId, corresponding to the Task ID of the task system.
     * @param JobId JobId, corresponding to the Task ID of the task system.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get List of vulnerability IDs to be fixed 
     * @return VulIds List of vulnerability IDs to be fixed
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set List of vulnerability IDs to be fixed
     * @param VulIds List of vulnerability IDs to be fixed
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get List of fixed KB patch IDs 
     * @return KBIds List of fixed KB patch IDs
     */
    public Long [] getKBIds() {
        return this.KBIds;
    }

    /**
     * Set List of fixed KB patch IDs
     * @param KBIds List of fixed KB patch IDs
     */
    public void setKBIds(Long [] KBIds) {
        this.KBIds = KBIds;
    }

    /**
     * Get Repair the total number of assets 
     * @return AssetCount Repair the total number of assets
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Repair the total number of assets
     * @param AssetCount Repair the total number of assets
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get Number of successfully fixed hosts 
     * @return SuccessCount Number of successfully fixed hosts
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successfully fixed hosts
     * @param SuccessCount Number of successfully fixed hosts
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of hosts failed to be fixed 
     * @return FailCount Number of hosts failed to be fixed
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Number of hosts failed to be fixed
     * @param FailCount Number of hosts failed to be fixed
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get Progress percentage of the repair
Valid values: [0, 100]
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100. 
     * @return Progress Progress percentage of the repair
Valid values: [0, 100]
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress percentage of the repair
Valid values: [0, 100]
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
     * @param Progress Progress percentage of the repair
Valid values: [0, 100]
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Number of users in the fix task 
     * @return TargetAppIdsCount Number of users in the fix task
     */
    public Long getTargetAppIdsCount() {
        return this.TargetAppIdsCount;
    }

    /**
     * Set Number of users in the fix task
     * @param TargetAppIdsCount Number of users in the fix task
     */
    public void setTargetAppIdsCount(Long TargetAppIdsCount) {
        this.TargetAppIdsCount = TargetAppIdsCount;
    }

    /**
     * Get Remediation status
Enumeration value:
0: initialization
1: In remediation
2: Repair successful
3: Partially fix failed
4: All fix failures
5: Stop repair 
     * @return FixStatus Remediation status
Enumeration value:
0: initialization
1: In remediation
2: Repair successful
3: Partially fix failed
4: All fix failures
5: Stop repair
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set Remediation status
Enumeration value:
0: initialization
1: In remediation
2: Repair successful
3: Partially fix failed
4: All fix failures
5: Stop repair
     * @param FixStatus Remediation status
Enumeration value:
0: initialization
1: In remediation
2: Repair successful
3: Partially fix failed
4: All fix failures
5: Stop repair
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get Maximum repair time
Unit: seconds. 
     * @return Timeout Maximum repair time
Unit: seconds.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Maximum repair time
Unit: seconds.
     * @param Timeout Maximum repair time
Unit: seconds.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Fix startup time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return StartTime Fix startup time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Fix startup time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param StartTime Fix startup time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Fix end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return EndTime Fix end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Fix end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param EndTime Fix end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Record creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return CreateTime Record creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Record creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param CreateTime Record creation time.
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get List of vulnerability names to be fixed, making it easy to show directly on the list page 
     * @return VulNames List of vulnerability names to be fixed, making it easy to show directly on the list page
     */
    public String [] getVulNames() {
        return this.VulNames;
    }

    /**
     * Set List of vulnerability names to be fixed, making it easy to show directly on the list page
     * @param VulNames List of vulnerability names to be fixed, making it easy to show directly on the list page
     */
    public void setVulNames(String [] VulNames) {
        this.VulNames = VulNames;
    }

    /**
     * Get Vulnerability Type List
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability 
     * @return VulCategory Vulnerability Type List
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public String [] getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set Vulnerability Type List
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     * @param VulCategory Vulnerability Type List
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch vulnerability
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public void setVulCategory(String [] VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Creator AppId 
     * @return AppId Creator AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Creator AppId
     * @param AppId Creator AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public VulFixTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixTaskItem(VulFixTaskItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.KBIds != null) {
            this.KBIds = new Long[source.KBIds.length];
            for (int i = 0; i < source.KBIds.length; i++) {
                this.KBIds[i] = new Long(source.KBIds[i]);
            }
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.TargetAppIdsCount != null) {
            this.TargetAppIdsCount = new Long(source.TargetAppIdsCount);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VulNames != null) {
            this.VulNames = new String[source.VulNames.length];
            for (int i = 0; i < source.VulNames.length; i++) {
                this.VulNames[i] = new String(source.VulNames[i]);
            }
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String[source.VulCategory.length];
            for (int i = 0; i < source.VulCategory.length; i++) {
                this.VulCategory[i] = new String(source.VulCategory[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamArraySimple(map, prefix + "KBIds.", this.KBIds);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TargetAppIdsCount", this.TargetAppIdsCount);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "VulNames.", this.VulNames);
        this.setParamArraySimple(map, prefix + "VulCategory.", this.VulCategory);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

