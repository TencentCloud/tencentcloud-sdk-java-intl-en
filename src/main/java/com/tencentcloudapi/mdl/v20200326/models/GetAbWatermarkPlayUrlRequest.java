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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAbWatermarkPlayUrlRequest extends AbstractModel {

    /**
    * Client UUID, 32-bit unsigned integer, [0, 4294967295].
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * Channel ID of Stream Package.
    */
    @SerializedName("StreamPackageChannelId")
    @Expose
    private String StreamPackageChannelId;

    /**
    * Original play URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Client UUID, 32-bit unsigned integer, [0, 4294967295]. 
     * @return Uuid Client UUID, 32-bit unsigned integer, [0, 4294967295].
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set Client UUID, 32-bit unsigned integer, [0, 4294967295].
     * @param Uuid Client UUID, 32-bit unsigned integer, [0, 4294967295].
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Channel ID of Stream Package. 
     * @return StreamPackageChannelId Channel ID of Stream Package.
     */
    public String getStreamPackageChannelId() {
        return this.StreamPackageChannelId;
    }

    /**
     * Set Channel ID of Stream Package.
     * @param StreamPackageChannelId Channel ID of Stream Package.
     */
    public void setStreamPackageChannelId(String StreamPackageChannelId) {
        this.StreamPackageChannelId = StreamPackageChannelId;
    }

    /**
     * Get Original play URL. 
     * @return Url Original play URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Original play URL.
     * @param Url Original play URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public GetAbWatermarkPlayUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAbWatermarkPlayUrlRequest(GetAbWatermarkPlayUrlRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.StreamPackageChannelId != null) {
            this.StreamPackageChannelId = new String(source.StreamPackageChannelId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "StreamPackageChannelId", this.StreamPackageChannelId);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

