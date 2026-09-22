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

public class ComposeMediaOutput extends AbstractModel {

    /**
    * Filename, up to 64 characters.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Description. The maximum length is 128 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812) API.
<li>Default value: 0, indicate other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Muxing format. Available values: mp4 and mp3. Among them, mp3 is for audio-only files.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Output video information.
    */
    @SerializedName("VideoStream")
    @Expose
    private OutputVideoStream VideoStream;

    /**
    * Output audio content.
    */
    @SerializedName("AudioStream")
    @Expose
    private OutputAudioStream AudioStream;

    /**
    * Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
     * Get Filename, up to 64 characters. 
     * @return FileName Filename, up to 64 characters.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename, up to 64 characters.
     * @param FileName Filename, up to 64 characters.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Description. The maximum length is 128 characters. 
     * @return Description Description. The maximum length is 128 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. The maximum length is 128 characters.
     * @param Description Description. The maximum length is 128 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812) API.
<li>Default value: 0, indicate other categories.</li> 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812) API.
<li>Default value: 0, indicate other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812) API.
<li>Default value: 0, indicate other categories.</li>
     * @param ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812) API.
<li>Default value: 0, indicate other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime Expiry date of the output file. The file will be deleted after this time. It never expires by default. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Muxing format. Available values: mp4 and mp3. Among them, mp3 is for audio-only files. 
     * @return Container Muxing format. Available values: mp4 and mp3. Among them, mp3 is for audio-only files.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Muxing format. Available values: mp4 and mp3. Among them, mp3 is for audio-only files.
     * @param Container Muxing format. Available values: mp4 and mp3. Among them, mp3 is for audio-only files.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Output video information. 
     * @return VideoStream Output video information.
     */
    public OutputVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set Output video information.
     * @param VideoStream Output video information.
     */
    public void setVideoStream(OutputVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get Output audio content. 
     * @return AudioStream Output audio content.
     */
    public OutputAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set Output audio content.
     * @param AudioStream Output audio content.
     */
    public void setAudioStream(OutputAudioStream AudioStream) {
        this.AudioStream = AudioStream;
    }

    /**
     * Get Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0. 
     * @return RemoveVideo Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     * @param RemoveVideo Indicates whether to remove video data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0. 
     * @return RemoveAudio Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     * @param RemoveAudio Indicates whether to remove audio data. Available values:
<li>`0`: reserved</li>
<li>1: Remove</li>
Default value: 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    public ComposeMediaOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaOutput(ComposeMediaOutput source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
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
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStream != null) {
            this.VideoStream = new OutputVideoStream(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new OutputAudioStream(source.AudioStream);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "AudioStream.", this.AudioStream);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}

