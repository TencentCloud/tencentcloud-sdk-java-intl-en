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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckLogKafkaConnectionStateRequest extends AbstractModel {

    /**
    * Access method: 1 - public network domain name access; 2 - supported environment access
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * Access address: domain name or IP, with port
    */
    @SerializedName("AccessAddr")
    @Expose
    private String AccessAddr;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 0 - without password; 1 - with password
    */
    @SerializedName("HasPwd")
    @Expose
    private Long HasPwd;

    /**
    * Password, using AES encryption
    */
    @SerializedName("Pwd")
    @Expose
    private String Pwd;

    /**
    * Kafka instance ID
    */
    @SerializedName("KafkaId")
    @Expose
    private String KafkaId;

    /**
    * Kafka version
    */
    @SerializedName("InsVersion")
    @Expose
    private String InsVersion;

    /**
     * Get Access method: 1 - public network domain name access; 2 - supported environment access 
     * @return AccessType Access method: 1 - public network domain name access; 2 - supported environment access
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access method: 1 - public network domain name access; 2 - supported environment access
     * @param AccessType Access method: 1 - public network domain name access; 2 - supported environment access
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Access address: domain name or IP, with port 
     * @return AccessAddr Access address: domain name or IP, with port
     */
    public String getAccessAddr() {
        return this.AccessAddr;
    }

    /**
     * Set Access address: domain name or IP, with port
     * @param AccessAddr Access address: domain name or IP, with port
     */
    public void setAccessAddr(String AccessAddr) {
        this.AccessAddr = AccessAddr;
    }

    /**
     * Get Username 
     * @return Username Username
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
     * @param Username Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 0 - without password; 1 - with password 
     * @return HasPwd 0 - without password; 1 - with password
     */
    public Long getHasPwd() {
        return this.HasPwd;
    }

    /**
     * Set 0 - without password; 1 - with password
     * @param HasPwd 0 - without password; 1 - with password
     */
    public void setHasPwd(Long HasPwd) {
        this.HasPwd = HasPwd;
    }

    /**
     * Get Password, using AES encryption 
     * @return Pwd Password, using AES encryption
     */
    public String getPwd() {
        return this.Pwd;
    }

    /**
     * Set Password, using AES encryption
     * @param Pwd Password, using AES encryption
     */
    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    /**
     * Get Kafka instance ID 
     * @return KafkaId Kafka instance ID
     */
    public String getKafkaId() {
        return this.KafkaId;
    }

    /**
     * Set Kafka instance ID
     * @param KafkaId Kafka instance ID
     */
    public void setKafkaId(String KafkaId) {
        this.KafkaId = KafkaId;
    }

    /**
     * Get Kafka version 
     * @return InsVersion Kafka version
     */
    public String getInsVersion() {
        return this.InsVersion;
    }

    /**
     * Set Kafka version
     * @param InsVersion Kafka version
     */
    public void setInsVersion(String InsVersion) {
        this.InsVersion = InsVersion;
    }

    public CheckLogKafkaConnectionStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckLogKafkaConnectionStateRequest(CheckLogKafkaConnectionStateRequest source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AccessAddr != null) {
            this.AccessAddr = new String(source.AccessAddr);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.HasPwd != null) {
            this.HasPwd = new Long(source.HasPwd);
        }
        if (source.Pwd != null) {
            this.Pwd = new String(source.Pwd);
        }
        if (source.KafkaId != null) {
            this.KafkaId = new String(source.KafkaId);
        }
        if (source.InsVersion != null) {
            this.InsVersion = new String(source.InsVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccessAddr", this.AccessAddr);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "HasPwd", this.HasPwd);
        this.setParamSimple(map, prefix + "Pwd", this.Pwd);
        this.setParamSimple(map, prefix + "KafkaId", this.KafkaId);
        this.setParamSimple(map, prefix + "InsVersion", this.InsVersion);

    }
}

