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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchElasticModeRequest extends AbstractModel {

    /**
    * Version, can only be sparta-waf, clb-waf, or cdn-waf
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 0 indicates Off; 1 indicates On
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get Version, can only be sparta-waf, clb-waf, or cdn-waf 
     * @return Edition Version, can only be sparta-waf, clb-waf, or cdn-waf
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Version, can only be sparta-waf, clb-waf, or cdn-waf
     * @param Edition Version, can only be sparta-waf, clb-waf, or cdn-waf
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 0 indicates Off; 1 indicates On 
     * @return Mode 0 indicates Off; 1 indicates On
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 0 indicates Off; 1 indicates On
     * @param Mode 0 indicates Off; 1 indicates On
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public SwitchElasticModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchElasticModeRequest(SwitchElasticModeRequest source) {
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

