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

public class ComplianceContainerDetailInfo extends AbstractModel {

    /**
    * Container ID on the server
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Pod name of the container
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
     * Get Container ID on the server 
     * @return ContainerId Container ID on the server
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID on the server
     * @param ContainerId Container ID on the server
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Pod name of the container
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodName Pod name of the container
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name of the container
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodName Pod name of the container
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public ComplianceContainerDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceContainerDetailInfo(ComplianceContainerDetailInfo source) {
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

