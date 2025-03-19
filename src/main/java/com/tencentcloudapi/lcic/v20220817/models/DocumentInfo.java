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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocumentInfo extends AbstractModel {

    /**
    * The document ID. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DocumentId")
    @Expose
    private String DocumentId;

    /**
    * The document's original URL. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DocumentUrl")
    @Expose
    private String DocumentUrl;

    /**
    * The document title. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DocumentName")
    @Expose
    private String DocumentName;

    /**
    * The user ID of the document's owner. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * The application ID. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The document access type. 0: Private; 1: Public. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeResult")
    @Expose
    private String TranscodeResult;

    /**
    * The transcoding type. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeType")
    @Expose
    private Long TranscodeType;

    /**
    * The transcoding progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeProgress")
    @Expose
    private Long TranscodeProgress;

    /**
    * The transcoding status. 0: The file is not transcoded. 1: The file is being transcoded. 2: Transcoding failed. 3: Transcoding is successful. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeState")
    @Expose
    private Long TranscodeState;

    /**
    * The error message for failed transcoding. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private String TranscodeInfo;

    /**
    * The document type. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * The document size (bytes). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DocumentSize")
    @Expose
    private Long DocumentSize;

    /**
    * The time (Unix timestamp) when the document was last updated. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * The number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * The width. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The height. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The thumbnail. Only transcoded courseware has thumbnails.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cover")
    @Expose
    private String Cover;

    /**
    * Document preview address
    */
    @SerializedName("Preview")
    @Expose
    private String Preview;

    /**
    * Document resolution.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Minimum resolution of a transcoded document, consistent with the parameters provided when the document is created.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinScaleResolution")
    @Expose
    private String MinScaleResolution;

    /**
     * Get The document ID. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DocumentId The document ID. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set The document ID. Note: This field may return null, indicating that no valid values can be obtained.
     * @param DocumentId The document ID. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    /**
     * Get The document's original URL. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DocumentUrl The document's original URL. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDocumentUrl() {
        return this.DocumentUrl;
    }

    /**
     * Set The document's original URL. Note: This field may return null, indicating that no valid values can be obtained.
     * @param DocumentUrl The document's original URL. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocumentUrl(String DocumentUrl) {
        this.DocumentUrl = DocumentUrl;
    }

    /**
     * Get The document title. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DocumentName The document title. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDocumentName() {
        return this.DocumentName;
    }

    /**
     * Set The document title. Note: This field may return null, indicating that no valid values can be obtained.
     * @param DocumentName The document title. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocumentName(String DocumentName) {
        this.DocumentName = DocumentName;
    }

    /**
     * Get The user ID of the document's owner. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Owner The user ID of the document's owner. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set The user ID of the document's owner. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Owner The user ID of the document's owner. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get The application ID. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SdkAppId The application ID. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID. Note: This field may return null, indicating that no valid values can be obtained.
     * @param SdkAppId The application ID. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The document access type. 0: Private; 1: Public. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Permission The document access type. 0: Private; 1: Public. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set The document access type. 0: Private; 1: Public. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Permission The document access type. 0: Private; 1: Public. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeResult The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranscodeResult() {
        return this.TranscodeResult;
    }

    /**
     * Set The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeResult The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeResult(String TranscodeResult) {
        this.TranscodeResult = TranscodeResult;
    }

    /**
     * Get The transcoding type. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeType The transcoding type. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set The transcoding type. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeType The transcoding type. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeType(Long TranscodeType) {
        this.TranscodeType = TranscodeType;
    }

    /**
     * Get The transcoding progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeProgress The transcoding progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTranscodeProgress() {
        return this.TranscodeProgress;
    }

    /**
     * Set The transcoding progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeProgress The transcoding progress. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeProgress(Long TranscodeProgress) {
        this.TranscodeProgress = TranscodeProgress;
    }

    /**
     * Get The transcoding status. 0: The file is not transcoded. 1: The file is being transcoded. 2: Transcoding failed. 3: Transcoding is successful. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeState The transcoding status. 0: The file is not transcoded. 1: The file is being transcoded. 2: Transcoding failed. 3: Transcoding is successful. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTranscodeState() {
        return this.TranscodeState;
    }

    /**
     * Set The transcoding status. 0: The file is not transcoded. 1: The file is being transcoded. 2: Transcoding failed. 3: Transcoding is successful. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeState The transcoding status. 0: The file is not transcoded. 1: The file is being transcoded. 2: Transcoding failed. 3: Transcoding is successful. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeState(Long TranscodeState) {
        this.TranscodeState = TranscodeState;
    }

    /**
     * Get The error message for failed transcoding. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeInfo The error message for failed transcoding. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * Set The error message for failed transcoding. Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeInfo The error message for failed transcoding. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeInfo(String TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * Get The document type. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DocumentType The document type. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set The document type. Note: This field may return null, indicating that no valid values can be obtained.
     * @param DocumentType The document type. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get The document size (bytes). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DocumentSize The document size (bytes). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDocumentSize() {
        return this.DocumentSize;
    }

    /**
     * Set The document size (bytes). Note: This field may return null, indicating that no valid values can be obtained.
     * @param DocumentSize The document size (bytes). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocumentSize(Long DocumentSize) {
        this.DocumentSize = DocumentSize;
    }

    /**
     * Get The time (Unix timestamp) when the document was last updated. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime The time (Unix timestamp) when the document was last updated. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The time (Unix timestamp) when the document was last updated. Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime The time (Unix timestamp) when the document was last updated. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The number of pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pages The number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set The number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pages The number of pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get The width. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Width The width. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The width. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Width The width. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The height. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Height The height. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The height. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Height The height. This parameter is valid only if static document transcoding is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The thumbnail. Only transcoded courseware has thumbnails.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cover The thumbnail. Only transcoded courseware has thumbnails.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCover() {
        return this.Cover;
    }

    /**
     * Set The thumbnail. Only transcoded courseware has thumbnails.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cover The thumbnail. Only transcoded courseware has thumbnails.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCover(String Cover) {
        this.Cover = Cover;
    }

    /**
     * Get Document preview address 
     * @return Preview Document preview address
     */
    public String getPreview() {
        return this.Preview;
    }

    /**
     * Set Document preview address
     * @param Preview Document preview address
     */
    public void setPreview(String Preview) {
        this.Preview = Preview;
    }

    /**
     * Get Document resolution.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resolution Document resolution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Document resolution.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resolution Document resolution.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Minimum resolution of a transcoded document, consistent with the parameters provided when the document is created.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinScaleResolution Minimum resolution of a transcoded document, consistent with the parameters provided when the document is created.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMinScaleResolution() {
        return this.MinScaleResolution;
    }

    /**
     * Set Minimum resolution of a transcoded document, consistent with the parameters provided when the document is created.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinScaleResolution Minimum resolution of a transcoded document, consistent with the parameters provided when the document is created.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinScaleResolution(String MinScaleResolution) {
        this.MinScaleResolution = MinScaleResolution;
    }

    public DocumentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentInfo(DocumentInfo source) {
        if (source.DocumentId != null) {
            this.DocumentId = new String(source.DocumentId);
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
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Permission != null) {
            this.Permission = new Long(source.Permission);
        }
        if (source.TranscodeResult != null) {
            this.TranscodeResult = new String(source.TranscodeResult);
        }
        if (source.TranscodeType != null) {
            this.TranscodeType = new Long(source.TranscodeType);
        }
        if (source.TranscodeProgress != null) {
            this.TranscodeProgress = new Long(source.TranscodeProgress);
        }
        if (source.TranscodeState != null) {
            this.TranscodeState = new Long(source.TranscodeState);
        }
        if (source.TranscodeInfo != null) {
            this.TranscodeInfo = new String(source.TranscodeInfo);
        }
        if (source.DocumentType != null) {
            this.DocumentType = new String(source.DocumentType);
        }
        if (source.DocumentSize != null) {
            this.DocumentSize = new Long(source.DocumentSize);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Cover != null) {
            this.Cover = new String(source.Cover);
        }
        if (source.Preview != null) {
            this.Preview = new String(source.Preview);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.MinScaleResolution != null) {
            this.MinScaleResolution = new String(source.MinScaleResolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocumentId", this.DocumentId);
        this.setParamSimple(map, prefix + "DocumentUrl", this.DocumentUrl);
        this.setParamSimple(map, prefix + "DocumentName", this.DocumentName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "TranscodeResult", this.TranscodeResult);
        this.setParamSimple(map, prefix + "TranscodeType", this.TranscodeType);
        this.setParamSimple(map, prefix + "TranscodeProgress", this.TranscodeProgress);
        this.setParamSimple(map, prefix + "TranscodeState", this.TranscodeState);
        this.setParamSimple(map, prefix + "TranscodeInfo", this.TranscodeInfo);
        this.setParamSimple(map, prefix + "DocumentType", this.DocumentType);
        this.setParamSimple(map, prefix + "DocumentSize", this.DocumentSize);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Cover", this.Cover);
        this.setParamSimple(map, prefix + "Preview", this.Preview);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MinScaleResolution", this.MinScaleResolution);

    }
}

