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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceK8SDetailInfo extends AbstractModel {

    /**
    * K8s cluster name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * K8s cluster version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
     * Get K8s cluster name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName K8s cluster name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set K8s cluster name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterName K8s cluster name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get K8s cluster version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterVersion K8s cluster version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set K8s cluster version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterVersion K8s cluster version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    public ComplianceK8SDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceK8SDetailInfo(ComplianceK8SDetailInfo source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);

    }
}

