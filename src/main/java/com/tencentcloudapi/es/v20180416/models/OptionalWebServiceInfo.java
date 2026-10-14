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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptionalWebServiceInfo extends AbstractModel {

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Public url
    */
    @SerializedName("PublicUrl")
    @Expose
    private String PublicUrl;

    /**
    * Private network url
    */
    @SerializedName("PrivateUrl")
    @Expose
    private String PrivateUrl;

    /**
    * Public access permissions
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * Private network access permission
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Intranet vip of the web service
    */
    @SerializedName("PrivateVip")
    @Expose
    private String PrivateVip;

    /**
    * Custom url of cerebro on the private network
    */
    @SerializedName("CustomPrivateUrl")
    @Expose
    private String CustomPrivateUrl;

    /**
     * Get Type. 
     * @return Type Type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Public url 
     * @return PublicUrl Public url
     */
    public String getPublicUrl() {
        return this.PublicUrl;
    }

    /**
     * Set Public url
     * @param PublicUrl Public url
     */
    public void setPublicUrl(String PublicUrl) {
        this.PublicUrl = PublicUrl;
    }

    /**
     * Get Private network url 
     * @return PrivateUrl Private network url
     */
    public String getPrivateUrl() {
        return this.PrivateUrl;
    }

    /**
     * Set Private network url
     * @param PrivateUrl Private network url
     */
    public void setPrivateUrl(String PrivateUrl) {
        this.PrivateUrl = PrivateUrl;
    }

    /**
     * Get Public access permissions 
     * @return PublicAccess Public access permissions
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set Public access permissions
     * @param PublicAccess Public access permissions
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get Private network access permission 
     * @return PrivateAccess Private network access permission
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Private network access permission
     * @param PrivateAccess Private network access permission
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get Version 
     * @return Version Version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
     * @param Version Version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Intranet vip of the web service 
     * @return PrivateVip Intranet vip of the web service
     */
    public String getPrivateVip() {
        return this.PrivateVip;
    }

    /**
     * Set Intranet vip of the web service
     * @param PrivateVip Intranet vip of the web service
     */
    public void setPrivateVip(String PrivateVip) {
        this.PrivateVip = PrivateVip;
    }

    /**
     * Get Custom url of cerebro on the private network 
     * @return CustomPrivateUrl Custom url of cerebro on the private network
     */
    public String getCustomPrivateUrl() {
        return this.CustomPrivateUrl;
    }

    /**
     * Set Custom url of cerebro on the private network
     * @param CustomPrivateUrl Custom url of cerebro on the private network
     */
    public void setCustomPrivateUrl(String CustomPrivateUrl) {
        this.CustomPrivateUrl = CustomPrivateUrl;
    }

    public OptionalWebServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptionalWebServiceInfo(OptionalWebServiceInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PublicUrl != null) {
            this.PublicUrl = new String(source.PublicUrl);
        }
        if (source.PrivateUrl != null) {
            this.PrivateUrl = new String(source.PrivateUrl);
        }
        if (source.PublicAccess != null) {
            this.PublicAccess = new String(source.PublicAccess);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.PrivateVip != null) {
            this.PrivateVip = new String(source.PrivateVip);
        }
        if (source.CustomPrivateUrl != null) {
            this.CustomPrivateUrl = new String(source.CustomPrivateUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublicUrl", this.PublicUrl);
        this.setParamSimple(map, prefix + "PrivateUrl", this.PrivateUrl);
        this.setParamSimple(map, prefix + "PublicAccess", this.PublicAccess);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "PrivateVip", this.PrivateVip);
        this.setParamSimple(map, prefix + "CustomPrivateUrl", this.CustomPrivateUrl);

    }
}

