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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralSKU extends AbstractModel {

    /**
    * Specification flag
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * available for sale
    */
    @SerializedName("OnSale")
    @Expose
    private Boolean OnSale;

    /**
    * TPS limit
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * Number of topics free quota
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * Number of topics cap
    */
    @SerializedName("TopicNumUpperLimit")
    @Expose
    private Long TopicNumUpperLimit;

    /**
    * Billing item information
    */
    @SerializedName("PriceTags")
    @Expose
    private PriceTag [] PriceTags;

    /**
    * Number of storage nodes
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
     * Get Specification flag 
     * @return SkuCode Specification flag
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Specification flag
     * @param SkuCode Specification flag
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get available for sale 
     * @return OnSale available for sale
     */
    public Boolean getOnSale() {
        return this.OnSale;
    }

    /**
     * Set available for sale
     * @param OnSale available for sale
     */
    public void setOnSale(Boolean OnSale) {
        this.OnSale = OnSale;
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
     * Get Number of topics free quota 
     * @return TopicNumLimit Number of topics free quota
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set Number of topics free quota
     * @param TopicNumLimit Number of topics free quota
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get Number of topics cap 
     * @return TopicNumUpperLimit Number of topics cap
     */
    public Long getTopicNumUpperLimit() {
        return this.TopicNumUpperLimit;
    }

    /**
     * Set Number of topics cap
     * @param TopicNumUpperLimit Number of topics cap
     */
    public void setTopicNumUpperLimit(Long TopicNumUpperLimit) {
        this.TopicNumUpperLimit = TopicNumUpperLimit;
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
     * Get Number of storage nodes 
     * @return NodeCount Number of storage nodes
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of storage nodes
     * @param NodeCount Number of storage nodes
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    public GeneralSKU() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralSKU(GeneralSKU source) {
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.OnSale != null) {
            this.OnSale = new Boolean(source.OnSale);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.TopicNumUpperLimit != null) {
            this.TopicNumUpperLimit = new Long(source.TopicNumUpperLimit);
        }
        if (source.PriceTags != null) {
            this.PriceTags = new PriceTag[source.PriceTags.length];
            for (int i = 0; i < source.PriceTags.length; i++) {
                this.PriceTags[i] = new PriceTag(source.PriceTags[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "OnSale", this.OnSale);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "TopicNumUpperLimit", this.TopicNumUpperLimit);
        this.setParamArrayObj(map, prefix + "PriceTags.", this.PriceTags);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);

    }
}

