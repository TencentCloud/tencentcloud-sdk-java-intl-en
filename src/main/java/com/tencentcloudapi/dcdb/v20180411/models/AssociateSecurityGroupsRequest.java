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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateSecurityGroupsRequest extends AbstractModel {

    /**
    * Database engine name. Valid value: `dcdb`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * ID of the security group to be associated in the format of sg-efil73jd.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * ID(s) of the instance(s) to be associated in the format of tdsqlshard-lesecurk. You can specify multiple instances.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

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
     * Get ID of the security group to be associated in the format of sg-efil73jd. 
     * @return SecurityGroupId ID of the security group to be associated in the format of sg-efil73jd.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set ID of the security group to be associated in the format of sg-efil73jd.
     * @param SecurityGroupId ID of the security group to be associated in the format of sg-efil73jd.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get ID(s) of the instance(s) to be associated in the format of tdsqlshard-lesecurk. You can specify multiple instances. 
     * @return InstanceIds ID(s) of the instance(s) to be associated in the format of tdsqlshard-lesecurk. You can specify multiple instances.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID(s) of the instance(s) to be associated in the format of tdsqlshard-lesecurk. You can specify multiple instances.
     * @param InstanceIds ID(s) of the instance(s) to be associated in the format of tdsqlshard-lesecurk. You can specify multiple instances.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public AssociateSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateSecurityGroupsRequest(AssociateSecurityGroupsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
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

