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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCWPOrderListRequest extends AbstractModel {

    /**
    * <p>Take the intersection when filtering with multiple conditions</p><li>ProductCode: product code, starting with p_</li><li>SubProductCode: subproduct code, starting with sp_</li><li>InquireKey: billing item, starting with sv_</li><li>Status: resource status. 1: normal, 2: isolated, 3: terminated</li><li>PayMode: payment mode. 0: pay-as-you-go billing, 1: monthly subscription</li><li>ResourceId: resource ID</li><li>RenewFlag: auto-renewal label. 0: not needed by default (major customers have the auto-renewal ability), 1: auto-renewal, 2: manually set not to automatically renew</li><li>DealNames: sub-order number</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Offset. Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Limit entries. Default: 10. Maximum: 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Take the intersection when filtering with multiple conditions</p><li>ProductCode: product code, starting with p_</li><li>SubProductCode: subproduct code, starting with sp_</li><li>InquireKey: billing item, starting with sv_</li><li>Status: resource status. 1: normal, 2: isolated, 3: terminated</li><li>PayMode: payment mode. 0: pay-as-you-go billing, 1: monthly subscription</li><li>ResourceId: resource ID</li><li>RenewFlag: auto-renewal label. 0: not needed by default (major customers have the auto-renewal ability), 1: auto-renewal, 2: manually set not to automatically renew</li><li>DealNames: sub-order number</li> 
     * @return Filters <p>Take the intersection when filtering with multiple conditions</p><li>ProductCode: product code, starting with p_</li><li>SubProductCode: subproduct code, starting with sp_</li><li>InquireKey: billing item, starting with sv_</li><li>Status: resource status. 1: normal, 2: isolated, 3: terminated</li><li>PayMode: payment mode. 0: pay-as-you-go billing, 1: monthly subscription</li><li>ResourceId: resource ID</li><li>RenewFlag: auto-renewal label. 0: not needed by default (major customers have the auto-renewal ability), 1: auto-renewal, 2: manually set not to automatically renew</li><li>DealNames: sub-order number</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Take the intersection when filtering with multiple conditions</p><li>ProductCode: product code, starting with p_</li><li>SubProductCode: subproduct code, starting with sp_</li><li>InquireKey: billing item, starting with sv_</li><li>Status: resource status. 1: normal, 2: isolated, 3: terminated</li><li>PayMode: payment mode. 0: pay-as-you-go billing, 1: monthly subscription</li><li>ResourceId: resource ID</li><li>RenewFlag: auto-renewal label. 0: not needed by default (major customers have the auto-renewal ability), 1: auto-renewal, 2: manually set not to automatically renew</li><li>DealNames: sub-order number</li>
     * @param Filters <p>Take the intersection when filtering with multiple conditions</p><li>ProductCode: product code, starting with p_</li><li>SubProductCode: subproduct code, starting with sp_</li><li>InquireKey: billing item, starting with sv_</li><li>Status: resource status. 1: normal, 2: isolated, 3: terminated</li><li>PayMode: payment mode. 0: pay-as-you-go billing, 1: monthly subscription</li><li>ResourceId: resource ID</li><li>RenewFlag: auto-renewal label. 0: not needed by default (major customers have the auto-renewal ability), 1: auto-renewal, 2: manually set not to automatically renew</li><li>DealNames: sub-order number</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Offset. Default value: 0</p> 
     * @return Offset <p>Offset. Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0</p>
     * @param Offset <p>Offset. Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Limit entries. Default: 10. Maximum: 100</p> 
     * @return Limit <p>Limit entries. Default: 10. Maximum: 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit entries. Default: 10. Maximum: 100</p>
     * @param Limit <p>Limit entries. Default: 10. Maximum: 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCWPOrderListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCWPOrderListRequest(DescribeCWPOrderListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

