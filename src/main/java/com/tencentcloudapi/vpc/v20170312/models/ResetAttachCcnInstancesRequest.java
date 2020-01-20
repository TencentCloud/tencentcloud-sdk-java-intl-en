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

public class ResetAttachCcnInstancesRequest extends AbstractModel{

    /**
    * The CCN instance ID, such as `ccn-f49l6u0z`.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The UIN (root account) to which the CCN belongs.
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

    /**
    * The list of network instances that re-apply for association.
    */
    @SerializedName("Instances")
    @Expose
    private CcnInstance [] Instances;

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
     * Get The UIN (root account) to which the CCN belongs. 
     * @return CcnUin The UIN (root account) to which the CCN belongs.
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set The UIN (root account) to which the CCN belongs.
     * @param CcnUin The UIN (root account) to which the CCN belongs.
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    /**
     * Get The list of network instances that re-apply for association. 
     * @return Instances The list of network instances that re-apply for association.
     */
    public CcnInstance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set The list of network instances that re-apply for association.
     * @param Instances The list of network instances that re-apply for association.
     */
    public void setInstances(CcnInstance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

