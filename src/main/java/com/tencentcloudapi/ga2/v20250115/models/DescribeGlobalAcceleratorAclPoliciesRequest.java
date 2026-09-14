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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalAcceleratorAclPoliciesRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returns. Default value: 20. Maximum value: 200.</p>
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returns. Default value: 20. Maximum value: 200.</p> 
     * @return Limit <p>Number of returns. Default value: 20. Maximum value: 200.</p>
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returns. Default value: 20. Maximum value: 200.</p>
     * @param Limit <p>Number of returns. Default value: 20. Maximum value: 200.</p>
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    public DescribeGlobalAcceleratorAclPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalAcceleratorAclPoliciesRequest(DescribeGlobalAcceleratorAclPoliciesRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

