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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityGroupsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Security group information before modification
    */
    @SerializedName("OldSecurityGroupIds")
    @Expose
    private String [] OldSecurityGroupIds;

    /**
    * Modified security group information
    */
    @SerializedName("ModifySecurityGroupIds")
    @Expose
    private String [] ModifySecurityGroupIds;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Security group information before modification 
     * @return OldSecurityGroupIds Security group information before modification
     */
    public String [] getOldSecurityGroupIds() {
        return this.OldSecurityGroupIds;
    }

    /**
     * Set Security group information before modification
     * @param OldSecurityGroupIds Security group information before modification
     */
    public void setOldSecurityGroupIds(String [] OldSecurityGroupIds) {
        this.OldSecurityGroupIds = OldSecurityGroupIds;
    }

    /**
     * Get Modified security group information 
     * @return ModifySecurityGroupIds Modified security group information
     */
    public String [] getModifySecurityGroupIds() {
        return this.ModifySecurityGroupIds;
    }

    /**
     * Set Modified security group information
     * @param ModifySecurityGroupIds Modified security group information
     */
    public void setModifySecurityGroupIds(String [] ModifySecurityGroupIds) {
        this.ModifySecurityGroupIds = ModifySecurityGroupIds;
    }

    public ModifySecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupsRequest(ModifySecurityGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldSecurityGroupIds != null) {
            this.OldSecurityGroupIds = new String[source.OldSecurityGroupIds.length];
            for (int i = 0; i < source.OldSecurityGroupIds.length; i++) {
                this.OldSecurityGroupIds[i] = new String(source.OldSecurityGroupIds[i]);
            }
        }
        if (source.ModifySecurityGroupIds != null) {
            this.ModifySecurityGroupIds = new String[source.ModifySecurityGroupIds.length];
            for (int i = 0; i < source.ModifySecurityGroupIds.length; i++) {
                this.ModifySecurityGroupIds[i] = new String(source.ModifySecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "OldSecurityGroupIds.", this.OldSecurityGroupIds);
        this.setParamArraySimple(map, prefix + "ModifySecurityGroupIds.", this.ModifySecurityGroupIds);

    }
}

