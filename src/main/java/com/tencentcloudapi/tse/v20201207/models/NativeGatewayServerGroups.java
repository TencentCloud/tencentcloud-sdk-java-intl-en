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

public class NativeGatewayServerGroups extends AbstractModel {

    /**
    * Total number.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Group information array.
    */
    @SerializedName("GatewayGroupList")
    @Expose
    private NativeGatewayServerGroup [] GatewayGroupList;

    /**
     * Get Total number. 
     * @return TotalCount Total number.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number.
     * @param TotalCount Total number.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Group information array. 
     * @return GatewayGroupList Group information array.
     */
    public NativeGatewayServerGroup [] getGatewayGroupList() {
        return this.GatewayGroupList;
    }

    /**
     * Set Group information array.
     * @param GatewayGroupList Group information array.
     */
    public void setGatewayGroupList(NativeGatewayServerGroup [] GatewayGroupList) {
        this.GatewayGroupList = GatewayGroupList;
    }

    public NativeGatewayServerGroups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeGatewayServerGroups(NativeGatewayServerGroups source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.GatewayGroupList != null) {
            this.GatewayGroupList = new NativeGatewayServerGroup[source.GatewayGroupList.length];
            for (int i = 0; i < source.GatewayGroupList.length; i++) {
                this.GatewayGroupList[i] = new NativeGatewayServerGroup(source.GatewayGroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "GatewayGroupList.", this.GatewayGroupList);

    }
}

