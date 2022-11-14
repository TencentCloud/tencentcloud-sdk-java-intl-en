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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewModeItems extends AbstractModel{

    /**
    * VPC list for the Create New mode
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

    /**
    * The list of egress public EIPs bound for the Create New mode. Either Eips or AddCount is required.
    */
    @SerializedName("Eips")
    @Expose
    private String [] Eips;

    /**
    * The number of egress public EIPs newly bound for the Create New mode. Either Eips or AddCount is required.
    */
    @SerializedName("AddCount")
    @Expose
    private Long AddCount;

    /**
     * Get VPC list for the Create New mode 
     * @return VpcList VPC list for the Create New mode
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set VPC list for the Create New mode
     * @param VpcList VPC list for the Create New mode
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get The list of egress public EIPs bound for the Create New mode. Either Eips or AddCount is required. 
     * @return Eips The list of egress public EIPs bound for the Create New mode. Either Eips or AddCount is required.
     */
    public String [] getEips() {
        return this.Eips;
    }

    /**
     * Set The list of egress public EIPs bound for the Create New mode. Either Eips or AddCount is required.
     * @param Eips The list of egress public EIPs bound for the Create New mode. Either Eips or AddCount is required.
     */
    public void setEips(String [] Eips) {
        this.Eips = Eips;
    }

    /**
     * Get The number of egress public EIPs newly bound for the Create New mode. Either Eips or AddCount is required. 
     * @return AddCount The number of egress public EIPs newly bound for the Create New mode. Either Eips or AddCount is required.
     */
    public Long getAddCount() {
        return this.AddCount;
    }

    /**
     * Set The number of egress public EIPs newly bound for the Create New mode. Either Eips or AddCount is required.
     * @param AddCount The number of egress public EIPs newly bound for the Create New mode. Either Eips or AddCount is required.
     */
    public void setAddCount(Long AddCount) {
        this.AddCount = AddCount;
    }

    public NewModeItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewModeItems(NewModeItems source) {
        if (source.VpcList != null) {
            this.VpcList = new String[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new String(source.VpcList[i]);
            }
        }
        if (source.Eips != null) {
            this.Eips = new String[source.Eips.length];
            for (int i = 0; i < source.Eips.length; i++) {
                this.Eips[i] = new String(source.Eips[i]);
            }
        }
        if (source.AddCount != null) {
            this.AddCount = new Long(source.AddCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);
        this.setParamArraySimple(map, prefix + "Eips.", this.Eips);
        this.setParamSimple(map, prefix + "AddCount", this.AddCount);

    }
}

