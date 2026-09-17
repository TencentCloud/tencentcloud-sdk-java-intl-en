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

public class StartCDNDomainRequest extends AbstractModel {

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Domain operation. Value:</p><li>start: enable;</li><li>stop: disable.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get <p>Domain name.</p> 
     * @return Domain <p>Domain name.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name.</p>
     * @param Domain <p>Domain name.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Domain operation. Value:</p><li>start: enable;</li><li>stop: disable.</li> 
     * @return Operation <p>Domain operation. Value:</p><li>start: enable;</li><li>stop: disable.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>Domain operation. Value:</p><li>start: enable;</li><li>stop: disable.</li>
     * @param Operation <p>Domain operation. Value:</p><li>start: enable;</li><li>stop: disable.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public StartCDNDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartCDNDomainRequest(StartCDNDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
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
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

