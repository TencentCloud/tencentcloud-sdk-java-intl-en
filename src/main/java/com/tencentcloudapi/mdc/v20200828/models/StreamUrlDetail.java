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

public class StreamUrlDetail extends AbstractModel {

    /**
    * Describes carrier information and other details.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * URL 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Playback: stream playback address;
RelayDestination: relay destination address; SourceCaptureUrl: source pull stream address; IngestEndpoint: streaming address
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Describes carrier information and other details. 
     * @return Label Describes carrier information and other details.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Describes carrier information and other details.
     * @param Label Describes carrier information and other details.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get URL  
     * @return Url URL 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL 
     * @param Url URL 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Playback: stream playback address;
RelayDestination: relay destination address; SourceCaptureUrl: source pull stream address; IngestEndpoint: streaming address 
     * @return Type Playback: stream playback address;
RelayDestination: relay destination address; SourceCaptureUrl: source pull stream address; IngestEndpoint: streaming address
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Playback: stream playback address;
RelayDestination: relay destination address; SourceCaptureUrl: source pull stream address; IngestEndpoint: streaming address
     * @param Type Playback: stream playback address;
RelayDestination: relay destination address; SourceCaptureUrl: source pull stream address; IngestEndpoint: streaming address
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public StreamUrlDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamUrlDetail(StreamUrlDetail source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

