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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpekeDrm extends AbstractModel {

    /**
    * Resource tagging. the field content is user-customized.
It supports 1 to 128 characters consisting of digits, letters, underscores (_), and hyphens (-).
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * DRM manufacturer access address. the field content is obtained from the drm manufacturer.

Note: different DRM manufacturers have different limitations on the number of substreams. for example, PallyCon limits the number of substreams to no more than 5, and DRMtoday only supports encryption of up to 9 substreams.
    */
    @SerializedName("KeyServerUrl")
    @Expose
    private String KeyServerUrl;

    /**
    * Encryption initialization vector (32-byte string). the field content is user-customized.
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
    * Encryption method. cbcs: default method of FairPlay; cenc: default method of PlayReady and Widevine.

cbcs: supported by PlayReady, Widevine, and FairPlay
cenc: supported by PlayReady and Widevine
    */
    @SerializedName("EncryptionMethod")
    @Expose
    private String EncryptionMethod;

    /**
    * Substream encryption rule. Default value: preset0.
preset 0: use the same key to encrypt all substreams
preset1: use different keys for each substream

    */
    @SerializedName("EncryptionPreset")
    @Expose
    private String EncryptionPreset;

    /**
     * Get Resource tagging. the field content is user-customized.
It supports 1 to 128 characters consisting of digits, letters, underscores (_), and hyphens (-). 
     * @return ResourceId Resource tagging. the field content is user-customized.
It supports 1 to 128 characters consisting of digits, letters, underscores (_), and hyphens (-).
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource tagging. the field content is user-customized.
It supports 1 to 128 characters consisting of digits, letters, underscores (_), and hyphens (-).
     * @param ResourceId Resource tagging. the field content is user-customized.
It supports 1 to 128 characters consisting of digits, letters, underscores (_), and hyphens (-).
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get DRM manufacturer access address. the field content is obtained from the drm manufacturer.

Note: different DRM manufacturers have different limitations on the number of substreams. for example, PallyCon limits the number of substreams to no more than 5, and DRMtoday only supports encryption of up to 9 substreams. 
     * @return KeyServerUrl DRM manufacturer access address. the field content is obtained from the drm manufacturer.

Note: different DRM manufacturers have different limitations on the number of substreams. for example, PallyCon limits the number of substreams to no more than 5, and DRMtoday only supports encryption of up to 9 substreams.
     */
    public String getKeyServerUrl() {
        return this.KeyServerUrl;
    }

    /**
     * Set DRM manufacturer access address. the field content is obtained from the drm manufacturer.

Note: different DRM manufacturers have different limitations on the number of substreams. for example, PallyCon limits the number of substreams to no more than 5, and DRMtoday only supports encryption of up to 9 substreams.
     * @param KeyServerUrl DRM manufacturer access address. the field content is obtained from the drm manufacturer.

Note: different DRM manufacturers have different limitations on the number of substreams. for example, PallyCon limits the number of substreams to no more than 5, and DRMtoday only supports encryption of up to 9 substreams.
     */
    public void setKeyServerUrl(String KeyServerUrl) {
        this.KeyServerUrl = KeyServerUrl;
    }

    /**
     * Get Encryption initialization vector (32-byte string). the field content is user-customized. 
     * @return Vector Encryption initialization vector (32-byte string). the field content is user-customized.
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set Encryption initialization vector (32-byte string). the field content is user-customized.
     * @param Vector Encryption initialization vector (32-byte string). the field content is user-customized.
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    /**
     * Get Encryption method. cbcs: default method of FairPlay; cenc: default method of PlayReady and Widevine.

cbcs: supported by PlayReady, Widevine, and FairPlay
cenc: supported by PlayReady and Widevine 
     * @return EncryptionMethod Encryption method. cbcs: default method of FairPlay; cenc: default method of PlayReady and Widevine.

cbcs: supported by PlayReady, Widevine, and FairPlay
cenc: supported by PlayReady and Widevine
     */
    public String getEncryptionMethod() {
        return this.EncryptionMethod;
    }

    /**
     * Set Encryption method. cbcs: default method of FairPlay; cenc: default method of PlayReady and Widevine.

cbcs: supported by PlayReady, Widevine, and FairPlay
cenc: supported by PlayReady and Widevine
     * @param EncryptionMethod Encryption method. cbcs: default method of FairPlay; cenc: default method of PlayReady and Widevine.

cbcs: supported by PlayReady, Widevine, and FairPlay
cenc: supported by PlayReady and Widevine
     */
    public void setEncryptionMethod(String EncryptionMethod) {
        this.EncryptionMethod = EncryptionMethod;
    }

    /**
     * Get Substream encryption rule. Default value: preset0.
preset 0: use the same key to encrypt all substreams
preset1: use different keys for each substream
 
     * @return EncryptionPreset Substream encryption rule. Default value: preset0.
preset 0: use the same key to encrypt all substreams
preset1: use different keys for each substream

     */
    public String getEncryptionPreset() {
        return this.EncryptionPreset;
    }

    /**
     * Set Substream encryption rule. Default value: preset0.
preset 0: use the same key to encrypt all substreams
preset1: use different keys for each substream

     * @param EncryptionPreset Substream encryption rule. Default value: preset0.
preset 0: use the same key to encrypt all substreams
preset1: use different keys for each substream

     */
    public void setEncryptionPreset(String EncryptionPreset) {
        this.EncryptionPreset = EncryptionPreset;
    }

    public SpekeDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpekeDrm(SpekeDrm source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.KeyServerUrl != null) {
            this.KeyServerUrl = new String(source.KeyServerUrl);
        }
        if (source.Vector != null) {
            this.Vector = new String(source.Vector);
        }
        if (source.EncryptionMethod != null) {
            this.EncryptionMethod = new String(source.EncryptionMethod);
        }
        if (source.EncryptionPreset != null) {
            this.EncryptionPreset = new String(source.EncryptionPreset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "KeyServerUrl", this.KeyServerUrl);
        this.setParamSimple(map, prefix + "Vector", this.Vector);
        this.setParamSimple(map, prefix + "EncryptionMethod", this.EncryptionMethod);
        this.setParamSimple(map, prefix + "EncryptionPreset", this.EncryptionPreset);

    }
}

