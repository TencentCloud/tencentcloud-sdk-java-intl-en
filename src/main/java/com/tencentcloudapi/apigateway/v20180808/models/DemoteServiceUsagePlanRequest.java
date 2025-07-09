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

public class DemoteServiceUsagePlanRequest extends AbstractModel {

    /**
    * Usage plan ID.
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * Unique ID of the service to be demoted.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Environment name.
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get Usage plan ID. 
     * @return UsagePlanId Usage plan ID.
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set Usage plan ID.
     * @param UsagePlanId Usage plan ID.
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get Unique ID of the service to be demoted. 
     * @return ServiceId Unique ID of the service to be demoted.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service to be demoted.
     * @param ServiceId Unique ID of the service to be demoted.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Environment name. 
     * @return Environment Environment name.
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment name.
     * @param Environment Environment name.
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public DemoteServiceUsagePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DemoteServiceUsagePlanRequest(DemoteServiceUsagePlanRequest source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

