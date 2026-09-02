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

public class ModifyEdrAlertStatusRequest extends AbstractModel {

    /**
    * <p>Target alarm information</p>
    */
    @SerializedName("Targets")
    @Expose
    private EdrAlertTarget [] Targets;

    /**
    * <p>Target alarm status enumeration values: PROCESSED: processedWHITELISTED: whitelistedIGNORED: ignoredDELETED: deleted-soft deletion</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Target alarm information</p> 
     * @return Targets <p>Target alarm information</p>
     */
    public EdrAlertTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>Target alarm information</p>
     * @param Targets <p>Target alarm information</p>
     */
    public void setTargets(EdrAlertTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>Target alarm status enumeration values: PROCESSED: processedWHITELISTED: whitelistedIGNORED: ignoredDELETED: deleted-soft deletion</p> 
     * @return Status <p>Target alarm status enumeration values: PROCESSED: processedWHITELISTED: whitelistedIGNORED: ignoredDELETED: deleted-soft deletion</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Target alarm status enumeration values: PROCESSED: processedWHITELISTED: whitelistedIGNORED: ignoredDELETED: deleted-soft deletion</p>
     * @param Status <p>Target alarm status enumeration values: PROCESSED: processedWHITELISTED: whitelistedIGNORED: ignoredDELETED: deleted-soft deletion</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public ModifyEdrAlertStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdrAlertStatusRequest(ModifyEdrAlertStatusRequest source) {
        if (source.Targets != null) {
            this.Targets = new EdrAlertTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new EdrAlertTarget(source.Targets[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

