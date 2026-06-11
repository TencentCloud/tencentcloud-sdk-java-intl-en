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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRaspRulesRequest extends AbstractModel {

    /**
    * Rule ID. (Leave it blank during addition, and specify it during editing.)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Vulnerability ID array.
    */
    @SerializedName("VulVulsIDs")
    @Expose
    private Long [] VulVulsIDs;

    /**
    * Base64-encoded regular expression for allowlisting requests within a custom request scope. It cannot be left blank unless all requests are to be allowlisted.
    */
    @SerializedName("URLRegexp")
    @Expose
    private String URLRegexp;

    /**
    * Allowlisting method. 0: allowlist requests within a custom request scope; 1: allowlist all requests.
    */
    @SerializedName("WhiteType")
    @Expose
    private Long WhiteType;

    /**
     * Get Rule ID. (Leave it blank during addition, and specify it during editing.) 
     * @return Id Rule ID. (Leave it blank during addition, and specify it during editing.)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID. (Leave it blank during addition, and specify it during editing.)
     * @param Id Rule ID. (Leave it blank during addition, and specify it during editing.)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Vulnerability ID array. 
     * @return VulVulsIDs Vulnerability ID array.
     */
    public Long [] getVulVulsIDs() {
        return this.VulVulsIDs;
    }

    /**
     * Set Vulnerability ID array.
     * @param VulVulsIDs Vulnerability ID array.
     */
    public void setVulVulsIDs(Long [] VulVulsIDs) {
        this.VulVulsIDs = VulVulsIDs;
    }

    /**
     * Get Base64-encoded regular expression for allowlisting requests within a custom request scope. It cannot be left blank unless all requests are to be allowlisted. 
     * @return URLRegexp Base64-encoded regular expression for allowlisting requests within a custom request scope. It cannot be left blank unless all requests are to be allowlisted.
     */
    public String getURLRegexp() {
        return this.URLRegexp;
    }

    /**
     * Set Base64-encoded regular expression for allowlisting requests within a custom request scope. It cannot be left blank unless all requests are to be allowlisted.
     * @param URLRegexp Base64-encoded regular expression for allowlisting requests within a custom request scope. It cannot be left blank unless all requests are to be allowlisted.
     */
    public void setURLRegexp(String URLRegexp) {
        this.URLRegexp = URLRegexp;
    }

    /**
     * Get Allowlisting method. 0: allowlist requests within a custom request scope; 1: allowlist all requests. 
     * @return WhiteType Allowlisting method. 0: allowlist requests within a custom request scope; 1: allowlist all requests.
     */
    public Long getWhiteType() {
        return this.WhiteType;
    }

    /**
     * Set Allowlisting method. 0: allowlist requests within a custom request scope; 1: allowlist all requests.
     * @param WhiteType Allowlisting method. 0: allowlist requests within a custom request scope; 1: allowlist all requests.
     */
    public void setWhiteType(Long WhiteType) {
        this.WhiteType = WhiteType;
    }

    public ModifyRaspRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRaspRulesRequest(ModifyRaspRulesRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.VulVulsIDs != null) {
            this.VulVulsIDs = new Long[source.VulVulsIDs.length];
            for (int i = 0; i < source.VulVulsIDs.length; i++) {
                this.VulVulsIDs[i] = new Long(source.VulVulsIDs[i]);
            }
        }
        if (source.URLRegexp != null) {
            this.URLRegexp = new String(source.URLRegexp);
        }
        if (source.WhiteType != null) {
            this.WhiteType = new Long(source.WhiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "VulVulsIDs.", this.VulVulsIDs);
        this.setParamSimple(map, prefix + "URLRegexp", this.URLRegexp);
        this.setParamSimple(map, prefix + "WhiteType", this.WhiteType);

    }
}

