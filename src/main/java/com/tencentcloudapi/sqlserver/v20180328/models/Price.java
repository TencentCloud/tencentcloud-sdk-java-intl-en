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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * 
    */
    @SerializedName("PrepaidPrice")
    @Expose
    private Long PrepaidPrice;

    /**
    * 
    */
    @SerializedName("PrepaidPriceUnit")
    @Expose
    private String PrepaidPriceUnit;

    /**
    * 
    */
    @SerializedName("PostpaidPrice")
    @Expose
    private Long PostpaidPrice;

    /**
    * 
    */
    @SerializedName("PostpaidPriceUnit")
    @Expose
    private String PostpaidPriceUnit;

    /**
     * Get  
     * @return PrepaidPrice 
     */
    public Long getPrepaidPrice() {
        return this.PrepaidPrice;
    }

    /**
     * Set 
     * @param PrepaidPrice 
     */
    public void setPrepaidPrice(Long PrepaidPrice) {
        this.PrepaidPrice = PrepaidPrice;
    }

    /**
     * Get  
     * @return PrepaidPriceUnit 
     */
    public String getPrepaidPriceUnit() {
        return this.PrepaidPriceUnit;
    }

    /**
     * Set 
     * @param PrepaidPriceUnit 
     */
    public void setPrepaidPriceUnit(String PrepaidPriceUnit) {
        this.PrepaidPriceUnit = PrepaidPriceUnit;
    }

    /**
     * Get  
     * @return PostpaidPrice 
     */
    public Long getPostpaidPrice() {
        return this.PostpaidPrice;
    }

    /**
     * Set 
     * @param PostpaidPrice 
     */
    public void setPostpaidPrice(Long PostpaidPrice) {
        this.PostpaidPrice = PostpaidPrice;
    }

    /**
     * Get  
     * @return PostpaidPriceUnit 
     */
    public String getPostpaidPriceUnit() {
        return this.PostpaidPriceUnit;
    }

    /**
     * Set 
     * @param PostpaidPriceUnit 
     */
    public void setPostpaidPriceUnit(String PostpaidPriceUnit) {
        this.PostpaidPriceUnit = PostpaidPriceUnit;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.PrepaidPrice != null) {
            this.PrepaidPrice = new Long(source.PrepaidPrice);
        }
        if (source.PrepaidPriceUnit != null) {
            this.PrepaidPriceUnit = new String(source.PrepaidPriceUnit);
        }
        if (source.PostpaidPrice != null) {
            this.PostpaidPrice = new Long(source.PostpaidPrice);
        }
        if (source.PostpaidPriceUnit != null) {
            this.PostpaidPriceUnit = new String(source.PostpaidPriceUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrepaidPrice", this.PrepaidPrice);
        this.setParamSimple(map, prefix + "PrepaidPriceUnit", this.PrepaidPriceUnit);
        this.setParamSimple(map, prefix + "PostpaidPrice", this.PostpaidPrice);
        this.setParamSimple(map, prefix + "PostpaidPriceUnit", this.PostpaidPriceUnit);

    }
}

