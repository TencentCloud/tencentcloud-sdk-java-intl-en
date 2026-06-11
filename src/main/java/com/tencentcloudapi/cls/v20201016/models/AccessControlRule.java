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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlRule extends AbstractModel {

    /**
    * <p>Network segment or IP, support IPv4 or IPv6.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CidrBlocks")
    @Expose
    private String [] CidrBlocks;

    /**
    * <p>ACCEPT or DROP.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Access method: public - public network, internal - private network</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
     * Get <p>Network segment or IP, support IPv4 or IPv6.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CidrBlocks <p>Network segment or IP, support IPv4 or IPv6.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCidrBlocks() {
        return this.CidrBlocks;
    }

    /**
     * Set <p>Network segment or IP, support IPv4 or IPv6.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CidrBlocks <p>Network segment or IP, support IPv4 or IPv6.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCidrBlocks(String [] CidrBlocks) {
        this.CidrBlocks = CidrBlocks;
    }

    /**
     * Get <p>ACCEPT or DROP.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action <p>ACCEPT or DROP.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>ACCEPT or DROP.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action <p>ACCEPT or DROP.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Access method: public - public network, internal - private network</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessMode <p>Access method: public - public network, internal - private network</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Access method: public - public network, internal - private network</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessMode <p>Access method: public - public network, internal - private network</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    public AccessControlRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlRule(AccessControlRule source) {
        if (source.CidrBlocks != null) {
            this.CidrBlocks = new String[source.CidrBlocks.length];
            for (int i = 0; i < source.CidrBlocks.length; i++) {
                this.CidrBlocks[i] = new String(source.CidrBlocks[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CidrBlocks.", this.CidrBlocks);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);

    }
}

