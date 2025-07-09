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

public class GrafanaIntegrationConfig extends AbstractModel {

    /**
    * Integration ID
    */
    @SerializedName("IntegrationId")
    @Expose
    private String IntegrationId;

    /**
    * Integration type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Integration content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Integration description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Grafana redirection address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
     * Get Integration ID 
     * @return IntegrationId Integration ID
     */
    public String getIntegrationId() {
        return this.IntegrationId;
    }

    /**
     * Set Integration ID
     * @param IntegrationId Integration ID
     */
    public void setIntegrationId(String IntegrationId) {
        this.IntegrationId = IntegrationId;
    }

    /**
     * Get Integration type 
     * @return Kind Integration type
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Integration type
     * @param Kind Integration type
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Integration content 
     * @return Content Integration content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Integration content
     * @param Content Integration content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Integration description 
     * @return Description Integration description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Integration description
     * @param Description Integration description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Grafana redirection address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GrafanaURL Grafana redirection address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set Grafana redirection address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GrafanaURL Grafana redirection address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    public GrafanaIntegrationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaIntegrationConfig(GrafanaIntegrationConfig source) {
        if (source.IntegrationId != null) {
            this.IntegrationId = new String(source.IntegrationId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntegrationId", this.IntegrationId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);

    }
}

