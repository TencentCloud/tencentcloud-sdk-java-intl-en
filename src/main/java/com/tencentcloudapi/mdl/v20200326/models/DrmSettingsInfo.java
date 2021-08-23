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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmSettingsInfo extends AbstractModel{

    /**
    * Whether to enable DRM encryption. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
DRM encryption is supported only for HLS, DASH, HLS_ARCHIVE, DASH_ARCHIVE, HLS_MEDIAPACKAGE, and DASH_MEDIAPACKAGE outputs.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * This parameter can be set to `CustomDRMKeys` or left empty.
CustomDRMKeys means encryption keys customized by users.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * If `Scheme` is set to `CustomDRMKeys`, this parameter is required and should be specified by the user.
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * The key customized by the content user, which is required when `Scheme` is set to CustomDRMKeys.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private DrmKey [] Keys;

    /**
     * Get Whether to enable DRM encryption. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
DRM encryption is supported only for HLS, DASH, HLS_ARCHIVE, DASH_ARCHIVE, HLS_MEDIAPACKAGE, and DASH_MEDIAPACKAGE outputs. 
     * @return State Whether to enable DRM encryption. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
DRM encryption is supported only for HLS, DASH, HLS_ARCHIVE, DASH_ARCHIVE, HLS_MEDIAPACKAGE, and DASH_MEDIAPACKAGE outputs.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Whether to enable DRM encryption. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
DRM encryption is supported only for HLS, DASH, HLS_ARCHIVE, DASH_ARCHIVE, HLS_MEDIAPACKAGE, and DASH_MEDIAPACKAGE outputs.
     * @param State Whether to enable DRM encryption. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
DRM encryption is supported only for HLS, DASH, HLS_ARCHIVE, DASH_ARCHIVE, HLS_MEDIAPACKAGE, and DASH_MEDIAPACKAGE outputs.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get This parameter can be set to `CustomDRMKeys` or left empty.
CustomDRMKeys means encryption keys customized by users. 
     * @return Scheme This parameter can be set to `CustomDRMKeys` or left empty.
CustomDRMKeys means encryption keys customized by users.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set This parameter can be set to `CustomDRMKeys` or left empty.
CustomDRMKeys means encryption keys customized by users.
     * @param Scheme This parameter can be set to `CustomDRMKeys` or left empty.
CustomDRMKeys means encryption keys customized by users.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get If `Scheme` is set to `CustomDRMKeys`, this parameter is required and should be specified by the user. 
     * @return ContentId If `Scheme` is set to `CustomDRMKeys`, this parameter is required and should be specified by the user.
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set If `Scheme` is set to `CustomDRMKeys`, this parameter is required and should be specified by the user.
     * @param ContentId If `Scheme` is set to `CustomDRMKeys`, this parameter is required and should be specified by the user.
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get The key customized by the content user, which is required when `Scheme` is set to CustomDRMKeys.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Keys The key customized by the content user, which is required when `Scheme` is set to CustomDRMKeys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DrmKey [] getKeys() {
        return this.Keys;
    }

    /**
     * Set The key customized by the content user, which is required when `Scheme` is set to CustomDRMKeys.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Keys The key customized by the content user, which is required when `Scheme` is set to CustomDRMKeys.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeys(DrmKey [] Keys) {
        this.Keys = Keys;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);

    }
}

