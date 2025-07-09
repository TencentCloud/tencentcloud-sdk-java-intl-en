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

public class UpdateGrafanaNotificationChannelRequest extends AbstractModel {

    /**
    * Channel ID, such as “nchannel-abcd1234”.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * TCMG instance ID, such as “grafana-12345678”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Alert channel name, such as “test”.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Array of notification channel IDs
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * This parameter has been deprecated. Please use `OrganizationIds` instead.
    */
    @SerializedName("ExtraOrgIds")
    @Expose
    private String [] ExtraOrgIds;

    /**
    * Array of valid organization IDs
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
     * Get Channel ID, such as “nchannel-abcd1234”. 
     * @return ChannelId Channel ID, such as “nchannel-abcd1234”.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID, such as “nchannel-abcd1234”.
     * @param ChannelId Channel ID, such as “nchannel-abcd1234”.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get TCMG instance ID, such as “grafana-12345678”. 
     * @return InstanceId TCMG instance ID, such as “grafana-12345678”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TCMG instance ID, such as “grafana-12345678”.
     * @param InstanceId TCMG instance ID, such as “grafana-12345678”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Alert channel name, such as “test”. 
     * @return ChannelName Alert channel name, such as “test”.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Alert channel name, such as “test”.
     * @param ChannelName Alert channel name, such as “test”.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Array of notification channel IDs 
     * @return Receivers Array of notification channel IDs
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Array of notification channel IDs
     * @param Receivers Array of notification channel IDs
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get This parameter has been deprecated. Please use `OrganizationIds` instead. 
     * @return ExtraOrgIds This parameter has been deprecated. Please use `OrganizationIds` instead.
     */
    public String [] getExtraOrgIds() {
        return this.ExtraOrgIds;
    }

    /**
     * Set This parameter has been deprecated. Please use `OrganizationIds` instead.
     * @param ExtraOrgIds This parameter has been deprecated. Please use `OrganizationIds` instead.
     */
    public void setExtraOrgIds(String [] ExtraOrgIds) {
        this.ExtraOrgIds = ExtraOrgIds;
    }

    /**
     * Get Array of valid organization IDs 
     * @return OrganizationIds Array of valid organization IDs
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set Array of valid organization IDs
     * @param OrganizationIds Array of valid organization IDs
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
    }

    public UpdateGrafanaNotificationChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGrafanaNotificationChannelRequest(UpdateGrafanaNotificationChannelRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.ExtraOrgIds != null) {
            this.ExtraOrgIds = new String[source.ExtraOrgIds.length];
            for (int i = 0; i < source.ExtraOrgIds.length; i++) {
                this.ExtraOrgIds[i] = new String(source.ExtraOrgIds[i]);
            }
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "ExtraOrgIds.", this.ExtraOrgIds);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

