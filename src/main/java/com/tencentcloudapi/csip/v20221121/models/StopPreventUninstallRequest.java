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

public class StopPreventUninstallRequest extends AbstractModel {

    /**
    * <p>Whether to close global. 0: No. 1: Yes</p>
    */
    @SerializedName("StopGlobal")
    @Expose
    private Long StopGlobal;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>quuid collection that is off when it is not global</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String [] Quuid;

    /**
     * Get <p>Whether to close global. 0: No. 1: Yes</p> 
     * @return StopGlobal <p>Whether to close global. 0: No. 1: Yes</p>
     */
    public Long getStopGlobal() {
        return this.StopGlobal;
    }

    /**
     * Set <p>Whether to close global. 0: No. 1: Yes</p>
     * @param StopGlobal <p>Whether to close global. 0: No. 1: Yes</p>
     */
    public void setStopGlobal(Long StopGlobal) {
        this.StopGlobal = StopGlobal;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>quuid collection that is off when it is not global</p> 
     * @return Quuid <p>quuid collection that is off when it is not global</p>
     */
    public String [] getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>quuid collection that is off when it is not global</p>
     * @param Quuid <p>quuid collection that is off when it is not global</p>
     */
    public void setQuuid(String [] Quuid) {
        this.Quuid = Quuid;
    }

    public StopPreventUninstallRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopPreventUninstallRequest(StopPreventUninstallRequest source) {
        if (source.StopGlobal != null) {
            this.StopGlobal = new Long(source.StopGlobal);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String[source.Quuid.length];
            for (int i = 0; i < source.Quuid.length; i++) {
                this.Quuid[i] = new String(source.Quuid[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StopGlobal", this.StopGlobal);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Quuid.", this.Quuid);

    }
}

