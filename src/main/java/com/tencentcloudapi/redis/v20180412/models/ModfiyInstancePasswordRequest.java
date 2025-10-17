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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModfiyInstancePasswordRequest extends AbstractModel {

    /**
    * Instance ID, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Old password of an instance
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
    * New instance password. The password complexity requirements are as follows:
 - It should contain 8 to 64 characters. 12 or more characters are recommended.
 - It cannot start with a forward slash (/).
 - It should contain at least two of the following types: lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Whether to encrypt the password.
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get Instance ID, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list. 
     * @return InstanceId Instance ID, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     * @param InstanceId Instance ID, such as "crs-xjhsdj****". Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Old password of an instance 
     * @return OldPassword Old password of an instance
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * Set Old password of an instance
     * @param OldPassword Old password of an instance
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    /**
     * Get New instance password. The password complexity requirements are as follows:
 - It should contain 8 to 64 characters. 12 or more characters are recommended.
 - It cannot start with a forward slash (/).
 - It should contain at least two of the following types: lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/). 
     * @return Password New instance password. The password complexity requirements are as follows:
 - It should contain 8 to 64 characters. 12 or more characters are recommended.
 - It cannot start with a forward slash (/).
 - It should contain at least two of the following types: lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set New instance password. The password complexity requirements are as follows:
 - It should contain 8 to 64 characters. 12 or more characters are recommended.
 - It cannot start with a forward slash (/).
 - It should contain at least two of the following types: lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     * @param Password New instance password. The password complexity requirements are as follows:
 - It should contain 8 to 64 characters. 12 or more characters are recommended.
 - It cannot start with a forward slash (/).
 - It should contain at least two of the following types: lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Whether to encrypt the password. 
     * @return EncryptPassword Whether to encrypt the password.
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set Whether to encrypt the password.
     * @param EncryptPassword Whether to encrypt the password.
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
    }

    public ModfiyInstancePasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModfiyInstancePasswordRequest(ModfiyInstancePasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldPassword != null) {
            this.OldPassword = new String(source.OldPassword);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);

    }
}

