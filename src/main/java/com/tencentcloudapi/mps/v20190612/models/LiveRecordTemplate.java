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

public class LiveRecordTemplate extends AbstractModel {

    /**
    * Unique identifier of the recording template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * HLS configuration parameters
    */
    @SerializedName("HLSConfigure")
    @Expose
    private HLSConfigureInfo HLSConfigure;

    /**
    * MP4 configuration parameter.
    */
    @SerializedName("MP4Configure")
    @Expose
    private MP4ConfigureInfo MP4Configure;

    /**
    * Recording template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description information.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Recording type. Valid values: video: audio and video recording; audio: audio recording; auto: automatic detection.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
     * Get Unique identifier of the recording template. 
     * @return Definition Unique identifier of the recording template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the recording template.
     * @param Definition Unique identifier of the recording template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get HLS configuration parameters 
     * @return HLSConfigure HLS configuration parameters
     */
    public HLSConfigureInfo getHLSConfigure() {
        return this.HLSConfigure;
    }

    /**
     * Set HLS configuration parameters
     * @param HLSConfigure HLS configuration parameters
     */
    public void setHLSConfigure(HLSConfigureInfo HLSConfigure) {
        this.HLSConfigure = HLSConfigure;
    }

    /**
     * Get MP4 configuration parameter. 
     * @return MP4Configure MP4 configuration parameter.
     */
    public MP4ConfigureInfo getMP4Configure() {
        return this.MP4Configure;
    }

    /**
     * Set MP4 configuration parameter.
     * @param MP4Configure MP4 configuration parameter.
     */
    public void setMP4Configure(MP4ConfigureInfo MP4Configure) {
        this.MP4Configure = MP4Configure;
    }

    /**
     * Get Recording template name. 
     * @return Name Recording template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Recording template name.
     * @param Name Recording template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description information. 
     * @return Comment Template description information.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description information.
     * @param Comment Template description information.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
     * @param Type Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return UpdateTime Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param UpdateTime Last modification time of the template in [ISO datetime format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Recording type. Valid values: video: audio and video recording; audio: audio recording; auto: automatic detection. 
     * @return RecordType Recording type. Valid values: video: audio and video recording; audio: audio recording; auto: automatic detection.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Recording type. Valid values: video: audio and video recording; audio: audio recording; auto: automatic detection.
     * @param RecordType Recording type. Valid values: video: audio and video recording; audio: audio recording; auto: automatic detection.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    public LiveRecordTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordTemplate(LiveRecordTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.HLSConfigure != null) {
            this.HLSConfigure = new HLSConfigureInfo(source.HLSConfigure);
        }
        if (source.MP4Configure != null) {
            this.MP4Configure = new MP4ConfigureInfo(source.MP4Configure);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "HLSConfigure.", this.HLSConfigure);
        this.setParamObj(map, prefix + "MP4Configure.", this.MP4Configure);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);

    }
}

