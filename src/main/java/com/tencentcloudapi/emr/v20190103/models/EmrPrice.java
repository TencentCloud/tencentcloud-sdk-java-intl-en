/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrPrice extends AbstractModel {

    /**
    * The published price.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * The discounted price.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountCost")
    @Expose
    private String DiscountCost;

    /**
    * The unit of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * The queried spec.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PriceSpec")
    @Expose
    private PriceResource PriceSpec;

    /**
    * Whether spot instances are supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportSpotPaid")
    @Expose
    private Boolean SupportSpotPaid;

    /**
     * Get The published price.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost The published price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set The published price.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost The published price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get The discounted price.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiscountCost The discounted price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set The discounted price.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiscountCost The discounted price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscountCost(String DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get The unit of the billable item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Unit The unit of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set The unit of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Unit The unit of the billable item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get The queried spec.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PriceSpec The queried spec.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PriceResource getPriceSpec() {
        return this.PriceSpec;
    }

    /**
     * Set The queried spec.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PriceSpec The queried spec.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPriceSpec(PriceResource PriceSpec) {
        this.PriceSpec = PriceSpec;
    }

    /**
     * Get Whether spot instances are supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportSpotPaid Whether spot instances are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportSpotPaid() {
        return this.SupportSpotPaid;
    }

    /**
     * Set Whether spot instances are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportSpotPaid Whether spot instances are supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportSpotPaid(Boolean SupportSpotPaid) {
        this.SupportSpotPaid = SupportSpotPaid;
    }

    public EmrPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrPrice(EmrPrice source) {
        if (source.OriginalCost != null) {
            this.OriginalCost = new String(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new String(source.DiscountCost);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.PriceSpec != null) {
            this.PriceSpec = new PriceResource(source.PriceSpec);
        }
        if (source.SupportSpotPaid != null) {
            this.SupportSpotPaid = new Boolean(source.SupportSpotPaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamObj(map, prefix + "PriceSpec.", this.PriceSpec);
        this.setParamSimple(map, prefix + "SupportSpotPaid", this.SupportSpotPaid);

    }
}

