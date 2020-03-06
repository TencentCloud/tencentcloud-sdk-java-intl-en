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

public class SyncJobInfo extends AbstractModel{

    /**
    * Disaster recovery task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Disaster recovery task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Task sync
    */
    @SerializedName("SyncOption")
    @Expose
    private SyncOption SyncOption;

    /**
    * Source access type
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * Source data type
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * Source instance information
    */
    @SerializedName("SrcInfo")
    @Expose
    private SyncInstanceInfo SrcInfo;

    /**
    * Disaster recovery access type
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Disaster recovery data type
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * Disaster recovery instance information
    */
    @SerializedName("DstInfo")
    @Expose
    private SyncInstanceInfo DstInfo;

    /**
    * Task information
    */
    @SerializedName("Detail")
    @Expose
    private SyncDetailInfo Detail;

    /**
    * Task status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Table to be migrated
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Disaster recovery task ID 
     * @return JobId Disaster recovery task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Disaster recovery task ID
     * @param JobId Disaster recovery task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Disaster recovery task name 
     * @return JobName Disaster recovery task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Disaster recovery task name
     * @param JobName Disaster recovery task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Task sync 
     * @return SyncOption Task sync
     */
    public SyncOption getSyncOption() {
        return this.SyncOption;
    }

    /**
     * Set Task sync
     * @param SyncOption Task sync
     */
    public void setSyncOption(SyncOption SyncOption) {
        this.SyncOption = SyncOption;
    }

    /**
     * Get Source access type 
     * @return SrcAccessType Source access type
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source access type
     * @param SrcAccessType Source access type
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Source data type 
     * @return SrcDatabaseType Source data type
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source data type
     * @param SrcDatabaseType Source data type
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
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
     * Get Disaster recovery access type 
     * @return DstAccessType Disaster recovery access type
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Disaster recovery access type
     * @param DstAccessType Disaster recovery access type
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Disaster recovery data type 
     * @return DstDatabaseType Disaster recovery data type
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Disaster recovery data type
     * @param DstDatabaseType Disaster recovery data type
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get Disaster recovery instance information 
     * @return DstInfo Disaster recovery instance information
     */
    public SyncInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Disaster recovery instance information
     * @param DstInfo Disaster recovery instance information
     */
    public void setDstInfo(SyncInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Task information 
     * @return Detail Task information
     */
    public SyncDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set Task information
     * @param Detail Task information
     */
    public void setDetail(SyncDetailInfo Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Task status 
     * @return Status Task status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status
     * @param Status Task status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Table to be migrated 
     * @return DatabaseInfo Table to be migrated
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set Table to be migrated
     * @param DatabaseInfo Table to be migrated
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "SyncOption.", this.SyncOption);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

