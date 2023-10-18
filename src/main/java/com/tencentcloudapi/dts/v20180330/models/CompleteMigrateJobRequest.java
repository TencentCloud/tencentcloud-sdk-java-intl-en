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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompleteMigrateJobRequest extends AbstractModel {

    /**
    * Data migration task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * The way to complete the task, which is supported only for legacy MySQL migration task. waitForSync: wait for the source-replica lag to become 0 before stopping; immediately: complete immediately without waiting for source-replica sync. Default value: waitForSync
    */
    @SerializedName("CompleteMode")
    @Expose
    private String CompleteMode;

    /**
     * Get Data migration task ID 
     * @return JobId Data migration task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Data migration task ID
     * @param JobId Data migration task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get The way to complete the task, which is supported only for legacy MySQL migration task. waitForSync: wait for the source-replica lag to become 0 before stopping; immediately: complete immediately without waiting for source-replica sync. Default value: waitForSync 
     * @return CompleteMode The way to complete the task, which is supported only for legacy MySQL migration task. waitForSync: wait for the source-replica lag to become 0 before stopping; immediately: complete immediately without waiting for source-replica sync. Default value: waitForSync
     */
    public String getCompleteMode() {
        return this.CompleteMode;
    }

    /**
     * Set The way to complete the task, which is supported only for legacy MySQL migration task. waitForSync: wait for the source-replica lag to become 0 before stopping; immediately: complete immediately without waiting for source-replica sync. Default value: waitForSync
     * @param CompleteMode The way to complete the task, which is supported only for legacy MySQL migration task. waitForSync: wait for the source-replica lag to become 0 before stopping; immediately: complete immediately without waiting for source-replica sync. Default value: waitForSync
     */
    public void setCompleteMode(String CompleteMode) {
        this.CompleteMode = CompleteMode;
    }

    public CompleteMigrateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompleteMigrateJobRequest(CompleteMigrateJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompleteMode != null) {
            this.CompleteMode = new String(source.CompleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompleteMode", this.CompleteMode);

    }
}

