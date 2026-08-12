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

public class VulScanTask extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>Associated user appid of the task</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Task type</p><p>Enumeration value:</p><ul><li>0: One-click scan</li><li>1: Period scanning</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>Vulnerability type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
    */
    @SerializedName("VulCategory")
    @Expose
    private String [] VulCategory;

    /**
    * <p>Vulnerability name</p>
    */
    @SerializedName("VulName")
    @Expose
    private String [] VulName;

    /**
    * <p>kb name.</p>
    */
    @SerializedName("KbName")
    @Expose
    private String [] KbName;

    /**
    * <p>Whether an emergency vulnerability</p><p>Enumeration value:</p><ul><li>0: No</li><li>1: Yes</li></ul>
    */
    @SerializedName("Emergency")
    @Expose
    private Long Emergency;

    /**
    * <p>Number of accounts to scan (0: all accounts, others: number of accounts)</p>
    */
    @SerializedName("Account")
    @Expose
    private Long Account;

    /**
    * <p>Scan start time</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Scan end time</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Scan status (INITIALIZING: Initialization, SCANNING: Scanning, SUCCESS: Scan successful, TOTAL_FAIL: Total scan failure)</p><p>Enumeration value:</p><ul><li>STOPPED: Stopped</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Vulnerability threat level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String [] Level;

    /**
    * <p>Scanning method</p><p>Enumeration value:</p><ul><li>VersionCompare: version comparison</li><li>POC: POC detection</li><li>VersionComparePOC: version comparison+POC detection</li></ul>
    */
    @SerializedName("Method")
    @Expose
    private String [] Method;

    /**
    * <p>Asset list</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
    * <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Custom assets</li><li>2: Selected excluded assets</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
     * Get <p>Task ID.</p> 
     * @return Id <p>Task ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Task ID.</p>
     * @param Id <p>Task ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return JobId <p>Task ID.</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param JobId <p>Task ID.</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>Associated user appid of the task</p> 
     * @return AppId <p>Associated user appid of the task</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Associated user appid of the task</p>
     * @param AppId <p>Associated user appid of the task</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Task type</p><p>Enumeration value:</p><ul><li>0: One-click scan</li><li>1: Period scanning</li></ul> 
     * @return TaskType <p>Task type</p><p>Enumeration value:</p><ul><li>0: One-click scan</li><li>1: Period scanning</li></ul>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type</p><p>Enumeration value:</p><ul><li>0: One-click scan</li><li>1: Period scanning</li></ul>
     * @param TaskType <p>Task type</p><p>Enumeration value:</p><ul><li>0: One-click scan</li><li>1: Period scanning</li></ul>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Vulnerability type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul> 
     * @return VulCategory <p>Vulnerability type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
     */
    public String [] getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set <p>Vulnerability type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
     * @param VulCategory <p>Vulnerability type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
     */
    public void setVulCategory(String [] VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get <p>Vulnerability name</p> 
     * @return VulName <p>Vulnerability name</p>
     */
    public String [] getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>Vulnerability name</p>
     * @param VulName <p>Vulnerability name</p>
     */
    public void setVulName(String [] VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>kb name.</p> 
     * @return KbName <p>kb name.</p>
     */
    public String [] getKbName() {
        return this.KbName;
    }

    /**
     * Set <p>kb name.</p>
     * @param KbName <p>kb name.</p>
     */
    public void setKbName(String [] KbName) {
        this.KbName = KbName;
    }

    /**
     * Get <p>Whether an emergency vulnerability</p><p>Enumeration value:</p><ul><li>0: No</li><li>1: Yes</li></ul> 
     * @return Emergency <p>Whether an emergency vulnerability</p><p>Enumeration value:</p><ul><li>0: No</li><li>1: Yes</li></ul>
     */
    public Long getEmergency() {
        return this.Emergency;
    }

    /**
     * Set <p>Whether an emergency vulnerability</p><p>Enumeration value:</p><ul><li>0: No</li><li>1: Yes</li></ul>
     * @param Emergency <p>Whether an emergency vulnerability</p><p>Enumeration value:</p><ul><li>0: No</li><li>1: Yes</li></ul>
     */
    public void setEmergency(Long Emergency) {
        this.Emergency = Emergency;
    }

    /**
     * Get <p>Number of accounts to scan (0: all accounts, others: number of accounts)</p> 
     * @return Account <p>Number of accounts to scan (0: all accounts, others: number of accounts)</p>
     */
    public Long getAccount() {
        return this.Account;
    }

    /**
     * Set <p>Number of accounts to scan (0: all accounts, others: number of accounts)</p>
     * @param Account <p>Number of accounts to scan (0: all accounts, others: number of accounts)</p>
     */
    public void setAccount(Long Account) {
        this.Account = Account;
    }

    /**
     * Get <p>Scan start time</p> 
     * @return StartTime <p>Scan start time</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Scan start time</p>
     * @param StartTime <p>Scan start time</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Scan end time</p> 
     * @return EndTime <p>Scan end time</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Scan end time</p>
     * @param EndTime <p>Scan end time</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Scan status (INITIALIZING: Initialization, SCANNING: Scanning, SUCCESS: Scan successful, TOTAL_FAIL: Total scan failure)</p><p>Enumeration value:</p><ul><li>STOPPED: Stopped</li></ul> 
     * @return Status <p>Scan status (INITIALIZING: Initialization, SCANNING: Scanning, SUCCESS: Scan successful, TOTAL_FAIL: Total scan failure)</p><p>Enumeration value:</p><ul><li>STOPPED: Stopped</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Scan status (INITIALIZING: Initialization, SCANNING: Scanning, SUCCESS: Scan successful, TOTAL_FAIL: Total scan failure)</p><p>Enumeration value:</p><ul><li>STOPPED: Stopped</li></ul>
     * @param Status <p>Scan status (INITIALIZING: Initialization, SCANNING: Scanning, SUCCESS: Scan successful, TOTAL_FAIL: Total scan failure)</p><p>Enumeration value:</p><ul><li>STOPPED: Stopped</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Vulnerability threat level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul> 
     * @return Level <p>Vulnerability threat level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     */
    public String [] getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Vulnerability threat level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     * @param Level <p>Vulnerability threat level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     */
    public void setLevel(String [] Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Scanning method</p><p>Enumeration value:</p><ul><li>VersionCompare: version comparison</li><li>POC: POC detection</li><li>VersionComparePOC: version comparison+POC detection</li></ul> 
     * @return Method <p>Scanning method</p><p>Enumeration value:</p><ul><li>VersionCompare: version comparison</li><li>POC: POC detection</li><li>VersionComparePOC: version comparison+POC detection</li></ul>
     */
    public String [] getMethod() {
        return this.Method;
    }

    /**
     * Set <p>Scanning method</p><p>Enumeration value:</p><ul><li>VersionCompare: version comparison</li><li>POC: POC detection</li><li>VersionComparePOC: version comparison+POC detection</li></ul>
     * @param Method <p>Scanning method</p><p>Enumeration value:</p><ul><li>VersionCompare: version comparison</li><li>POC: POC detection</li><li>VersionComparePOC: version comparison+POC detection</li></ul>
     */
    public void setMethod(String [] Method) {
        this.Method = Method;
    }

    /**
     * Get <p>Asset list</p> 
     * @return AssetList <p>Asset list</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>Asset list</p>
     * @param AssetList <p>Asset list</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Custom assets</li><li>2: Selected excluded assets</li></ul> 
     * @return AssetRange <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Custom assets</li><li>2: Selected excluded assets</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Custom assets</li><li>2: Selected excluded assets</li></ul>
     * @param AssetRange <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Custom assets</li><li>2: Selected excluded assets</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    public VulScanTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulScanTask(VulScanTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String[source.VulCategory.length];
            for (int i = 0; i < source.VulCategory.length; i++) {
                this.VulCategory[i] = new String(source.VulCategory[i]);
            }
        }
        if (source.VulName != null) {
            this.VulName = new String[source.VulName.length];
            for (int i = 0; i < source.VulName.length; i++) {
                this.VulName[i] = new String(source.VulName[i]);
            }
        }
        if (source.KbName != null) {
            this.KbName = new String[source.KbName.length];
            for (int i = 0; i < source.KbName.length; i++) {
                this.KbName[i] = new String(source.KbName[i]);
            }
        }
        if (source.Emergency != null) {
            this.Emergency = new Long(source.Emergency);
        }
        if (source.Account != null) {
            this.Account = new Long(source.Account);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Level != null) {
            this.Level = new String[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new String(source.Level[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String[source.Method.length];
            for (int i = 0; i < source.Method.length; i++) {
                this.Method[i] = new String(source.Method[i]);
            }
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "VulCategory.", this.VulCategory);
        this.setParamArraySimple(map, prefix + "VulName.", this.VulName);
        this.setParamArraySimple(map, prefix + "KbName.", this.KbName);
        this.setParamSimple(map, prefix + "Emergency", this.Emergency);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);
        this.setParamArraySimple(map, prefix + "Method.", this.Method);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);

    }
}

