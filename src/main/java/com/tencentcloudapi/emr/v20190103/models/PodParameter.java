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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodParameter extends AbstractModel{

    /**
    * TKE or EKS cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Custom permission
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * Custom parameter
    */
    @SerializedName("Parameter")
    @Expose
    private String Parameter;

    /**
     * Get TKE or EKS cluster ID 
     * @return ClusterId TKE or EKS cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TKE or EKS cluster ID
     * @param ClusterId TKE or EKS cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Custom permission 
     * @return Config Custom permission
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Custom permission
     * @param Config Custom permission
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get Custom parameter 
     * @return Parameter Custom parameter
     */
    public String getParameter() {
        return this.Parameter;
    }

    /**
     * Set Custom parameter
     * @param Parameter Custom parameter
     */
    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Parameter", this.Parameter);

    }
}

