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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeVideoStream extends AbstractModel{

    /**
    * The codec. Valid values:
<li>`H.264` (default) </li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * The video frame rate (Hz). Value range: 0–60.  
The default value is `0`, which means that the frame rate will be the same as that of the first video.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get The codec. Valid values:
<li>`H.264` (default) </li> 
     * @return Codec The codec. Valid values:
<li>`H.264` (default) </li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set The codec. Valid values:
<li>`H.264` (default) </li>
     * @param Codec The codec. Valid values:
<li>`H.264` (default) </li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get The video frame rate (Hz). Value range: 0–60.  
The default value is `0`, which means that the frame rate will be the same as that of the first video. 
     * @return Fps The video frame rate (Hz). Value range: 0–60.  
The default value is `0`, which means that the frame rate will be the same as that of the first video.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set The video frame rate (Hz). Value range: 0–60.  
The default value is `0`, which means that the frame rate will be the same as that of the first video.
     * @param Fps The video frame rate (Hz). Value range: 0–60.  
The default value is `0`, which means that the frame rate will be the same as that of the first video.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public ComposeVideoStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeVideoStream(ComposeVideoStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

