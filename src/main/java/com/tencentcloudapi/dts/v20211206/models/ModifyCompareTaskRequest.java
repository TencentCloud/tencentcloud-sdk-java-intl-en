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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCompareTaskRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Data consistency check task ID in the format of `dts-8yv4w2i1-cmp-37skmii9`
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * Task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Data comparison object mode. Valid values: `sameAsMigrate` (All migration objects), `custom` (Custom mode. The custom comparison objects must be a subset of the migration objects). Default value: `sameAsMigrate`.
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * Compared object, which is required if `CompareObjectMode` is `custom`.
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
     * Get Data consistency check task ID in the format of `dts-8yv4w2i1-cmp-37skmii9` 
     * @return CompareTaskId Data consistency check task ID in the format of `dts-8yv4w2i1-cmp-37skmii9`
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set Data consistency check task ID in the format of `dts-8yv4w2i1-cmp-37skmii9`
     * @param CompareTaskId Data consistency check task ID in the format of `dts-8yv4w2i1-cmp-37skmii9`
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
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
     * Get Data comparison object mode. Valid values: `sameAsMigrate` (All migration objects), `custom` (Custom mode. The custom comparison objects must be a subset of the migration objects). Default value: `sameAsMigrate`. 
     * @return ObjectMode Data comparison object mode. Valid values: `sameAsMigrate` (All migration objects), `custom` (Custom mode. The custom comparison objects must be a subset of the migration objects). Default value: `sameAsMigrate`.
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set Data comparison object mode. Valid values: `sameAsMigrate` (All migration objects), `custom` (Custom mode. The custom comparison objects must be a subset of the migration objects). Default value: `sameAsMigrate`.
     * @param ObjectMode Data comparison object mode. Valid values: `sameAsMigrate` (All migration objects), `custom` (Custom mode. The custom comparison objects must be a subset of the migration objects). Default value: `sameAsMigrate`.
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get Compared object, which is required if `CompareObjectMode` is `custom`. 
     * @return Objects Compared object, which is required if `CompareObjectMode` is `custom`.
     */
    public CompareObject getObjects() {
        return this.Objects;
    }

    /**
     * Set Compared object, which is required if `CompareObjectMode` is `custom`.
     * @param Objects Compared object, which is required if `CompareObjectMode` is `custom`.
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

    public ModifyCompareTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCompareTaskRequest(ModifyCompareTaskRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
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
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamObj(map, prefix + "Options.", this.Options);

    }
}

