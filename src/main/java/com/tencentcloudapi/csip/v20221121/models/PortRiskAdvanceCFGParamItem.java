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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortRiskAdvanceCFGParamItem extends AbstractModel {

    /**
    * Port Collection, separated by commas.
    */
    @SerializedName("PortSets")
    @Expose
    private String PortSets;

    /**
    * Detection Item Type. 0-System-Defined; 1-User-Defined.
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * Detection item description
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Enable/Disable. 1-Enable; 0-Disable.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get Port Collection, separated by commas. 
     * @return PortSets Port Collection, separated by commas.
     */
    public String getPortSets() {
        return this.PortSets;
    }

    /**
     * Set Port Collection, separated by commas.
     * @param PortSets Port Collection, separated by commas.
     */
    public void setPortSets(String PortSets) {
        this.PortSets = PortSets;
    }

    /**
     * Get Detection Item Type. 0-System-Defined; 1-User-Defined. 
     * @return CheckType Detection Item Type. 0-System-Defined; 1-User-Defined.
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Detection Item Type. 0-System-Defined; 1-User-Defined.
     * @param CheckType Detection Item Type. 0-System-Defined; 1-User-Defined.
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get Detection item description 
     * @return Detail Detection item description
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Detection item description
     * @param Detail Detection item description
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Enable/Disable. 1-Enable; 0-Disable. 
     * @return Enable Enable/Disable. 1-Enable; 0-Disable.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Enable/Disable. 1-Enable; 0-Disable.
     * @param Enable Enable/Disable. 1-Enable; 0-Disable.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public PortRiskAdvanceCFGParamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortRiskAdvanceCFGParamItem(PortRiskAdvanceCFGParamItem source) {
        if (source.PortSets != null) {
            this.PortSets = new String(source.PortSets);
        }
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortSets", this.PortSets);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

