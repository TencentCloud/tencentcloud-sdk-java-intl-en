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
    * Whether to enable DRM encryption. Valid value: CLOSE/OPEN. Default value: CLOSE.
Currently, this is supported only for HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * When `Scheme` is set to TencentDRM, this parameter should be set to the `ContentId` of DRM encryption, and if this parameter is left empty, a `ContentId` will be automatically created. For more information, please see [here](https://intl.cloud.tencent.com/document/product/1000/40960?from_cn_redirect=1).
When `Scheme` is set to CustomDRMKeys, this parameter is required and should be specified by the user.
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * Valid values: TencentDRM, CustomDRMKeys. If this parameter is left empty, TencentDRM will be used by default.
TencentDRM refers to Tencent digital rights management (DRM) encryption. For more information, please see [here](https://intl.cloud.tencent.com/solution/drm?from_cn_redirect=1).
CustomDRMKeys refers to an encryption key customized by the user.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * The key customized by the content user, which is required when `Scheme` is set to CustomDRMKeys.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private DrmKey [] Keys;

    /**
     * Get Whether to enable DRM encryption. Valid value: CLOSE/OPEN. Default value: CLOSE.
Currently, this is supported only for HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE. 
     * @return State Whether to enable DRM encryption. Valid value: CLOSE/OPEN. Default value: CLOSE.
Currently, this is supported only for HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Whether to enable DRM encryption. Valid value: CLOSE/OPEN. Default value: CLOSE.
Currently, this is supported only for HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE.
     * @param State Whether to enable DRM encryption. Valid value: CLOSE/OPEN. Default value: CLOSE.
Currently, this is supported only for HLS/DASH/HLS_ARCHIVE/DASH_ARCHIVE.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get When `Scheme` is set to TencentDRM, this parameter should be set to the `ContentId` of DRM encryption, and if this parameter is left empty, a `ContentId` will be automatically created. For more information, please see [here](https://intl.cloud.tencent.com/document/product/1000/40960?from_cn_redirect=1).
When `Scheme` is set to CustomDRMKeys, this parameter is required and should be specified by the user. 
     * @return ContentId When `Scheme` is set to TencentDRM, this parameter should be set to the `ContentId` of DRM encryption, and if this parameter is left empty, a `ContentId` will be automatically created. For more information, please see [here](https://intl.cloud.tencent.com/document/product/1000/40960?from_cn_redirect=1).
When `Scheme` is set to CustomDRMKeys, this parameter is required and should be specified by the user.
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set When `Scheme` is set to TencentDRM, this parameter should be set to the `ContentId` of DRM encryption, and if this parameter is left empty, a `ContentId` will be automatically created. For more information, please see [here](https://intl.cloud.tencent.com/document/product/1000/40960?from_cn_redirect=1).
When `Scheme` is set to CustomDRMKeys, this parameter is required and should be specified by the user.
     * @param ContentId When `Scheme` is set to TencentDRM, this parameter should be set to the `ContentId` of DRM encryption, and if this parameter is left empty, a `ContentId` will be automatically created. For more information, please see [here](https://intl.cloud.tencent.com/document/product/1000/40960?from_cn_redirect=1).
When `Scheme` is set to CustomDRMKeys, this parameter is required and should be specified by the user.
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get Valid values: TencentDRM, CustomDRMKeys. If this parameter is left empty, TencentDRM will be used by default.
TencentDRM refers to Tencent digital rights management (DRM) encryption. For more information, please see [here](https://intl.cloud.tencent.com/solution/drm?from_cn_redirect=1).
CustomDRMKeys refers to an encryption key customized by the user. 
     * @return Scheme Valid values: TencentDRM, CustomDRMKeys. If this parameter is left empty, TencentDRM will be used by default.
TencentDRM refers to Tencent digital rights management (DRM) encryption. For more information, please see [here](https://intl.cloud.tencent.com/solution/drm?from_cn_redirect=1).
CustomDRMKeys refers to an encryption key customized by the user.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Valid values: TencentDRM, CustomDRMKeys. If this parameter is left empty, TencentDRM will be used by default.
TencentDRM refers to Tencent digital rights management (DRM) encryption. For more information, please see [here](https://intl.cloud.tencent.com/solution/drm?from_cn_redirect=1).
CustomDRMKeys refers to an encryption key customized by the user.
     * @param Scheme Valid values: TencentDRM, CustomDRMKeys. If this parameter is left empty, TencentDRM will be used by default.
TencentDRM refers to Tencent digital rights management (DRM) encryption. For more information, please see [here](https://intl.cloud.tencent.com/solution/drm?from_cn_redirect=1).
CustomDRMKeys refers to an encryption key customized by the user.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);

    }
}

