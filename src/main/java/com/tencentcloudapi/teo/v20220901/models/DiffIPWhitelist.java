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
    * The latest intermediate IPs.
    */
    @SerializedName("LatestIPWhitelist")
    @Expose
    private IPWhitelist LatestIPWhitelist;

    /**
    * The intermediate IPs added to the existing list.
    */
    @SerializedName("AddedIPWhitelist")
    @Expose
    private IPWhitelist AddedIPWhitelist;

    /**
    * The intermediate IPs removed from the existing list.
    */
    @SerializedName("RemovedIPWhitelist")
    @Expose
    private IPWhitelist RemovedIPWhitelist;

    /**
    * The intermediate IPs that remain unchanged.
    */
    @SerializedName("NoChangeIPWhitelist")
    @Expose
    private IPWhitelist NoChangeIPWhitelist;

    /**
     * Get The latest intermediate IPs. 
     * @return LatestIPWhitelist The latest intermediate IPs.
     */
    public IPWhitelist getLatestIPWhitelist() {
        return this.LatestIPWhitelist;
    }

    /**
     * Set The latest intermediate IPs.
     * @param LatestIPWhitelist The latest intermediate IPs.
     */
    public void setLatestIPWhitelist(IPWhitelist LatestIPWhitelist) {
        this.LatestIPWhitelist = LatestIPWhitelist;
    }

    /**
     * Get The intermediate IPs added to the existing list. 
     * @return AddedIPWhitelist The intermediate IPs added to the existing list.
     */
    public IPWhitelist getAddedIPWhitelist() {
        return this.AddedIPWhitelist;
    }

    /**
     * Set The intermediate IPs added to the existing list.
     * @param AddedIPWhitelist The intermediate IPs added to the existing list.
     */
    public void setAddedIPWhitelist(IPWhitelist AddedIPWhitelist) {
        this.AddedIPWhitelist = AddedIPWhitelist;
    }

    /**
     * Get The intermediate IPs removed from the existing list. 
     * @return RemovedIPWhitelist The intermediate IPs removed from the existing list.
     */
    public IPWhitelist getRemovedIPWhitelist() {
        return this.RemovedIPWhitelist;
    }

    /**
     * Set The intermediate IPs removed from the existing list.
     * @param RemovedIPWhitelist The intermediate IPs removed from the existing list.
     */
    public void setRemovedIPWhitelist(IPWhitelist RemovedIPWhitelist) {
        this.RemovedIPWhitelist = RemovedIPWhitelist;
    }

    /**
     * Get The intermediate IPs that remain unchanged. 
     * @return NoChangeIPWhitelist The intermediate IPs that remain unchanged.
     */
    public IPWhitelist getNoChangeIPWhitelist() {
        return this.NoChangeIPWhitelist;
    }

    /**
     * Set The intermediate IPs that remain unchanged.
     * @param NoChangeIPWhitelist The intermediate IPs that remain unchanged.
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

