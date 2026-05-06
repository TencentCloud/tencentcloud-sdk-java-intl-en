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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAccessControl extends AbstractModel {

    /**
    * Access mode: Whitelist|Blacklist
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * List of allowlist
    */
    @SerializedName("CidrWhiteList")
    @Expose
    private String [] CidrWhiteList;

    /**
    * blocklist
    */
    @SerializedName("CidrBlackList")
    @Expose
    private String [] CidrBlackList;

    /**
     * Get Access mode: Whitelist|Blacklist 
     * @return Mode Access mode: Whitelist|Blacklist
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Access mode: Whitelist|Blacklist
     * @param Mode Access mode: Whitelist|Blacklist
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get List of allowlist 
     * @return CidrWhiteList List of allowlist
     */
    public String [] getCidrWhiteList() {
        return this.CidrWhiteList;
    }

    /**
     * Set List of allowlist
     * @param CidrWhiteList List of allowlist
     */
    public void setCidrWhiteList(String [] CidrWhiteList) {
        this.CidrWhiteList = CidrWhiteList;
    }

    /**
     * Get blocklist 
     * @return CidrBlackList blocklist
     */
    public String [] getCidrBlackList() {
        return this.CidrBlackList;
    }

    /**
     * Set blocklist
     * @param CidrBlackList blocklist
     */
    public void setCidrBlackList(String [] CidrBlackList) {
        this.CidrBlackList = CidrBlackList;
    }

    public NetworkAccessControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAccessControl(NetworkAccessControl source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.CidrWhiteList != null) {
            this.CidrWhiteList = new String[source.CidrWhiteList.length];
            for (int i = 0; i < source.CidrWhiteList.length; i++) {
                this.CidrWhiteList[i] = new String(source.CidrWhiteList[i]);
            }
        }
        if (source.CidrBlackList != null) {
            this.CidrBlackList = new String[source.CidrBlackList.length];
            for (int i = 0; i < source.CidrBlackList.length; i++) {
                this.CidrBlackList[i] = new String(source.CidrBlackList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "CidrWhiteList.", this.CidrWhiteList);
        this.setParamArraySimple(map, prefix + "CidrBlackList.", this.CidrBlackList);

    }
}

