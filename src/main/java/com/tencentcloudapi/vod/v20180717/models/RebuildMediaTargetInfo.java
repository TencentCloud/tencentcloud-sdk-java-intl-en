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

public class RebuildMediaTargetInfo extends AbstractModel {

    /**
    * Output filename, up to 64 characters. By default, the system specifies the generated file name.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Description. It can contain up to 128 characters. The default description is empty.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
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
    * Output file container format. Available values: mp4, flv, hls. Default: mp4.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Output video information.
    */
    @SerializedName("VideoStream")
    @Expose
    private RebuildMediaTargetVideoStream VideoStream;

    /**
    * Output audio information.
    */
    @SerializedName("AudioStream")
    @Expose
    private RebuildMediaTargetAudioStream AudioStream;

    /**
    * Indicates whether to remove video data. Valid values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Indicates whether to remove audio data. Available values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
     * Get Output filename, up to 64 characters. By default, the system specifies the generated file name. 
     * @return MediaName Output filename, up to 64 characters. By default, the system specifies the generated file name.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output filename, up to 64 characters. By default, the system specifies the generated file name.
     * @param MediaName Output filename, up to 64 characters. By default, the system specifies the generated file name.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Description. It can contain up to 128 characters. The default description is empty. 
     * @return Description Description. It can contain up to 128 characters. The default description is empty.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. It can contain up to 128 characters. The default description is empty.
     * @param Description Description. It can contain up to 128 characters. The default description is empty.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicate other categories.</li> 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicate other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicate other categories.</li>
     * @param ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
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
     * Get Output file container format. Available values: mp4, flv, hls. Default: mp4. 
     * @return Container Output file container format. Available values: mp4, flv, hls. Default: mp4.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Output file container format. Available values: mp4, flv, hls. Default: mp4.
     * @param Container Output file container format. Available values: mp4, flv, hls. Default: mp4.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Output video information. 
     * @return VideoStream Output video information.
     */
    public RebuildMediaTargetVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set Output video information.
     * @param VideoStream Output video information.
     */
    public void setVideoStream(RebuildMediaTargetVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get Output audio information. 
     * @return AudioStream Output audio information.
     */
    public RebuildMediaTargetAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set Output audio information.
     * @param AudioStream Output audio information.
     */
    public void setAudioStream(RebuildMediaTargetAudioStream AudioStream) {
        this.AudioStream = AudioStream;
    }

    /**
     * Get Indicates whether to remove video data. Valid values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0. 
     * @return RemoveVideo Indicates whether to remove video data. Valid values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Indicates whether to remove video data. Valid values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
     * @param RemoveVideo Indicates whether to remove video data. Valid values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Indicates whether to remove audio data. Available values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0. 
     * @return RemoveAudio Indicates whether to remove audio data. Available values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Indicates whether to remove audio data. Available values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
     * @param RemoveAudio Indicates whether to remove audio data. Available values:
<li>0: retention</li>
<li>1: Remove</li>

Default value: 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    public RebuildMediaTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTargetInfo(RebuildMediaTargetInfo source) {
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
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
            this.VideoStream = new RebuildMediaTargetVideoStream(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new RebuildMediaTargetAudioStream(source.AudioStream);
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
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
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

