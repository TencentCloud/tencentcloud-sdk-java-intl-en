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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrImageInfo extends AbstractModel {

    /**
    * Hash value
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * Image size in bytes
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Tag name
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Artifact type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * KMS signature information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KmsSignature")
    @Expose
    private String KmsSignature;

    /**
     * Get Hash value 
     * @return Digest Hash value
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set Hash value
     * @param Digest Hash value
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get Image size in bytes 
     * @return Size Image size in bytes
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Image size in bytes
     * @param Size Image size in bytes
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Tag name 
     * @return ImageVersion Tag name
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Tag name
     * @param ImageVersion Tag name
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Artifact type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Kind Artifact type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Artifact type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Kind Artifact type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get KMS signature information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KmsSignature KMS signature information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKmsSignature() {
        return this.KmsSignature;
    }

    /**
     * Set KMS signature information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KmsSignature KMS signature information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKmsSignature(String KmsSignature) {
        this.KmsSignature = KmsSignature;
    }

    public TcrImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrImageInfo(TcrImageInfo source) {
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.KmsSignature != null) {
            this.KmsSignature = new String(source.KmsSignature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "KmsSignature", this.KmsSignature);

    }
}

