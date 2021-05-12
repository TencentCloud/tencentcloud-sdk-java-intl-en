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

public class UnBindEnvironmentRequest extends AbstractModel{

    /**
    * Binding type. Valid values: API, SERVICE. Default value: SERVICE.
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * List of unique IDs of the usage plans to be bound.
    */
    @SerializedName("UsagePlanIds")
    @Expose
    private String [] UsagePlanIds;

    /**
    * Service environment to be unbound.
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Unique ID of the service to be unbound.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique API ID array, which is required if `BindType` is `API`.
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
     * Get Binding type. Valid values: API, SERVICE. Default value: SERVICE. 
     * @return BindType Binding type. Valid values: API, SERVICE. Default value: SERVICE.
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set Binding type. Valid values: API, SERVICE. Default value: SERVICE.
     * @param BindType Binding type. Valid values: API, SERVICE. Default value: SERVICE.
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get List of unique IDs of the usage plans to be bound. 
     * @return UsagePlanIds List of unique IDs of the usage plans to be bound.
     */
    public String [] getUsagePlanIds() {
        return this.UsagePlanIds;
    }

    /**
     * Set List of unique IDs of the usage plans to be bound.
     * @param UsagePlanIds List of unique IDs of the usage plans to be bound.
     */
    public void setUsagePlanIds(String [] UsagePlanIds) {
        this.UsagePlanIds = UsagePlanIds;
    }

    /**
     * Get Service environment to be unbound. 
     * @return Environment Service environment to be unbound.
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Service environment to be unbound.
     * @param Environment Service environment to be unbound.
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

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
     * Get Unique API ID array, which is required if `BindType` is `API`. 
     * @return ApiIds Unique API ID array, which is required if `BindType` is `API`.
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set Unique API ID array, which is required if `BindType` is `API`.
     * @param ApiIds Unique API ID array, which is required if `BindType` is `API`.
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    public UnBindEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindEnvironmentRequest(UnBindEnvironmentRequest source) {
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.UsagePlanIds != null) {
            this.UsagePlanIds = new String[source.UsagePlanIds.length];
            for (int i = 0; i < source.UsagePlanIds.length; i++) {
                this.UsagePlanIds[i] = new String(source.UsagePlanIds[i]);
            }
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiIds != null) {
            this.ApiIds = new String[source.ApiIds.length];
            for (int i = 0; i < source.ApiIds.length; i++) {
                this.ApiIds[i] = new String(source.ApiIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamArraySimple(map, prefix + "UsagePlanIds.", this.UsagePlanIds);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);

    }
}

