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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagRetentionExecutionTaskRequest extends AbstractModel {

    /**
    * Primary instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Rule ID
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * Rule execution ID
    */
    @SerializedName("ExecutionId")
    @Expose
    private Long ExecutionId;

    /**
    * Page offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * `PageSize` for pagination
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Primary instance ID 
     * @return RegistryId Primary instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Primary instance ID
     * @param RegistryId Primary instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Rule ID 
     * @return RetentionId Rule ID
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set Rule ID
     * @param RetentionId Rule ID
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get Rule execution ID 
     * @return ExecutionId Rule execution ID
     */
    public Long getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set Rule execution ID
     * @param ExecutionId Rule execution ID
     */
    public void setExecutionId(Long ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get Page offset 
     * @return Offset Page offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset
     * @param Offset Page offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get `PageSize` for pagination 
     * @return Limit `PageSize` for pagination
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set `PageSize` for pagination
     * @param Limit `PageSize` for pagination
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTagRetentionExecutionTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagRetentionExecutionTaskRequest(DescribeTagRetentionExecutionTaskRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new Long(source.ExecutionId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

