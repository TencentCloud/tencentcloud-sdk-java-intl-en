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

public class DrmSettingsInfo extends AbstractModel {

    /**
    * Whether DRM encryption is enabled. Option: CLOSE/OPEN. Default: CLOSE.
Currently only support HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE/HLS_MEDIAPACKAGE/DASH_MEDIAPACKAGE.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Optional [CustomDRMKeys|SDMCDRM], defaults to CustomDRMKeys.
CustomDRMKeys refers to the custom encryption key.
SDMCDRM refers to the DRM key management system using SMDC.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Scheme is CustomDRMKeys, required, filled in by the user.
Scheme is SDMCDRM, optional, defaults to ChannelId. The format supports digits, upper- and lower-case letters, hyphens, and underscores, with a length of [1, 36].
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * Required when Scheme is CustomDRMKeys. The content is the key customized by users.
    */
    @SerializedName("Keys")
    @Expose
    private DrmKey [] Keys;

    /**
    * SDMC key configuration information, used when Scheme is SDMCDRM.
    */
    @SerializedName("SDMCSettings")
    @Expose
    private SDMCSettingsInfo SDMCSettings;

    /**
    * Optional type:
`FAIRPLAY` `WIDEVINE` `PLAYREADY` `AES128`
HLS-TS supports `FAIRPLAY` and `AES128`.
HLS-FMP4 supports `FAIRPLAY`, `WIDEVINE`, `PLAYREADY`, `AES128`, and permutation and combination of two or three from `FAIRPLAY`, `WIDEVINE`, `PLAYREADY` (use commas to concatenate, such as "FAIRPLAY,WIDEVINE,PLAYREADY").
DASH supports `WIDEVINE`, `PLAYREADY`, and the permutation and combination of `PLAYREADY` and `WIDEVINE` (use commas to concatenate, such as "PLAYREADY,WIDEVINE").
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
     * Get Whether DRM encryption is enabled. Option: CLOSE/OPEN. Default: CLOSE.
Currently only support HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE/HLS_MEDIAPACKAGE/DASH_MEDIAPACKAGE. 
     * @return State Whether DRM encryption is enabled. Option: CLOSE/OPEN. Default: CLOSE.
Currently only support HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE/HLS_MEDIAPACKAGE/DASH_MEDIAPACKAGE.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Whether DRM encryption is enabled. Option: CLOSE/OPEN. Default: CLOSE.
Currently only support HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE/HLS_MEDIAPACKAGE/DASH_MEDIAPACKAGE.
     * @param State Whether DRM encryption is enabled. Option: CLOSE/OPEN. Default: CLOSE.
Currently only support HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE/HLS_MEDIAPACKAGE/DASH_MEDIAPACKAGE.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Optional [CustomDRMKeys|SDMCDRM], defaults to CustomDRMKeys.
CustomDRMKeys refers to the custom encryption key.
SDMCDRM refers to the DRM key management system using SMDC. 
     * @return Scheme Optional [CustomDRMKeys|SDMCDRM], defaults to CustomDRMKeys.
CustomDRMKeys refers to the custom encryption key.
SDMCDRM refers to the DRM key management system using SMDC.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Optional [CustomDRMKeys|SDMCDRM], defaults to CustomDRMKeys.
CustomDRMKeys refers to the custom encryption key.
SDMCDRM refers to the DRM key management system using SMDC.
     * @param Scheme Optional [CustomDRMKeys|SDMCDRM], defaults to CustomDRMKeys.
CustomDRMKeys refers to the custom encryption key.
SDMCDRM refers to the DRM key management system using SMDC.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Scheme is CustomDRMKeys, required, filled in by the user.
Scheme is SDMCDRM, optional, defaults to ChannelId. The format supports digits, upper- and lower-case letters, hyphens, and underscores, with a length of [1, 36]. 
     * @return ContentId Scheme is CustomDRMKeys, required, filled in by the user.
Scheme is SDMCDRM, optional, defaults to ChannelId. The format supports digits, upper- and lower-case letters, hyphens, and underscores, with a length of [1, 36].
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set Scheme is CustomDRMKeys, required, filled in by the user.
Scheme is SDMCDRM, optional, defaults to ChannelId. The format supports digits, upper- and lower-case letters, hyphens, and underscores, with a length of [1, 36].
     * @param ContentId Scheme is CustomDRMKeys, required, filled in by the user.
Scheme is SDMCDRM, optional, defaults to ChannelId. The format supports digits, upper- and lower-case letters, hyphens, and underscores, with a length of [1, 36].
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get Required when Scheme is CustomDRMKeys. The content is the key customized by users. 
     * @return Keys Required when Scheme is CustomDRMKeys. The content is the key customized by users.
     */
    public DrmKey [] getKeys() {
        return this.Keys;
    }

