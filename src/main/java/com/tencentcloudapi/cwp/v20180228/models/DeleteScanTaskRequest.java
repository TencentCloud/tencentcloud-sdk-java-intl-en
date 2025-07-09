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

public class DeleteScanTaskRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Module type. Malware (Trojan), Vul (vulnerability), and Baseline are currently available.
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * Effective for selected servers; a string array of host QUUIDs
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

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
     * Get Effective for selected servers; a string array of host QUUIDs 
     * @return QuuidList Effective for selected servers; a string array of host QUUIDs
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set Effective for selected servers; a string array of host QUUIDs
     * @param QuuidList Effective for selected servers; a string array of host QUUIDs
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    public DeleteScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScanTaskRequest(DeleteScanTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.ModuleType != null) {
            this.ModuleType = new String(source.ModuleType);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);

    }
}

