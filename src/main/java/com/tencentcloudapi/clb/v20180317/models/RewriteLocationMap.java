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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RewriteLocationMap extends AbstractModel {

    /**
    * Source forwarding rule ID
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * ID of the forwarding rule of the destination
    */
    @SerializedName("TargetLocationId")
    @Expose
    private String TargetLocationId;

    /**
    * Redirection status code. Valid values: 301, 302, and 307.
    */
    @SerializedName("RewriteCode")
    @Expose
    private Long RewriteCode;

    /**
    * Whether the matched URL is carried in redirection. It is required when configuring `RewriteCode`.
    */
    @SerializedName("TakeUrl")
    @Expose
    private Boolean TakeUrl;

    /**
    * Original domain name of redirection, which must be the corresponding domain name of `SourceLocationId`. It is required when configuring `RewriteCode`.
    */
    @SerializedName("SourceDomain")
    @Expose
    private String SourceDomain;

    /**
     * Get Source forwarding rule ID 
     * @return SourceLocationId Source forwarding rule ID
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set Source forwarding rule ID
     * @param SourceLocationId Source forwarding rule ID
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get ID of the forwarding rule of the destination 
     * @return TargetLocationId ID of the forwarding rule of the destination
     */
    public String getTargetLocationId() {
        return this.TargetLocationId;
    }

    /**
     * Set ID of the forwarding rule of the destination
     * @param TargetLocationId ID of the forwarding rule of the destination
     */
    public void setTargetLocationId(String TargetLocationId) {
        this.TargetLocationId = TargetLocationId;
    }

    /**
     * Get Redirection status code. Valid values: 301, 302, and 307. 
     * @return RewriteCode Redirection status code. Valid values: 301, 302, and 307.
     */
    public Long getRewriteCode() {
        return this.RewriteCode;
    }

    /**
     * Set Redirection status code. Valid values: 301, 302, and 307.
     * @param RewriteCode Redirection status code. Valid values: 301, 302, and 307.
     */
    public void setRewriteCode(Long RewriteCode) {
        this.RewriteCode = RewriteCode;
    }

    /**
     * Get Whether the matched URL is carried in redirection. It is required when configuring `RewriteCode`. 
     * @return TakeUrl Whether the matched URL is carried in redirection. It is required when configuring `RewriteCode`.
     */
    public Boolean getTakeUrl() {
        return this.TakeUrl;
    }

    /**
     * Set Whether the matched URL is carried in redirection. It is required when configuring `RewriteCode`.
     * @param TakeUrl Whether the matched URL is carried in redirection. It is required when configuring `RewriteCode`.
     */
    public void setTakeUrl(Boolean TakeUrl) {
        this.TakeUrl = TakeUrl;
    }

    /**
     * Get Original domain name of redirection, which must be the corresponding domain name of `SourceLocationId`. It is required when configuring `RewriteCode`. 
     * @return SourceDomain Original domain name of redirection, which must be the corresponding domain name of `SourceLocationId`. It is required when configuring `RewriteCode`.
     */
    public String getSourceDomain() {
        return this.SourceDomain;
    }

    /**
     * Set Original domain name of redirection, which must be the corresponding domain name of `SourceLocationId`. It is required when configuring `RewriteCode`.
     * @param SourceDomain Original domain name of redirection, which must be the corresponding domain name of `SourceLocationId`. It is required when configuring `RewriteCode`.
     */
    public void setSourceDomain(String SourceDomain) {
        this.SourceDomain = SourceDomain;
    }

    public RewriteLocationMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RewriteLocationMap(RewriteLocationMap source) {
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.TargetLocationId != null) {
            this.TargetLocationId = new String(source.TargetLocationId);
        }
        if (source.RewriteCode != null) {
            this.RewriteCode = new Long(source.RewriteCode);
        }
        if (source.TakeUrl != null) {
            this.TakeUrl = new Boolean(source.TakeUrl);
        }
        if (source.SourceDomain != null) {
            this.SourceDomain = new String(source.SourceDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "TargetLocationId", this.TargetLocationId);
        this.setParamSimple(map, prefix + "RewriteCode", this.RewriteCode);
        this.setParamSimple(map, prefix + "TakeUrl", this.TakeUrl);
        this.setParamSimple(map, prefix + "SourceDomain", this.SourceDomain);

    }
}

