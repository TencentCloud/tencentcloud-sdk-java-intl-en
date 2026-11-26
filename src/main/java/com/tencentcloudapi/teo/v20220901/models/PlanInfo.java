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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanInfo extends AbstractModel {

    /**
    * Settlement currency type. Valid values:
<li> CNY: settlement in RMB; </li>
<li> USD: Dollar settlement.</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Total traffic included in the package. This value is the sum of security acceleration traffic, content acceleration traffic, and smart acceleration traffic (unit: byte).
    */
    @SerializedName("Flux")
    @Expose
    private Long Flux;

    /**
    * Billing cycle. Valid values:
<li> y: settle by year; </li>
<li> m: monthly settlement;</li>
<li> h: settled by hour; </li>
<li> M: settle by minute;</li>
<li> s: settle by second. </li>
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * Package type. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan for Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan for global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan of the global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Global content delivery network (excluding Chinese mainland) enterprise package with bundled bot management;</li>
<li> ent_cm: Enterprise edition package for CDN in Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise package with bundled bot management in the Chinese mainland;</li>
<li> ent_global: global content delivery network (including Chinese mainland) enterprise package; </li>
<li> ent_global_with_bot: Global content delivery network (including Chinese mainland) enterprise package with bundled bot management.</li>
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * Package pricing (unit: cent).
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * Request count included in the package. This is the security acceleration request count. (Unit: count).
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
    * Number of sites that can be bound to the package.
    */
    @SerializedName("SiteNumber")
    @Expose
    private Long SiteNumber;

    /**
    * Acceleration region type of the package. Valid values:
<li>mainland: Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland);</li>
<li> global: worldwide (including Chinese mainland). </li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Settlement currency type. Valid values:
<li> CNY: settlement in RMB; </li>
<li> USD: Dollar settlement.</li> 
     * @return Currency Settlement currency type. Valid values:
<li> CNY: settlement in RMB; </li>
<li> USD: Dollar settlement.</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Settlement currency type. Valid values:
<li> CNY: settlement in RMB; </li>
<li> USD: Dollar settlement.</li>
     * @param Currency Settlement currency type. Valid values:
<li> CNY: settlement in RMB; </li>
<li> USD: Dollar settlement.</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Total traffic included in the package. This value is the sum of security acceleration traffic, content acceleration traffic, and smart acceleration traffic (unit: byte). 
     * @return Flux Total traffic included in the package. This value is the sum of security acceleration traffic, content acceleration traffic, and smart acceleration traffic (unit: byte).
     */
    public Long getFlux() {
        return this.Flux;
    }

    /**
     * Set Total traffic included in the package. This value is the sum of security acceleration traffic, content acceleration traffic, and smart acceleration traffic (unit: byte).
     * @param Flux Total traffic included in the package. This value is the sum of security acceleration traffic, content acceleration traffic, and smart acceleration traffic (unit: byte).
     */
    public void setFlux(Long Flux) {
        this.Flux = Flux;
    }

    /**
     * Get Billing cycle. Valid values:
<li> y: settle by year; </li>
<li> m: monthly settlement;</li>
<li> h: settled by hour; </li>
<li> M: settle by minute;</li>
<li> s: settle by second. </li> 
     * @return Frequency Billing cycle. Valid values:
<li> y: settle by year; </li>
<li> m: monthly settlement;</li>
<li> h: settled by hour; </li>
<li> M: settle by minute;</li>
<li> s: settle by second. </li>
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Billing cycle. Valid values:
<li> y: settle by year; </li>
<li> m: monthly settlement;</li>
<li> h: settled by hour; </li>
<li> M: settle by minute;</li>
<li> s: settle by second. </li>
     * @param Frequency Billing cycle. Valid values:
<li> y: settle by year; </li>
<li> m: monthly settlement;</li>
<li> h: settled by hour; </li>
<li> M: settle by minute;</li>
<li> s: settle by second. </li>
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Package type. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan for Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan for global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan of the global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Global content delivery network (excluding Chinese mainland) enterprise package with bundled bot management;</li>
<li> ent_cm: Enterprise edition package for CDN in Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise package with bundled bot management in the Chinese mainland;</li>
<li> ent_global: global content delivery network (including Chinese mainland) enterprise package; </li>
<li> ent_global_with_bot: Global content delivery network (including Chinese mainland) enterprise package with bundled bot management.</li> 
     * @return PlanType Package type. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan for Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan for global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan of the global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Global content delivery network (excluding Chinese mainland) enterprise package with bundled bot management;</li>
<li> ent_cm: Enterprise edition package for CDN in Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise package with bundled bot management in the Chinese mainland;</li>
<li> ent_global: global content delivery network (including Chinese mainland) enterprise package; </li>
<li> ent_global_with_bot: Global content delivery network (including Chinese mainland) enterprise package with bundled bot management.</li>
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set Package type. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan for Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan for global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan of the global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Global content delivery network (excluding Chinese mainland) enterprise package with bundled bot management;</li>
<li> ent_cm: Enterprise edition package for CDN in Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise package with bundled bot management in the Chinese mainland;</li>
<li> ent_global: global content delivery network (including Chinese mainland) enterprise package; </li>
<li> ent_global_with_bot: Global content delivery network (including Chinese mainland) enterprise package with bundled bot management.</li>
     * @param PlanType Package type. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan for Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan for global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan of the global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Global content delivery network (excluding Chinese mainland) enterprise package with bundled bot management;</li>
<li> ent_cm: Enterprise edition package for CDN in Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise package with bundled bot management in the Chinese mainland;</li>
<li> ent_global: global content delivery network (including Chinese mainland) enterprise package; </li>
<li> ent_global_with_bot: Global content delivery network (including Chinese mainland) enterprise package with bundled bot management.</li>
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get Package pricing (unit: cent). 
     * @return Price Package pricing (unit: cent).
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set Package pricing (unit: cent).
     * @param Price Package pricing (unit: cent).
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get Request count included in the package. This is the security acceleration request count. (Unit: count). 
     * @return Request Request count included in the package. This is the security acceleration request count. (Unit: count).
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set Request count included in the package. This is the security acceleration request count. (Unit: count).
     * @param Request Request count included in the package. This is the security acceleration request count. (Unit: count).
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    /**
     * Get Number of sites that can be bound to the package. 
     * @return SiteNumber Number of sites that can be bound to the package.
     */
    public Long getSiteNumber() {
        return this.SiteNumber;
    }

    /**
     * Set Number of sites that can be bound to the package.
     * @param SiteNumber Number of sites that can be bound to the package.
     */
    public void setSiteNumber(Long SiteNumber) {
        this.SiteNumber = SiteNumber;
    }

    /**
     * Get Acceleration region type of the package. Valid values:
<li>mainland: Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland);</li>
<li> global: worldwide (including Chinese mainland). </li> 
     * @return Area Acceleration region type of the package. Valid values:
<li>mainland: Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland);</li>
<li> global: worldwide (including Chinese mainland). </li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region type of the package. Valid values:
<li>mainland: Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland);</li>
<li> global: worldwide (including Chinese mainland). </li>
     * @param Area Acceleration region type of the package. Valid values:
<li>mainland: Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland);</li>
<li> global: worldwide (including Chinese mainland). </li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public PlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlanInfo(PlanInfo source) {
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.Flux != null) {
            this.Flux = new Long(source.Flux);
        }
        if (source.Frequency != null) {
            this.Frequency = new String(source.Frequency);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.Request != null) {
            this.Request = new Long(source.Request);
        }
        if (source.SiteNumber != null) {
            this.SiteNumber = new Long(source.SiteNumber);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "SiteNumber", this.SiteNumber);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

