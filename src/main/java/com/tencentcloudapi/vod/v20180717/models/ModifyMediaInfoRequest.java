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
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 
    */
    @SerializedName("CoverData")
    @Expose
    private String CoverData;

    /**
    * 
    */
    @SerializedName("AddKeyFrameDescs")
    @Expose
    private MediaKeyFrameDescItem [] AddKeyFrameDescs;

    /**
    * 
    */
    @SerializedName("DeleteKeyFrameDescs")
    @Expose
    private Float [] DeleteKeyFrameDescs;

    /**
    * 
    */
    @SerializedName("ClearKeyFrameDescs")
    @Expose
    private Long ClearKeyFrameDescs;

    /**
    * 
    */
    @SerializedName("AddTags")
    @Expose
    private String [] AddTags;

    /**
    * 
    */
    @SerializedName("DeleteTags")
    @Expose
    private String [] DeleteTags;

    /**
    * 
    */
    @SerializedName("ClearTags")
    @Expose
    private Long ClearTags;

    /**
    * 
    */
    @SerializedName("AddSubtitles")
    @Expose
    private MediaSubtitleInput [] AddSubtitles;

    /**
    * 
    */
    @SerializedName("DeleteSubtitleIds")
    @Expose
    private String [] DeleteSubtitleIds;

    /**
    * 
    */
    @SerializedName("ClearSubtitles")
    @Expose
    private Long ClearSubtitles;

    /**
    * 
    */
    @SerializedName("DeleteKnowledgeBases")
    @Expose
    private String [] DeleteKnowledgeBases;

    /**
    * 
    */
    @SerializedName("ClearKnowledgeBases")
    @Expose
    private Long ClearKnowledgeBases;

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return ClassId 
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 
     * @param ClassId 
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get  
     * @return CoverData 
     */
    public String getCoverData() {
        return this.CoverData;
    }

    /**
     * Set 
     * @param CoverData 
     */
    public void setCoverData(String CoverData) {
        this.CoverData = CoverData;
    }

    /**
     * Get  
     * @return AddKeyFrameDescs 
     */
    public MediaKeyFrameDescItem [] getAddKeyFrameDescs() {
        return this.AddKeyFrameDescs;
    }

    /**
     * Set 
     * @param AddKeyFrameDescs 
     */
    public void setAddKeyFrameDescs(MediaKeyFrameDescItem [] AddKeyFrameDescs) {
        this.AddKeyFrameDescs = AddKeyFrameDescs;
    }

    /**
     * Get  
     * @return DeleteKeyFrameDescs 
     */
    public Float [] getDeleteKeyFrameDescs() {
        return this.DeleteKeyFrameDescs;
    }

    /**
     * Set 
     * @param DeleteKeyFrameDescs 
     */
    public void setDeleteKeyFrameDescs(Float [] DeleteKeyFrameDescs) {
        this.DeleteKeyFrameDescs = DeleteKeyFrameDescs;
    }

    /**
     * Get  
     * @return ClearKeyFrameDescs 
     */
    public Long getClearKeyFrameDescs() {
        return this.ClearKeyFrameDescs;
    }

    /**
     * Set 
     * @param ClearKeyFrameDescs 
     */
    public void setClearKeyFrameDescs(Long ClearKeyFrameDescs) {
        this.ClearKeyFrameDescs = ClearKeyFrameDescs;
    }

    /**
     * Get  
     * @return AddTags 
     */
    public String [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set 
     * @param AddTags 
     */
    public void setAddTags(String [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get  
     * @return DeleteTags 
     */
    public String [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set 
     * @param DeleteTags 
     */
    public void setDeleteTags(String [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Get  
     * @return ClearTags 
     */
    public Long getClearTags() {
        return this.ClearTags;
    }

    /**
     * Set 
     * @param ClearTags 
     */
    public void setClearTags(Long ClearTags) {
        this.ClearTags = ClearTags;
    }

    /**
     * Get  
     * @return AddSubtitles 
     */
    public MediaSubtitleInput [] getAddSubtitles() {
        return this.AddSubtitles;
    }

    /**
     * Set 
     * @param AddSubtitles 
     */
    public void setAddSubtitles(MediaSubtitleInput [] AddSubtitles) {
        this.AddSubtitles = AddSubtitles;
    }

    /**
     * Get  
     * @return DeleteSubtitleIds 
     */
    public String [] getDeleteSubtitleIds() {
        return this.DeleteSubtitleIds;
    }

    /**
     * Set 
     * @param DeleteSubtitleIds 
     */
    public void setDeleteSubtitleIds(String [] DeleteSubtitleIds) {
        this.DeleteSubtitleIds = DeleteSubtitleIds;
    }

    /**
     * Get  
     * @return ClearSubtitles 
     */
    public Long getClearSubtitles() {
        return this.ClearSubtitles;
    }

    /**
     * Set 
     * @param ClearSubtitles 
     */
    public void setClearSubtitles(Long ClearSubtitles) {
        this.ClearSubtitles = ClearSubtitles;
    }

    /**
     * Get  
     * @return DeleteKnowledgeBases 
     */
    public String [] getDeleteKnowledgeBases() {
        return this.DeleteKnowledgeBases;
    }

    /**
     * Set 
     * @param DeleteKnowledgeBases 
     */
    public void setDeleteKnowledgeBases(String [] DeleteKnowledgeBases) {
        this.DeleteKnowledgeBases = DeleteKnowledgeBases;
    }

    /**
     * Get  
     * @return ClearKnowledgeBases 
     */
    public Long getClearKnowledgeBases() {
        return this.ClearKnowledgeBases;
    }

    /**
     * Set 
     * @param ClearKnowledgeBases 
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

