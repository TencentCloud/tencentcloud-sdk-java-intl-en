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
    * 
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * 
    */
    @SerializedName("SSLValidityPeriod")
    @Expose
    private String SSLValidityPeriod;

    /**
    * 
    */
    @SerializedName("SSLValidity")
    @Expose
    private Long SSLValidity;

    /**
     * Get  
     * @return Encryption 
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 
     * @param Encryption 
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get  
     * @return SSLValidityPeriod 
     */
    public String getSSLValidityPeriod() {
        return this.SSLValidityPeriod;
    }

    /**
     * Set 
     * @param SSLValidityPeriod 
     */
    public void setSSLValidityPeriod(String SSLValidityPeriod) {
        this.SSLValidityPeriod = SSLValidityPeriod;
    }

    /**
     * Get  
     * @return SSLValidity 
     */
    public Long getSSLValidity() {
        return this.SSLValidity;
    }

    /**
     * Set 
     * @param SSLValidity 
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

