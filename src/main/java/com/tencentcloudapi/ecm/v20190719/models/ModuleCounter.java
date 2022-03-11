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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModuleCounter extends AbstractModel{

    /**
    * ISP statistics list
    */
    @SerializedName("ISPCounterSet")
    @Expose
    private ISPCounter [] ISPCounterSet;

    /**
    * Number of provinces/states
    */
    @SerializedName("ProvinceNum")
    @Expose
    private Long ProvinceNum;

    /**
    * Number of cities
    */
    @SerializedName("CityNum")
    @Expose
    private Long CityNum;

    /**
    * Number of nodes
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Number of instances
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
     * Get ISP statistics list 
     * @return ISPCounterSet ISP statistics list
     */
    public ISPCounter [] getISPCounterSet() {
        return this.ISPCounterSet;
    }

    /**
     * Set ISP statistics list
     * @param ISPCounterSet ISP statistics list
     */
    public void setISPCounterSet(ISPCounter [] ISPCounterSet) {
        this.ISPCounterSet = ISPCounterSet;
    }

    /**
     * Get Number of provinces/states 
     * @return ProvinceNum Number of provinces/states
     */
    public Long getProvinceNum() {
        return this.ProvinceNum;
    }

    /**
     * Set Number of provinces/states
     * @param ProvinceNum Number of provinces/states
     */
    public void setProvinceNum(Long ProvinceNum) {
        this.ProvinceNum = ProvinceNum;
    }

    /**
     * Get Number of cities 
     * @return CityNum Number of cities
     */
    public Long getCityNum() {
        return this.CityNum;
    }

    /**
     * Set Number of cities
     * @param CityNum Number of cities
     */
    public void setCityNum(Long CityNum) {
        this.CityNum = CityNum;
    }

    /**
     * Get Number of nodes 
     * @return NodeNum Number of nodes
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of nodes
     * @param NodeNum Number of nodes
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Number of instances 
     * @return InstanceNum Number of instances
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Number of instances
     * @param InstanceNum Number of instances
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    public ModuleCounter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModuleCounter(ModuleCounter source) {
        if (source.ISPCounterSet != null) {
            this.ISPCounterSet = new ISPCounter[source.ISPCounterSet.length];
            for (int i = 0; i < source.ISPCounterSet.length; i++) {
                this.ISPCounterSet[i] = new ISPCounter(source.ISPCounterSet[i]);
            }
        }
        if (source.ProvinceNum != null) {
            this.ProvinceNum = new Long(source.ProvinceNum);
        }
        if (source.CityNum != null) {
            this.CityNum = new Long(source.CityNum);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ISPCounterSet.", this.ISPCounterSet);
        this.setParamSimple(map, prefix + "ProvinceNum", this.ProvinceNum);
        this.setParamSimple(map, prefix + "CityNum", this.CityNum);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);

    }
}

