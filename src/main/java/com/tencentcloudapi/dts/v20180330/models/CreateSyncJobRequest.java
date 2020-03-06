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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSyncJobRequest extends AbstractModel{

    /**
    * Disaster recovery sync task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Configuration options of a disaster recovery sync task
    */
    @SerializedName("SyncOption")
    @Expose
    private SyncOption SyncOption;

    /**
    * Source instance database type, which currently only supports mysql
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * Source instance access type, which currently only supports cdb (TencentDB instances)
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * Source instance information
    */
    @SerializedName("SrcInfo")
    @Expose
    private SyncInstanceInfo SrcInfo;

    /**
    * Target instance access type, which currently only supports mysql
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * Target instance access type, which currently only supports cdb (TencentDB instances)
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Target instance information
    */
    @SerializedName("DstInfo")
    @Expose
    private SyncInstanceInfo DstInfo;

    /**
    * Information of the source table to be synced, which is described in JSON string format.
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
     * Get Disaster recovery sync task name 
     * @return JobName Disaster recovery sync task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Disaster recovery sync task name
     * @param JobName Disaster recovery sync task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Configuration options of a disaster recovery sync task 
     * @return SyncOption Configuration options of a disaster recovery sync task
     */
    public SyncOption getSyncOption() {
        return this.SyncOption;
    }

    /**
     * Set Configuration options of a disaster recovery sync task
     * @param SyncOption Configuration options of a disaster recovery sync task
     */
    public void setSyncOption(SyncOption SyncOption) {
        this.SyncOption = SyncOption;
    }

    /**
     * Get Source instance database type, which currently only supports mysql 
     * @return SrcDatabaseType Source instance database type, which currently only supports mysql
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source instance database type, which currently only supports mysql
     * @param SrcDatabaseType Source instance database type, which currently only supports mysql
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get Source instance access type, which currently only supports cdb (TencentDB instances) 
     * @return SrcAccessType Source instance access type, which currently only supports cdb (TencentDB instances)
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source instance access type, which currently only supports cdb (TencentDB instances)
     * @param SrcAccessType Source instance access type, which currently only supports cdb (TencentDB instances)
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Source instance information 
     * @return SrcInfo Source instance information
     */
    public SyncInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source instance information
     * @param SrcInfo Source instance information
     */
    public void setSrcInfo(SyncInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Target instance access type, which currently only supports mysql 
     * @return DstDatabaseType Target instance access type, which currently only supports mysql
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Target instance access type, which currently only supports mysql
     * @param DstDatabaseType Target instance access type, which currently only supports mysql
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get Target instance access type, which currently only supports cdb (TencentDB instances) 
     * @return DstAccessType Target instance access type, which currently only supports cdb (TencentDB instances)
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target instance access type, which currently only supports cdb (TencentDB instances)
     * @param DstAccessType Target instance access type, which currently only supports cdb (TencentDB instances)
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Target instance information 
     * @return DstInfo Target instance information
     */
    public SyncInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target instance information
     * @param DstInfo Target instance information
     */
    public void setDstInfo(SyncInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Information of the source table to be synced, which is described in JSON string format.
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}] 
     * @return DatabaseInfo Information of the source table to be synced, which is described in JSON string format.
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set Information of the source table to be synced, which is described in JSON string format.
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
     * @param DatabaseInfo Information of the source table to be synced, which is described in JSON string format.
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "SyncOption.", this.SyncOption);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);

    }
}

