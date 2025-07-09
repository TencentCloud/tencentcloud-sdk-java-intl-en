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
    * Type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Public URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicUrl")
    @Expose
    private String PublicUrl;

    /**
    * Private URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateUrl")
    @Expose
    private String PrivateUrl;

    /**
    * Public network access
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * Private network access
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * Version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get Type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Public URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicUrl Public URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicUrl() {
        return this.PublicUrl;
    }

    /**
     * Set Public URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicUrl Public URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicUrl(String PublicUrl) {
        this.PublicUrl = PublicUrl;
    }

    /**
     * Get Private URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateUrl Private URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateUrl() {
        return this.PrivateUrl;
    }

    /**
     * Set Private URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateUrl Private URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateUrl(String PrivateUrl) {
        this.PrivateUrl = PrivateUrl;
    }

    /**
     * Get Public network access
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicAccess Public network access
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set Public network access
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicAccess Public network access
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get Private network access
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateAccess Private network access
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Private network access
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateAccess Private network access
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get Version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
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

    }
}

