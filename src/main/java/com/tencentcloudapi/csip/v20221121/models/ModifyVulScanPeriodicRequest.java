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

public class ModifyVulScanPeriodicRequest extends AbstractModel {

    /**
    * <p>Period scanning switch (0-off, 1-on)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Vulnerability type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
    */
    @SerializedName("VulCategory")
    @Expose
    private String [] VulCategory;

    /**
    * <p>Vulnerability level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String [] Level;

    /**
    * <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison+POC detection)</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>Start time (09:00:00)</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time (18:00:00)</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Asset scope (0-All assets, 1-Custom assets, 2-Remove asset, 3-Automatic asset match)</p>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>Period scanning type</p><p>Enumeration value:</p><ul><li>1: Daily</li><li>2: Weekly</li><li>3: Per month</li></ul>
    */
    @SerializedName("CycleType")
    @Expose
    private Long CycleType;

    /**
    * <p>Scan timeout duration</p><p>Measurement unit: second</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Cycle value</p><p>Value ranges from 1 to 31</p><p>Measurement unit: day of the week or per month</p>
    */
    @SerializedName("CycleValue")
    @Expose
    private Long [] CycleValue;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Asset list (instance_id list)</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
    * <p>Whether to run the synchronize configuration 0-not allowed, 1-allowed</p>
    */
    @SerializedName("AllowSync")
    @Expose
    private Long AllowSync;

    /**
    * <p>Whether the admin account has enabled the auto sync configuration switch 0-Off, 1-On</p>
    */
    @SerializedName("EnableSync")
    @Expose
    private Long EnableSync;

    /**
    * <p>Configuration sync to which account appid</p>
    */
    @SerializedName("SyncTo")
    @Expose
    private Long [] SyncTo;

