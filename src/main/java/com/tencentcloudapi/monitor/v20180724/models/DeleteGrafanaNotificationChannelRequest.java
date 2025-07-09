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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGrafanaNotificationChannelRequest extends AbstractModel {

    /**
    * Array of channel IDs, such as “nchannel-abcd1234”.
    */
    @SerializedName("ChannelIDs")
    @Expose
    private String [] ChannelIDs;

    /**
    * TCMG instance ID, such as “grafana-abcdefgh”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Array of channel IDs, such as “nchannel-abcd1234”. 
     * @return ChannelIDs Array of channel IDs, such as “nchannel-abcd1234”.
     */
    public String [] getChannelIDs() {
        return this.ChannelIDs;
    }

    /**
     * Set Array of channel IDs, such as “nchannel-abcd1234”.
     * @param ChannelIDs Array of channel IDs, such as “nchannel-abcd1234”.
     */
    public void setChannelIDs(String [] ChannelIDs) {
        this.ChannelIDs = ChannelIDs;
    }

    /**
     * Get TCMG instance ID, such as “grafana-abcdefgh”. 
     * @return InstanceId TCMG instance ID, such as “grafana-abcdefgh”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TCMG instance ID, such as “grafana-abcdefgh”.
     * @param InstanceId TCMG instance ID, such as “grafana-abcdefgh”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DeleteGrafanaNotificationChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGrafanaNotificationChannelRequest(DeleteGrafanaNotificationChannelRequest source) {
        if (source.ChannelIDs != null) {
            this.ChannelIDs = new String[source.ChannelIDs.length];
            for (int i = 0; i < source.ChannelIDs.length; i++) {
                this.ChannelIDs[i] = new String(source.ChannelIDs[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChannelIDs.", this.ChannelIDs);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

