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

public class ModifySandboxACLRuleStatusRequest extends AbstractModel {

    /**
    * List of rule IDs.
Input parameter limits: non-empty, 1-100 in length
    */
    @SerializedName("IDList")
    @Expose
    private Long [] IDList;

    /**
    * Target Status
Enumeration values:
ON: enabled.
OFF: disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get List of rule IDs.
Input parameter limits: non-empty, 1-100 in length 
     * @return IDList List of rule IDs.
Input parameter limits: non-empty, 1-100 in length
     */
    public Long [] getIDList() {
        return this.IDList;
    }

    /**
     * Set List of rule IDs.
Input parameter limits: non-empty, 1-100 in length
     * @param IDList List of rule IDs.
Input parameter limits: non-empty, 1-100 in length
     */
    public void setIDList(Long [] IDList) {
        this.IDList = IDList;
    }

    /**
     * Get Target Status
Enumeration values:
ON: enabled.
OFF: disabled. 
     * @return Status Target Status
Enumeration values:
ON: enabled.
OFF: disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Target Status
Enumeration values:
ON: enabled.
OFF: disabled.
     * @param Status Target Status
Enumeration values:
ON: enabled.
OFF: disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxACLRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxACLRuleStatusRequest(ModifySandboxACLRuleStatusRequest source) {
        if (source.IDList != null) {
            this.IDList = new Long[source.IDList.length];
            for (int i = 0; i < source.IDList.length; i++) {
                this.IDList[i] = new Long(source.IDList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IDList.", this.IDList);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

