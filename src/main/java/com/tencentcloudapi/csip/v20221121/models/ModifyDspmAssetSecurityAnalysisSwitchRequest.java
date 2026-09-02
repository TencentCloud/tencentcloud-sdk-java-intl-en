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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmAssetSecurityAnalysisSwitchRequest extends AbstractModel {

    /**
    * Instance information
    */
    @SerializedName("Instances")
    @Expose
    private DspmAssetInstance [] Instances;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Switch. 1: on. 0: off.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get Instance information 
     * @return Instances Instance information
     */
    public DspmAssetInstance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set Instance information
     * @param Instances Instance information
     */
    public void setInstances(DspmAssetInstance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Switch. 1: on. 0: off. 
     * @return Enable Switch. 1: on. 0: off.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Switch. 1: on. 0: off.
     * @param Enable Switch. 1: on. 0: off.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyDspmAssetSecurityAnalysisSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetSecurityAnalysisSwitchRequest(ModifyDspmAssetSecurityAnalysisSwitchRequest source) {
        if (source.Instances != null) {
            this.Instances = new DspmAssetInstance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new DspmAssetInstance(source.Instances[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

