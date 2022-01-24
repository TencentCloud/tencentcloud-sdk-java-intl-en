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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillMasterGroupRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 1. The password must contain 8-30 characters. A password of 12 or more characters is recommended.
2. The password cannot start with a slash (/).
3. The password must contain at least two of the following four types:
    a. Lowercase letters (a-z)
    b. Uppercase letters (A-Z)
    c. Digits (0-9)
    d. ()`~!@#$%^&*-+=_|{}[]:;<>,.?/
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Node information of a single-AZ deployed instance
    */
    @SerializedName("ShardIds")
    @Expose
    private Long [] ShardIds;

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
     * Get 1. The password must contain 8-30 characters. A password of 12 or more characters is recommended.
2. The password cannot start with a slash (/).
3. The password must contain at least two of the following four types:
    a. Lowercase letters (a-z)
    b. Uppercase letters (A-Z)
    c. Digits (0-9)
    d. ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 
     * @return Password 1. The password must contain 8-30 characters. A password of 12 or more characters is recommended.
2. The password cannot start with a slash (/).
3. The password must contain at least two of the following four types:
    a. Lowercase letters (a-z)
    b. Uppercase letters (A-Z)
    c. Digits (0-9)
    d. ()`~!@#$%^&*-+=_|{}[]:;<>,.?/
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 1. The password must contain 8-30 characters. A password of 12 or more characters is recommended.
2. The password cannot start with a slash (/).
3. The password must contain at least two of the following four types:
    a. Lowercase letters (a-z)
    b. Uppercase letters (A-Z)
    c. Digits (0-9)
    d. ()`~!@#$%^&*-+=_|{}[]:;<>,.?/
     * @param Password 1. The password must contain 8-30 characters. A password of 12 or more characters is recommended.
2. The password cannot start with a slash (/).
3. The password must contain at least two of the following four types:
    a. Lowercase letters (a-z)
    b. Uppercase letters (A-Z)
    c. Digits (0-9)
    d. ()`~!@#$%^&*-+=_|{}[]:;<>,.?/
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Node information of a single-AZ deployed instance 
     * @return ShardIds Node information of a single-AZ deployed instance
     */
    public Long [] getShardIds() {
        return this.ShardIds;
    }

    /**
     * Set Node information of a single-AZ deployed instance
     * @param ShardIds Node information of a single-AZ deployed instance
     */
    public void setShardIds(Long [] ShardIds) {
        this.ShardIds = ShardIds;
    }

    public KillMasterGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillMasterGroupRequest(KillMasterGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ShardIds != null) {
            this.ShardIds = new Long[source.ShardIds.length];
            for (int i = 0; i < source.ShardIds.length; i++) {
                this.ShardIds[i] = new Long(source.ShardIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "ShardIds.", this.ShardIds);

    }
}

