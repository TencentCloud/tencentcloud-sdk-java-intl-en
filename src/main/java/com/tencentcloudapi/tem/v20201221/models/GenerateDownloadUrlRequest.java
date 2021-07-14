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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateDownloadUrlRequest extends AbstractModel{

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Package Name
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * Version of the package to download
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Package Name 
     * @return PkgName Package Name
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set Package Name
     * @param PkgName Package Name
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get Version of the package to download 
     * @return DeployVersion Version of the package to download
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set Version of the package to download
     * @param DeployVersion Version of the package to download
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get Source channel 
     * @return SourceChannel Source channel
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel
     * @param SourceChannel Source channel
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    public GenerateDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateDownloadUrlRequest(GenerateDownloadUrlRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

