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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSwitchListsRequest extends AbstractModel {

    /**
    * Firewall status. 0: disabled; 1: enabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Asset type, e.g. CVM/NAT/VPN/CLB/others
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Region, e.g. Shanghai, Chongqing, Guangzhou, etc.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Search value, e.g. "{"common":"106.54.189.45"}"
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * Number of entries. Default: 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort order. desc: descending; asc: ascending
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field. PortTimes (number of risky ports)
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Firewall status. 0: disabled; 1: enabled 
     * @return Status Firewall status. 0: disabled; 1: enabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Firewall status. 0: disabled; 1: enabled
     * @param Status Firewall status. 0: disabled; 1: enabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Asset type, e.g. CVM/NAT/VPN/CLB/others 
     * @return Type Asset type, e.g. CVM/NAT/VPN/CLB/others
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Asset type, e.g. CVM/NAT/VPN/CLB/others
     * @param Type Asset type, e.g. CVM/NAT/VPN/CLB/others
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Region, e.g. Shanghai, Chongqing, Guangzhou, etc. 
     * @return Area Region, e.g. Shanghai, Chongqing, Guangzhou, etc.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region, e.g. Shanghai, Chongqing, Guangzhou, etc.
     * @param Area Region, e.g. Shanghai, Chongqing, Guangzhou, etc.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Search value, e.g. "{"common":"106.54.189.45"}" 
     * @return SearchValue Search value, e.g. "{"common":"106.54.189.45"}"
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Search value, e.g. "{"common":"106.54.189.45"}"
     * @param SearchValue Search value, e.g. "{"common":"106.54.189.45"}"
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get Number of entries. Default: 10 
     * @return Limit Number of entries. Default: 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries. Default: 10
     * @param Limit Number of entries. Default: 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default: 0 
     * @return Offset Offset. Default: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default: 0
     * @param Offset Offset. Default: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort order. desc: descending; asc: ascending 
     * @return Order Sort order. desc: descending; asc: ascending
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order. desc: descending; asc: ascending
     * @param Order Sort order. desc: descending; asc: ascending
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field. PortTimes (number of risky ports) 
     * @return By Sorting field. PortTimes (number of risky ports)
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field. PortTimes (number of risky ports)
     * @param By Sorting field. PortTimes (number of risky ports)
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeSwitchListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSwitchListsRequest(DescribeSwitchListsRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