    /**
     * Set Required when Scheme is CustomDRMKeys. The content is the key customized by users.
     * @param Keys Required when Scheme is CustomDRMKeys. The content is the key customized by users.
     */
    public void setKeys(DrmKey [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get SDMC key configuration information, used when Scheme is SDMCDRM. 
     * @return SDMCSettings SDMC key configuration information, used when Scheme is SDMCDRM.
     */
    public SDMCSettingsInfo getSDMCSettings() {
        return this.SDMCSettings;
    }

    /**
     * Set SDMC key configuration information, used when Scheme is SDMCDRM.
     * @param SDMCSettings SDMC key configuration information, used when Scheme is SDMCDRM.
     */
    public void setSDMCSettings(SDMCSettingsInfo SDMCSettings) {
        this.SDMCSettings = SDMCSettings;
    }

    /**
     * Get Optional type:
`FAIRPLAY` `WIDEVINE` `PLAYREADY` `AES128`
HLS-TS supports `FAIRPLAY` and `AES128`.
HLS-FMP4 supports `FAIRPLAY`, `WIDEVINE`, `PLAYREADY`, `AES128`, and permutation and combination of two or three from `FAIRPLAY`, `WIDEVINE`, `PLAYREADY` (use commas to concatenate, such as "FAIRPLAY,WIDEVINE,PLAYREADY").
DASH supports `WIDEVINE`, `PLAYREADY`, and the permutation and combination of `PLAYREADY` and `WIDEVINE` (use commas to concatenate, such as "PLAYREADY,WIDEVINE"). 
     * @return DrmType Optional type:
`FAIRPLAY` `WIDEVINE` `PLAYREADY` `AES128`
HLS-TS supports `FAIRPLAY` and `AES128`.
HLS-FMP4 supports `FAIRPLAY`, `WIDEVINE`, `PLAYREADY`, `AES128`, and permutation and combination of two or three from `FAIRPLAY`, `WIDEVINE`, `PLAYREADY` (use commas to concatenate, such as "FAIRPLAY,WIDEVINE,PLAYREADY").
DASH supports `WIDEVINE`, `PLAYREADY`, and the permutation and combination of `PLAYREADY` and `WIDEVINE` (use commas to concatenate, such as "PLAYREADY,WIDEVINE").
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set Optional type:
`FAIRPLAY` `WIDEVINE` `PLAYREADY` `AES128`
HLS-TS supports `FAIRPLAY` and `AES128`.
HLS-FMP4 supports `FAIRPLAY`, `WIDEVINE`, `PLAYREADY`, `AES128`, and permutation and combination of two or three from `FAIRPLAY`, `WIDEVINE`, `PLAYREADY` (use commas to concatenate, such as "FAIRPLAY,WIDEVINE,PLAYREADY").
DASH supports `WIDEVINE`, `PLAYREADY`, and the permutation and combination of `PLAYREADY` and `WIDEVINE` (use commas to concatenate, such as "PLAYREADY,WIDEVINE").
     * @param DrmType Optional type:
`FAIRPLAY` `WIDEVINE` `PLAYREADY` `AES128`
HLS-TS supports `FAIRPLAY` and `AES128`.
HLS-FMP4 supports `FAIRPLAY`, `WIDEVINE`, `PLAYREADY`, `AES128`, and permutation and combination of two or three from `FAIRPLAY`, `WIDEVINE`, `PLAYREADY` (use commas to concatenate, such as "FAIRPLAY,WIDEVINE,PLAYREADY").
DASH supports `WIDEVINE`, `PLAYREADY`, and the permutation and combination of `PLAYREADY` and `WIDEVINE` (use commas to concatenate, such as "PLAYREADY,WIDEVINE").
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    public DrmSettingsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrmSettingsInfo(DrmSettingsInfo source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.Keys != null) {
            this.Keys = new DrmKey[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new DrmKey(source.Keys[i]);
            }
        }
        if (source.SDMCSettings != null) {
            this.SDMCSettings = new SDMCSettingsInfo(source.SDMCSettings);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamObj(map, prefix + "SDMCSettings.", this.SDMCSettings);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);

    }
}

