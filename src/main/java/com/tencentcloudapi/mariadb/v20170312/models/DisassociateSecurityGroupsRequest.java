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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest extends AbstractModel{

    /**
    * Database engine name. Valid value: `mariadb`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Instance ID list, which is an array of one or more instance IDs.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Database engine name. Valid value: `mariadb`. 
     * @return Product Database engine name. Valid value: `mariadb`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Database engine name. Valid value: `mariadb`.
     * @param Product Database engine name. Valid value: `mariadb`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupId Security group ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupId Security group ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Instance ID list, which is an array of one or more instance IDs. 
     * @return InstanceIds Instance ID list, which is an array of one or more instance IDs.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list, which is an array of one or more instance IDs.
     * @param InstanceIds Instance ID list, which is an array of one or more instance IDs.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

