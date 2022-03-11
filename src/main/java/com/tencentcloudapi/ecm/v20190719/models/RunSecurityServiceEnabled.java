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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunSecurityServiceEnabled extends AbstractModel{

    /**
    * Whether to enable.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * CWP edition. Valid values: 0: Basic Edition; 1: Pro Edition. Currently, only Basic Edition is supported
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
     * Get Whether to enable. 
     * @return Enabled Whether to enable.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable.
     * @param Enabled Whether to enable.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get CWP edition. Valid values: 0: Basic Edition; 1: Pro Edition. Currently, only Basic Edition is supported 
     * @return Version CWP edition. Valid values: 0: Basic Edition; 1: Pro Edition. Currently, only Basic Edition is supported
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set CWP edition. Valid values: 0: Basic Edition; 1: Pro Edition. Currently, only Basic Edition is supported
     * @param Version CWP edition. Valid values: 0: Basic Edition; 1: Pro Edition. Currently, only Basic Edition is supported
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    public RunSecurityServiceEnabled() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunSecurityServiceEnabled(RunSecurityServiceEnabled source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

