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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulScanImageInfo extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image size
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * Task status. Valid values: `SCANNING` (scanning); `FAILED` (failed); `FINISHED` (completed); `CANCELED` (canceled).
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * Scan duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanDuration")
    @Expose
    private Float ScanDuration;

    /**
    * Number of high-risk vulnerabilities
    */
    @SerializedName("HighLevelVulCount")
    @Expose
    private Long HighLevelVulCount;

    /**
    * Number of medium-risk vulnerabilities
    */
    @SerializedName("MediumLevelVulCount")
    @Expose
    private Long MediumLevelVulCount;

    /**
    * Number of low-risk vulnerabilities
    */
    @SerializedName("LowLevelVulCount")
    @Expose
    private Long LowLevelVulCount;

    /**
    * Number of critical vulnerabilities
    */
    @SerializedName("CriticalLevelVulCount")
    @Expose
    private Long CriticalLevelVulCount;

    /**
    * ID of the task to scan local images for vulnerabilities
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
    * Start time of the vulnerability scan
    */
    @SerializedName("ScanStartTime")
    @Expose
    private String ScanStartTime;

    /**
    * End time of the vulnerability scan
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * Cause of the failure. Valid values: `TIMEOUT` (timeout); `TOO_MANY` (too many tasks); `OFFLINE` (offline).
    */
    @SerializedName("ErrorStatus")
    @Expose
    private String ErrorStatus;

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image size 
     * @return Size Image size
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set Image size
     * @param Size Image size
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get Task status. Valid values: `SCANNING` (scanning); `FAILED` (failed); `FINISHED` (completed); `CANCELED` (canceled). 
     * @return ScanStatus Task status. Valid values: `SCANNING` (scanning); `FAILED` (failed); `FINISHED` (completed); `CANCELED` (canceled).
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Task status. Valid values: `SCANNING` (scanning); `FAILED` (failed); `FINISHED` (completed); `CANCELED` (canceled).
     * @param ScanStatus Task status. Valid values: `SCANNING` (scanning); `FAILED` (failed); `FINISHED` (completed); `CANCELED` (canceled).
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Scan duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanDuration Scan duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getScanDuration() {
        return this.ScanDuration;
    }

    /**
     * Set Scan duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanDuration Scan duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanDuration(Float ScanDuration) {
        this.ScanDuration = ScanDuration;
    }

    /**
     * Get Number of high-risk vulnerabilities 
     * @return HighLevelVulCount Number of high-risk vulnerabilities
     */
    public Long getHighLevelVulCount() {
        return this.HighLevelVulCount;
    }

    /**
     * Set Number of high-risk vulnerabilities
     * @param HighLevelVulCount Number of high-risk vulnerabilities
     */
    public void setHighLevelVulCount(Long HighLevelVulCount) {
        this.HighLevelVulCount = HighLevelVulCount;
    }

    /**
     * Get Number of medium-risk vulnerabilities 
     * @return MediumLevelVulCount Number of medium-risk vulnerabilities
     */
    public Long getMediumLevelVulCount() {
        return this.MediumLevelVulCount;
    }

    /**
     * Set Number of medium-risk vulnerabilities
     * @param MediumLevelVulCount Number of medium-risk vulnerabilities
     */
    public void setMediumLevelVulCount(Long MediumLevelVulCount) {
        this.MediumLevelVulCount = MediumLevelVulCount;
    }

    /**
     * Get Number of low-risk vulnerabilities 
     * @return LowLevelVulCount Number of low-risk vulnerabilities
     */
    public Long getLowLevelVulCount() {
        return this.LowLevelVulCount;
    }

    /**
     * Set Number of low-risk vulnerabilities
     * @param LowLevelVulCount Number of low-risk vulnerabilities
     */
    public void setLowLevelVulCount(Long LowLevelVulCount) {
        this.LowLevelVulCount = LowLevelVulCount;
    }

    /**
     * Get Number of critical vulnerabilities 
     * @return CriticalLevelVulCount Number of critical vulnerabilities
     */
    public Long getCriticalLevelVulCount() {
        return this.CriticalLevelVulCount;
    }

    /**
     * Set Number of critical vulnerabilities
     * @param CriticalLevelVulCount Number of critical vulnerabilities
     */
    public void setCriticalLevelVulCount(Long CriticalLevelVulCount) {
        this.CriticalLevelVulCount = CriticalLevelVulCount;
    }

    /**
     * Get ID of the task to scan local images for vulnerabilities 
     * @return TaskID ID of the task to scan local images for vulnerabilities
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set ID of the task to scan local images for vulnerabilities
     * @param TaskID ID of the task to scan local images for vulnerabilities
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get Start time of the vulnerability scan 
     * @return ScanStartTime Start time of the vulnerability scan
     */
    public String getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set Start time of the vulnerability scan
     * @param ScanStartTime Start time of the vulnerability scan
     */
    public void setScanStartTime(String ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get End time of the vulnerability scan 
     * @return ScanEndTime End time of the vulnerability scan
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set End time of the vulnerability scan
     * @param ScanEndTime End time of the vulnerability scan
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get Cause of the failure. Valid values: `TIMEOUT` (timeout); `TOO_MANY` (too many tasks); `OFFLINE` (offline). 
     * @return ErrorStatus Cause of the failure. Valid values: `TIMEOUT` (timeout); `TOO_MANY` (too many tasks); `OFFLINE` (offline).
     */
    public String getErrorStatus() {
        return this.ErrorStatus;
    }

    /**
     * Set Cause of the failure. Valid values: `TIMEOUT` (timeout); `TOO_MANY` (too many tasks); `OFFLINE` (offline).
     * @param ErrorStatus Cause of the failure. Valid values: `TIMEOUT` (timeout); `TOO_MANY` (too many tasks); `OFFLINE` (offline).
     */
    public void setErrorStatus(String ErrorStatus) {
        this.ErrorStatus = ErrorStatus;
    }

    public VulScanImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulScanImageInfo(VulScanImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.ScanDuration != null) {
            this.ScanDuration = new Float(source.ScanDuration);
        }
        if (source.HighLevelVulCount != null) {
            this.HighLevelVulCount = new Long(source.HighLevelVulCount);
        }
        if (source.MediumLevelVulCount != null) {
            this.MediumLevelVulCount = new Long(source.MediumLevelVulCount);
        }
        if (source.LowLevelVulCount != null) {
            this.LowLevelVulCount = new Long(source.LowLevelVulCount);
        }
        if (source.CriticalLevelVulCount != null) {
            this.CriticalLevelVulCount = new Long(source.CriticalLevelVulCount);
        }
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
        if (source.ScanStartTime != null) {
            this.ScanStartTime = new String(source.ScanStartTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.ErrorStatus != null) {
            this.ErrorStatus = new String(source.ErrorStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "ScanDuration", this.ScanDuration);
        this.setParamSimple(map, prefix + "HighLevelVulCount", this.HighLevelVulCount);
        this.setParamSimple(map, prefix + "MediumLevelVulCount", this.MediumLevelVulCount);
        this.setParamSimple(map, prefix + "LowLevelVulCount", this.LowLevelVulCount);
        this.setParamSimple(map, prefix + "CriticalLevelVulCount", this.CriticalLevelVulCount);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "ErrorStatus", this.ErrorStatus);

    }
}

