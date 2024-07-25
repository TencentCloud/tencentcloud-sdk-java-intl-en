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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVolumesRequest extends AbstractModel {

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Quantity of returns. It is 20 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, defaults to 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter, supports filtering fields:
- Name: Name
- IsDefault: Whether it is the default.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Quantity of returns. It is 20 by default, and the maximum value is 100. 
     * @return Limit Quantity of returns. It is 20 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 20 by default, and the maximum value is 100.
     * @param Limit Quantity of returns. It is 20 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, defaults to 0 
     * @return Offset Offset, defaults to 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, defaults to 0
     * @param Offset Offset, defaults to 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter, supports filtering fields:
- Name: Name
- IsDefault: Whether it is the default. 
     * @return Filters Filter, supports filtering fields:
- Name: Name
- IsDefault: Whether it is the default.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter, supports filtering fields:
- Name: Name
- IsDefault: Whether it is the default.
     * @param Filters Filter, supports filtering fields:
- Name: Name
- IsDefault: Whether it is the default.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVolumesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVolumesRequest(DescribeVolumesRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

