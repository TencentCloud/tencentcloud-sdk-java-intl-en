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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEmailIdentityRequest extends AbstractModel {

    /**
    * <p>Domain name for request verification</p>
    */
    @SerializedName("EmailIdentity")
    @Expose
    private String EmailIdentity;

    /**
    * <p>Match the new and old APIs in the console</p>
    */
    @SerializedName("NewAPI")
    @Expose
    private Boolean NewAPI;

    /**
    * <p>dkim digits</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul>
    */
    @SerializedName("DKIMOption")
    @Expose
    private Long DKIMOption;

    /**
     * Get <p>Domain name for request verification</p> 
     * @return EmailIdentity <p>Domain name for request verification</p>
     */
    public String getEmailIdentity() {
        return this.EmailIdentity;
    }

    /**
     * Set <p>Domain name for request verification</p>
     * @param EmailIdentity <p>Domain name for request verification</p>
     */
    public void setEmailIdentity(String EmailIdentity) {
        this.EmailIdentity = EmailIdentity;
    }

    /**
     * Get <p>Match the new and old APIs in the console</p> 
     * @return NewAPI <p>Match the new and old APIs in the console</p>
     */
    public Boolean getNewAPI() {
        return this.NewAPI;
    }

    /**
     * Set <p>Match the new and old APIs in the console</p>
     * @param NewAPI <p>Match the new and old APIs in the console</p>
     */
    public void setNewAPI(Boolean NewAPI) {
        this.NewAPI = NewAPI;
    }

    /**
     * Get <p>dkim digits</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul> 
     * @return DKIMOption <p>dkim digits</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul>
     */
    public Long getDKIMOption() {
        return this.DKIMOption;
    }

    /**
     * Set <p>dkim digits</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul>
     * @param DKIMOption <p>dkim digits</p><p>Enumeration value:</p><ul><li>0: 1024</li><li>1: 2048</li><li>2: Dual signature</li></ul>
     */
    public void setDKIMOption(Long DKIMOption) {
        this.DKIMOption = DKIMOption;
    }

    public UpdateEmailIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEmailIdentityRequest(UpdateEmailIdentityRequest source) {
        if (source.EmailIdentity != null) {
            this.EmailIdentity = new String(source.EmailIdentity);
        }
        if (source.NewAPI != null) {
            this.NewAPI = new Boolean(source.NewAPI);
        }
        if (source.DKIMOption != null) {
            this.DKIMOption = new Long(source.DKIMOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailIdentity", this.EmailIdentity);
        this.setParamSimple(map, prefix + "NewAPI", this.NewAPI);
        this.setParamSimple(map, prefix + "DKIMOption", this.DKIMOption);

    }
}

