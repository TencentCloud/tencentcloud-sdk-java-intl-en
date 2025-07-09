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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmAgentInfo extends AbstractModel {

    /**
    * Agent download address.
    */
    @SerializedName("AgentDownloadURL")
    @Expose
    private String AgentDownloadURL;

    /**
    * Collector reporting address.
    */
    @SerializedName("CollectorURL")
    @Expose
    private String CollectorURL;

    /**
    * Token information.
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Public network reporting address.
    */
    @SerializedName("PublicCollectorURL")
    @Expose
    private String PublicCollectorURL;

    /**
    * Self-Developed vpc report address.
    */
    @SerializedName("InnerCollectorURL")
    @Expose
    private String InnerCollectorURL;

    /**
    * Private link reporting address.
    */
    @SerializedName("PrivateLinkCollectorURL")
    @Expose
    private String PrivateLinkCollectorURL;

    /**
     * Get Agent download address. 
     * @return AgentDownloadURL Agent download address.
     */
    public String getAgentDownloadURL() {
        return this.AgentDownloadURL;
    }

    /**
     * Set Agent download address.
     * @param AgentDownloadURL Agent download address.
     */
    public void setAgentDownloadURL(String AgentDownloadURL) {
        this.AgentDownloadURL = AgentDownloadURL;
    }

    /**
     * Get Collector reporting address. 
     * @return CollectorURL Collector reporting address.
     */
    public String getCollectorURL() {
        return this.CollectorURL;
    }

    /**
     * Set Collector reporting address.
     * @param CollectorURL Collector reporting address.
     */
    public void setCollectorURL(String CollectorURL) {
        this.CollectorURL = CollectorURL;
    }

    /**
     * Get Token information. 
     * @return Token Token information.
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token information.
     * @param Token Token information.
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Public network reporting address. 
     * @return PublicCollectorURL Public network reporting address.
     */
    public String getPublicCollectorURL() {
        return this.PublicCollectorURL;
    }

    /**
     * Set Public network reporting address.
     * @param PublicCollectorURL Public network reporting address.
     */
    public void setPublicCollectorURL(String PublicCollectorURL) {
        this.PublicCollectorURL = PublicCollectorURL;
    }

    /**
     * Get Self-Developed vpc report address. 
     * @return InnerCollectorURL Self-Developed vpc report address.
     */
    public String getInnerCollectorURL() {
        return this.InnerCollectorURL;
    }

    /**
     * Set Self-Developed vpc report address.
     * @param InnerCollectorURL Self-Developed vpc report address.
     */
    public void setInnerCollectorURL(String InnerCollectorURL) {
        this.InnerCollectorURL = InnerCollectorURL;
    }

    /**
     * Get Private link reporting address. 
     * @return PrivateLinkCollectorURL Private link reporting address.
     */
    public String getPrivateLinkCollectorURL() {
        return this.PrivateLinkCollectorURL;
    }

    /**
     * Set Private link reporting address.
     * @param PrivateLinkCollectorURL Private link reporting address.
     */
    public void setPrivateLinkCollectorURL(String PrivateLinkCollectorURL) {
        this.PrivateLinkCollectorURL = PrivateLinkCollectorURL;
    }

    public ApmAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmAgentInfo(ApmAgentInfo source) {
        if (source.AgentDownloadURL != null) {
            this.AgentDownloadURL = new String(source.AgentDownloadURL);
        }
        if (source.CollectorURL != null) {
            this.CollectorURL = new String(source.CollectorURL);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.PublicCollectorURL != null) {
            this.PublicCollectorURL = new String(source.PublicCollectorURL);
        }
        if (source.InnerCollectorURL != null) {
            this.InnerCollectorURL = new String(source.InnerCollectorURL);
        }
        if (source.PrivateLinkCollectorURL != null) {
            this.PrivateLinkCollectorURL = new String(source.PrivateLinkCollectorURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentDownloadURL", this.AgentDownloadURL);
        this.setParamSimple(map, prefix + "CollectorURL", this.CollectorURL);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "PublicCollectorURL", this.PublicCollectorURL);
        this.setParamSimple(map, prefix + "InnerCollectorURL", this.InnerCollectorURL);
        this.setParamSimple(map, prefix + "PrivateLinkCollectorURL", this.PrivateLinkCollectorURL);

    }
}

