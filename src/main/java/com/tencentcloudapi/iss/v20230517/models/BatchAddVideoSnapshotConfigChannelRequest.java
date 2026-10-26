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

public class BatchAddVideoSnapshotConfigChannelRequest extends AbstractModel {

    /**
    * <p>Screenshot configuration Id</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>Channel Id list</p>
    */
    @SerializedName("Channels")
    @Expose
    private String [] Channels;

    /**
     * Get <p>Screenshot configuration Id</p> 
     * @return ConfigId <p>Screenshot configuration Id</p>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>Screenshot configuration Id</p>
     * @param ConfigId <p>Screenshot configuration Id</p>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>Channel Id list</p> 
     * @return Channels <p>Channel Id list</p>
     */
    public String [] getChannels() {
        return this.Channels;
    }

    /**
     * Set <p>Channel Id list</p>
     * @param Channels <p>Channel Id list</p>
     */
    public void setChannels(String [] Channels) {
        this.Channels = Channels;
    }

    public BatchAddVideoSnapshotConfigChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchAddVideoSnapshotConfigChannelRequest(BatchAddVideoSnapshotConfigChannelRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Channels != null) {
            this.Channels = new String[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new String(source.Channels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArraySimple(map, prefix + "Channels.", this.Channels);

    }
}

