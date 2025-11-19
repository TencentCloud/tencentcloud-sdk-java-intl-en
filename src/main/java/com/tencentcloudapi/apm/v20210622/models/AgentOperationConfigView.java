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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentOperationConfigView extends AbstractModel {

    /**
    * Whether allowlist configuration is enabled for the current API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionValid")
    @Expose
    private Boolean RetentionValid;

    /**
    * Effective when RetentionValid is false. It indicates blocklist configuration in API settings. The APIs specified in the configuration do not support collection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoreOperation")
    @Expose
    private String IgnoreOperation;

    /**
    * Effective when RetentionValid is true. It indicates allowlist configuration in API settings. Only the APIs specified in the configuration support collection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionOperation")
    @Expose
    private String RetentionOperation;

    /**
     * Get Whether allowlist configuration is enabled for the current API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetentionValid Whether allowlist configuration is enabled for the current API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRetentionValid() {
        return this.RetentionValid;
    }

    /**
     * Set Whether allowlist configuration is enabled for the current API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetentionValid Whether allowlist configuration is enabled for the current API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetentionValid(Boolean RetentionValid) {
        this.RetentionValid = RetentionValid;
    }

    /**
     * Get Effective when RetentionValid is false. It indicates blocklist configuration in API settings. The APIs specified in the configuration do not support collection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IgnoreOperation Effective when RetentionValid is false. It indicates blocklist configuration in API settings. The APIs specified in the configuration do not support collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIgnoreOperation() {
        return this.IgnoreOperation;
    }

    /**
     * Set Effective when RetentionValid is false. It indicates blocklist configuration in API settings. The APIs specified in the configuration do not support collection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IgnoreOperation Effective when RetentionValid is false. It indicates blocklist configuration in API settings. The APIs specified in the configuration do not support collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIgnoreOperation(String IgnoreOperation) {
        this.IgnoreOperation = IgnoreOperation;
    }

    /**
     * Get Effective when RetentionValid is true. It indicates allowlist configuration in API settings. Only the APIs specified in the configuration support collection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetentionOperation Effective when RetentionValid is true. It indicates allowlist configuration in API settings. Only the APIs specified in the configuration support collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRetentionOperation() {
        return this.RetentionOperation;
    }

    /**
     * Set Effective when RetentionValid is true. It indicates allowlist configuration in API settings. Only the APIs specified in the configuration support collection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetentionOperation Effective when RetentionValid is true. It indicates allowlist configuration in API settings. Only the APIs specified in the configuration support collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetentionOperation(String RetentionOperation) {
        this.RetentionOperation = RetentionOperation;
    }

    public AgentOperationConfigView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentOperationConfigView(AgentOperationConfigView source) {
        if (source.RetentionValid != null) {
            this.RetentionValid = new Boolean(source.RetentionValid);
        }
        if (source.IgnoreOperation != null) {
            this.IgnoreOperation = new String(source.IgnoreOperation);
        }
        if (source.RetentionOperation != null) {
            this.RetentionOperation = new String(source.RetentionOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetentionValid", this.RetentionValid);
        this.setParamSimple(map, prefix + "IgnoreOperation", this.IgnoreOperation);
        this.setParamSimple(map, prefix + "RetentionOperation", this.RetentionOperation);

    }
}

