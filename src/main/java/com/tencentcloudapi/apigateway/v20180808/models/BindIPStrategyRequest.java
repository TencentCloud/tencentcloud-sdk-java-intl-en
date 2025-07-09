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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindIPStrategyRequest extends AbstractModel {

    /**
    * Unique service ID of the IP policy to be bound.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique ID of the IP policy to be bound.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * Environment to be bound to IP policy.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * List of APIs to be bound to IP policy.
    */
    @SerializedName("BindApiIds")
    @Expose
    private String [] BindApiIds;

    /**
     * Get Unique service ID of the IP policy to be bound. 
     * @return ServiceId Unique service ID of the IP policy to be bound.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID of the IP policy to be bound.
     * @param ServiceId Unique service ID of the IP policy to be bound.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique ID of the IP policy to be bound. 
     * @return StrategyId Unique ID of the IP policy to be bound.
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Unique ID of the IP policy to be bound.
     * @param StrategyId Unique ID of the IP policy to be bound.
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Environment to be bound to IP policy. 
     * @return EnvironmentName Environment to be bound to IP policy.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment to be bound to IP policy.
     * @param EnvironmentName Environment to be bound to IP policy.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get List of APIs to be bound to IP policy. 
     * @return BindApiIds List of APIs to be bound to IP policy.
     */
    public String [] getBindApiIds() {
        return this.BindApiIds;
    }

    /**
     * Set List of APIs to be bound to IP policy.
     * @param BindApiIds List of APIs to be bound to IP policy.
     */
    public void setBindApiIds(String [] BindApiIds) {
        this.BindApiIds = BindApiIds;
    }

    public BindIPStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindIPStrategyRequest(BindIPStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.BindApiIds != null) {
            this.BindApiIds = new String[source.BindApiIds.length];
            for (int i = 0; i < source.BindApiIds.length; i++) {
                this.BindApiIds[i] = new String(source.BindApiIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamArraySimple(map, prefix + "BindApiIds.", this.BindApiIds);

    }
}

