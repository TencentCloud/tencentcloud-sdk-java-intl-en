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

public class ListFunctionsRequest extends AbstractModel {

    /**
    * It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`, and `FunctionName`.
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * Data offset. The default value is `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Return data length. The default value is `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * It specifies whether to support fuzzy matching for the function name.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function description. Fuzzy search is supported.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Filters
- tag:tag-key - String - Required: No - Filtering criteria based on tag-key - value pairs. Replace `tag-key` with a specific tag-key.

The maximum number of `Filters` for each request is 10, and that of `Filter.Values` is 5.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`. 
     * @return Order It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     * @param Order It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`, and `FunctionName`. 
     * @return Orderby It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`, and `FunctionName`.
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`, and `FunctionName`.
     * @param Orderby It specifies the sorting order of the results according to a specified field, such as `AddTime`, `ModTime`, and `FunctionName`.
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get Data offset. The default value is `0`. 
     * @return Offset Data offset. The default value is `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. The default value is `0`.
     * @param Offset Data offset. The default value is `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Return data length. The default value is `20`. 
     * @return Limit Return data length. The default value is `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Return data length. The default value is `20`.
     * @param Limit Return data length. The default value is `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get It specifies whether to support fuzzy matching for the function name. 
     * @return SearchKey It specifies whether to support fuzzy matching for the function name.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set It specifies whether to support fuzzy matching for the function name.
     * @param SearchKey It specifies whether to support fuzzy matching for the function name.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function description. Fuzzy search is supported. 
     * @return Description Function description. Fuzzy search is supported.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function description. Fuzzy search is supported.
     * @param Description Function description. Fuzzy search is supported.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Filters
- tag:tag-key - String - Required: No - Filtering criteria based on tag-key - value pairs. Replace `tag-key` with a specific tag-key.

The maximum number of `Filters` for each request is 10, and that of `Filter.Values` is 5. 
     * @return Filters Filters
- tag:tag-key - String - Required: No - Filtering criteria based on tag-key - value pairs. Replace `tag-key` with a specific tag-key.

The maximum number of `Filters` for each request is 10, and that of `Filter.Values` is 5.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
- tag:tag-key - String - Required: No - Filtering criteria based on tag-key - value pairs. Replace `tag-key` with a specific tag-key.

The maximum number of `Filters` for each request is 10, and that of `Filter.Values` is 5.
     * @param Filters Filters
- tag:tag-key - String - Required: No - Filtering criteria based on tag-key - value pairs. Replace `tag-key` with a specific tag-key.

The maximum number of `Filters` for each request is 10, and that of `Filter.Values` is 5.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListFunctionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFunctionsRequest(ListFunctionsRequest source) {
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Orderby != null) {
            this.Orderby = new String(source.Orderby);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

