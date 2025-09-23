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

public class CreateAlarmRequest extends AbstractModel {

    /**
    * Alarm rule name. specifies the name of the Alarm rule.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * Alert metrics 1: quota usage 2: quota usage rate 3: remaining quota 4: remaining quota rate.
    */
    @SerializedName("Metrics")
    @Expose
    private Long Metrics;

    /**
    * Specifies the Alarm threshold. value range: 0-100.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Alarm frequency.
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    *   Member UIN
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
     * Get Alarm rule name. specifies the name of the Alarm rule. 
     * @return Name Alarm rule name. specifies the name of the Alarm rule.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm rule name. specifies the name of the Alarm rule.
     * @param Name Alarm rule name. specifies the name of the Alarm rule.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Alert metrics 1: quota usage 2: quota usage rate 3: remaining quota 4: remaining quota rate. 
     * @return Metrics Alert metrics 1: quota usage 2: quota usage rate 3: remaining quota 4: remaining quota rate.
     */
    public Long getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Alert metrics 1: quota usage 2: quota usage rate 3: remaining quota 4: remaining quota rate.
     * @param Metrics Alert metrics 1: quota usage 2: quota usage rate 3: remaining quota 4: remaining quota rate.
     */
    public void setMetrics(Long Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Specifies the Alarm threshold. value range: 0-100. 
     * @return Threshold Specifies the Alarm threshold. value range: 0-100.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Specifies the Alarm threshold. value range: 0-100.
     * @param Threshold Specifies the Alarm threshold. value range: 0-100.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Alarm frequency. 
     * @return Frequency Alarm frequency.
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Alarm frequency.
     * @param Frequency Alarm frequency.
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get   Member UIN 
     * @return MemberUin   Member UIN
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set   Member UIN
     * @param MemberUin   Member UIN
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    public CreateAlarmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmRequest(CreateAlarmRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.QuotaId != null) {
            this.QuotaId = new Long(source.QuotaId);
        }
        if (source.Metrics != null) {
            this.Metrics = new Long(source.Metrics);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);

    }
}

