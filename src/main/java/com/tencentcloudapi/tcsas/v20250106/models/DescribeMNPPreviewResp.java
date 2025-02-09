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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPPreviewResp extends AbstractModel {

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * Mini program QR code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QRCodeUrl")
    @Expose
    private String QRCodeUrl;

    /**
    * Path to the preview
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PreviewEntrancePath")
    @Expose
    private String PreviewEntrancePath;

    /**
    * QR code content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QRCodeContent")
    @Expose
    private String QRCodeContent;

    /**
     * Get Mini program ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPDesc Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPDesc Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get Mini program version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersion Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersion Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersionIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersionIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get Mini program QR code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QRCodeUrl Mini program QR code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQRCodeUrl() {
        return this.QRCodeUrl;
    }

    /**
     * Set Mini program QR code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QRCodeUrl Mini program QR code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQRCodeUrl(String QRCodeUrl) {
        this.QRCodeUrl = QRCodeUrl;
    }

    /**
     * Get Path to the preview
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PreviewEntrancePath Path to the preview
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPreviewEntrancePath() {
        return this.PreviewEntrancePath;
    }

    /**
     * Set Path to the preview
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PreviewEntrancePath Path to the preview
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPreviewEntrancePath(String PreviewEntrancePath) {
        this.PreviewEntrancePath = PreviewEntrancePath;
    }

    /**
     * Get QR code content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QRCodeContent QR code content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQRCodeContent() {
        return this.QRCodeContent;
    }

    /**
     * Set QR code content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QRCodeContent QR code content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQRCodeContent(String QRCodeContent) {
        this.QRCodeContent = QRCodeContent;
    }

    public DescribeMNPPreviewResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPPreviewResp(DescribeMNPPreviewResp source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPDesc != null) {
            this.MNPDesc = new String(source.MNPDesc);
        }
        if (source.MNPVersion != null) {
            this.MNPVersion = new String(source.MNPVersion);
        }
        if (source.MNPVersionIntro != null) {
            this.MNPVersionIntro = new String(source.MNPVersionIntro);
        }
        if (source.QRCodeUrl != null) {
            this.QRCodeUrl = new String(source.QRCodeUrl);
        }
        if (source.PreviewEntrancePath != null) {
            this.PreviewEntrancePath = new String(source.PreviewEntrancePath);
        }
        if (source.QRCodeContent != null) {
            this.QRCodeContent = new String(source.QRCodeContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPDesc", this.MNPDesc);
        this.setParamSimple(map, prefix + "MNPVersion", this.MNPVersion);
        this.setParamSimple(map, prefix + "MNPVersionIntro", this.MNPVersionIntro);
        this.setParamSimple(map, prefix + "QRCodeUrl", this.QRCodeUrl);
        this.setParamSimple(map, prefix + "PreviewEntrancePath", this.PreviewEntrancePath);
        this.setParamSimple(map, prefix + "QRCodeContent", this.QRCodeContent);

    }
}

