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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpstreamBindApis extends AbstractModel{

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of bound APIs
    */
    @SerializedName("BindApiSet")
    @Expose
    private BindApiInfo [] BindApiSet;

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of bound APIs 
     * @return BindApiSet Information of bound APIs
     */
    public BindApiInfo [] getBindApiSet() {
        return this.BindApiSet;
    }

    /**
     * Set Information of bound APIs
     * @param BindApiSet Information of bound APIs
     */
    public void setBindApiSet(BindApiInfo [] BindApiSet) {
        this.BindApiSet = BindApiSet;
    }

    public DescribeUpstreamBindApis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpstreamBindApis(DescribeUpstreamBindApis source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BindApiSet != null) {
            this.BindApiSet = new BindApiInfo[source.BindApiSet.length];
            for (int i = 0; i < source.BindApiSet.length; i++) {
                this.BindApiSet[i] = new BindApiInfo(source.BindApiSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "BindApiSet.", this.BindApiSet);

    }
}

