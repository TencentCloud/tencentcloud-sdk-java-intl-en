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

public class EDRScanRecordItem extends AbstractModel {

    /**
    * <p>Task primary key ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>Task name, for example, Malware_20260702_030000</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Scan type</p><p>Enumeration values:</p><ul><li>MANNAL: Manual scan</li><li>CYCLE: Scheduled scan</li></ul>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Scheduled scheduling description (has a value when ScanType=1), for example, "Every day at 03:00:00"</p>
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * <p>Task asset type: 0=host scan, 1=container scan</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>AppId list of accounts involved in scanning target</p>
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>Task creator account name</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>Cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>Asset selection method: all=all assets, tag=select by tag, direct=direct selection</p>
    */
    @SerializedName("AssetSelectionType")
    @Expose
    private String AssetSelectionType;

    /**
    * <p>Total number of assets scanned</p>
    */
    @SerializedName("TotalAssetCount")
    @Expose
    private Long TotalAssetCount;

    /**
    * <p>Creator account AppId (the frontend judges operation permission based on this)</p>
    */
    @SerializedName("CreateAppID")
    @Expose
    private Long CreateAppID;

    /**
    * <p>Creator account uin</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>Creator account name</p>
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * <p>Creator cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
    */
    @SerializedName("CreatorCloudType")
    @Expose
    private Long CreatorCloudType;

    /**
    * <p>Task start time. Format: 2006-01-02 15:04:05</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Task end time. If not ended, it is an empty string</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>WAIT: pending scan, SCANNING: scan in progress, FINISHED: completed, FAILED: failure, CANCELED: stopped</p><p>Enumeration values:</p><ul><li>WAIT: pending scan</li><li>SCANNING: scan in progress</li><li>FINISHED: completed</li><li>FAILED: failure</li><li>CANCELED: stopped</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Task primary key ID</p> 
     * @return TaskId <p>Task primary key ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task primary key ID</p>
     * @param TaskId <p>Task primary key ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task name, for example, Malware_20260702_030000</p> 
     * @return TaskName <p>Task name, for example, Malware_20260702_030000</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Task name, for example, Malware_20260702_030000</p>
     * @param TaskName <p>Task name, for example, Malware_20260702_030000</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Scan type</p><p>Enumeration values:</p><ul><li>MANNAL: Manual scan</li><li>CYCLE: Scheduled scan</li></ul> 
     * @return TriggerType <p>Scan type</p><p>Enumeration values:</p><ul><li>MANNAL: Manual scan</li><li>CYCLE: Scheduled scan</li></ul>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Scan type</p><p>Enumeration values:</p><ul><li>MANNAL: Manual scan</li><li>CYCLE: Scheduled scan</li></ul>
     * @param TriggerType <p>Scan type</p><p>Enumeration values:</p><ul><li>MANNAL: Manual scan</li><li>CYCLE: Scheduled scan</li></ul>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Scheduled scheduling description (has a value when ScanType=1), for example, "Every day at 03:00:00"</p> 
     * @return ScheduleDesc <p>Scheduled scheduling description (has a value when ScanType=1), for example, "Every day at 03:00:00"</p>
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set <p>Scheduled scheduling description (has a value when ScanType=1), for example, "Every day at 03:00:00"</p>
     * @param ScheduleDesc <p>Scheduled scheduling description (has a value when ScanType=1), for example, "Every day at 03:00:00"</p>
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get <p>Task asset type: 0=host scan, 1=container scan</p> 
     * @return TaskType <p>Task asset type: 0=host scan, 1=container scan</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task asset type: 0=host scan, 1=container scan</p>
     * @param TaskType <p>Task asset type: 0=host scan, 1=container scan</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>AppId list of accounts involved in scanning target</p> 
     * @return TargetAppIDs <p>AppId list of accounts involved in scanning target</p>
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>AppId list of accounts involved in scanning target</p>
     * @param TargetAppIDs <p>AppId list of accounts involved in scanning target</p>
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>Task creator account name</p> 
     * @return AccountName <p>Task creator account name</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Task creator account name</p>
     * @param AccountName <p>Task creator account name</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>Cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p> 
     * @return CloudType <p>Cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>Cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
     * @param CloudType <p>Cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>Asset selection method: all=all assets, tag=select by tag, direct=direct selection</p> 
     * @return AssetSelectionType <p>Asset selection method: all=all assets, tag=select by tag, direct=direct selection</p>
     */
    public String getAssetSelectionType() {
        return this.AssetSelectionType;
    }

    /**
     * Set <p>Asset selection method: all=all assets, tag=select by tag, direct=direct selection</p>
     * @param AssetSelectionType <p>Asset selection method: all=all assets, tag=select by tag, direct=direct selection</p>
     */
    public void setAssetSelectionType(String AssetSelectionType) {
        this.AssetSelectionType = AssetSelectionType;
    }

