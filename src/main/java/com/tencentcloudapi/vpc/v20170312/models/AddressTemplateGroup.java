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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressTemplateGroup extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);
        this.setParamArraySimple(map, prefix + "AddressTemplateIdSet.", this.AddressTemplateIdSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

