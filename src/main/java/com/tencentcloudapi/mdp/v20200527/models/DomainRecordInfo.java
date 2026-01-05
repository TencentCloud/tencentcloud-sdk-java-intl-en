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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainRecordInfo extends AbstractModel {

    /**
    * Associated playback domain name.
    */
    @SerializedName("CdnDomain")
    @Expose
    private String CdnDomain;

    /**
    * Belonging region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Channel ID.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * The ID of a record
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Associated playback domain name. 
     * @return CdnDomain Associated playback domain name.
     */
    public String getCdnDomain() {
        return this.CdnDomain;
    }

    /**
     * Set Associated playback domain name.
     * @param CdnDomain Associated playback domain name.
     */
    public void setCdnDomain(String CdnDomain) {
        this.CdnDomain = CdnDomain;
    }

    /**
     * Get Belonging region. 
     * @return Region Belonging region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Belonging region.
     * @param Region Belonging region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Channel ID. 
     * @return ChannelId Channel ID.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID.
     * @param ChannelId Channel ID.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get The ID of a record 
     * @return Id The ID of a record
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The ID of a record
     * @param Id The ID of a record
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DomainRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainRecordInfo(DomainRecordInfo source) {
        if (source.CdnDomain != null) {
            this.CdnDomain = new String(source.CdnDomain);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CdnDomain", this.CdnDomain);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

