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

public class DescribeBaselineStrategyListRequest extends AbstractModel {

    /**
    * Pagination parameters (The maximum number is 100.)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Rule switch: 1 - on; 0 - off; 2: all
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
     * Get Pagination parameters (The maximum number is 100.) 
     * @return Limit Pagination parameters (The maximum number is 100.)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters (The maximum number is 100.)
     * @param Limit Pagination parameters (The maximum number is 100.)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Rule switch: 1 - on; 0 - off; 2: all 
     * @return Enabled Rule switch: 1 - on; 0 - off; 2: all
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Rule switch: 1 - on; 0 - off; 2: all
     * @param Enabled Rule switch: 1 - on; 0 - off; 2: all
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    public DescribeBaselineStrategyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineStrategyListRequest(DescribeBaselineStrategyListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

