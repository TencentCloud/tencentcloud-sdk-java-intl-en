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

public class SummaryDetailRes extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    @SerializedName("ActualUsedSpace")
    @Expose
    private Long ActualUsedSpace;

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
    @SerializedName("AutoBackupSpace")
    @Expose
    private Long AutoBackupSpace;

    /**
    * 
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * 
    */
    @SerializedName("ManualBackupSpace")
    @Expose
    private Long ManualBackupSpace;

    /**
    * 
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * 
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get  
     * @return RegionId 
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 
     * @param RegionId 
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

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
     * @return AutoBackupSpace 
     */
    public Long getAutoBackupSpace() {
        return this.AutoBackupSpace;
    }

    /**
     * Set 
     * @param AutoBackupSpace 
     */
    public void setAutoBackupSpace(Long AutoBackupSpace) {
        this.AutoBackupSpace = AutoBackupSpace;
    }

    /**
     * Get  
     * @return AutoBackupCount 
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set 
     * @param AutoBackupCount 
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get  
     * @return ManualBackupSpace 
     */
    public Long getManualBackupSpace() {
        return this.ManualBackupSpace;
    }

    /**
     * Set 
     * @param ManualBackupSpace 
     */
    public void setManualBackupSpace(Long ManualBackupSpace) {
        this.ManualBackupSpace = ManualBackupSpace;
    }

    /**
     * Get  
     * @return ManualBackupCount 
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set 
     * @param ManualBackupCount 
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
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

    public SummaryDetailRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SummaryDetailRes(SummaryDetailRes source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ActualUsedSpace != null) {
            this.ActualUsedSpace = new Long(source.ActualUsedSpace);
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
        if (source.AutoBackupSpace != null) {
            this.AutoBackupSpace = new Long(source.AutoBackupSpace);
        }
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.ManualBackupSpace != null) {
            this.ManualBackupSpace = new Long(source.ManualBackupSpace);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ActualUsedSpace", this.ActualUsedSpace);
        this.setParamSimple(map, prefix + "DataBackupSpace", this.DataBackupSpace);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSpace", this.LogBackupSpace);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupSpace", this.AutoBackupSpace);
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupSpace", this.ManualBackupSpace);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

