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

public class CreateAigcSubjectInput extends AbstractModel {

    /**
    * <p>Subject name.</p>
    */
    @SerializedName("SubjectName")
    @Expose
    private String SubjectName;

    /**
    * <p>Subject image.</p>
    */
    @SerializedName("SubjectImages")
    @Expose
    private String [] SubjectImages;

    /**
    * <p>Main video.</p>
    */
    @SerializedName("SubjectVideos")
    @Expose
    private String [] SubjectVideos;

    /**
    * <p>Primary voice ID.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
     * Get <p>Subject name.</p> 
     * @return SubjectName <p>Subject name.</p>
     */
    public String getSubjectName() {
        return this.SubjectName;
    }

    /**
     * Set <p>Subject name.</p>
     * @param SubjectName <p>Subject name.</p>
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * Get <p>Subject image.</p> 
     * @return SubjectImages <p>Subject image.</p>
     */
    public String [] getSubjectImages() {
        return this.SubjectImages;
    }

    /**
     * Set <p>Subject image.</p>
     * @param SubjectImages <p>Subject image.</p>
     */
    public void setSubjectImages(String [] SubjectImages) {
        this.SubjectImages = SubjectImages;
    }

    /**
     * Get <p>Main video.</p> 
     * @return SubjectVideos <p>Main video.</p>
     */
    public String [] getSubjectVideos() {
        return this.SubjectVideos;
    }

    /**
     * Set <p>Main video.</p>
     * @param SubjectVideos <p>Main video.</p>
     */
    public void setSubjectVideos(String [] SubjectVideos) {
        this.SubjectVideos = SubjectVideos;
    }

    /**
     * Get <p>Primary voice ID.</p> 
     * @return VoiceId <p>Primary voice ID.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Primary voice ID.</p>
     * @param VoiceId <p>Primary voice ID.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    public CreateAigcSubjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcSubjectInput(CreateAigcSubjectInput source) {
        if (source.SubjectName != null) {
            this.SubjectName = new String(source.SubjectName);
        }
        if (source.SubjectImages != null) {
            this.SubjectImages = new String[source.SubjectImages.length];
            for (int i = 0; i < source.SubjectImages.length; i++) {
                this.SubjectImages[i] = new String(source.SubjectImages[i]);
            }
        }
        if (source.SubjectVideos != null) {
            this.SubjectVideos = new String[source.SubjectVideos.length];
            for (int i = 0; i < source.SubjectVideos.length; i++) {
                this.SubjectVideos[i] = new String(source.SubjectVideos[i]);
            }
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectName", this.SubjectName);
        this.setParamArraySimple(map, prefix + "SubjectImages.", this.SubjectImages);
        this.setParamArraySimple(map, prefix + "SubjectVideos.", this.SubjectVideos);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);

    }
}

