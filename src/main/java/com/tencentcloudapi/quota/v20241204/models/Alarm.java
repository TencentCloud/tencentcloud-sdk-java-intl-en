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

public class Alarm extends AbstractModel {

    /**
    * Alarm rule ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Alarm rule name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Product ID
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
    * Alarm condition.
    */
    @SerializedName("Metrics")
    @Expose
    private Long Metrics;

    /**
    * Alarm frequency.
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * Specifies the Alarm threshold. valid values: 0-100.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Creator UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Specifies the uin of the rule owner.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Specifies the quota name.
    */
    @SerializedName("QuotaName")
    @Expose
    private String QuotaName;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Whether to delete. 1: not deleted.
2: delete.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Alarm rule ID. 
     * @return Id Alarm rule ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Alarm rule ID.
     * @param Id Alarm rule ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Alarm rule name. 
     * @return Name Alarm rule name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm rule name.
     * @param Name Alarm rule name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Product ID 
     * @return ProductId Product ID
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID
     * @param ProductId Product ID
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
     * Get Alarm condition. 
     * @return Metrics Alarm condition.
     */
    public Long getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Alarm condition.
     * @param Metrics Alarm condition.
     */
    public void setMetrics(Long Metrics) {
        this.Metrics = Metrics;
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
     * Get Specifies the Alarm threshold. valid values: 0-100. 
     * @return Threshold Specifies the Alarm threshold. valid values: 0-100.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Specifies the Alarm threshold. valid values: 0-100.
     * @param Threshold Specifies the Alarm threshold. valid values: 0-100.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Creator UIN 
     * @return OwnerUin Creator UIN
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Creator UIN
     * @param OwnerUin Creator UIN
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Specifies the uin of the rule owner. 
     * @return MemberUin Specifies the uin of the rule owner.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Specifies the uin of the rule owner.
     * @param MemberUin Specifies the uin of the rule owner.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Specifies the quota name. 
     * @return QuotaName Specifies the quota name.
     */
    public String getQuotaName() {
        return this.QuotaName;
    }

    /**
     * Set Specifies the quota name.
     * @param QuotaName Specifies the quota name.
     */
    public void setQuotaName(String QuotaName) {
        this.QuotaName = QuotaName;
    }

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Whether to delete. 1: not deleted.
2: delete. 
     * @return Status Whether to delete. 1: not deleted.
2: delete.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to delete. 1: not deleted.
2: delete.
     * @param Status Whether to delete. 1: not deleted.
2: delete.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public Alarm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Alarm(Alarm source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
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
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.QuotaName != null) {
            this.QuotaName = new String(source.QuotaName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "QuotaName", this.QuotaName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

