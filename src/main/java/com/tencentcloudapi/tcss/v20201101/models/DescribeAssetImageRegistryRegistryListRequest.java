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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryRegistryListRequest extends AbstractModel {

    /**
    * Number to return, default is 10, maximum is 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, the default is 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter field IsAuthorized Whether to authorize. The value can be all, 0 unauthorized, 1 authorized
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Sort field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sort by asc, desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Number to return, default is 10, maximum is 100 
     * @return Limit Number to return, default is 10, maximum is 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number to return, default is 10, maximum is 100
     * @param Limit Number to return, default is 10, maximum is 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, the default is 0 
     * @return Offset Offset, the default is 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, the default is 0
     * @param Offset Offset, the default is 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter field IsAuthorized Whether to authorize. The value can be all, 0 unauthorized, 1 authorized 
     * @return Filters Filter field IsAuthorized Whether to authorize. The value can be all, 0 unauthorized, 1 authorized
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter field IsAuthorized Whether to authorize. The value can be all, 0 unauthorized, 1 authorized
     * @param Filters Filter field IsAuthorized Whether to authorize. The value can be all, 0 unauthorized, 1 authorized
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort field 
     * @return By Sort field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort field
     * @param By Sort field
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sort by asc, desc 
     * @return Order Sort by asc, desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort by asc, desc
     * @param Order Sort by asc, desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAssetImageRegistryRegistryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryRegistryListRequest(DescribeAssetImageRegistryRegistryListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

