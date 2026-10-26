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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDeviceStreamData extends AbstractModel {

    /**
    * flv stream address.
    */
    @SerializedName("Flv")
    @Expose
    private String Flv;

    /**
    * hls stream address.
    */
    @SerializedName("Hls")
    @Expose
    private String Hls;

    /**
    * rtmp stream address.
    */
    @SerializedName("Rtmp")
    @Expose
    private String Rtmp;

    /**
     * Get flv stream address. 
     * @return Flv flv stream address.
     */
    public String getFlv() {
        return this.Flv;
    }

    /**
     * Set flv stream address.
     * @param Flv flv stream address.
     */
    public void setFlv(String Flv) {
        this.Flv = Flv;
    }

    /**
     * Get hls stream address. 
     * @return Hls hls stream address.
     */
    public String getHls() {
        return this.Hls;
    }

    /**
     * Set hls stream address.
     * @param Hls hls stream address.
     */
    public void setHls(String Hls) {
        this.Hls = Hls;
    }

    /**
     * Get rtmp stream address. 
     * @return Rtmp rtmp stream address.
     */
    public String getRtmp() {
        return this.Rtmp;
    }

    /**
     * Set rtmp stream address.
     * @param Rtmp rtmp stream address.
     */
    public void setRtmp(String Rtmp) {
        this.Rtmp = Rtmp;
    }

    public ControlDeviceStreamData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDeviceStreamData(ControlDeviceStreamData source) {
        if (source.Flv != null) {
            this.Flv = new String(source.Flv);
        }
        if (source.Hls != null) {
            this.Hls = new String(source.Hls);
        }
        if (source.Rtmp != null) {
            this.Rtmp = new String(source.Rtmp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flv", this.Flv);
        this.setParamSimple(map, prefix + "Hls", this.Hls);
        this.setParamSimple(map, prefix + "Rtmp", this.Rtmp);

    }
}

