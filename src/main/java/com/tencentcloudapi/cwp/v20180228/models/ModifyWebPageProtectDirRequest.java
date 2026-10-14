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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebPageProtectDirRequest extends AbstractModel {

    /**
    * Website protection directory address
    */
    @SerializedName("ProtectDirAddr")
    @Expose
    private String ProtectDirAddr;

    /**
    * Name of the website protection directory
    */
    @SerializedName("ProtectDirName")
    @Expose
    private String ProtectDirName;

    /**
    * Protected file types, separated by semicolons
    */
    @SerializedName("ProtectFileType")
    @Expose
    private String ProtectFileType;

    /**
    * Protection machine list information
    */
    @SerializedName("HostConfig")
    @Expose
    private ProtectHostConfig [] HostConfig;

    /**
     * Get Website protection directory address 
     * @return ProtectDirAddr Website protection directory address
     */
    public String getProtectDirAddr() {
        return this.ProtectDirAddr;
    }

    /**
     * Set Website protection directory address
     * @param ProtectDirAddr Website protection directory address
     */
    public void setProtectDirAddr(String ProtectDirAddr) {
        this.ProtectDirAddr = ProtectDirAddr;
    }

    /**
     * Get Name of the website protection directory 
     * @return ProtectDirName Name of the website protection directory
     */
    public String getProtectDirName() {
        return this.ProtectDirName;
    }

    /**
     * Set Name of the website protection directory
     * @param ProtectDirName Name of the website protection directory
     */
    public void setProtectDirName(String ProtectDirName) {
        this.ProtectDirName = ProtectDirName;
    }

    /**
     * Get Protected file types, separated by semicolons 
     * @return ProtectFileType Protected file types, separated by semicolons
     */
    public String getProtectFileType() {
        return this.ProtectFileType;
    }

    /**
     * Set Protected file types, separated by semicolons
     * @param ProtectFileType Protected file types, separated by semicolons
     */
    public void setProtectFileType(String ProtectFileType) {
        this.ProtectFileType = ProtectFileType;
    }

    /**
     * Get Protection machine list information 
     * @return HostConfig Protection machine list information
     */
    public ProtectHostConfig [] getHostConfig() {
        return this.HostConfig;
    }

    /**
     * Set Protection machine list information
     * @param HostConfig Protection machine list information
     */
    public void setHostConfig(ProtectHostConfig [] HostConfig) {
        this.HostConfig = HostConfig;
    }

    public ModifyWebPageProtectDirRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebPageProtectDirRequest(ModifyWebPageProtectDirRequest source) {
        if (source.ProtectDirAddr != null) {
            this.ProtectDirAddr = new String(source.ProtectDirAddr);
        }
        if (source.ProtectDirName != null) {
            this.ProtectDirName = new String(source.ProtectDirName);
        }
        if (source.ProtectFileType != null) {
            this.ProtectFileType = new String(source.ProtectFileType);
        }
        if (source.HostConfig != null) {
            this.HostConfig = new ProtectHostConfig[source.HostConfig.length];
            for (int i = 0; i < source.HostConfig.length; i++) {
                this.HostConfig[i] = new ProtectHostConfig(source.HostConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectDirAddr", this.ProtectDirAddr);
        this.setParamSimple(map, prefix + "ProtectDirName", this.ProtectDirName);
        this.setParamSimple(map, prefix + "ProtectFileType", this.ProtectFileType);
        this.setParamArrayObj(map, prefix + "HostConfig.", this.HostConfig);

    }
}

