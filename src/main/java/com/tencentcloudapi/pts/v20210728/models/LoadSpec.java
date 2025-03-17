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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadSpec extends AbstractModel {

    /**
    * Configuration for concurrency mode.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Concurrency")
    @Expose
    private Concurrency Concurrency;

    /**
    * Configuration for RPS mode.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private RequestsPerSecond RequestsPerSecond;

    /**
    * Built-in script mode.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ScriptOrigin")
    @Expose
    private ScriptOrigin ScriptOrigin;

    /**
     * Get Configuration for concurrency mode.

Note: This field may return null, indicating that no valid value is found. 
     * @return Concurrency Configuration for concurrency mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public Concurrency getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set Configuration for concurrency mode.

Note: This field may return null, indicating that no valid value is found.
     * @param Concurrency Configuration for concurrency mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setConcurrency(Concurrency Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get Configuration for RPS mode.

Note: This field may return null, indicating that no valid value is found. 
     * @return RequestsPerSecond Configuration for RPS mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public RequestsPerSecond getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set Configuration for RPS mode.

Note: This field may return null, indicating that no valid value is found.
     * @param RequestsPerSecond Configuration for RPS mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRequestsPerSecond(RequestsPerSecond RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get Built-in script mode.

Note: This field may return null, indicating that no valid value is found. 
     * @return ScriptOrigin Built-in script mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public ScriptOrigin getScriptOrigin() {
        return this.ScriptOrigin;
    }

    /**
     * Set Built-in script mode.

Note: This field may return null, indicating that no valid value is found.
     * @param ScriptOrigin Built-in script mode.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScriptOrigin(ScriptOrigin ScriptOrigin) {
        this.ScriptOrigin = ScriptOrigin;
    }

    public LoadSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadSpec(LoadSpec source) {
        if (source.Concurrency != null) {
            this.Concurrency = new Concurrency(source.Concurrency);
        }
        if (source.RequestsPerSecond != null) {
            this.RequestsPerSecond = new RequestsPerSecond(source.RequestsPerSecond);
        }
        if (source.ScriptOrigin != null) {
            this.ScriptOrigin = new ScriptOrigin(source.ScriptOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Concurrency.", this.Concurrency);
        this.setParamObj(map, prefix + "RequestsPerSecond.", this.RequestsPerSecond);
        this.setParamObj(map, prefix + "ScriptOrigin.", this.ScriptOrigin);

    }
}

