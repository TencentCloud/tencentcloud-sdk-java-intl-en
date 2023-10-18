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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedPluginSummary extends AbstractModel {

    /**
    * Total number of bound plug-ins
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of bound plug-ins
    */
    @SerializedName("PluginSummary")
    @Expose
    private AttachedPluginInfo [] PluginSummary;

    /**
     * Get Total number of bound plug-ins 
     * @return TotalCount Total number of bound plug-ins
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of bound plug-ins
     * @param TotalCount Total number of bound plug-ins
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of bound plug-ins 
     * @return PluginSummary Information of bound plug-ins
     */
    public AttachedPluginInfo [] getPluginSummary() {
        return this.PluginSummary;
    }

    /**
     * Set Information of bound plug-ins
     * @param PluginSummary Information of bound plug-ins
     */
    public void setPluginSummary(AttachedPluginInfo [] PluginSummary) {
        this.PluginSummary = PluginSummary;
    }

    public AttachedPluginSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedPluginSummary(AttachedPluginSummary source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PluginSummary != null) {
            this.PluginSummary = new AttachedPluginInfo[source.PluginSummary.length];
            for (int i = 0; i < source.PluginSummary.length; i++) {
                this.PluginSummary[i] = new AttachedPluginInfo(source.PluginSummary[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PluginSummary.", this.PluginSummary);

    }
}

