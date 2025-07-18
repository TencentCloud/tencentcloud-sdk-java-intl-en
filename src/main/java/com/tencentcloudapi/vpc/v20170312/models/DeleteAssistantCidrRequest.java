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

public class DeleteAssistantCidrRequest extends AbstractModel {

    /**
    * `VPC` instance `ID`, such as `vpc-6v2ht8q5`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Array of CIDR blocks, such as ["10.0.0.0/16", "172.16.0.0/16"]
    */
    @SerializedName("CidrBlocks")
    @Expose
    private String [] CidrBlocks;

    /**
     * Get `VPC` instance `ID`, such as `vpc-6v2ht8q5`. 
     * @return VpcId `VPC` instance `ID`, such as `vpc-6v2ht8q5`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC` instance `ID`, such as `vpc-6v2ht8q5`.
     * @param VpcId `VPC` instance `ID`, such as `vpc-6v2ht8q5`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Array of CIDR blocks, such as ["10.0.0.0/16", "172.16.0.0/16"] 
     * @return CidrBlocks Array of CIDR blocks, such as ["10.0.0.0/16", "172.16.0.0/16"]
     */
    public String [] getCidrBlocks() {
        return this.CidrBlocks;
    }

    /**
     * Set Array of CIDR blocks, such as ["10.0.0.0/16", "172.16.0.0/16"]
     * @param CidrBlocks Array of CIDR blocks, such as ["10.0.0.0/16", "172.16.0.0/16"]
     */
    public void setCidrBlocks(String [] CidrBlocks) {
        this.CidrBlocks = CidrBlocks;
    }

    public DeleteAssistantCidrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAssistantCidrRequest(DeleteAssistantCidrRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CidrBlocks != null) {
            this.CidrBlocks = new String[source.CidrBlocks.length];
            for (int i = 0; i < source.CidrBlocks.length; i++) {
                this.CidrBlocks[i] = new String(source.CidrBlocks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "CidrBlocks.", this.CidrBlocks);

    }
}

