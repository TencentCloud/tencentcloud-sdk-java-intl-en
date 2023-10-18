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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamRequest extends AbstractModel {

    /**
    * Instance ID list.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * List of modified parameters. Each list element has two fields: `Name` and `CurrentValue`. Set `Name` to the parameter name and `CurrentValue` to the new value after modification. <b>Note</b>: if the instance needs to be <b>restarted</b> for the modified parameter to take effect, it will be <b>restarted</b> immediately or during the maintenance time. Before you modify a parameter, you can use the `DescribeInstanceParams` API to query whether the instance needs to be restarted.
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
    * When to execute the parameter modification task. Valid values: `0` (execute immediately), `1` (execute during maintenance time). Default value: `0`.
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
     * Get Instance ID list. 
     * @return InstanceIds Instance ID list.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list.
     * @param InstanceIds Instance ID list.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get List of modified parameters. Each list element has two fields: `Name` and `CurrentValue`. Set `Name` to the parameter name and `CurrentValue` to the new value after modification. <b>Note</b>: if the instance needs to be <b>restarted</b> for the modified parameter to take effect, it will be <b>restarted</b> immediately or during the maintenance time. Before you modify a parameter, you can use the `DescribeInstanceParams` API to query whether the instance needs to be restarted. 
     * @return ParamList List of modified parameters. Each list element has two fields: `Name` and `CurrentValue`. Set `Name` to the parameter name and `CurrentValue` to the new value after modification. <b>Note</b>: if the instance needs to be <b>restarted</b> for the modified parameter to take effect, it will be <b>restarted</b> immediately or during the maintenance time. Before you modify a parameter, you can use the `DescribeInstanceParams` API to query whether the instance needs to be restarted.
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set List of modified parameters. Each list element has two fields: `Name` and `CurrentValue`. Set `Name` to the parameter name and `CurrentValue` to the new value after modification. <b>Note</b>: if the instance needs to be <b>restarted</b> for the modified parameter to take effect, it will be <b>restarted</b> immediately or during the maintenance time. Before you modify a parameter, you can use the `DescribeInstanceParams` API to query whether the instance needs to be restarted.
     * @param ParamList List of modified parameters. Each list element has two fields: `Name` and `CurrentValue`. Set `Name` to the parameter name and `CurrentValue` to the new value after modification. <b>Note</b>: if the instance needs to be <b>restarted</b> for the modified parameter to take effect, it will be <b>restarted</b> immediately or during the maintenance time. Before you modify a parameter, you can use the `DescribeInstanceParams` API to query whether the instance needs to be restarted.
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get When to execute the parameter modification task. Valid values: `0` (execute immediately), `1` (execute during maintenance time). Default value: `0`. 
     * @return WaitSwitch When to execute the parameter modification task. Valid values: `0` (execute immediately), `1` (execute during maintenance time). Default value: `0`.
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set When to execute the parameter modification task. Valid values: `0` (execute immediately), `1` (execute during maintenance time). Default value: `0`.
     * @param WaitSwitch When to execute the parameter modification task. Valid values: `0` (execute immediately), `1` (execute during maintenance time). Default value: `0`.
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    public ModifyInstanceParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamRequest(ModifyInstanceParamRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ParamList != null) {
            this.ParamList = new Parameter[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new Parameter(source.ParamList[i]);
            }
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);

    }
}

