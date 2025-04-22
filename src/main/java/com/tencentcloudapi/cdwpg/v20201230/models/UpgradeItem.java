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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeItem extends AbstractModel {

    /**
    * Task name.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Original kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
    * Target kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetVersion")
    @Expose
    private String TargetVersion;

    /**
    * Task creation time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task completion status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Operator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
     * Get Task name.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Original kernel version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceVersion Original kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set Original kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceVersion Original kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    /**
     * Get Target kernel version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetVersion Target kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetVersion() {
        return this.TargetVersion;
    }

    /**
     * Set Target kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetVersion Target kernel version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetVersion(String TargetVersion) {
        this.TargetVersion = TargetVersion;
    }

    /**
     * Get Task creation time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Task creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Task creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task completion status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task completion status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task completion status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task completion status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Operator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperateUin Operator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperateUin Operator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    public UpgradeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeItem(UpgradeItem source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceVersion != null) {
            this.SourceVersion = new String(source.SourceVersion);
        }
        if (source.TargetVersion != null) {
            this.TargetVersion = new String(source.TargetVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SourceVersion", this.SourceVersion);
        this.setParamSimple(map, prefix + "TargetVersion", this.TargetVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);

    }
}

