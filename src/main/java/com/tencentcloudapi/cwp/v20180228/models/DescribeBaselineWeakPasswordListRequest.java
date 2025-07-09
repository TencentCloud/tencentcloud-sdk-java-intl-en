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

public class DescribeBaselineWeakPasswordListRequest extends AbstractModel {

    /**
    * <li>WeakPassword - string - required: no - weak password</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Limit Entries, 10 by default, up to 100
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
    * Sorting order [ASC: ascending|DESC: descending]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting column [CreateTime|ModifyTime]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <li>WeakPassword - string - required: no - weak password</li> 
     * @return Filters <li>WeakPassword - string - required: no - weak password</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>WeakPassword - string - required: no - weak password</li>
     * @param Filters <li>WeakPassword - string - required: no - weak password</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Limit Entries, 10 by default, up to 100 
     * @return Limit Limit Entries, 10 by default, up to 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit Entries, 10 by default, up to 100
     * @param Limit Limit Entries, 10 by default, up to 100
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
     * Get Sorting order [ASC: ascending|DESC: descending] 
     * @return Order Sorting order [ASC: ascending|DESC: descending]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order [ASC: ascending|DESC: descending]
     * @param Order Sorting order [ASC: ascending|DESC: descending]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting column [CreateTime|ModifyTime] 
     * @return By Sorting column [CreateTime|ModifyTime]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting column [CreateTime|ModifyTime]
     * @param By Sorting column [CreateTime|ModifyTime]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBaselineWeakPasswordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineWeakPasswordListRequest(DescribeBaselineWeakPasswordListRequest source) {
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

