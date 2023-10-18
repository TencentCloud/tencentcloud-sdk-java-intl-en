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

public class UpdateServiceRequest extends AbstractModel {

    /**
    * Unique ID of the service to be switch.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Name of the environment to be switched to. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Number of the version to be switched to.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Switch description.
    */
    @SerializedName("UpdateDesc")
    @Expose
    private String UpdateDesc;

    /**
     * Get Unique ID of the service to be switch. 
     * @return ServiceId Unique ID of the service to be switch.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of the service to be switch.
     * @param ServiceId Unique ID of the service to be switch.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Name of the environment to be switched to. Valid values: test (test environment), prepub (pre-release environment), release (release environment). 
     * @return EnvironmentName Name of the environment to be switched to. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Name of the environment to be switched to. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     * @param EnvironmentName Name of the environment to be switched to. Valid values: test (test environment), prepub (pre-release environment), release (release environment).
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Number of the version to be switched to. 
     * @return VersionName Number of the version to be switched to.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Number of the version to be switched to.
     * @param VersionName Number of the version to be switched to.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Switch description. 
     * @return UpdateDesc Switch description.
     */
    public String getUpdateDesc() {
        return this.UpdateDesc;
    }

    /**
     * Set Switch description.
     * @param UpdateDesc Switch description.
     */
    public void setUpdateDesc(String UpdateDesc) {
        this.UpdateDesc = UpdateDesc;
    }

    public UpdateServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateServiceRequest(UpdateServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.UpdateDesc != null) {
            this.UpdateDesc = new String(source.UpdateDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "UpdateDesc", this.UpdateDesc);

    }
}

