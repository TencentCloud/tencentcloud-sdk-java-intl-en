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
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("CrossBackupEnabled")
    @Expose
    private String CrossBackupEnabled;

    /**
    * 
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * 
    */
    @SerializedName("LastBackupStartTime")
    @Expose
    private String LastBackupStartTime;

    /**
    * 
    */
    @SerializedName("CrossBackupSaveDays")
    @Expose
    private Long CrossBackupSaveDays;

    /**
    * 
    */
    @SerializedName("DataBackupSpace")
    @Expose
    private Long DataBackupSpace;

    /**
    * 
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * 
    */
    @SerializedName("LogBackupSpace")
    @Expose
    private Long LogBackupSpace;

    /**
    * 
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * 
    */
    @SerializedName("ActualUsedSpace")
    @Expose
    private Long ActualUsedSpace;

    /**
    * 
    */
    @SerializedName("ActualUsedCount")
    @Expose
    private Long ActualUsedCount;

    /**
     * Get  
     * @return Status 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return Region 
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 
     * @param Region 
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get  
     * @return InstanceId 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 
     * @param InstanceId 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return CrossBackupEnabled 
     */
    public String getCrossBackupEnabled() {
        return this.CrossBackupEnabled;
    }

    /**
     * Set 
     * @param CrossBackupEnabled 
     */
    public void setCrossBackupEnabled(String CrossBackupEnabled) {
        this.CrossBackupEnabled = CrossBackupEnabled;
    }

    /**
     * Get  
     * @return CrossRegions 
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set 
     * @param CrossRegions 
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get  
     * @return LastBackupStartTime 
     */
    public String getLastBackupStartTime() {
        return this.LastBackupStartTime;
    }

    /**
     * Set 
     * @param LastBackupStartTime 
     */
    public void setLastBackupStartTime(String LastBackupStartTime) {
        this.LastBackupStartTime = LastBackupStartTime;
    }

    /**
     * Get  
     * @return CrossBackupSaveDays 
     */
    public Long getCrossBackupSaveDays() {
        return this.CrossBackupSaveDays;
    }

    /**
     * Set 
     * @param CrossBackupSaveDays 
     */
    public void setCrossBackupSaveDays(Long CrossBackupSaveDays) {
        this.CrossBackupSaveDays = CrossBackupSaveDays;
    }

    /**
     * Get  
     * @return DataBackupSpace 
     */
    public Long getDataBackupSpace() {
        return this.DataBackupSpace;
    }

    /**
     * Set 
     * @param DataBackupSpace 
     */
    public void setDataBackupSpace(Long DataBackupSpace) {
        this.DataBackupSpace = DataBackupSpace;
    }

    /**
     * Get  
     * @return DataBackupCount 
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set 
     * @param DataBackupCount 
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get  
     * @return LogBackupSpace 
     */
    public Long getLogBackupSpace() {
        return this.LogBackupSpace;
    }

    /**
     * Set 
     * @param LogBackupSpace 
     */
    public void setLogBackupSpace(Long LogBackupSpace) {
        this.LogBackupSpace = LogBackupSpace;
    }

    /**
     * Get  
     * @return LogBackupCount 
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set 
     * @param LogBackupCount 
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get  
     * @return ActualUsedSpace 
     */
    public Long getActualUsedSpace() {
        return this.ActualUsedSpace;
    }

    /**
     * Set 
     * @param ActualUsedSpace 
     */
    public void setActualUsedSpace(Long ActualUsedSpace) {
        this.ActualUsedSpace = ActualUsedSpace;
    }

    /**
     * Get  
     * @return ActualUsedCount 
     */
    public Long getActualUsedCount() {
        return this.ActualUsedCount;
    }

    /**
     * Set 
     * @param ActualUsedCount 
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

