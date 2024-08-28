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

public class ScanTaskAgainRequest extends AbstractModel {

    /**
    * Module type. Currently supported values: Malware: Trojan; Vul: vulnerability; Baseline: baseline.
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
    * String array of host QUUIDs. This parameter is effective for selected servers.
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * Scan timeout
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
     * Get Module type. Currently supported values: Malware: Trojan; Vul: vulnerability; Baseline: baseline. 
     * @return ModuleType Module type. Currently supported values: Malware: Trojan; Vul: vulnerability; Baseline: baseline.
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set Module type. Currently supported values: Malware: Trojan; Vul: vulnerability; Baseline: baseline.
     * @param ModuleType Module type. Currently supported values: Malware: Trojan; Vul: vulnerability; Baseline: baseline.
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
     * Get String array of host QUUIDs. This parameter is effective for selected servers. 
     * @return QuuidList String array of host QUUIDs. This parameter is effective for selected servers.
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set String array of host QUUIDs. This parameter is effective for selected servers.
     * @param QuuidList String array of host QUUIDs. This parameter is effective for selected servers.
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get Scan timeout 
     * @return TimeoutPeriod Scan timeout
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set Scan timeout
     * @param TimeoutPeriod Scan timeout
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    public ScanTaskAgainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskAgainRequest(ScanTaskAgainRequest source) {
        if (source.ModuleType != null) {
            this.ModuleType = new String(source.ModuleType);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);

    }
}

