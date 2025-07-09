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

public class ModifyWebPageProtectSwitchRequest extends AbstractModel {

    /**
    * Switch type: 1 - protection switch; 2 - auto recovery switch; 3 - remove protection directory
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
    * Sites that require operating switches (maximum quantity is 100)
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
    * 1 - on; 0 - off; required when SwitchType is 1 | 2;
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Switch type: 1 - protection switch; 2 - auto recovery switch; 3 - remove protection directory 
     * @return SwitchType Switch type: 1 - protection switch; 2 - auto recovery switch; 3 - remove protection directory
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set Switch type: 1 - protection switch; 2 - auto recovery switch; 3 - remove protection directory
     * @param SwitchType Switch type: 1 - protection switch; 2 - auto recovery switch; 3 - remove protection directory
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get Sites that require operating switches (maximum quantity is 100) 
     * @return Ids Sites that require operating switches (maximum quantity is 100)
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set Sites that require operating switches (maximum quantity is 100)
     * @param Ids Sites that require operating switches (maximum quantity is 100)
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 1 - on; 0 - off; required when SwitchType is 1 | 2; 
     * @return Status 1 - on; 0 - off; required when SwitchType is 1 | 2;
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1 - on; 0 - off; required when SwitchType is 1 | 2;
     * @param Status 1 - on; 0 - off; required when SwitchType is 1 | 2;
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyWebPageProtectSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebPageProtectSwitchRequest(ModifyWebPageProtectSwitchRequest source) {
        if (source.SwitchType != null) {
            this.SwitchType = new Long(source.SwitchType);
        }
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

