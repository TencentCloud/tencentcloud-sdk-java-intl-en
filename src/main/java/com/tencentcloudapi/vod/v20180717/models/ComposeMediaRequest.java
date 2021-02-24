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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeMediaRequest extends AbstractModel{

    /**
    * List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials. <li>Multiple input tracks are aligned with the output media file on the time axis. </li><li>The materials of each track at the same time point on the time axis will be superimposed. Specifically, videos or images will be superimposed for video image by track order, where a material with a higher track order will be more on top, while audio materials will be mixed. </li><li>Up to 10 tracks are supported for each type (video, audio, or image).</li>
    */
    @SerializedName("Tracks")
    @Expose
    private MediaTrack [] Tracks;

    /**
    * Information of output media file.
    */
    @SerializedName("Output")
    @Expose
    private ComposeMediaOutput Output;

    /**
    * Canvas used for composing video file.
    */
    @SerializedName("Canvas")
    @Expose
    private Canvas Canvas;

    /**
    * Used to pass through user request information. `ComposeMediaComplete` callback will return the value of this parameter. It contains up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials. <li>Multiple input tracks are aligned with the output media file on the time axis. </li><li>The materials of each track at the same time point on the time axis will be superimposed. Specifically, videos or images will be superimposed for video image by track order, where a material with a higher track order will be more on top, while audio materials will be mixed. </li><li>Up to 10 tracks are supported for each type (video, audio, or image).</li> 
     * @return Tracks List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials. <li>Multiple input tracks are aligned with the output media file on the time axis. </li><li>The materials of each track at the same time point on the time axis will be superimposed. Specifically, videos or images will be superimposed for video image by track order, where a material with a higher track order will be more on top, while audio materials will be mixed. </li><li>Up to 10 tracks are supported for each type (video, audio, or image).</li>
     */
    public MediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials. <li>Multiple input tracks are aligned with the output media file on the time axis. </li><li>The materials of each track at the same time point on the time axis will be superimposed. Specifically, videos or images will be superimposed for video image by track order, where a material with a higher track order will be more on top, while audio materials will be mixed. </li><li>Up to 10 tracks are supported for each type (video, audio, or image).</li>
     * @param Tracks List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials. <li>Multiple input tracks are aligned with the output media file on the time axis. </li><li>The materials of each track at the same time point on the time axis will be superimposed. Specifically, videos or images will be superimposed for video image by track order, where a material with a higher track order will be more on top, while audio materials will be mixed. </li><li>Up to 10 tracks are supported for each type (video, audio, or image).</li>
     */
    public void setTracks(MediaTrack [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get Information of output media file. 
     * @return Output Information of output media file.
     */
    public ComposeMediaOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Information of output media file.
     * @param Output Information of output media file.
     */
    public void setOutput(ComposeMediaOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Canvas used for composing video file. 
     * @return Canvas Canvas used for composing video file.
     */
    public Canvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set Canvas used for composing video file.
     * @param Canvas Canvas used for composing video file.
     */
    public void setCanvas(Canvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get Used to pass through user request information. `ComposeMediaComplete` callback will return the value of this parameter. It contains up to 1,000 characters. 
     * @return SessionContext Used to pass through user request information. `ComposeMediaComplete` callback will return the value of this parameter. It contains up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Used to pass through user request information. `ComposeMediaComplete` callback will return the value of this parameter. It contains up to 1,000 characters.
     * @param SessionContext Used to pass through user request information. `ComposeMediaComplete` callback will return the value of this parameter. It contains up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed. 
     * @return SessionId Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
     * @param SessionId Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tracks.", this.Tracks);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

