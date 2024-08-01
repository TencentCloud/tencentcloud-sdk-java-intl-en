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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcInfo extends AbstractModel {

    /**
    * vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

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
     * Get vpc Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId vpc Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcCidrBlock VPC subnet
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set VPC subnet
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcCidrBlock VPC subnet
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
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

    public VpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcInfo(VpcInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
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
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);

    }
}

