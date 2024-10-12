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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFunctionsRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter by function ID list.
    */
    @SerializedName("FunctionIds")
    @Expose
    private String [] FunctionIds;

    /**
    * Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>name: Fuzzy match by [function name].</li>
<li>remark: Fuzzy match by [function description].</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number limit of paginated query. Default value: 20. Maximum value: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter by function ID list. 
     * @return FunctionIds Filter by function ID list.
     */
    public String [] getFunctionIds() {
        return this.FunctionIds;
    }

    /**
     * Set Filter by function ID list.
     * @param FunctionIds Filter by function ID list.
     */
    public void setFunctionIds(String [] FunctionIds) {
        this.FunctionIds = FunctionIds;
    }

    /**
     * Get Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>name: Fuzzy match by [function name].</li>
<li>remark: Fuzzy match by [function description].</li> 
     * @return Filters Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>name: Fuzzy match by [function name].</li>
<li>remark: Fuzzy match by [function description].</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>name: Fuzzy match by [function name].</li>
<li>remark: Fuzzy match by [function description].</li>
     * @param Filters Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>name: Fuzzy match by [function name].</li>
<li>remark: Fuzzy match by [function description].</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The offset of paginated query. Default value: 0. 
     * @return Offset The offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset of paginated query. Default value: 0.
     * @param Offset The offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number limit of paginated query. Default value: 20. Maximum value: 200. 
     * @return Limit Number limit of paginated query. Default value: 20. Maximum value: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Maximum value: 200.
     * @param Limit Number limit of paginated query. Default value: 20. Maximum value: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeFunctionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFunctionsRequest(DescribeFunctionsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionIds != null) {
            this.FunctionIds = new String[source.FunctionIds.length];
            for (int i = 0; i < source.FunctionIds.length; i++) {
                this.FunctionIds[i] = new String(source.FunctionIds[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "FunctionIds.", this.FunctionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

