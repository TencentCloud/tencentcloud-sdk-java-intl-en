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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChcDeployExtraConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("MiniOsType")
    @Expose
    private String MiniOsType;

    /**
    * 
    */
    @SerializedName("BootType")
    @Expose
    private String BootType;

    /**
    * 
    */
    @SerializedName("BootFile")
    @Expose
    private String BootFile;

    /**
    * 
    */
    @SerializedName("NextServerAddress")
    @Expose
    private String NextServerAddress;

    /**
     * Get  
     * @return MiniOsType 
     */
    public String getMiniOsType() {
        return this.MiniOsType;
    }

    /**
     * Set 
     * @param MiniOsType 
     */
    public void setMiniOsType(String MiniOsType) {
        this.MiniOsType = MiniOsType;
    }

    /**
     * Get  
     * @return BootType 
     */
    public String getBootType() {
        return this.BootType;
    }

    /**
     * Set 
     * @param BootType 
     */
    public void setBootType(String BootType) {
        this.BootType = BootType;
    }

    /**
     * Get  
     * @return BootFile 
     */
    public String getBootFile() {
        return this.BootFile;
    }

    /**
     * Set 
     * @param BootFile 
     */
    public void setBootFile(String BootFile) {
        this.BootFile = BootFile;
    }

    /**
     * Get  
     * @return NextServerAddress 
     */
    public String getNextServerAddress() {
        return this.NextServerAddress;
    }

    /**
     * Set 
     * @param NextServerAddress 
     */
    public void setNextServerAddress(String NextServerAddress) {
        this.NextServerAddress = NextServerAddress;
    }

    public ChcDeployExtraConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChcDeployExtraConfig(ChcDeployExtraConfig source) {
        if (source.MiniOsType != null) {
            this.MiniOsType = new String(source.MiniOsType);
        }
        if (source.BootType != null) {
            this.BootType = new String(source.BootType);
        }
        if (source.BootFile != null) {
            this.BootFile = new String(source.BootFile);
        }
        if (source.NextServerAddress != null) {
            this.NextServerAddress = new String(source.NextServerAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniOsType", this.MiniOsType);
        this.setParamSimple(map, prefix + "BootType", this.BootType);
        this.setParamSimple(map, prefix + "BootFile", this.BootFile);
        this.setParamSimple(map, prefix + "NextServerAddress", this.NextServerAddress);

    }
}

