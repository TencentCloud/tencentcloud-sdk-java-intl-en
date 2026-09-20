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

public class AigcVideoTaskInputSubjectInfo extends AbstractModel {

    /**
    * <p>Fixed subject Id.</p><ul><li>Kling subject <strong>required</strong>;</li><li>Vidu subject optional.</li></ul>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Fixed name.</p><ul><li>Vidu subject is <strong>required</strong>. You can add [@name] in the prompt to use it. For example, if the name is Xiao Ming, describe it as [@Xiao Ming] in the prompt.</li><li>Kling subject is optional.</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p><strong>Valid only for Vidu.</strong>The voice type ID is used to determine the timbre of the sound in the video. If it is empty, the system will automatically recommend one.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p><strong>Valid only for Vidu.</strong> Temporary subject images, up to 3 images<br>Note 1: Supports passing image URLs (ensure they are accessible);<br>Note 2: Images support png, jpeg, jpg, webp formats;<br>Note 3: Image pixels cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1.</p>
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * <p><strong>Valid only for Vidu.</strong> Temporary subject video, a maximum of 1 5-second video. Note 1: Only the viduq2-pro model supports the use of video subjects; Note 2: Supports up to 1 5-second video upload; Note 3: Video supports mp4, avi, mov formats; Note 4: Video pixel cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1;</p>
    */
    @SerializedName("VideoUrls")
    @Expose
    private String [] VideoUrls;

    /**
     * Get <p>Fixed subject Id.</p><ul><li>Kling subject <strong>required</strong>;</li><li>Vidu subject optional.</li></ul> 
     * @return Id <p>Fixed subject Id.</p><ul><li>Kling subject <strong>required</strong>;</li><li>Vidu subject optional.</li></ul>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Fixed subject Id.</p><ul><li>Kling subject <strong>required</strong>;</li><li>Vidu subject optional.</li></ul>
     * @param Id <p>Fixed subject Id.</p><ul><li>Kling subject <strong>required</strong>;</li><li>Vidu subject optional.</li></ul>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Fixed name.</p><ul><li>Vidu subject is <strong>required</strong>. You can add [@name] in the prompt to use it. For example, if the name is Xiao Ming, describe it as [@Xiao Ming] in the prompt.</li><li>Kling subject is optional.</li></ul> 
     * @return Name <p>Fixed name.</p><ul><li>Vidu subject is <strong>required</strong>. You can add [@name] in the prompt to use it. For example, if the name is Xiao Ming, describe it as [@Xiao Ming] in the prompt.</li><li>Kling subject is optional.</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Fixed name.</p><ul><li>Vidu subject is <strong>required</strong>. You can add [@name] in the prompt to use it. For example, if the name is Xiao Ming, describe it as [@Xiao Ming] in the prompt.</li><li>Kling subject is optional.</li></ul>
     * @param Name <p>Fixed name.</p><ul><li>Vidu subject is <strong>required</strong>. You can add [@name] in the prompt to use it. For example, if the name is Xiao Ming, describe it as [@Xiao Ming] in the prompt.</li><li>Kling subject is optional.</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p><strong>Valid only for Vidu.</strong>The voice type ID is used to determine the timbre of the sound in the video. If it is empty, the system will automatically recommend one.</p> 
     * @return VoiceId <p><strong>Valid only for Vidu.</strong>The voice type ID is used to determine the timbre of the sound in the video. If it is empty, the system will automatically recommend one.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p><strong>Valid only for Vidu.</strong>The voice type ID is used to determine the timbre of the sound in the video. If it is empty, the system will automatically recommend one.</p>
     * @param VoiceId <p><strong>Valid only for Vidu.</strong>The voice type ID is used to determine the timbre of the sound in the video. If it is empty, the system will automatically recommend one.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p><strong>Valid only for Vidu.</strong> Temporary subject images, up to 3 images<br>Note 1: Supports passing image URLs (ensure they are accessible);<br>Note 2: Images support png, jpeg, jpg, webp formats;<br>Note 3: Image pixels cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1.</p> 
     * @return ImageUrls <p><strong>Valid only for Vidu.</strong> Temporary subject images, up to 3 images<br>Note 1: Supports passing image URLs (ensure they are accessible);<br>Note 2: Images support png, jpeg, jpg, webp formats;<br>Note 3: Image pixels cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1.</p>
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set <p><strong>Valid only for Vidu.</strong> Temporary subject images, up to 3 images<br>Note 1: Supports passing image URLs (ensure they are accessible);<br>Note 2: Images support png, jpeg, jpg, webp formats;<br>Note 3: Image pixels cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1.</p>
     * @param ImageUrls <p><strong>Valid only for Vidu.</strong> Temporary subject images, up to 3 images<br>Note 1: Supports passing image URLs (ensure they are accessible);<br>Note 2: Images support png, jpeg, jpg, webp formats;<br>Note 3: Image pixels cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1.</p>
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get <p><strong>Valid only for Vidu.</strong> Temporary subject video, a maximum of 1 5-second video. Note 1: Only the viduq2-pro model supports the use of video subjects; Note 2: Supports up to 1 5-second video upload; Note 3: Video supports mp4, avi, mov formats; Note 4: Video pixel cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1;</p> 
     * @return VideoUrls <p><strong>Valid only for Vidu.</strong> Temporary subject video, a maximum of 1 5-second video. Note 1: Only the viduq2-pro model supports the use of video subjects; Note 2: Supports up to 1 5-second video upload; Note 3: Video supports mp4, avi, mov formats; Note 4: Video pixel cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1;</p>
     */
    public String [] getVideoUrls() {
        return this.VideoUrls;
    }

    /**
     * Set <p><strong>Valid only for Vidu.</strong> Temporary subject video, a maximum of 1 5-second video. Note 1: Only the viduq2-pro model supports the use of video subjects; Note 2: Supports up to 1 5-second video upload; Note 3: Video supports mp4, avi, mov formats; Note 4: Video pixel cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1;</p>
     * @param VideoUrls <p><strong>Valid only for Vidu.</strong> Temporary subject video, a maximum of 1 5-second video. Note 1: Only the viduq2-pro model supports the use of video subjects; Note 2: Supports up to 1 5-second video upload; Note 3: Video supports mp4, avi, mov formats; Note 4: Video pixel cannot be less than 128*128, and the ratio must be less than 1:4 or 4:1;</p>
     */
    public void setVideoUrls(String [] VideoUrls) {
        this.VideoUrls = VideoUrls;
    }

    public AigcVideoTaskInputSubjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInputSubjectInfo(AigcVideoTaskInputSubjectInfo source) {
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

