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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCloudNativeAPIGatewayStrategyResult extends AbstractModel {

    /**
    * Total quantity.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Cloud Native API gateway instance policy list.
    */
    @SerializedName("StrategyList")
    @Expose
    private CloudNativeAPIGatewayStrategy [] StrategyList;

    /**
     * Get Total quantity. 
     * @return TotalCount Total quantity.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total quantity.
     * @param TotalCount Total quantity.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Cloud Native API gateway instance policy list. 
     * @return StrategyList Cloud Native API gateway instance policy list.
     */
    public CloudNativeAPIGatewayStrategy [] getStrategyList() {
        return this.StrategyList;
    }

    /**
     * Set Cloud Native API gateway instance policy list.
     * @param StrategyList Cloud Native API gateway instance policy list.
     */
    public void setStrategyList(CloudNativeAPIGatewayStrategy [] StrategyList) {
        this.StrategyList = StrategyList;
    }

    public ListCloudNativeAPIGatewayStrategyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCloudNativeAPIGatewayStrategyResult(ListCloudNativeAPIGatewayStrategyResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StrategyList != null) {
            this.StrategyList = new CloudNativeAPIGatewayStrategy[source.StrategyList.length];
            for (int i = 0; i < source.StrategyList.length; i++) {
                this.StrategyList[i] = new CloudNativeAPIGatewayStrategy(source.StrategyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "StrategyList.", this.StrategyList);

    }
}

