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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDealDetailRequest extends AbstractModel {

    /**
    * Array of order transaction IDs, i.e., the `DealId` output parameter of the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
    */
    @SerializedName("DealIds")
    @Expose
    private String [] DealIds;

    /**
     * Get Array of order transaction IDs, i.e., the `DealId` output parameter of the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API. 
     * @return DealIds Array of order transaction IDs, i.e., the `DealId` output parameter of the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
     */
    public String [] getDealIds() {
        return this.DealIds;
    }

    /**
     * Set Array of order transaction IDs, i.e., the `DealId` output parameter of the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
     * @param DealIds Array of order transaction IDs, i.e., the `DealId` output parameter of the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
     */
    public void setDealIds(String [] DealIds) {
        this.DealIds = DealIds;
    }

    public DescribeInstanceDealDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceDealDetailRequest(DescribeInstanceDealDetailRequest source) {
        if (source.DealIds != null) {
            this.DealIds = new String[source.DealIds.length];
            for (int i = 0; i < source.DealIds.length; i++) {
                this.DealIds[i] = new String(source.DealIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealIds.", this.DealIds);

    }
}

