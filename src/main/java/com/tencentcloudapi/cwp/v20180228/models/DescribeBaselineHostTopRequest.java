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

public class DescribeBaselineHostTopRequest extends AbstractModel {

    /**
    * Dynamic top value
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
     * Get Dynamic top value 
     * @return Top Dynamic top value
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set Dynamic top value
     * @param Top Dynamic top value
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get Policy ID 
     * @return StrategyId Policy ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
     * @param StrategyId Policy ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    public DescribeBaselineHostTopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineHostTopRequest(DescribeBaselineHostTopRequest source) {
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

