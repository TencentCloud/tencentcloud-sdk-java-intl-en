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

public class GrafanaChannel extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Channel name
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Array of alert channel template IDs
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * All valid organizations in an alert channel
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Channel name 
     * @return ChannelName Channel name
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Channel name
     * @param ChannelName Channel name
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Array of alert channel template IDs 
     * @return Receivers Array of alert channel template IDs
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Array of alert channel template IDs
     * @param Receivers Array of alert channel template IDs
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time 
     * @return UpdatedAt Update time
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time
     * @param UpdatedAt Update time
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get All valid organizations in an alert channel
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrganizationIds All valid organizations in an alert channel
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set All valid organizations in an alert channel
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrganizationIds All valid organizations in an alert channel
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
    }

    public GrafanaChannel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaChannel(GrafanaChannel source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.OrganizationIds != null) {
            this.OrganizationIds = new String[source.OrganizationIds.length];
            for (int i = 0; i < source.OrganizationIds.length; i++) {
                this.OrganizationIds[i] = new String(source.OrganizationIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

