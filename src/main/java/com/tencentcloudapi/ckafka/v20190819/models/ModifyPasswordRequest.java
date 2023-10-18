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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPasswordRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Current user password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * New user password
    */
    @SerializedName("PasswordNew")
    @Expose
    private String PasswordNew;

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
     * Get Username 
     * @return Name Username
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Username
     * @param Name Username
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Current user password 
     * @return Password Current user password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Current user password
     * @param Password Current user password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get New user password 
     * @return PasswordNew New user password
     */
    public String getPasswordNew() {
        return this.PasswordNew;
    }

    /**
     * Set New user password
     * @param PasswordNew New user password
     */
    public void setPasswordNew(String PasswordNew) {
        this.PasswordNew = PasswordNew;
    }

    public ModifyPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPasswordRequest(ModifyPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PasswordNew != null) {
            this.PasswordNew = new String(source.PasswordNew);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordNew", this.PasswordNew);

    }
}

