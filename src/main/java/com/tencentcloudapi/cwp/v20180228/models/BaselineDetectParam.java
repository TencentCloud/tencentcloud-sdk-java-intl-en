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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineDetectParam extends AbstractModel {

    /**
    * Collection of check policies
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * Collection of check rules
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * Collection of check items
    */
    @SerializedName("ItemIds")
    @Expose
    private Long [] ItemIds;

    /**
    * Collection of checked server IDs
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
     * Get Collection of check policies 
     * @return PolicyIds Collection of check policies
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set Collection of check policies
     * @param PolicyIds Collection of check policies
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get Collection of check rules 
     * @return RuleIds Collection of check rules
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set Collection of check rules
     * @param RuleIds Collection of check rules
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get Collection of check items 
     * @return ItemIds Collection of check items
     */
    public Long [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set Collection of check items
     * @param ItemIds Collection of check items
     */
    public void setItemIds(Long [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    /**
     * Get Collection of checked server IDs 
     * @return HostIds Collection of checked server IDs
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set Collection of checked server IDs
     * @param HostIds Collection of checked server IDs
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    public BaselineDetectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineDetectParam(BaselineDetectParam source) {
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.ItemIds != null) {
            this.ItemIds = new Long[source.ItemIds.length];
            for (int i = 0; i < source.ItemIds.length; i++) {
                this.ItemIds[i] = new Long(source.ItemIds[i]);
            }
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);

    }
}

