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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMSdkAccessRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start position for paging.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of rows per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter.
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
    * Supports sorting by ts.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * asc or desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start position for paging. 
     * @return Offset Start position for paging.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Start position for paging.
     * @param Offset Start position for paging.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of rows per page 
     * @return Limit Number of rows per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of rows per page
     * @param Limit Number of rows per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter. 
     * @return Filters Filter.
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
     * @param Filters Filter.
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Supports sorting by ts. 
     * @return By Supports sorting by ts.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Supports sorting by ts.
     * @param By Supports sorting by ts.
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get asc or desc 
     * @return Order asc or desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set asc or desc
     * @param Order asc or desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeLLMSdkAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMSdkAccessRequest(DescribeLLMSdkAccessRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

