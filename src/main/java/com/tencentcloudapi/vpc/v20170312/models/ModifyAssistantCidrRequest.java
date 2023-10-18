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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAssistantCidrRequest extends AbstractModel {

    /**
    * `VPC` instance `ID`, such as `vpc-6v2ht8q5`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Array of the secondary CIDR blocks to be added, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` and `OldCidrBlocks` must be specified.
    */
    @SerializedName("NewCidrBlocks")
    @Expose
    private String [] NewCidrBlocks;

    /**
    * Array of the secondary CIDR blocks to be deleted, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` or `OldCidrBlocks` must be specified.
    */
    @SerializedName("OldCidrBlocks")
    @Expose
    private String [] OldCidrBlocks;

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
     * Get Array of the secondary CIDR blocks to be added, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` and `OldCidrBlocks` must be specified. 
     * @return NewCidrBlocks Array of the secondary CIDR blocks to be added, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` and `OldCidrBlocks` must be specified.
     */
    public String [] getNewCidrBlocks() {
        return this.NewCidrBlocks;
    }

    /**
     * Set Array of the secondary CIDR blocks to be added, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` and `OldCidrBlocks` must be specified.
     * @param NewCidrBlocks Array of the secondary CIDR blocks to be added, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` and `OldCidrBlocks` must be specified.
     */
    public void setNewCidrBlocks(String [] NewCidrBlocks) {
        this.NewCidrBlocks = NewCidrBlocks;
    }

    /**
     * Get Array of the secondary CIDR blocks to be deleted, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` or `OldCidrBlocks` must be specified. 
     * @return OldCidrBlocks Array of the secondary CIDR blocks to be deleted, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` or `OldCidrBlocks` must be specified.
     */
    public String [] getOldCidrBlocks() {
        return this.OldCidrBlocks;
    }

    /**
     * Set Array of the secondary CIDR blocks to be deleted, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` or `OldCidrBlocks` must be specified.
     * @param OldCidrBlocks Array of the secondary CIDR blocks to be deleted, such as ["10.0.0.0/16", "172.16.0.0/16"]. At least one of `NewCidrBlocks` or `OldCidrBlocks` must be specified.
     */
    public void setOldCidrBlocks(String [] OldCidrBlocks) {
        this.OldCidrBlocks = OldCidrBlocks;
    }

    public ModifyAssistantCidrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssistantCidrRequest(ModifyAssistantCidrRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NewCidrBlocks != null) {
            this.NewCidrBlocks = new String[source.NewCidrBlocks.length];
            for (int i = 0; i < source.NewCidrBlocks.length; i++) {
                this.NewCidrBlocks[i] = new String(source.NewCidrBlocks[i]);
            }
        }
        if (source.OldCidrBlocks != null) {
            this.OldCidrBlocks = new String[source.OldCidrBlocks.length];
            for (int i = 0; i < source.OldCidrBlocks.length; i++) {
                this.OldCidrBlocks[i] = new String(source.OldCidrBlocks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "NewCidrBlocks.", this.NewCidrBlocks);
        this.setParamArraySimple(map, prefix + "OldCidrBlocks.", this.OldCidrBlocks);

    }
}

