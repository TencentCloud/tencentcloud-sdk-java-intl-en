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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeSetting extends AbstractModel {

    /**
    * Data volume type.
<li>HOST_PATH indicates support for the local path.</li>
<li>NEW_PVC indicates creating a PVC.</li>
For the data volume types supported by component roles, see the EMR on TKE cluster deployment instructions: [Deployment Instructions](https://www.tencentcloud.com/document/product/589/94254?from_cn_redirect=1).
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * Host path information.
    */
    @SerializedName("HostPath")
    @Expose
    private HostPathVolumeSource HostPath;

    /**
     * Get Data volume type.
<li>HOST_PATH indicates support for the local path.</li>
<li>NEW_PVC indicates creating a PVC.</li>
For the data volume types supported by component roles, see the EMR on TKE cluster deployment instructions: [Deployment Instructions](https://www.tencentcloud.com/document/product/589/94254?from_cn_redirect=1). 
     * @return VolumeType Data volume type.
<li>HOST_PATH indicates support for the local path.</li>
<li>NEW_PVC indicates creating a PVC.</li>
For the data volume types supported by component roles, see the EMR on TKE cluster deployment instructions: [Deployment Instructions](https://www.tencentcloud.com/document/product/589/94254?from_cn_redirect=1).
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set Data volume type.
<li>HOST_PATH indicates support for the local path.</li>
<li>NEW_PVC indicates creating a PVC.</li>
For the data volume types supported by component roles, see the EMR on TKE cluster deployment instructions: [Deployment Instructions](https://www.tencentcloud.com/document/product/589/94254?from_cn_redirect=1).
     * @param VolumeType Data volume type.
<li>HOST_PATH indicates support for the local path.</li>
<li>NEW_PVC indicates creating a PVC.</li>
For the data volume types supported by component roles, see the EMR on TKE cluster deployment instructions: [Deployment Instructions](https://www.tencentcloud.com/document/product/589/94254?from_cn_redirect=1).
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get Host path information. 
     * @return HostPath Host path information.
     */
    public HostPathVolumeSource getHostPath() {
        return this.HostPath;
    }

    /**
     * Set Host path information.
     * @param HostPath Host path information.
     */
    public void setHostPath(HostPathVolumeSource HostPath) {
        this.HostPath = HostPath;
    }

    public VolumeSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeSetting(VolumeSetting source) {
        if (source.VolumeType != null) {
            this.VolumeType = new String(source.VolumeType);
        }
        if (source.HostPath != null) {
            this.HostPath = new HostPathVolumeSource(source.HostPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeType", this.VolumeType);
        this.setParamObj(map, prefix + "HostPath.", this.HostPath);

    }
}

