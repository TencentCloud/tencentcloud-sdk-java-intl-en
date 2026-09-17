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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatData extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 
    */
    @SerializedName("Summary")
    @Expose
    private TaskStatDataItem [] Summary;

    /**
    * 
    */
    @SerializedName("Details")
    @Expose
    private SpecificationDataItem [] Details;

    /**
     * Get  
     * @return TaskType 
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 
     * @param TaskType 
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get  
     * @return Summary 
     */
    public TaskStatDataItem [] getSummary() {
        return this.Summary;
    }

    /**
     * Set 
     * @param Summary 
     */
    public void setSummary(TaskStatDataItem [] Summary) {
        this.Summary = Summary;
    }

    /**
     * Get  
     * @return Details 
     */
    public SpecificationDataItem [] getDetails() {
        return this.Details;
    }

    /**
     * Set 
     * @param Details 
     */
    public void setDetails(SpecificationDataItem [] Details) {
        this.Details = Details;
    }

    public TaskStatData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatData(TaskStatData source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Summary != null) {
            this.Summary = new TaskStatDataItem[source.Summary.length];
            for (int i = 0; i < source.Summary.length; i++) {
                this.Summary[i] = new TaskStatDataItem(source.Summary[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new SpecificationDataItem[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new SpecificationDataItem(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "Summary.", this.Summary);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

