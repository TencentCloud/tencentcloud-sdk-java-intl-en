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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopVulScanTaskRequest extends AbstractModel{

    /**
    * ID of the task to scan local images for vulnerabilities
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * Local image ID. If it is not specified, it indicates all.
    */
    @SerializedName("LocalImageIDs")
    @Expose
    private String [] LocalImageIDs;

    /**
    * Repository image ID. If it is not specified, it indicates all.
    */
    @SerializedName("RegistryImageIDs")
    @Expose
    private Long [] RegistryImageIDs;

    /**
    * ID of the task to scan repository images for vulnerabilities
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
     * Get ID of the task to scan local images for vulnerabilities 
     * @return LocalTaskID ID of the task to scan local images for vulnerabilities
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set ID of the task to scan local images for vulnerabilities
     * @param LocalTaskID ID of the task to scan local images for vulnerabilities
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get Local image ID. If it is not specified, it indicates all. 
     * @return LocalImageIDs Local image ID. If it is not specified, it indicates all.
     */
    public String [] getLocalImageIDs() {
        return this.LocalImageIDs;
    }

    /**
     * Set Local image ID. If it is not specified, it indicates all.
     * @param LocalImageIDs Local image ID. If it is not specified, it indicates all.
     */
    public void setLocalImageIDs(String [] LocalImageIDs) {
        this.LocalImageIDs = LocalImageIDs;
    }

    /**
     * Get Repository image ID. If it is not specified, it indicates all. 
     * @return RegistryImageIDs Repository image ID. If it is not specified, it indicates all.
     */
    public Long [] getRegistryImageIDs() {
        return this.RegistryImageIDs;
    }

    /**
     * Set Repository image ID. If it is not specified, it indicates all.
     * @param RegistryImageIDs Repository image ID. If it is not specified, it indicates all.
     */
    public void setRegistryImageIDs(Long [] RegistryImageIDs) {
        this.RegistryImageIDs = RegistryImageIDs;
    }

    /**
     * Get ID of the task to scan repository images for vulnerabilities 
     * @return RegistryTaskID ID of the task to scan repository images for vulnerabilities
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set ID of the task to scan repository images for vulnerabilities
     * @param RegistryTaskID ID of the task to scan repository images for vulnerabilities
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    public StopVulScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopVulScanTaskRequest(StopVulScanTaskRequest source) {
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.LocalImageIDs != null) {
            this.LocalImageIDs = new String[source.LocalImageIDs.length];
            for (int i = 0; i < source.LocalImageIDs.length; i++) {
                this.LocalImageIDs[i] = new String(source.LocalImageIDs[i]);
            }
        }
        if (source.RegistryImageIDs != null) {
            this.RegistryImageIDs = new Long[source.RegistryImageIDs.length];
            for (int i = 0; i < source.RegistryImageIDs.length; i++) {
                this.RegistryImageIDs[i] = new Long(source.RegistryImageIDs[i]);
            }
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
        this.setParamArraySimple(map, prefix + "LocalImageIDs.", this.LocalImageIDs);
        this.setParamArraySimple(map, prefix + "RegistryImageIDs.", this.RegistryImageIDs);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);

    }
}

