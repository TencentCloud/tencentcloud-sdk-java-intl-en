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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossSummaryDetailRes extends AbstractModel {

    /**
    * Instance Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cross-Region Backup Status: enable - Enabled, disable - Disabled
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * Cross-Region Backup Target Region
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * Latest Backup Start Time
    */
    @SerializedName("LastBackupStartTime")
    @Expose
    private String LastBackupStartTime;

    /**
    * Cross-Region Backup Retention Days
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * Cross-Region Data Backup Total Space
    */
    @SerializedName("DataBackupSpace")
    @Expose
    private Long DataBackupSpace;

    /**
    * Cross-Region Data Backup Total File Count
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * Cross-Region Log Backup Total Space
    */
    @SerializedName("LogBackupSpace")
    @Expose
    private Long LogBackupSpace;

    /**
    * Cross-Region Log Backup Total File Count
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * Cross-Region Backup Total Space
    */
    @SerializedName("ActualUsedSpace")
    @Expose
    private Long ActualUsedSpace;

    /**
    * Cross-Region Backup Total Count
    */
    @SerializedName("ActualUsedCount")
    @Expose
    private Long ActualUsedCount;

    /**
     * Get Instance Status 
     * @return Status Instance Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance Status
     * @param Status Instance Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance Region 
     * @return Region Instance Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance Region
     * @param Region Instance Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance Name 
     * @return Name Instance Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance Name
     * @param Name Instance Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cross-Region Backup Status: enable - Enabled, disable - Disabled 
     * @return CrossBackupEnabled Cross-Region Backup Status: enable - Enabled, disable - Disabled
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set Cross-Region Backup Status: enable - Enabled, disable - Disabled
     * @param CrossBackupEnabled Cross-Region Backup Status: enable - Enabled, disable - Disabled
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get Cross-Region Backup Target Region 
     * @return CrossRegions Cross-Region Backup Target Region
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set Cross-Region Backup Target Region
     * @param CrossRegions Cross-Region Backup Target Region
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get Latest Backup Start Time 
     * @return LastBackupStartTime Latest Backup Start Time
     */
    public String getLastBackupStartTime() {
        return this.LastBackupStartTime;
    }

    /**
     * Set Latest Backup Start Time
     * @param LastBackupStartTime Latest Backup Start Time
     */
    public void setLastBackupStartTime(String LastBackupStartTime) {
        this.LastBackupStartTime = LastBackupStartTime;
    }

    /**
     * Get Cross-Region Backup Retention Days 
     * @return CrossBackupSaveDays Cross-Region Backup Retention Days
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set Cross-Region Backup Retention Days
     * @param CrossBackupSaveDays Cross-Region Backup Retention Days
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get Cross-Region Data Backup Total Space 
     * @return DataBackupSpace Cross-Region Data Backup Total Space
     */
    public Long getDataBackupSpace() {
        return this.DataBackupSpace;
    }

    /**
     * Set Cross-Region Data Backup Total Space
     * @param DataBackupSpace Cross-Region Data Backup Total Space
     */
    public void setDataBackupSpace(Long DataBackupSpace) {
        this.DataBackupSpace = DataBackupSpace;
    }

    /**
     * Get Cross-Region Data Backup Total File Count 
     * @return DataBackupCount Cross-Region Data Backup Total File Count
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set Cross-Region Data Backup Total File Count
     * @param DataBackupCount Cross-Region Data Backup Total File Count
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get Cross-Region Log Backup Total Space 
     * @return LogBackupSpace Cross-Region Log Backup Total Space
     */
    public Long getLogBackupSpace() {
        return this.LogBackupSpace;
    }

    /**
     * Set Cross-Region Log Backup Total Space
     * @param LogBackupSpace Cross-Region Log Backup Total Space
     */
    public void setLogBackupSpace(Long LogBackupSpace) {
        this.LogBackupSpace = LogBackupSpace;
    }

    /**
     * Get Cross-Region Log Backup Total File Count 
     * @return LogBackupCount Cross-Region Log Backup Total File Count
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set Cross-Region Log Backup Total File Count
     * @param LogBackupCount Cross-Region Log Backup Total File Count
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get Cross-Region Backup Total Space 
     * @return ActualUsedSpace Cross-Region Backup Total Space
     */
    public Long getActualUsedSpace() {
        return this.ActualUsedSpace;
    }

    /**
     * Set Cross-Region Backup Total Space
     * @param ActualUsedSpace Cross-Region Backup Total Space
     */
    public void setActualUsedSpace(Long ActualUsedSpace) {
        this.ActualUsedSpace = ActualUsedSpace;
    }

    /**
     * Get Cross-Region Backup Total Count 
     * @return ActualUsedCount Cross-Region Backup Total Count
     */
    public Long getActualUsedCount() {
        return this.ActualUsedCount;
    }

    /**
     * Set Cross-Region Backup Total Count
     * @param ActualUsedCount Cross-Region Backup Total Count
     */
    public void setActualUsedCount(Long ActualUsedCount) {
        this.ActualUsedCount = ActualUsedCount;
    }

    public CrossSummaryDetailRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossSummaryDetailRes(CrossSummaryDetailRes source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CrossBackupEnabled != null) {
            this.CrossBackupEnabled = new String(source.CrossBackupEnabled);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.LastBackupStartTime != null) {
            this.LastBackupStartTime = new String(source.LastBackupStartTime);
        }
        if (source.CrossBackupSaveDays != null) {
            this.CrossBackupSaveDays = new Long(source.CrossBackupSaveDays);
        }
        if (source.DataBackupSpace != null) {
            this.DataBackupSpace = new Long(source.DataBackupSpace);
        }
        if (source.DataBackupCount != null) {
            this.DataBackupCount = new Long(source.DataBackupCount);
        }
        if (source.LogBackupSpace != null) {
            this.LogBackupSpace = new Long(source.LogBackupSpace);
        }
        if (source.LogBackupCount != null) {
            this.LogBackupCount = new Long(source.LogBackupCount);
        }
        if (source.ActualUsedSpace != null) {
            this.ActualUsedSpace = new Long(source.ActualUsedSpace);
        }
        if (source.ActualUsedCount != null) {
            this.ActualUsedCount = new Long(source.ActualUsedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CrossBackupEnabled", this.CrossBackupEnabled);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "LastBackupStartTime", this.LastBackupStartTime);
        this.setParamSimple(map, prefix + "CrossBackupSaveDays", this.CrossBackupSaveDays);
        this.setParamSimple(map, prefix + "DataBackupSpace", this.DataBackupSpace);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSpace", this.LogBackupSpace);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "ActualUsedSpace", this.ActualUsedSpace);
        this.setParamSimple(map, prefix + "ActualUsedCount", this.ActualUsedCount);

    }
}

