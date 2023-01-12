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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDocumentRequest extends AbstractModel{

    /**
    * LCIC SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Document URL	
    */
    @SerializedName("DocumentUrl")
    @Expose
    private String DocumentUrl;

    /**
    * Document name	
    */
    @SerializedName("DocumentName")
    @Expose
    private String DocumentName;

    /**
    * Document owner ID	
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Transcoding type. Valid values: `0`: No transcoding required (default); `1`: Documents that need to be transcoded: ppt, pptx, pdf, doc, docx; `2`: Videos that need to be transcoded: mp4, 3pg, mpeg, avi, flv, wmv, rm, h264, etc.; `2`: Audio that needs to be transcoded: mp3, wav, wma, aac, flac, opus
    */
    @SerializedName("TranscodeType")
    @Expose
    private Long TranscodeType;

    /**
    * Permission. Valid values: `0`: Private document (default); `1`: Public document
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * Document extension
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * Document size, in bytes
    */
    @SerializedName("DocumentSize")
    @Expose
    private Long DocumentSize;

    /**
     * Get LCIC SdkAppId 
     * @return SdkAppId LCIC SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set LCIC SdkAppId
     * @param SdkAppId LCIC SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Document URL	 
     * @return DocumentUrl Document URL	
     */
    public String getDocumentUrl() {
        return this.DocumentUrl;
    }

    /**
     * Set Document URL	
     * @param DocumentUrl Document URL	
     */
    public void setDocumentUrl(String DocumentUrl) {
        this.DocumentUrl = DocumentUrl;
    }

    /**
     * Get Document name	 
     * @return DocumentName Document name	
     */
    public String getDocumentName() {
        return this.DocumentName;
    }

    /**
     * Set Document name	
     * @param DocumentName Document name	
     */
    public void setDocumentName(String DocumentName) {
        this.DocumentName = DocumentName;
    }

    /**
     * Get Document owner ID	 
     * @return Owner Document owner ID	
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Document owner ID	
     * @param Owner Document owner ID	
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Transcoding type. Valid values: `0`: No transcoding required (default); `1`: Documents that need to be transcoded: ppt, pptx, pdf, doc, docx; `2`: Videos that need to be transcoded: mp4, 3pg, mpeg, avi, flv, wmv, rm, h264, etc.; `2`: Audio that needs to be transcoded: mp3, wav, wma, aac, flac, opus 
     * @return TranscodeType Transcoding type. Valid values: `0`: No transcoding required (default); `1`: Documents that need to be transcoded: ppt, pptx, pdf, doc, docx; `2`: Videos that need to be transcoded: mp4, 3pg, mpeg, avi, flv, wmv, rm, h264, etc.; `2`: Audio that needs to be transcoded: mp3, wav, wma, aac, flac, opus
     */
    public Long getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set Transcoding type. Valid values: `0`: No transcoding required (default); `1`: Documents that need to be transcoded: ppt, pptx, pdf, doc, docx; `2`: Videos that need to be transcoded: mp4, 3pg, mpeg, avi, flv, wmv, rm, h264, etc.; `2`: Audio that needs to be transcoded: mp3, wav, wma, aac, flac, opus
     * @param TranscodeType Transcoding type. Valid values: `0`: No transcoding required (default); `1`: Documents that need to be transcoded: ppt, pptx, pdf, doc, docx; `2`: Videos that need to be transcoded: mp4, 3pg, mpeg, avi, flv, wmv, rm, h264, etc.; `2`: Audio that needs to be transcoded: mp3, wav, wma, aac, flac, opus
     */
    public void setTranscodeType(Long TranscodeType) {
        this.TranscodeType = TranscodeType;
    }

    /**
     * Get Permission. Valid values: `0`: Private document (default); `1`: Public document 
     * @return Permission Permission. Valid values: `0`: Private document (default); `1`: Public document
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set Permission. Valid values: `0`: Private document (default); `1`: Public document
     * @param Permission Permission. Valid values: `0`: Private document (default); `1`: Public document
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get Document extension 
     * @return DocumentType Document extension
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set Document extension
     * @param DocumentType Document extension
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get Document size, in bytes 
     * @return DocumentSize Document size, in bytes
     */
    public Long getDocumentSize() {
        return this.DocumentSize;
    }

    /**
     * Set Document size, in bytes
     * @param DocumentSize Document size, in bytes
     */
    public void setDocumentSize(Long DocumentSize) {
        this.DocumentSize = DocumentSize;
    }

    public CreateDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDocumentRequest(CreateDocumentRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.DocumentUrl != null) {
            this.DocumentUrl = new String(source.DocumentUrl);
        }
        if (source.DocumentName != null) {
            this.DocumentName = new String(source.DocumentName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.TranscodeType != null) {
            this.TranscodeType = new Long(source.TranscodeType);
        }
        if (source.Permission != null) {
            this.Permission = new Long(source.Permission);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new String(source.DocumentType);
        }
        if (source.DocumentSize != null) {
            this.DocumentSize = new Long(source.DocumentSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "DocumentUrl", this.DocumentUrl);
        this.setParamSimple(map, prefix + "DocumentName", this.DocumentName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "TranscodeType", this.TranscodeType);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "DocumentSize", this.DocumentSize);

    }
}

