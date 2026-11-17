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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetailItem extends AbstractModel {

    /**
    * <p>Risk item type.</p><p>Valid values:</p><ul><li>IpLocationMismatch: The country/region of the reported coordinates is inconsistent with the country/region of the IP address.</li><li>AbnormalLocationChange: The same person has physically impossible displacement within a short period of time.</li><li>BlacklistHit: A customer-created face blocklist is matched.</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Risk item type.</p><p>Valid values:</p><ul><li>IpLocationMismatch: The country/region of the reported coordinates is inconsistent with the country/region of the IP address.</li><li>AbnormalLocationChange: The same person has physically impossible displacement within a short period of time.</li><li>BlacklistHit: A customer-created face blocklist is matched.</li></ul> 
     * @return Type <p>Risk item type.</p><p>Valid values:</p><ul><li>IpLocationMismatch: The country/region of the reported coordinates is inconsistent with the country/region of the IP address.</li><li>AbnormalLocationChange: The same person has physically impossible displacement within a short period of time.</li><li>BlacklistHit: A customer-created face blocklist is matched.</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Risk item type.</p><p>Valid values:</p><ul><li>IpLocationMismatch: The country/region of the reported coordinates is inconsistent with the country/region of the IP address.</li><li>AbnormalLocationChange: The same person has physically impossible displacement within a short period of time.</li><li>BlacklistHit: A customer-created face blocklist is matched.</li></ul>
     * @param Type <p>Risk item type.</p><p>Valid values:</p><ul><li>IpLocationMismatch: The country/region of the reported coordinates is inconsistent with the country/region of the IP address.</li><li>AbnormalLocationChange: The same person has physically impossible displacement within a short period of time.</li><li>BlacklistHit: A customer-created face blocklist is matched.</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public RiskDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDetailItem(RiskDetailItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

