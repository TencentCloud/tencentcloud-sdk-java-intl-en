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

public class DescribeMNGPreviewResp extends AbstractModel {

    /**
    * <p>Mini game appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini game name</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini game description</p>
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * <p>Mini game version</p>
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * <p>Mini game version description</p>
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * <p>Mini game version QR code</p>
    */
    @SerializedName("QRCodeUrl")
    @Expose
    private String QRCodeUrl;

    /**
    * <p>Preview path</p>
    */
    @SerializedName("PreviewEntrancePath")
    @Expose
    private String PreviewEntrancePath;

    /**
    * <p>Information encoded in the QR code</p>
    */
    @SerializedName("QRCodeContent")
    @Expose
    private String QRCodeContent;

    /**
     * Get <p>Mini game appid</p> 
     * @return MNPId <p>Mini game appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid</p>
     * @param MNPId <p>Mini game appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini game name</p> 
     * @return MNPName <p>Mini game name</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini game name</p>
     * @param MNPName <p>Mini game name</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini game description</p> 
     * @return MNPDesc <p>Mini game description</p>
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set <p>Mini game description</p>
     * @param MNPDesc <p>Mini game description</p>
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get <p>Mini game version</p> 
     * @return MNPVersion <p>Mini game version</p>
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set <p>Mini game version</p>
     * @param MNPVersion <p>Mini game version</p>
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get <p>Mini game version description</p> 
     * @return MNPVersionIntro <p>Mini game version description</p>
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set <p>Mini game version description</p>
     * @param MNPVersionIntro <p>Mini game version description</p>
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get <p>Mini game version QR code</p> 
     * @return QRCodeUrl <p>Mini game version QR code</p>
     */
    public String getQRCodeUrl() {
        return this.QRCodeUrl;
    }

    /**
     * Set <p>Mini game version QR code</p>
     * @param QRCodeUrl <p>Mini game version QR code</p>
     */
    public void setQRCodeUrl(String QRCodeUrl) {
        this.QRCodeUrl = QRCodeUrl;
    }

    /**
     * Get <p>Preview path</p> 
     * @return PreviewEntrancePath <p>Preview path</p>
     */
    public String getPreviewEntrancePath() {
        return this.PreviewEntrancePath;
    }

    /**
     * Set <p>Preview path</p>
     * @param PreviewEntrancePath <p>Preview path</p>
     */
    public void setPreviewEntrancePath(String PreviewEntrancePath) {
        this.PreviewEntrancePath = PreviewEntrancePath;
    }

    /**
     * Get <p>Information encoded in the QR code</p> 
     * @return QRCodeContent <p>Information encoded in the QR code</p>
     */
    public String getQRCodeContent() {
        return this.QRCodeContent;
    }

    /**
     * Set <p>Information encoded in the QR code</p>
     * @param QRCodeContent <p>Information encoded in the QR code</p>
     */
    public void setQRCodeContent(String QRCodeContent) {
        this.QRCodeContent = QRCodeContent;
    }

    public DescribeMNGPreviewResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGPreviewResp(DescribeMNGPreviewResp source) {
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

