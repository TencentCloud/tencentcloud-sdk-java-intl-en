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

public class ModifyCompareTaskNameRequest extends AbstractModel {

    /**
    * Migration task ID
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
    * Data consistency check task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
     * Get Migration task ID 
     * @return JobId Migration task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Migration task ID
     * @param JobId Migration task ID
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
     * Get Data consistency check task name 
     * @return TaskName Data consistency check task name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Data consistency check task name
     * @param TaskName Data consistency check task name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public ModifyCompareTaskNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCompareTaskNameRequest(ModifyCompareTaskNameRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);

    }
}

