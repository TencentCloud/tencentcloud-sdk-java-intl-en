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

public class DeleteServiceSubDomainMappingRequest extends AbstractModel {

    /**
    * Unique service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Custom domain name bound to service.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Name of the environment whose mapping is to be deleted. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get Unique service ID. 
     * @return ServiceId Unique service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
     * @param ServiceId Unique service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Custom domain name bound to service. 
     * @return SubDomain Custom domain name bound to service.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Custom domain name bound to service.
     * @param SubDomain Custom domain name bound to service.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Name of the environment whose mapping is to be deleted. Valid values: test (test environment), prepub (pre-release environment), release (release environment). 
     * @return Environment Name of the environment whose mapping is to be deleted. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Name of the environment whose mapping is to be deleted. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     * @param Environment Name of the environment whose mapping is to be deleted. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public DeleteServiceSubDomainMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteServiceSubDomainMappingRequest(DeleteServiceSubDomainMappingRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

