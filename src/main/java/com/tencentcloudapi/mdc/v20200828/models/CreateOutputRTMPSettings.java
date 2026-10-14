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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputRTMPSettings extends AbstractModel {

    /**
    * Target address for repost. You can enter 1 to 2 addresses.
    */
    @SerializedName("Destinations")
    @Expose
    private CreateOutputRtmpSettingsDestinations [] Destinations;

    /**
    * Chunk size of RTMP, ranging from 4096 to 40960.
    */
    @SerializedName("ChunkSize")
    @Expose
    private Long ChunkSize;

    /**
     * Get Target address for repost. You can enter 1 to 2 addresses. 
     * @return Destinations Target address for repost. You can enter 1 to 2 addresses.
     */
    public CreateOutputRtmpSettingsDestinations [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Target address for repost. You can enter 1 to 2 addresses.
     * @param Destinations Target address for repost. You can enter 1 to 2 addresses.
     */
    public void setDestinations(CreateOutputRtmpSettingsDestinations [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get Chunk size of RTMP, ranging from 4096 to 40960. 
     * @return ChunkSize Chunk size of RTMP, ranging from 4096 to 40960.
     */
    public Long getChunkSize() {
        return this.ChunkSize;
    }

    /**
     * Set Chunk size of RTMP, ranging from 4096 to 40960.
     * @param ChunkSize Chunk size of RTMP, ranging from 4096 to 40960.
     */
    public void setChunkSize(Long ChunkSize) {
        this.ChunkSize = ChunkSize;
    }

    public CreateOutputRTMPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputRTMPSettings(CreateOutputRTMPSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new CreateOutputRtmpSettingsDestinations[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new CreateOutputRtmpSettingsDestinations(source.Destinations[i]);
            }
        }
        if (source.ChunkSize != null) {
            this.ChunkSize = new Long(source.ChunkSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "ChunkSize", this.ChunkSize);

    }
}

