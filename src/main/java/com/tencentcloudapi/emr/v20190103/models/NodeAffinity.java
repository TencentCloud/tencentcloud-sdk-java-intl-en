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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeAffinity extends AbstractModel {

    /**
    * Node affinity - forced scheduling settings.
    */
    @SerializedName("RequiredDuringSchedulingIgnoredDuringExecution")
    @Expose
    private NodeSelector RequiredDuringSchedulingIgnoredDuringExecution;

    /**
    * Node affinity - tolerance scheduling.
    */
    @SerializedName("PreferredDuringSchedulingIgnoredDuringExecution")
    @Expose
    private PreferredSchedulingTerm [] PreferredDuringSchedulingIgnoredDuringExecution;

    /**
     * Get Node affinity - forced scheduling settings. 
     * @return RequiredDuringSchedulingIgnoredDuringExecution Node affinity - forced scheduling settings.
     */
    public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.RequiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Set Node affinity - forced scheduling settings.
     * @param RequiredDuringSchedulingIgnoredDuringExecution Node affinity - forced scheduling settings.
     */
    public void setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector RequiredDuringSchedulingIgnoredDuringExecution) {
        this.RequiredDuringSchedulingIgnoredDuringExecution = RequiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Get Node affinity - tolerance scheduling. 
     * @return PreferredDuringSchedulingIgnoredDuringExecution Node affinity - tolerance scheduling.
     */
    public PreferredSchedulingTerm [] getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.PreferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Set Node affinity - tolerance scheduling.
     * @param PreferredDuringSchedulingIgnoredDuringExecution Node affinity - tolerance scheduling.
     */
    public void setPreferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm [] PreferredDuringSchedulingIgnoredDuringExecution) {
        this.PreferredDuringSchedulingIgnoredDuringExecution = PreferredDuringSchedulingIgnoredDuringExecution;
    }

    public NodeAffinity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeAffinity(NodeAffinity source) {
        if (source.RequiredDuringSchedulingIgnoredDuringExecution != null) {
            this.RequiredDuringSchedulingIgnoredDuringExecution = new NodeSelector(source.RequiredDuringSchedulingIgnoredDuringExecution);
        }
        if (source.PreferredDuringSchedulingIgnoredDuringExecution != null) {
            this.PreferredDuringSchedulingIgnoredDuringExecution = new PreferredSchedulingTerm[source.PreferredDuringSchedulingIgnoredDuringExecution.length];
            for (int i = 0; i < source.PreferredDuringSchedulingIgnoredDuringExecution.length; i++) {
                this.PreferredDuringSchedulingIgnoredDuringExecution[i] = new PreferredSchedulingTerm(source.PreferredDuringSchedulingIgnoredDuringExecution[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RequiredDuringSchedulingIgnoredDuringExecution.", this.RequiredDuringSchedulingIgnoredDuringExecution);
        this.setParamArrayObj(map, prefix + "PreferredDuringSchedulingIgnoredDuringExecution.", this.PreferredDuringSchedulingIgnoredDuringExecution);

    }
}

