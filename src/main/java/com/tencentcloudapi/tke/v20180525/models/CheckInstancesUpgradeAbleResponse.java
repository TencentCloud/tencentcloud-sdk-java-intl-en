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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckInstancesUpgradeAbleResponse extends AbstractModel{

    /**
    * The current minor version of cluster Master
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * The latest minor version of cluster Master corresponding major version
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * List of nodes that can be upgraded
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("UpgradeAbleInstances")
    @Expose
    private UpgradeAbleInstancesItem [] UpgradeAbleInstances;

    /**
    * Total number
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The current minor version of cluster Master 
     * @return ClusterVersion The current minor version of cluster Master
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set The current minor version of cluster Master
     * @param ClusterVersion The current minor version of cluster Master
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get The latest minor version of cluster Master corresponding major version 
     * @return LatestVersion The latest minor version of cluster Master corresponding major version
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set The latest minor version of cluster Master corresponding major version
     * @param LatestVersion The latest minor version of cluster Master corresponding major version
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get List of nodes that can be upgraded
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return UpgradeAbleInstances List of nodes that can be upgraded
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public UpgradeAbleInstancesItem [] getUpgradeAbleInstances() {
        return this.UpgradeAbleInstances;
    }

    /**
     * Set List of nodes that can be upgraded
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param UpgradeAbleInstances List of nodes that can be upgraded
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setUpgradeAbleInstances(UpgradeAbleInstancesItem [] UpgradeAbleInstances) {
        this.UpgradeAbleInstances = UpgradeAbleInstances;
    }

    /**
     * Get Total number
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Total Total number
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Total Total number
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public CheckInstancesUpgradeAbleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckInstancesUpgradeAbleResponse(CheckInstancesUpgradeAbleResponse source) {
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.UpgradeAbleInstances != null) {
            this.UpgradeAbleInstances = new UpgradeAbleInstancesItem[source.UpgradeAbleInstances.length];
            for (int i = 0; i < source.UpgradeAbleInstances.length; i++) {
                this.UpgradeAbleInstances[i] = new UpgradeAbleInstancesItem(source.UpgradeAbleInstances[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamArrayObj(map, prefix + "UpgradeAbleInstances.", this.UpgradeAbleInstances);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

