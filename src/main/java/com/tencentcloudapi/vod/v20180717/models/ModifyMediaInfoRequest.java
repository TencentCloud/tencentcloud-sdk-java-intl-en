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
    * Unique identifier of a media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Media filename, with a maximum length of 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Media file description, longest 128 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Media File Category ID.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Media file expiry time uses [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate no expiry. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * The video cover image file (such as jpeg, png) is an encoded string in [Base64](https://tools.ietf.org/html/rfc4648). Only three image formats (gif, jpeg, png) are supported.
    */
    @SerializedName("CoverData")
    @Expose
    private String CoverData;

    /**
    * Newly added set of video timestamp information. If timestamp already exists at a certain offset, perform overlay operation. Maximum for a single media file is 100 Dotting Information. In the same request, time offset parameter of AddKeyFrameDescs must be all different from DeleteKeyFrameDescs.
    */
    @SerializedName("AddKeyFrameDescs")
    @Expose
    private MediaKeyFrameDescItem [] AddKeyFrameDescs;

    /**
    * Time offset of the video timestamp information set to be deleted, unit: second. In the same request, the time offset parameter of AddKeyFrameDescs must be consistent with all different DeleteKeyFrameDescs.
    */
    @SerializedName("DeleteKeyFrameDescs")
    @Expose
    private Float [] DeleteKeyFrameDescs;

    /**
    * Value 1 indicates clearing video dotting information. Other values meaningless.
In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.
    */
    @SerializedName("ClearKeyFrameDescs")
    @Expose
    private Long ClearKeyFrameDescs;

    /**
    * A group of newly-added tags. Maximum for a single media file is 16 tags. Maximum for a single tag is 32 characters. In the same request, the AddTags parameter must be consistent with DeleteTags.
    */
    @SerializedName("AddTags")
    @Expose
    private String [] AddTags;

    /**
    * A group of tags to delete. In the same request, the AddTags parameter must be different from DeleteTags.
    */
    @SerializedName("DeleteTags")
    @Expose
    private String [] DeleteTags;

    /**
    * Value 1 means clear all media files, other values meaningless.
In the same request, ClearTags and AddTags cannot appear simultaneously.
    */
    @SerializedName("ClearTags")
    @Expose
    private Long ClearTags;

    /**
    * Add a set of subtitles. Maximum for a single media file is 16 subtitles. In the same request, the specified subtitle ID in AddSubtitles must be all different from those in DeleteSubtitleIds.
    */
    @SerializedName("AddSubtitles")
    @Expose
    private MediaSubtitleInput [] AddSubtitles;

    /**
    * Unique identifier of subtitle to be deleted. In the same request, the specified subtitle id in AddSubtitles must be consistent with all different in DeleteSubtitleIds.
    */
    @SerializedName("DeleteSubtitleIds")
    @Expose
    private String [] DeleteSubtitleIds;

    /**
    * Value 1 means clear all subtitle information of the media file. Other values meaningless.
In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.
    */
    @SerializedName("ClearSubtitles")
    @Expose
    private Long ClearSubtitles;

    /**
     * Get Unique identifier of a media file. 
     * @return FileId Unique identifier of a media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique identifier of a media file.
     * @param FileId Unique identifier of a media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Media filename, with a maximum length of 64 characters. 
     * @return Name Media filename, with a maximum length of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media filename, with a maximum length of 64 characters.
     * @param Name Media filename, with a maximum length of 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Media file description, longest 128 characters. 
     * @return Description Media file description, longest 128 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Media file description, longest 128 characters.
     * @param Description Media file description, longest 128 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Media File Category ID. 
     * @return ClassId Media File Category ID.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Media File Category ID.
     * @param ClassId Media File Category ID.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Media file expiry time uses [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate no expiry. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. 
     * @return ExpireTime Media file expiry time uses [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate no expiry. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Media file expiry time uses [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate no expiry. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted.
     * @param ExpireTime Media file expiry time uses [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate no expiry. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get The video cover image file (such as jpeg, png) is an encoded string in [Base64](https://tools.ietf.org/html/rfc4648). Only three image formats (gif, jpeg, png) are supported. 
     * @return CoverData The video cover image file (such as jpeg, png) is an encoded string in [Base64](https://tools.ietf.org/html/rfc4648). Only three image formats (gif, jpeg, png) are supported.
     */
    public String getCoverData() {
        return this.CoverData;
    }

    /**
     * Set The video cover image file (such as jpeg, png) is an encoded string in [Base64](https://tools.ietf.org/html/rfc4648). Only three image formats (gif, jpeg, png) are supported.
     * @param CoverData The video cover image file (such as jpeg, png) is an encoded string in [Base64](https://tools.ietf.org/html/rfc4648). Only three image formats (gif, jpeg, png) are supported.
     */
    public void setCoverData(String CoverData) {
        this.CoverData = CoverData;
    }

    /**
     * Get Newly added set of video timestamp information. If timestamp already exists at a certain offset, perform overlay operation. Maximum for a single media file is 100 Dotting Information. In the same request, time offset parameter of AddKeyFrameDescs must be all different from DeleteKeyFrameDescs. 
     * @return AddKeyFrameDescs Newly added set of video timestamp information. If timestamp already exists at a certain offset, perform overlay operation. Maximum for a single media file is 100 Dotting Information. In the same request, time offset parameter of AddKeyFrameDescs must be all different from DeleteKeyFrameDescs.
     */
    public MediaKeyFrameDescItem [] getAddKeyFrameDescs() {
        return this.AddKeyFrameDescs;
    }

    /**
     * Set Newly added set of video timestamp information. If timestamp already exists at a certain offset, perform overlay operation. Maximum for a single media file is 100 Dotting Information. In the same request, time offset parameter of AddKeyFrameDescs must be all different from DeleteKeyFrameDescs.
     * @param AddKeyFrameDescs Newly added set of video timestamp information. If timestamp already exists at a certain offset, perform overlay operation. Maximum for a single media file is 100 Dotting Information. In the same request, time offset parameter of AddKeyFrameDescs must be all different from DeleteKeyFrameDescs.
     */
    public void setAddKeyFrameDescs(MediaKeyFrameDescItem [] AddKeyFrameDescs) {
        this.AddKeyFrameDescs = AddKeyFrameDescs;
    }

    /**
     * Get Time offset of the video timestamp information set to be deleted, unit: second. In the same request, the time offset parameter of AddKeyFrameDescs must be consistent with all different DeleteKeyFrameDescs. 
     * @return DeleteKeyFrameDescs Time offset of the video timestamp information set to be deleted, unit: second. In the same request, the time offset parameter of AddKeyFrameDescs must be consistent with all different DeleteKeyFrameDescs.
     */
    public Float [] getDeleteKeyFrameDescs() {
        return this.DeleteKeyFrameDescs;
    }

    /**
     * Set Time offset of the video timestamp information set to be deleted, unit: second. In the same request, the time offset parameter of AddKeyFrameDescs must be consistent with all different DeleteKeyFrameDescs.
     * @param DeleteKeyFrameDescs Time offset of the video timestamp information set to be deleted, unit: second. In the same request, the time offset parameter of AddKeyFrameDescs must be consistent with all different DeleteKeyFrameDescs.
     */
    public void setDeleteKeyFrameDescs(Float [] DeleteKeyFrameDescs) {
        this.DeleteKeyFrameDescs = DeleteKeyFrameDescs;
    }

    /**
     * Get Value 1 indicates clearing video dotting information. Other values meaningless.
In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously. 
     * @return ClearKeyFrameDescs Value 1 indicates clearing video dotting information. Other values meaningless.
In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.
     */
    public Long getClearKeyFrameDescs() {
        return this.ClearKeyFrameDescs;
    }

    /**
     * Set Value 1 indicates clearing video dotting information. Other values meaningless.
In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.
     * @param ClearKeyFrameDescs Value 1 indicates clearing video dotting information. Other values meaningless.
In the same request, ClearKeyFrameDescs and AddKeyFrameDescs cannot appear simultaneously.
     */
    public void setClearKeyFrameDescs(Long ClearKeyFrameDescs) {
        this.ClearKeyFrameDescs = ClearKeyFrameDescs;
    }

    /**
     * Get A group of newly-added tags. Maximum for a single media file is 16 tags. Maximum for a single tag is 32 characters. In the same request, the AddTags parameter must be consistent with DeleteTags. 
     * @return AddTags A group of newly-added tags. Maximum for a single media file is 16 tags. Maximum for a single tag is 32 characters. In the same request, the AddTags parameter must be consistent with DeleteTags.
     */
    public String [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set A group of newly-added tags. Maximum for a single media file is 16 tags. Maximum for a single tag is 32 characters. In the same request, the AddTags parameter must be consistent with DeleteTags.
     * @param AddTags A group of newly-added tags. Maximum for a single media file is 16 tags. Maximum for a single tag is 32 characters. In the same request, the AddTags parameter must be consistent with DeleteTags.
     */
    public void setAddTags(String [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get A group of tags to delete. In the same request, the AddTags parameter must be different from DeleteTags. 
     * @return DeleteTags A group of tags to delete. In the same request, the AddTags parameter must be different from DeleteTags.
     */
    public String [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set A group of tags to delete. In the same request, the AddTags parameter must be different from DeleteTags.
     * @param DeleteTags A group of tags to delete. In the same request, the AddTags parameter must be different from DeleteTags.
     */
    public void setDeleteTags(String [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Get Value 1 means clear all media files, other values meaningless.
In the same request, ClearTags and AddTags cannot appear simultaneously. 
     * @return ClearTags Value 1 means clear all media files, other values meaningless.
In the same request, ClearTags and AddTags cannot appear simultaneously.
     */
    public Long getClearTags() {
        return this.ClearTags;
    }

    /**
     * Set Value 1 means clear all media files, other values meaningless.
In the same request, ClearTags and AddTags cannot appear simultaneously.
     * @param ClearTags Value 1 means clear all media files, other values meaningless.
In the same request, ClearTags and AddTags cannot appear simultaneously.
     */
    public void setClearTags(Long ClearTags) {
        this.ClearTags = ClearTags;
    }

    /**
     * Get Add a set of subtitles. Maximum for a single media file is 16 subtitles. In the same request, the specified subtitle ID in AddSubtitles must be all different from those in DeleteSubtitleIds. 
     * @return AddSubtitles Add a set of subtitles. Maximum for a single media file is 16 subtitles. In the same request, the specified subtitle ID in AddSubtitles must be all different from those in DeleteSubtitleIds.
     */
    public MediaSubtitleInput [] getAddSubtitles() {
        return this.AddSubtitles;
    }

    /**
     * Set Add a set of subtitles. Maximum for a single media file is 16 subtitles. In the same request, the specified subtitle ID in AddSubtitles must be all different from those in DeleteSubtitleIds.
     * @param AddSubtitles Add a set of subtitles. Maximum for a single media file is 16 subtitles. In the same request, the specified subtitle ID in AddSubtitles must be all different from those in DeleteSubtitleIds.
     */
    public void setAddSubtitles(MediaSubtitleInput [] AddSubtitles) {
        this.AddSubtitles = AddSubtitles;
    }

    /**
     * Get Unique identifier of subtitle to be deleted. In the same request, the specified subtitle id in AddSubtitles must be consistent with all different in DeleteSubtitleIds. 
     * @return DeleteSubtitleIds Unique identifier of subtitle to be deleted. In the same request, the specified subtitle id in AddSubtitles must be consistent with all different in DeleteSubtitleIds.
     */
    public String [] getDeleteSubtitleIds() {
        return this.DeleteSubtitleIds;
    }

    /**
     * Set Unique identifier of subtitle to be deleted. In the same request, the specified subtitle id in AddSubtitles must be consistent with all different in DeleteSubtitleIds.
     * @param DeleteSubtitleIds Unique identifier of subtitle to be deleted. In the same request, the specified subtitle id in AddSubtitles must be consistent with all different in DeleteSubtitleIds.
     */
    public void setDeleteSubtitleIds(String [] DeleteSubtitleIds) {
        this.DeleteSubtitleIds = DeleteSubtitleIds;
    }

    /**
     * Get Value 1 means clear all subtitle information of the media file. Other values meaningless.
In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously. 
     * @return ClearSubtitles Value 1 means clear all subtitle information of the media file. Other values meaningless.
In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.
     */
    public Long getClearSubtitles() {
        return this.ClearSubtitles;
    }

    /**
     * Set Value 1 means clear all subtitle information of the media file. Other values meaningless.
In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.
     * @param ClearSubtitles Value 1 means clear all subtitle information of the media file. Other values meaningless.
In the same request, ClearSubtitles and AddSubtitles cannot appear simultaneously.
     */
    public void setClearSubtitles(Long ClearSubtitles) {
        this.ClearSubtitles = ClearSubtitles;
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

    }
}

