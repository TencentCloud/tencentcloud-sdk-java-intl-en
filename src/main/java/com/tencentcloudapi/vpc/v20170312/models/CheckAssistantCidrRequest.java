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

public class CheckAssistantCidrRequest extends AbstractModel{

    /**
    * `VPC` instance `ID`, e.g. `vpc-6v2ht8q5`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Load CIDR blocks to add. CIDR block set; format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
    */
    @SerializedName("NewCidrBlocks")
    @Expose
    private String [] NewCidrBlocks;

    /**
    * Load CIDR blocks to delete. CIDR block set; Format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
    */
    @SerializedName("OldCidrBlocks")
    @Expose
    private String [] OldCidrBlocks;

    /**
     * Get `VPC` instance `ID`, e.g. `vpc-6v2ht8q5`. 
     * @return VpcId `VPC` instance `ID`, e.g. `vpc-6v2ht8q5`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC` instance `ID`, e.g. `vpc-6v2ht8q5`.
     * @param VpcId `VPC` instance `ID`, e.g. `vpc-6v2ht8q5`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Load CIDR blocks to add. CIDR block set; format: e.g. ["10.0.0.0/16", "172.16.0.0/16"] 
     * @return NewCidrBlocks Load CIDR blocks to add. CIDR block set; format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
     */
    public String [] getNewCidrBlocks() {
        return this.NewCidrBlocks;
    }

    /**
     * Set Load CIDR blocks to add. CIDR block set; format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
     * @param NewCidrBlocks Load CIDR blocks to add. CIDR block set; format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
     */
    public void setNewCidrBlocks(String [] NewCidrBlocks) {
        this.NewCidrBlocks = NewCidrBlocks;
    }

    /**
     * Get Load CIDR blocks to delete. CIDR block set; Format: e.g. ["10.0.0.0/16", "172.16.0.0/16"] 
     * @return OldCidrBlocks Load CIDR blocks to delete. CIDR block set; Format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
     */
    public String [] getOldCidrBlocks() {
        return this.OldCidrBlocks;
    }

    /**
     * Set Load CIDR blocks to delete. CIDR block set; Format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
     * @param OldCidrBlocks Load CIDR blocks to delete. CIDR block set; Format: e.g. ["10.0.0.0/16", "172.16.0.0/16"]
     */
    public void setOldCidrBlocks(String [] OldCidrBlocks) {
        this.OldCidrBlocks = OldCidrBlocks;
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

