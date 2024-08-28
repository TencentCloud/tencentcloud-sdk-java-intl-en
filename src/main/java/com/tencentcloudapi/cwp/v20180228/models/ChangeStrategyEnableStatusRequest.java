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

public class ChangeStrategyEnableStatusRequest extends AbstractModel {

    /**
    * Baseline policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Enabling status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Baseline policy ID 
     * @return StrategyId Baseline policy ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Baseline policy ID
     * @param StrategyId Baseline policy ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Enabling status 
     * @return Status Enabling status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enabling status
     * @param Status Enabling status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ChangeStrategyEnableStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeStrategyEnableStatusRequest(ChangeStrategyEnableStatusRequest source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

