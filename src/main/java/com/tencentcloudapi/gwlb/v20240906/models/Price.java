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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price extends AbstractModel {

    /**
    * It describes the instance price.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * It describes the price of GLCU.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LcuPrice")
    @Expose
    private ItemPrice LcuPrice;

    /**
     * Get It describes the instance price.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstancePrice It describes the instance price.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set It describes the instance price.Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstancePrice It describes the instance price.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get It describes the price of GLCU.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LcuPrice It describes the price of GLCU.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ItemPrice getLcuPrice() {
        return this.LcuPrice;
    }

    /**
     * Set It describes the price of GLCU.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LcuPrice It describes the price of GLCU.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLcuPrice(ItemPrice LcuPrice) {
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
            this.InstancePrice = new ItemPrice(source.InstancePrice);
        }
        if (source.LcuPrice != null) {
            this.LcuPrice = new ItemPrice(source.LcuPrice);
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

