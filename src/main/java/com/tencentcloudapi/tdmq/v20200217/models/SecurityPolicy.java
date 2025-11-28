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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicy extends AbstractModel {

    /**
    * ip or subnet.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Route")
    @Expose
    private String Route;

    /**
    * Specifies whether the policy allows (true) or denies (false) access, corresponding to the allowlist or blocklist.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Policy")
    @Expose
    private Boolean Policy;

    /**
    * Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get ip or subnet.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Route ip or subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoute() {
        return this.Route;
    }

    /**
     * Set ip or subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Route ip or subnet.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoute(String Route) {
        this.Route = Route;
    }

    /**
     * Get Specifies whether the policy allows (true) or denies (false) access, corresponding to the allowlist or blocklist.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Policy Specifies whether the policy allows (true) or denies (false) access, corresponding to the allowlist or blocklist.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPolicy() {
        return this.Policy;
    }

    /**
     * Set Specifies whether the policy allows (true) or denies (false) access, corresponding to the allowlist or blocklist.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Policy Specifies whether the policy allows (true) or denies (false) access, corresponding to the allowlist or blocklist.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicy(Boolean Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Remarks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public SecurityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicy(SecurityPolicy source) {
        if (source.Route != null) {
            this.Route = new String(source.Route);
        }
        if (source.Policy != null) {
            this.Policy = new Boolean(source.Policy);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Route", this.Route);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

