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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel{

    /**
    * Database engine name. Valid value: `dcdb`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of IDs of security groups to be modified, which is an array of one or more security group IDs.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Database engine name. Valid value: `dcdb`. 
     * @return Product Database engine name. Valid value: `dcdb`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Database engine name. Valid value: `dcdb`.
     * @param Product Database engine name. Valid value: `dcdb`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get List of IDs of security groups to be modified, which is an array of one or more security group IDs. 
     * @return SecurityGroupIds List of IDs of security groups to be modified, which is an array of one or more security group IDs.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set List of IDs of security groups to be modified, which is an array of one or more security group IDs.
     * @param SecurityGroupIds List of IDs of security groups to be modified, which is an array of one or more security group IDs.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

