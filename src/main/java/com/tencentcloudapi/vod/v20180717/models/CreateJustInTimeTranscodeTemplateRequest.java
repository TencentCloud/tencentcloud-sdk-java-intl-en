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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJustInTimeTranscodeTemplateRequest extends AbstractModel {

    /**
    * Template name, the length is limited to 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Video parameter configuration.
    */
    @SerializedName("VideoConfigure")
    @Expose
    private VideoConfigureInfo VideoConfigure;

    /**
    * <b>VOD application ID. If you want to access resources in a sub-application, fill this field with the SubAppID; when empty, it means accessing the resources of the default application.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Watermark parameter configuration.
    */
    @SerializedName("WatermarkConfigure")
    @Expose
    private WatermarkConfigureInfo WatermarkConfigure;

    /**
    * Template description, the length is limited to 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Template name, the length is limited to 64 characters. 
     * @return Name Template name, the length is limited to 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name, the length is limited to 64 characters.
     * @param Name Template name, the length is limited to 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Video parameter configuration. 
     * @return VideoConfigure Video parameter configuration.
     */
    public VideoConfigureInfo getVideoConfigure() {
        return this.VideoConfigure;
    }

    /**
     * Set Video parameter configuration.
     * @param VideoConfigure Video parameter configuration.
     */
    public void setVideoConfigure(VideoConfigureInfo VideoConfigure) {
        this.VideoConfigure = VideoConfigure;
    }

    /**
     * Get <b>VOD application ID. If you want to access resources in a sub-application, fill this field with the SubAppID; when empty, it means accessing the resources of the default application.</b> 
     * @return SubAppId <b>VOD application ID. If you want to access resources in a sub-application, fill this field with the SubAppID; when empty, it means accessing the resources of the default application.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD application ID. If you want to access resources in a sub-application, fill this field with the SubAppID; when empty, it means accessing the resources of the default application.</b>
     * @param SubAppId <b>VOD application ID. If you want to access resources in a sub-application, fill this field with the SubAppID; when empty, it means accessing the resources of the default application.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Watermark parameter configuration. 
     * @return WatermarkConfigure Watermark parameter configuration.
     */
    public WatermarkConfigureInfo getWatermarkConfigure() {
        return this.WatermarkConfigure;
    }

    /**
     * Set Watermark parameter configuration.
     * @param WatermarkConfigure Watermark parameter configuration.
     */
    public void setWatermarkConfigure(WatermarkConfigureInfo WatermarkConfigure) {
        this.WatermarkConfigure = WatermarkConfigure;
    }

    /**
     * Get Template description, the length is limited to 256 characters. 
     * @return Comment Template description, the length is limited to 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, the length is limited to 256 characters.
     * @param Comment Template description, the length is limited to 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateJustInTimeTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJustInTimeTranscodeTemplateRequest(CreateJustInTimeTranscodeTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VideoConfigure != null) {
            this.VideoConfigure = new VideoConfigureInfo(source.VideoConfigure);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.WatermarkConfigure != null) {
            this.WatermarkConfigure = new WatermarkConfigureInfo(source.WatermarkConfigure);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "VideoConfigure.", this.VideoConfigure);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "WatermarkConfigure.", this.WatermarkConfigure);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

