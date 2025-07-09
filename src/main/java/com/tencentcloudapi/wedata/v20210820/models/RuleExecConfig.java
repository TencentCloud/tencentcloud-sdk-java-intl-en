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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecConfig extends AbstractModel {

    /**
    * Compute Queue Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Execution Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * The running execution engine, if not specified, the default execution engine under this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get Compute Queue Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QueueName Compute Queue Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Compute Queue Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QueueName Compute Queue Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Execution Resource Group
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutorGroupId Execution Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Execution Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutorGroupId Execution Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get The running execution engine, if not specified, the default execution engine under this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EngineType The running execution engine, if not specified, the default execution engine under this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set The running execution engine, if not specified, the default execution engine under this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EngineType The running execution engine, if not specified, the default execution engine under this data source will be requested
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public RuleExecConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecConfig(RuleExecConfig source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

