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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCWPExposePathRequest extends AbstractModel {

    /**
    * <p>Host Asset ID</p>
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

    /**
    * <p>Asset ownership User AppID</p>
    */
    @SerializedName("AssetAppID")
    @Expose
    private Long AssetAppID;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Asset IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Asset Domain</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Port or port range</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get <p>Host Asset ID</p> 
     * @return AssetID <p>Host Asset ID</p>
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set <p>Host Asset ID</p>
     * @param AssetID <p>Host Asset ID</p>
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
    }

    /**
     * Get <p>Asset ownership User AppID</p> 
     * @return AssetAppID <p>Asset ownership User AppID</p>
     */
    public Long getAssetAppID() {
        return this.AssetAppID;
    }

    /**
     * Set <p>Asset ownership User AppID</p>
     * @param AssetAppID <p>Asset ownership User AppID</p>
     */
    public void setAssetAppID(Long AssetAppID) {
        this.AssetAppID = AssetAppID;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Asset IP</p> 
     * @return Ip <p>Asset IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Asset IP</p>
     * @param Ip <p>Asset IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Asset Domain</p> 
     * @return Domain <p>Asset Domain</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Asset Domain</p>
     * @param Domain <p>Asset Domain</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Port or port range</p> 
     * @return Port <p>Port or port range</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port or port range</p>
     * @param Port <p>Port or port range</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public DescribeCWPExposePathRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCWPExposePathRequest(DescribeCWPExposePathRequest source) {
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
        }
        if (source.AssetAppID != null) {
            this.AssetAppID = new Long(source.AssetAppID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "AssetAppID", this.AssetAppID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

