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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Merchant extends AbstractModel {

    /**
    * <p>The ID of the merchant</p>
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * <p>The name of the merchant</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Merchant registration time</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601</p>
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * <p>Merchant category code</p><p>Parameter format: 4-digit No. compliant with ISO 18245</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>The phone number of the merchant</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>The email of the merchant</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>The url of the merchant shop on the website</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>The address of the merchant</p>
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * <p>The level of the merchant</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>The type of the merchant</p><p>Enumeration value:</p><ul><li>person: Person</li><li>company: Company</li></ul>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>The volume of goods on sale of the merchant</p>
    */
    @SerializedName("GoodsQuantity")
    @Expose
    private Long GoodsQuantity;

    /**
    * <p>The historical sales volume of the merchant</p>
    */
    @SerializedName("HistoricSalesQuantity")
    @Expose
    private Long HistoricSalesQuantity;

    /**
    * <p>The historical sales amount of the merchant</p>
    */
    @SerializedName("HistoricSalesAmount")
    @Expose
    private Amount HistoricSalesAmount;

    /**
     * Get <p>The ID of the merchant</p> 
     * @return MerchantId <p>The ID of the merchant</p>
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set <p>The ID of the merchant</p>
     * @param MerchantId <p>The ID of the merchant</p>
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get <p>The name of the merchant</p> 
     * @return Name <p>The name of the merchant</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>The name of the merchant</p>
     * @param Name <p>The name of the merchant</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Merchant registration time</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601</p> 
     * @return RegisterTime <p>Merchant registration time</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601</p>
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set <p>Merchant registration time</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601</p>
     * @param RegisterTime <p>Merchant registration time</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601</p>
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get <p>Merchant category code</p><p>Parameter format: 4-digit No. compliant with ISO 18245</p> 
     * @return Category <p>Merchant category code</p><p>Parameter format: 4-digit No. compliant with ISO 18245</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Merchant category code</p><p>Parameter format: 4-digit No. compliant with ISO 18245</p>
     * @param Category <p>Merchant category code</p><p>Parameter format: 4-digit No. compliant with ISO 18245</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>The phone number of the merchant</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p> 
     * @return Phone <p>The phone number of the merchant</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>The phone number of the merchant</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
     * @param Phone <p>The phone number of the merchant</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>The email of the merchant</p> 
     * @return Email <p>The email of the merchant</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>The email of the merchant</p>
     * @param Email <p>The email of the merchant</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>The url of the merchant shop on the website</p> 
     * @return URL <p>The url of the merchant shop on the website</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>The url of the merchant shop on the website</p>
     * @param URL <p>The url of the merchant shop on the website</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>The address of the merchant</p> 
     * @return Address <p>The address of the merchant</p>
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set <p>The address of the merchant</p>
     * @param Address <p>The address of the merchant</p>
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get <p>The level of the merchant</p> 
     * @return Level <p>The level of the merchant</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>The level of the merchant</p>
     * @param Level <p>The level of the merchant</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>The type of the merchant</p><p>Enumeration value:</p><ul><li>person: Person</li><li>company: Company</li></ul> 
     * @return BusinessType <p>The type of the merchant</p><p>Enumeration value:</p><ul><li>person: Person</li><li>company: Company</li></ul>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>The type of the merchant</p><p>Enumeration value:</p><ul><li>person: Person</li><li>company: Company</li></ul>
     * @param BusinessType <p>The type of the merchant</p><p>Enumeration value:</p><ul><li>person: Person</li><li>company: Company</li></ul>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>The volume of goods on sale of the merchant</p> 
     * @return GoodsQuantity <p>The volume of goods on sale of the merchant</p>
     */
    public Long getGoodsQuantity() {
        return this.GoodsQuantity;
    }

    /**
     * Set <p>The volume of goods on sale of the merchant</p>
     * @param GoodsQuantity <p>The volume of goods on sale of the merchant</p>
     */
    public void setGoodsQuantity(Long GoodsQuantity) {
        this.GoodsQuantity = GoodsQuantity;
    }

    /**
     * Get <p>The historical sales volume of the merchant</p> 
     * @return HistoricSalesQuantity <p>The historical sales volume of the merchant</p>
     */
    public Long getHistoricSalesQuantity() {
        return this.HistoricSalesQuantity;
    }

    /**
     * Set <p>The historical sales volume of the merchant</p>
     * @param HistoricSalesQuantity <p>The historical sales volume of the merchant</p>
     */
    public void setHistoricSalesQuantity(Long HistoricSalesQuantity) {
        this.HistoricSalesQuantity = HistoricSalesQuantity;
    }

    /**
     * Get <p>The historical sales amount of the merchant</p> 
     * @return HistoricSalesAmount <p>The historical sales amount of the merchant</p>
     */
    public Amount getHistoricSalesAmount() {
        return this.HistoricSalesAmount;
    }

    /**
     * Set <p>The historical sales amount of the merchant</p>
     * @param HistoricSalesAmount <p>The historical sales amount of the merchant</p>
     */
    public void setHistoricSalesAmount(Amount HistoricSalesAmount) {
        this.HistoricSalesAmount = HistoricSalesAmount;
    }

    public Merchant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Merchant(Merchant source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RegisterTime != null) {
            this.RegisterTime = new String(source.RegisterTime);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.GoodsQuantity != null) {
            this.GoodsQuantity = new Long(source.GoodsQuantity);
        }
        if (source.HistoricSalesQuantity != null) {
            this.HistoricSalesQuantity = new Long(source.HistoricSalesQuantity);
        }
        if (source.HistoricSalesAmount != null) {
            this.HistoricSalesAmount = new Amount(source.HistoricSalesAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "GoodsQuantity", this.GoodsQuantity);
        this.setParamSimple(map, prefix + "HistoricSalesQuantity", this.HistoricSalesQuantity);
        this.setParamObj(map, prefix + "HistoricSalesAmount.", this.HistoricSalesAmount);

    }
}

