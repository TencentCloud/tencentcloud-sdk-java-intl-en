/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryCondition extends AbstractModel {

    /**
    * Instance creation process type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance creation process status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Reasons for transiting to the process
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Instance creation process type 
     * @return Type Instance creation process type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance creation process type
     * @param Type Instance creation process type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance creation process status 
     * @return Status Instance creation process status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance creation process status
     * @param Status Instance creation process status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Reasons for transiting to the process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason Reasons for transiting to the process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reasons for transiting to the process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason Reasons for transiting to the process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RegistryCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryCondition(RegistryCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

