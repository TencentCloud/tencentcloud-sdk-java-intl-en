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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPPreviewResp extends AbstractModel {

    /**
    * Mini program appid. 
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program description.
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Mini program version.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Mini program version introduction.
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * Mini program QR code URL.
    */
    @SerializedName("QRCodeUrl")
    @Expose
    private String QRCodeUrl;

    /**
    * Preview path.
    */
    @SerializedName("PreviewEntrancePath")
    @Expose
    private String PreviewEntrancePath;

    /**
    * Information encoded in the QR code.
    */
    @SerializedName("QRCodeContent")
    @Expose
    private String QRCodeContent;

    /**
     * Get Mini program appid.  
     * @return MNPId Mini program appid. 
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program appid. 
     * @param MNPId Mini program appid. 
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program name. 
     * @return MNPName Mini program name.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name.
     * @param MNPName Mini program name.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program description. 
     * @return MNPDesc Mini program description.
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Mini program description.
     * @param MNPDesc Mini program description.
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get Mini program version. 
     * @return MNPVersion Mini program version.
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set Mini program version.
     * @param MNPVersion Mini program version.
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get Mini program version introduction. 
     * @return MNPVersionIntro Mini program version introduction.
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set Mini program version introduction.
     * @param MNPVersionIntro Mini program version introduction.
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get Mini program QR code URL. 
     * @return QRCodeUrl Mini program QR code URL.
     */
    public String getQRCodeUrl() {
        return this.QRCodeUrl;
    }

    /**
     * Set Mini program QR code URL.
     * @param QRCodeUrl Mini program QR code URL.
     */
    public void setQRCodeUrl(String QRCodeUrl) {
        this.QRCodeUrl = QRCodeUrl;
    }

    /**
     * Get Preview path. 
     * @return PreviewEntrancePath Preview path.
     */
    public String getPreviewEntrancePath() {
        return this.PreviewEntrancePath;
    }

    /**
     * Set Preview path.
     * @param PreviewEntrancePath Preview path.
     */
    public void setPreviewEntrancePath(String PreviewEntrancePath) {
        this.PreviewEntrancePath = PreviewEntrancePath;
    }

    /**
     * Get Information encoded in the QR code. 
     * @return QRCodeContent Information encoded in the QR code.
     */
    public String getQRCodeContent() {
        return this.QRCodeContent;
    }

    /**
     * Set Information encoded in the QR code.
     * @param QRCodeContent Information encoded in the QR code.
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

