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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealData extends AbstractModel {

    /**
    * Order Number List: the number of elements matches the number of elements in the Goods array of the request package. Product details correspond to orders in sequence
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * Large Order Number, a large order number can have multiple sub-orders, indicating the same order placement [{},{}]
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
     * Get Order Number List: the number of elements matches the number of elements in the Goods array of the request package. Product details correspond to orders in sequence 
     * @return DealNames Order Number List: the number of elements matches the number of elements in the Goods array of the request package. Product details correspond to orders in sequence
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set Order Number List: the number of elements matches the number of elements in the Goods array of the request package. Product details correspond to orders in sequence
     * @param DealNames Order Number List: the number of elements matches the number of elements in the Goods array of the request package. Product details correspond to orders in sequence
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get Large Order Number, a large order number can have multiple sub-orders, indicating the same order placement [{},{}] 
     * @return BigDealId Large Order Number, a large order number can have multiple sub-orders, indicating the same order placement [{},{}]
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set Large Order Number, a large order number can have multiple sub-orders, indicating the same order placement [{},{}]
     * @param BigDealId Large Order Number, a large order number can have multiple sub-orders, indicating the same order placement [{},{}]
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    public DealData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealData(DealData source) {
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);

    }
}

