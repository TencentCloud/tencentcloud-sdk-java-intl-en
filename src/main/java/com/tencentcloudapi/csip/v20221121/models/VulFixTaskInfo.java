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

public class VulFixTaskInfo extends AbstractModel {

    /**
    * Primary key ID of the fix task
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Remediation status
Enumeration values:
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
    * Repair total number of assets
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * Number of successful fixes
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * FIX_FAILURE count
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * Number of hosts in remediation
    */
    @SerializedName("FixingCount")
    @Expose
    private Long FixingCount;

    /**
    * Number in queue (waiting for distribution or snapshot creation)
    */
    @SerializedName("QueueCount")
    @Expose
    private Long QueueCount;

    /**
    * Progress percentage of the repair
Value range: [0, 100].
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Number of successfully fixed vulnerabilities
    */
    @SerializedName("SuccessVulCount")
    @Expose
    private Long SuccessVulCount;

    /**
    * Number of vulnerabilities that failed to fix
    */
    @SerializedName("FailVulCount")
    @Expose
    private Long FailVulCount;

    /**
    * List of vulnerability names to be fixed
    */
    @SerializedName("VulNames")
    @Expose
    private String [] VulNames;

    /**
    * Fix startup time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Fixing end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * List of vulnerability dimensional remediation status, status details of each vulnerability
    */
    @SerializedName("VulFixStatusList")
    @Expose
    private VulFixStatusItem [] VulFixStatusList;

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
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Remediation status
Enumeration values:
0: initialization
1: In remediation
2: Repair successful
3: Partially fix failed
4: All fix failures
5: Stop repair 
     * @return FixStatus Remediation status
Enumeration values:
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
Enumeration values:
0: initialization
1: In remediation
2: Repair successful
3: Partially fix failed
4: All fix failures
5: Stop repair
     * @param FixStatus Remediation status
Enumeration values:
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
     * Get Repair total number of assets 
     * @return AssetCount Repair total number of assets
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set Repair total number of assets
     * @param AssetCount Repair total number of assets
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get Number of successful fixes 
     * @return SuccessCount Number of successful fixes
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successful fixes
     * @param SuccessCount Number of successful fixes
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get FIX_FAILURE count 
     * @return FailCount FIX_FAILURE count
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set FIX_FAILURE count
     * @param FailCount FIX_FAILURE count
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get Number of hosts in remediation 
     * @return FixingCount Number of hosts in remediation
     */
    public Long getFixingCount() {
        return this.FixingCount;
    }

    /**
     * Set Number of hosts in remediation
     * @param FixingCount Number of hosts in remediation
     */
    public void setFixingCount(Long FixingCount) {
        this.FixingCount = FixingCount;
    }

    /**
     * Get Number in queue (waiting for distribution or snapshot creation) 
     * @return QueueCount Number in queue (waiting for distribution or snapshot creation)
     */
    public Long getQueueCount() {
        return this.QueueCount;
    }

    /**
     * Set Number in queue (waiting for distribution or snapshot creation)
     * @param QueueCount Number in queue (waiting for distribution or snapshot creation)
     */
    public void setQueueCount(Long QueueCount) {
        this.QueueCount = QueueCount;
    }

    /**
     * Get Progress percentage of the repair
Value range: [0, 100].
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100. 
     * @return Progress Progress percentage of the repair
Value range: [0, 100].
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress percentage of the repair
Value range: [0, 100].
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
     * @param Progress Progress percentage of the repair
Value range: [0, 100].
Supplemental description: Calculation method is (SuccessCount+FailCount)/AssetCount×100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Number of successfully fixed vulnerabilities 
     * @return SuccessVulCount Number of successfully fixed vulnerabilities
     */
    public Long getSuccessVulCount() {
        return this.SuccessVulCount;
    }

    /**
     * Set Number of successfully fixed vulnerabilities
     * @param SuccessVulCount Number of successfully fixed vulnerabilities
     */
    public void setSuccessVulCount(Long SuccessVulCount) {
        this.SuccessVulCount = SuccessVulCount;
    }

    /**
     * Get Number of vulnerabilities that failed to fix 
     * @return FailVulCount Number of vulnerabilities that failed to fix
     */
    public Long getFailVulCount() {
        return this.FailVulCount;
    }

    /**
     * Set Number of vulnerabilities that failed to fix
     * @param FailVulCount Number of vulnerabilities that failed to fix
     */
    public void setFailVulCount(Long FailVulCount) {
        this.FailVulCount = FailVulCount;
    }

    /**
     * Get List of vulnerability names to be fixed 
     * @return VulNames List of vulnerability names to be fixed
     */
    public String [] getVulNames() {
        return this.VulNames;
    }

    /**
     * Set List of vulnerability names to be fixed
     * @param VulNames List of vulnerability names to be fixed
     */
    public void setVulNames(String [] VulNames) {
        this.VulNames = VulNames;
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
     * Get Fixing end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format). 
     * @return EndTime Fixing end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Fixing end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     * @param EndTime Fixing end time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get List of vulnerability dimensional remediation status, status details of each vulnerability 
     * @return VulFixStatusList List of vulnerability dimensional remediation status, status details of each vulnerability
     */
    public VulFixStatusItem [] getVulFixStatusList() {
        return this.VulFixStatusList;
    }

    /**
     * Set List of vulnerability dimensional remediation status, status details of each vulnerability
     * @param VulFixStatusList List of vulnerability dimensional remediation status, status details of each vulnerability
     */
    public void setVulFixStatusList(VulFixStatusItem [] VulFixStatusList) {
        this.VulFixStatusList = VulFixStatusList;
    }

    public VulFixTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixTaskInfo(VulFixTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
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
        if (source.FixingCount != null) {
            this.FixingCount = new Long(source.FixingCount);
        }
        if (source.QueueCount != null) {
            this.QueueCount = new Long(source.QueueCount);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.SuccessVulCount != null) {
            this.SuccessVulCount = new Long(source.SuccessVulCount);
        }
        if (source.FailVulCount != null) {
            this.FailVulCount = new Long(source.FailVulCount);
        }
        if (source.VulNames != null) {
            this.VulNames = new String[source.VulNames.length];
            for (int i = 0; i < source.VulNames.length; i++) {
                this.VulNames[i] = new String(source.VulNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.VulFixStatusList != null) {
            this.VulFixStatusList = new VulFixStatusItem[source.VulFixStatusList.length];
            for (int i = 0; i < source.VulFixStatusList.length; i++) {
                this.VulFixStatusList[i] = new VulFixStatusItem(source.VulFixStatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "FixingCount", this.FixingCount);
        this.setParamSimple(map, prefix + "QueueCount", this.QueueCount);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "SuccessVulCount", this.SuccessVulCount);
        this.setParamSimple(map, prefix + "FailVulCount", this.FailVulCount);
        this.setParamArraySimple(map, prefix + "VulNames.", this.VulNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "VulFixStatusList.", this.VulFixStatusList);

    }
}

