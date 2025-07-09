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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChartDownloadInfoRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Namespace
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Chart name
    */
    @SerializedName("ChartName")
    @Expose
    private String ChartName;

    /**
    * Chart version
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
     * Get Namespace 
     * @return NamespaceName Namespace
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace
     * @param NamespaceName Namespace
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Chart name 
     * @return ChartName Chart name
     */
    public String getChartName() {
        return this.ChartName;
    }

    /**
     * Set Chart name
     * @param ChartName Chart name
     */
    public void setChartName(String ChartName) {
        this.ChartName = ChartName;
    }

    /**
     * Get Chart version 
     * @return ChartVersion Chart version
     */
    public String getChartVersion() {
        return this.ChartVersion;
    }

    /**
     * Set Chart version
     * @param ChartVersion Chart version
     */
    public void setChartVersion(String ChartVersion) {
        this.ChartVersion = ChartVersion;
    }

    public DescribeChartDownloadInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChartDownloadInfoRequest(DescribeChartDownloadInfoRequest source) {
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

