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

public class ReleaseServiceRequest extends AbstractModel {

    /**
    * Unique ID of the service to be published.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Name of the environment to be published. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Release description.
    */
    @SerializedName("ReleaseDesc")
    @Expose
    private String ReleaseDesc;

    /**
    * `apiId` list, which is reserved. Full API release is used by default.
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
     * Get Unique ID of the service to be published. 
     * @return ServiceId Unique ID of the service to be published.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service to be published.
     * @param ServiceId Unique ID of the service to be published.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Name of the environment to be published. Valid values: test (test environment), prepub (pre-release environment), release (release environment). 
     * @return EnvironmentName Name of the environment to be published. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Name of the environment to be published. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     * @param EnvironmentName Name of the environment to be published. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Release description. 
     * @return ReleaseDesc Release description.
     */
    public String getReleaseDesc() {
        return this.ReleaseDesc;
    }

    /**
     * Set Release description.
     * @param ReleaseDesc Release description.
     */
    public void setReleaseDesc(String ReleaseDesc) {
        this.ReleaseDesc = ReleaseDesc;
    }

    /**
     * Get `apiId` list, which is reserved. Full API release is used by default. 
     * @return ApiIds `apiId` list, which is reserved. Full API release is used by default.
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set `apiId` list, which is reserved. Full API release is used by default.
     * @param ApiIds `apiId` list, which is reserved. Full API release is used by default.
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    public ReleaseServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseServiceRequest(ReleaseServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ReleaseDesc != null) {
            this.ReleaseDesc = new String(source.ReleaseDesc);
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
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ReleaseDesc", this.ReleaseDesc);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);

    }
}

