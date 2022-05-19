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

public class CreateOIDCConfigRequest extends AbstractModel{

    /**
    * IdP URL.
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * Public key for signature, which must be Base64-encoded.
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
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get Public key for signature, which must be Base64-encoded. 
     * @return IdentityKey Public key for signature, which must be Base64-encoded.
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set Public key for signature, which must be Base64-encoded.
     * @param IdentityKey Public key for signature, which must be Base64-encoded.
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

    public CreateOIDCConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOIDCConfigRequest(CreateOIDCConfigRequest source) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamArraySimple(map, prefix + "ClientId.", this.ClientId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

