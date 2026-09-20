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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaInfoRequest extends AbstractModel {

    /**
    * <p>Media file unique identifier.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Media filename, up to 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Media file description, up to 128 characters.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Media File Category ID.</p>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>Media file expiry time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. "9999-12-31T23:59:59Z" means it never expires. After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Base64-encoded string of the video cover image file (for example, jpeg, png), only supports gif, jpeg, and png image formats.</p>
    */
    @SerializedName("CoverData")
    @Expose
    private String CoverData;

    /**
    * <p>Newly added set of video timestamp information. If a timestamp already exists at a certain offset, an overlay operation will be performed. A single media file can have up to 100 timestamp entries. In the same request, the time offset parameters of AddKeyFrameDescs must all be different from those of DeleteKeyFrameDescs.</p>
    */
    @SerializedName("AddKeyFrameDescs")
    @Expose
    private MediaKeyFrameDescItem [] AddKeyFrameDescs;

    /**
    * <p>Time offset of the video timestamp information set to be deleted, unit: seconds. In the same request, the time offset parameter of AddKeyFrameDescs must be different from that of DeleteKeyFrameDescs.</p>
    */
    @SerializedName("DeleteKeyFrameDescs")
    @Expose
    private Float [] DeleteKeyFrameDescs;

    /**
    * <p>The value 1 means to clear video dotting information. Other values are meaningless.<br>In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.</p>
    */
    @SerializedName("ClearKeyFrameDescs")
    @Expose
    private Long ClearKeyFrameDescs;

    /**
    * <p>A newly-added group of tags. The maximum for a single media file is 16 tags, and a single tag can contain up to 32 characters. In the same request, the AddTags parameter must be different from DeleteTags.</p>
    */
    @SerializedName("AddTags")
    @Expose
    private String [] AddTags;

    /**
    * <p>A set of tags to delete. In the same request, the AddTags parameter must be all different from DeleteTags.</p>
    */
    @SerializedName("DeleteTags")
    @Expose
    private String [] DeleteTags;

    /**
    * <p>The value 1 means to clear all tags of the media file. Other values are meaningless.<br>In the same request, ClearTags and AddTags cannot appear simultaneously.</p>
    */
    @SerializedName("ClearTags")
    @Expose
    private Long ClearTags;

    /**
    * <p>Add a set of subtitles. The maximum for a single media file is 16 subtitles. In the same request, the subtitle IDs specified in AddSubtitles must all be different from DeleteSubtitleIds.</p>
    */
    @SerializedName("AddSubtitles")
    @Expose
    private MediaSubtitleInput [] AddSubtitles;

    /**
    * <p>Unique identifier of subtitle to be deleted. In the same request, the subtitle id specified in AddSubtitles must be different from all DeleteSubtitleIds.</p>
    */
    @SerializedName("DeleteSubtitleIds")
    @Expose
    private String [] DeleteSubtitleIds;

    /**
    * <p>The value 1 means to clear all subtitle information of the media file. Other values are meaningless.<br>In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.</p>
    */
    @SerializedName("ClearSubtitles")
    @Expose
    private Long ClearSubtitles;

    /**
    * <p>ID of the knowledge base to be outbound.</p>
    */
    @SerializedName("DeleteKnowledgeBases")
    @Expose
    private String [] DeleteKnowledgeBases;

    /**
    * <p>Value 1 means removing this media file from ALL knowledge bases, other values meaningless.</p><p><br>In the same request, ClearKnowledgeBases and DeleteKnowledgeBases cannot appear simultaneously.<p></p></p>
    */
    @SerializedName("ClearKnowledgeBases")
    @Expose
    private Long ClearKnowledgeBases;

    /**
     * Get <p>Media file unique identifier.</p> 
     * @return FileId <p>Media file unique identifier.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file unique identifier.</p>
     * @param FileId <p>Media file unique identifier.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Media filename, up to 64 characters.</p> 
     * @return Name <p>Media filename, up to 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Media filename, up to 64 characters.</p>
     * @param Name <p>Media filename, up to 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Media file description, up to 128 characters.</p> 
     * @return Description <p>Media file description, up to 128 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Media file description, up to 128 characters.</p>
     * @param Description <p>Media file description, up to 128 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Media File Category ID.</p> 
     * @return ClassId <p>Media File Category ID.</p>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>Media File Category ID.</p>
     * @param ClassId <p>Media File Category ID.</p>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>Media file expiry time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. "9999-12-31T23:59:59Z" means it never expires. After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted.</p> 
     * @return ExpireTime <p>Media file expiry time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. "9999-12-31T23:59:59Z" means it never expires. After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Media file expiry time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. "9999-12-31T23:59:59Z" means it never expires. After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted.</p>
     * @param ExpireTime <p>Media file expiry time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. "9999-12-31T23:59:59Z" means it never expires. After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Base64-encoded string of the video cover image file (for example, jpeg, png), only supports gif, jpeg, and png image formats.</p> 
     * @return CoverData <p>Base64-encoded string of the video cover image file (for example, jpeg, png), only supports gif, jpeg, and png image formats.</p>
     */
    public String getCoverData() {
        return this.CoverData;
    }

    /**
     * Set <p>Base64-encoded string of the video cover image file (for example, jpeg, png), only supports gif, jpeg, and png image formats.</p>
     * @param CoverData <p>Base64-encoded string of the video cover image file (for example, jpeg, png), only supports gif, jpeg, and png image formats.</p>
     */
    public void setCoverData(String CoverData) {
        this.CoverData = CoverData;
    }

    /**
     * Get <p>Newly added set of video timestamp information. If a timestamp already exists at a certain offset, an overlay operation will be performed. A single media file can have up to 100 timestamp entries. In the same request, the time offset parameters of AddKeyFrameDescs must all be different from those of DeleteKeyFrameDescs.</p> 
     * @return AddKeyFrameDescs <p>Newly added set of video timestamp information. If a timestamp already exists at a certain offset, an overlay operation will be performed. A single media file can have up to 100 timestamp entries. In the same request, the time offset parameters of AddKeyFrameDescs must all be different from those of DeleteKeyFrameDescs.</p>
     */
    public MediaKeyFrameDescItem [] getAddKeyFrameDescs() {
        return this.AddKeyFrameDescs;
    }

    /**
     * Set <p>Newly added set of video timestamp information. If a timestamp already exists at a certain offset, an overlay operation will be performed. A single media file can have up to 100 timestamp entries. In the same request, the time offset parameters of AddKeyFrameDescs must all be different from those of DeleteKeyFrameDescs.</p>
     * @param AddKeyFrameDescs <p>Newly added set of video timestamp information. If a timestamp already exists at a certain offset, an overlay operation will be performed. A single media file can have up to 100 timestamp entries. In the same request, the time offset parameters of AddKeyFrameDescs must all be different from those of DeleteKeyFrameDescs.</p>
     */
    public void setAddKeyFrameDescs(MediaKeyFrameDescItem [] AddKeyFrameDescs) {
        this.AddKeyFrameDescs = AddKeyFrameDescs;
    }

    /**
     * Get <p>Time offset of the video timestamp information set to be deleted, unit: seconds. In the same request, the time offset parameter of AddKeyFrameDescs must be different from that of DeleteKeyFrameDescs.</p> 
     * @return DeleteKeyFrameDescs <p>Time offset of the video timestamp information set to be deleted, unit: seconds. In the same request, the time offset parameter of AddKeyFrameDescs must be different from that of DeleteKeyFrameDescs.</p>
     */
    public Float [] getDeleteKeyFrameDescs() {
        return this.DeleteKeyFrameDescs;
    }

    /**
     * Set <p>Time offset of the video timestamp information set to be deleted, unit: seconds. In the same request, the time offset parameter of AddKeyFrameDescs must be different from that of DeleteKeyFrameDescs.</p>
     * @param DeleteKeyFrameDescs <p>Time offset of the video timestamp information set to be deleted, unit: seconds. In the same request, the time offset parameter of AddKeyFrameDescs must be different from that of DeleteKeyFrameDescs.</p>
     */
    public void setDeleteKeyFrameDescs(Float [] DeleteKeyFrameDescs) {
        this.DeleteKeyFrameDescs = DeleteKeyFrameDescs;
    }

    /**
     * Get <p>The value 1 means to clear video dotting information. Other values are meaningless.<br>In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.</p> 
     * @return ClearKeyFrameDescs <p>The value 1 means to clear video dotting information. Other values are meaningless.<br>In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.</p>
     */
    public Long getClearKeyFrameDescs() {
        return this.ClearKeyFrameDescs;
    }

    /**
     * Set <p>The value 1 means to clear video dotting information. Other values are meaningless.<br>In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.</p>
     * @param ClearKeyFrameDescs <p>The value 1 means to clear video dotting information. Other values are meaningless.<br>In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.</p>
     */
    public void setClearKeyFrameDescs(Long ClearKeyFrameDescs) {
        this.ClearKeyFrameDescs = ClearKeyFrameDescs;
    }

    /**
     * Get <p>A newly-added group of tags. The maximum for a single media file is 16 tags, and a single tag can contain up to 32 characters. In the same request, the AddTags parameter must be different from DeleteTags.</p> 
     * @return AddTags <p>A newly-added group of tags. The maximum for a single media file is 16 tags, and a single tag can contain up to 32 characters. In the same request, the AddTags parameter must be different from DeleteTags.</p>
     */
    public String [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set <p>A newly-added group of tags. The maximum for a single media file is 16 tags, and a single tag can contain up to 32 characters. In the same request, the AddTags parameter must be different from DeleteTags.</p>
     * @param AddTags <p>A newly-added group of tags. The maximum for a single media file is 16 tags, and a single tag can contain up to 32 characters. In the same request, the AddTags parameter must be different from DeleteTags.</p>
     */
    public void setAddTags(String [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get <p>A set of tags to delete. In the same request, the AddTags parameter must be all different from DeleteTags.</p> 
     * @return DeleteTags <p>A set of tags to delete. In the same request, the AddTags parameter must be all different from DeleteTags.</p>
     */
    public String [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set <p>A set of tags to delete. In the same request, the AddTags parameter must be all different from DeleteTags.</p>
     * @param DeleteTags <p>A set of tags to delete. In the same request, the AddTags parameter must be all different from DeleteTags.</p>
     */
    public void setDeleteTags(String [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Get <p>The value 1 means to clear all tags of the media file. Other values are meaningless.<br>In the same request, ClearTags and AddTags cannot appear simultaneously.</p> 
     * @return ClearTags <p>The value 1 means to clear all tags of the media file. Other values are meaningless.<br>In the same request, ClearTags and AddTags cannot appear simultaneously.</p>
     */
    public Long getClearTags() {
        return this.ClearTags;
    }

    /**
     * Set <p>The value 1 means to clear all tags of the media file. Other values are meaningless.<br>In the same request, ClearTags and AddTags cannot appear simultaneously.</p>
     * @param ClearTags <p>The value 1 means to clear all tags of the media file. Other values are meaningless.<br>In the same request, ClearTags and AddTags cannot appear simultaneously.</p>
     */
    public void setClearTags(Long ClearTags) {
        this.ClearTags = ClearTags;
    }

    /**
     * Get <p>Add a set of subtitles. The maximum for a single media file is 16 subtitles. In the same request, the subtitle IDs specified in AddSubtitles must all be different from DeleteSubtitleIds.</p> 
     * @return AddSubtitles <p>Add a set of subtitles. The maximum for a single media file is 16 subtitles. In the same request, the subtitle IDs specified in AddSubtitles must all be different from DeleteSubtitleIds.</p>
     */
    public MediaSubtitleInput [] getAddSubtitles() {
        return this.AddSubtitles;
    }

    /**
     * Set <p>Add a set of subtitles. The maximum for a single media file is 16 subtitles. In the same request, the subtitle IDs specified in AddSubtitles must all be different from DeleteSubtitleIds.</p>
     * @param AddSubtitles <p>Add a set of subtitles. The maximum for a single media file is 16 subtitles. In the same request, the subtitle IDs specified in AddSubtitles must all be different from DeleteSubtitleIds.</p>
     */
    public void setAddSubtitles(MediaSubtitleInput [] AddSubtitles) {
        this.AddSubtitles = AddSubtitles;
    }

    /**
     * Get <p>Unique identifier of subtitle to be deleted. In the same request, the subtitle id specified in AddSubtitles must be different from all DeleteSubtitleIds.</p> 
     * @return DeleteSubtitleIds <p>Unique identifier of subtitle to be deleted. In the same request, the subtitle id specified in AddSubtitles must be different from all DeleteSubtitleIds.</p>
     */
    public String [] getDeleteSubtitleIds() {
        return this.DeleteSubtitleIds;
    }

    /**
     * Set <p>Unique identifier of subtitle to be deleted. In the same request, the subtitle id specified in AddSubtitles must be different from all DeleteSubtitleIds.</p>
     * @param DeleteSubtitleIds <p>Unique identifier of subtitle to be deleted. In the same request, the subtitle id specified in AddSubtitles must be different from all DeleteSubtitleIds.</p>
     */
    public void setDeleteSubtitleIds(String [] DeleteSubtitleIds) {
        this.DeleteSubtitleIds = DeleteSubtitleIds;
    }

    /**
     * Get <p>The value 1 means to clear all subtitle information of the media file. Other values are meaningless.<br>In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.</p> 
     * @return ClearSubtitles <p>The value 1 means to clear all subtitle information of the media file. Other values are meaningless.<br>In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.</p>
     */
    public Long getClearSubtitles() {
        return this.ClearSubtitles;
    }

    /**
     * Set <p>The value 1 means to clear all subtitle information of the media file. Other values are meaningless.<br>In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.</p>
     * @param ClearSubtitles <p>The value 1 means to clear all subtitle information of the media file. Other values are meaningless.<br>In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.</p>
     */
    public void setClearSubtitles(Long ClearSubtitles) {
        this.ClearSubtitles = ClearSubtitles;
    }

    /**
     * Get <p>ID of the knowledge base to be outbound.</p> 
     * @return DeleteKnowledgeBases <p>ID of the knowledge base to be outbound.</p>
     */
    public String [] getDeleteKnowledgeBases() {
        return this.DeleteKnowledgeBases;
    }

    /**
     * Set <p>ID of the knowledge base to be outbound.</p>
     * @param DeleteKnowledgeBases <p>ID of the knowledge base to be outbound.</p>
     */
    public void setDeleteKnowledgeBases(String [] DeleteKnowledgeBases) {
        this.DeleteKnowledgeBases = DeleteKnowledgeBases;
    }

    /**
     * Get <p>Value 1 means removing this media file from ALL knowledge bases, other values meaningless.</p><p><br>In the same request, ClearKnowledgeBases and DeleteKnowledgeBases cannot appear simultaneously.<p></p></p> 
     * @return ClearKnowledgeBases <p>Value 1 means removing this media file from ALL knowledge bases, other values meaningless.</p><p><br>In the same request, ClearKnowledgeBases and DeleteKnowledgeBases cannot appear simultaneously.<p></p></p>
     */
    public Long getClearKnowledgeBases() {
        return this.ClearKnowledgeBases;
    }

    /**
     * Set <p>Value 1 means removing this media file from ALL knowledge bases, other values meaningless.</p><p><br>In the same request, ClearKnowledgeBases and DeleteKnowledgeBases cannot appear simultaneously.<p></p></p>
     * @param ClearKnowledgeBases <p>Value 1 means removing this media file from ALL knowledge bases, other values meaningless.</p><p><br>In the same request, ClearKnowledgeBases and DeleteKnowledgeBases cannot appear simultaneously.<p></p></p>
     */
    public void setClearKnowledgeBases(Long ClearKnowledgeBases) {
        this.ClearKnowledgeBases = ClearKnowledgeBases;
    }

    public ModifyMediaInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaInfoRequest(ModifyMediaInfoRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CoverData != null) {
            this.CoverData = new String(source.CoverData);
        }
        if (source.AddKeyFrameDescs != null) {
            this.AddKeyFrameDescs = new MediaKeyFrameDescItem[source.AddKeyFrameDescs.length];
            for (int i = 0; i < source.AddKeyFrameDescs.length; i++) {
                this.AddKeyFrameDescs[i] = new MediaKeyFrameDescItem(source.AddKeyFrameDescs[i]);
            }
        }
        if (source.DeleteKeyFrameDescs != null) {
            this.DeleteKeyFrameDescs = new Float[source.DeleteKeyFrameDescs.length];
            for (int i = 0; i < source.DeleteKeyFrameDescs.length; i++) {
                this.DeleteKeyFrameDescs[i] = new Float(source.DeleteKeyFrameDescs[i]);
            }
        }
        if (source.ClearKeyFrameDescs != null) {
            this.ClearKeyFrameDescs = new Long(source.ClearKeyFrameDescs);
        }
        if (source.AddTags != null) {
            this.AddTags = new String[source.AddTags.length];
            for (int i = 0; i < source.AddTags.length; i++) {
                this.AddTags[i] = new String(source.AddTags[i]);
            }
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new String[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new String(source.DeleteTags[i]);
            }
        }
        if (source.ClearTags != null) {
            this.ClearTags = new Long(source.ClearTags);
        }
        if (source.AddSubtitles != null) {
            this.AddSubtitles = new MediaSubtitleInput[source.AddSubtitles.length];
            for (int i = 0; i < source.AddSubtitles.length; i++) {
                this.AddSubtitles[i] = new MediaSubtitleInput(source.AddSubtitles[i]);
            }
        }
        if (source.DeleteSubtitleIds != null) {
            this.DeleteSubtitleIds = new String[source.DeleteSubtitleIds.length];
            for (int i = 0; i < source.DeleteSubtitleIds.length; i++) {
                this.DeleteSubtitleIds[i] = new String(source.DeleteSubtitleIds[i]);
            }
        }
        if (source.ClearSubtitles != null) {
            this.ClearSubtitles = new Long(source.ClearSubtitles);
        }
        if (source.DeleteKnowledgeBases != null) {
            this.DeleteKnowledgeBases = new String[source.DeleteKnowledgeBases.length];
            for (int i = 0; i < source.DeleteKnowledgeBases.length; i++) {
                this.DeleteKnowledgeBases[i] = new String(source.DeleteKnowledgeBases[i]);
            }
        }
        if (source.ClearKnowledgeBases != null) {
            this.ClearKnowledgeBases = new Long(source.ClearKnowledgeBases);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CoverData", this.CoverData);
        this.setParamArrayObj(map, prefix + "AddKeyFrameDescs.", this.AddKeyFrameDescs);
        this.setParamArraySimple(map, prefix + "DeleteKeyFrameDescs.", this.DeleteKeyFrameDescs);
        this.setParamSimple(map, prefix + "ClearKeyFrameDescs", this.ClearKeyFrameDescs);
        this.setParamArraySimple(map, prefix + "AddTags.", this.AddTags);
        this.setParamArraySimple(map, prefix + "DeleteTags.", this.DeleteTags);
        this.setParamSimple(map, prefix + "ClearTags", this.ClearTags);
        this.setParamArrayObj(map, prefix + "AddSubtitles.", this.AddSubtitles);
        this.setParamArraySimple(map, prefix + "DeleteSubtitleIds.", this.DeleteSubtitleIds);
        this.setParamSimple(map, prefix + "ClearSubtitles", this.ClearSubtitles);
        this.setParamArraySimple(map, prefix + "DeleteKnowledgeBases.", this.DeleteKnowledgeBases);
        this.setParamSimple(map, prefix + "ClearKnowledgeBases", this.ClearKnowledgeBases);

    }
}

