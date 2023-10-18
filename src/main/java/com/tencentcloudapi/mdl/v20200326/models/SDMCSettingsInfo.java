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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SDMCSettingsInfo extends AbstractModel {

    /**
    * User ID in the SDMC DRM system
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Tracks of the SDMC DRM system. This parameter is valid for DASH output groups.
`1`: audio
`2`: SD
`4`: HD
`8`: UHD1
`16`: UHD2

Default value: `31` (audio + SD + HD + UHD1 + UHD2)
    */
    @SerializedName("Tracks")
    @Expose
    private Long Tracks;

    /**
    * Key ID in the SDMC DRM system; required
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Key in the SDMC DRM system; required
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Key request URL of the SDMC DRM system, which is `https://uat.multidrm.tv/cpix/2.2/getcontentkey` by default
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Token name in an SDMC key request URL, which is `token` by default
    */
    @SerializedName("TokenName")
    @Expose
    private String TokenName;

    /**
     * Get User ID in the SDMC DRM system 
     * @return Uid User ID in the SDMC DRM system
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set User ID in the SDMC DRM system
     * @param Uid User ID in the SDMC DRM system
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Tracks of the SDMC DRM system. This parameter is valid for DASH output groups.
`1`: audio
`2`: SD
`4`: HD
`8`: UHD1
`16`: UHD2

Default value: `31` (audio + SD + HD + UHD1 + UHD2) 
     * @return Tracks Tracks of the SDMC DRM system. This parameter is valid for DASH output groups.
`1`: audio
`2`: SD
`4`: HD
`8`: UHD1
`16`: UHD2

Default value: `31` (audio + SD + HD + UHD1 + UHD2)
     */
    public Long getTracks() {
        return this.Tracks;
    }

    /**
     * Set Tracks of the SDMC DRM system. This parameter is valid for DASH output groups.
`1`: audio
`2`: SD
`4`: HD
`8`: UHD1
`16`: UHD2

Default value: `31` (audio + SD + HD + UHD1 + UHD2)
     * @param Tracks Tracks of the SDMC DRM system. This parameter is valid for DASH output groups.
`1`: audio
`2`: SD
`4`: HD
`8`: UHD1
`16`: UHD2

Default value: `31` (audio + SD + HD + UHD1 + UHD2)
     */
    public void setTracks(Long Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get Key ID in the SDMC DRM system; required 
     * @return SecretId Key ID in the SDMC DRM system; required
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Key ID in the SDMC DRM system; required
     * @param SecretId Key ID in the SDMC DRM system; required
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get Key in the SDMC DRM system; required 
     * @return SecretKey Key in the SDMC DRM system; required
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key in the SDMC DRM system; required
     * @param SecretKey Key in the SDMC DRM system; required
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Key request URL of the SDMC DRM system, which is `https://uat.multidrm.tv/cpix/2.2/getcontentkey` by default 
     * @return Url Key request URL of the SDMC DRM system, which is `https://uat.multidrm.tv/cpix/2.2/getcontentkey` by default
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Key request URL of the SDMC DRM system, which is `https://uat.multidrm.tv/cpix/2.2/getcontentkey` by default
     * @param Url Key request URL of the SDMC DRM system, which is `https://uat.multidrm.tv/cpix/2.2/getcontentkey` by default
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Token name in an SDMC key request URL, which is `token` by default 
     * @return TokenName Token name in an SDMC key request URL, which is `token` by default
     */
    public String getTokenName() {
        return this.TokenName;
    }

    /**
     * Set Token name in an SDMC key request URL, which is `token` by default
     * @param TokenName Token name in an SDMC key request URL, which is `token` by default
     */
    public void setTokenName(String TokenName) {
        this.TokenName = TokenName;
    }

    public SDMCSettingsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SDMCSettingsInfo(SDMCSettingsInfo source) {
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Tracks != null) {
            this.Tracks = new Long(source.Tracks);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.TokenName != null) {
            this.TokenName = new String(source.TokenName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Tracks", this.Tracks);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "TokenName", this.TokenName);

    }
}

