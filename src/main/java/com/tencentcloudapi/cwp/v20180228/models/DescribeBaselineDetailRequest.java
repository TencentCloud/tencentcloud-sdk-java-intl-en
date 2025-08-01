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

public class DescribeBaselineDetailRequest extends AbstractModel {

    /**
    * Baseline ID
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
     * Get Baseline ID 
     * @return BaselineId Baseline ID
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set Baseline ID
     * @param BaselineId Baseline ID
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
    }

    public DescribeBaselineDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineDetailRequest(DescribeBaselineDetailRequest source) {
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);

    }
}

