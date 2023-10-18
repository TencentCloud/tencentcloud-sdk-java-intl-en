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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupListRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The number of results to be returned. Value range: (0,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Record offset. Value range: [0,INF)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Database type. Valid values: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Backup ID
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
    * Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Back mode. Valid values: `auto` (automatic backup), `manual` (manual backup)
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 
    */
    @SerializedName("SnapShotType")
    @Expose
    private String SnapShotType;

    /**
    * Backup start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * Backup alias, which supports fuzzy query.
    */
    @SerializedName("BackupNames")
    @Expose
    private String [] BackupNames;

    /**
    * ID list of the snapshot backup
    */
    @SerializedName("SnapshotIdList")
    @Expose
    private Long [] SnapshotIdList;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The number of results to be returned. Value range: (0,100] 
     * @return Limit The number of results to be returned. Value range: (0,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results to be returned. Value range: (0,100]
     * @param Limit The number of results to be returned. Value range: (0,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Record offset. Value range: [0,INF) 
     * @return Offset Record offset. Value range: [0,INF)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. Value range: [0,INF)
     * @param Offset Record offset. Value range: [0,INF)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Database type. Valid values: 
<li> MYSQL </li> 
     * @return DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type. Valid values: 
<li> MYSQL </li>
     * @param DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Backup ID 
     * @return BackupIds Backup ID
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set Backup ID
     * @param BackupIds Backup ID
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    /**
     * Get Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup). 
     * @return BackupType Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
     * @param BackupType Backup type. Valid values: `snapshot` (snapshot backup), `logic` (logic backup).
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Back mode. Valid values: `auto` (automatic backup), `manual` (manual backup) 
     * @return BackupMethod Back mode. Valid values: `auto` (automatic backup), `manual` (manual backup)
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Back mode. Valid values: `auto` (automatic backup), `manual` (manual backup)
     * @param BackupMethod Back mode. Valid values: `auto` (automatic backup), `manual` (manual backup)
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get  
     * @return SnapShotType 
     */
    public String getSnapShotType() {
        return this.SnapShotType;
    }

    /**
     * Set 
     * @param SnapShotType 
     */
    public void setSnapShotType(String SnapShotType) {
        this.SnapShotType = SnapShotType;
    }

    /**
     * Get Backup start time 
     * @return StartTime Backup start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup start time
     * @param StartTime Backup start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backup end time 
     * @return EndTime Backup end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Backup end time
     * @param EndTime Backup end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return FileNames 
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set 
     * @param FileNames 
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get Backup alias, which supports fuzzy query. 
     * @return BackupNames Backup alias, which supports fuzzy query.
     */
    public String [] getBackupNames() {
        return this.BackupNames;
    }

    /**
     * Set Backup alias, which supports fuzzy query.
     * @param BackupNames Backup alias, which supports fuzzy query.
     */
    public void setBackupNames(String [] BackupNames) {
        this.BackupNames = BackupNames;
    }

    /**
     * Get ID list of the snapshot backup 
     * @return SnapshotIdList ID list of the snapshot backup
     */
    public Long [] getSnapshotIdList() {
        return this.SnapshotIdList;
    }

    /**
     * Set ID list of the snapshot backup
     * @param SnapshotIdList ID list of the snapshot backup
     */
    public void setSnapshotIdList(Long [] SnapshotIdList) {
        this.SnapshotIdList = SnapshotIdList;
    }

    public DescribeBackupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupListRequest(DescribeBackupListRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.SnapShotType != null) {
            this.SnapShotType = new String(source.SnapShotType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileNames != null) {
            this.FileNames = new String[source.FileNames.length];
            for (int i = 0; i < source.FileNames.length; i++) {
                this.FileNames[i] = new String(source.FileNames[i]);
            }
        }
        if (source.BackupNames != null) {
            this.BackupNames = new String[source.BackupNames.length];
            for (int i = 0; i < source.BackupNames.length; i++) {
                this.BackupNames[i] = new String(source.BackupNames[i]);
            }
        }
        if (source.SnapshotIdList != null) {
            this.SnapshotIdList = new Long[source.SnapshotIdList.length];
            for (int i = 0; i < source.SnapshotIdList.length; i++) {
                this.SnapshotIdList[i] = new Long(source.SnapshotIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "SnapShotType", this.SnapShotType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamArraySimple(map, prefix + "BackupNames.", this.BackupNames);
        this.setParamArraySimple(map, prefix + "SnapshotIdList.", this.SnapshotIdList);

    }
}

