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

public class ImageRegistryScanTaskInfo extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Scheduled scan task id.</p>
    */
    @SerializedName("TimedScanConfigId")
    @Expose
    private Long TimedScanConfigId;

    /**
    * <p>Automatic matching mode</p><p>Enumeration values:</p><ul><li>BY_CLUSTER: Select by cluster</li><li>LATEST_VERSION: Scan the latest version image only</li><li>LOCAL_IMAGE: Local image</li></ul>
    */
    @SerializedName("AutoMatchMode")
    @Expose
    private String [] AutoMatchMode;

    /**
    * <p>Scan asset mode</p><p>Enumeration values:</p><ul><li>ALL: All</li><li>MANUAL: Manual selection</li><li>AUTO_MATCH: Automatic matching</li></ul>
    */
    @SerializedName("ScopeMode")
    @Expose
    private String ScopeMode;

    /**
    * <p>Task trigger type</p><p>Enumeration values:</p><ul><li>TIMED: scheduled task</li><li>MANUAL: manual triggering</li></ul>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * <p>Image id scanned</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private Long [] ImageIds;

    /**
    * <p>Task status</p><p>Enumeration values:</p><ul><li>RUNNING: Executing</li><li>SUCCESS: Task successful</li><li>TIMEOUT: Task timeout</li><li>FAILED: Task failure</li><li>CANCELLED: Canceled</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Scheduled task associated account name</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>appid of the account associated with the scheduled task</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>uin of the associated account for the scheduled task</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>Scan image count</p>
    */
    @SerializedName("ScanImageCount")
    @Expose
    private Long ScanImageCount;

    /**
    * <p>Image count scanned successfully</p>
    */
    @SerializedName("SuccessImageCount")
    @Expose
    private Long SuccessImageCount;

    /**
    * <p>Image count of scan failure</p>
    */
    @SerializedName("FailureImageCount")
    @Expose
    private Long FailureImageCount;

    /**
    * <p>Number of images ignored by the task</p>
    */
    @SerializedName("IgnoredImageCount")
    @Expose
    private Long IgnoredImageCount;

    /**
    * <p>Task cancelled image count</p>
    */
    @SerializedName("CancelledImageCount")
    @Expose
    private Long CancelledImageCount;

    /**
    * <p>Scan start time</p><p>Parameter format: hh:mm</p>
    */
    @SerializedName("ScanStartTime")
    @Expose
    private String ScanStartTime;

    /**
    * <p>Scan stop time</p><p>Parameter format: hh:mm</p>
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * <p>Timeout period, in seconds</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Task cancellation reason</p>
    */
    @SerializedName("CancelReason")
    @Expose
    private String CancelReason;

    /**
    * <p>Task name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Scan task scheduling configuration</p>
    */
    @SerializedName("Schedule")
    @Expose
    private ImageScanScheduleConfig Schedule;

    /**
    * <p>Scan task target</p>
    */
    @SerializedName("Target")
    @Expose
    private ImageScanAssetTarget Target;

    /**
    * <p>Scan task filtering configuration</p>
    */
    @SerializedName("Filter")
    @Expose
    private ImageScanRegistryFilter Filter;

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
     * Get <p>Scheduled scan task id.</p> 
     * @return TimedScanConfigId <p>Scheduled scan task id.</p>
     */
    public Long getTimedScanConfigId() {
        return this.TimedScanConfigId;
    }

    /**
     * Set <p>Scheduled scan task id.</p>
     * @param TimedScanConfigId <p>Scheduled scan task id.</p>
     */
    public void setTimedScanConfigId(Long TimedScanConfigId) {
        this.TimedScanConfigId = TimedScanConfigId;
    }

    /**
     * Get <p>Automatic matching mode</p><p>Enumeration values:</p><ul><li>BY_CLUSTER: Select by cluster</li><li>LATEST_VERSION: Scan the latest version image only</li><li>LOCAL_IMAGE: Local image</li></ul> 
     * @return AutoMatchMode <p>Automatic matching mode</p><p>Enumeration values:</p><ul><li>BY_CLUSTER: Select by cluster</li><li>LATEST_VERSION: Scan the latest version image only</li><li>LOCAL_IMAGE: Local image</li></ul>
     */
    public String [] getAutoMatchMode() {
        return this.AutoMatchMode;
    }

    /**
     * Set <p>Automatic matching mode</p><p>Enumeration values:</p><ul><li>BY_CLUSTER: Select by cluster</li><li>LATEST_VERSION: Scan the latest version image only</li><li>LOCAL_IMAGE: Local image</li></ul>
     * @param AutoMatchMode <p>Automatic matching mode</p><p>Enumeration values:</p><ul><li>BY_CLUSTER: Select by cluster</li><li>LATEST_VERSION: Scan the latest version image only</li><li>LOCAL_IMAGE: Local image</li></ul>
     */
    public void setAutoMatchMode(String [] AutoMatchMode) {
        this.AutoMatchMode = AutoMatchMode;
    }

    /**
     * Get <p>Scan asset mode</p><p>Enumeration values:</p><ul><li>ALL: All</li><li>MANUAL: Manual selection</li><li>AUTO_MATCH: Automatic matching</li></ul> 
     * @return ScopeMode <p>Scan asset mode</p><p>Enumeration values:</p><ul><li>ALL: All</li><li>MANUAL: Manual selection</li><li>AUTO_MATCH: Automatic matching</li></ul>
     */
    public String getScopeMode() {
        return this.ScopeMode;
    }

    /**
     * Set <p>Scan asset mode</p><p>Enumeration values:</p><ul><li>ALL: All</li><li>MANUAL: Manual selection</li><li>AUTO_MATCH: Automatic matching</li></ul>
     * @param ScopeMode <p>Scan asset mode</p><p>Enumeration values:</p><ul><li>ALL: All</li><li>MANUAL: Manual selection</li><li>AUTO_MATCH: Automatic matching</li></ul>
     */
    public void setScopeMode(String ScopeMode) {
        this.ScopeMode = ScopeMode;
    }

    /**
     * Get <p>Task trigger type</p><p>Enumeration values:</p><ul><li>TIMED: scheduled task</li><li>MANUAL: manual triggering</li></ul> 
     * @return TriggerType <p>Task trigger type</p><p>Enumeration values:</p><ul><li>TIMED: scheduled task</li><li>MANUAL: manual triggering</li></ul>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Task trigger type</p><p>Enumeration values:</p><ul><li>TIMED: scheduled task</li><li>MANUAL: manual triggering</li></ul>
     * @param TriggerType <p>Task trigger type</p><p>Enumeration values:</p><ul><li>TIMED: scheduled task</li><li>MANUAL: manual triggering</li></ul>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul> 
     * @return ScanType <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
     * @param ScanType <p>Scan category</p><p>Enumeration values:</p><ul><li>CVE: vulnerability</li><li>RISK: risk</li><li>VIRUS: Trojan</li></ul>
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>Image id scanned</p> 
     * @return ImageIds <p>Image id scanned</p>
     */
    public Long [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>Image id scanned</p>
     * @param ImageIds <p>Image id scanned</p>
     */
    public void setImageIds(Long [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>Task status</p><p>Enumeration values:</p><ul><li>RUNNING: Executing</li><li>SUCCESS: Task successful</li><li>TIMEOUT: Task timeout</li><li>FAILED: Task failure</li><li>CANCELLED: Canceled</li></ul> 
     * @return Status <p>Task status</p><p>Enumeration values:</p><ul><li>RUNNING: Executing</li><li>SUCCESS: Task successful</li><li>TIMEOUT: Task timeout</li><li>FAILED: Task failure</li><li>CANCELLED: Canceled</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status</p><p>Enumeration values:</p><ul><li>RUNNING: Executing</li><li>SUCCESS: Task successful</li><li>TIMEOUT: Task timeout</li><li>FAILED: Task failure</li><li>CANCELLED: Canceled</li></ul>
     * @param Status <p>Task status</p><p>Enumeration values:</p><ul><li>RUNNING: Executing</li><li>SUCCESS: Task successful</li><li>TIMEOUT: Task timeout</li><li>FAILED: Task failure</li><li>CANCELLED: Canceled</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Scheduled task associated account name</p> 
     * @return OwnerAccountName <p>Scheduled task associated account name</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Scheduled task associated account name</p>
     * @param OwnerAccountName <p>Scheduled task associated account name</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>appid of the account associated with the scheduled task</p> 
     * @return OwnerAppId <p>appid of the account associated with the scheduled task</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the scheduled task</p>
     * @param OwnerAppId <p>appid of the account associated with the scheduled task</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>uin of the associated account for the scheduled task</p> 
     * @return OwnerUin <p>uin of the associated account for the scheduled task</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin of the associated account for the scheduled task</p>
     * @param OwnerUin <p>uin of the associated account for the scheduled task</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Scan image count</p> 
     * @return ScanImageCount <p>Scan image count</p>
     */
    public Long getScanImageCount() {
        return this.ScanImageCount;
    }

    /**
     * Set <p>Scan image count</p>
     * @param ScanImageCount <p>Scan image count</p>
     */
    public void setScanImageCount(Long ScanImageCount) {
        this.ScanImageCount = ScanImageCount;
    }

    /**
     * Get <p>Image count scanned successfully</p> 
     * @return SuccessImageCount <p>Image count scanned successfully</p>
     */
    public Long getSuccessImageCount() {
        return this.SuccessImageCount;
    }

    /**
     * Set <p>Image count scanned successfully</p>
     * @param SuccessImageCount <p>Image count scanned successfully</p>
     */
    public void setSuccessImageCount(Long SuccessImageCount) {
        this.SuccessImageCount = SuccessImageCount;
    }

    /**
     * Get <p>Image count of scan failure</p> 
     * @return FailureImageCount <p>Image count of scan failure</p>
     */
    public Long getFailureImageCount() {
        return this.FailureImageCount;
    }

    /**
     * Set <p>Image count of scan failure</p>
     * @param FailureImageCount <p>Image count of scan failure</p>
     */
    public void setFailureImageCount(Long FailureImageCount) {
        this.FailureImageCount = FailureImageCount;
    }

    /**
     * Get <p>Number of images ignored by the task</p> 
     * @return IgnoredImageCount <p>Number of images ignored by the task</p>
     */
    public Long getIgnoredImageCount() {
        return this.IgnoredImageCount;
    }

    /**
     * Set <p>Number of images ignored by the task</p>
     * @param IgnoredImageCount <p>Number of images ignored by the task</p>
     */
    public void setIgnoredImageCount(Long IgnoredImageCount) {
        this.IgnoredImageCount = IgnoredImageCount;
    }

    /**
     * Get <p>Task cancelled image count</p> 
     * @return CancelledImageCount <p>Task cancelled image count</p>
     */
    public Long getCancelledImageCount() {
        return this.CancelledImageCount;
    }

    /**
     * Set <p>Task cancelled image count</p>
     * @param CancelledImageCount <p>Task cancelled image count</p>
     */
    public void setCancelledImageCount(Long CancelledImageCount) {
        this.CancelledImageCount = CancelledImageCount;
    }

    /**
     * Get <p>Scan start time</p><p>Parameter format: hh:mm</p> 
     * @return ScanStartTime <p>Scan start time</p><p>Parameter format: hh:mm</p>
     */
    public String getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set <p>Scan start time</p><p>Parameter format: hh:mm</p>
     * @param ScanStartTime <p>Scan start time</p><p>Parameter format: hh:mm</p>
     */
    public void setScanStartTime(String ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get <p>Scan stop time</p><p>Parameter format: hh:mm</p> 
     * @return ScanEndTime <p>Scan stop time</p><p>Parameter format: hh:mm</p>
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set <p>Scan stop time</p><p>Parameter format: hh:mm</p>
     * @param ScanEndTime <p>Scan stop time</p><p>Parameter format: hh:mm</p>
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get <p>Timeout period, in seconds</p> 
     * @return Timeout <p>Timeout period, in seconds</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Timeout period, in seconds</p>
     * @param Timeout <p>Timeout period, in seconds</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Task cancellation reason</p> 
     * @return CancelReason <p>Task cancellation reason</p>
     */
    public String getCancelReason() {
        return this.CancelReason;
    }

    /**
     * Set <p>Task cancellation reason</p>
     * @param CancelReason <p>Task cancellation reason</p>
     */
    public void setCancelReason(String CancelReason) {
        this.CancelReason = CancelReason;
    }

    /**
     * Get <p>Task name</p> 
     * @return Name <p>Task name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task name</p>
     * @param Name <p>Task name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Scan task scheduling configuration</p> 
     * @return Schedule <p>Scan task scheduling configuration</p>
     */
    public ImageScanScheduleConfig getSchedule() {
        return this.Schedule;
    }

    /**
     * Set <p>Scan task scheduling configuration</p>
     * @param Schedule <p>Scan task scheduling configuration</p>
     */
    public void setSchedule(ImageScanScheduleConfig Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get <p>Scan task target</p> 
     * @return Target <p>Scan task target</p>
     */
    public ImageScanAssetTarget getTarget() {
        return this.Target;
    }

    /**
     * Set <p>Scan task target</p>
     * @param Target <p>Scan task target</p>
     */
    public void setTarget(ImageScanAssetTarget Target) {
        this.Target = Target;
    }

    /**
     * Get <p>Scan task filtering configuration</p> 
     * @return Filter <p>Scan task filtering configuration</p>
     */
    public ImageScanRegistryFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Scan task filtering configuration</p>
     * @param Filter <p>Scan task filtering configuration</p>
     */
    public void setFilter(ImageScanRegistryFilter Filter) {
        this.Filter = Filter;
    }

    public ImageRegistryScanTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryScanTaskInfo(ImageRegistryScanTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TimedScanConfigId != null) {
            this.TimedScanConfigId = new Long(source.TimedScanConfigId);
        }
        if (source.AutoMatchMode != null) {
            this.AutoMatchMode = new String[source.AutoMatchMode.length];
            for (int i = 0; i < source.AutoMatchMode.length; i++) {
                this.AutoMatchMode[i] = new String(source.AutoMatchMode[i]);
            }
        }
        if (source.ScopeMode != null) {
            this.ScopeMode = new String(source.ScopeMode);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.ImageIds != null) {
            this.ImageIds = new Long[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new Long(source.ImageIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ScanImageCount != null) {
            this.ScanImageCount = new Long(source.ScanImageCount);
        }
        if (source.SuccessImageCount != null) {
            this.SuccessImageCount = new Long(source.SuccessImageCount);
        }
        if (source.FailureImageCount != null) {
            this.FailureImageCount = new Long(source.FailureImageCount);
        }
        if (source.IgnoredImageCount != null) {
            this.IgnoredImageCount = new Long(source.IgnoredImageCount);
        }
        if (source.CancelledImageCount != null) {
            this.CancelledImageCount = new Long(source.CancelledImageCount);
        }
        if (source.ScanStartTime != null) {
            this.ScanStartTime = new String(source.ScanStartTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CancelReason != null) {
            this.CancelReason = new String(source.CancelReason);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Schedule != null) {
            this.Schedule = new ImageScanScheduleConfig(source.Schedule);
        }
        if (source.Target != null) {
            this.Target = new ImageScanAssetTarget(source.Target);
        }
        if (source.Filter != null) {
            this.Filter = new ImageScanRegistryFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TimedScanConfigId", this.TimedScanConfigId);
        this.setParamArraySimple(map, prefix + "AutoMatchMode.", this.AutoMatchMode);
        this.setParamSimple(map, prefix + "ScopeMode", this.ScopeMode);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ScanImageCount", this.ScanImageCount);
        this.setParamSimple(map, prefix + "SuccessImageCount", this.SuccessImageCount);
        this.setParamSimple(map, prefix + "FailureImageCount", this.FailureImageCount);
        this.setParamSimple(map, prefix + "IgnoredImageCount", this.IgnoredImageCount);
        this.setParamSimple(map, prefix + "CancelledImageCount", this.CancelledImageCount);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "CancelReason", this.CancelReason);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

