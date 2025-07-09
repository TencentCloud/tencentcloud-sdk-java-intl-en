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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyJavaMemShellPluginSwitchRequest extends AbstractModel {

    /**
    * Host QUUID array
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * Plugin target status. 0: off; 1: on
    */
    @SerializedName("JavaShellStatus")
    @Expose
    private Long JavaShellStatus;

    /**
     * Get Host QUUID array 
     * @return Quuids Host QUUID array
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Host QUUID array
     * @param Quuids Host QUUID array
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Plugin target status. 0: off; 1: on 
     * @return JavaShellStatus Plugin target status. 0: off; 1: on
     */
    public Long getJavaShellStatus() {
        return this.JavaShellStatus;
    }

    /**
     * Set Plugin target status. 0: off; 1: on
     * @param JavaShellStatus Plugin target status. 0: off; 1: on
     */
    public void setJavaShellStatus(Long JavaShellStatus) {
        this.JavaShellStatus = JavaShellStatus;
    }

    public ModifyJavaMemShellPluginSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJavaMemShellPluginSwitchRequest(ModifyJavaMemShellPluginSwitchRequest source) {
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.JavaShellStatus != null) {
            this.JavaShellStatus = new Long(source.JavaShellStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "JavaShellStatus", this.JavaShellStatus);

    }
}