    /**
    * <p>Tag ID</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
     * Get <p>Period scanning switch (0-off, 1-on)</p> 
     * @return Status <p>Period scanning switch (0-off, 1-on)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Period scanning switch (0-off, 1-on)</p>
     * @param Status <p>Period scanning switch (0-off, 1-on)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get <p>Vulnerability level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul> 
     * @return Level <p>Vulnerability level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     */
    public String [] getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Vulnerability level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     * @param Level <p>Vulnerability level</p><p>Enumeration value:</p><ul><li>LOW: Low risk</li><li>MEDIUM: Medium risk</li><li>HIGH: High risk</li><li>CRITICAL: Critical</li></ul>
     */
    public void setLevel(String [] Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison+POC detection)</p> 
     * @return Method <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison+POC detection)</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison+POC detection)</p>
     * @param Method <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison+POC detection)</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>Start time (09:00:00)</p> 
     * @return StartTime <p>Start time (09:00:00)</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time (09:00:00)</p>
     * @param StartTime <p>Start time (09:00:00)</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time (18:00:00)</p> 
     * @return EndTime <p>End time (18:00:00)</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time (18:00:00)</p>
     * @param EndTime <p>End time (18:00:00)</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Asset scope (0-All assets, 1-Custom assets, 2-Remove asset, 3-Automatic asset match)</p> 
     * @return AssetRange <p>Asset scope (0-All assets, 1-Custom assets, 2-Remove asset, 3-Automatic asset match)</p>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>Asset scope (0-All assets, 1-Custom assets, 2-Remove asset, 3-Automatic asset match)</p>
     * @param AssetRange <p>Asset scope (0-All assets, 1-Custom assets, 2-Remove asset, 3-Automatic asset match)</p>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>Period scanning type</p><p>Enumeration value:</p><ul><li>1: Daily</li><li>2: Weekly</li><li>3: Per month</li></ul> 
     * @return CycleType <p>Period scanning type</p><p>Enumeration value:</p><ul><li>1: Daily</li><li>2: Weekly</li><li>3: Per month</li></ul>
     */
    public Long getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>Period scanning type</p><p>Enumeration value:</p><ul><li>1: Daily</li><li>2: Weekly</li><li>3: Per month</li></ul>
     * @param CycleType <p>Period scanning type</p><p>Enumeration value:</p><ul><li>1: Daily</li><li>2: Weekly</li><li>3: Per month</li></ul>
     */
    public void setCycleType(Long CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>Scan timeout duration</p><p>Measurement unit: second</p> 
     * @return Timeout <p>Scan timeout duration</p><p>Measurement unit: second</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Scan timeout duration</p><p>Measurement unit: second</p>
     * @param Timeout <p>Scan timeout duration</p><p>Measurement unit: second</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Cycle value</p><p>Value ranges from 1 to 31</p><p>Measurement unit: day of the week or per month</p> 
     * @return CycleValue <p>Cycle value</p><p>Value ranges from 1 to 31</p><p>Measurement unit: day of the week or per month</p>
     */
    public Long [] getCycleValue() {
        return this.CycleValue;
    }

    /**
     * Set <p>Cycle value</p><p>Value ranges from 1 to 31</p><p>Measurement unit: day of the week or per month</p>
     * @param CycleValue <p>Cycle value</p><p>Value ranges from 1 to 31</p><p>Measurement unit: day of the week or per month</p>
     */
    public void setCycleValue(Long [] CycleValue) {
        this.CycleValue = CycleValue;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Asset list (instance_id list)</p> 
     * @return AssetList <p>Asset list (instance_id list)</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>Asset list (instance_id list)</p>
     * @param AssetList <p>Asset list (instance_id list)</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get <p>Whether to run the synchronize configuration 0-not allowed, 1-allowed</p> 
     * @return AllowSync <p>Whether to run the synchronize configuration 0-not allowed, 1-allowed</p>
     */
    public Long getAllowSync() {
        return this.AllowSync;
    }

    /**
     * Set <p>Whether to run the synchronize configuration 0-not allowed, 1-allowed</p>
     * @param AllowSync <p>Whether to run the synchronize configuration 0-not allowed, 1-allowed</p>
     */
    public void setAllowSync(Long AllowSync) {
        this.AllowSync = AllowSync;
    }

    /**
     * Get <p>Whether the admin account has enabled the auto sync configuration switch 0-Off, 1-On</p> 
     * @return EnableSync <p>Whether the admin account has enabled the auto sync configuration switch 0-Off, 1-On</p>
     */
    public Long getEnableSync() {
        return this.EnableSync;
    }

    /**
     * Set <p>Whether the admin account has enabled the auto sync configuration switch 0-Off, 1-On</p>
     * @param EnableSync <p>Whether the admin account has enabled the auto sync configuration switch 0-Off, 1-On</p>
     */
    public void setEnableSync(Long EnableSync) {
        this.EnableSync = EnableSync;
    }

    /**
     * Get <p>Configuration sync to which account appid</p> 
     * @return SyncTo <p>Configuration sync to which account appid</p>
     */
    public Long [] getSyncTo() {
        return this.SyncTo;
    }

    /**
     * Set <p>Configuration sync to which account appid</p>
     * @param SyncTo <p>Configuration sync to which account appid</p>
     */
    public void setSyncTo(Long [] SyncTo) {
        this.SyncTo = SyncTo;
    }

    /**
     * Get <p>Tag ID</p> 
     * @return TagIds <p>Tag ID</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>Tag ID</p>
     * @param TagIds <p>Tag ID</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    public ModifyVulScanPeriodicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulScanPeriodicRequest(ModifyVulScanPeriodicRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String[source.VulCategory.length];
            for (int i = 0; i < source.VulCategory.length; i++) {
                this.VulCategory[i] = new String(source.VulCategory[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new String(source.Level[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.CycleType != null) {
            this.CycleType = new Long(source.CycleType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CycleValue != null) {
            this.CycleValue = new Long[source.CycleValue.length];
            for (int i = 0; i < source.CycleValue.length; i++) {
                this.CycleValue[i] = new Long(source.CycleValue[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
        if (source.AllowSync != null) {
            this.AllowSync = new Long(source.AllowSync);
        }
        if (source.EnableSync != null) {
            this.EnableSync = new Long(source.EnableSync);
        }
        if (source.SyncTo != null) {
            this.SyncTo = new Long[source.SyncTo.length];
            for (int i = 0; i < source.SyncTo.length; i++) {
                this.SyncTo[i] = new Long(source.SyncTo[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "VulCategory.", this.VulCategory);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArraySimple(map, prefix + "CycleValue.", this.CycleValue);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);
        this.setParamSimple(map, prefix + "AllowSync", this.AllowSync);
        this.setParamSimple(map, prefix + "EnableSync", this.EnableSync);
        this.setParamArraySimple(map, prefix + "SyncTo.", this.SyncTo);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);

    }
}

