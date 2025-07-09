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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStrategyRisksRequest extends AbstractModel {

    /**
    * Assessment item ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Quantity of returns. It is 100 by default, and the maximum value is 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Environment
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * Task type
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get Assessment item ID 
     * @return StrategyId Assessment item ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Assessment item ID
     * @param StrategyId Assessment item ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Quantity of returns. It is 100 by default, and the maximum value is 200. 
     * @return Limit Quantity of returns. It is 100 by default, and the maximum value is 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 100 by default, and the maximum value is 200.
     * @param Limit Quantity of returns. It is 100 by default, and the maximum value is 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Environment 
     * @return Env Environment
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set Environment
     * @param Env Environment
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get Task type 
     * @return TaskType Task type
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type
     * @param TaskType Task type
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    public DescribeTaskStrategyRisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskStrategyRisksRequest(DescribeTaskStrategyRisksRequest source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

