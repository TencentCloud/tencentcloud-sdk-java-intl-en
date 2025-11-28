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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductSKU extends AbstractModel {

    /**
    * Specifies the product type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Specification code
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * TPS limit
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * Elastic TPS upper limit
    */
    @SerializedName("ScaledTpsLimit")
    @Expose
    private Long ScaledTpsLimit;

    /**
    * Default maximum number of topics.
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * Maximum number of consumer groups
    */
    @SerializedName("GroupNumLimit")
    @Expose
    private Long GroupNumLimit;

    /**
    * Default message retention time, in hours
    */
    @SerializedName("DefaultRetention")
    @Expose
    private Long DefaultRetention;

    /**
    * Adjustable maximum message retention time, in hours
    */
    @SerializedName("RetentionUpperLimit")
    @Expose
    private Long RetentionUpperLimit;

    /**
    * Adjustable minimum message retention time, in hours
    */
    @SerializedName("RetentionLowerLimit")
    @Expose
    private Long RetentionLowerLimit;

    /**
    * Maximum delayed message duration, in hours
    */
    @SerializedName("MaxMessageDelay")
    @Expose
    private Long MaxMessageDelay;

    /**
    * Whether it is purchasable
    */
    @SerializedName("OnSale")
    @Expose
    private Boolean OnSale;

    /**
    * Billing item information
    */
    @SerializedName("PriceTags")
    @Expose
    private PriceTag [] PriceTags;

    /**
    * Default maximum number of topics.
    */
    @SerializedName("TopicNumUpperLimit")
    @Expose
    private Long TopicNumUpperLimit;

    /**
     * Get Specifies the product type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition. 
     * @return InstanceType Specifies the product type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifies the product type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
     * @param InstanceType Specifies the product type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Specification code 
     * @return SkuCode Specification code
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Specification code
     * @param SkuCode Specification code
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get TPS limit 
     * @return TpsLimit TPS limit
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set TPS limit
     * @param TpsLimit TPS limit
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get Elastic TPS upper limit 
     * @return ScaledTpsLimit Elastic TPS upper limit
     */
    public Long getScaledTpsLimit() {
        return this.ScaledTpsLimit;
    }

    /**
     * Set Elastic TPS upper limit
     * @param ScaledTpsLimit Elastic TPS upper limit
     */
    public void setScaledTpsLimit(Long ScaledTpsLimit) {
        this.ScaledTpsLimit = ScaledTpsLimit;
    }

    /**
     * Get Default maximum number of topics. 
     * @return TopicNumLimit Default maximum number of topics.
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set Default maximum number of topics.
     * @param TopicNumLimit Default maximum number of topics.
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get Maximum number of consumer groups 
     * @return GroupNumLimit Maximum number of consumer groups
     */
    public Long getGroupNumLimit() {
        return this.GroupNumLimit;
    }

    /**
     * Set Maximum number of consumer groups
     * @param GroupNumLimit Maximum number of consumer groups
     */
    public void setGroupNumLimit(Long GroupNumLimit) {
        this.GroupNumLimit = GroupNumLimit;
    }

    /**
     * Get Default message retention time, in hours 
     * @return DefaultRetention Default message retention time, in hours
     */
    public Long getDefaultRetention() {
        return this.DefaultRetention;
    }

    /**
     * Set Default message retention time, in hours
     * @param DefaultRetention Default message retention time, in hours
     */
    public void setDefaultRetention(Long DefaultRetention) {
        this.DefaultRetention = DefaultRetention;
    }

    /**
     * Get Adjustable maximum message retention time, in hours 
     * @return RetentionUpperLimit Adjustable maximum message retention time, in hours
     */
    public Long getRetentionUpperLimit() {
        return this.RetentionUpperLimit;
    }

    /**
     * Set Adjustable maximum message retention time, in hours
     * @param RetentionUpperLimit Adjustable maximum message retention time, in hours
     */
    public void setRetentionUpperLimit(Long RetentionUpperLimit) {
        this.RetentionUpperLimit = RetentionUpperLimit;
    }

    /**
     * Get Adjustable minimum message retention time, in hours 
     * @return RetentionLowerLimit Adjustable minimum message retention time, in hours
     */
    public Long getRetentionLowerLimit() {
        return this.RetentionLowerLimit;
    }

    /**
     * Set Adjustable minimum message retention time, in hours
     * @param RetentionLowerLimit Adjustable minimum message retention time, in hours
     */
    public void setRetentionLowerLimit(Long RetentionLowerLimit) {
        this.RetentionLowerLimit = RetentionLowerLimit;
    }

    /**
     * Get Maximum delayed message duration, in hours 
     * @return MaxMessageDelay Maximum delayed message duration, in hours
     */
    public Long getMaxMessageDelay() {
        return this.MaxMessageDelay;
    }

    /**
     * Set Maximum delayed message duration, in hours
     * @param MaxMessageDelay Maximum delayed message duration, in hours
     */
    public void setMaxMessageDelay(Long MaxMessageDelay) {
        this.MaxMessageDelay = MaxMessageDelay;
    }

    /**
     * Get Whether it is purchasable 
     * @return OnSale Whether it is purchasable
     */
    public Boolean getOnSale() {
        return this.OnSale;
    }

    /**
     * Set Whether it is purchasable
     * @param OnSale Whether it is purchasable
     */
    public void setOnSale(Boolean OnSale) {
        this.OnSale = OnSale;
    }

    /**
     * Get Billing item information 
     * @return PriceTags Billing item information
     */
    public PriceTag [] getPriceTags() {
        return this.PriceTags;
    }

    /**
     * Set Billing item information
     * @param PriceTags Billing item information
     */
    public void setPriceTags(PriceTag [] PriceTags) {
        this.PriceTags = PriceTags;
    }

    /**
     * Get Default maximum number of topics. 
     * @return TopicNumUpperLimit Default maximum number of topics.
     */
    public Long getTopicNumUpperLimit() {
        return this.TopicNumUpperLimit;
    }

    /**
     * Set Default maximum number of topics.
     * @param TopicNumUpperLimit Default maximum number of topics.
     */
    public void setTopicNumUpperLimit(Long TopicNumUpperLimit) {
        this.TopicNumUpperLimit = TopicNumUpperLimit;
    }

    public ProductSKU() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductSKU(ProductSKU source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.ScaledTpsLimit != null) {
            this.ScaledTpsLimit = new Long(source.ScaledTpsLimit);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.GroupNumLimit != null) {
            this.GroupNumLimit = new Long(source.GroupNumLimit);
        }
        if (source.DefaultRetention != null) {
            this.DefaultRetention = new Long(source.DefaultRetention);
        }
        if (source.RetentionUpperLimit != null) {
            this.RetentionUpperLimit = new Long(source.RetentionUpperLimit);
        }
        if (source.RetentionLowerLimit != null) {
            this.RetentionLowerLimit = new Long(source.RetentionLowerLimit);
        }
        if (source.MaxMessageDelay != null) {
            this.MaxMessageDelay = new Long(source.MaxMessageDelay);
        }
        if (source.OnSale != null) {
            this.OnSale = new Boolean(source.OnSale);
        }
        if (source.PriceTags != null) {
            this.PriceTags = new PriceTag[source.PriceTags.length];
            for (int i = 0; i < source.PriceTags.length; i++) {
                this.PriceTags[i] = new PriceTag(source.PriceTags[i]);
            }
        }
        if (source.TopicNumUpperLimit != null) {
            this.TopicNumUpperLimit = new Long(source.TopicNumUpperLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "ScaledTpsLimit", this.ScaledTpsLimit);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "GroupNumLimit", this.GroupNumLimit);
        this.setParamSimple(map, prefix + "DefaultRetention", this.DefaultRetention);
        this.setParamSimple(map, prefix + "RetentionUpperLimit", this.RetentionUpperLimit);
        this.setParamSimple(map, prefix + "RetentionLowerLimit", this.RetentionLowerLimit);
        this.setParamSimple(map, prefix + "MaxMessageDelay", this.MaxMessageDelay);
        this.setParamSimple(map, prefix + "OnSale", this.OnSale);
        this.setParamArrayObj(map, prefix + "PriceTags.", this.PriceTags);
        this.setParamSimple(map, prefix + "TopicNumUpperLimit", this.TopicNumUpperLimit);

    }
}

