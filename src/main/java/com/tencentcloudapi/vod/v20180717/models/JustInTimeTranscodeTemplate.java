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

public class JustInTimeTranscodeTemplate extends AbstractModel {

    /**
    * Template type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Video parameter configuration.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VideoConfigure")
    @Expose
    private VideoConfigureInfo VideoConfigure;

    /**
    * Watermark parameter configuration. 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WatermarkConfigure")
    @Expose
    private WatermarkConfigureData WatermarkConfigure;

    /**
     * Get Template type. 
     * @return Type Template type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type.
     * @param Type Template type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Template name. 
     * @return Name Template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name.
     * @param Name Template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description. 
     * @return Comment Template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description.
     * @param Comment Template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Video parameter configuration.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VideoConfigure Video parameter configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public VideoConfigureInfo getVideoConfigure() {
        return this.VideoConfigure;
    }

    /**
     * Set Video parameter configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VideoConfigure Video parameter configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVideoConfigure(VideoConfigureInfo VideoConfigure) {
        this.VideoConfigure = VideoConfigure;
    }

    /**
     * Get Watermark parameter configuration. 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WatermarkConfigure Watermark parameter configuration. 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public WatermarkConfigureData getWatermarkConfigure() {
        return this.WatermarkConfigure;
    }

    /**
     * Set Watermark parameter configuration. 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WatermarkConfigure Watermark parameter configuration. 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWatermarkConfigure(WatermarkConfigureData WatermarkConfigure) {
        this.WatermarkConfigure = WatermarkConfigure;
    }

    public JustInTimeTranscodeTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JustInTimeTranscodeTemplate(JustInTimeTranscodeTemplate source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.VideoConfigure != null) {
            this.VideoConfigure = new VideoConfigureInfo(source.VideoConfigure);
        }
        if (source.WatermarkConfigure != null) {
            this.WatermarkConfigure = new WatermarkConfigureData(source.WatermarkConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "VideoConfigure.", this.VideoConfigure);
        this.setParamObj(map, prefix + "WatermarkConfigure.", this.WatermarkConfigure);

    }
}

