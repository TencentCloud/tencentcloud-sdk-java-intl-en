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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CredentialEffectScope extends AbstractModel {

    /**
    * Whether to exclude the mode
Enumeration values:
0: Inclusion mode (only takes effect on the Real Server in Instances). At this point, Instances is required.
1: Exclusion mode (Machines in Instances do not take effect, remaining machines take effect). At this point, Instances is selectable (Empty list means all machines take effect).
    */
    @SerializedName("Exclude")
    @Expose
    private Long Exclude;

    /**
    * Machine instance ID list. Required when Exclude is 0, means only these machines can access the credential; Option when Exclude is 1, means these machines cannot access the credential (Empty list means all machines take effect).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Instances")
    @Expose
    private String [] Instances;

    /**
     * Get Whether to exclude the mode
Enumeration values:
0: Inclusion mode (only takes effect on the Real Server in Instances). At this point, Instances is required.
1: Exclusion mode (Machines in Instances do not take effect, remaining machines take effect). At this point, Instances is selectable (Empty list means all machines take effect). 
     * @return Exclude Whether to exclude the mode
Enumeration values:
0: Inclusion mode (only takes effect on the Real Server in Instances). At this point, Instances is required.
1: Exclusion mode (Machines in Instances do not take effect, remaining machines take effect). At this point, Instances is selectable (Empty list means all machines take effect).
     */
    public Long getExclude() {
        return this.Exclude;
    }

    /**
     * Set Whether to exclude the mode
Enumeration values:
0: Inclusion mode (only takes effect on the Real Server in Instances). At this point, Instances is required.
1: Exclusion mode (Machines in Instances do not take effect, remaining machines take effect). At this point, Instances is selectable (Empty list means all machines take effect).
     * @param Exclude Whether to exclude the mode
Enumeration values:
0: Inclusion mode (only takes effect on the Real Server in Instances). At this point, Instances is required.
1: Exclusion mode (Machines in Instances do not take effect, remaining machines take effect). At this point, Instances is selectable (Empty list means all machines take effect).
     */
    public void setExclude(Long Exclude) {
        this.Exclude = Exclude;
    }

    /**
     * Get Machine instance ID list. Required when Exclude is 0, means only these machines can access the credential; Option when Exclude is 1, means these machines cannot access the credential (Empty list means all machines take effect).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Instances Machine instance ID list. Required when Exclude is 0, means only these machines can access the credential; Option when Exclude is 1, means these machines cannot access the credential (Empty list means all machines take effect).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getInstances() {
        return this.Instances;
    }

    /**
     * Set Machine instance ID list. Required when Exclude is 0, means only these machines can access the credential; Option when Exclude is 1, means these machines cannot access the credential (Empty list means all machines take effect).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Instances Machine instance ID list. Required when Exclude is 0, means only these machines can access the credential; Option when Exclude is 1, means these machines cannot access the credential (Empty list means all machines take effect).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstances(String [] Instances) {
        this.Instances = Instances;
    }

    public CredentialEffectScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CredentialEffectScope(CredentialEffectScope source) {
        if (source.Exclude != null) {
            this.Exclude = new Long(source.Exclude);
        }
        if (source.Instances != null) {
            this.Instances = new String[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new String(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Exclude", this.Exclude);
        this.setParamArraySimple(map, prefix + "Instances.", this.Instances);

    }
}

