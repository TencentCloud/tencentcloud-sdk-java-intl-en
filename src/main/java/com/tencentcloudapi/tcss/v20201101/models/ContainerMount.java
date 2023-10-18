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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerMount extends AbstractModel {

    /**
    * Mount type: `bind`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Host path
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Path in the container
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * Mode
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Read/Write permission
    */
    @SerializedName("RW")
    @Expose
    private Boolean RW;

    /**
    * Propagation type
    */
    @SerializedName("Propagation")
    @Expose
    private String Propagation;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Driver
    */
    @SerializedName("Driver")
    @Expose
    private String Driver;

    /**
     * Get Mount type: `bind`. 
     * @return Type Mount type: `bind`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Mount type: `bind`.
     * @param Type Mount type: `bind`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Host path 
     * @return Source Host path
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Host path
     * @param Source Host path
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Path in the container 
     * @return Destination Path in the container
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set Path in the container
     * @param Destination Path in the container
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get Mode 
     * @return Mode Mode
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Mode
     * @param Mode Mode
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Read/Write permission 
     * @return RW Read/Write permission
     */
    public Boolean getRW() {
        return this.RW;
    }

    /**
     * Set Read/Write permission
     * @param RW Read/Write permission
     */
    public void setRW(Boolean RW) {
        this.RW = RW;
    }

    /**
     * Get Propagation type 
     * @return Propagation Propagation type
     */
    public String getPropagation() {
        return this.Propagation;
    }

    /**
     * Set Propagation type
     * @param Propagation Propagation type
     */
    public void setPropagation(String Propagation) {
        this.Propagation = Propagation;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Driver 
     * @return Driver Driver
     */
    public String getDriver() {
        return this.Driver;
    }

    /**
     * Set Driver
     * @param Driver Driver
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public ContainerMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerMount(ContainerMount source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.RW != null) {
            this.RW = new Boolean(source.RW);
        }
        if (source.Propagation != null) {
            this.Propagation = new String(source.Propagation);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Driver != null) {
            this.Driver = new String(source.Driver);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "RW", this.RW);
        this.setParamSimple(map, prefix + "Propagation", this.Propagation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Driver", this.Driver);

    }
}

