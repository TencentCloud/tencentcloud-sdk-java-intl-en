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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusTempRequest extends AbstractModel {

    /**
    * Fuzzy filter. Valid values:
`Level`: Filter by template level
`Name`: Filter by name
`Describe`: Filter by description
`ID`: Filter by templateId
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Page offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Fuzzy filter. Valid values:
`Level`: Filter by template level
`Name`: Filter by name
`Describe`: Filter by description
`ID`: Filter by templateId 
     * @return Filters Fuzzy filter. Valid values:
`Level`: Filter by template level
`Name`: Filter by name
`Describe`: Filter by description
`ID`: Filter by templateId
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Fuzzy filter. Valid values:
`Level`: Filter by template level
`Name`: Filter by name
`Describe`: Filter by description
`ID`: Filter by templateId
     * @param Filters Fuzzy filter. Valid values:
`Level`: Filter by template level
`Name`: Filter by name
`Describe`: Filter by description
`ID`: Filter by templateId
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Number of results per page 
     * @return Limit Number of results per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page
     * @param Limit Number of results per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePrometheusTempRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusTempRequest(DescribePrometheusTempRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

