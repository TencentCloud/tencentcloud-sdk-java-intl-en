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

public class DescribeDocumentResponse extends AbstractModel{

    /**
    * The document ID.
    */
    @SerializedName("DocumentId")
    @Expose
    private String DocumentId;

    /**
    * The document’s original URL.
    */
    @SerializedName("DocumentUrl")
    @Expose
    private String DocumentUrl;

    /**
    * The document title.
    */
    @SerializedName("DocumentName")
    @Expose
    private String DocumentName;

    /**
    * The user ID of the document’s owner.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * The application ID.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The document access type.
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code.
    */
    @SerializedName("TranscodeResult")
    @Expose
    private String TranscodeResult;

    /**
    * The transcoding type.
    */
    @SerializedName("TranscodeType")
    @Expose
    private Long TranscodeType;

    /**
    * The transcoding progress. Value range: 0-100.
    */
    @SerializedName("TranscodeProgress")
    @Expose
    private Long TranscodeProgress;

    /**
    * The transcoding status. `0`: The file is not transcoded. `1`: The file is being transcoded. `2`: Transcoding failed. `3`: Transcoding is successful.
    */
    @SerializedName("TranscodeState")
    @Expose
    private Long TranscodeState;

    /**
    * The error message for failed transcoding.
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private String TranscodeInfo;

    /**
    * The document type.
    */
    @SerializedName("DocumentType")
    @Expose
    private String DocumentType;

    /**
    * The document size (bytes).
    */
    @SerializedName("DocumentSize")
    @Expose
    private Long DocumentSize;

    /**
    * The time (Unix timestamp) when the document was last updated.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The document ID. 
     * @return DocumentId The document ID.
     */
    public String getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set The document ID.
     * @param DocumentId The document ID.
     */
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    /**
     * Get The document’s original URL. 
     * @return DocumentUrl The document’s original URL.
     */
    public String getDocumentUrl() {
        return this.DocumentUrl;
    }

    /**
     * Set The document’s original URL.
     * @param DocumentUrl The document’s original URL.
     */
    public void setDocumentUrl(String DocumentUrl) {
        this.DocumentUrl = DocumentUrl;
    }

    /**
     * Get The document title. 
     * @return DocumentName The document title.
     */
    public String getDocumentName() {
        return this.DocumentName;
    }

    /**
     * Set The document title.
     * @param DocumentName The document title.
     */
    public void setDocumentName(String DocumentName) {
        this.DocumentName = DocumentName;
    }

    /**
     * Get The user ID of the document’s owner. 
     * @return Owner The user ID of the document’s owner.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set The user ID of the document’s owner.
     * @param Owner The user ID of the document’s owner.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get The application ID. 
     * @return SdkAppId The application ID.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID.
     * @param SdkAppId The application ID.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The document access type. 
     * @return Permission The document access type.
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set The document access type.
     * @param Permission The document access type.
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code. 
     * @return TranscodeResult The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code.
     */
    public String getTranscodeResult() {
        return this.TranscodeResult;
    }

    /**
     * Set The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code.
     * @param TranscodeResult The transcoding result. If the file is not transcoded, this parameter will be empty. If it is successfully transcoded, this parameter will be the URL of the transcoded file. If transcoding fails, this parameter will indicate the error code.
     */
    public void setTranscodeResult(String TranscodeResult) {
        this.TranscodeResult = TranscodeResult;
    }

    /**
     * Get The transcoding type. 
     * @return TranscodeType The transcoding type.
     */
    public Long getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set The transcoding type.
     * @param TranscodeType The transcoding type.
     */
    public void setTranscodeType(Long TranscodeType) {
        this.TranscodeType = TranscodeType;
    }

    /**
     * Get The transcoding progress. Value range: 0-100. 
     * @return TranscodeProgress The transcoding progress. Value range: 0-100.
     */
    public Long getTranscodeProgress() {
        return this.TranscodeProgress;
    }

    /**
     * Set The transcoding progress. Value range: 0-100.
     * @param TranscodeProgress The transcoding progress. Value range: 0-100.
     */
    public void setTranscodeProgress(Long TranscodeProgress) {
        this.TranscodeProgress = TranscodeProgress;
    }

    /**
     * Get The transcoding status. `0`: The file is not transcoded. `1`: The file is being transcoded. `2`: Transcoding failed. `3`: Transcoding is successful. 
     * @return TranscodeState The transcoding status. `0`: The file is not transcoded. `1`: The file is being transcoded. `2`: Transcoding failed. `3`: Transcoding is successful.
     */
    public Long getTranscodeState() {
        return this.TranscodeState;
    }

    /**
     * Set The transcoding status. `0`: The file is not transcoded. `1`: The file is being transcoded. `2`: Transcoding failed. `3`: Transcoding is successful.
     * @param TranscodeState The transcoding status. `0`: The file is not transcoded. `1`: The file is being transcoded. `2`: Transcoding failed. `3`: Transcoding is successful.
     */
    public void setTranscodeState(Long TranscodeState) {
        this.TranscodeState = TranscodeState;
    }

    /**
     * Get The error message for failed transcoding. 
     * @return TranscodeInfo The error message for failed transcoding.
     */
    public String getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * Set The error message for failed transcoding.
     * @param TranscodeInfo The error message for failed transcoding.
     */
    public void setTranscodeInfo(String TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * Get The document type. 
     * @return DocumentType The document type.
     */
    public String getDocumentType() {
        return this.DocumentType;
    }

    /**
     * Set The document type.
     * @param DocumentType The document type.
     */
    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Get The document size (bytes). 
     * @return DocumentSize The document size (bytes).
     */
    public Long getDocumentSize() {
        return this.DocumentSize;
    }

    /**
     * Set The document size (bytes).
     * @param DocumentSize The document size (bytes).
     */
    public void setDocumentSize(Long DocumentSize) {
        this.DocumentSize = DocumentSize;
    }

    /**
     * Get The time (Unix timestamp) when the document was last updated. 
     * @return UpdateTime The time (Unix timestamp) when the document was last updated.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The time (Unix timestamp) when the document was last updated.
     * @param UpdateTime The time (Unix timestamp) when the document was last updated.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDocumentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocumentResponse(DescribeDocumentResponse source) {
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

