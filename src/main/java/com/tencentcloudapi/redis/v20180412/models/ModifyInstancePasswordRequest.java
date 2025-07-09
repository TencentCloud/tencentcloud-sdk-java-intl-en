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

public class ModifyInstancePasswordRequest extends AbstractModel {

    /**
    * Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Old password of the instance.
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
    * New password of the instance. The password complexity requirements are as follows:
- It can contain 8 to 30 characters. It is recommended to use a password of more than 12 characters.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list. 
     * @return InstanceId Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     * @param InstanceId Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Old password of the instance. 
     * @return OldPassword Old password of the instance.
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * Set Old password of the instance.
     * @param OldPassword Old password of the instance.
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    /**
     * Get New password of the instance. The password complexity requirements are as follows:
- It can contain 8 to 30 characters. It is recommended to use a password of more than 12 characters.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/). 
     * @return Password New password of the instance. The password complexity requirements are as follows:
- It can contain 8 to 30 characters. It is recommended to use a password of more than 12 characters.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set New password of the instance. The password complexity requirements are as follows:
- It can contain 8 to 30 characters. It is recommended to use a password of more than 12 characters.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     * @param Password New password of the instance. The password complexity requirements are as follows:
- It can contain 8 to 30 characters. It is recommended to use a password of more than 12 characters.
- It cannot start with a forward slash (/).
- It should contain at least two of the following types: lowercase letters, uppercase letters, digits, and special characters (such as ()~!@#$%^&*-+=_|{}[]:;<>,.?/).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ModifyInstancePasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancePasswordRequest(ModifyInstancePasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldPassword != null) {
            this.OldPassword = new String(source.OldPassword);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

