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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportScanTaskDetailsRequest extends AbstractModel {

    /**
    * Task ID for this detection (different from the ID of the task for exporting the detection Excel file in the input parameters)
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Module type. Malware: Trojan; Vul: vulnerability; Baseline: baseline.
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * Filter parameter: ipOrAlias (server name/IP address)
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Task ID for this detection (different from the ID of the task for exporting the detection Excel file in the input parameters) 
     * @return TaskId Task ID for this detection (different from the ID of the task for exporting the detection Excel file in the input parameters)
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID for this detection (different from the ID of the task for exporting the detection Excel file in the input parameters)
     * @param TaskId Task ID for this detection (different from the ID of the task for exporting the detection Excel file in the input parameters)
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Module type. Malware: Trojan; Vul: vulnerability; Baseline: baseline. 
     * @return ModuleType Module type. Malware: Trojan; Vul: vulnerability; Baseline: baseline.
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set Module type. Malware: Trojan; Vul: vulnerability; Baseline: baseline.
     * @param ModuleType Module type. Malware: Trojan; Vul: vulnerability; Baseline: baseline.
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get Filter parameter: ipOrAlias (server name/IP address) 
     * @return Filters Filter parameter: ipOrAlias (server name/IP address)
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter: ipOrAlias (server name/IP address)
     * @param Filters Filter parameter: ipOrAlias (server name/IP address)
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ExportScanTaskDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportScanTaskDetailsRequest(ExportScanTaskDetailsRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.ModuleType != null) {
            this.ModuleType = new String(source.ModuleType);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

