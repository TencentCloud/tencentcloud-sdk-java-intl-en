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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachCcnInstancesRequest extends AbstractModel {

    /**
    * The CCN instance ID, such as `ccn-f49l6u0z`.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * List of associated network instances
    */
    @SerializedName("Instances")
    @Expose
    private CcnInstance [] Instances;

    /**
    * The UIN (root account) of the CCN. By default, the current account belongs to the UIN
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

    /**
     * Get The CCN instance ID, such as `ccn-f49l6u0z`. 
     * @return CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The CCN instance ID, such as `ccn-f49l6u0z`.
     * @param CcnId The CCN instance ID, such as `ccn-f49l6u0z`.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get List of associated network instances 
     * @return Instances List of associated network instances
     */
    public CcnInstance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set List of associated network instances
     * @param Instances List of associated network instances
     */
    public void setInstances(CcnInstance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get The UIN (root account) of the CCN. By default, the current account belongs to the UIN 
     * @return CcnUin The UIN (root account) of the CCN. By default, the current account belongs to the UIN
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set The UIN (root account) of the CCN. By default, the current account belongs to the UIN
     * @param CcnUin The UIN (root account) of the CCN. By default, the current account belongs to the UIN
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    public AttachCcnInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachCcnInstancesRequest(AttachCcnInstancesRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.Instances != null) {
            this.Instances = new CcnInstance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new CcnInstance(source.Instances[i]);
            }
        }
        if (source.CcnUin != null) {
            this.CcnUin = new String(source.CcnUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);

    }
}

