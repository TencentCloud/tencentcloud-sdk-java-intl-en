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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGAppSecretResp extends AbstractModel {

    /**
    * <p>Mini game secret key status. Valid values: 0: Not generated; 1: Active; 2: Frozen.</p>
    */
    @SerializedName("SecretStatus")
    @Expose
    private Long SecretStatus;

    /**
    * <p>Public service URL that developers need to access when integrating login, payment, and subscription message features.</p>
    */
    @SerializedName("OpenServerURL")
    @Expose
    private String OpenServerURL;

    /**
     * Get <p>Mini game secret key status. Valid values: 0: Not generated; 1: Active; 2: Frozen.</p> 
     * @return SecretStatus <p>Mini game secret key status. Valid values: 0: Not generated; 1: Active; 2: Frozen.</p>
     */
    public Long getSecretStatus() {
        return this.SecretStatus;
    }

    /**
     * Set <p>Mini game secret key status. Valid values: 0: Not generated; 1: Active; 2: Frozen.</p>
     * @param SecretStatus <p>Mini game secret key status. Valid values: 0: Not generated; 1: Active; 2: Frozen.</p>
     */
    public void setSecretStatus(Long SecretStatus) {
        this.SecretStatus = SecretStatus;
    }

    /**
     * Get <p>Public service URL that developers need to access when integrating login, payment, and subscription message features.</p> 
     * @return OpenServerURL <p>Public service URL that developers need to access when integrating login, payment, and subscription message features.</p>
     */
    public String getOpenServerURL() {
        return this.OpenServerURL;
    }

    /**
     * Set <p>Public service URL that developers need to access when integrating login, payment, and subscription message features.</p>
     * @param OpenServerURL <p>Public service URL that developers need to access when integrating login, payment, and subscription message features.</p>
     */
    public void setOpenServerURL(String OpenServerURL) {
        this.OpenServerURL = OpenServerURL;
    }

    public DescribeMNGAppSecretResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGAppSecretResp(DescribeMNGAppSecretResp source) {
        if (source.SecretStatus != null) {
            this.SecretStatus = new Long(source.SecretStatus);
        }
        if (source.OpenServerURL != null) {
            this.OpenServerURL = new String(source.OpenServerURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretStatus", this.SecretStatus);
        this.setParamSimple(map, prefix + "OpenServerURL", this.OpenServerURL);

    }
}

