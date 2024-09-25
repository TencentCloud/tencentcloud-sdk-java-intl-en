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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBatchIpAccessControlRequest extends AbstractModel {

    /**
    * Filter criteria: supports ActionType 40/42, IP: IP address, Domain: Three types of domains
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
    * Offset
    */
    @SerializedName("OffSet")
    @Expose
    private Long OffSet;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sort parameters
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
     * Get Filter criteria: supports ActionType 40/42, IP: IP address, Domain: Three types of domains 
     * @return Filters Filter criteria: supports ActionType 40/42, IP: IP address, Domain: Three types of domains
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria: supports ActionType 40/42, IP: IP address, Domain: Three types of domains
     * @param Filters Filter criteria: supports ActionType 40/42, IP: IP address, Domain: Three types of domains
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 
     * @return OffSet Offset
     */
    public Long getOffSet() {
        return this.OffSet;
    }

    /**
     * Set Offset
     * @param OffSet Offset
     */
    public void setOffSet(Long OffSet) {
        this.OffSet = OffSet;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sort parameters 
     * @return Sort Sort parameters
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sort parameters
     * @param Sort Sort parameters
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public DescribeBatchIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchIpAccessControlRequest(DescribeBatchIpAccessControlRequest source) {
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
        if (source.OffSet != null) {
            this.OffSet = new Long(source.OffSet);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OffSet", this.OffSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

