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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppStatusInfo extends AbstractModel {

    /**
    * <p>Application status</p><p>Enumeration values:</p><ul><li>1: not launched</li><li>2: running</li><li>3: disabled</li><li>4: importing</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Status description.</p>
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
     * Get <p>Application status</p><p>Enumeration values:</p><ul><li>1: not launched</li><li>2: running</li><li>3: disabled</li><li>4: importing</li></ul> 
     * @return Status <p>Application status</p><p>Enumeration values:</p><ul><li>1: not launched</li><li>2: running</li><li>3: disabled</li><li>4: importing</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Application status</p><p>Enumeration values:</p><ul><li>1: not launched</li><li>2: running</li><li>3: disabled</li><li>4: importing</li></ul>
     * @param Status <p>Application status</p><p>Enumeration values:</p><ul><li>1: not launched</li><li>2: running</li><li>3: disabled</li><li>4: importing</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status description.</p> 
     * @return StatusDescription <p>Status description.</p>
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set <p>Status description.</p>
     * @param StatusDescription <p>Status description.</p>
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    public AppStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppStatusInfo(AppStatusInfo source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDescription != null) {
            this.StatusDescription = new String(source.StatusDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDescription", this.StatusDescription);

    }
}

