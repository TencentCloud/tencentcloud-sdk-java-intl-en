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

public class ComposeMediaRequest extends AbstractModel {

    /**
    * Input media track list, including multiple track information composed of materials such as video, audio, and image, where: <li>Multiple input tracks are aligned with the output media file timeline on the timeline;</li><li>Materials on different tracks at the same time point on the timeline are overlaid. Image overlay of videos or images is performed in track order, materials with higher track order are overlaid on top, and audio materials are mixed;</li><li>Each type of track supports up to 10 video, audio, and image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
    */
    @SerializedName("Tracks")
    @Expose
    private MediaTrack [] Tracks;

    /**
    * Output media file information.
    */
    @SerializedName("Output")
    @Expose
    private ComposeMediaOutput Output;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Canvas used when making video files.
    */
    @SerializedName("Canvas")
    @Expose
    private Canvas Canvas;

    /**
    * Identify source context, used to pass through user request information. The value of this field will be returned in the ComposeMediaComplete callback. Maximum length: 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get Input media track list, including multiple track information composed of materials such as video, audio, and image, where: <li>Multiple input tracks are aligned with the output media file timeline on the timeline;</li><li>Materials on different tracks at the same time point on the timeline are overlaid. Image overlay of videos or images is performed in track order, materials with higher track order are overlaid on top, and audio materials are mixed;</li><li>Each type of track supports up to 10 video, audio, and image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li> 
     * @return Tracks Input media track list, including multiple track information composed of materials such as video, audio, and image, where: <li>Multiple input tracks are aligned with the output media file timeline on the timeline;</li><li>Materials on different tracks at the same time point on the timeline are overlaid. Image overlay of videos or images is performed in track order, materials with higher track order are overlaid on top, and audio materials are mixed;</li><li>Each type of track supports up to 10 video, audio, and image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
     */
    public MediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set Input media track list, including multiple track information composed of materials such as video, audio, and image, where: <li>Multiple input tracks are aligned with the output media file timeline on the timeline;</li><li>Materials on different tracks at the same time point on the timeline are overlaid. Image overlay of videos or images is performed in track order, materials with higher track order are overlaid on top, and audio materials are mixed;</li><li>Each type of track supports up to 10 video, audio, and image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
     * @param Tracks Input media track list, including multiple track information composed of materials such as video, audio, and image, where: <li>Multiple input tracks are aligned with the output media file timeline on the timeline;</li><li>Materials on different tracks at the same time point on the timeline are overlaid. Image overlay of videos or images is performed in track order, materials with higher track order are overlaid on top, and audio materials are mixed;</li><li>Each type of track supports up to 10 video, audio, and image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
     */
    public void setTracks(MediaTrack [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get Output media file information. 
     * @return Output Output media file information.
     */
    public ComposeMediaOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output media file information.
     * @param Output Output media file information.
     */
    public void setOutput(ComposeMediaOutput Output) {
        this.Output = Output;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Canvas used when making video files. 
     * @return Canvas Canvas used when making video files.
     */
    public Canvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set Canvas used when making video files.
     * @param Canvas Canvas used when making video files.
     */
    public void setCanvas(Canvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get Identify source context, used to pass through user request information. The value of this field will be returned in the ComposeMediaComplete callback. Maximum length: 1000 characters. 
     * @return SessionContext Identify source context, used to pass through user request information. The value of this field will be returned in the ComposeMediaComplete callback. Maximum length: 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Identify source context, used to pass through user request information. The value of this field will be returned in the ComposeMediaComplete callback. Maximum length: 1000 characters.
     * @param SessionContext Identify source context, used to pass through user request information. The value of this field will be returned in the ComposeMediaComplete callback. Maximum length: 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required. 
     * @return SessionId Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     * @param SessionId Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public ComposeMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaRequest(ComposeMediaRequest source) {
        if (source.Tracks != null) {
            this.Tracks = new MediaTrack[source.Tracks.length];
            for (int i = 0; i < source.Tracks.length; i++) {
                this.Tracks[i] = new MediaTrack(source.Tracks[i]);
            }
        }
        if (source.Output != null) {
            this.Output = new ComposeMediaOutput(source.Output);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Canvas != null) {
            this.Canvas = new Canvas(source.Canvas);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tracks.", this.Tracks);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

