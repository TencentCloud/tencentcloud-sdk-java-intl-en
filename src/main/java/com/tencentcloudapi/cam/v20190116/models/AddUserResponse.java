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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUserResponse extends AbstractModel {

    /**
    * Sub-user UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-user username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * If the combination of input parameters indicates that a random password should be generated, the generated password is returned
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Sub-user's key ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Sub-user's secret key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Sub-user UIN 
     * @return Uin Sub-user UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Sub-user UIN
     * @param Uin Sub-user UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-user username 
     * @return Name Sub-user username
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sub-user username
     * @param Name Sub-user username
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get If the combination of input parameters indicates that a random password should be generated, the generated password is returned 
     * @return Password If the combination of input parameters indicates that a random password should be generated, the generated password is returned
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set If the combination of input parameters indicates that a random password should be generated, the generated password is returned
     * @param Password If the combination of input parameters indicates that a random password should be generated, the generated password is returned
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Sub-user's key ID 
     * @return SecretId Sub-user's key ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Sub-user's key ID
     * @param SecretId Sub-user's key ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get Sub-user's secret key 
     * @return SecretKey Sub-user's secret key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Sub-user's secret key
     * @param SecretKey Sub-user's secret key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Sub-user UID 
     * @return Uid Sub-user UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Sub-user UID
     * @param Uid Sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public AddUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserResponse(AddUserResponse source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

