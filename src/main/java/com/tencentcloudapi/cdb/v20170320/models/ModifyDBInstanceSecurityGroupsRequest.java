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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of security group IDs to modify, an array of security group IDs. It can be obtained through the API [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/product/236/15854?from_cn_redirect=1). The input security group ID array has no length limit.
**Note**: This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * When importing a read-only instance ID, the default operation is performed on the corresponding security group of the read-only group. If necessary to operate the security group of the read-only instance ID, set this input parameter to True. Default False.
    */
    @SerializedName("ForReadonlyInstance")
    @Expose
    private Boolean ForReadonlyInstance;

    /**
    * When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
    */
    @SerializedName("OpResourceId")
    @Expose
    private String OpResourceId;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get List of security group IDs to modify, an array of security group IDs. It can be obtained through the API [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/product/236/15854?from_cn_redirect=1). The input security group ID array has no length limit.
**Note**: This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections. 
     * @return SecurityGroupIds List of security group IDs to modify, an array of security group IDs. It can be obtained through the API [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/product/236/15854?from_cn_redirect=1). The input security group ID array has no length limit.
**Note**: This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set List of security group IDs to modify, an array of security group IDs. It can be obtained through the API [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/product/236/15854?from_cn_redirect=1). The input security group ID array has no length limit.
**Note**: This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     * @param SecurityGroupIds List of security group IDs to modify, an array of security group IDs. It can be obtained through the API [DescribeDBSecurityGroups](https://www.tencentcloud.com/document/product/236/15854?from_cn_redirect=1). The input security group ID array has no length limit.
**Note**: This input parameter performs a full replacement on all existing collections but not an incremental update. To modify it, import the expected full collections.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get When importing a read-only instance ID, the default operation is performed on the corresponding security group of the read-only group. If necessary to operate the security group of the read-only instance ID, set this input parameter to True. Default False. 
     * @return ForReadonlyInstance When importing a read-only instance ID, the default operation is performed on the corresponding security group of the read-only group. If necessary to operate the security group of the read-only instance ID, set this input parameter to True. Default False.
     */
    public Boolean getForReadonlyInstance() {
        return this.ForReadonlyInstance;
    }

    /**
     * Set When importing a read-only instance ID, the default operation is performed on the corresponding security group of the read-only group. If necessary to operate the security group of the read-only instance ID, set this input parameter to True. Default False.
     * @param ForReadonlyInstance When importing a read-only instance ID, the default operation is performed on the corresponding security group of the read-only group. If necessary to operate the security group of the read-only instance ID, set this input parameter to True. Default False.
     */
    public void setForReadonlyInstance(Boolean ForReadonlyInstance) {
        this.ForReadonlyInstance = ForReadonlyInstance;
    }

    /**
     * Get When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required. 
     * @return OpResourceId When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
     */
    public String getOpResourceId() {
        return this.OpResourceId;
    }

    /**
     * Set When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
     * @param OpResourceId When updating the read-only group of a cloud disk edition instance, specify the instance ID in InstanceId and this parameter to indicate the operation is for the read-only group. If you perform the operation on the read-write node, this parameter is not required.
     */
    public void setOpResourceId(String OpResourceId) {
        this.OpResourceId = OpResourceId;
    }

    public ModifyDBInstanceSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSecurityGroupsRequest(ModifyDBInstanceSecurityGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ForReadonlyInstance != null) {
            this.ForReadonlyInstance = new Boolean(source.ForReadonlyInstance);
        }
        if (source.OpResourceId != null) {
            this.OpResourceId = new String(source.OpResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "ForReadonlyInstance", this.ForReadonlyInstance);
        this.setParamSimple(map, prefix + "OpResourceId", this.OpResourceId);

    }
}

