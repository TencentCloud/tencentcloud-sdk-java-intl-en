/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveCertDomainInfo extends AbstractModel{

    /**
    * The domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to enable HTTPS for the domain.
1: Enable
0: Disable
-1: Keep the current configuration
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get The domain name. 
     * @return DomainName The domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The domain name.
     * @param DomainName The domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether to enable HTTPS for the domain.
1: Enable
0: Disable
-1: Keep the current configuration 
     * @return Status Whether to enable HTTPS for the domain.
1: Enable
0: Disable
-1: Keep the current configuration
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to enable HTTPS for the domain.
1: Enable
0: Disable
-1: Keep the current configuration
     * @param Status Whether to enable HTTPS for the domain.
1: Enable
0: Disable
-1: Keep the current configuration
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public LiveCertDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveCertDomainInfo(LiveCertDomainInfo source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

