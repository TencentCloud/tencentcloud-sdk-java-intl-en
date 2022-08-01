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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyChcAttributeRequest extends AbstractModel{

    /**
    * CHC host IDs
    */
    @SerializedName("ChcIds")
    @Expose
    private String [] ChcIds;

    /**
    * CHC host name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Server type
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Valid characters: Letters, numbers, hyphens and underscores
    */
    @SerializedName("BmcUser")
    @Expose
    private String BmcUser;

    /**
    * The password can contain 8 to 16 characters, including letters, numbers and special symbols (()`~!@#$%^&*-+=_|{}).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * BMC network security group list
    */
    @SerializedName("BmcSecurityGroupIds")
    @Expose
    private String [] BmcSecurityGroupIds;

    /**
     * Get CHC host IDs 
     * @return ChcIds CHC host IDs
     */
    public String [] getChcIds() {
        return this.ChcIds;
    }

    /**
     * Set CHC host IDs
     * @param ChcIds CHC host IDs
     */
    public void setChcIds(String [] ChcIds) {
        this.ChcIds = ChcIds;
    }

    /**
     * Get CHC host name 
     * @return InstanceName CHC host name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CHC host name
     * @param InstanceName CHC host name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Server type 
     * @return DeviceType Server type
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Server type
     * @param DeviceType Server type
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Valid characters: Letters, numbers, hyphens and underscores 
     * @return BmcUser Valid characters: Letters, numbers, hyphens and underscores
     */
    public String getBmcUser() {
        return this.BmcUser;
    }

    /**
     * Set Valid characters: Letters, numbers, hyphens and underscores
     * @param BmcUser Valid characters: Letters, numbers, hyphens and underscores
     */
    public void setBmcUser(String BmcUser) {
        this.BmcUser = BmcUser;
    }

    /**
     * Get The password can contain 8 to 16 characters, including letters, numbers and special symbols (()`~!@#$%^&*-+=_|{}). 
     * @return Password The password can contain 8 to 16 characters, including letters, numbers and special symbols (()`~!@#$%^&*-+=_|{}).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The password can contain 8 to 16 characters, including letters, numbers and special symbols (()`~!@#$%^&*-+=_|{}).
     * @param Password The password can contain 8 to 16 characters, including letters, numbers and special symbols (()`~!@#$%^&*-+=_|{}).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get BMC network security group list 
     * @return BmcSecurityGroupIds BMC network security group list
     */
    public String [] getBmcSecurityGroupIds() {
        return this.BmcSecurityGroupIds;
    }

    /**
     * Set BMC network security group list
     * @param BmcSecurityGroupIds BMC network security group list
     */
    public void setBmcSecurityGroupIds(String [] BmcSecurityGroupIds) {
        this.BmcSecurityGroupIds = BmcSecurityGroupIds;
    }

    public ModifyChcAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyChcAttributeRequest(ModifyChcAttributeRequest source) {
        if (source.ChcIds != null) {
            this.ChcIds = new String[source.ChcIds.length];
            for (int i = 0; i < source.ChcIds.length; i++) {
                this.ChcIds[i] = new String(source.ChcIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.BmcUser != null) {
            this.BmcUser = new String(source.BmcUser);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.BmcSecurityGroupIds != null) {
            this.BmcSecurityGroupIds = new String[source.BmcSecurityGroupIds.length];
            for (int i = 0; i < source.BmcSecurityGroupIds.length; i++) {
                this.BmcSecurityGroupIds[i] = new String(source.BmcSecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChcIds.", this.ChcIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "BmcUser", this.BmcUser);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "BmcSecurityGroupIds.", this.BmcSecurityGroupIds);

    }
}

