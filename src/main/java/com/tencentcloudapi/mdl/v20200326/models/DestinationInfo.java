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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationInfo extends AbstractModel{

    /**
    * Relay destination address. Length limit: [1,512].
    */
    @SerializedName("OutputUrl")
    @Expose
    private String OutputUrl;

    /**
    * Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Relay destination address. Length limit: [1,512]. 
     * @return OutputUrl Relay destination address. Length limit: [1,512].
     */
    public String getOutputUrl() {
        return this.OutputUrl;
    }

    /**
     * Set Relay destination address. Length limit: [1,512].
     * @param OutputUrl Relay destination address. Length limit: [1,512].
     */
    public void setOutputUrl(String OutputUrl) {
        this.OutputUrl = OutputUrl;
    }

    /**
     * Get Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthKey Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthKey Authentication key. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Username Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Username Authentication username. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Password Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Password Authentication password. Length limit: [1,128].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputUrl", this.OutputUrl);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

