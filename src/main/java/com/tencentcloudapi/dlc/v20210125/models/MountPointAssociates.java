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

public class MountPointAssociates extends AbstractModel {

    /**
    * Bucket ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BucketId")
    @Expose
    private String BucketId;

    /**
    * vpcId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * Permission group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
    * Permission rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessRuleId")
    @Expose
    private Long AccessRuleId;

    /**
     * Get Bucket ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BucketId Bucket ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucketId() {
        return this.BucketId;
    }

    /**
     * Set Bucket ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BucketId Bucket ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucketId(String BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get vpcId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId vpcId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId vpcId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcCidrBlock Subnet address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set Subnet address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcCidrBlock Subnet address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
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

    /**
     * Get Permission rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessRuleId Permission rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAccessRuleId() {
        return this.AccessRuleId;
    }

    /**
     * Set Permission rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessRuleId Permission rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessRuleId(Long AccessRuleId) {
        this.AccessRuleId = AccessRuleId;
    }

    public MountPointAssociates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountPointAssociates(MountPointAssociates source) {
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.AccessGroupId != null) {
            this.AccessGroupId = new String(source.AccessGroupId);
        }
        if (source.AccessRuleId != null) {
            this.AccessRuleId = new Long(source.AccessRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);
        this.setParamSimple(map, prefix + "AccessRuleId", this.AccessRuleId);

    }
}

