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

public class CUDNN extends AbstractModel {

    /**
    * cuDNN version

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * cuDNN name

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Doc name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * Dev name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DevName")
    @Expose
    private String DevName;

    /**
     * Get cuDNN version

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Version cuDNN version

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set cuDNN version

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Version cuDNN version

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get cuDNN name

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Name cuDNN name

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set cuDNN name

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Name cuDNN name

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Doc name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DocName Doc name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set Doc name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DocName Doc name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get Dev name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DevName Dev name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getDevName() {
        return this.DevName;
    }

    /**
     * Set Dev name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DevName Dev name of cuDNN

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDevName(String DevName) {
        this.DevName = DevName;
    }

    public CUDNN() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CUDNN(CUDNN source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.DevName != null) {
            this.DevName = new String(source.DevName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "DevName", this.DevName);

    }
}

