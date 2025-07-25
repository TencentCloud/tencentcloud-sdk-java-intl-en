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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressTemplateGroupAttributeRequest extends AbstractModel {

    /**
    * IP address template group instance ID, such as `ipmg-2uw6ujo6`.
    */
    @SerializedName("AddressTemplateGroupId")
    @Expose
    private String AddressTemplateGroupId;

    /**
    * IP address template group name.
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;

    /**
    * IP address template instance ID, such as `ipm-mdunqeb6`.
    */
    @SerializedName("AddressTemplateIds")
    @Expose
    private String [] AddressTemplateIds;

    /**
     * Get IP address template group instance ID, such as `ipmg-2uw6ujo6`. 
     * @return AddressTemplateGroupId IP address template group instance ID, such as `ipmg-2uw6ujo6`.
     */
    public String getAddressTemplateGroupId() {
        return this.AddressTemplateGroupId;
    }

    /**
     * Set IP address template group instance ID, such as `ipmg-2uw6ujo6`.
     * @param AddressTemplateGroupId IP address template group instance ID, such as `ipmg-2uw6ujo6`.
     */
    public void setAddressTemplateGroupId(String AddressTemplateGroupId) {
        this.AddressTemplateGroupId = AddressTemplateGroupId;
    }

    /**
     * Get IP address template group name. 
     * @return AddressTemplateGroupName IP address template group name.
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * Set IP address template group name.
     * @param AddressTemplateGroupName IP address template group name.
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * Get IP address template instance ID, such as `ipm-mdunqeb6`. 
     * @return AddressTemplateIds IP address template instance ID, such as `ipm-mdunqeb6`.
     */
    public String [] getAddressTemplateIds() {
        return this.AddressTemplateIds;
    }

    /**
     * Set IP address template instance ID, such as `ipm-mdunqeb6`.
     * @param AddressTemplateIds IP address template instance ID, such as `ipm-mdunqeb6`.
     */
    public void setAddressTemplateIds(String [] AddressTemplateIds) {
        this.AddressTemplateIds = AddressTemplateIds;
    }

    public ModifyAddressTemplateGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressTemplateGroupAttributeRequest(ModifyAddressTemplateGroupAttributeRequest source) {
        if (source.AddressTemplateGroupId != null) {
            this.AddressTemplateGroupId = new String(source.AddressTemplateGroupId);
        }
        if (source.AddressTemplateGroupName != null) {
            this.AddressTemplateGroupName = new String(source.AddressTemplateGroupName);
        }
        if (source.AddressTemplateIds != null) {
            this.AddressTemplateIds = new String[source.AddressTemplateIds.length];
            for (int i = 0; i < source.AddressTemplateIds.length; i++) {
                this.AddressTemplateIds[i] = new String(source.AddressTemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamArraySimple(map, prefix + "AddressTemplateIds.", this.AddressTemplateIds);

    }
}

