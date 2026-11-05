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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunTime extends AbstractModel {

    /**
    * Creation time (a millisecond timestamp).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time (timestamp in milliseconds)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (timestamp in milliseconds)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Creation time (a millisecond timestamp). 
     * @return CreateTime Creation time (a millisecond timestamp).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time (a millisecond timestamp).
     * @param CreateTime Creation time (a millisecond timestamp).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time (timestamp in milliseconds) 
     * @return StartTime Start time (timestamp in milliseconds)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (timestamp in milliseconds)
     * @param StartTime Start time (timestamp in milliseconds)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (timestamp in milliseconds) 
     * @return EndTime End time (timestamp in milliseconds)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (timestamp in milliseconds)
     * @param EndTime End time (timestamp in milliseconds)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public WorkflowRunTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunTime(WorkflowRunTime source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

