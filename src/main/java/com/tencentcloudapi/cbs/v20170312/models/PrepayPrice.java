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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrepayPrice extends AbstractModel{

    /**
    * Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY). 
     * @return OriginalPrice Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     * @param OriginalPrice Original price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY). 
     * @return DiscountPrice Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     * @param DiscountPrice Discount price of the advanced payment for a prepaid cloud disk or snapshot (in CNY).
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

