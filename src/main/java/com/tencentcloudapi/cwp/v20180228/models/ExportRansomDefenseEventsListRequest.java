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

public class ExportRansomDefenseEventsListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting method: ASC / DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field, supporting CreateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li> 
     * @return Filters Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
     * @param Filters Filter criteria
<li>HostName- string- host name</li>
<li>Status - Uint64: 0 - pending; 1 processed; 2 -trusted</li>
<li>HostIp - String - host IP</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: ASC / DESC 
     * @return Order Sorting method: ASC / DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: ASC / DESC
     * @param Order Sorting method: ASC / DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field, supporting CreateTime 
     * @return By Sorting field, supporting CreateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field, supporting CreateTime
     * @param By Sorting field, supporting CreateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportRansomDefenseEventsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRansomDefenseEventsListRequest(ExportRansomDefenseEventsListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
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

