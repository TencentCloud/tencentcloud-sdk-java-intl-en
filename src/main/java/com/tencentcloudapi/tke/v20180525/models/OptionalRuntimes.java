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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptionalRuntimes extends AbstractModel {

    /**
    * Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeType")
    @Expose
    private String RuntimeType;

    /**
    * Runtime version list
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeVersions")
    @Expose
    private String [] RuntimeVersions;

    /**
    * Default runtime version for this type
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DefaultVersion")
    @Expose
    private String DefaultVersion;

    /**
     * Get Runtime type
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return RuntimeType Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getRuntimeType() {
        return this.RuntimeType;
    }

    /**
     * Set Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param RuntimeType Runtime type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRuntimeType(String RuntimeType) {
        this.RuntimeType = RuntimeType;
    }

    /**
     * Get Runtime version list
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return RuntimeVersions Runtime version list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getRuntimeVersions() {
        return this.RuntimeVersions;
    }

    /**
     * Set Runtime version list
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param RuntimeVersions Runtime version list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRuntimeVersions(String [] RuntimeVersions) {
        this.RuntimeVersions = RuntimeVersions;
    }

    /**
     * Get Default runtime version for this type
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DefaultVersion Default runtime version for this type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getDefaultVersion() {
        return this.DefaultVersion;
    }

    /**
     * Set Default runtime version for this type
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DefaultVersion Default runtime version for this type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDefaultVersion(String DefaultVersion) {
        this.DefaultVersion = DefaultVersion;
    }

    public OptionalRuntimes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptionalRuntimes(OptionalRuntimes source) {
        if (source.RuntimeType != null) {
            this.RuntimeType = new String(source.RuntimeType);
        }
        if (source.RuntimeVersions != null) {
            this.RuntimeVersions = new String[source.RuntimeVersions.length];
            for (int i = 0; i < source.RuntimeVersions.length; i++) {
                this.RuntimeVersions[i] = new String(source.RuntimeVersions[i]);
            }
        }
        if (source.DefaultVersion != null) {
            this.DefaultVersion = new String(source.DefaultVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeType", this.RuntimeType);
        this.setParamArraySimple(map, prefix + "RuntimeVersions.", this.RuntimeVersions);
        this.setParamSimple(map, prefix + "DefaultVersion", this.DefaultVersion);

    }
}

