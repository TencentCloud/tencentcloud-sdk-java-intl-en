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

public class DetachPluginRequest extends AbstractModel{

    /**
    * ID of the plugin to be unbound
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API environment
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * ID of the API to unbind from the plugin
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
     * Get ID of the plugin to be unbound 
     * @return PluginId ID of the plugin to be unbound
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set ID of the plugin to be unbound
     * @param PluginId ID of the plugin to be unbound
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API environment 
     * @return EnvironmentName API environment
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set API environment
     * @param EnvironmentName API environment
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get ID of the API to unbind from the plugin 
     * @return ApiId ID of the API to unbind from the plugin
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set ID of the API to unbind from the plugin
     * @param ApiId ID of the API to unbind from the plugin
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    public DetachPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachPluginRequest(DetachPluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);

    }
}

