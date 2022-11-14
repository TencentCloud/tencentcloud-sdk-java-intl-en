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

public class ModifyNatFwSwitchRequest extends AbstractModel{

    /**
    * Status. 0: off; 1: on
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * List of firewall instance IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
    */
    @SerializedName("CfwInsIdList")
    @Expose
    private String [] CfwInsIdList;

    /**
    * List of subnet IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
    */
    @SerializedName("SubnetIdList")
    @Expose
    private String [] SubnetIdList;

    /**
    * List of route table IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
    */
    @SerializedName("RouteTableIdList")
    @Expose
    private String [] RouteTableIdList;

    /**
     * Get Status. 0: off; 1: on 
     * @return Enable Status. 0: off; 1: on
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Status. 0: off; 1: on
     * @param Enable Status. 0: off; 1: on
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get List of firewall instance IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed. 
     * @return CfwInsIdList List of firewall instance IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     */
    public String [] getCfwInsIdList() {
        return this.CfwInsIdList;
    }

    /**
     * Set List of firewall instance IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     * @param CfwInsIdList List of firewall instance IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     */
    public void setCfwInsIdList(String [] CfwInsIdList) {
        this.CfwInsIdList = CfwInsIdList;
    }

    /**
     * Get List of subnet IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed. 
     * @return SubnetIdList List of subnet IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     */
    public String [] getSubnetIdList() {
        return this.SubnetIdList;
    }

    /**
     * Set List of subnet IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     * @param SubnetIdList List of subnet IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     */
    public void setSubnetIdList(String [] SubnetIdList) {
        this.SubnetIdList = SubnetIdList;
    }

    /**
     * Get List of route table IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed. 
     * @return RouteTableIdList List of route table IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     */
    public String [] getRouteTableIdList() {
        return this.RouteTableIdList;
    }

    /**
     * Set List of route table IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     * @param RouteTableIdList List of route table IDs. Only one of CfwInsIdList, SubnetIdList, and RouteTableIdList can be passed.
     */
    public void setRouteTableIdList(String [] RouteTableIdList) {
        this.RouteTableIdList = RouteTableIdList;
    }

    public ModifyNatFwSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatFwSwitchRequest(ModifyNatFwSwitchRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CfwInsIdList != null) {
            this.CfwInsIdList = new String[source.CfwInsIdList.length];
            for (int i = 0; i < source.CfwInsIdList.length; i++) {
                this.CfwInsIdList[i] = new String(source.CfwInsIdList[i]);
            }
        }
        if (source.SubnetIdList != null) {
            this.SubnetIdList = new String[source.SubnetIdList.length];
            for (int i = 0; i < source.SubnetIdList.length; i++) {
                this.SubnetIdList[i] = new String(source.SubnetIdList[i]);
            }
        }
        if (source.RouteTableIdList != null) {
            this.RouteTableIdList = new String[source.RouteTableIdList.length];
            for (int i = 0; i < source.RouteTableIdList.length; i++) {
                this.RouteTableIdList[i] = new String(source.RouteTableIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "CfwInsIdList.", this.CfwInsIdList);
        this.setParamArraySimple(map, prefix + "SubnetIdList.", this.SubnetIdList);
        this.setParamArraySimple(map, prefix + "RouteTableIdList.", this.RouteTableIdList);

    }
}

