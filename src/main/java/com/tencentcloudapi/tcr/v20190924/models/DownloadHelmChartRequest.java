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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadHelmChartRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Namespace name
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Helm chart name
    */
    @SerializedName("ChartName")
    @Expose
    private String ChartName;

    /**
    * Helm chart version
    */
    @SerializedName("ChartVersion")
    @Expose
    private String ChartVersion;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Namespace name 
     * @return NamespaceName Namespace name
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
     * @param NamespaceName Namespace name
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Helm chart name 
     * @return ChartName Helm chart name
     */
    public String getChartName() {
        return this.ChartName;
    }

    /**
     * Set Helm chart name
     * @param ChartName Helm chart name
     */
    public void setChartName(String ChartName) {
        this.ChartName = ChartName;
    }

    /**
     * Get Helm chart version 
     * @return ChartVersion Helm chart version
     */
    public String getChartVersion() {
        return this.ChartVersion;
    }

    /**
     * Set Helm chart version
     * @param ChartVersion Helm chart version
     */
    public void setChartVersion(String ChartVersion) {
        this.ChartVersion = ChartVersion;
    }

    public DownloadHelmChartRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadHelmChartRequest(DownloadHelmChartRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.ChartName != null) {
            this.ChartName = new String(source.ChartName);
        }
        if (source.ChartVersion != null) {
            this.ChartVersion = new String(source.ChartVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ChartName", this.ChartName);
        this.setParamSimple(map, prefix + "ChartVersion", this.ChartVersion);

    }
}

