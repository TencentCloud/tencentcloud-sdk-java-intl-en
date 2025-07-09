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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPVersionCompileTaskSubSimpleInfo extends AbstractModel {

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * Prefix of the package name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PathPrefix")
    @Expose
    private String PathPrefix;

    /**
    * Package size in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PkgSize")
    @Expose
    private Long PkgSize;

    /**
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PkgName Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PkgName Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get Prefix of the package name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PathPrefix Prefix of the package name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPathPrefix() {
        return this.PathPrefix;
    }

    /**
     * Set Prefix of the package name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PathPrefix Prefix of the package name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPathPrefix(String PathPrefix) {
        this.PathPrefix = PathPrefix;
    }

    /**
     * Get Package size in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PkgSize Package size in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPkgSize() {
        return this.PkgSize;
    }

    /**
     * Set Package size in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PkgSize Package size in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPkgSize(Long PkgSize) {
        this.PkgSize = PkgSize;
    }

    public DescribeMNPVersionCompileTaskSubSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPVersionCompileTaskSubSimpleInfo(DescribeMNPVersionCompileTaskSubSimpleInfo source) {
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.PathPrefix != null) {
            this.PathPrefix = new String(source.PathPrefix);
        }
        if (source.PkgSize != null) {
            this.PkgSize = new Long(source.PkgSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "PathPrefix", this.PathPrefix);
        this.setParamSimple(map, prefix + "PkgSize", this.PkgSize);

    }
}

