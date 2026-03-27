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
    * Region Identifier
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (performing instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * Backup Space
    */
    @SerializedName("ActualUsedSpace")
    @Expose
    private Long ActualUsedSpace;

    /**
    * Data Backup Space
    */
    @SerializedName("DataBackupSpace")
    @Expose
    private Long DataBackupSpace;

    /**
    * Data Backup Total File Count
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * Log Backup Space
    */
    @SerializedName("LogBackupSpace")
    @Expose
    private Long LogBackupSpace;

    /**
    * Log Backup Total File Count
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * Automatic Backup Space
    */
    @SerializedName("AutoBackupSpace")
    @Expose
    private Long AutoBackupSpace;

    /**
    * Automatic Backup Total File Count
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * Manual Backup Space
    */
    @SerializedName("ManualBackupSpace")
    @Expose
    private Long ManualBackupSpace;

    /**
    * Manual Backup Total File Count
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * Instance Region Code
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Region Identifier 
     * @return RegionId Region Identifier
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region Identifier
     * @param RegionId Region Identifier
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (performing instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating 
     * @return Status Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (performing instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (performing instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
     * @param Status Instance Status. Valid values:
1: Creating
2: Running
3: Restricted Running (primary/secondary switching)
4: Isolated
5: Recycling
6: Recycled
7: Task Executing (performing instance backup, rollback, etc.)
8: Offline
9: Instance Scaling
10: Instance Migrating
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Backup Space 
     * @return ActualUsedSpace Backup Space
     */
    public Long getActualUsedSpace() {
        return this.ActualUsedSpace;
    }

    /**
     * Set Backup Space
     * @param ActualUsedSpace Backup Space
     */
    public void setActualUsedSpace(Long ActualUsedSpace) {
        this.ActualUsedSpace = ActualUsedSpace;
    }

    /**
     * Get Data Backup Space 
     * @return DataBackupSpace Data Backup Space
     */
    public Long getDataBackupSpace() {
        return this.DataBackupSpace;
    }

    /**
     * Set Data Backup Space
     * @param DataBackupSpace Data Backup Space
     */
    public void setDataBackupSpace(Long DataBackupSpace) {
        this.DataBackupSpace = DataBackupSpace;
    }

    /**
     * Get Data Backup Total File Count 
     * @return DataBackupCount Data Backup Total File Count
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set Data Backup Total File Count
     * @param DataBackupCount Data Backup Total File Count
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get Log Backup Space 
     * @return LogBackupSpace Log Backup Space
     */
    public Long getLogBackupSpace() {
        return this.LogBackupSpace;
    }

    /**
     * Set Log Backup Space
     * @param LogBackupSpace Log Backup Space
     */
    public void setLogBackupSpace(Long LogBackupSpace) {
        this.LogBackupSpace = LogBackupSpace;
    }

    /**
     * Get Log Backup Total File Count 
     * @return LogBackupCount Log Backup Total File Count
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set Log Backup Total File Count
     * @param LogBackupCount Log Backup Total File Count
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get Automatic Backup Space 
     * @return AutoBackupSpace Automatic Backup Space
     */
    public Long getAutoBackupSpace() {
        return this.AutoBackupSpace;
    }

    /**
     * Set Automatic Backup Space
     * @param AutoBackupSpace Automatic Backup Space
     */
    public void setAutoBackupSpace(Long AutoBackupSpace) {
        this.AutoBackupSpace = AutoBackupSpace;
    }

    /**
     * Get Automatic Backup Total File Count 
     * @return AutoBackupCount Automatic Backup Total File Count
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set Automatic Backup Total File Count
     * @param AutoBackupCount Automatic Backup Total File Count
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get Manual Backup Space 
     * @return ManualBackupSpace Manual Backup Space
     */
    public Long getManualBackupSpace() {
        return this.ManualBackupSpace;
    }

    /**
     * Set Manual Backup Space
     * @param ManualBackupSpace Manual Backup Space
     */
    public void setManualBackupSpace(Long ManualBackupSpace) {
        this.ManualBackupSpace = ManualBackupSpace;
    }

    /**
     * Get Manual Backup Total File Count 
     * @return ManualBackupCount Manual Backup Total File Count
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set Manual Backup Total File Count
     * @param ManualBackupCount Manual Backup Total File Count
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get Instance Region Code 
     * @return Region Instance Region Code
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance Region Code
     * @param Region Instance Region Code
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

