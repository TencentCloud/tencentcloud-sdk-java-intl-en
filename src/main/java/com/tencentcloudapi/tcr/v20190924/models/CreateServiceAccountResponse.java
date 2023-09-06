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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceAccountResponse extends AbstractModel{

    /**
    * Service account name (the prefix `tcr$` is automatically added)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Service account password, which is displayed only once
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Expiry time of the service account (timestamp)
    */
    @SerializedName("ExpiresAt")
    @Expose
    private Long ExpiresAt;

    /**
    * Creation time of the service account
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Service account name (the prefix `tcr$` is automatically added) 
     * @return Name Service account name (the prefix `tcr$` is automatically added)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service account name (the prefix `tcr$` is automatically added)
     * @param Name Service account name (the prefix `tcr$` is automatically added)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Service account password, which is displayed only once 
     * @return Password Service account password, which is displayed only once
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Service account password, which is displayed only once
     * @param Password Service account password, which is displayed only once
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Expiry time of the service account (timestamp) 
     * @return ExpiresAt Expiry time of the service account (timestamp)
     */
    public Long getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set Expiry time of the service account (timestamp)
     * @param ExpiresAt Expiry time of the service account (timestamp)
     */
    public void setExpiresAt(Long ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get Creation time of the service account 
     * @return CreateTime Creation time of the service account
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the service account
     * @param CreateTime Creation time of the service account
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    public CreateServiceAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceAccountResponse(CreateServiceAccountResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ExpiresAt != null) {
            this.ExpiresAt = new Long(source.ExpiresAt);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

