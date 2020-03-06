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

public class OutputVideoStream extends AbstractModel{

    /**
    * Video stream encoder. Valid values:
<li>libx264: H.264</li>
Default value: libx264.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Video frame rate in Hz. Value range: [0, 60].
Default value: 0, which means that the value is the same as the video frame rate of the first video segment in the first video track.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get Video stream encoder. Valid values:
<li>libx264: H.264</li>
Default value: libx264. 
     * @return Codec Video stream encoder. Valid values:
<li>libx264: H.264</li>
Default value: libx264.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video stream encoder. Valid values:
<li>libx264: H.264</li>
Default value: libx264.
     * @param Codec Video stream encoder. Valid values:
<li>libx264: H.264</li>
Default value: libx264.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Video frame rate in Hz. Value range: [0, 60].
Default value: 0, which means that the value is the same as the video frame rate of the first video segment in the first video track. 
     * @return Fps Video frame rate in Hz. Value range: [0, 60].
Default value: 0, which means that the value is the same as the video frame rate of the first video segment in the first video track.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate in Hz. Value range: [0, 60].
Default value: 0, which means that the value is the same as the video frame rate of the first video segment in the first video track.
     * @param Fps Video frame rate in Hz. Value range: [0, 60].
Default value: 0, which means that the value is the same as the video frame rate of the first video segment in the first video track.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

