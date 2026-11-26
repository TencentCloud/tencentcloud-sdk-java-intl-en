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

public class DiffIPWhitelist extends AbstractModel {

    /**
    * Latest IP whitelist list.
    */
    @SerializedName("LatestIPWhitelist")
    @Expose
    private IPWhitelist LatestIPWhitelist;

    /**
    * Newly added part of the latest IP whitelist list compared with the current IP whitelist list.
    */
    @SerializedName("AddedIPWhitelist")
    @Expose
    private IPWhitelist AddedIPWhitelist;

    /**
    * The latest IP whitelist list has partially deleted entries compared with the current IP whitelist list.
    */
    @SerializedName("RemovedIPWhitelist")
    @Expose
    private IPWhitelist RemovedIPWhitelist;

    /**
    * Unchanged part of the latest IP allowlist compared with the current IP allowlist.
    */
    @SerializedName("NoChangeIPWhitelist")
    @Expose
    private IPWhitelist NoChangeIPWhitelist;

    /**
     * Get Latest IP whitelist list. 
     * @return LatestIPWhitelist Latest IP whitelist list.
     */
    public IPWhitelist getLatestIPWhitelist() {
        return this.LatestIPWhitelist;
    }

    /**
     * Set Latest IP whitelist list.
     * @param LatestIPWhitelist Latest IP whitelist list.
     */
    public void setLatestIPWhitelist(IPWhitelist LatestIPWhitelist) {
        this.LatestIPWhitelist = LatestIPWhitelist;
    }

    /**
     * Get Newly added part of the latest IP whitelist list compared with the current IP whitelist list. 
     * @return AddedIPWhitelist Newly added part of the latest IP whitelist list compared with the current IP whitelist list.
     */
    public IPWhitelist getAddedIPWhitelist() {
        return this.AddedIPWhitelist;
    }

    /**
     * Set Newly added part of the latest IP whitelist list compared with the current IP whitelist list.
     * @param AddedIPWhitelist Newly added part of the latest IP whitelist list compared with the current IP whitelist list.
     */
    public void setAddedIPWhitelist(IPWhitelist AddedIPWhitelist) {
        this.AddedIPWhitelist = AddedIPWhitelist;
    }

    /**
     * Get The latest IP whitelist list has partially deleted entries compared with the current IP whitelist list. 
     * @return RemovedIPWhitelist The latest IP whitelist list has partially deleted entries compared with the current IP whitelist list.
     */
    public IPWhitelist getRemovedIPWhitelist() {
        return this.RemovedIPWhitelist;
    }

    /**
     * Set The latest IP whitelist list has partially deleted entries compared with the current IP whitelist list.
     * @param RemovedIPWhitelist The latest IP whitelist list has partially deleted entries compared with the current IP whitelist list.
     */
    public void setRemovedIPWhitelist(IPWhitelist RemovedIPWhitelist) {
        this.RemovedIPWhitelist = RemovedIPWhitelist;
    }

    /**
     * Get Unchanged part of the latest IP allowlist compared with the current IP allowlist. 
     * @return NoChangeIPWhitelist Unchanged part of the latest IP allowlist compared with the current IP allowlist.
     */
    public IPWhitelist getNoChangeIPWhitelist() {
        return this.NoChangeIPWhitelist;
    }

    /**
     * Set Unchanged part of the latest IP allowlist compared with the current IP allowlist.
     * @param NoChangeIPWhitelist Unchanged part of the latest IP allowlist compared with the current IP allowlist.
     */
    public void setNoChangeIPWhitelist(IPWhitelist NoChangeIPWhitelist) {
        this.NoChangeIPWhitelist = NoChangeIPWhitelist;
    }

    public DiffIPWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffIPWhitelist(DiffIPWhitelist source) {
        if (source.LatestIPWhitelist != null) {
            this.LatestIPWhitelist = new IPWhitelist(source.LatestIPWhitelist);
        }
        if (source.AddedIPWhitelist != null) {
            this.AddedIPWhitelist = new IPWhitelist(source.AddedIPWhitelist);
        }
        if (source.RemovedIPWhitelist != null) {
            this.RemovedIPWhitelist = new IPWhitelist(source.RemovedIPWhitelist);
        }
        if (source.NoChangeIPWhitelist != null) {
            this.NoChangeIPWhitelist = new IPWhitelist(source.NoChangeIPWhitelist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LatestIPWhitelist.", this.LatestIPWhitelist);
        this.setParamObj(map, prefix + "AddedIPWhitelist.", this.AddedIPWhitelist);
        this.setParamObj(map, prefix + "RemovedIPWhitelist.", this.RemovedIPWhitelist);
        this.setParamObj(map, prefix + "NoChangeIPWhitelist.", this.NoChangeIPWhitelist);

    }
}

