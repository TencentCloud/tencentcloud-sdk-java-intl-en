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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * Describes instance pricing. Unit: CNY/hour.
    */
    @SerializedName("InstancePrice")
    @Expose
    private PostPayPriceInfo InstancePrice;

    /**
    * Describes the lcu price. Unit: CNY/lcu.
    */
    @SerializedName("LcuPrice")
    @Expose
    private PostPayPriceInfo LcuPrice;

    /**
     * Get Describes instance pricing. Unit: CNY/hour. 
     * @return InstancePrice Describes instance pricing. Unit: CNY/hour.
     */
    public PostPayPriceInfo getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set Describes instance pricing. Unit: CNY/hour.
     * @param InstancePrice Describes instance pricing. Unit: CNY/hour.
     */
    public void setInstancePrice(PostPayPriceInfo InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get Describes the lcu price. Unit: CNY/lcu. 
     * @return LcuPrice Describes the lcu price. Unit: CNY/lcu.
     */
    public PostPayPriceInfo getLcuPrice() {
        return this.LcuPrice;
    }

    /**
     * Set Describes the lcu price. Unit: CNY/lcu.
     * @param LcuPrice Describes the lcu price. Unit: CNY/lcu.
     */
    public void setLcuPrice(PostPayPriceInfo LcuPrice) {
        this.LcuPrice = LcuPrice;
    }

    public Price() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Price(Price source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new PostPayPriceInfo(source.InstancePrice);
        }
        if (source.LcuPrice != null) {
            this.LcuPrice = new PostPayPriceInfo(source.LcuPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "LcuPrice.", this.LcuPrice);

    }
}

