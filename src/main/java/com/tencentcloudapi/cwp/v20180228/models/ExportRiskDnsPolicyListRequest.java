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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportRiskDnsPolicyListRequest extends AbstractModel {

    /**
    * <li>PolicyType - int - whether required: no - policy type</li>
<li>PolicyName - string - whether required: no - policy name</li>
<li>Domain - string - Required: No - Domain (first urlencode the domain, then base64)</li>
<li>PolicyAction- int - whether required: no - policy action</li>
<li>IsEnabled - int - whether required: no - whether effective</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Optional sorting column: [PolicyName|HostType]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <li>PolicyType - int - whether required: no - policy type</li>
<li>PolicyName - string - whether required: no - policy name</li>
<li>Domain - string - Required: No - Domain (first urlencode the domain, then base64)</li>
<li>PolicyAction- int - whether required: no - policy action</li>
<li>IsEnabled - int - whether required: no - whether effective</li> 
     * @return Filters <li>PolicyType - int - whether required: no - policy type</li>
<li>PolicyName - string - whether required: no - policy name</li>
<li>Domain - string - Required: No - Domain (first urlencode the domain, then base64)</li>
<li>PolicyAction- int - whether required: no - policy action</li>
<li>IsEnabled - int - whether required: no - whether effective</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>PolicyType - int - whether required: no - policy type</li>
<li>PolicyName - string - whether required: no - policy name</li>
<li>Domain - string - Required: No - Domain (first urlencode the domain, then base64)</li>
<li>PolicyAction- int - whether required: no - policy action</li>
<li>IsEnabled - int - whether required: no - whether effective</li>
     * @param Filters <li>PolicyType - int - whether required: no - policy type</li>
<li>PolicyName - string - whether required: no - policy name</li>
<li>Domain - string - Required: No - Domain (first urlencode the domain, then base64)</li>
<li>PolicyAction- int - whether required: no - policy action</li>
<li>IsEnabled - int - whether required: no - whether effective</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting Method: [ASC: Ascending Order, DESC: Descending Order] 
     * @return Order Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     * @param Order Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Optional sorting column: [PolicyName|HostType] 
     * @return By Optional sorting column: [PolicyName|HostType]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Optional sorting column: [PolicyName|HostType]
     * @param By Optional sorting column: [PolicyName|HostType]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportRiskDnsPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRiskDnsPolicyListRequest(ExportRiskDnsPolicyListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

