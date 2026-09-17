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

public class JustInTimeTranscodeTemplate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("VideoConfigure")
    @Expose
    private VideoConfigureInfo VideoConfigure;

    /**
    * 
    */
    @SerializedName("WatermarkConfigure")
    @Expose
    private WatermarkConfigureData WatermarkConfigure;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return VideoConfigure 
     */
    public VideoConfigureInfo getVideoConfigure() {
        return this.VideoConfigure;
    }

    /**
     * Set 
     * @param VideoConfigure 
     */
    public void setVideoConfigure(VideoConfigureInfo VideoConfigure) {
        this.VideoConfigure = VideoConfigure;
    }

    /**
     * Get  
     * @return WatermarkConfigure 
     */
    public WatermarkConfigureData getWatermarkConfigure() {
        return this.WatermarkConfigure;
    }

    /**
     * Set 
     * @param WatermarkConfigure 
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

