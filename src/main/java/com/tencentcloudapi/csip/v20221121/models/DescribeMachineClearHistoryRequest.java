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

public class DescribeMachineClearHistoryRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filtering criteriaWhen multiple filtering criteria are used, Keywords and Time interval take the intersection. Keywords: instance name/private network/public IP address. Time interval: time interval</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilters [] Filters;

    /**
    * <p>Limit entries. Default: 10. Maximum: 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Ascending order: ASC; descending order: DESC; ASC by default</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>AgentLastOfflineTime Client's last offline timeAutoClearTime Clearing time</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Filtering criteriaWhen multiple filtering criteria are used, Keywords and Time interval take the intersection. Keywords: instance name/private network/public IP address. Time interval: time interval</p> 
     * @return Filters <p>Filtering criteriaWhen multiple filtering criteria are used, Keywords and Time interval take the intersection. Keywords: instance name/private network/public IP address. Time interval: time interval</p>
     */
    public EDRFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filtering criteriaWhen multiple filtering criteria are used, Keywords and Time interval take the intersection. Keywords: instance name/private network/public IP address. Time interval: time interval</p>
     * @param Filters <p>Filtering criteriaWhen multiple filtering criteria are used, Keywords and Time interval take the intersection. Keywords: instance name/private network/public IP address. Time interval: time interval</p>
     */
    public void setFilters(EDRFilters [] Filters) {
        this.Filters = Filters;
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
     * Get <p>Ascending order: ASC; descending order: DESC; ASC by default</p> 
     * @return Order <p>Ascending order: ASC; descending order: DESC; ASC by default</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Ascending order: ASC; descending order: DESC; ASC by default</p>
     * @param Order <p>Ascending order: ASC; descending order: DESC; ASC by default</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>AgentLastOfflineTime Client's last offline timeAutoClearTime Clearing time</p> 
     * @return By <p>AgentLastOfflineTime Client's last offline timeAutoClearTime Clearing time</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>AgentLastOfflineTime Client's last offline timeAutoClearTime Clearing time</p>
     * @param By <p>AgentLastOfflineTime Client's last offline timeAutoClearTime Clearing time</p>
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
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilters(source.Filters[i]);
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

