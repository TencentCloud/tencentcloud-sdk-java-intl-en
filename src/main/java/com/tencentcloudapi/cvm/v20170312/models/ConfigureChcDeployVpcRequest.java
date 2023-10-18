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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureChcDeployVpcRequest extends AbstractModel {

    /**
    * CHC instance ID
    */
    @SerializedName("ChcIds")
    @Expose
    private String [] ChcIds;

    /**
    * Deployment network information
    */
    @SerializedName("DeployVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud DeployVirtualPrivateCloud;

    /**
    * Deployment network security group list
    */
    @SerializedName("DeploySecurityGroupIds")
    @Expose
    private String [] DeploySecurityGroupIds;

    /**
     * Get CHC instance ID 
     * @return ChcIds CHC instance ID
     */
    public String [] getChcIds() {
        return this.ChcIds;
    }

    /**
     * Set CHC instance ID
     * @param ChcIds CHC instance ID
     */
    public void setChcIds(String [] ChcIds) {
        this.ChcIds = ChcIds;
    }

    /**
     * Get Deployment network information 
     * @return DeployVirtualPrivateCloud Deployment network information
     */
    public VirtualPrivateCloud getDeployVirtualPrivateCloud() {
        return this.DeployVirtualPrivateCloud;
    }

    /**
     * Set Deployment network information
     * @param DeployVirtualPrivateCloud Deployment network information
     */
    public void setDeployVirtualPrivateCloud(VirtualPrivateCloud DeployVirtualPrivateCloud) {
        this.DeployVirtualPrivateCloud = DeployVirtualPrivateCloud;
    }

    /**
     * Get Deployment network security group list 
     * @return DeploySecurityGroupIds Deployment network security group list
     */
    public String [] getDeploySecurityGroupIds() {
        return this.DeploySecurityGroupIds;
    }

    /**
     * Set Deployment network security group list
     * @param DeploySecurityGroupIds Deployment network security group list
     */
    public void setDeploySecurityGroupIds(String [] DeploySecurityGroupIds) {
        this.DeploySecurityGroupIds = DeploySecurityGroupIds;
    }

    public ConfigureChcDeployVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureChcDeployVpcRequest(ConfigureChcDeployVpcRequest source) {
        if (source.ChcIds != null) {
            this.ChcIds = new String[source.ChcIds.length];
            for (int i = 0; i < source.ChcIds.length; i++) {
                this.ChcIds[i] = new String(source.ChcIds[i]);
            }
        }
        if (source.DeployVirtualPrivateCloud != null) {
            this.DeployVirtualPrivateCloud = new VirtualPrivateCloud(source.DeployVirtualPrivateCloud);
        }
        if (source.DeploySecurityGroupIds != null) {
            this.DeploySecurityGroupIds = new String[source.DeploySecurityGroupIds.length];
            for (int i = 0; i < source.DeploySecurityGroupIds.length; i++) {
                this.DeploySecurityGroupIds[i] = new String(source.DeploySecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChcIds.", this.ChcIds);
        this.setParamObj(map, prefix + "DeployVirtualPrivateCloud.", this.DeployVirtualPrivateCloud);
        this.setParamArraySimple(map, prefix + "DeploySecurityGroupIds.", this.DeploySecurityGroupIds);

    }
}

