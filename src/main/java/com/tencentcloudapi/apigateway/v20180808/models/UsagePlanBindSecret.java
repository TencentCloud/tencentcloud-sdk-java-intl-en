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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsagePlanBindSecret extends AbstractModel {

    /**
    * Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * Key name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Key status. 0: disabled. 1: enabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Key ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccessKeyId Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccessKeyId Key ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get Key name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SecretName Key name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Key name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SecretName Key name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Key status. 0: disabled. 1: enabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Key status. 0: disabled. 1: enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Key status. 0: disabled. 1: enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Key status. 0: disabled. 1: enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UsagePlanBindSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanBindSecret(UsagePlanBindSecret source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

