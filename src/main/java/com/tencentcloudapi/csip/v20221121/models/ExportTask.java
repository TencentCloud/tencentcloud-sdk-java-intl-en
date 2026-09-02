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

public class ExportTask extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * User AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Progress percentage
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * Task status: 0: not started; 1: executing; 2: executed successfully; 3: timed out; 4: execution failed.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Task update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * File name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size in bytes.
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Remaining time (in seconds).
    */
    @SerializedName("RemainingTime")
    @Expose
    private Long RemainingTime;

    /**
     * Get Task ID 
     * @return Id Task ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Task ID
     * @param Id Task ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get User AppId 
     * @return AppId User AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
     * @param AppId User AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Progress percentage 
     * @return Percentage Progress percentage
     */
    public Long getPercentage() {
        return this.Percentage;
    }

    /**
     * Set Progress percentage
     * @param Percentage Progress percentage
     */
    public void setPercentage(Long Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get Task status: 0: not started; 1: executing; 2: executed successfully; 3: timed out; 4: execution failed. 
     * @return TaskStatus Task status: 0: not started; 1: executing; 2: executed successfully; 3: timed out; 4: execution failed.
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status: 0: not started; 1: executing; 2: executed successfully; 3: timed out; 4: execution failed.
     * @param TaskStatus Task status: 0: not started; 1: executing; 2: executed successfully; 3: timed out; 4: execution failed.
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task update time 
     * @return ModifyTime Task update time
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Task update time
     * @param ModifyTime Task update time
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get File name 
     * @return FileName File name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name
     * @param FileName File name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size in bytes. 
     * @return FileSize File size in bytes.
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size in bytes.
     * @param FileSize File size in bytes.
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Remaining time (in seconds). 
     * @return RemainingTime Remaining time (in seconds).
     */
    public Long getRemainingTime() {
        return this.RemainingTime;
    }

    /**
     * Set Remaining time (in seconds).
     * @param RemainingTime Remaining time (in seconds).
     */
    public void setRemainingTime(Long RemainingTime) {
        this.RemainingTime = RemainingTime;
    }

    public ExportTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportTask(ExportTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Percentage != null) {
            this.Percentage = new Long(source.Percentage);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.RemainingTime != null) {
            this.RemainingTime = new Long(source.RemainingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "RemainingTime", this.RemainingTime);

    }
}

