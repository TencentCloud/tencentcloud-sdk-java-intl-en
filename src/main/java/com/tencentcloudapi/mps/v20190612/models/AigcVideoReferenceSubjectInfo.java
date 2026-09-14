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

public class AigcVideoReferenceSubjectInfo extends AbstractModel {

    /**
    * <p>ID of the reference subject.</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Subject name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Main voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Main image list.</p>
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * <p>Main video list.</p>
    */
    @SerializedName("VideoUrls")
    @Expose
    private String [] VideoUrls;

    /**
     * Get <p>ID of the reference subject.</p> 
     * @return Id <p>ID of the reference subject.</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>ID of the reference subject.</p>
     * @param Id <p>ID of the reference subject.</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Subject name.</p> 
     * @return Name <p>Subject name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Subject name.</p>
     * @param Name <p>Subject name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Main voice ID.</p> 
     * @return VoiceId <p>Main voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Main voice ID.</p>
     * @param VoiceId <p>Main voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Main image list.</p> 
     * @return ImageUrls <p>Main image list.</p>
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set <p>Main image list.</p>
     * @param ImageUrls <p>Main image list.</p>
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get <p>Main video list.</p> 
     * @return VideoUrls <p>Main video list.</p>
     */
    public String [] getVideoUrls() {
        return this.VideoUrls;
    }

    /**
     * Set <p>Main video list.</p>
     * @param VideoUrls <p>Main video list.</p>
     */
    public void setVideoUrls(String [] VideoUrls) {
        this.VideoUrls = VideoUrls;
    }

    public AigcVideoReferenceSubjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoReferenceSubjectInfo(AigcVideoReferenceSubjectInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.VideoUrls != null) {
            this.VideoUrls = new String[source.VideoUrls.length];
            for (int i = 0; i < source.VideoUrls.length; i++) {
                this.VideoUrls[i] = new String(source.VideoUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamArraySimple(map, prefix + "VideoUrls.", this.VideoUrls);

    }
}

