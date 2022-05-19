/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOIDCConfigResponse extends AbstractModel{

    /**
    * IdP type. 11: Role IdP.
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
    * IdP URL.
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * Public key for signature.
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * Client ID.
    */
    @SerializedName("ClientId")
    @Expose
    private String [] ClientId;

    /**
    * Status. 0: Not set; 2: Disabled; 11: Enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IdP type. 11: Role IdP. 
     * @return ProviderType IdP type. 11: Role IdP.
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set IdP type. 11: Role IdP.
     * @param ProviderType IdP type. 11: Role IdP.
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get IdP URL. 
     * @return IdentityUrl IdP URL.
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set IdP URL.
     * @param IdentityUrl IdP URL.
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get Public key for signature. 
     * @return IdentityKey Public key for signature.
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set Public key for signature.
     * @param IdentityKey Public key for signature.
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get Client ID. 
     * @return ClientId Client ID.
     */
    public String [] getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID.
     * @param ClientId Client ID.
     */
    public void setClientId(String [] ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Status. 0: Not set; 2: Disabled; 11: Enabled. 
     * @return Status Status. 0: Not set; 2: Disabled; 11: Enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: Not set; 2: Disabled; 11: Enabled.
     * @param Status Status. 0: Not set; 2: Disabled; 11: Enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOIDCConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOIDCConfigResponse(DescribeOIDCConfigResponse source) {
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
        if (source.IdentityUrl != null) {
            this.IdentityUrl = new String(source.IdentityUrl);
        }
        if (source.IdentityKey != null) {
            this.IdentityKey = new String(source.IdentityKey);
        }
        if (source.ClientId != null) {
            this.ClientId = new String[source.ClientId.length];
            for (int i = 0; i < source.ClientId.length; i++) {
                this.ClientId[i] = new String(source.ClientId[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamArraySimple(map, prefix + "ClientId.", this.ClientId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

