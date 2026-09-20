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
    * <p>Resource tagging. The field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have different restrictions on this field (for example, SDMC does not support underscores in this field). For specific rules, please confirm with the DRM manufacturer.</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits it to no more than 5 substreams, while DRMtoday supports a maximum of 9 substreams for encryption.</p>
    */
    @SerializedName("KeyServerUrl")
    @Expose
    private String KeyServerUrl;

    /**
    * <p>Encryption initialization vector (32-byte hexadecimal string). The field content is user-customized.</p>
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
    * <p>Encryption method. Available values:<br>cbcs: PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay supported;<br>cenc: PlayReady, Widevine, Widevine+PlayReady supported;<br>If left blank, cbcs is used by default for FairPlay;<br>cenc is used by default for PlayReady and Widevine;<br>cbcs is used by default for Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay;<br>cenc is used by default for Widevine+PlayReady;</p>
    */
    @SerializedName("EncryptionMethod")
    @Expose
    private String EncryptionMethod;

    /**
    * <p>Substream encryption rule. Default value: preset0.<br>preset0: All substreams use the same key for encryption.<br>preset1: Each substream uses a different key for encryption.</p>
    */
    @SerializedName("EncryptionPreset")
    @Expose
    private String EncryptionPreset;

    /**
    * <p>Request method of the DRM manufacturer.</p><p>Enumeration values:</p><ul><li>POST: Most DRM manufacturers use the POST method for requests.</li><li>GET: Some DRM manufacturers support the GET method for requests. When using this method, request information needs to be included in the KeyServerUrl field.</li></ul><p>Default value: POST</p>
    */
    @SerializedName("KeyAcquireMode")
    @Expose
    private String KeyAcquireMode;

    /**
     * Get <p>Resource tagging. The field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have different restrictions on this field (for example, SDMC does not support underscores in this field). For specific rules, please confirm with the DRM manufacturer.</p> 
     * @return ResourceId <p>Resource tagging. The field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have different restrictions on this field (for example, SDMC does not support underscores in this field). For specific rules, please confirm with the DRM manufacturer.</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource tagging. The field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have different restrictions on this field (for example, SDMC does not support underscores in this field). For specific rules, please confirm with the DRM manufacturer.</p>
     * @param ResourceId <p>Resource tagging. The field content is user-customized. It supports 1-128 characters, including numbers, letters, underscores (_), and hyphens (-). This field corresponds to the cid field in the Speke request. Note: Different DRM manufacturers have different restrictions on this field (for example, SDMC does not support underscores in this field). For specific rules, please confirm with the DRM manufacturer.</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits it to no more than 5 substreams, while DRMtoday supports a maximum of 9 substreams for encryption.</p> 
     * @return KeyServerUrl <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits it to no more than 5 substreams, while DRMtoday supports a maximum of 9 substreams for encryption.</p>
     */
    public String getKeyServerUrl() {
        return this.KeyServerUrl;
    }

    /**
     * Set <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits it to no more than 5 substreams, while DRMtoday supports a maximum of 9 substreams for encryption.</p>
     * @param KeyServerUrl <p>DRM manufacturer access address. The field content is obtained from the DRM manufacturer. Note: Different DRM manufacturers have different limits on the number of substreams. For example, PallyCon limits it to no more than 5 substreams, while DRMtoday supports a maximum of 9 substreams for encryption.</p>
     */
    public void setKeyServerUrl(String KeyServerUrl) {
        this.KeyServerUrl = KeyServerUrl;
    }

    /**
     * Get <p>Encryption initialization vector (32-byte hexadecimal string). The field content is user-customized.</p> 
     * @return Vector <p>Encryption initialization vector (32-byte hexadecimal string). The field content is user-customized.</p>
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set <p>Encryption initialization vector (32-byte hexadecimal string). The field content is user-customized.</p>
     * @param Vector <p>Encryption initialization vector (32-byte hexadecimal string). The field content is user-customized.</p>
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    /**
     * Get <p>Encryption method. Available values:<br>cbcs: PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay supported;<br>cenc: PlayReady, Widevine, Widevine+PlayReady supported;<br>If left blank, cbcs is used by default for FairPlay;<br>cenc is used by default for PlayReady and Widevine;<br>cbcs is used by default for Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay;<br>cenc is used by default for Widevine+PlayReady;</p> 
     * @return EncryptionMethod <p>Encryption method. Available values:<br>cbcs: PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay supported;<br>cenc: PlayReady, Widevine, Widevine+PlayReady supported;<br>If left blank, cbcs is used by default for FairPlay;<br>cenc is used by default for PlayReady and Widevine;<br>cbcs is used by default for Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay;<br>cenc is used by default for Widevine+PlayReady;</p>
     */
    public String getEncryptionMethod() {
        return this.EncryptionMethod;
    }

    /**
     * Set <p>Encryption method. Available values:<br>cbcs: PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay supported;<br>cenc: PlayReady, Widevine, Widevine+PlayReady supported;<br>If left blank, cbcs is used by default for FairPlay;<br>cenc is used by default for PlayReady and Widevine;<br>cbcs is used by default for Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay;<br>cenc is used by default for Widevine+PlayReady;</p>
     * @param EncryptionMethod <p>Encryption method. Available values:<br>cbcs: PlayReady, Widevine, FairPlay, Widevine+FairPlay, Widevine+PlayReady, PlayReady+FairPlay, Widevine+PlayReady+FairPlay supported;<br>cenc: PlayReady, Widevine, Widevine+PlayReady supported;<br>If left blank, cbcs is used by default for FairPlay;<br>cenc is used by default for PlayReady and Widevine;<br>cbcs is used by default for Widevine+FairPlay, PlayReady+FairPlay, and Widevine+PlayReady+FairPlay;<br>cenc is used by default for Widevine+PlayReady;</p>
     */
    public void setEncryptionMethod(String EncryptionMethod) {
        this.EncryptionMethod = EncryptionMethod;
    }

    /**
     * Get <p>Substream encryption rule. Default value: preset0.<br>preset0: All substreams use the same key for encryption.<br>preset1: Each substream uses a different key for encryption.</p> 
     * @return EncryptionPreset <p>Substream encryption rule. Default value: preset0.<br>preset0: All substreams use the same key for encryption.<br>preset1: Each substream uses a different key for encryption.</p>
     */
    public String getEncryptionPreset() {
        return this.EncryptionPreset;
    }

    /**
     * Set <p>Substream encryption rule. Default value: preset0.<br>preset0: All substreams use the same key for encryption.<br>preset1: Each substream uses a different key for encryption.</p>
     * @param EncryptionPreset <p>Substream encryption rule. Default value: preset0.<br>preset0: All substreams use the same key for encryption.<br>preset1: Each substream uses a different key for encryption.</p>
     */
    public void setEncryptionPreset(String EncryptionPreset) {
        this.EncryptionPreset = EncryptionPreset;
    }

    /**
     * Get <p>Request method of the DRM manufacturer.</p><p>Enumeration values:</p><ul><li>POST: Most DRM manufacturers use the POST method for requests.</li><li>GET: Some DRM manufacturers support the GET method for requests. When using this method, request information needs to be included in the KeyServerUrl field.</li></ul><p>Default value: POST</p> 
     * @return KeyAcquireMode <p>Request method of the DRM manufacturer.</p><p>Enumeration values:</p><ul><li>POST: Most DRM manufacturers use the POST method for requests.</li><li>GET: Some DRM manufacturers support the GET method for requests. When using this method, request information needs to be included in the KeyServerUrl field.</li></ul><p>Default value: POST</p>
     */
    public String getKeyAcquireMode() {
        return this.KeyAcquireMode;
    }

    /**
     * Set <p>Request method of the DRM manufacturer.</p><p>Enumeration values:</p><ul><li>POST: Most DRM manufacturers use the POST method for requests.</li><li>GET: Some DRM manufacturers support the GET method for requests. When using this method, request information needs to be included in the KeyServerUrl field.</li></ul><p>Default value: POST</p>
     * @param KeyAcquireMode <p>Request method of the DRM manufacturer.</p><p>Enumeration values:</p><ul><li>POST: Most DRM manufacturers use the POST method for requests.</li><li>GET: Some DRM manufacturers support the GET method for requests. When using this method, request information needs to be included in the KeyServerUrl field.</li></ul><p>Default value: POST</p>
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

