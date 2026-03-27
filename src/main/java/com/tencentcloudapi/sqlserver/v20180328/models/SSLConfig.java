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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSLConfig extends AbstractModel {

    /**
    * SSL Encryption Status
enable - Enabled
disable - Disabled
enable_doing - Enabling
disable_doing - Disabling
renew_doing - Updating
wait_doing - Waiting to be executed during maintenance window
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * SSL Certificates Validity Period, Time Format YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("SSLValidityPeriod")
    @Expose
    private String SSLValidityPeriod;

    /**
    * SSL Certificates Validity: 0 - Invalid, 1 - Valid
    */
    @SerializedName("SSLValidity")
    @Expose
    private Long SSLValidity;

    /**
     * Get SSL Encryption Status
enable - Enabled
disable - Disabled
enable_doing - Enabling
disable_doing - Disabling
renew_doing - Updating
wait_doing - Waiting to be executed during maintenance window 
     * @return Encryption SSL Encryption Status
enable - Enabled
disable - Disabled
enable_doing - Enabling
disable_doing - Disabling
renew_doing - Updating
wait_doing - Waiting to be executed during maintenance window
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set SSL Encryption Status
enable - Enabled
disable - Disabled
enable_doing - Enabling
disable_doing - Disabling
renew_doing - Updating
wait_doing - Waiting to be executed during maintenance window
     * @param Encryption SSL Encryption Status
enable - Enabled
disable - Disabled
enable_doing - Enabling
disable_doing - Disabling
renew_doing - Updating
wait_doing - Waiting to be executed during maintenance window
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get SSL Certificates Validity Period, Time Format YYYY-MM-DD HH:MM:SS 
     * @return SSLValidityPeriod SSL Certificates Validity Period, Time Format YYYY-MM-DD HH:MM:SS
     */
    public String getSSLValidityPeriod() {
        return this.SSLValidityPeriod;
    }

    /**
     * Set SSL Certificates Validity Period, Time Format YYYY-MM-DD HH:MM:SS
     * @param SSLValidityPeriod SSL Certificates Validity Period, Time Format YYYY-MM-DD HH:MM:SS
     */
    public void setSSLValidityPeriod(String SSLValidityPeriod) {
        this.SSLValidityPeriod = SSLValidityPeriod;
    }

    /**
     * Get SSL Certificates Validity: 0 - Invalid, 1 - Valid 
     * @return SSLValidity SSL Certificates Validity: 0 - Invalid, 1 - Valid
     */
    public Long getSSLValidity() {
        return this.SSLValidity;
    }

    /**
     * Set SSL Certificates Validity: 0 - Invalid, 1 - Valid
     * @param SSLValidity SSL Certificates Validity: 0 - Invalid, 1 - Valid
     */
    public void setSSLValidity(Long SSLValidity) {
        this.SSLValidity = SSLValidity;
    }

    public SSLConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSLConfig(SSLConfig source) {
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.SSLValidityPeriod != null) {
            this.SSLValidityPeriod = new String(source.SSLValidityPeriod);
        }
        if (source.SSLValidity != null) {
            this.SSLValidity = new Long(source.SSLValidity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "SSLValidityPeriod", this.SSLValidityPeriod);
        this.setParamSimple(map, prefix + "SSLValidity", this.SSLValidity);

    }
}

