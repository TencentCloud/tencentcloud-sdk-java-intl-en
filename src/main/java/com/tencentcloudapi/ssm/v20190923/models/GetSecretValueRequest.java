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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSecretValueRequest extends AbstractModel{

    /**
    * Name of a Secret.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * ID of the Secret version.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get Name of a Secret. 
     * @return SecretName Name of a Secret.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of a Secret.
     * @param SecretName Name of a Secret.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get ID of the Secret version. 
     * @return VersionId ID of the Secret version.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set ID of the Secret version.
     * @param VersionId ID of the Secret version.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

