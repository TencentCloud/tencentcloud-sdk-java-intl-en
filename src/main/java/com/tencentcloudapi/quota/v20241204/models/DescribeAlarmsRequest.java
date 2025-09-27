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
package com.tencentcloudapi.quota.v20241204.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmsRequest extends AbstractModel {

    /**
    * Number of items per page. maximum 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Product ID.
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Quota ID.
    */
    @SerializedName("QuotaId")
    @Expose
    private Long QuotaId;

    /**
    * Alarm, quota name.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Member uins.
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * AlAlarm metric.
    */
    @SerializedName("Metrics")
    @Expose
    private Long Metrics;

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Number of items per page. maximum 100. 
     * @return Limit Number of items per page. maximum 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. maximum 100.
     * @param Limit Number of items per page. maximum 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Product ID. 
     * @return ProductId Product ID.
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID.
     * @param ProductId Product ID.
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Quota ID. 
     * @return QuotaId Quota ID.
     */
    public Long getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set Quota ID.
     * @param QuotaId Quota ID.
     */
    public void setQuotaId(Long QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get Alarm, quota name. 
     * @return Content Alarm, quota name.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Alarm, quota name.
     * @param Content Alarm, quota name.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Member uins. 
     * @return MemberUins Member uins.
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set Member uins.
     * @param MemberUins Member uins.
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get AlAlarm metric. 
     * @return Metrics AlAlarm metric.
     */
    public Long getMetrics() {
        return this.Metrics;
    }

    /**
     * Set AlAlarm metric.
     * @param Metrics AlAlarm metric.
     */
    public void setMetrics(Long Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public DescribeAlarmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmsRequest(DescribeAlarmsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.QuotaId != null) {
            this.QuotaId = new Long(source.QuotaId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.Metrics != null) {
            this.Metrics = new Long(source.Metrics);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

