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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSettings extends AbstractModel {

    /**
    * Instance login password. The password complexity limits vary with the operating system type as follows: <br><li>The Linux instance password must be 8 to 30 characters long and include at least two of the following: [a-z], [A-Z], [0-9], and special characters of [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? / ]. <br><li>The Windows instance password must be 12 to 30 characters long and include at least three of the following: [a-z], [A-Z], [0-9], and special characters [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, you need to set it before login by using the console to "reset password" or by calling the ResetInstancesPassword API.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call [`DescribeKeyPairs`](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `KeyId`. You cannot specify a key and a password at the same time. Windows instances do not support keys.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Retain the original settings of the image. this parameter cannot be specified simultaneously with Password or KeyIds.N. it can be set to true only when an instance is created with a custom image, shared image, or externally imported image. value ranges from true to false: <li>true: indicates that the login settings of the image are retained</li><li>false: indicates that the login settings of the image are not retained</li>. default value: false.
    */
    @SerializedName("KeepImageLogin")
    @Expose
    private String KeepImageLogin;

    /**
     * Get Instance login password. The password complexity limits vary with the operating system type as follows: <br><li>The Linux instance password must be 8 to 30 characters long and include at least two of the following: [a-z], [A-Z], [0-9], and special characters of [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? / ]. <br><li>The Windows instance password must be 12 to 30 characters long and include at least three of the following: [a-z], [A-Z], [0-9], and special characters [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, you need to set it before login by using the console to "reset password" or by calling the ResetInstancesPassword API. 
     * @return Password Instance login password. The password complexity limits vary with the operating system type as follows: <br><li>The Linux instance password must be 8 to 30 characters long and include at least two of the following: [a-z], [A-Z], [0-9], and special characters of [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? / ]. <br><li>The Windows instance password must be 12 to 30 characters long and include at least three of the following: [a-z], [A-Z], [0-9], and special characters [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, you need to set it before login by using the console to "reset password" or by calling the ResetInstancesPassword API.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance login password. The password complexity limits vary with the operating system type as follows: <br><li>The Linux instance password must be 8 to 30 characters long and include at least two of the following: [a-z], [A-Z], [0-9], and special characters of [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? / ]. <br><li>The Windows instance password must be 12 to 30 characters long and include at least three of the following: [a-z], [A-Z], [0-9], and special characters [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, you need to set it before login by using the console to "reset password" or by calling the ResetInstancesPassword API.
     * @param Password Instance login password. The password complexity limits vary with the operating system type as follows: <br><li>The Linux instance password must be 8 to 30 characters long and include at least two of the following: [a-z], [A-Z], [0-9], and special characters of [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? / ]. <br><li>The Windows instance password must be 12 to 30 characters long and include at least three of the following: [a-z], [A-Z], [0-9], and special characters [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, you need to set it before login by using the console to "reset password" or by calling the ResetInstancesPassword API.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call [`DescribeKeyPairs`](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `KeyId`. You cannot specify a key and a password at the same time. Windows instances do not support keys.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return KeyIds List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call [`DescribeKeyPairs`](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `KeyId`. You cannot specify a key and a password at the same time. Windows instances do not support keys.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call [`DescribeKeyPairs`](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `KeyId`. You cannot specify a key and a password at the same time. Windows instances do not support keys.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param KeyIds List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call [`DescribeKeyPairs`](https://intl.cloud.tencent.com/document/api/213/15699?from_cn_redirect=1) to obtain `KeyId`. You cannot specify a key and a password at the same time. Windows instances do not support keys.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get Retain the original settings of the image. this parameter cannot be specified simultaneously with Password or KeyIds.N. it can be set to true only when an instance is created with a custom image, shared image, or externally imported image. value ranges from true to false: <li>true: indicates that the login settings of the image are retained</li><li>false: indicates that the login settings of the image are not retained</li>. default value: false. 
     * @return KeepImageLogin Retain the original settings of the image. this parameter cannot be specified simultaneously with Password or KeyIds.N. it can be set to true only when an instance is created with a custom image, shared image, or externally imported image. value ranges from true to false: <li>true: indicates that the login settings of the image are retained</li><li>false: indicates that the login settings of the image are not retained</li>. default value: false.
     */
    public String getKeepImageLogin() {
        return this.KeepImageLogin;
    }

    /**
     * Set Retain the original settings of the image. this parameter cannot be specified simultaneously with Password or KeyIds.N. it can be set to true only when an instance is created with a custom image, shared image, or externally imported image. value ranges from true to false: <li>true: indicates that the login settings of the image are retained</li><li>false: indicates that the login settings of the image are not retained</li>. default value: false.
     * @param KeepImageLogin Retain the original settings of the image. this parameter cannot be specified simultaneously with Password or KeyIds.N. it can be set to true only when an instance is created with a custom image, shared image, or externally imported image. value ranges from true to false: <li>true: indicates that the login settings of the image are retained</li><li>false: indicates that the login settings of the image are not retained</li>. default value: false.
     */
    public void setKeepImageLogin(String KeepImageLogin) {
        this.KeepImageLogin = KeepImageLogin;
    }

    public LoginSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginSettings(LoginSettings source) {
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.KeepImageLogin != null) {
            this.KeepImageLogin = new String(source.KeepImageLogin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "KeepImageLogin", this.KeepImageLogin);

    }
}

