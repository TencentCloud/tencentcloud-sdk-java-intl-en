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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCompareTaskRequest extends AbstractModel{

    /**
    * Task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Data consistency check task name. If this parameter is left empty, the value of `CompareTaskId` will be assigned to it.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Data comparison object mode. Valid values: `sameAsMigrate` (all migration objects); `custom` (custom mode). Default value: `sameAsMigrate`.
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * Configuration of the data consistency check object
    */
    @SerializedName("Objects")
    @Expose
    private CompareObject Objects;

    /**
    * Consistency check options
    */
    @SerializedName("Options")
    @Expose
    private CompareOptions Options;

    /**
     * Get Task ID 
     * @return JobId Task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID
     * @param JobId Task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Data consistency check task name. If this parameter is left empty, the value of `CompareTaskId` will be assigned to it. 
     * @return TaskName Data consistency check task name. If this parameter is left empty, the value of `CompareTaskId` will be assigned to it.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Data consistency check task name. If this parameter is left empty, the value of `CompareTaskId` will be assigned to it.
     * @param TaskName Data consistency check task name. If this parameter is left empty, the value of `CompareTaskId` will be assigned to it.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Data comparison object mode. Valid values: `sameAsMigrate` (all migration objects); `custom` (custom mode). Default value: `sameAsMigrate`. 
     * @return ObjectMode Data comparison object mode. Valid values: `sameAsMigrate` (all migration objects); `custom` (custom mode). Default value: `sameAsMigrate`.
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set Data comparison object mode. Valid values: `sameAsMigrate` (all migration objects); `custom` (custom mode). Default value: `sameAsMigrate`.
     * @param ObjectMode Data comparison object mode. Valid values: `sameAsMigrate` (all migration objects); `custom` (custom mode). Default value: `sameAsMigrate`.
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get Configuration of the data consistency check object 
     * @return Objects Configuration of the data consistency check object
     */
    public CompareObject getObjects() {
        return this.Objects;
    }

    /**
     * Set Configuration of the data consistency check object
     * @param Objects Configuration of the data consistency check object
     */
    public void setObjects(CompareObject Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Consistency check options 
     * @return Options Consistency check options
     */
    public CompareOptions getOptions() {
        return this.Options;
    }

    /**
     * Set Consistency check options
     * @param Options Consistency check options
     */
    public void setOptions(CompareOptions Options) {
        this.Options = Options;
    }

    public CreateCompareTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCompareTaskRequest(CreateCompareTaskRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ObjectMode != null) {
            this.ObjectMode = new String(source.ObjectMode);
        }
        if (source.Objects != null) {
            this.Objects = new CompareObject(source.Objects);
        }
        if (source.Options != null) {
            this.Options = new CompareOptions(source.Options);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamObj(map, prefix + "Options.", this.Options);

    }
}

