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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessRulesResponse extends AbstractModel {

    /**
    * List of permission rules
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessRules")
    @Expose
    private AccessRule [] AccessRules;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of permission rules
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessRules List of permission rules
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccessRule [] getAccessRules() {
        return this.AccessRules;
    }

    /**
     * Set List of permission rules
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessRules List of permission rules
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessRules(AccessRule [] AccessRules) {
        this.AccessRules = AccessRules;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateAccessRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessRulesResponse(CreateAccessRulesResponse source) {
        if (source.AccessRules != null) {
            this.AccessRules = new AccessRule[source.AccessRules.length];
            for (int i = 0; i < source.AccessRules.length; i++) {
                this.AccessRules[i] = new AccessRule(source.AccessRules[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessRules.", this.AccessRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

