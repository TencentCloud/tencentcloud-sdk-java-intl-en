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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceRestriction extends AbstractModel {

    /**
    * <p>The causes for access restriction.</p><p>Enumeration values:</p><ul><li>ICP_RECORD_REQUIRED: unlicensed (no ICP filing);</li><li>GOVERNMENT_ORDER: government directive.</li></ul>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>Restrict access to specific country/region codes using the "ISO 3166 country/region code standard".</p><p>Parameter format: view link: https://www.iso.org/iso-3166-country-codes.html.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get <p>The causes for access restriction.</p><p>Enumeration values:</p><ul><li>ICP_RECORD_REQUIRED: unlicensed (no ICP filing);</li><li>GOVERNMENT_ORDER: government directive.</li></ul> 
     * @return Reason <p>The causes for access restriction.</p><p>Enumeration values:</p><ul><li>ICP_RECORD_REQUIRED: unlicensed (no ICP filing);</li><li>GOVERNMENT_ORDER: government directive.</li></ul>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>The causes for access restriction.</p><p>Enumeration values:</p><ul><li>ICP_RECORD_REQUIRED: unlicensed (no ICP filing);</li><li>GOVERNMENT_ORDER: government directive.</li></ul>
     * @param Reason <p>The causes for access restriction.</p><p>Enumeration values:</p><ul><li>ICP_RECORD_REQUIRED: unlicensed (no ICP filing);</li><li>GOVERNMENT_ORDER: government directive.</li></ul>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>Restrict access to specific country/region codes using the "ISO 3166 country/region code standard".</p><p>Parameter format: view link: https://www.iso.org/iso-3166-country-codes.html.</p> 
     * @return Region <p>Restrict access to specific country/region codes using the "ISO 3166 country/region code standard".</p><p>Parameter format: view link: https://www.iso.org/iso-3166-country-codes.html.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Restrict access to specific country/region codes using the "ISO 3166 country/region code standard".</p><p>Parameter format: view link: https://www.iso.org/iso-3166-country-codes.html.</p>
     * @param Region <p>Restrict access to specific country/region codes using the "ISO 3166 country/region code standard".</p><p>Parameter format: view link: https://www.iso.org/iso-3166-country-codes.html.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ComplianceRestriction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceRestriction(ComplianceRestriction source) {
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

