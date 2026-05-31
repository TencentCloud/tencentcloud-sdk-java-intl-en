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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmKey extends AbstractModel {

    /**
    * DRM key, which is a 32-bit hexadecimal string.
Note: uppercase letters in the string will be automatically converted to lowercase ones.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Widevine encryption is required. Selectable options: SD/HD/UHD1/UHD2/AUDIO/ALL.
Among them, ALL represents select ALL. If ALL is specified, you cannot add other tracks.
    */
    @SerializedName("Track")
    @Expose
    private String Track;

    /**
    * KeyId for Widevine encryption, a 32-bit length hexadecimal string.
Note: The string will be modified to lowercase.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Iv for AES encryption in Fairplay, a 32-bit length hexadecimal string.
Iv parsing reference
https://tools.ietf.org/html/rfc3826
Note: The string will be modified to lowercase.
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
    * uri of the license server. AES128 is used. Can be empty.
    */
    @SerializedName("KeyUri")
    @Expose
    private String KeyUri;

    /**
     * Get DRM key, which is a 32-bit hexadecimal string.
Note: uppercase letters in the string will be automatically converted to lowercase ones. 
     * @return Key DRM key, which is a 32-bit hexadecimal string.
Note: uppercase letters in the string will be automatically converted to lowercase ones.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set DRM key, which is a 32-bit hexadecimal string.
Note: uppercase letters in the string will be automatically converted to lowercase ones.
     * @param Key DRM key, which is a 32-bit hexadecimal string.
Note: uppercase letters in the string will be automatically converted to lowercase ones.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Widevine encryption is required. Selectable options: SD/HD/UHD1/UHD2/AUDIO/ALL.
Among them, ALL represents select ALL. If ALL is specified, you cannot add other tracks. 
     * @return Track Widevine encryption is required. Selectable options: SD/HD/UHD1/UHD2/AUDIO/ALL.
Among them, ALL represents select ALL. If ALL is specified, you cannot add other tracks.
     */
    public String getTrack() {
        return this.Track;
    }

    /**
     * Set Widevine encryption is required. Selectable options: SD/HD/UHD1/UHD2/AUDIO/ALL.
Among them, ALL represents select ALL. If ALL is specified, you cannot add other tracks.
     * @param Track Widevine encryption is required. Selectable options: SD/HD/UHD1/UHD2/AUDIO/ALL.
Among them, ALL represents select ALL. If ALL is specified, you cannot add other tracks.
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }

    /**
     * Get KeyId for Widevine encryption, a 32-bit length hexadecimal string.
Note: The string will be modified to lowercase. 
     * @return KeyId KeyId for Widevine encryption, a 32-bit length hexadecimal string.
Note: The string will be modified to lowercase.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set KeyId for Widevine encryption, a 32-bit length hexadecimal string.
Note: The string will be modified to lowercase.
     * @param KeyId KeyId for Widevine encryption, a 32-bit length hexadecimal string.
Note: The string will be modified to lowercase.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Iv for AES encryption in Fairplay, a 32-bit length hexadecimal string.
Iv parsing reference
https://tools.ietf.org/html/rfc3826
Note: The string will be modified to lowercase. 
     * @return Iv Iv for AES encryption in Fairplay, a 32-bit length hexadecimal string.
Iv parsing reference
https://tools.ietf.org/html/rfc3826
Note: The string will be modified to lowercase.
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set Iv for AES encryption in Fairplay, a 32-bit length hexadecimal string.
Iv parsing reference
https://tools.ietf.org/html/rfc3826
Note: The string will be modified to lowercase.
     * @param Iv Iv for AES encryption in Fairplay, a 32-bit length hexadecimal string.
Iv parsing reference
https://tools.ietf.org/html/rfc3826
Note: The string will be modified to lowercase.
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    /**
     * Get uri of the license server. AES128 is used. Can be empty. 
     * @return KeyUri uri of the license server. AES128 is used. Can be empty.
     */
    public String getKeyUri() {
        return this.KeyUri;
    }

    /**
     * Set uri of the license server. AES128 is used. Can be empty.
     * @param KeyUri uri of the license server. AES128 is used. Can be empty.
     */
    public void setKeyUri(String KeyUri) {
        this.KeyUri = KeyUri;
    }

    public DrmKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrmKey(DrmKey source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Track != null) {
            this.Track = new String(source.Track);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Iv != null) {
            this.Iv = new String(source.Iv);
        }
        if (source.KeyUri != null) {
            this.KeyUri = new String(source.KeyUri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Track", this.Track);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Iv", this.Iv);
        this.setParamSimple(map, prefix + "KeyUri", this.KeyUri);

    }
}

