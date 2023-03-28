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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceInfoNew extends AbstractModel{

    /**
    * The domain suffix, such as `.com`.
    */
    @SerializedName("Tld")
    @Expose
    private String Tld;

    /**
    * The purchase years. Value range: [1-10]
    */
    @SerializedName("Year")
    @Expose
    private Long Year;

    /**
    * The original price of the domain.
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * The current price of the domain.
    */
    @SerializedName("RealPrice")
    @Expose
    private Float RealPrice;

    /**
    * The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * The title.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get The domain suffix, such as `.com`. 
     * @return Tld The domain suffix, such as `.com`.
     */
    public String getTld() {
        return this.Tld;
    }

    /**
     * Set The domain suffix, such as `.com`.
     * @param Tld The domain suffix, such as `.com`.
     */
    public void setTld(String Tld) {
        this.Tld = Tld;
    }

    /**
     * Get The purchase years. Value range: [1-10] 
     * @return Year The purchase years. Value range: [1-10]
     */
    public Long getYear() {
        return this.Year;
    }

    /**
     * Set The purchase years. Value range: [1-10]
     * @param Year The purchase years. Value range: [1-10]
     */
    public void setYear(Long Year) {
        this.Year = Year;
    }

    /**
     * Get The original price of the domain. 
     * @return Price The original price of the domain.
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set The original price of the domain.
     * @param Price The original price of the domain.
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get The current price of the domain. 
     * @return RealPrice The current price of the domain.
     */
    public Float getRealPrice() {
        return this.RealPrice;
    }

    /**
     * Set The current price of the domain.
     * @param RealPrice The current price of the domain.
     */
    public void setRealPrice(Float RealPrice) {
        this.RealPrice = RealPrice;
    }

    /**
     * Get The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in). 
     * @return Operation The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
     * @param Operation The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get The title.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Title The title.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set The title.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Title The title.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public PriceInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceInfoNew(PriceInfoNew source) {
        if (source.Tld != null) {
            this.Tld = new String(source.Tld);
        }
        if (source.Year != null) {
            this.Year = new Long(source.Year);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.RealPrice != null) {
            this.RealPrice = new Float(source.RealPrice);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tld", this.Tld);
        this.setParamSimple(map, prefix + "Year", this.Year);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RealPrice", this.RealPrice);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

