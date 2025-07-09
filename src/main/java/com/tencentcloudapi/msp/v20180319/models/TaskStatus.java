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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatus extends AbstractModel {

    /**
    * Migration status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Migration progress
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * Migration date
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get Migration progress 
     * @return Progress Migration progress
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set Migration progress
     * @param Progress Migration progress
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Migration date 
     * @return UpdateTime Migration date
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Migration date
     * @param UpdateTime Migration date
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatus(TaskStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

