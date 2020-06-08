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

public class ReleaseServiceRequest extends AbstractModel{

    /**
    * Unique ID of the service to be published.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Name of the environment to be published. Valid values: test (testing environment), prepub (pre-publish environment), release (release environment).
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
     * Get Name of the environment to be published. Valid values: test (testing environment), prepub (pre-publish environment), release (release environment). 
     * @return EnvironmentName Name of the environment to be published. Valid values: test (testing environment), prepub (pre-publish environment), release (release environment).
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Name of the environment to be published. Valid values: test (testing environment), prepub (pre-publish environment), release (release environment).
     * @param EnvironmentName Name of the environment to be published. Valid values: test (testing environment), prepub (pre-publish environment), release (release environment).
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

