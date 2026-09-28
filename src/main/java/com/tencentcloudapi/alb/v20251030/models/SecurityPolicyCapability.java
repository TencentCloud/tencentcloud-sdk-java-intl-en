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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyCapability extends AbstractModel {

    /**
    * List of supported cipher suites.
    */
    @SerializedName("Ciphers")
    @Expose
    private String [] Ciphers;

    /**
    * Supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
    */
    @SerializedName("TLSVersion")
    @Expose
    private String TLSVersion;

    /**
     * Get List of supported cipher suites. 
     * @return Ciphers List of supported cipher suites.
     */
    public String [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set List of supported cipher suites.
     * @param Ciphers List of supported cipher suites.
     */
    public void setCiphers(String [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get Supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3. 
     * @return TLSVersion Supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
     */
    public String getTLSVersion() {
        return this.TLSVersion;
    }

    /**
     * Set Supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
     * @param TLSVersion Supported TLS protocol versions. Optional values include: TLSv1.0, TLSv1.1, TLSv1.2, TLSv1.3.
     */
    public void setTLSVersion(String TLSVersion) {
        this.TLSVersion = TLSVersion;
    }

    public SecurityPolicyCapability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyCapability(SecurityPolicyCapability source) {
        if (source.Ciphers != null) {
            this.Ciphers = new String[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new String(source.Ciphers[i]);
            }
        }
        if (source.TLSVersion != null) {
            this.TLSVersion = new String(source.TLSVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "TLSVersion", this.TLSVersion);

    }
}

