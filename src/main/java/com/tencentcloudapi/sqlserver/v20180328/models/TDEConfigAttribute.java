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

public class TDEConfigAttribute extends AbstractModel {

    /**
    * TDE status. Valid values: `enable` (enabled), `disable` (disabled).
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * Certificate ownership. Valid values: `self` (certificate of the this account), `others` (certificate of the other account), `none` (no certificate).
    */
    @SerializedName("CertificateAttribution")
    @Expose
    private String CertificateAttribution;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QuoteUin")
    @Expose
    private String QuoteUin;

    /**
     * Get TDE status. Valid values: `enable` (enabled), `disable` (disabled). 
     * @return Encryption TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     * @param Encryption TDE status. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get Certificate ownership. Valid values: `self` (certificate of the this account), `others` (certificate of the other account), `none` (no certificate). 
     * @return CertificateAttribution Certificate ownership. Valid values: `self` (certificate of the this account), `others` (certificate of the other account), `none` (no certificate).
     */
    public String getCertificateAttribution() {
        return this.CertificateAttribution;
    }

    /**
     * Set Certificate ownership. Valid values: `self` (certificate of the this account), `others` (certificate of the other account), `none` (no certificate).
     * @param CertificateAttribution Certificate ownership. Valid values: `self` (certificate of the this account), `others` (certificate of the other account), `none` (no certificate).
     */
    public void setCertificateAttribution(String CertificateAttribution) {
        this.CertificateAttribution = CertificateAttribution;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QuoteUin Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuoteUin() {
        return this.QuoteUin;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param QuoteUin Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuoteUin(String QuoteUin) {
        this.QuoteUin = QuoteUin;
    }

    public TDEConfigAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDEConfigAttribute(TDEConfigAttribute source) {
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.CertificateAttribution != null) {
            this.CertificateAttribution = new String(source.CertificateAttribution);
        }
        if (source.QuoteUin != null) {
            this.QuoteUin = new String(source.QuoteUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "CertificateAttribution", this.CertificateAttribution);
        this.setParamSimple(map, prefix + "QuoteUin", this.QuoteUin);

    }
}

