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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosTokenV2Request extends AbstractModel {

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Package name
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * optType. 1: upload; 2: query
    */
    @SerializedName("OptType")
    @Expose
    private Long OptType;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Input parameter of `deployVersion`
    */
    @SerializedName("TimeVersion")
    @Expose
    private String TimeVersion;

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
     * Get Package name 
     * @return PkgName Package name
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set Package name
     * @param PkgName Package name
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get optType. 1: upload; 2: query 
     * @return OptType optType. 1: upload; 2: query
     */
    public Long getOptType() {
        return this.OptType;
    }

    /**
     * Set optType. 1: upload; 2: query
     * @param OptType optType. 1: upload; 2: query
     */
    public void setOptType(Long OptType) {
        this.OptType = OptType;
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

    /**
     * Get Input parameter of `deployVersion` 
     * @return TimeVersion Input parameter of `deployVersion`
     */
    public String getTimeVersion() {
        return this.TimeVersion;
    }

    /**
     * Set Input parameter of `deployVersion`
     * @param TimeVersion Input parameter of `deployVersion`
     */
    public void setTimeVersion(String TimeVersion) {
        this.TimeVersion = TimeVersion;
    }

    public CreateCosTokenV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosTokenV2Request(CreateCosTokenV2Request source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.OptType != null) {
            this.OptType = new Long(source.OptType);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.TimeVersion != null) {
            this.TimeVersion = new String(source.TimeVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "OptType", this.OptType);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "TimeVersion", this.TimeVersion);

    }
}

