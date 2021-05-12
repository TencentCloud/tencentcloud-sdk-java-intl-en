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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCcnAttachedInstancesAttributeRequest extends AbstractModel{

    /**
    * CCN instance ID in the format of `ccn-f49l6u0z`
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
     * Get CCN instance ID in the format of `ccn-f49l6u0z` 
     * @return CcnId CCN instance ID in the format of `ccn-f49l6u0z`
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN instance ID in the format of `ccn-f49l6u0z`
     * @param CcnId CCN instance ID in the format of `ccn-f49l6u0z`
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

    public ModifyCcnAttachedInstancesAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCcnAttachedInstancesAttributeRequest(ModifyCcnAttachedInstancesAttributeRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.Instances != null) {
            this.Instances = new CcnInstance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new CcnInstance(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

