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

public class DocSegment extends AbstractModel {

    /**
    * Fragment ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Business ID.
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * File type (markdown, word, txt).
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Document segment type (segment, table).
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * Title.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Paragraph content.
    */
    @SerializedName("PageContent")
    @Expose
    private String PageContent;

    /**
    * Original paragraph.
    */
    @SerializedName("OrgData")
    @Expose
    private String OrgData;

    /**
    * Article ID.
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * Document business ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * Document URL.
    */
    @SerializedName("DocUrl")
    @Expose
    private String DocUrl;

    /**
     * Get Fragment ID. 
     * @return Id Fragment ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Fragment ID.
     * @param Id Fragment ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Business ID. 
     * @return BusinessId Business ID.
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set Business ID.
     * @param BusinessId Business ID.
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get File type (markdown, word, txt). 
     * @return FileType File type (markdown, word, txt).
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type (markdown, word, txt).
     * @param FileType File type (markdown, word, txt).
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Document segment type (segment, table). 
     * @return SegmentType Document segment type (segment, table).
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set Document segment type (segment, table).
     * @param SegmentType Document segment type (segment, table).
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get Title. 
     * @return Title Title.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Title.
     * @param Title Title.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Paragraph content. 
     * @return PageContent Paragraph content.
     */
    public String getPageContent() {
        return this.PageContent;
    }

    /**
     * Set Paragraph content.
     * @param PageContent Paragraph content.
     */
    public void setPageContent(String PageContent) {
        this.PageContent = PageContent;
    }

    /**
     * Get Original paragraph. 
     * @return OrgData Original paragraph.
     */
    public String getOrgData() {
        return this.OrgData;
    }

    /**
     * Set Original paragraph.
     * @param OrgData Original paragraph.
     */
    public void setOrgData(String OrgData) {
        this.OrgData = OrgData;
    }

    /**
     * Get Article ID. 
     * @return DocId Article ID.
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set Article ID.
     * @param DocId Article ID.
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get Document business ID. 
     * @return DocBizId Document business ID.
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document business ID.
     * @param DocBizId Document business ID.
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get Document URL. 
     * @return DocUrl Document URL.
     */
    public String getDocUrl() {
        return this.DocUrl;
    }

    /**
     * Set Document URL.
     * @param DocUrl Document URL.
     */
    public void setDocUrl(String DocUrl) {
        this.DocUrl = DocUrl;
    }

    public DocSegment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocSegment(DocSegment source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.PageContent != null) {
            this.PageContent = new String(source.PageContent);
        }
        if (source.OrgData != null) {
            this.OrgData = new String(source.OrgData);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.DocUrl != null) {
            this.DocUrl = new String(source.DocUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "PageContent", this.PageContent);
        this.setParamSimple(map, prefix + "OrgData", this.OrgData);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "DocUrl", this.DocUrl);

    }
}

