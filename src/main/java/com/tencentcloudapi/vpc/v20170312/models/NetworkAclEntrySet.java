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

public class NetworkAclEntrySet extends AbstractModel{

    /**
    * Inbound rules.
    */
    @SerializedName("Ingress")
    @Expose
    private NetworkAclEntry [] Ingress;

    /**
    * Outbound rules.
    */
    @SerializedName("Egress")
    @Expose
    private NetworkAclEntry [] Egress;

    /**
     * Get Inbound rules. 
     * @return Ingress Inbound rules.
     */
    public NetworkAclEntry [] getIngress() {
        return this.Ingress;
    }

    /**
     * Set Inbound rules.
     * @param Ingress Inbound rules.
     */
    public void setIngress(NetworkAclEntry [] Ingress) {
        this.Ingress = Ingress;
    }

    /**
     * Get Outbound rules. 
     * @return Egress Outbound rules.
     */
    public NetworkAclEntry [] getEgress() {
        return this.Egress;
    }

    /**
     * Set Outbound rules.
     * @param Egress Outbound rules.
     */
    public void setEgress(NetworkAclEntry [] Egress) {
        this.Egress = Egress;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Ingress.", this.Ingress);
        this.setParamArrayObj(map, prefix + "Egress.", this.Egress);

    }
}

