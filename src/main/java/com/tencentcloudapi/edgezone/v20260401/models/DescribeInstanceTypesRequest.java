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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceTypesRequest extends AbstractModel {

    /**
    * Availability zone code, such as ap-guangzhou-1. If not passed, return models under the account in all AZs.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination size. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Availability zone code, such as ap-guangzhou-1. If not passed, return models under the account in all AZs. 
     * @return Zone Availability zone code, such as ap-guangzhou-1. If not passed, return models under the account in all AZs.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone code, such as ap-guangzhou-1. If not passed, return models under the account in all AZs.
     * @param Zone Availability zone code, such as ap-guangzhou-1. If not passed, return models under the account in all AZs.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination size. Default value: 20. Maximum value: 100. 
     * @return Limit Pagination size. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size. Default value: 20. Maximum value: 100.
     * @param Limit Pagination size. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInstanceTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceTypesRequest(DescribeInstanceTypesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

