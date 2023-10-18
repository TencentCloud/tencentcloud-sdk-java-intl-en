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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulScanInfoRequest extends AbstractModel {

    /**
    * ID of the task to scan local images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * ID of the task to scan repository images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
     * Get ID of the task to scan local images for vulnerabilities. If it is not specified, the ID of the last scan will be returned. 
     * @return LocalTaskID ID of the task to scan local images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set ID of the task to scan local images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
     * @param LocalTaskID ID of the task to scan local images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get ID of the task to scan repository images for vulnerabilities. If it is not specified, the ID of the last scan will be returned. 
     * @return RegistryTaskID ID of the task to scan repository images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set ID of the task to scan repository images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
     * @param RegistryTaskID ID of the task to scan repository images for vulnerabilities. If it is not specified, the ID of the last scan will be returned.
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    public DescribeVulScanInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanInfoRequest(DescribeVulScanInfoRequest source) {
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);

    }
}

