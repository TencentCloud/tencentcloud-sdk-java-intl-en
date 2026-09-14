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

public class TrackInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TrackNum")
    @Expose
    private String TrackNum;

    /**
    * 
    */
    @SerializedName("ChannelVolume")
    @Expose
    private Float [] ChannelVolume;

    /**
     * Get  
     * @return TrackNum 
     */
    public String getTrackNum() {
        return this.TrackNum;
    }

    /**
     * Set 
     * @param TrackNum 
     */
    public void setTrackNum(String TrackNum) {
        this.TrackNum = TrackNum;
    }

    /**
     * Get  
     * @return ChannelVolume 
     */
    public Float [] getChannelVolume() {
        return this.ChannelVolume;
    }

    /**
     * Set 
     * @param ChannelVolume 
     */
    public void setChannelVolume(Float [] ChannelVolume) {
        this.ChannelVolume = ChannelVolume;
    }

    public TrackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrackInfo(TrackInfo source) {
        if (source.TrackNum != null) {
            this.TrackNum = new String(source.TrackNum);
        }
        if (source.ChannelVolume != null) {
            this.ChannelVolume = new Float[source.ChannelVolume.length];
            for (int i = 0; i < source.ChannelVolume.length; i++) {
                this.ChannelVolume[i] = new Float(source.ChannelVolume[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrackNum", this.TrackNum);
        this.setParamArraySimple(map, prefix + "ChannelVolume.", this.ChannelVolume);

    }
}

