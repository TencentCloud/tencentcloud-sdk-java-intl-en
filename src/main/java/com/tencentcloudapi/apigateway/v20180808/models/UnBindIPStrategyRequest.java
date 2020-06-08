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

public class UnBindIPStrategyRequest extends AbstractModel{

    /**
    * Unique ID of the service to be unbound.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique ID of the IP policy to be unbound.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * Environment to be unbound.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * List of APIs to be unbound.
    */
    @SerializedName("UnBindApiIds")
    @Expose
    private String [] UnBindApiIds;

    /**
     * Get Unique ID of the service to be unbound. 
     * @return ServiceId Unique ID of the service to be unbound.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service to be unbound.
     * @param ServiceId Unique ID of the service to be unbound.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique ID of the IP policy to be unbound. 
     * @return StrategyId Unique ID of the IP policy to be unbound.
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Unique ID of the IP policy to be unbound.
     * @param StrategyId Unique ID of the IP policy to be unbound.
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Environment to be unbound. 
     * @return EnvironmentName Environment to be unbound.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment to be unbound.
     * @param EnvironmentName Environment to be unbound.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get List of APIs to be unbound. 
     * @return UnBindApiIds List of APIs to be unbound.
     */
    public String [] getUnBindApiIds() {
        return this.UnBindApiIds;
    }

    /**
     * Set List of APIs to be unbound.
     * @param UnBindApiIds List of APIs to be unbound.
     */
    public void setUnBindApiIds(String [] UnBindApiIds) {
        this.UnBindApiIds = UnBindApiIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamArraySimple(map, prefix + "UnBindApiIds.", this.UnBindApiIds);

    }
}

