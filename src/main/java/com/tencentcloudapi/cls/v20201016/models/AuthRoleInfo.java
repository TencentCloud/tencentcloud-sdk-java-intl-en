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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthRoleInfo extends AbstractModel {

    /**
    * <p>Auth role name</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>SecretId of the permission corresponding to the Auth role</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>SecretKey of the permission corresponding to the Auth role</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get <p>Auth role name</p> 
     * @return RoleName <p>Auth role name</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>Auth role name</p>
     * @param RoleName <p>Auth role name</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>SecretId of the permission corresponding to the Auth role</p> 
     * @return SecretId <p>SecretId of the permission corresponding to the Auth role</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>SecretId of the permission corresponding to the Auth role</p>
     * @param SecretId <p>SecretId of the permission corresponding to the Auth role</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>SecretKey of the permission corresponding to the Auth role</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretKey <p>SecretKey of the permission corresponding to the Auth role</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>SecretKey of the permission corresponding to the Auth role</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretKey <p>SecretKey of the permission corresponding to the Auth role</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public AuthRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthRoleInfo(AuthRoleInfo source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

