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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateTask extends AbstractModel{

    /**
    * Migration task ID
    */
    @SerializedName("MigrateId")
    @Expose
    private Long MigrateId;

    /**
    * Migration task name
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * User ID of migration task
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Migration task region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Migration task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Migration task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Migration task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded, 7: suspended, 8: deleted, 9: suspending, 10: completing, 11: suspension failed, 12: completion failed)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Information
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Whether migration task has been checked (0: not checked, 1: check succeeded, 2: check failed, 3: checking)
    */
    @SerializedName("CheckFlag")
    @Expose
    private Long CheckFlag;

    /**
    * Migration task progress in %
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Migration task progress details
    */
    @SerializedName("MigrateDetail")
    @Expose
    private MigrateDetail MigrateDetail;

    /**
     * Get Migration task ID 
     * @return MigrateId Migration task ID
     */
    public Long getMigrateId() {
        return this.MigrateId;
    }

    /**
     * Set Migration task ID
     * @param MigrateId Migration task ID
     */
    public void setMigrateId(Long MigrateId) {
        this.MigrateId = MigrateId;
    }

    /**
     * Get Migration task name 
     * @return MigrateName Migration task name
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set Migration task name
     * @param MigrateName Migration task name
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get User ID of migration task 
     * @return AppId User ID of migration task
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID of migration task
     * @param AppId User ID of migration task
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Migration task region 
     * @return Region Migration task region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Migration task region
     * @param Region Migration task region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode) 
     * @return SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     * @param SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Migration task creation time 
     * @return CreateTime Migration task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Migration task creation time
     * @param CreateTime Migration task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Migration task start time 
     * @return StartTime Migration task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Migration task start time
     * @param StartTime Migration task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Migration task end time 
     * @return EndTime Migration task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Migration task end time
     * @param EndTime Migration task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded, 7: suspended, 8: deleted, 9: suspending, 10: completing, 11: suspension failed, 12: completion failed) 
     * @return Status Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded, 7: suspended, 8: deleted, 9: suspending, 10: completing, 11: suspension failed, 12: completion failed)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded, 7: suspended, 8: deleted, 9: suspending, 10: completing, 11: suspension failed, 12: completion failed)
     * @param Status Migration task status (1: initializing, 4: migrating, 5: migration failed, 6: migration succeeded, 7: suspended, 8: deleted, 9: suspending, 10: completing, 11: suspension failed, 12: completion failed)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Information 
     * @return Message Information
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Information
     * @param Message Information
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Whether migration task has been checked (0: not checked, 1: check succeeded, 2: check failed, 3: checking) 
     * @return CheckFlag Whether migration task has been checked (0: not checked, 1: check succeeded, 2: check failed, 3: checking)
     */
    public Long getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * Set Whether migration task has been checked (0: not checked, 1: check succeeded, 2: check failed, 3: checking)
     * @param CheckFlag Whether migration task has been checked (0: not checked, 1: check succeeded, 2: check failed, 3: checking)
     */
    public void setCheckFlag(Long CheckFlag) {
        this.CheckFlag = CheckFlag;
    }

    /**
     * Get Migration task progress in % 
     * @return Progress Migration task progress in %
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Migration task progress in %
     * @param Progress Migration task progress in %
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Migration task progress details 
     * @return MigrateDetail Migration task progress details
     */
    public MigrateDetail getMigrateDetail() {
        return this.MigrateDetail;
    }

    /**
     * Set Migration task progress details
     * @param MigrateDetail Migration task progress details
     */
    public void setMigrateDetail(MigrateDetail MigrateDetail) {
        this.MigrateDetail = MigrateDetail;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateId", this.MigrateId);
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "MigrateDetail.", this.MigrateDetail);

    }
}

