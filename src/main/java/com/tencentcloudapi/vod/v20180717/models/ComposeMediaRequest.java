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
    * The input media track list includes multiple track information composed of materials such as video, audio, and images. Among them:<li>The input multiple tracks are aligned with the output media file timeline on the timeline.</li><li>Overlap materials on different tracks at the same time point on the timeline. Perform image overlay of videos or images in track order, with materials of higher track order overlaid on top. Mix audio materials.</li><li>Each type of track supports up to 10 video, audio, or image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
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
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
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
    * Identify source context. This is used to pass through user request information. The ComposeMediaComplete callback returns the value of this field. The maximum length is 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Identifier for task deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get The input media track list includes multiple track information composed of materials such as video, audio, and images. Among them:<li>The input multiple tracks are aligned with the output media file timeline on the timeline.</li><li>Overlap materials on different tracks at the same time point on the timeline. Perform image overlay of videos or images in track order, with materials of higher track order overlaid on top. Mix audio materials.</li><li>Each type of track supports up to 10 video, audio, or image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li> 
     * @return Tracks The input media track list includes multiple track information composed of materials such as video, audio, and images. Among them:<li>The input multiple tracks are aligned with the output media file timeline on the timeline.</li><li>Overlap materials on different tracks at the same time point on the timeline. Perform image overlay of videos or images in track order, with materials of higher track order overlaid on top. Mix audio materials.</li><li>Each type of track supports up to 10 video, audio, or image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
     */
    public MediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set The input media track list includes multiple track information composed of materials such as video, audio, and images. Among them:<li>The input multiple tracks are aligned with the output media file timeline on the timeline.</li><li>Overlap materials on different tracks at the same time point on the timeline. Perform image overlay of videos or images in track order, with materials of higher track order overlaid on top. Mix audio materials.</li><li>Each type of track supports up to 10 video, audio, or image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
     * @param Tracks The input media track list includes multiple track information composed of materials such as video, audio, and images. Among them:<li>The input multiple tracks are aligned with the output media file timeline on the timeline.</li><li>Overlap materials on different tracks at the same time point on the timeline. Perform image overlay of videos or images in track order, with materials of higher track order overlaid on top. Mix audio materials.</li><li>Each type of track supports up to 10 video, audio, or image tracks.</li><li>The total number of media segments placed on all types of tracks supports up to 500.</li>
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
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
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
     * Get Identify source context. This is used to pass through user request information. The ComposeMediaComplete callback returns the value of this field. The maximum length is 1000 characters. 
     * @return SessionContext Identify source context. This is used to pass through user request information. The ComposeMediaComplete callback returns the value of this field. The maximum length is 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Identify source context. This is used to pass through user request information. The ComposeMediaComplete callback returns the value of this field. The maximum length is 1000 characters.
     * @param SessionContext Identify source context. This is used to pass through user request information. The ComposeMediaComplete callback returns the value of this field. The maximum length is 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Identifier for task deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed. 
     * @return SessionId Identifier for task deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identifier for task deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     * @param SessionId Identifier for task deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
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

