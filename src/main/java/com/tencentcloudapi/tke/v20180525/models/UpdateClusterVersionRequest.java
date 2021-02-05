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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateClusterVersionRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The version that needs to upgrade to
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * The maximum tolerable number of unavailable pods
    */
    @SerializedName("MaxNotReadyPercent")
    @Expose
    private Float MaxNotReadyPercent;

    /**
    * Whether to skip the precheck
    */
    @SerializedName("SkipPreCheck")
    @Expose
    private Boolean SkipPreCheck;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The version that needs to upgrade to 
     * @return DstVersion The version that needs to upgrade to
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set The version that needs to upgrade to
     * @param DstVersion The version that needs to upgrade to
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get The maximum tolerable number of unavailable pods 
     * @return MaxNotReadyPercent The maximum tolerable number of unavailable pods
     */
    public Float getMaxNotReadyPercent() {
        return this.MaxNotReadyPercent;
    }

    /**
     * Set The maximum tolerable number of unavailable pods
     * @param MaxNotReadyPercent The maximum tolerable number of unavailable pods
     */
    public void setMaxNotReadyPercent(Float MaxNotReadyPercent) {
        this.MaxNotReadyPercent = MaxNotReadyPercent;
    }

    /**
     * Get Whether to skip the precheck 
     * @return SkipPreCheck Whether to skip the precheck
     */
    public Boolean getSkipPreCheck() {
        return this.SkipPreCheck;
    }

    /**
     * Set Whether to skip the precheck
     * @param SkipPreCheck Whether to skip the precheck
     */
    public void setSkipPreCheck(Boolean SkipPreCheck) {
        this.SkipPreCheck = SkipPreCheck;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DstVersion", this.DstVersion);
        this.setParamSimple(map, prefix + "MaxNotReadyPercent", this.MaxNotReadyPercent);
        this.setParamSimple(map, prefix + "SkipPreCheck", this.SkipPreCheck);

    }
}

