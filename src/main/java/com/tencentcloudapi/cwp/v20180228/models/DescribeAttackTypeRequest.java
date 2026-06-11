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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackTypeRequest extends AbstractModel {

    /**
    * Filter criteria
<li>Source - String - Required - Allowlisted module, rasp: vulnerability defense, memshell_inject: memory shell injection</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of entries to be returned. Default value: 10. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Currently available: Id. Default sorting order is by Id. Can be omitted.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting method: DESC, ASC.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Filter criteria
<li>Source - String - Required - Allowlisted module, rasp: vulnerability defense, memshell_inject: memory shell injection</li>
 
     * @return Filters Filter criteria
<li>Source - String - Required - Allowlisted module, rasp: vulnerability defense, memshell_inject: memory shell injection</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Source - String - Required - Allowlisted module, rasp: vulnerability defense, memshell_inject: memory shell injection</li>

     * @param Filters Filter criteria
<li>Source - String - Required - Allowlisted module, rasp: vulnerability defense, memshell_inject: memory shell injection</li>

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of entries to be returned. Default value: 10. Maximum value: 1000. 
     * @return Limit Number of entries to be returned. Default value: 10. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 10. Maximum value: 1000.
     * @param Limit Number of entries to be returned. Default value: 10. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Currently available: Id. Default sorting order is by Id. Can be omitted. 
     * @return By Sorting field. Currently available: Id. Default sorting order is by Id. Can be omitted.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field. Currently available: Id. Default sorting order is by Id. Can be omitted.
     * @param By Sorting field. Currently available: Id. Default sorting order is by Id. Can be omitted.
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting method: DESC, ASC. 
     * @return Order Sorting method: DESC, ASC.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: DESC, ASC.
     * @param Order Sorting method: DESC, ASC.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAttackTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackTypeRequest(DescribeAttackTypeRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

