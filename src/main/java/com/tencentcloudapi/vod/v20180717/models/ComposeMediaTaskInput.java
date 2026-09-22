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

public class ComposeMediaTaskInput extends AbstractModel {

    /**
    * Input media track list, including multiple track information composed of materials such as video, audio, and image.
    */
    @SerializedName("Tracks")
    @Expose
    private MediaTrack [] Tracks;

    /**
    * Canvas used when making video files.
    */
    @SerializedName("Canvas")
    @Expose
    private Canvas Canvas;

    /**
    * Output media file information.
    */
    @SerializedName("Output")
    @Expose
    private ComposeMediaOutput Output;

    /**
     * Get Input media track list, including multiple track information composed of materials such as video, audio, and image. 
     * @return Tracks Input media track list, including multiple track information composed of materials such as video, audio, and image.
     */
    public MediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set Input media track list, including multiple track information composed of materials such as video, audio, and image.
     * @param Tracks Input media track list, including multiple track information composed of materials such as video, audio, and image.
     */
    public void setTracks(MediaTrack [] Tracks) {
        this.Tracks = Tracks;
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

    public ComposeMediaTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaTaskInput(ComposeMediaTaskInput source) {
        if (source.Tracks != null) {
            this.Tracks = new MediaTrack[source.Tracks.length];
            for (int i = 0; i < source.Tracks.length; i++) {
                this.Tracks[i] = new MediaTrack(source.Tracks[i]);
            }
        }
        if (source.Canvas != null) {
            this.Canvas = new Canvas(source.Canvas);
        }
        if (source.Output != null) {
            this.Output = new ComposeMediaOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tracks.", this.Tracks);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

