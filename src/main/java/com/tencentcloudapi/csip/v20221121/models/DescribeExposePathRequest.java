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

public class DescribeExposePathRequest extends AbstractModel {

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Asset ID.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset IP.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Asset domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Port or port range.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Asset ID. 
     * @return AssetId Asset ID.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID.
     * @param AssetId Asset ID.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset IP. 
     * @return Ip Asset IP.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Asset IP.
     * @param Ip Asset IP.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Asset domain name. 
     * @return Domain Asset domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Asset domain name.
     * @param Domain Asset domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Port or port range. 
     * @return Port Port or port range.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port or port range.
     * @param Port Port or port range.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public DescribeExposePathRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExposePathRequest(DescribeExposePathRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