    /**
     * Get <p>Total number of assets scanned</p> 
     * @return TotalAssetCount <p>Total number of assets scanned</p>
     */
    public Long getTotalAssetCount() {
        return this.TotalAssetCount;
    }

    /**
     * Set <p>Total number of assets scanned</p>
     * @param TotalAssetCount <p>Total number of assets scanned</p>
     */
    public void setTotalAssetCount(Long TotalAssetCount) {
        this.TotalAssetCount = TotalAssetCount;
    }

    /**
     * Get <p>Creator account AppId (the frontend judges operation permission based on this)</p> 
     * @return CreateAppID <p>Creator account AppId (the frontend judges operation permission based on this)</p>
     */
    public Long getCreateAppID() {
        return this.CreateAppID;
    }

    /**
     * Set <p>Creator account AppId (the frontend judges operation permission based on this)</p>
     * @param CreateAppID <p>Creator account AppId (the frontend judges operation permission based on this)</p>
     */
    public void setCreateAppID(Long CreateAppID) {
        this.CreateAppID = CreateAppID;
    }

    /**
     * Get <p>Creator account uin</p> 
     * @return Creator <p>Creator account uin</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>Creator account uin</p>
     * @param Creator <p>Creator account uin</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>Creator account name</p> 
     * @return CreatorName <p>Creator account name</p>
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set <p>Creator account name</p>
     * @param CreatorName <p>Creator account name</p>
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get <p>Creator cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p> 
     * @return CreatorCloudType <p>Creator cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
     */
    public Long getCreatorCloudType() {
        return this.CreatorCloudType;
    }

    /**
     * Set <p>Creator cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
     * @param CreatorCloudType <p>Creator cloud type: 0=Tencent Cloud, 1=AWS, 2=Azure, 4=Alibaba Cloud</p>
     */
    public void setCreatorCloudType(Long CreatorCloudType) {
        this.CreatorCloudType = CreatorCloudType;
    }

    /**
     * Get <p>Task start time. Format: 2006-01-02 15:04:05</p> 
     * @return StartTime <p>Task start time. Format: 2006-01-02 15:04:05</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Task start time. Format: 2006-01-02 15:04:05</p>
     * @param StartTime <p>Task start time. Format: 2006-01-02 15:04:05</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Task end time. If not ended, it is an empty string</p> 
     * @return EndTime <p>Task end time. If not ended, it is an empty string</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Task end time. If not ended, it is an empty string</p>
     * @param EndTime <p>Task end time. If not ended, it is an empty string</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>WAIT: pending scan, SCANNING: scan in progress, FINISHED: completed, FAILED: failure, CANCELED: stopped</p><p>Enumeration values:</p><ul><li>WAIT: pending scan</li><li>SCANNING: scan in progress</li><li>FINISHED: completed</li><li>FAILED: failure</li><li>CANCELED: stopped</li></ul> 
     * @return Status <p>WAIT: pending scan, SCANNING: scan in progress, FINISHED: completed, FAILED: failure, CANCELED: stopped</p><p>Enumeration values:</p><ul><li>WAIT: pending scan</li><li>SCANNING: scan in progress</li><li>FINISHED: completed</li><li>FAILED: failure</li><li>CANCELED: stopped</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>WAIT: pending scan, SCANNING: scan in progress, FINISHED: completed, FAILED: failure, CANCELED: stopped</p><p>Enumeration values:</p><ul><li>WAIT: pending scan</li><li>SCANNING: scan in progress</li><li>FINISHED: completed</li><li>FAILED: failure</li><li>CANCELED: stopped</li></ul>
     * @param Status <p>WAIT: pending scan, SCANNING: scan in progress, FINISHED: completed, FAILED: failure, CANCELED: stopped</p><p>Enumeration values:</p><ul><li>WAIT: pending scan</li><li>SCANNING: scan in progress</li><li>FINISHED: completed</li><li>FAILED: failure</li><li>CANCELED: stopped</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public EDRScanRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRScanRecordItem(EDRScanRecordItem source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.AssetSelectionType != null) {
            this.AssetSelectionType = new String(source.AssetSelectionType);
        }
        if (source.TotalAssetCount != null) {
            this.TotalAssetCount = new Long(source.TotalAssetCount);
        }
        if (source.CreateAppID != null) {
            this.CreateAppID = new Long(source.CreateAppID);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.CreatorCloudType != null) {
            this.CreatorCloudType = new Long(source.CreatorCloudType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "AssetSelectionType", this.AssetSelectionType);
        this.setParamSimple(map, prefix + "TotalAssetCount", this.TotalAssetCount);
        this.setParamSimple(map, prefix + "CreateAppID", this.CreateAppID);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "CreatorCloudType", this.CreatorCloudType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

