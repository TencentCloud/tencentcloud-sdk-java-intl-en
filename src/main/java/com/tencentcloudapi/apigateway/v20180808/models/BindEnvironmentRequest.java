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

public class BindEnvironmentRequest extends AbstractModel {

    /**
    * List of unique IDs of the usage plans to be bound.
    */
    @SerializedName("UsagePlanIds")
    @Expose
    private String [] UsagePlanIds;

    /**
    * Binding type. Valid values: API, SERVICE. Default value: SERVICE.
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * Environment to be bound.
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Unique ID of the service to be bound.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique API ID array, which is required if `bindType` is `API`.
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

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
     * Get Environment to be bound. 
     * @return Environment Environment to be bound.
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment to be bound.
     * @param Environment Environment to be bound.
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Unique ID of the service to be bound. 
     * @return ServiceId Unique ID of the service to be bound.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service to be bound.
     * @param ServiceId Unique ID of the service to be bound.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique API ID array, which is required if `bindType` is `API`. 
     * @return ApiIds Unique API ID array, which is required if `bindType` is `API`.
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set Unique API ID array, which is required if `bindType` is `API`.
     * @param ApiIds Unique API ID array, which is required if `bindType` is `API`.
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    public BindEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindEnvironmentRequest(BindEnvironmentRequest source) {
        if (source.UsagePlanIds != null) {
            this.UsagePlanIds = new String[source.UsagePlanIds.length];
            for (int i = 0; i < source.UsagePlanIds.length; i++) {
                this.UsagePlanIds[i] = new String(source.UsagePlanIds[i]);
            }
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
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
        this.setParamArraySimple(map, prefix + "UsagePlanIds.", this.UsagePlanIds);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);

    }
}

