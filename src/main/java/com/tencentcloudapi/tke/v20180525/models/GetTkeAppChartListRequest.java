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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTkeAppChartListRequest extends AbstractModel {

    /**
    * Type specifies the application category. valid values include log, scheduler, network, storage, monitor, dns, image, other, and invisible.
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Specifies the supported operating systems of the app. valid values: arm32, arm64, amd64.
    */
    @SerializedName("Arch")
    @Expose
    private String Arch;

    /**
    * ClusterType specifies the type of the cluster. valid values are tke and eks.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get Type specifies the application category. valid values include log, scheduler, network, storage, monitor, dns, image, other, and invisible. 
     * @return Kind Type specifies the application category. valid values include log, scheduler, network, storage, monitor, dns, image, other, and invisible.
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Type specifies the application category. valid values include log, scheduler, network, storage, monitor, dns, image, other, and invisible.
     * @param Kind Type specifies the application category. valid values include log, scheduler, network, storage, monitor, dns, image, other, and invisible.
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Specifies the supported operating systems of the app. valid values: arm32, arm64, amd64. 
     * @return Arch Specifies the supported operating systems of the app. valid values: arm32, arm64, amd64.
     */
    public String getArch() {
        return this.Arch;
    }

    /**
     * Set Specifies the supported operating systems of the app. valid values: arm32, arm64, amd64.
     * @param Arch Specifies the supported operating systems of the app. valid values: arm32, arm64, amd64.
     */
    public void setArch(String Arch) {
        this.Arch = Arch;
    }

    /**
     * Get ClusterType specifies the type of the cluster. valid values are tke and eks. 
     * @return ClusterType ClusterType specifies the type of the cluster. valid values are tke and eks.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set ClusterType specifies the type of the cluster. valid values are tke and eks.
     * @param ClusterType ClusterType specifies the type of the cluster. valid values are tke and eks.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public GetTkeAppChartListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTkeAppChartListRequest(GetTkeAppChartListRequest source) {
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Arch != null) {
            this.Arch = new String(source.Arch);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Arch", this.Arch);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

