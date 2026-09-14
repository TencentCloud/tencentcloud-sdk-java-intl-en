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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmInfo extends AbstractModel {

    /**
    * Encryption type.

- simpleaes
Can only be used for HLS. Format support: ts and mp4.
Only slice mode can be used. singlefile mode cannot be used.

- fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- playready:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- widevine+fairplay,playready+fairplay,widevine+playready+fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine+playready:
Applicable to HLS and MPEG-DASH. The segment format can only be mp4.
For HLS format, you can use the slicing mode or singlefile mode.
For MPEG-DASH, only singlefile mode can be used.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("SimpleAesDrm")
    @Expose
    private SimpleAesDrm SimpleAesDrm;

    /**
    * Information about FairPlay, WideVine, and PlayReady encryption.
    */
    @SerializedName("SpekeDrm")
    @Expose
    private SpekeDrm SpekeDrm;

    /**
     * Get Encryption type.

- simpleaes
Can only be used for HLS. Format support: ts and mp4.
Only slice mode can be used. singlefile mode cannot be used.

- fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- playready:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- widevine+fairplay,playready+fairplay,widevine+playready+fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine+playready:
Applicable to HLS and MPEG-DASH. The segment format can only be mp4.
For HLS format, you can use the slicing mode or singlefile mode.
For MPEG-DASH, only singlefile mode can be used. 
     * @return Type Encryption type.

- simpleaes
Can only be used for HLS. Format support: ts and mp4.
Only slice mode can be used. singlefile mode cannot be used.

- fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- playready:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- widevine+fairplay,playready+fairplay,widevine+playready+fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine+playready:
Applicable to HLS and MPEG-DASH. The segment format can only be mp4.
For HLS format, you can use the slicing mode or singlefile mode.
For MPEG-DASH, only singlefile mode can be used.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Encryption type.

- simpleaes
Can only be used for HLS. Format support: ts and mp4.
Only slice mode can be used. singlefile mode cannot be used.

- fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- playready:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- widevine+fairplay,playready+fairplay,widevine+playready+fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine+playready:
Applicable to HLS and MPEG-DASH. The segment format can only be mp4.
For HLS format, you can use the slicing mode or singlefile mode.
For MPEG-DASH, only singlefile mode can be used.
     * @param Type Encryption type.

- simpleaes
Can only be used for HLS. Format support: ts and mp4.
Only slice mode can be used. singlefile mode cannot be used.

- fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- playready:
Can be used for HLS and DASH. The segment format can only be mp4.
Output HLS: The slicing or singlefile mode can be used.
Output DASH: can only be in singlefile mode

- widevine+fairplay,playready+fairplay,widevine+playready+fairplay:
Can only be used for HLS. The segment format can only be mp4.
Slice mode or singlefile mode can be used.

- widevine+playready:
Applicable to HLS and MPEG-DASH. The segment format can only be mp4.
For HLS format, you can use the slicing mode or singlefile mode.
For MPEG-DASH, only singlefile mode can be used.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return SimpleAesDrm 
     */
    public SimpleAesDrm getSimpleAesDrm() {
        return this.SimpleAesDrm;
    }

    /**
     * Set 
     * @param SimpleAesDrm 
     */
    public void setSimpleAesDrm(SimpleAesDrm SimpleAesDrm) {
        this.SimpleAesDrm = SimpleAesDrm;
    }

    /**
     * Get Information about FairPlay, WideVine, and PlayReady encryption. 
     * @return SpekeDrm Information about FairPlay, WideVine, and PlayReady encryption.
     */
    public SpekeDrm getSpekeDrm() {
        return this.SpekeDrm;
    }

    /**
     * Set Information about FairPlay, WideVine, and PlayReady encryption.
     * @param SpekeDrm Information about FairPlay, WideVine, and PlayReady encryption.
     */
    public void setSpekeDrm(SpekeDrm SpekeDrm) {
        this.SpekeDrm = SpekeDrm;
    }

    public DrmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrmInfo(DrmInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SimpleAesDrm != null) {
            this.SimpleAesDrm = new SimpleAesDrm(source.SimpleAesDrm);
        }
        if (source.SpekeDrm != null) {
            this.SpekeDrm = new SpekeDrm(source.SpekeDrm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SimpleAesDrm.", this.SimpleAesDrm);
        this.setParamObj(map, prefix + "SpekeDrm.", this.SpekeDrm);

    }
}

