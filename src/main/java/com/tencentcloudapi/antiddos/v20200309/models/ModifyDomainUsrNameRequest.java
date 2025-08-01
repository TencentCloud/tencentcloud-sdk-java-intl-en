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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainUsrNameRequest extends AbstractModel {

    /**
    * User CNAME
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Domain name
    */
    @SerializedName("DomainUserName")
    @Expose
    private String DomainUserName;

    /**
     * Get User CNAME 
     * @return DomainName User CNAME
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set User CNAME
     * @param DomainName User CNAME
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Domain name 
     * @return DomainUserName Domain name
     */
    public String getDomainUserName() {
        return this.DomainUserName;
    }

    /**
     * Set Domain name
     * @param DomainUserName Domain name
     */
    public void setDomainUserName(String DomainUserName) {
        this.DomainUserName = DomainUserName;
    }

    public ModifyDomainUsrNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainUsrNameRequest(ModifyDomainUsrNameRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DomainUserName != null) {
            this.DomainUserName = new String(source.DomainUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainUserName", this.DomainUserName);

    }
}

