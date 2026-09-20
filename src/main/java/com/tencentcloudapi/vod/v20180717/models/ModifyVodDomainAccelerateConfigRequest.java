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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVodDomainAccelerateConfigRequest extends AbstractModel {

    /**
    * <p>Domains requiring acceleration configuration.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Region. Available values:</p><li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li><li>Outside Chinese Mainland: outside the Chinese mainland.</li><li>Global: global.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Enable or disable domain name acceleration for the selected region. Available values:</p><li>Enabled: Turn on.</li><li>Disabled: Turn off.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get <p>Domains requiring acceleration configuration.</p> 
     * @return Domain <p>Domains requiring acceleration configuration.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domains requiring acceleration configuration.</p>
     * @param Domain <p>Domains requiring acceleration configuration.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Region. Available values:</p><li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li><li>Outside Chinese Mainland: outside the Chinese mainland.</li><li>Global: global.</li> 
     * @return Area <p>Region. Available values:</p><li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li><li>Outside Chinese Mainland: outside the Chinese mainland.</li><li>Global: global.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Region. Available values:</p><li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li><li>Outside Chinese Mainland: outside the Chinese mainland.</li><li>Global: global.</li>
     * @param Area <p>Region. Available values:</p><li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li><li>Outside Chinese Mainland: outside the Chinese mainland.</li><li>Global: global.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Enable or disable domain name acceleration for the selected region. Available values:</p><li>Enabled: Turn on.</li><li>Disabled: Turn off.</li> 
     * @return Status <p>Enable or disable domain name acceleration for the selected region. Available values:</p><li>Enabled: Turn on.</li><li>Disabled: Turn off.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Enable or disable domain name acceleration for the selected region. Available values:</p><li>Enabled: Turn on.</li><li>Disabled: Turn off.</li>
     * @param Status <p>Enable or disable domain name acceleration for the selected region. Available values:</p><li>Enabled: Turn on.</li><li>Disabled: Turn off.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public ModifyVodDomainAccelerateConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVodDomainAccelerateConfigRequest(ModifyVodDomainAccelerateConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

