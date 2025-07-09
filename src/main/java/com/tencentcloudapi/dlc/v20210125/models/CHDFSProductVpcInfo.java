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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CHDFSProductVpcInfo extends AbstractModel {

    /**
    * vpc id

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC subnet information list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private VpcCidrBlock [] VpcCidrBlock;

    /**
    * Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Permission group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
     * Get vpc id

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId vpc id

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id

Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId vpc id

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcName VPC name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcName VPC name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC subnet information list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcCidrBlock VPC subnet information list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VpcCidrBlock [] getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set VPC subnet information list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcCidrBlock VPC subnet information list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcCidrBlock(VpcCidrBlock [] VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Permission group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessGroupId Permission group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set Permission group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessGroupId Permission group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    public CHDFSProductVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CHDFSProductVpcInfo(CHDFSProductVpcInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new VpcCidrBlock[source.VpcCidrBlock.length];
            for (int i = 0; i < source.VpcCidrBlock.length; i++) {
                this.VpcCidrBlock[i] = new VpcCidrBlock(source.VpcCidrBlock[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.AccessGroupId != null) {
            this.AccessGroupId = new String(source.AccessGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamArrayObj(map, prefix + "VpcCidrBlock.", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);

    }
}

