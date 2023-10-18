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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Migration type
    */
    @SerializedName("MigrationType")
    @Expose
    private String MigrationType;

    /**
    * Migration status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Migration source information
    */
    @SerializedName("SrcInfo")
    @Expose
    private SrcInfo SrcInfo;

    /**
    * Migration time information
    */
    @SerializedName("MigrationTimeLine")
    @Expose
    private TimeObj MigrationTimeLine;

    /**
    * Status update time
    */
    @SerializedName("Updated")
    @Expose
    private String Updated;

    /**
    * Migration destination information
    */
    @SerializedName("DstInfo")
    @Expose
    private DstInfo DstInfo;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name 
     * @return TaskName Task name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name
     * @param TaskName Task name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Migration type 
     * @return MigrationType Migration type
     */
    public String getMigrationType() {
        return this.MigrationType;
    }

    /**
     * Set Migration type
     * @param MigrationType Migration type
     */
    public void setMigrationType(String MigrationType) {
        this.MigrationType = MigrationType;
    }

    /**
     * Get Migration status 
     * @return Status Migration status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Migration status
     * @param Status Migration status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name 
     * @return ProjectName Project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
     * @param ProjectName Project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Migration source information 
     * @return SrcInfo Migration source information
     */
    public SrcInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Migration source information
     * @param SrcInfo Migration source information
     */
    public void setSrcInfo(SrcInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Migration time information 
     * @return MigrationTimeLine Migration time information
     */
    public TimeObj getMigrationTimeLine() {
        return this.MigrationTimeLine;
    }

    /**
     * Set Migration time information
     * @param MigrationTimeLine Migration time information
     */
    public void setMigrationTimeLine(TimeObj MigrationTimeLine) {
        this.MigrationTimeLine = MigrationTimeLine;
    }

    /**
     * Get Status update time 
     * @return Updated Status update time
     */
    public String getUpdated() {
        return this.Updated;
    }

    /**
     * Set Status update time
     * @param Updated Status update time
     */
    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }

    /**
     * Get Migration destination information 
     * @return DstInfo Migration destination information
     */
    public DstInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Migration destination information
     * @param DstInfo Migration destination information
     */
    public void setDstInfo(DstInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.MigrationType != null) {
            this.MigrationType = new String(source.MigrationType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new SrcInfo(source.SrcInfo);
        }
        if (source.MigrationTimeLine != null) {
            this.MigrationTimeLine = new TimeObj(source.MigrationTimeLine);
        }
        if (source.Updated != null) {
            this.Updated = new String(source.Updated);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new DstInfo(source.DstInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "MigrationType", this.MigrationType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "MigrationTimeLine.", this.MigrationTimeLine);
        this.setParamSimple(map, prefix + "Updated", this.Updated);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);

    }
}

