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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTriggersRequest extends AbstractModel {

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Namespace. Default value: default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Data offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Indicates by which field to sort the returned results. Valid values: add_time, mod_time. Default value: mod_time
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC, DESC. Default value: DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * * Qualifier: Version/Alias of trigger function 
*TriggerName: Name of the trigger 
*Description: Function trigger description
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Namespace. Default value: default 
     * @return Namespace Namespace. Default value: default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. Default value: default
     * @param Namespace Namespace. Default value: default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Data offset. Default value: 0 
     * @return Offset Data offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. Default value: 0
     * @param Offset Data offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. Default value: 20 
     * @return Limit Number of results to be returned. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 20
     * @param Limit Number of results to be returned. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Indicates by which field to sort the returned results. Valid values: add_time, mod_time. Default value: mod_time 
     * @return OrderBy Indicates by which field to sort the returned results. Valid values: add_time, mod_time. Default value: mod_time
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Indicates by which field to sort the returned results. Valid values: add_time, mod_time. Default value: mod_time
     * @param OrderBy Indicates by which field to sort the returned results. Valid values: add_time, mod_time. Default value: mod_time
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC, DESC. Default value: DESC 
     * @return Order Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC, DESC. Default value: DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC, DESC. Default value: DESC
     * @param Order Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC, DESC. Default value: DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get * Qualifier: Version/Alias of trigger function 
*TriggerName: Name of the trigger 
*Description: Function trigger description 
     * @return Filters * Qualifier: Version/Alias of trigger function 
*TriggerName: Name of the trigger 
*Description: Function trigger description
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set * Qualifier: Version/Alias of trigger function 
*TriggerName: Name of the trigger 
*Description: Function trigger description
     * @param Filters * Qualifier: Version/Alias of trigger function 
*TriggerName: Name of the trigger 
*Description: Function trigger description
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListTriggersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTriggersRequest(ListTriggersRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
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
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

