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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputAuthInfo extends AbstractModel {

    /**
    * Username.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Password.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Username.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Username Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Username Username.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Password.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Password Password.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Password Password.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public InputAuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputAuthInfo(InputAuthInfo source) {
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

