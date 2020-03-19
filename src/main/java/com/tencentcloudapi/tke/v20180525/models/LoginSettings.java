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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSettings extends AbstractModel{

    /**
    * Login password of the instance. The password requirements vary among different operating systems: <br><li>For Linux instances, the password must be 8-30 characters long and contain at least two of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]. <br><li>For Windows instances, the password must be 12-30 characters long and contain at least three of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, a random password will be generated and sent to you via the Message Center.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call `DescribeKeyPairs` to obtain `KeyId`. Key and password cannot be specified at the same time. Windows instances do not support keys. Currently, you can only specify one key when purchasing an instance.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Whether to keep the original settings of an image. You cannot specify this parameter and `Password` or `KeyIds.N` at the same time. You can specify this parameter as `TRUE` only when you create an instance using a custom image, a shared image, or an imported image. Valid values: <br><li>TRUE: keep the login settings of the image <br><li>FALSE: do not keep the login settings of the image <br><br>Default value: FALSE.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("KeepImageLogin")
    @Expose
    private String KeepImageLogin;

    /**
     * Get Login password of the instance. The password requirements vary among different operating systems: <br><li>For Linux instances, the password must be 8-30 characters long and contain at least two of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]. <br><li>For Windows instances, the password must be 12-30 characters long and contain at least three of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, a random password will be generated and sent to you via the Message Center.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Password Login password of the instance. The password requirements vary among different operating systems: <br><li>For Linux instances, the password must be 8-30 characters long and contain at least two of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]. <br><li>For Windows instances, the password must be 12-30 characters long and contain at least three of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, a random password will be generated and sent to you via the Message Center.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Login password of the instance. The password requirements vary among different operating systems: <br><li>For Linux instances, the password must be 8-30 characters long and contain at least two of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]. <br><li>For Windows instances, the password must be 12-30 characters long and contain at least three of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, a random password will be generated and sent to you via the Message Center.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Password Login password of the instance. The password requirements vary among different operating systems: <br><li>For Linux instances, the password must be 8-30 characters long and contain at least two of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & *  - + = | { } [ ] : ; ' , . ? / ]. <br><li>For Windows instances, the password must be 12-30 characters long and contain at least three of the following categories: [a-z], [A-Z], [0-9] and [( ) \` ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ' , . ? /]. <br><br>If this parameter is not specified, a random password will be generated and sent to you via the Message Center.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call `DescribeKeyPairs` to obtain `KeyId`. Key and password cannot be specified at the same time. Windows instances do not support keys. Currently, you can only specify one key when purchasing an instance.
Note: This field may return null, indicating that no valid value is found. 
     * @return KeyIds List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call `DescribeKeyPairs` to obtain `KeyId`. Key and password cannot be specified at the same time. Windows instances do not support keys. Currently, you can only specify one key when purchasing an instance.
Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call `DescribeKeyPairs` to obtain `KeyId`. Key and password cannot be specified at the same time. Windows instances do not support keys. Currently, you can only specify one key when purchasing an instance.
Note: This field may return null, indicating that no valid value is found.
     * @param KeyIds List of key IDs. After an instance is associated with a key, you can access the instance with the private key in the key pair. You can call `DescribeKeyPairs` to obtain `KeyId`. Key and password cannot be specified at the same time. Windows instances do not support keys. Currently, you can only specify one key when purchasing an instance.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get Whether to keep the original settings of an image. You cannot specify this parameter and `Password` or `KeyIds.N` at the same time. You can specify this parameter as `TRUE` only when you create an instance using a custom image, a shared image, or an imported image. Valid values: <br><li>TRUE: keep the login settings of the image <br><li>FALSE: do not keep the login settings of the image <br><br>Default value: FALSE.
Note: This field may return null, indicating that no valid value is found. 
     * @return KeepImageLogin Whether to keep the original settings of an image. You cannot specify this parameter and `Password` or `KeyIds.N` at the same time. You can specify this parameter as `TRUE` only when you create an instance using a custom image, a shared image, or an imported image. Valid values: <br><li>TRUE: keep the login settings of the image <br><li>FALSE: do not keep the login settings of the image <br><br>Default value: FALSE.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getKeepImageLogin() {
        return this.KeepImageLogin;
    }

    /**
     * Set Whether to keep the original settings of an image. You cannot specify this parameter and `Password` or `KeyIds.N` at the same time. You can specify this parameter as `TRUE` only when you create an instance using a custom image, a shared image, or an imported image. Valid values: <br><li>TRUE: keep the login settings of the image <br><li>FALSE: do not keep the login settings of the image <br><br>Default value: FALSE.
Note: This field may return null, indicating that no valid value is found.
     * @param KeepImageLogin Whether to keep the original settings of an image. You cannot specify this parameter and `Password` or `KeyIds.N` at the same time. You can specify this parameter as `TRUE` only when you create an instance using a custom image, a shared image, or an imported image. Valid values: <br><li>TRUE: keep the login settings of the image <br><li>FALSE: do not keep the login settings of the image <br><br>Default value: FALSE.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setKeepImageLogin(String KeepImageLogin) {
        this.KeepImageLogin = KeepImageLogin;
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

