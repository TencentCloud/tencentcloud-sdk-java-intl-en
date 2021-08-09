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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllNamespacesRequest extends AbstractModel{

    /**
    * Filter by use case. Currently, the only valid value is `ST_ALARM` (alarm type).
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * Value fixed at "monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * Filter by namespace ID. If this parameter is left empty, all will be queried
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
     * Get Filter by use case. Currently, the only valid value is `ST_ALARM` (alarm type). 
     * @return SceneType Filter by use case. Currently, the only valid value is `ST_ALARM` (alarm type).
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set Filter by use case. Currently, the only valid value is `ST_ALARM` (alarm type).
     * @param SceneType Filter by use case. Currently, the only valid value is `ST_ALARM` (alarm type).
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Value fixed at "monitor" 
     * @return Module Value fixed at "monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Value fixed at "monitor"
     * @param Module Value fixed at "monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default 
     * @return MonitorTypes Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
     * @param MonitorTypes Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get Filter by namespace ID. If this parameter is left empty, all will be queried 
     * @return Ids Filter by namespace ID. If this parameter is left empty, all will be queried
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set Filter by namespace ID. If this parameter is left empty, all will be queried
     * @param Ids Filter by namespace ID. If this parameter is left empty, all will be queried
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    public DescribeAllNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllNamespacesRequest(DescribeAllNamespacesRequest source) {
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

