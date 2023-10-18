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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIngressRequest extends AbstractModel {

    /**
    * Ingress rule configuration
    */
    @SerializedName("Ingress")
    @Expose
    private IngressInfo Ingress;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get Ingress rule configuration 
     * @return Ingress Ingress rule configuration
     */
    public IngressInfo getIngress() {
        return this.Ingress;
    }

    /**
     * Set Ingress rule configuration
     * @param Ingress Ingress rule configuration
     */
    public void setIngress(IngressInfo Ingress) {
        this.Ingress = Ingress;
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

    public ModifyIngressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIngressRequest(ModifyIngressRequest source) {
        if (source.Ingress != null) {
            this.Ingress = new IngressInfo(source.Ingress);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Ingress.", this.Ingress);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

