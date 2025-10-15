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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrateTaskRequest extends AbstractModel {

    /**
    * Large order id. must choose between large order id and sub-order id.
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * Order list
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * Get Large order id. must choose between large order id and sub-order id. 
     * @return BigDealId Large order id. must choose between large order id and sub-order id.
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set Large order id. must choose between large order id and sub-order id.
     * @param BigDealId Large order id. must choose between large order id and sub-order id.
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get Order list 
     * @return DealNames Order list
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set Order list
     * @param DealNames Order list
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    public DescribeIntegrateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrateTaskRequest(DescribeIntegrateTaskRequest source) {
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

