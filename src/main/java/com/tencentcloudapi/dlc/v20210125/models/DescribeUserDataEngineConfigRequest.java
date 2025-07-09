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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserDataEngineConfigRequest extends AbstractModel {

    /**
    * Sorting methods; desc means in reverse order; asc means in order.
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
    * Quantity of returns. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting fields, which support the following type: create-time
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Filter criteria. The following filter types are supported. The parameter Name should be one of them. The number of values that can be filtered by each type of parameter should not be bigger than 5.
app-id - String - (filtering appid)
engine-id - String - (filtering engine ID)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Sorting methods; desc means in reverse order; asc means in order. 
     * @return Sorting Sorting methods; desc means in reverse order; asc means in order.
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set Sorting methods; desc means in reverse order; asc means in order.
     * @param Sorting Sorting methods; desc means in reverse order; asc means in order.
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    /**
     * Get Quantity of returns. It is 10 by default, and the maximum value is 100. 
     * @return Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 10 by default, and the maximum value is 100.
     * @param Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting fields, which support the following type: create-time 
     * @return SortBy Sorting fields, which support the following type: create-time
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting fields, which support the following type: create-time
     * @param SortBy Sorting fields, which support the following type: create-time
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Filter criteria. The following filter types are supported. The parameter Name should be one of them. The number of values that can be filtered by each type of parameter should not be bigger than 5.
app-id - String - (filtering appid)
engine-id - String - (filtering engine ID) 
     * @return Filters Filter criteria. The following filter types are supported. The parameter Name should be one of them. The number of values that can be filtered by each type of parameter should not be bigger than 5.
app-id - String - (filtering appid)
engine-id - String - (filtering engine ID)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The following filter types are supported. The parameter Name should be one of them. The number of values that can be filtered by each type of parameter should not be bigger than 5.
app-id - String - (filtering appid)
engine-id - String - (filtering engine ID)
     * @param Filters Filter criteria. The following filter types are supported. The parameter Name should be one of them. The number of values that can be filtered by each type of parameter should not be bigger than 5.
app-id - String - (filtering appid)
engine-id - String - (filtering engine ID)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeUserDataEngineConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserDataEngineConfigRequest(DescribeUserDataEngineConfigRequest source) {
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
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
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

