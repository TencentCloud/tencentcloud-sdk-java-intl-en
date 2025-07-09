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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginPrivateParameters extends AbstractModel {

    /**
    * Authentication parameter access key id.
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * Authentication parameter secret access key.
    */
    @SerializedName("SecretAccessKey")
    @Expose
    private String SecretAccessKey;

    /**
    * Authentication version. values:.
<Li>V2: v2 version;</li>.
<Li>V4: v4 version.</li>.
    */
    @SerializedName("SignatureVersion")
    @Expose
    private String SignatureVersion;

    /**
    * Region of the bucket.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Authentication parameter access key id. 
     * @return AccessKeyId Authentication parameter access key id.
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set Authentication parameter access key id.
     * @param AccessKeyId Authentication parameter access key id.
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get Authentication parameter secret access key. 
     * @return SecretAccessKey Authentication parameter secret access key.
     */
    public String getSecretAccessKey() {
        return this.SecretAccessKey;
    }

    /**
     * Set Authentication parameter secret access key.
     * @param SecretAccessKey Authentication parameter secret access key.
     */
    public void setSecretAccessKey(String SecretAccessKey) {
        this.SecretAccessKey = SecretAccessKey;
    }

    /**
     * Get Authentication version. values:.
<Li>V2: v2 version;</li>.
<Li>V4: v4 version.</li>. 
     * @return SignatureVersion Authentication version. values:.
<Li>V2: v2 version;</li>.
<Li>V4: v4 version.</li>.
     */
    public String getSignatureVersion() {
        return this.SignatureVersion;
    }

    /**
     * Set Authentication version. values:.
<Li>V2: v2 version;</li>.
<Li>V4: v4 version.</li>.
     * @param SignatureVersion Authentication version. values:.
<Li>V2: v2 version;</li>.
<Li>V4: v4 version.</li>.
     */
    public void setSignatureVersion(String SignatureVersion) {
        this.SignatureVersion = SignatureVersion;
    }

    /**
     * Get Region of the bucket. 
     * @return Region Region of the bucket.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the bucket.
     * @param Region Region of the bucket.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public OriginPrivateParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginPrivateParameters(OriginPrivateParameters source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretAccessKey != null) {
            this.SecretAccessKey = new String(source.SecretAccessKey);
        }
        if (source.SignatureVersion != null) {
            this.SignatureVersion = new String(source.SignatureVersion);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretAccessKey", this.SecretAccessKey);
        this.setParamSimple(map, prefix + "SignatureVersion", this.SignatureVersion);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

