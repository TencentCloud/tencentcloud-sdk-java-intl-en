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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBEnvironments extends AbstractModel {

    /**
    * The TCB environment.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Environment")
    @Expose
    private TCBEnvironment Environment;

    /**
    * The access service.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessService")
    @Expose
    private TCBAccessService AccessService;

    /**
    * Whether static hosting is used.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostService")
    @Expose
    private TCBHostService HostService;

    /**
     * Get The TCB environment.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Environment The TCB environment.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TCBEnvironment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set The TCB environment.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Environment The TCB environment.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironment(TCBEnvironment Environment) {
        this.Environment = Environment;
    }

    /**
     * Get The access service.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessService The access service.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TCBAccessService getAccessService() {
        return this.AccessService;
    }

    /**
     * Set The access service.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessService The access service.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessService(TCBAccessService AccessService) {
        this.AccessService = AccessService;
    }

    /**
     * Get Whether static hosting is used.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostService Whether static hosting is used.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TCBHostService getHostService() {
        return this.HostService;
    }

    /**
     * Set Whether static hosting is used.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostService Whether static hosting is used.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostService(TCBHostService HostService) {
        this.HostService = HostService;
    }

    public TCBEnvironments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBEnvironments(TCBEnvironments source) {
        if (source.Environment != null) {
            this.Environment = new TCBEnvironment(source.Environment);
        }
        if (source.AccessService != null) {
            this.AccessService = new TCBAccessService(source.AccessService);
        }
        if (source.HostService != null) {
            this.HostService = new TCBHostService(source.HostService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamObj(map, prefix + "AccessService.", this.AccessService);
        this.setParamObj(map, prefix + "HostService.", this.HostService);

    }
}

