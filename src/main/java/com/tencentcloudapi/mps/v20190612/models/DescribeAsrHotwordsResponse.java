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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsrHotwordsResponse extends AbstractModel {

    /**
    * ID of the hotword lexicon to be queried.
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * Current hotword lexicon id status. a value of 0 indicates that no template is bound to this hotword lexicon at the query moment and it can be deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Name of the hot lexicon.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the value is 0 for a temporary hotword lexicon and returns the string provided during creation.
Specifies the value is 1 for a file-based hotword lexicon, and returns the content of the file uploaded during creation.


    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Name of the uploaded hotword file.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * List of hotwords returned for the query.
    */
    @SerializedName("HotWords")
    @Expose
    private AsrHotwordsSetItem [] HotWords;

    /**
    * Hotword text, which depends on the value of Type.
If the value of Type is 0, the hotword string is returned.
If the value of Type is 1, the base64-encoded content of the hotword file is returned.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Number of words contained in the hotword lexicon.
    */
    @SerializedName("WordCount")
    @Expose
    private Long WordCount;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Hot word lexicon createtime in ISOUTC format "2006-01-02T15:04:05Z".
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Hot lexicon last modified in ISOUTC format "2006-01-02T15:04:05Z".
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the hotword lexicon to be queried. 
     * @return HotwordsId ID of the hotword lexicon to be queried.
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set ID of the hotword lexicon to be queried.
     * @param HotwordsId ID of the hotword lexicon to be queried.
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get Current hotword lexicon id status. a value of 0 indicates that no template is bound to this hotword lexicon at the query moment and it can be deleted. 
     * @return Status Current hotword lexicon id status. a value of 0 indicates that no template is bound to this hotword lexicon at the query moment and it can be deleted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current hotword lexicon id status. a value of 0 indicates that no template is bound to this hotword lexicon at the query moment and it can be deleted.
     * @param Status Current hotword lexicon id status. a value of 0 indicates that no template is bound to this hotword lexicon at the query moment and it can be deleted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Name of the hot lexicon. 
     * @return Name Name of the hot lexicon.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the hot lexicon.
     * @param Name Name of the hot lexicon.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the value is 0 for a temporary hotword lexicon and returns the string provided during creation.
Specifies the value is 1 for a file-based hotword lexicon, and returns the content of the file uploaded during creation.

 
     * @return Type Specifies the value is 0 for a temporary hotword lexicon and returns the string provided during creation.
Specifies the value is 1 for a file-based hotword lexicon, and returns the content of the file uploaded during creation.


     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Specifies the value is 0 for a temporary hotword lexicon and returns the string provided during creation.
Specifies the value is 1 for a file-based hotword lexicon, and returns the content of the file uploaded during creation.


     * @param Type Specifies the value is 0 for a temporary hotword lexicon and returns the string provided during creation.
Specifies the value is 1 for a file-based hotword lexicon, and returns the content of the file uploaded during creation.


     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Name of the uploaded hotword file. 
     * @return FileName Name of the uploaded hotword file.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Name of the uploaded hotword file.
     * @param FileName Name of the uploaded hotword file.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get List of hotwords returned for the query. 
     * @return HotWords List of hotwords returned for the query.
     */
    public AsrHotwordsSetItem [] getHotWords() {
        return this.HotWords;
    }

    /**
     * Set List of hotwords returned for the query.
     * @param HotWords List of hotwords returned for the query.
     */
    public void setHotWords(AsrHotwordsSetItem [] HotWords) {
        this.HotWords = HotWords;
    }

    /**
     * Get Hotword text, which depends on the value of Type.
If the value of Type is 0, the hotword string is returned.
If the value of Type is 1, the base64-encoded content of the hotword file is returned. 
     * @return Content Hotword text, which depends on the value of Type.
If the value of Type is 0, the hotword string is returned.
If the value of Type is 1, the base64-encoded content of the hotword file is returned.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Hotword text, which depends on the value of Type.
If the value of Type is 0, the hotword string is returned.
If the value of Type is 1, the base64-encoded content of the hotword file is returned.
     * @param Content Hotword text, which depends on the value of Type.
If the value of Type is 0, the hotword string is returned.
If the value of Type is 1, the base64-encoded content of the hotword file is returned.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Number of words contained in the hotword lexicon. 
     * @return WordCount Number of words contained in the hotword lexicon.
     */
    public Long getWordCount() {
        return this.WordCount;
    }

    /**
     * Set Number of words contained in the hotword lexicon.
     * @param WordCount Number of words contained in the hotword lexicon.
     */
    public void setWordCount(Long WordCount) {
        this.WordCount = WordCount;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Hot word lexicon createtime in ISOUTC format "2006-01-02T15:04:05Z". 
     * @return CreateTime Hot word lexicon createtime in ISOUTC format "2006-01-02T15:04:05Z".
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Hot word lexicon createtime in ISOUTC format "2006-01-02T15:04:05Z".
     * @param CreateTime Hot word lexicon createtime in ISOUTC format "2006-01-02T15:04:05Z".
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Hot lexicon last modified in ISOUTC format "2006-01-02T15:04:05Z". 
     * @return UpdateTime Hot lexicon last modified in ISOUTC format "2006-01-02T15:04:05Z".
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Hot lexicon last modified in ISOUTC format "2006-01-02T15:04:05Z".
     * @param UpdateTime Hot lexicon last modified in ISOUTC format "2006-01-02T15:04:05Z".
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAsrHotwordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsrHotwordsResponse(DescribeAsrHotwordsResponse source) {
        if (source.HotwordsId != null) {
            this.HotwordsId = new String(source.HotwordsId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.HotWords != null) {
            this.HotWords = new AsrHotwordsSetItem[source.HotWords.length];
            for (int i = 0; i < source.HotWords.length; i++) {
                this.HotWords[i] = new AsrHotwordsSetItem(source.HotWords[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.WordCount != null) {
            this.WordCount = new Long(source.WordCount);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HotwordsId", this.HotwordsId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArrayObj(map, prefix + "HotWords.", this.HotWords);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "WordCount", this.WordCount);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

