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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeMediaTaskInput extends AbstractModel {

    /**
    * List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials.
    */
    @SerializedName("Tracks")
    @Expose
    private MediaTrack [] Tracks;

    /**
    * Canvas used for composing video file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Canvas")
    @Expose
    private Canvas Canvas;

    /**
    * Information of output media file.
    */
    @SerializedName("Output")
    @Expose
    private ComposeMediaOutput Output;

    /**
     * Get List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials. 
     * @return Tracks List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials.
     */
    public MediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials.
     * @param Tracks List of input media tracks, i.e., information of multiple tracks composed of video, audio, image, and other materials.
     */
    public void setTracks(MediaTrack [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get Canvas used for composing video file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Canvas Canvas used for composing video file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Canvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set Canvas used for composing video file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Canvas Canvas used for composing video file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCanvas(Canvas Canvas) {
        this.Canvas = Canvas;
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

