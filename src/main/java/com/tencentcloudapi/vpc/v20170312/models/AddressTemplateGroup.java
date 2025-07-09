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

public class AddressTemplateGroup extends AbstractModel {

    /**
    * IP address template group name.
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;

    /**
    * IP address template group instance ID, such as `ipmg-dih8xdbq`.
    */
    @SerializedName("AddressTemplateGroupId")
    @Expose
    private String AddressTemplateGroupId;

    /**
    * IP address template ID.
    */
    @SerializedName("AddressTemplateIdSet")
    @Expose
    private String [] AddressTemplateIdSet;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * IP address template instance
    */
    @SerializedName("AddressTemplateSet")
    @Expose
    private AddressTemplateItem [] AddressTemplateSet;

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
     * Get IP address template group instance ID, such as `ipmg-dih8xdbq`. 
     * @return AddressTemplateGroupId IP address template group instance ID, such as `ipmg-dih8xdbq`.
     */
    public String getAddressTemplateGroupId() {
        return this.AddressTemplateGroupId;
    }

    /**
     * Set IP address template group instance ID, such as `ipmg-dih8xdbq`.
     * @param AddressTemplateGroupId IP address template group instance ID, such as `ipmg-dih8xdbq`.
     */
    public void setAddressTemplateGroupId(String AddressTemplateGroupId) {
        this.AddressTemplateGroupId = AddressTemplateGroupId;
    }

    /**
     * Get IP address template ID. 
     * @return AddressTemplateIdSet IP address template ID.
     */
    public String [] getAddressTemplateIdSet() {
        return this.AddressTemplateIdSet;
    }

    /**
     * Set IP address template ID.
     * @param AddressTemplateIdSet IP address template ID.
     */
    public void setAddressTemplateIdSet(String [] AddressTemplateIdSet) {
        this.AddressTemplateIdSet = AddressTemplateIdSet;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get IP address template instance 
     * @return AddressTemplateSet IP address template instance
     */
    public AddressTemplateItem [] getAddressTemplateSet() {
        return this.AddressTemplateSet;
    }

    /**
     * Set IP address template instance
     * @param AddressTemplateSet IP address template instance
     */
    public void setAddressTemplateSet(AddressTemplateItem [] AddressTemplateSet) {
        this.AddressTemplateSet = AddressTemplateSet;
    }

    public AddressTemplateGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressTemplateGroup(AddressTemplateGroup source) {
        if (source.AddressTemplateGroupName != null) {
            this.AddressTemplateGroupName = new String(source.AddressTemplateGroupName);
        }
        if (source.AddressTemplateGroupId != null) {
            this.AddressTemplateGroupId = new String(source.AddressTemplateGroupId);
        }
        if (source.AddressTemplateIdSet != null) {
            this.AddressTemplateIdSet = new String[source.AddressTemplateIdSet.length];
            for (int i = 0; i < source.AddressTemplateIdSet.length; i++) {
                this.AddressTemplateIdSet[i] = new String(source.AddressTemplateIdSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.AddressTemplateSet != null) {
            this.AddressTemplateSet = new AddressTemplateItem[source.AddressTemplateSet.length];
            for (int i = 0; i < source.AddressTemplateSet.length; i++) {
                this.AddressTemplateSet[i] = new AddressTemplateItem(source.AddressTemplateSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);
        this.setParamArraySimple(map, prefix + "AddressTemplateIdSet.", this.AddressTemplateIdSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "AddressTemplateSet.", this.AddressTemplateSet);

    }
}

