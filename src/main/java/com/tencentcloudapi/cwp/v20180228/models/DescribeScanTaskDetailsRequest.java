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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanTaskDetailsRequest extends AbstractModel {

    /**
    * Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Filter parameters
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Number of items to be returned. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available. 
     * @return ModuleType Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
     * @param ModuleType Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Filter parameters 
     * @return Filters Filter parameters
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
     * @param Filters Filter parameters
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of items to be returned. The maximum value is 100. 
     * @return Limit Number of items to be returned. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be returned. The maximum value is 100.
     * @param Limit Number of items to be returned. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeScanTaskDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskDetailsRequest(DescribeScanTaskDetailsRequest source) {
        if (source.ModuleType != null) {
            this.ModuleType = new String(source.ModuleType);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

