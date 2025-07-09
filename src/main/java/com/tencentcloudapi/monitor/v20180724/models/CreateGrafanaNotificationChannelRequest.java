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

public class CreateGrafanaNotificationChannelRequest extends AbstractModel {

    /**
    * TCMG instance ID, such as “grafana-abcdefgh”.
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
    * Default value: `1`. This parameter has been deprecated. Please use `OrganizationIds` instead.
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * Array of notification channel IDs
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * Array of extra organization IDs. This parameter has been deprecated. Please use `OrganizationIds` instead.
    */
    @SerializedName("ExtraOrgIds")
    @Expose
    private String [] ExtraOrgIds;

    /**
    * Array of all valid organization IDs. Default value: `1`.
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

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
     * Get Default value: `1`. This parameter has been deprecated. Please use `OrganizationIds` instead. 
     * @return OrgId Default value: `1`. This parameter has been deprecated. Please use `OrganizationIds` instead.
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set Default value: `1`. This parameter has been deprecated. Please use `OrganizationIds` instead.
     * @param OrgId Default value: `1`. This parameter has been deprecated. Please use `OrganizationIds` instead.
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
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
     * Get Array of extra organization IDs. This parameter has been deprecated. Please use `OrganizationIds` instead. 
     * @return ExtraOrgIds Array of extra organization IDs. This parameter has been deprecated. Please use `OrganizationIds` instead.
     */
    public String [] getExtraOrgIds() {
        return this.ExtraOrgIds;
    }

    /**
     * Set Array of extra organization IDs. This parameter has been deprecated. Please use `OrganizationIds` instead.
     * @param ExtraOrgIds Array of extra organization IDs. This parameter has been deprecated. Please use `OrganizationIds` instead.
     */
    public void setExtraOrgIds(String [] ExtraOrgIds) {
        this.ExtraOrgIds = ExtraOrgIds;
    }

    /**
     * Get Array of all valid organization IDs. Default value: `1`. 
     * @return OrganizationIds Array of all valid organization IDs. Default value: `1`.
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set Array of all valid organization IDs. Default value: `1`.
     * @param OrganizationIds Array of all valid organization IDs. Default value: `1`.
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
    }

    public CreateGrafanaNotificationChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGrafanaNotificationChannelRequest(CreateGrafanaNotificationChannelRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "ExtraOrgIds.", this.ExtraOrgIds);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);

    }
}

