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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManuallyAdded extends AbstractModel {

    /**
    * Number of nodes being added
    */
    @SerializedName("Joining")
    @Expose
    private Long Joining;

    /**
    * Number of nodes being initialized
    */
    @SerializedName("Initializing")
    @Expose
    private Long Initializing;

    /**
    * Number of normal nodes
    */
    @SerializedName("Normal")
    @Expose
    private Long Normal;

    /**
    * Total number of nodes
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get Number of nodes being added 
     * @return Joining Number of nodes being added
     */
    public Long getJoining() {
        return this.Joining;
    }

    /**
     * Set Number of nodes being added
     * @param Joining Number of nodes being added
     */
    public void setJoining(Long Joining) {
        this.Joining = Joining;
    }

    /**
     * Get Number of nodes being initialized 
     * @return Initializing Number of nodes being initialized
     */
    public Long getInitializing() {
        return this.Initializing;
    }

    /**
     * Set Number of nodes being initialized
     * @param Initializing Number of nodes being initialized
     */
    public void setInitializing(Long Initializing) {
        this.Initializing = Initializing;
    }

    /**
     * Get Number of normal nodes 
     * @return Normal Number of normal nodes
     */
    public Long getNormal() {
        return this.Normal;
    }

    /**
     * Set Number of normal nodes
     * @param Normal Number of normal nodes
     */
    public void setNormal(Long Normal) {
        this.Normal = Normal;
    }

    /**
     * Get Total number of nodes 
     * @return Total Total number of nodes
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of nodes
     * @param Total Total number of nodes
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public ManuallyAdded() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManuallyAdded(ManuallyAdded source) {
        if (source.Joining != null) {
            this.Joining = new Long(source.Joining);
        }
        if (source.Initializing != null) {
            this.Initializing = new Long(source.Initializing);
        }
        if (source.Normal != null) {
            this.Normal = new Long(source.Normal);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Joining", this.Joining);
        this.setParamSimple(map, prefix + "Initializing", this.Initializing);
        this.setParamSimple(map, prefix + "Normal", this.Normal);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

