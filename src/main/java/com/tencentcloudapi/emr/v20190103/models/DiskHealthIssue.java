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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskHealthIssue extends AbstractModel {

    /**
    * <p>Disk ID.</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>Mounted directory.</p>
    */
    @SerializedName("MountDir")
    @Expose
    private String MountDir;

    /**
    * <p>Device path.</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>Exception type.</p>
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * <p>Priority.</p>
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * <p>Status.</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>Probe source.</p>
    */
    @SerializedName("DetectSource")
    @Expose
    private String DetectSource;

    /**
    * <p>First probe time.</p>
    */
    @SerializedName("FirstDetectTime")
    @Expose
    private String FirstDetectTime;

    /**
    * <p>Latest probe time.</p>
    */
    @SerializedName("LastDetectTime")
    @Expose
    private String LastDetectTime;

    /**
    * <p>Probe information.</p>
    */
    @SerializedName("DetectDetail")
    @Expose
    private String DetectDetail;

    /**
     * Get <p>Disk ID.</p> 
     * @return DiskId <p>Disk ID.</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>Disk ID.</p>
     * @param DiskId <p>Disk ID.</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>Mounted directory.</p> 
     * @return MountDir <p>Mounted directory.</p>
     */
    public String getMountDir() {
        return this.MountDir;
    }

    /**
     * Set <p>Mounted directory.</p>
     * @param MountDir <p>Mounted directory.</p>
     */
    public void setMountDir(String MountDir) {
        this.MountDir = MountDir;
    }

    /**
     * Get <p>Device path.</p> 
     * @return DeviceName <p>Device path.</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>Device path.</p>
     * @param DeviceName <p>Device path.</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>Exception type.</p> 
     * @return CheckType <p>Exception type.</p>
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>Exception type.</p>
     * @param CheckType <p>Exception type.</p>
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>Priority.</p> 
     * @return Severity <p>Priority.</p>
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>Priority.</p>
     * @param Severity <p>Priority.</p>
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>Status.</p> 
     * @return State <p>Status.</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>Status.</p>
     * @param State <p>Status.</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>Probe source.</p> 
     * @return DetectSource <p>Probe source.</p>
     */
    public String getDetectSource() {
        return this.DetectSource;
    }

    /**
     * Set <p>Probe source.</p>
     * @param DetectSource <p>Probe source.</p>
     */
    public void setDetectSource(String DetectSource) {
        this.DetectSource = DetectSource;
    }

    /**
     * Get <p>First probe time.</p> 
     * @return FirstDetectTime <p>First probe time.</p>
     */
    public String getFirstDetectTime() {
        return this.FirstDetectTime;
    }

    /**
     * Set <p>First probe time.</p>
     * @param FirstDetectTime <p>First probe time.</p>
     */
    public void setFirstDetectTime(String FirstDetectTime) {
        this.FirstDetectTime = FirstDetectTime;
    }

    /**
     * Get <p>Latest probe time.</p> 
     * @return LastDetectTime <p>Latest probe time.</p>
     */
    public String getLastDetectTime() {
        return this.LastDetectTime;
    }

    /**
     * Set <p>Latest probe time.</p>
     * @param LastDetectTime <p>Latest probe time.</p>
     */
    public void setLastDetectTime(String LastDetectTime) {
        this.LastDetectTime = LastDetectTime;
    }

    /**
     * Get <p>Probe information.</p> 
     * @return DetectDetail <p>Probe information.</p>
     */
    public String getDetectDetail() {
        return this.DetectDetail;
    }

    /**
     * Set <p>Probe information.</p>
     * @param DetectDetail <p>Probe information.</p>
     */
    public void setDetectDetail(String DetectDetail) {
        this.DetectDetail = DetectDetail;
    }

    public DiskHealthIssue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskHealthIssue(DiskHealthIssue source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.MountDir != null) {
            this.MountDir = new String(source.MountDir);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.DetectSource != null) {
            this.DetectSource = new String(source.DetectSource);
        }
        if (source.FirstDetectTime != null) {
            this.FirstDetectTime = new String(source.FirstDetectTime);
        }
        if (source.LastDetectTime != null) {
            this.LastDetectTime = new String(source.LastDetectTime);
        }
        if (source.DetectDetail != null) {
            this.DetectDetail = new String(source.DetectDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "MountDir", this.MountDir);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DetectSource", this.DetectSource);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LastDetectTime", this.LastDetectTime);
        this.setParamSimple(map, prefix + "DetectDetail", this.DetectDetail);

    }
}

