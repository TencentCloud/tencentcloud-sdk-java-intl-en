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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveDocRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * File name.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File type (md|txt|docx|pdf|xlsx).
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * The cos path of the platform, consistent with the UploadPath parameter queried by the DescribeStorageCredential api.
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * ETag, short for entity tag, is an information tag that identifies the content of an object when it is created and can be used to check whether the content of the object has changed.
    */
    @SerializedName("ETag")
    @Expose
    private String ETag;

    /**
    * Verify the consistency of the uploaded file on the cloud and the local file by validating the crc64 encoding in the cos_hash x-cos-hash-crc64ecma header.<br> After the COS is successfully uploaded, obtain it from the response header.
    */
    @SerializedName("CosHash")
    @Expose
    private String CosHash;

    /**
    * File size.
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Applicable scope of labels: 1: all; 2: by conditional range.
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * Source (0: source file import; 1: web page import).
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Web page (or custom link) address.
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

    /**
    * Label reference.
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabelRefer [] AttrLabels;

    /**
    * External reference link type: 0: system link; 1: custom link.
When the value is 1, the weburl field cannot be empty; otherwise, it will not take effect.
    */
    @SerializedName("ReferUrlType")
    @Expose
    private Long ReferUrlType;

    /**
    * Effective start time, unix timestamp.
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * Effective end time, unix timestamp. 0 indicates permanent validity.
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
    * Whether to reference a link.
    */
    @SerializedName("IsRefer")
    @Expose
    private Boolean IsRefer;

    /**
    * Document operation type: 1: batch import (import Q&A pairs in batches); 2: document import (normally import a single document). The default value is 1.<br>Please note that when opt = 1, please download the Excel template from the Tencent Cloud Agent Development Platform/TCADP page.
    */
    @SerializedName("Opt")
    @Expose
    private Long Opt;

    /**
    * Category ID.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get File name. 
     * @return FileName File name.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name.
     * @param FileName File name.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File type (md|txt|docx|pdf|xlsx). 
     * @return FileType File type (md|txt|docx|pdf|xlsx).
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type (md|txt|docx|pdf|xlsx).
     * @param FileType File type (md|txt|docx|pdf|xlsx).
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get The cos path of the platform, consistent with the UploadPath parameter queried by the DescribeStorageCredential api. 
     * @return CosUrl The cos path of the platform, consistent with the UploadPath parameter queried by the DescribeStorageCredential api.
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set The cos path of the platform, consistent with the UploadPath parameter queried by the DescribeStorageCredential api.
     * @param CosUrl The cos path of the platform, consistent with the UploadPath parameter queried by the DescribeStorageCredential api.
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get ETag, short for entity tag, is an information tag that identifies the content of an object when it is created and can be used to check whether the content of the object has changed. 
     * @return ETag ETag, short for entity tag, is an information tag that identifies the content of an object when it is created and can be used to check whether the content of the object has changed.
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * Set ETag, short for entity tag, is an information tag that identifies the content of an object when it is created and can be used to check whether the content of the object has changed.
     * @param ETag ETag, short for entity tag, is an information tag that identifies the content of an object when it is created and can be used to check whether the content of the object has changed.
     */
    public void setETag(String ETag) {
        this.ETag = ETag;
    }

    /**
     * Get Verify the consistency of the uploaded file on the cloud and the local file by validating the crc64 encoding in the cos_hash x-cos-hash-crc64ecma header.<br> After the COS is successfully uploaded, obtain it from the response header. 
     * @return CosHash Verify the consistency of the uploaded file on the cloud and the local file by validating the crc64 encoding in the cos_hash x-cos-hash-crc64ecma header.<br> After the COS is successfully uploaded, obtain it from the response header.
     */
    public String getCosHash() {
        return this.CosHash;
    }

    /**
     * Set Verify the consistency of the uploaded file on the cloud and the local file by validating the crc64 encoding in the cos_hash x-cos-hash-crc64ecma header.<br> After the COS is successfully uploaded, obtain it from the response header.
     * @param CosHash Verify the consistency of the uploaded file on the cloud and the local file by validating the crc64 encoding in the cos_hash x-cos-hash-crc64ecma header.<br> After the COS is successfully uploaded, obtain it from the response header.
     */
    public void setCosHash(String CosHash) {
        this.CosHash = CosHash;
    }

    /**
     * Get File size. 
     * @return Size File size.
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set File size.
     * @param Size File size.
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Applicable scope of labels: 1: all; 2: by conditional range. 
     * @return AttrRange Applicable scope of labels: 1: all; 2: by conditional range.
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set Applicable scope of labels: 1: all; 2: by conditional range.
     * @param AttrRange Applicable scope of labels: 1: all; 2: by conditional range.
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get Source (0: source file import; 1: web page import). 
     * @return Source Source (0: source file import; 1: web page import).
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Source (0: source file import; 1: web page import).
     * @param Source Source (0: source file import; 1: web page import).
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Web page (or custom link) address. 
     * @return WebUrl Web page (or custom link) address.
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set Web page (or custom link) address.
     * @param WebUrl Web page (or custom link) address.
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
    }

    /**
     * Get Label reference. 
     * @return AttrLabels Label reference.
     */
    public AttrLabelRefer [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set Label reference.
     * @param AttrLabels Label reference.
     */
    public void setAttrLabels(AttrLabelRefer [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get External reference link type: 0: system link; 1: custom link.
When the value is 1, the weburl field cannot be empty; otherwise, it will not take effect. 
     * @return ReferUrlType External reference link type: 0: system link; 1: custom link.
When the value is 1, the weburl field cannot be empty; otherwise, it will not take effect.
     */
    public Long getReferUrlType() {
        return this.ReferUrlType;
    }

    /**
     * Set External reference link type: 0: system link; 1: custom link.
When the value is 1, the weburl field cannot be empty; otherwise, it will not take effect.
     * @param ReferUrlType External reference link type: 0: system link; 1: custom link.
When the value is 1, the weburl field cannot be empty; otherwise, it will not take effect.
     */
    public void setReferUrlType(Long ReferUrlType) {
        this.ReferUrlType = ReferUrlType;
    }

    /**
     * Get Effective start time, unix timestamp. 
     * @return ExpireStart Effective start time, unix timestamp.
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set Effective start time, unix timestamp.
     * @param ExpireStart Effective start time, unix timestamp.
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get Effective end time, unix timestamp. 0 indicates permanent validity. 
     * @return ExpireEnd Effective end time, unix timestamp. 0 indicates permanent validity.
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set Effective end time, unix timestamp. 0 indicates permanent validity.
     * @param ExpireEnd Effective end time, unix timestamp. 0 indicates permanent validity.
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    /**
     * Get Whether to reference a link. 
     * @return IsRefer Whether to reference a link.
     */
    public Boolean getIsRefer() {
        return this.IsRefer;
    }

    /**
     * Set Whether to reference a link.
     * @param IsRefer Whether to reference a link.
     */
    public void setIsRefer(Boolean IsRefer) {
        this.IsRefer = IsRefer;
    }

    /**
     * Get Document operation type: 1: batch import (import Q&A pairs in batches); 2: document import (normally import a single document). The default value is 1.<br>Please note that when opt = 1, please download the Excel template from the Tencent Cloud Agent Development Platform/TCADP page. 
     * @return Opt Document operation type: 1: batch import (import Q&A pairs in batches); 2: document import (normally import a single document). The default value is 1.<br>Please note that when opt = 1, please download the Excel template from the Tencent Cloud Agent Development Platform/TCADP page.
     */
    public Long getOpt() {
        return this.Opt;
    }

    /**
     * Set Document operation type: 1: batch import (import Q&A pairs in batches); 2: document import (normally import a single document). The default value is 1.<br>Please note that when opt = 1, please download the Excel template from the Tencent Cloud Agent Development Platform/TCADP page.
     * @param Opt Document operation type: 1: batch import (import Q&A pairs in batches); 2: document import (normally import a single document). The default value is 1.<br>Please note that when opt = 1, please download the Excel template from the Tencent Cloud Agent Development Platform/TCADP page.
     */
    public void setOpt(Long Opt) {
        this.Opt = Opt;
    }

    /**
     * Get Category ID. 
     * @return CateBizId Category ID.
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set Category ID.
     * @param CateBizId Category ID.
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    public SaveDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveDocRequest(SaveDocRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.ETag != null) {
            this.ETag = new String(source.ETag);
        }
        if (source.CosHash != null) {
            this.CosHash = new String(source.CosHash);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.WebUrl != null) {
            this.WebUrl = new String(source.WebUrl);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabelRefer[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabelRefer(source.AttrLabels[i]);
            }
        }
        if (source.ReferUrlType != null) {
            this.ReferUrlType = new Long(source.ReferUrlType);
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
        if (source.IsRefer != null) {
            this.IsRefer = new Boolean(source.IsRefer);
        }
        if (source.Opt != null) {
            this.Opt = new Long(source.Opt);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "ETag", this.ETag);
        this.setParamSimple(map, prefix + "CosHash", this.CosHash);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "WebUrl", this.WebUrl);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "ReferUrlType", this.ReferUrlType);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamSimple(map, prefix + "IsRefer", this.IsRefer);
        this.setParamSimple(map, prefix + "Opt", this.Opt);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);

    }
}

