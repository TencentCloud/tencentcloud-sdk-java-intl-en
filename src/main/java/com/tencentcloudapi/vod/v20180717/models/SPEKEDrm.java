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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SPEKEDrm extends AbstractModel {

    /**
    * <p>Resource tagging. This field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have differences in limitations for this field (for example: Huawei Xloud does not support underscores (_) in this field). For specific rules, contact the DRM manufacturer for confirmation.</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits the number to a maximum of 5 substreams, while DRMtoday only supports up to 9 substream encryptions.</p>
    */
    @SerializedName("KeyServerUrl")
    @Expose
    private String KeyServerUrl;

    /**
    * <p>Initialization vector (32-byte hexadecimal string) for encryption. The field content is user-customized.</p>
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
    * <p>Encryption method. Available values:<br>cbcs: supports PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay;<br>cenc: supports PlayReady, Widevine, Widevine+PlayReady;<br>If left blank, FairPlay defaults to cbcs;<br>PlayReady and Widevine default to cenc;<br>Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay default to cbcs;<br>Widevine+PlayReady defaults to cenc;</p>
    */
    @SerializedName("EncryptionMethod")
    @Expose
    private String EncryptionMethod;

    /**
    * <p>Substream encryption rules, default preset 0<br>preset 0: use the same key to encrypt all substreams;<br>preset 1: use different keys to encrypt each substream;</p>
    */
    @SerializedName("EncryptionPreset")
    @Expose
    private String EncryptionPreset;

    /**
    * <p>DRM manufacturer request method.</p><p>Enumeration value:</p><ul><li>POST: Most DRM manufacturers use the POST method.</li><li>GET: Partial DRM manufacturers support the GET method. At the time of request using this method, the KeyServerUrl field needs to include all request information.</li></ul><p>Default value: POST</p>
    */
    @SerializedName("KeyAcquireMode")
    @Expose
    private String KeyAcquireMode;

    /**
     * Get <p>Resource tagging. This field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have differences in limitations for this field (for example: Huawei Xloud does not support underscores (_) in this field). For specific rules, contact the DRM manufacturer for confirmation.</p> 
     * @return ResourceId <p>Resource tagging. This field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have differences in limitations for this field (for example: Huawei Xloud does not support underscores (_) in this field). For specific rules, contact the DRM manufacturer for confirmation.</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource tagging. This field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have differences in limitations for this field (for example: Huawei Xloud does not support underscores (_) in this field). For specific rules, contact the DRM manufacturer for confirmation.</p>
     * @param ResourceId <p>Resource tagging. This field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have differences in limitations for this field (for example: Huawei Xloud does not support underscores (_) in this field). For specific rules, contact the DRM manufacturer for confirmation.</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits the number to a maximum of 5 substreams, while DRMtoday only supports up to 9 substream encryptions.</p> 
     * @return KeyServerUrl <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits the number to a maximum of 5 substreams, while DRMtoday only supports up to 9 substream encryptions.</p>
     */
    public String getKeyServerUrl() {
        return this.KeyServerUrl;
    }

    /**
     * Set <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits the number to a maximum of 5 substreams, while DRMtoday only supports up to 9 substream encryptions.</p>
     * @param KeyServerUrl <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits the number to a maximum of 5 substreams, while DRMtoday only supports up to 9 substream encryptions.</p>
     */
    public void setKeyServerUrl(String KeyServerUrl) {
        this.KeyServerUrl = KeyServerUrl;
    }

    /**
     * Get <p>Initialization vector (32-byte hexadecimal string) for encryption. The field content is user-customized.</p> 
     * @return Vector <p>Initialization vector (32-byte hexadecimal string) for encryption. The field content is user-customized.</p>
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set <p>Initialization vector (32-byte hexadecimal string) for encryption. The field content is user-customized.</p>
     * @param Vector <p>Initialization vector (32-byte hexadecimal string) for encryption. The field content is user-customized.</p>
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    /**
     * Get <p>Encryption method. Available values:<br>cbcs: supports PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay;<br>cenc: supports PlayReady, Widevine, Widevine+PlayReady;<br>If left blank, FairPlay defaults to cbcs;<br>PlayReady and Widevine default to cenc;<br>Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay default to cbcs;<br>Widevine+PlayReady defaults to cenc;</p> 
     * @return EncryptionMethod <p>Encryption method. Available values:<br>cbcs: supports PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay;<br>cenc: supports PlayReady, Widevine, Widevine+PlayReady;<br>If left blank, FairPlay defaults to cbcs;<br>PlayReady and Widevine default to cenc;<br>Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay default to cbcs;<br>Widevine+PlayReady defaults to cenc;</p>
     */
    public String getEncryptionMethod() {
        return this.EncryptionMethod;
    }

    /**
     * Set <p>Encryption method. Available values:<br>cbcs: supports PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay;<br>cenc: supports PlayReady, Widevine, Widevine+PlayReady;<br>If left blank, FairPlay defaults to cbcs;<br>PlayReady and Widevine default to cenc;<br>Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay default to cbcs;<br>Widevine+PlayReady defaults to cenc;</p>
     * @param EncryptionMethod <p>Encryption method. Available values:<br>cbcs: supports PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay;<br>cenc: supports PlayReady, Widevine, Widevine+PlayReady;<br>If left blank, FairPlay defaults to cbcs;<br>PlayReady and Widevine default to cenc;<br>Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay default to cbcs;<br>Widevine+PlayReady defaults to cenc;</p>
     */
    public void setEncryptionMethod(String EncryptionMethod) {
        this.EncryptionMethod = EncryptionMethod;
    }

    /**
     * Get <p>Substream encryption rules, default preset 0<br>preset 0: use the same key to encrypt all substreams;<br>preset 1: use different keys to encrypt each substream;</p> 
     * @return EncryptionPreset <p>Substream encryption rules, default preset 0<br>preset 0: use the same key to encrypt all substreams;<br>preset 1: use different keys to encrypt each substream;</p>
     */
    public String getEncryptionPreset() {
        return this.EncryptionPreset;
    }

    /**
     * Set <p>Substream encryption rules, default preset 0<br>preset 0: use the same key to encrypt all substreams;<br>preset 1: use different keys to encrypt each substream;</p>
     * @param EncryptionPreset <p>Substream encryption rules, default preset 0<br>preset 0: use the same key to encrypt all substreams;<br>preset 1: use different keys to encrypt each substream;</p>
     */
    public void setEncryptionPreset(String EncryptionPreset) {
        this.EncryptionPreset = EncryptionPreset;
    }

    /**
     * Get <p>DRM manufacturer request method.</p><p>Enumeration value:</p><ul><li>POST: Most DRM manufacturers use the POST method.</li><li>GET: Partial DRM manufacturers support the GET method. At the time of request using this method, the KeyServerUrl field needs to include all request information.</li></ul><p>Default value: POST</p> 
     * @return KeyAcquireMode <p>DRM manufacturer request method.</p><p>Enumeration value:</p><ul><li>POST: Most DRM manufacturers use the POST method.</li><li>GET: Partial DRM manufacturers support the GET method. At the time of request using this method, the KeyServerUrl field needs to include all request information.</li></ul><p>Default value: POST</p>
     */
    public String getKeyAcquireMode() {
        return this.KeyAcquireMode;
    }

    /**
     * Set <p>DRM manufacturer request method.</p><p>Enumeration value:</p><ul><li>POST: Most DRM manufacturers use the POST method.</li><li>GET: Partial DRM manufacturers support the GET method. At the time of request using this method, the KeyServerUrl field needs to include all request information.</li></ul><p>Default value: POST</p>
     * @param KeyAcquireMode <p>DRM manufacturer request method.</p><p>Enumeration value:</p><ul><li>POST: Most DRM manufacturers use the POST method.</li><li>GET: Partial DRM manufacturers support the GET method. At the time of request using this method, the KeyServerUrl field needs to include all request information.</li></ul><p>Default value: POST</p>
     */
    public void setKeyAcquireMode(String KeyAcquireMode) {
        this.KeyAcquireMode = KeyAcquireMode;
    }

    public SPEKEDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SPEKEDrm(SPEKEDrm source) {
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
        if (source.KeyAcquireMode != null) {
            this.KeyAcquireMode = new String(source.KeyAcquireMode);
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
        this.setParamSimple(map, prefix + "KeyAcquireMode", this.KeyAcquireMode);

    }
}

