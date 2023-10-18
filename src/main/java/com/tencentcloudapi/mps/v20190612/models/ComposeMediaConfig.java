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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeMediaConfig extends AbstractModel {

    /**
    * The information of the output video.
    */
    @SerializedName("TargetInfo")
    @Expose
    private ComposeTargetInfo TargetInfo;

    /**
    * The canvas information of the output video.
    */
    @SerializedName("Canvas")
    @Expose
    private ComposeCanvas Canvas;

    /**
    * The global styles. This parameter is used together with `Tracks` to specify styles, such as the subtitle style.
    */
    @SerializedName("Styles")
    @Expose
    private ComposeStyles [] Styles;

    /**
    * The information of media tracks (consisting of video, audio, image, and text elements) used to composite the video. About tracks and the timeline:
<ul><li>The timeline of a track is the same as the timeline of the output video. </li><li>The elements of different tracks are overlaid at the same time point in the timeline.</li><ul><li>Video, image, and text elements are overlaid according to their track number, with the first track on top. </li><li>Audio elements are mixed. </li></ul></ul>Note: The different elements of the same track cannot be overlaid (except subtitles).
    */
    @SerializedName("Tracks")
    @Expose
    private ComposeMediaTrack [] Tracks;

    /**
     * Get The information of the output video. 
     * @return TargetInfo The information of the output video.
     */
    public ComposeTargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set The information of the output video.
     * @param TargetInfo The information of the output video.
     */
    public void setTargetInfo(ComposeTargetInfo TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    /**
     * Get The canvas information of the output video. 
     * @return Canvas The canvas information of the output video.
     */
    public ComposeCanvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set The canvas information of the output video.
     * @param Canvas The canvas information of the output video.
     */
    public void setCanvas(ComposeCanvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get The global styles. This parameter is used together with `Tracks` to specify styles, such as the subtitle style. 
     * @return Styles The global styles. This parameter is used together with `Tracks` to specify styles, such as the subtitle style.
     */
    public ComposeStyles [] getStyles() {
        return this.Styles;
    }

    /**
     * Set The global styles. This parameter is used together with `Tracks` to specify styles, such as the subtitle style.
     * @param Styles The global styles. This parameter is used together with `Tracks` to specify styles, such as the subtitle style.
     */
    public void setStyles(ComposeStyles [] Styles) {
        this.Styles = Styles;
    }

    /**
     * Get The information of media tracks (consisting of video, audio, image, and text elements) used to composite the video. About tracks and the timeline:
<ul><li>The timeline of a track is the same as the timeline of the output video. </li><li>The elements of different tracks are overlaid at the same time point in the timeline.</li><ul><li>Video, image, and text elements are overlaid according to their track number, with the first track on top. </li><li>Audio elements are mixed. </li></ul></ul>Note: The different elements of the same track cannot be overlaid (except subtitles). 
     * @return Tracks The information of media tracks (consisting of video, audio, image, and text elements) used to composite the video. About tracks and the timeline:
<ul><li>The timeline of a track is the same as the timeline of the output video. </li><li>The elements of different tracks are overlaid at the same time point in the timeline.</li><ul><li>Video, image, and text elements are overlaid according to their track number, with the first track on top. </li><li>Audio elements are mixed. </li></ul></ul>Note: The different elements of the same track cannot be overlaid (except subtitles).
     */
    public ComposeMediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set The information of media tracks (consisting of video, audio, image, and text elements) used to composite the video. About tracks and the timeline:
<ul><li>The timeline of a track is the same as the timeline of the output video. </li><li>The elements of different tracks are overlaid at the same time point in the timeline.</li><ul><li>Video, image, and text elements are overlaid according to their track number, with the first track on top. </li><li>Audio elements are mixed. </li></ul></ul>Note: The different elements of the same track cannot be overlaid (except subtitles).
     * @param Tracks The information of media tracks (consisting of video, audio, image, and text elements) used to composite the video. About tracks and the timeline:
<ul><li>The timeline of a track is the same as the timeline of the output video. </li><li>The elements of different tracks are overlaid at the same time point in the timeline.</li><ul><li>Video, image, and text elements are overlaid according to their track number, with the first track on top. </li><li>Audio elements are mixed. </li></ul></ul>Note: The different elements of the same track cannot be overlaid (except subtitles).
     */
    public void setTracks(ComposeMediaTrack [] Tracks) {
        this.Tracks = Tracks;
    }

    public ComposeMediaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaConfig(ComposeMediaConfig source) {
        if (source.TargetInfo != null) {
            this.TargetInfo = new ComposeTargetInfo(source.TargetInfo);
        }
        if (source.Canvas != null) {
            this.Canvas = new ComposeCanvas(source.Canvas);
        }
        if (source.Styles != null) {
            this.Styles = new ComposeStyles[source.Styles.length];
            for (int i = 0; i < source.Styles.length; i++) {
                this.Styles[i] = new ComposeStyles(source.Styles[i]);
            }
        }
        if (source.Tracks != null) {
            this.Tracks = new ComposeMediaTrack[source.Tracks.length];
            for (int i = 0; i < source.Tracks.length; i++) {
                this.Tracks[i] = new ComposeMediaTrack(source.Tracks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamArrayObj(map, prefix + "Styles.", this.Styles);
        this.setParamArrayObj(map, prefix + "Tracks.", this.Tracks);

    }
}

