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

public class DescribeMachineClearHistoryRequest extends AbstractModel {

    /**
    * <p>Filter conditions<br>When multiple conditions are used, Keywords and TimeBetween are intersected</p><li>Keywords: instance name, private IP, or public IP</li><li>TimeBetween: time range</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>The maximum number of entries. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sort order: ASC for ascending, DESC for descending. Default: ASC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>AgentLastOfflineTime: Time when the client was last offline<br>AutoClearTime: Cleanup time</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Filter conditions<br>When multiple conditions are used, Keywords and TimeBetween are intersected</p><li>Keywords: instance name, private IP, or public IP</li><li>TimeBetween: time range</li> 
     * @return Filters <p>Filter conditions<br>When multiple conditions are used, Keywords and TimeBetween are intersected</p><li>Keywords: instance name, private IP, or public IP</li><li>TimeBetween: time range</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions<br>When multiple conditions are used, Keywords and TimeBetween are intersected</p><li>Keywords: instance name, private IP, or public IP</li><li>TimeBetween: time range</li>
     * @param Filters <p>Filter conditions<br>When multiple conditions are used, Keywords and TimeBetween are intersected</p><li>Keywords: instance name, private IP, or public IP</li><li>TimeBetween: time range</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>The maximum number of entries. Default value: 10. Maximum value: 100.</p> 
     * @return Limit <p>The maximum number of entries. Default value: 10. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>The maximum number of entries. Default value: 10. Maximum value: 100.</p>
     * @param Limit <p>The maximum number of entries. Default value: 10. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sort order: ASC for ascending, DESC for descending. Default: ASC</p> 
     * @return Order <p>Sort order: ASC for ascending, DESC for descending. Default: ASC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sort order: ASC for ascending, DESC for descending. Default: ASC</p>
     * @param Order <p>Sort order: ASC for ascending, DESC for descending. Default: ASC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>AgentLastOfflineTime: Time when the client was last offline<br>AutoClearTime: Cleanup time</p> 
     * @return By <p>AgentLastOfflineTime: Time when the client was last offline<br>AutoClearTime: Cleanup time</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>AgentLastOfflineTime: Time when the client was last offline<br>AutoClearTime: Cleanup time</p>
     * @param By <p>AgentLastOfflineTime: Time when the client was last offline<br>AutoClearTime: Cleanup time</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeMachineClearHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineClearHistoryRequest(DescribeMachineClearHistoryRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
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

