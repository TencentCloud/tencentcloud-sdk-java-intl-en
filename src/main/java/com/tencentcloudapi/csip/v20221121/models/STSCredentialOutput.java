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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class STSCredentialOutput extends AbstractModel {

    /**
    * Credential provider identifier (original), for example tencentCam, aws, aliyun
    */
    @SerializedName("System")
    @Expose
    private String System;

    /**
    * SecretID (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
    */
    @SerializedName("SecretID")
    @Expose
    private String SecretID;

    /**
    * SecretKey (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get Credential provider identifier (original), for example tencentCam, aws, aliyun 
     * @return System Credential provider identifier (original), for example tencentCam, aws, aliyun
     */
    public String getSystem() {
        return this.System;
    }

    /**
     * Set Credential provider identifier (original), for example tencentCam, aws, aliyun
     * @param System Credential provider identifier (original), for example tencentCam, aws, aliyun
     */
    public void setSystem(String System) {
        this.System = System;
    }

    /**
     * Get SecretID (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement. 
     * @return SecretID SecretID (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
     */
    public String getSecretID() {
        return this.SecretID;
    }

    /**
     * Set SecretID (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
     * @param SecretID SecretID (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
     */
    public void setSecretID(String SecretID) {
        this.SecretID = SecretID;
    }

    /**
     * Get SecretKey (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement. 
     * @return SecretKey SecretKey (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set SecretKey (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
     * @param SecretKey SecretKey (masked)
Supplemental description: Reserve the first 3 and last 4 digits, replace the middle with ***. If the length is less than 7, use *** as a complete replacement.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public STSCredentialOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public STSCredentialOutput(STSCredentialOutput source) {
        if (source.System != null) {
            this.System = new String(source.System);
        }
        if (source.SecretID != null) {
            this.SecretID = new String(source.SecretID);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "System", this.System);
        this.setParamSimple(map, prefix + "SecretID", this.SecretID);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

