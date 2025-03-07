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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DRMInfo extends AbstractModel {

    /**
    * Encryption method, optional values: `CBCS`, `CENC`.
    */
    @SerializedName("EncryptionMethod")
    @Expose
    private String EncryptionMethod;

    /**
    * DRM system providers, when the encryption method is CBCS, the optional values are `PlayReady`, `Widevine`, `FairPlay`; when the encryption method is CENC, the oprional values are `PlayReady`, `Widevine`.
    */
    @SerializedName("DRMSystems")
    @Expose
    private String [] DRMSystems;

    /**
    * The resource ID sent to the key server. It can contain 1 to 128 characters, including numbers, letters, underscores (_), and hyphens (-).
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * Key server address; must start with https://.
    */
    @SerializedName("KeyServerUrl")
    @Expose
    private String KeyServerUrl;

    /**
    * Video encryption presets, options: 
`Preset Video 1` - Encrypts all video tracks with one key
`Preset Video 2` - Encrypts SD and HD video tracks with 2 different keys
`Preset Video 3` - Encrypts SD, HD and UHD video tracks with 3 different keys
`Preset Video 4` - Encrypts SD, HD, UHD1 and UHD2 video tracks with 4 different keys
`Preset Video 5` - Encrypts SD, HD1, HD2, UHD1 and UHD2 video tracks with 5 different keys
`Preset Video 6` - Encrypts SD, HD1, HD2, UHD video tracks with 4 different keys
`Preset Video 7` - Encrypts SD + HD1, HD2, UHD video tracks with 3 different keys
`Preset Video 8` - Encrypts SD + HD1, HD2, UHD1, UHD2 video tracks with 4 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
    */
    @SerializedName("VideoEncryptionPreset")
    @Expose
    private String VideoEncryptionPreset;

    /**
    * Audio encryption presets, options:
`Preset Audio 1` - Encrypts all audio tracks with one key
`Preset Audio 2` - Encrypts STEREO and MULTICHANNEL audio tracks with 2 different keys
`Preset Audio 3` - Encrypts STEREO, MULTICHANNEL 3-6 and MULTICHANNEL 7 audio tracks with 3 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
    */
    @SerializedName("AudioEncryptionPreset")
    @Expose
    private String AudioEncryptionPreset;

    /**
    * Optional, used together with the key to encrypt the content; a 128-bit, 32-character, hexadecimal-encoded string.
    */
    @SerializedName("ConstantInitializationVector")
    @Expose
    private String ConstantInitializationVector;

    /**
    * Optional, specifies the rotation interval in seconds; empty, or an integer between 300-2592000.
    */
    @SerializedName("KeyRotationInterval")
    @Expose
    private Long KeyRotationInterval;

    /**
     * Get Encryption method, optional values: `CBCS`, `CENC`. 
     * @return EncryptionMethod Encryption method, optional values: `CBCS`, `CENC`.
     */
    public String getEncryptionMethod() {
        return this.EncryptionMethod;
    }

    /**
     * Set Encryption method, optional values: `CBCS`, `CENC`.
     * @param EncryptionMethod Encryption method, optional values: `CBCS`, `CENC`.
     */
    public void setEncryptionMethod(String EncryptionMethod) {
        this.EncryptionMethod = EncryptionMethod;
    }

    /**
     * Get DRM system providers, when the encryption method is CBCS, the optional values are `PlayReady`, `Widevine`, `FairPlay`; when the encryption method is CENC, the oprional values are `PlayReady`, `Widevine`. 
     * @return DRMSystems DRM system providers, when the encryption method is CBCS, the optional values are `PlayReady`, `Widevine`, `FairPlay`; when the encryption method is CENC, the oprional values are `PlayReady`, `Widevine`.
     */
    public String [] getDRMSystems() {
        return this.DRMSystems;
    }

    /**
     * Set DRM system providers, when the encryption method is CBCS, the optional values are `PlayReady`, `Widevine`, `FairPlay`; when the encryption method is CENC, the oprional values are `PlayReady`, `Widevine`.
     * @param DRMSystems DRM system providers, when the encryption method is CBCS, the optional values are `PlayReady`, `Widevine`, `FairPlay`; when the encryption method is CENC, the oprional values are `PlayReady`, `Widevine`.
     */
    public void setDRMSystems(String [] DRMSystems) {
        this.DRMSystems = DRMSystems;
    }

    /**
     * Get The resource ID sent to the key server. It can contain 1 to 128 characters, including numbers, letters, underscores (_), and hyphens (-). 
     * @return ResourceID The resource ID sent to the key server. It can contain 1 to 128 characters, including numbers, letters, underscores (_), and hyphens (-).
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set The resource ID sent to the key server. It can contain 1 to 128 characters, including numbers, letters, underscores (_), and hyphens (-).
     * @param ResourceID The resource ID sent to the key server. It can contain 1 to 128 characters, including numbers, letters, underscores (_), and hyphens (-).
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get Key server address; must start with https://. 
     * @return KeyServerUrl Key server address; must start with https://.
     */
    public String getKeyServerUrl() {
        return this.KeyServerUrl;
    }

    /**
     * Set Key server address; must start with https://.
     * @param KeyServerUrl Key server address; must start with https://.
     */
    public void setKeyServerUrl(String KeyServerUrl) {
        this.KeyServerUrl = KeyServerUrl;
    }

    /**
     * Get Video encryption presets, options: 
`Preset Video 1` - Encrypts all video tracks with one key
`Preset Video 2` - Encrypts SD and HD video tracks with 2 different keys
`Preset Video 3` - Encrypts SD, HD and UHD video tracks with 3 different keys
`Preset Video 4` - Encrypts SD, HD, UHD1 and UHD2 video tracks with 4 different keys
`Preset Video 5` - Encrypts SD, HD1, HD2, UHD1 and UHD2 video tracks with 5 different keys
`Preset Video 6` - Encrypts SD, HD1, HD2, UHD video tracks with 4 different keys
`Preset Video 7` - Encrypts SD + HD1, HD2, UHD video tracks with 3 different keys
`Preset Video 8` - Encrypts SD + HD1, HD2, UHD1, UHD2 video tracks with 4 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track 
     * @return VideoEncryptionPreset Video encryption presets, options: 
`Preset Video 1` - Encrypts all video tracks with one key
`Preset Video 2` - Encrypts SD and HD video tracks with 2 different keys
`Preset Video 3` - Encrypts SD, HD and UHD video tracks with 3 different keys
`Preset Video 4` - Encrypts SD, HD, UHD1 and UHD2 video tracks with 4 different keys
`Preset Video 5` - Encrypts SD, HD1, HD2, UHD1 and UHD2 video tracks with 5 different keys
`Preset Video 6` - Encrypts SD, HD1, HD2, UHD video tracks with 4 different keys
`Preset Video 7` - Encrypts SD + HD1, HD2, UHD video tracks with 3 different keys
`Preset Video 8` - Encrypts SD + HD1, HD2, UHD1, UHD2 video tracks with 4 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
     */
    public String getVideoEncryptionPreset() {
        return this.VideoEncryptionPreset;
    }

    /**
     * Set Video encryption presets, options: 
`Preset Video 1` - Encrypts all video tracks with one key
`Preset Video 2` - Encrypts SD and HD video tracks with 2 different keys
`Preset Video 3` - Encrypts SD, HD and UHD video tracks with 3 different keys
`Preset Video 4` - Encrypts SD, HD, UHD1 and UHD2 video tracks with 4 different keys
`Preset Video 5` - Encrypts SD, HD1, HD2, UHD1 and UHD2 video tracks with 5 different keys
`Preset Video 6` - Encrypts SD, HD1, HD2, UHD video tracks with 4 different keys
`Preset Video 7` - Encrypts SD + HD1, HD2, UHD video tracks with 3 different keys
`Preset Video 8` - Encrypts SD + HD1, HD2, UHD1, UHD2 video tracks with 4 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
     * @param VideoEncryptionPreset Video encryption presets, options: 
`Preset Video 1` - Encrypts all video tracks with one key
`Preset Video 2` - Encrypts SD and HD video tracks with 2 different keys
`Preset Video 3` - Encrypts SD, HD and UHD video tracks with 3 different keys
`Preset Video 4` - Encrypts SD, HD, UHD1 and UHD2 video tracks with 4 different keys
`Preset Video 5` - Encrypts SD, HD1, HD2, UHD1 and UHD2 video tracks with 5 different keys
`Preset Video 6` - Encrypts SD, HD1, HD2, UHD video tracks with 4 different keys
`Preset Video 7` - Encrypts SD + HD1, HD2, UHD video tracks with 3 different keys
`Preset Video 8` - Encrypts SD + HD1, HD2, UHD1, UHD2 video tracks with 4 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
     */
    public void setVideoEncryptionPreset(String VideoEncryptionPreset) {
        this.VideoEncryptionPreset = VideoEncryptionPreset;
    }

    /**
     * Get Audio encryption presets, options:
`Preset Audio 1` - Encrypts all audio tracks with one key
`Preset Audio 2` - Encrypts STEREO and MULTICHANNEL audio tracks with 2 different keys
`Preset Audio 3` - Encrypts STEREO, MULTICHANNEL 3-6 and MULTICHANNEL 7 audio tracks with 3 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track 
     * @return AudioEncryptionPreset Audio encryption presets, options:
`Preset Audio 1` - Encrypts all audio tracks with one key
`Preset Audio 2` - Encrypts STEREO and MULTICHANNEL audio tracks with 2 different keys
`Preset Audio 3` - Encrypts STEREO, MULTICHANNEL 3-6 and MULTICHANNEL 7 audio tracks with 3 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
     */
    public String getAudioEncryptionPreset() {
        return this.AudioEncryptionPreset;
    }

    /**
     * Set Audio encryption presets, options:
`Preset Audio 1` - Encrypts all audio tracks with one key
`Preset Audio 2` - Encrypts STEREO and MULTICHANNEL audio tracks with 2 different keys
`Preset Audio 3` - Encrypts STEREO, MULTICHANNEL 3-6 and MULTICHANNEL 7 audio tracks with 3 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
     * @param AudioEncryptionPreset Audio encryption presets, options:
`Preset Audio 1` - Encrypts all audio tracks with one key
`Preset Audio 2` - Encrypts STEREO and MULTICHANNEL audio tracks with 2 different keys
`Preset Audio 3` - Encrypts STEREO, MULTICHANNEL 3-6 and MULTICHANNEL 7 audio tracks with 3 different keys
`Shared` - Encrypts all video and audio tracks with one key
`Unencrypted` - Does not encrypt any track
     */
    public void setAudioEncryptionPreset(String AudioEncryptionPreset) {
        this.AudioEncryptionPreset = AudioEncryptionPreset;
    }

    /**
     * Get Optional, used together with the key to encrypt the content; a 128-bit, 32-character, hexadecimal-encoded string. 
     * @return ConstantInitializationVector Optional, used together with the key to encrypt the content; a 128-bit, 32-character, hexadecimal-encoded string.
     */
    public String getConstantInitializationVector() {
        return this.ConstantInitializationVector;
    }

    /**
     * Set Optional, used together with the key to encrypt the content; a 128-bit, 32-character, hexadecimal-encoded string.
     * @param ConstantInitializationVector Optional, used together with the key to encrypt the content; a 128-bit, 32-character, hexadecimal-encoded string.
     */
    public void setConstantInitializationVector(String ConstantInitializationVector) {
        this.ConstantInitializationVector = ConstantInitializationVector;
    }

    /**
     * Get Optional, specifies the rotation interval in seconds; empty, or an integer between 300-2592000. 
     * @return KeyRotationInterval Optional, specifies the rotation interval in seconds; empty, or an integer between 300-2592000.
     */
    public Long getKeyRotationInterval() {
        return this.KeyRotationInterval;
    }

    /**
     * Set Optional, specifies the rotation interval in seconds; empty, or an integer between 300-2592000.
     * @param KeyRotationInterval Optional, specifies the rotation interval in seconds; empty, or an integer between 300-2592000.
     */
    public void setKeyRotationInterval(Long KeyRotationInterval) {
        this.KeyRotationInterval = KeyRotationInterval;
    }

    public DRMInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DRMInfo(DRMInfo source) {
        if (source.EncryptionMethod != null) {
            this.EncryptionMethod = new String(source.EncryptionMethod);
        }
        if (source.DRMSystems != null) {
            this.DRMSystems = new String[source.DRMSystems.length];
            for (int i = 0; i < source.DRMSystems.length; i++) {
                this.DRMSystems[i] = new String(source.DRMSystems[i]);
            }
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.KeyServerUrl != null) {
            this.KeyServerUrl = new String(source.KeyServerUrl);
        }
        if (source.VideoEncryptionPreset != null) {
            this.VideoEncryptionPreset = new String(source.VideoEncryptionPreset);
        }
        if (source.AudioEncryptionPreset != null) {
            this.AudioEncryptionPreset = new String(source.AudioEncryptionPreset);
        }
        if (source.ConstantInitializationVector != null) {
            this.ConstantInitializationVector = new String(source.ConstantInitializationVector);
        }
        if (source.KeyRotationInterval != null) {
            this.KeyRotationInterval = new Long(source.KeyRotationInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptionMethod", this.EncryptionMethod);
        this.setParamArraySimple(map, prefix + "DRMSystems.", this.DRMSystems);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "KeyServerUrl", this.KeyServerUrl);
        this.setParamSimple(map, prefix + "VideoEncryptionPreset", this.VideoEncryptionPreset);
        this.setParamSimple(map, prefix + "AudioEncryptionPreset", this.AudioEncryptionPreset);
        this.setParamSimple(map, prefix + "ConstantInitializationVector", this.ConstantInitializationVector);
        this.setParamSimple(map, prefix + "KeyRotationInterval", this.KeyRotationInterval);

    }
}

